import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ep")
public final class Class70 implements Runnable {

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "Lclient!vv;")
	private final Class261 aClass261_1 = new Class261();

	@OriginalMember(owner = "client!ep", name = "j", descriptor = "Z")
	private boolean aBoolean134 = false;

	@OriginalMember(owner = "client!ep", name = "l", descriptor = "I")
	public int anInt1914 = 0;

	@OriginalMember(owner = "client!ep", name = "h", descriptor = "Ljava/lang/Thread;")
	private Thread aThread1;

	@OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(Lclient!or;)V")
	public Class70(@OriginalArg(0) Class183 arg0) {
		@Pc(20) Class91 local20 = arg0.method3904(this, 5);
		while (local20.anInt2446 == 0) {
			Static429.method5376(10L);
		}
		if (local20.anInt2446 == 2) {
			throw new RuntimeException();
		}
		this.aThread1 = (Thread) local20.anObject3;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(ILclient!ro;[BB)Lclient!mu;")
	public Class2_Sub5_Sub12_Sub1 method1541(@OriginalArg(0) int arg0, @OriginalArg(1) Class217 arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(7) Class2_Sub5_Sub12_Sub1 local7 = new Class2_Sub5_Sub12_Sub1();
		local7.aBoolean336 = false;
		local7.aClass217_3 = arg1;
		local7.aByteArray48 = arg2;
		local7.anInt4268 = 2;
		local7.aLong220 = arg0;
		this.method1543(local7);
		return local7;
	}

	@OriginalMember(owner = "client!ep", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean134) {
			@Pc(6) Class261 local6 = this.aClass261_1;
			@Pc(14) Class2_Sub5_Sub12_Sub1 local14;
			synchronized (this.aClass261_1) {
				local14 = (Class2_Sub5_Sub12_Sub1) this.aClass261_1.method5485();
				if (local14 == null) {
					try {
						this.aClass261_1.wait();
					} catch (@Pc(21) InterruptedException local21) {
					}
					continue;
				}
				this.anInt1914--;
			}
			try {
				if (local14.anInt4268 == 2) {
					local14.aClass217_3.method4652(local14.aByteArray48.length, (int) local14.aLong220, local14.aByteArray48);
				} else if (local14.anInt4268 == 3) {
					local14.aByteArray48 = local14.aClass217_3.method4650((int) local14.aLong220);
				}
			} catch (@Pc(74) Exception local74) {
				Static434.method5460(local74, null);
			}
			local14.aBoolean335 = false;
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(ILclient!ro;I)Lclient!mu;")
	public Class2_Sub5_Sub12_Sub1 method1542(@OriginalArg(1) Class217 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class2_Sub5_Sub12_Sub1 local7 = new Class2_Sub5_Sub12_Sub1();
		local7.aClass217_3 = arg0;
		local7.aBoolean336 = false;
		local7.anInt4268 = 3;
		local7.aLong220 = arg1;
		this.method1543(local7);
		return local7;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(ILclient!mu;)V")
	private void method1543(@OriginalArg(1) Class2_Sub5_Sub12_Sub1 arg0) {
		@Pc(6) Class261 local6 = this.aClass261_1;
		synchronized (this.aClass261_1) {
			this.aClass261_1.method5487(arg0);
			this.anInt1914++;
			this.aClass261_1.notifyAll();
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IILclient!ro;)Lclient!mu;")
	public Class2_Sub5_Sub12_Sub1 method1544(@OriginalArg(1) int arg0, @OriginalArg(2) Class217 arg1) {
		@Pc(9) Class2_Sub5_Sub12_Sub1 local9 = new Class2_Sub5_Sub12_Sub1();
		local9.anInt4268 = 1;
		@Pc(15) Class261 local15 = this.aClass261_1;
		synchronized (this.aClass261_1) {
			@Pc(23) Class2_Sub5_Sub12_Sub1 local23 = (Class2_Sub5_Sub12_Sub1) this.aClass261_1.method5489();
			while (true) {
				if (local23 == null) {
					break;
				}
				if ((long) arg0 == local23.aLong220 && local23.aClass217_3 == arg1 && local23.anInt4268 == 2) {
					local9.aByteArray48 = local23.aByteArray48;
					local9.aBoolean335 = false;
					return local9;
				}
				local23 = (Class2_Sub5_Sub12_Sub1) this.aClass261_1.method5490();
			}
		}
		local9.aByteArray48 = arg1.method4650(arg0);
		local9.aBoolean335 = false;
		local9.aBoolean336 = true;
		return local9;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(Z)V")
	public void method1546() {
		this.aBoolean134 = true;
		@Pc(9) Class261 local9 = this.aClass261_1;
		synchronized (this.aClass261_1) {
			this.aClass261_1.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(25) InterruptedException local25) {
		}
		this.aThread1 = null;
	}
}
