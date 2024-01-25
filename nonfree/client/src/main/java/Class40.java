import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ci")
public final class Class40 implements Runnable {

	@OriginalMember(owner = "client!ci", name = "j", descriptor = "Lclient!mt;")
	private final Class162 aClass162_6 = new Class162();

	@OriginalMember(owner = "client!ci", name = "n", descriptor = "Z")
	private boolean aBoolean42 = false;

	@OriginalMember(owner = "client!ci", name = "o", descriptor = "I")
	public int anInt795 = 0;

	@OriginalMember(owner = "client!ci", name = "m", descriptor = "Ljava/lang/Thread;")
	private Thread aThread1;

	@OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(Lclient!mj;)V")
	public Class40(@OriginalArg(0) Class156 arg0) {
		@Pc(20) Class133 local20 = arg0.method3658(this, 5);
		while (local20.anInt3257 == 0) {
			Static37.method613(10L);
		}
		if (local20.anInt3257 == 2) {
			throw new RuntimeException();
		}
		this.aThread1 = (Thread) local20.anObject3;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V")
	public void method692() {
		this.aBoolean42 = true;
		@Pc(9) Class162 local9 = this.aClass162_6;
		synchronized (this.aClass162_6) {
			this.aClass162_6.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(32) InterruptedException local32) {
		}
		this.aThread1 = null;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lclient!rg;IB)Lclient!dl;")
	public Class3_Sub7_Sub2_Sub1 method693(@OriginalArg(0) Class204 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class3_Sub7_Sub2_Sub1 local9 = new Class3_Sub7_Sub2_Sub1();
		local9.anInt1337 = 1;
		@Pc(24) Class162 local24 = this.aClass162_6;
		synchronized (this.aClass162_6) {
			@Pc(32) Class3_Sub7_Sub2_Sub1 local32 = (Class3_Sub7_Sub2_Sub1) this.aClass162_6.method3734();
			while (true) {
				if (local32 == null) {
					break;
				}
				if (local32.aLong231 == (long) arg1 && arg0 == local32.aClass204_1 && local32.anInt1337 == 2) {
					local9.aBoolean387 = false;
					local9.aByteArray25 = local32.aByteArray25;
					return local9;
				}
				local32 = (Class3_Sub7_Sub2_Sub1) this.aClass162_6.method3730();
			}
		}
		local9.aByteArray25 = arg0.method4595(arg1);
		local9.aBoolean388 = true;
		local9.aBoolean387 = false;
		return local9;
	}

	@OriginalMember(owner = "client!ci", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean42) {
			@Pc(10) Class162 local10 = this.aClass162_6;
			@Pc(18) Class3_Sub7_Sub2_Sub1 local18;
			synchronized (this.aClass162_6) {
				local18 = (Class3_Sub7_Sub2_Sub1) this.aClass162_6.method3735();
				if (local18 == null) {
					try {
						this.aClass162_6.wait();
					} catch (@Pc(33) InterruptedException local33) {
					}
					continue;
				}
				this.anInt795--;
			}
			try {
				if (local18.anInt1337 == 2) {
					local18.aClass204_1.method4594(local18.aByteArray25.length, local18.aByteArray25, (int) local18.aLong231);
				} else if (local18.anInt1337 == 3) {
					local18.aByteArray25 = local18.aClass204_1.method4595((int) local18.aLong231);
				}
			} catch (@Pc(76) Exception local76) {
				Static355.method5328(null, local76);
			}
			local18.aBoolean387 = false;
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(BLclient!dl;)V")
	private void method695(@OriginalArg(1) Class3_Sub7_Sub2_Sub1 arg0) {
		@Pc(14) Class162 local14 = this.aClass162_6;
		synchronized (this.aClass162_6) {
			this.aClass162_6.method3729(arg0);
			this.anInt795++;
			this.aClass162_6.notifyAll();
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(I[BLclient!rg;Z)Lclient!dl;")
	public Class3_Sub7_Sub2_Sub1 method696(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) Class204 arg2) {
		@Pc(7) Class3_Sub7_Sub2_Sub1 local7 = new Class3_Sub7_Sub2_Sub1();
		local7.aLong231 = arg0;
		local7.aBoolean388 = false;
		local7.aClass204_1 = arg2;
		local7.anInt1337 = 2;
		local7.aByteArray25 = arg1;
		this.method695(local7);
		return local7;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(BILclient!rg;)Lclient!dl;")
	public Class3_Sub7_Sub2_Sub1 method698(@OriginalArg(1) int arg0, @OriginalArg(2) Class204 arg1) {
		@Pc(15) Class3_Sub7_Sub2_Sub1 local15 = new Class3_Sub7_Sub2_Sub1();
		local15.aBoolean388 = false;
		local15.anInt1337 = 3;
		local15.aClass204_1 = arg1;
		local15.aLong231 = arg0;
		this.method695(local15);
		return local15;
	}
}
