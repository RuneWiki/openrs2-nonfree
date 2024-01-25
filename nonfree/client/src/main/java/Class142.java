import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kp")
public final class Class142 implements Runnable {

	@OriginalMember(owner = "client!kp", name = "c", descriptor = "Lclient!cs;")
	private final Class42 aClass42_9 = new Class42();

	@OriginalMember(owner = "client!kp", name = "n", descriptor = "Z")
	private boolean aBoolean273 = false;

	@OriginalMember(owner = "client!kp", name = "m", descriptor = "I")
	public int anInt3926 = 0;

	@OriginalMember(owner = "client!kp", name = "l", descriptor = "Ljava/lang/Thread;")
	private Thread aThread2;

	@OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(Lclient!kj;)V")
	public Class142(@OriginalArg(0) Class138 arg0) {
		@Pc(20) Class100 local20 = arg0.method3220(5, this);
		while (local20.anInt2365 == 0) {
			Static67.method1189(10L);
		}
		if (local20.anInt2365 == 2) {
			throw new RuntimeException();
		}
		this.aThread2 = (Thread) local20.anObject4;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lclient!pg;I)V")
	private void method3270(@OriginalArg(0) Class1_Sub2_Sub7_Sub1 arg0) {
		@Pc(2) Class42 local2 = this.aClass42_9;
		synchronized (this.aClass42_9) {
			this.aClass42_9.method1068(arg0);
			this.anInt3926++;
			this.aClass42_9.notifyAll();
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lclient!dh;II)Lclient!pg;")
	public Class1_Sub2_Sub7_Sub1 method3271(@OriginalArg(0) Class52 arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class1_Sub2_Sub7_Sub1 local9 = new Class1_Sub2_Sub7_Sub1();
		local9.anInt5385 = 1;
		@Pc(15) Class42 local15 = this.aClass42_9;
		synchronized (this.aClass42_9) {
			@Pc(23) Class1_Sub2_Sub7_Sub1 local23 = (Class1_Sub2_Sub7_Sub1) this.aClass42_9.method1061();
			while (true) {
				if (local23 == null) {
					break;
				}
				if ((long) arg1 == local23.aLong221 && arg0 == local23.aClass52_4 && local23.anInt5385 == 2) {
					local9.aByteArray70 = local23.aByteArray70;
					local9.aBoolean481 = false;
					return local9;
				}
				local23 = (Class1_Sub2_Sub7_Sub1) this.aClass42_9.method1063();
			}
		}
		local9.aByteArray70 = arg0.method1197(arg1);
		local9.aBoolean481 = false;
		local9.aBoolean482 = true;
		return local9;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(Z)V")
	public void method3272() {
		this.aBoolean273 = true;
		@Pc(9) Class42 local9 = this.aClass42_9;
		synchronized (this.aClass42_9) {
			this.aClass42_9.notifyAll();
		}
		try {
			this.aThread2.join();
		} catch (@Pc(25) InterruptedException local25) {
		}
		this.aThread2 = null;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(I[BZLclient!dh;)Lclient!pg;")
	public Class1_Sub2_Sub7_Sub1 method3273(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) Class52 arg2) {
		@Pc(7) Class1_Sub2_Sub7_Sub1 local7 = new Class1_Sub2_Sub7_Sub1();
		local7.aBoolean482 = false;
		local7.aLong221 = arg0;
		local7.anInt5385 = 2;
		local7.aByteArray70 = arg1;
		local7.aClass52_4 = arg2;
		this.method3270(local7);
		return local7;
	}

	@OriginalMember(owner = "client!kp", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean273) {
			@Pc(10) Class42 local10 = this.aClass42_9;
			@Pc(18) Class1_Sub2_Sub7_Sub1 local18;
			synchronized (this.aClass42_9) {
				local18 = (Class1_Sub2_Sub7_Sub1) this.aClass42_9.method1067();
				if (local18 == null) {
					try {
						this.aClass42_9.wait();
					} catch (@Pc(33) InterruptedException local33) {
					}
					continue;
				}
				this.anInt3926--;
			}
			try {
				if (local18.anInt5385 == 2) {
					local18.aClass52_4.method1200(local18.aByteArray70.length, (int) local18.aLong221, local18.aByteArray70);
				} else if (local18.anInt5385 == 3) {
					local18.aByteArray70 = local18.aClass52_4.method1197((int) local18.aLong221);
				}
			} catch (@Pc(78) Exception local78) {
				Static315.method4700(local78, null);
			}
			local18.aBoolean481 = false;
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(IILclient!dh;)Lclient!pg;")
	public Class1_Sub2_Sub7_Sub1 method3274(@OriginalArg(0) int arg0, @OriginalArg(2) Class52 arg1) {
		@Pc(13) Class1_Sub2_Sub7_Sub1 local13 = new Class1_Sub2_Sub7_Sub1();
		local13.aBoolean482 = false;
		local13.anInt5385 = 3;
		local13.aClass52_4 = arg1;
		local13.aLong221 = arg0;
		this.method3270(local13);
		return local13;
	}
}
