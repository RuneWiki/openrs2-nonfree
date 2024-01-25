import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dk")
public final class Class58 implements Runnable {

	@OriginalMember(owner = "client!dk", name = "f", descriptor = "Lclient!vt;")
	private final Class262 aClass262_1 = new Class262();

	@OriginalMember(owner = "client!dk", name = "o", descriptor = "I")
	public int anInt1951 = 0;

	@OriginalMember(owner = "client!dk", name = "q", descriptor = "Z")
	private boolean aBoolean121 = false;

	@OriginalMember(owner = "client!dk", name = "p", descriptor = "Ljava/lang/Thread;")
	private Thread aThread1;

	@OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(Lclient!nv;)V")
	public Class58(@OriginalArg(0) Class183 arg0) {
		@Pc(20) Class157 local20 = arg0.method4141(this, 5);
		while (local20.anInt4667 == 0) {
			Static289.method4249(10L);
		}
		if (local20.anInt4667 == 2) {
			throw new RuntimeException();
		}
		this.aThread1 = (Thread) local20.anObject13;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V")
	public void method1418() {
		this.aBoolean121 = true;
		@Pc(14) Class262 local14 = this.aClass262_1;
		synchronized (this.aClass262_1) {
			this.aClass262_1.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(30) InterruptedException local30) {
		}
		this.aThread1 = null;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(BI[BLclient!pd;)Lclient!cv;")
	public Class1_Sub1_Sub6_Sub1 method1419(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) Class195 arg2) {
		@Pc(7) Class1_Sub1_Sub6_Sub1 local7 = new Class1_Sub1_Sub6_Sub1();
		local7.aClass195_1 = arg2;
		local7.aLong227 = arg0;
		local7.aByteArray15 = arg1;
		local7.anInt1776 = 2;
		local7.aBoolean511 = false;
		this.method1425(local7);
		return local7;
	}

	@OriginalMember(owner = "client!dk", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean121) {
			@Pc(10) Class262 local10 = this.aClass262_1;
			@Pc(18) Class1_Sub1_Sub6_Sub1 local18;
			synchronized (this.aClass262_1) {
				local18 = (Class1_Sub1_Sub6_Sub1) this.aClass262_1.method5880();
				if (local18 == null) {
					try {
						this.aClass262_1.wait();
					} catch (@Pc(25) InterruptedException local25) {
					}
					continue;
				}
				this.anInt1951--;
			}
			try {
				if (local18.anInt1776 == 2) {
					local18.aClass195_1.method4395(local18.aByteArray15.length, (int) local18.aLong227, local18.aByteArray15);
				} else if (local18.anInt1776 == 3) {
					local18.aByteArray15 = local18.aClass195_1.method4393((int) local18.aLong227);
				}
			} catch (@Pc(76) Exception local76) {
				Static247.method3669(null, local76);
			}
			local18.aBoolean512 = false;
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IBLclient!pd;)Lclient!cv;")
	public Class1_Sub1_Sub6_Sub1 method1423(@OriginalArg(0) int arg0, @OriginalArg(2) Class195 arg1) {
		@Pc(15) Class1_Sub1_Sub6_Sub1 local15 = new Class1_Sub1_Sub6_Sub1();
		local15.aClass195_1 = arg1;
		local15.anInt1776 = 3;
		local15.aLong227 = arg0;
		local15.aBoolean511 = false;
		this.method1425(local15);
		return local15;
	}

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "(IBLclient!pd;)Lclient!cv;")
	public Class1_Sub1_Sub6_Sub1 method1424(@OriginalArg(0) int arg0, @OriginalArg(2) Class195 arg1) {
		@Pc(9) Class1_Sub1_Sub6_Sub1 local9 = new Class1_Sub1_Sub6_Sub1();
		local9.anInt1776 = 1;
		@Pc(21) Class262 local21 = this.aClass262_1;
		synchronized (this.aClass262_1) {
			@Pc(29) Class1_Sub1_Sub6_Sub1 local29 = (Class1_Sub1_Sub6_Sub1) this.aClass262_1.method5882();
			while (true) {
				if (local29 == null) {
					break;
				}
				if (local29.aLong227 == (long) arg0 && arg1 == local29.aClass195_1 && local29.anInt1776 == 2) {
					local9.aByteArray15 = local29.aByteArray15;
					local9.aBoolean512 = false;
					return local9;
				}
				local29 = (Class1_Sub1_Sub6_Sub1) this.aClass262_1.method5879();
			}
		}
		local9.aByteArray15 = arg1.method4393(arg0);
		local9.aBoolean511 = true;
		local9.aBoolean512 = false;
		return local9;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(ILclient!cv;)V")
	private void method1425(@OriginalArg(1) Class1_Sub1_Sub6_Sub1 arg0) {
		@Pc(10) Class262 local10 = this.aClass262_1;
		synchronized (this.aClass262_1) {
			this.aClass262_1.method5876(arg0);
			this.anInt1951++;
			this.aClass262_1.notifyAll();
		}
	}
}
