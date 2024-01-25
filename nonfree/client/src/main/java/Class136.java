import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nh")
public final class Class136 implements Runnable {

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "Lclient!ek;")
	private final Class54 aClass54_2 = new Class54();

	@OriginalMember(owner = "client!nh", name = "j", descriptor = "I")
	public int anInt4100 = 0;

	@OriginalMember(owner = "client!nh", name = "k", descriptor = "Z")
	private boolean aBoolean366 = false;

	@OriginalMember(owner = "client!nh", name = "h", descriptor = "Ljava/lang/Thread;")
	private Thread aThread2;

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Lclient!rd;)V")
	public Class136(@OriginalArg(0) Class168 arg0) {
		@Pc(20) Class193 local20 = arg0.method4856(this, 5);
		while (local20.anInt6293 == 0) {
			Static102.method2276(10L);
		}
		if (local20.anInt6293 == 2) {
			throw new RuntimeException();
		}
		this.aThread2 = (Thread) local20.anObject7;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V")
	public void method3776() {
		this.aBoolean366 = true;
		@Pc(9) Class54 local9 = this.aClass54_2;
		synchronized (this.aClass54_2) {
			this.aClass54_2.notifyAll();
		}
		try {
			this.aThread2.join();
		} catch (@Pc(33) InterruptedException local33) {
		}
		this.aThread2 = null;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZLclient!ga;)V")
	private void method3777(@OriginalArg(1) Class2_Sub11_Sub4_Sub1 arg0) {
		@Pc(2) Class54 local2 = this.aClass54_2;
		synchronized (this.aClass54_2) {
			this.aClass54_2.method1662(arg0);
			this.anInt4100++;
			this.aClass54_2.notifyAll();
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "([BIILclient!gb;)Lclient!ga;")
	public Class2_Sub11_Sub4_Sub1 method3780(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class71 arg2) {
		@Pc(12) Class2_Sub11_Sub4_Sub1 local12 = new Class2_Sub11_Sub4_Sub1();
		local12.aClass71_1 = arg2;
		local12.aByteArray39 = arg0;
		local12.aLong212 = arg1;
		local12.anInt2251 = 2;
		local12.aBoolean448 = false;
		this.method3777(local12);
		return local12;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!gb;II)Lclient!ga;")
	public Class2_Sub11_Sub4_Sub1 method3782(@OriginalArg(0) Class71 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class2_Sub11_Sub4_Sub1 local13 = new Class2_Sub11_Sub4_Sub1();
		local13.anInt2251 = 3;
		local13.aLong212 = arg1;
		local13.aBoolean448 = false;
		local13.aClass71_1 = arg0;
		this.method3777(local13);
		return local13;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILclient!gb;Z)Lclient!ga;")
	public Class2_Sub11_Sub4_Sub1 method3783(@OriginalArg(0) int arg0, @OriginalArg(1) Class71 arg1) {
		@Pc(9) Class2_Sub11_Sub4_Sub1 local9 = new Class2_Sub11_Sub4_Sub1();
		local9.anInt2251 = 1;
		@Pc(15) Class54 local15 = this.aClass54_2;
		synchronized (this.aClass54_2) {
			@Pc(27) Class2_Sub11_Sub4_Sub1 local27 = (Class2_Sub11_Sub4_Sub1) this.aClass54_2.method1661();
			while (true) {
				if (local27 == null) {
					break;
				}
				if (local27.aLong212 == (long) arg0 && local27.aClass71_1 == arg1 && local27.anInt2251 == 2) {
					local9.aByteArray39 = local27.aByteArray39;
					local9.aBoolean446 = false;
					return local9;
				}
				local27 = (Class2_Sub11_Sub4_Sub1) this.aClass54_2.method1657();
			}
		}
		local9.aByteArray39 = arg1.method2245(arg0);
		local9.aBoolean446 = false;
		local9.aBoolean448 = true;
		return local9;
	}

	@OriginalMember(owner = "client!nh", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean366) {
			@Pc(6) Class54 local6 = this.aClass54_2;
			@Pc(14) Class2_Sub11_Sub4_Sub1 local14;
			synchronized (this.aClass54_2) {
				local14 = (Class2_Sub11_Sub4_Sub1) this.aClass54_2.method1658();
				if (local14 == null) {
					try {
						this.aClass54_2.wait();
					} catch (@Pc(29) InterruptedException local29) {
					}
					continue;
				}
				this.anInt4100--;
			}
			try {
				if (local14.anInt2251 == 2) {
					local14.aClass71_1.method2241(local14.aByteArray39.length, (int) local14.aLong212, local14.aByteArray39);
				} else if (local14.anInt2251 == 3) {
					local14.aByteArray39 = local14.aClass71_1.method2245((int) local14.aLong212);
				}
			} catch (@Pc(74) Exception local74) {
				Static69.method1566(null, local74);
			}
			local14.aBoolean446 = false;
		}
	}
}
