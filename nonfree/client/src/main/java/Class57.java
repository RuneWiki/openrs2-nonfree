import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dk")
public final class Class57 implements Runnable {

	@OriginalMember(owner = "client!dk", name = "h", descriptor = "Lclient!mc;")
	private final Class185 aClass185_1 = new Class185();

	@OriginalMember(owner = "client!dk", name = "i", descriptor = "I")
	public int anInt1784 = 0;

	@OriginalMember(owner = "client!dk", name = "l", descriptor = "Z")
	private boolean aBoolean132 = false;

	@OriginalMember(owner = "client!dk", name = "k", descriptor = "Ljava/lang/Thread;")
	private Thread aThread1;

	@OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(Lclient!uf;)V")
	public Class57(@OriginalArg(0) Class283 arg0) {
		@Pc(20) Class20 local20 = arg0.method7164(5, this);
		while (local20.anInt593 == 0) {
			Static379.method5233(10L);
		}
		if (local20.anInt593 == 2) {
			throw new RuntimeException();
		}
		this.aThread1 = (Thread) local20.anObject2;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(BLclient!dea;)V")
	private void method1687(@OriginalArg(1) Class2_Sub13_Sub2_Sub1 arg0) {
		@Pc(6) Class185 local6 = this.aClass185_1;
		synchronized (this.aClass185_1) {
			this.aClass185_1.method4621(arg0);
			this.anInt1784++;
			this.aClass185_1.notifyAll();
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(I[BLclient!saa;I)Lclient!dea;")
	public Class2_Sub13_Sub2_Sub1 method1688(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) Class257 arg2) {
		@Pc(7) Class2_Sub13_Sub2_Sub1 local7 = new Class2_Sub13_Sub2_Sub1();
		local7.anInt1737 = 2;
		local7.aByteArray43 = arg1;
		local7.aClass257_1 = arg2;
		local7.aLong230 = arg0;
		local7.aBoolean515 = false;
		this.method1687(local7);
		return local7;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lclient!saa;II)Lclient!dea;")
	public Class2_Sub13_Sub2_Sub1 method1689(@OriginalArg(0) Class257 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class2_Sub13_Sub2_Sub1 local7 = new Class2_Sub13_Sub2_Sub1();
		local7.aLong230 = arg1;
		local7.anInt1737 = 3;
		local7.aBoolean515 = false;
		local7.aClass257_1 = arg0;
		this.method1687(local7);
		return local7;
	}

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "(Lclient!saa;II)Lclient!dea;")
	public Class2_Sub13_Sub2_Sub1 method1690(@OriginalArg(0) Class257 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class2_Sub13_Sub2_Sub1 local9 = new Class2_Sub13_Sub2_Sub1();
		local9.anInt1737 = 1;
		@Pc(15) Class185 local15 = this.aClass185_1;
		synchronized (this.aClass185_1) {
			@Pc(23) Class2_Sub13_Sub2_Sub1 local23 = (Class2_Sub13_Sub2_Sub1) this.aClass185_1.method4623();
			while (true) {
				if (local23 == null) {
					break;
				}
				if ((long) arg1 == local23.aLong230 && arg0 == local23.aClass257_1 && local23.anInt1737 == 2) {
					local9.aBoolean514 = false;
					local9.aByteArray43 = local23.aByteArray43;
					return local9;
				}
				local23 = (Class2_Sub13_Sub2_Sub1) this.aClass185_1.method4617();
			}
		}
		local9.aByteArray43 = arg0.method6610(arg1);
		local9.aBoolean514 = false;
		local9.aBoolean515 = true;
		return local9;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V")
	public void method1691() {
		this.aBoolean132 = true;
		@Pc(9) Class185 local9 = this.aClass185_1;
		synchronized (this.aClass185_1) {
			this.aClass185_1.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(25) InterruptedException local25) {
		}
		this.aThread1 = null;
	}

	@OriginalMember(owner = "client!dk", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean132) {
			@Pc(6) Class185 local6 = this.aClass185_1;
			@Pc(14) Class2_Sub13_Sub2_Sub1 local14;
			synchronized (this.aClass185_1) {
				local14 = (Class2_Sub13_Sub2_Sub1) this.aClass185_1.method4622();
				if (local14 == null) {
					try {
						this.aClass185_1.wait();
					} catch (@Pc(21) InterruptedException local21) {
					}
					continue;
				}
				this.anInt1784--;
			}
			try {
				if (local14.anInt1737 == 2) {
					local14.aClass257_1.method6613(local14.aByteArray43.length, (int) local14.aLong230, local14.aByteArray43);
				} else if (local14.anInt1737 == 3) {
					local14.aByteArray43 = local14.aClass257_1.method6610((int) local14.aLong230);
				}
			} catch (@Pc(72) Exception local72) {
				Static459.method6984(null, local72);
			}
			local14.aBoolean514 = false;
		}
	}
}
