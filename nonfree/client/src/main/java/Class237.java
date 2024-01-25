import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pt")
public final class Class237 implements Runnable {

	@OriginalMember(owner = "client!pt", name = "b", descriptor = "Lclient!lj;")
	private final Class187 aClass187_9 = new Class187();

	@OriginalMember(owner = "client!pt", name = "k", descriptor = "Z")
	private boolean aBoolean494 = false;

	@OriginalMember(owner = "client!pt", name = "l", descriptor = "I")
	public int anInt7019 = 0;

	@OriginalMember(owner = "client!pt", name = "j", descriptor = "Ljava/lang/Thread;")
	private Thread aThread5;

	@OriginalMember(owner = "client!pt", name = "<init>", descriptor = "(Lclient!ae;)V")
	public Class237(@OriginalArg(0) Class9 arg0) {
		@Pc(20) Class83 local20 = arg0.method282(this, 5);
		while (local20.anInt2495 == 0) {
			Static213.method3465(10L);
		}
		if (local20.anInt2495 == 2) {
			throw new RuntimeException();
		}
		this.aThread5 = (Thread) local20.anObject8;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(IBLclient!gg;)Lclient!bq;")
	public Class5_Sub2_Sub2_Sub1 method5696(@OriginalArg(0) int arg0, @OriginalArg(2) Class112 arg1) {
		@Pc(9) Class5_Sub2_Sub2_Sub1 local9 = new Class5_Sub2_Sub2_Sub1();
		local9.anInt1078 = 1;
		@Pc(15) Class187 local15 = this.aClass187_9;
		synchronized (this.aClass187_9) {
			@Pc(29) Class5_Sub2_Sub2_Sub1 local29 = (Class5_Sub2_Sub2_Sub1) this.aClass187_9.method4805();
			while (true) {
				if (local29 == null) {
					break;
				}
				if ((long) arg0 == local29.aLong252 && local29.aClass112_1 == arg1 && local29.anInt1078 == 2) {
					local9.aBoolean234 = false;
					local9.aByteArray23 = local29.aByteArray23;
					return local9;
				}
				local29 = (Class5_Sub2_Sub2_Sub1) this.aClass187_9.method4810();
			}
		}
		local9.aByteArray23 = arg1.method2889(arg0);
		local9.aBoolean233 = true;
		local9.aBoolean234 = false;
		return local9;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(I[BLclient!gg;I)Lclient!bq;")
	public Class5_Sub2_Sub2_Sub1 method5697(@OriginalArg(1) byte[] arg0, @OriginalArg(2) Class112 arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class5_Sub2_Sub2_Sub1 local7 = new Class5_Sub2_Sub2_Sub1();
		local7.aByteArray23 = arg0;
		local7.anInt1078 = 2;
		local7.aLong252 = arg2;
		local7.aBoolean233 = false;
		local7.aClass112_1 = arg1;
		this.method5700(local7);
		return local7;
	}

	@OriginalMember(owner = "client!pt", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean494) {
			@Pc(6) Class187 local6 = this.aClass187_9;
			@Pc(14) Class5_Sub2_Sub2_Sub1 local14;
			synchronized (this.aClass187_9) {
				local14 = (Class5_Sub2_Sub2_Sub1) this.aClass187_9.method4802();
				if (local14 == null) {
					try {
						this.aClass187_9.wait();
					} catch (@Pc(29) InterruptedException local29) {
					}
					continue;
				}
				this.anInt7019--;
			}
			try {
				if (local14.anInt1078 == 2) {
					local14.aClass112_1.method2892(local14.aByteArray23, (int) local14.aLong252, local14.aByteArray23.length);
				} else if (local14.anInt1078 == 3) {
					local14.aByteArray23 = local14.aClass112_1.method2889((int) local14.aLong252);
				}
			} catch (@Pc(72) Exception local72) {
				Static370.method6434(null, local72);
			}
			local14.aBoolean234 = false;
		}
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(ILclient!gg;B)Lclient!bq;")
	public Class5_Sub2_Sub2_Sub1 method5698(@OriginalArg(0) int arg0, @OriginalArg(1) Class112 arg1) {
		@Pc(15) Class5_Sub2_Sub2_Sub1 local15 = new Class5_Sub2_Sub2_Sub1();
		local15.aClass112_1 = arg1;
		local15.aBoolean233 = false;
		local15.aLong252 = arg0;
		local15.anInt1078 = 3;
		this.method5700(local15);
		return local15;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(Z)V")
	public void method5699() {
		this.aBoolean494 = true;
		@Pc(15) Class187 local15 = this.aClass187_9;
		synchronized (this.aClass187_9) {
			this.aClass187_9.notifyAll();
		}
		try {
			this.aThread5.join();
		} catch (@Pc(31) InterruptedException local31) {
		}
		this.aThread5 = null;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(Lclient!bq;I)V")
	private void method5700(@OriginalArg(0) Class5_Sub2_Sub2_Sub1 arg0) {
		@Pc(2) Class187 local2 = this.aClass187_9;
		synchronized (this.aClass187_9) {
			this.aClass187_9.method4807(arg0);
			this.anInt7019++;
			this.aClass187_9.notifyAll();
		}
	}
}
