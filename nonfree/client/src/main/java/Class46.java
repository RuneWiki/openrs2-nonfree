import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!d")
public final class Class46 implements Runnable {

	@OriginalMember(owner = "client!d", name = "g", descriptor = "Lclient!uj;")
	private final Class244 aClass244_1 = new Class244();

	@OriginalMember(owner = "client!d", name = "l", descriptor = "Z")
	private boolean aBoolean129 = false;

	@OriginalMember(owner = "client!d", name = "j", descriptor = "I")
	public int anInt1579 = 0;

	@OriginalMember(owner = "client!d", name = "k", descriptor = "Ljava/lang/Thread;")
	private Thread aThread1;

	static {
		new Class189("Join your channel by clicking 'Join Chat' and typing: ", "Klick auf 'Betreten' und gib ein: ", "Pour rejoindre votre canal, cliquez sur « Participer » et entrez : ", "Para entrar no seu canal, clique em \"Acessar bate-papo\" e digite: ");
	}

	@OriginalMember(owner = "client!d", name = "<init>", descriptor = "(Lclient!li;)V")
	public Class46(@OriginalArg(0) Class143 arg0) {
		@Pc(20) Class43 local20 = arg0.method3397(5, this);
		while (local20.anInt1521 == 0) {
			Static360.method4758(10L);
		}
		if (local20.anInt1521 == 2) {
			throw new RuntimeException();
		}
		this.aThread1 = (Thread) local20.anObject3;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(ILclient!bb;)V")
	private void method1229(@OriginalArg(1) Class3_Sub4_Sub1_Sub1 arg0) {
		@Pc(12) Class244 local12 = this.aClass244_1;
		synchronized (this.aClass244_1) {
			this.aClass244_1.method5234(arg0);
			this.anInt1579++;
			this.aClass244_1.notifyAll();
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(ILclient!sk;B)Lclient!bb;")
	public Class3_Sub4_Sub1_Sub1 method1230(@OriginalArg(0) int arg0, @OriginalArg(1) Class228 arg1) {
		@Pc(7) Class3_Sub4_Sub1_Sub1 local7 = new Class3_Sub4_Sub1_Sub1();
		local7.aClass228_1 = arg1;
		local7.aBoolean528 = false;
		local7.anInt841 = 3;
		local7.aLong233 = arg0;
		this.method1229(local7);
		return local7;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(ZLclient!sk;[BI)Lclient!bb;")
	public Class3_Sub4_Sub1_Sub1 method1231(@OriginalArg(1) Class228 arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class3_Sub4_Sub1_Sub1 local7 = new Class3_Sub4_Sub1_Sub1();
		local7.anInt841 = 2;
		local7.aClass228_1 = arg0;
		local7.aByteArray10 = arg1;
		local7.aBoolean528 = false;
		local7.aLong233 = arg2;
		this.method1229(local7);
		return local7;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V")
	public void method1232() {
		this.aBoolean129 = true;
		@Pc(15) Class244 local15 = this.aClass244_1;
		synchronized (this.aClass244_1) {
			this.aClass244_1.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(31) InterruptedException local31) {
		}
		this.aThread1 = null;
	}

	@OriginalMember(owner = "client!d", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean129) {
			@Pc(10) Class244 local10 = this.aClass244_1;
			@Pc(18) Class3_Sub4_Sub1_Sub1 local18;
			synchronized (this.aClass244_1) {
				local18 = (Class3_Sub4_Sub1_Sub1) this.aClass244_1.method5235();
				if (local18 == null) {
					try {
						this.aClass244_1.wait();
					} catch (@Pc(25) InterruptedException local25) {
					}
					continue;
				}
				this.anInt1579--;
			}
			try {
				if (local18.anInt841 == 2) {
					local18.aClass228_1.method4865(local18.aByteArray10.length, local18.aByteArray10, (int) local18.aLong233);
				} else if (local18.anInt841 == 3) {
					local18.aByteArray10 = local18.aClass228_1.method4866((int) local18.aLong233);
				}
			} catch (@Pc(78) Exception local78) {
				Static324.method5974(local78, null);
			}
			local18.aBoolean527 = false;
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!sk;II)Lclient!bb;")
	public Class3_Sub4_Sub1_Sub1 method1235(@OriginalArg(0) Class228 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class3_Sub4_Sub1_Sub1 local9 = new Class3_Sub4_Sub1_Sub1();
		local9.anInt841 = 1;
		@Pc(15) Class244 local15 = this.aClass244_1;
		synchronized (this.aClass244_1) {
			@Pc(23) Class3_Sub4_Sub1_Sub1 local23 = (Class3_Sub4_Sub1_Sub1) this.aClass244_1.method5240();
			while (true) {
				if (local23 == null) {
					break;
				}
				if ((long) arg1 == local23.aLong233 && local23.aClass228_1 == arg0 && local23.anInt841 == 2) {
					local9.aBoolean527 = false;
					local9.aByteArray10 = local23.aByteArray10;
					return local9;
				}
				local23 = (Class3_Sub4_Sub1_Sub1) this.aClass244_1.method5232();
			}
		}
		local9.aByteArray10 = arg0.method4866(arg1);
		local9.aBoolean527 = false;
		local9.aBoolean528 = true;
		return local9;
	}
}
