import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ja")
public final class Class93 implements Runnable {

	@OriginalMember(owner = "client!ja", name = "h", descriptor = "Lclient!uk;")
	private Class178 aClass178_10 = new Class178();

	@OriginalMember(owner = "client!ja", name = "m", descriptor = "Z")
	private boolean aBoolean174 = false;

	@OriginalMember(owner = "client!ja", name = "o", descriptor = "I")
	public int anInt2520 = 0;

	@OriginalMember(owner = "client!ja", name = "q", descriptor = "Ljava/lang/Thread;")
	private Thread aThread1;

	@OriginalMember(owner = "client!ja", name = "<init>", descriptor = "()V")
	public Class93() {
		@Pc(20) Class185 local20 = Static276.aClass139_4.method3494(5, this);
		while (local20.anInt5623 == 0) {
			Static303.method4677(10L);
		}
		if (local20.anInt5623 == 2) {
			throw new RuntimeException();
		}
		this.aThread1 = (Thread) local20.anObject7;
	}

	@OriginalMember(owner = "client!ja", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean174) {
			@Pc(8) Class178 local8 = this.aClass178_10;
			@Pc(15) Class4_Sub3_Sub1_Sub1 local15;
			synchronized (this.aClass178_10) {
				local15 = (Class4_Sub3_Sub1_Sub1) this.aClass178_10.method4373();
				if (local15 == null) {
					try {
						this.aClass178_10.wait();
					} catch (@Pc(30) InterruptedException local30) {
					}
					continue;
				}
				this.anInt2520--;
			}
			try {
				if (local15.anInt181 == 2) {
					local15.aClass60_1.method1482(local15.aByteArray3.length, local15.aByteArray3, (int) local15.aLong218);
				} else if (local15.anInt181 == 3) {
					local15.aByteArray3 = local15.aClass60_1.method1481((int) local15.aLong218);
				}
			} catch (@Pc(76) Exception local76) {
				Static193.method3072(local76, null);
			}
			local15.aBoolean365 = false;
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(ILclient!fm;I)Lclient!al;")
	public Class4_Sub3_Sub1_Sub1 method1966(@OriginalArg(1) Class60 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class4_Sub3_Sub1_Sub1 local7 = new Class4_Sub3_Sub1_Sub1();
		local7.anInt181 = 3;
		local7.aClass60_1 = arg0;
		local7.aBoolean364 = false;
		local7.aLong218 = arg1;
		this.method1973(local7);
		return local7;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(BLclient!fm;[BI)Lclient!al;")
	public Class4_Sub3_Sub1_Sub1 method1969(@OriginalArg(1) Class60 arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(15) Class4_Sub3_Sub1_Sub1 local15 = new Class4_Sub3_Sub1_Sub1();
		local15.aLong218 = arg2;
		local15.aClass60_1 = arg0;
		local15.aBoolean364 = false;
		local15.anInt181 = 2;
		local15.aByteArray3 = arg1;
		this.method1973(local15);
		return local15;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Z)V")
	public void method1972() {
		this.aBoolean174 = true;
		@Pc(10) Class178 local10 = this.aClass178_10;
		synchronized (this.aClass178_10) {
			this.aClass178_10.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(27) InterruptedException local27) {
		}
		this.aThread1 = null;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(ILclient!al;)V")
	private void method1973(@OriginalArg(1) Class4_Sub3_Sub1_Sub1 arg0) {
		@Pc(7) Class178 local7 = this.aClass178_10;
		synchronized (this.aClass178_10) {
			this.aClass178_10.method4370(arg0);
			this.anInt2520++;
			this.aClass178_10.notifyAll();
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(BLclient!fm;I)Lclient!al;")
	public Class4_Sub3_Sub1_Sub1 method1974(@OriginalArg(1) Class60 arg0, @OriginalArg(2) int arg1) {
		@Pc(5) Class4_Sub3_Sub1_Sub1 local5 = new Class4_Sub3_Sub1_Sub1();
		local5.anInt181 = 1;
		@Pc(16) Class178 local16 = this.aClass178_10;
		synchronized (this.aClass178_10) {
			@Pc(23) Class4_Sub3_Sub1_Sub1 local23 = (Class4_Sub3_Sub1_Sub1) this.aClass178_10.method4369();
			while (true) {
				if (local23 == null) {
					break;
				}
				if (local23.aLong218 == (long) arg1 && arg0 == local23.aClass60_1 && local23.anInt181 == 2) {
					local5.aByteArray3 = local23.aByteArray3;
					local5.aBoolean365 = false;
					return local5;
				}
				local23 = (Class4_Sub3_Sub1_Sub1) this.aClass178_10.method4377();
			}
		}
		local5.aByteArray3 = arg0.method1481(arg1);
		local5.aBoolean365 = false;
		local5.aBoolean364 = true;
		return local5;
	}
}
