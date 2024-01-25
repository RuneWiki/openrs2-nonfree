import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cs")
public final class Class55 implements Runnable {

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "Lclient!kp;")
	private final Class180 aClass180_1 = new Class180();

	@OriginalMember(owner = "client!cs", name = "d", descriptor = "I")
	public int anInt1514 = 0;

	@OriginalMember(owner = "client!cs", name = "e", descriptor = "Z")
	private boolean aBoolean108 = false;

	@OriginalMember(owner = "client!cs", name = "j", descriptor = "Ljava/lang/Thread;")
	private Thread aThread2;

	@OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Lclient!qj;)V")
	public Class55(@OriginalArg(0) Class272 arg0) {
		@Pc(20) Class331 local20 = arg0.method6121(5, this);
		while (local20.anInt8818 == 0) {
			Static318.method4952(10L);
		}
		if (local20.anInt8818 == 2) {
			throw new RuntimeException();
		}
		this.aThread2 = (Thread) local20.anObject18;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(I)V")
	public void method1436() {
		this.aBoolean108 = true;
		@Pc(9) Class180 local9 = this.aClass180_1;
		synchronized (this.aClass180_1) {
			this.aClass180_1.notifyAll();
		}
		try {
			this.aThread2.join();
		} catch (@Pc(25) InterruptedException local25) {
		}
		this.aThread2 = null;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(Lclient!hfa;I)V")
	private void method1437(@OriginalArg(0) Class6_Sub2_Sub4_Sub1 arg0) {
		@Pc(10) Class180 local10 = this.aClass180_1;
		synchronized (this.aClass180_1) {
			this.aClass180_1.method4468(arg0);
			this.anInt1514++;
			this.aClass180_1.notifyAll();
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(Lclient!kf;II[B)Lclient!hfa;")
	public Class6_Sub2_Sub4_Sub1 method1439(@OriginalArg(0) Class172 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(12) Class6_Sub2_Sub4_Sub1 local12 = new Class6_Sub2_Sub4_Sub1();
		local12.anInt3864 = 2;
		local12.aBoolean398 = false;
		local12.aByteArray31 = arg2;
		local12.aLong247 = arg1;
		local12.aClass172_1 = arg0;
		this.method1437(local12);
		return local12;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(BLclient!kf;I)Lclient!hfa;")
	public Class6_Sub2_Sub4_Sub1 method1441(@OriginalArg(1) Class172 arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class6_Sub2_Sub4_Sub1 local9 = new Class6_Sub2_Sub4_Sub1();
		local9.anInt3864 = 1;
		@Pc(15) Class180 local15 = this.aClass180_1;
		synchronized (this.aClass180_1) {
			@Pc(23) Class6_Sub2_Sub4_Sub1 local23 = (Class6_Sub2_Sub4_Sub1) this.aClass180_1.method4466();
			while (true) {
				if (local23 == null) {
					break;
				}
				if (local23.aLong247 == (long) arg1 && local23.aClass172_1 == arg0 && local23.anInt3864 == 2) {
					local9.aByteArray31 = local23.aByteArray31;
					local9.aBoolean400 = false;
					return local9;
				}
				local23 = (Class6_Sub2_Sub4_Sub1) this.aClass180_1.method4473();
			}
		}
		local9.aByteArray31 = arg0.method4302(arg1);
		local9.aBoolean400 = false;
		local9.aBoolean398 = true;
		return local9;
	}

	@OriginalMember(owner = "client!cs", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean108) {
			@Pc(6) Class180 local6 = this.aClass180_1;
			@Pc(14) Class6_Sub2_Sub4_Sub1 local14;
			synchronized (this.aClass180_1) {
				local14 = (Class6_Sub2_Sub4_Sub1) this.aClass180_1.method4471();
				if (local14 == null) {
					try {
						this.aClass180_1.wait();
					} catch (@Pc(29) InterruptedException local29) {
					}
					continue;
				}
				this.anInt1514--;
			}
			try {
				if (local14.anInt3864 == 2) {
					local14.aClass172_1.method4300(local14.aByteArray31.length, local14.aByteArray31, (int) local14.aLong247);
				} else if (local14.anInt3864 == 3) {
					local14.aByteArray31 = local14.aClass172_1.method4302((int) local14.aLong247);
				}
			} catch (@Pc(72) Exception local72) {
				Static256.method4328(null, local72);
			}
			local14.aBoolean400 = false;
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(ILclient!kf;Z)Lclient!hfa;")
	public Class6_Sub2_Sub4_Sub1 method1442(@OriginalArg(0) int arg0, @OriginalArg(1) Class172 arg1) {
		@Pc(7) Class6_Sub2_Sub4_Sub1 local7 = new Class6_Sub2_Sub4_Sub1();
		local7.aLong247 = arg0;
		local7.aClass172_1 = arg1;
		local7.anInt3864 = 3;
		local7.aBoolean398 = false;
		this.method1437(local7);
		return local7;
	}
}
