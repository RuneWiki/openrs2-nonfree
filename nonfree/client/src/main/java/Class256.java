import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!um")
public final class Class256 implements Runnable {

	@OriginalMember(owner = "client!um", name = "b", descriptor = "Lclient!ub;")
	private final Class252 aClass252_10 = new Class252();

	@OriginalMember(owner = "client!um", name = "m", descriptor = "I")
	public int anInt7282 = 0;

	@OriginalMember(owner = "client!um", name = "l", descriptor = "Z")
	private boolean aBoolean538 = false;

	@OriginalMember(owner = "client!um", name = "k", descriptor = "Ljava/lang/Thread;")
	private Thread aThread5;

	@OriginalMember(owner = "client!um", name = "<init>", descriptor = "(Lclient!ul;)V")
	public Class256(@OriginalArg(0) Class255 arg0) {
		@Pc(20) Class87 local20 = arg0.method5820(this, 5);
		while (local20.anInt2679 == 0) {
			Static77.method1653(10L);
		}
		if (local20.anInt2679 == 2) {
			throw new RuntimeException();
		}
		this.aThread5 = (Thread) local20.anObject3;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(B)V")
	public void method5848() {
		this.aBoolean538 = true;
		@Pc(9) Class252 local9 = this.aClass252_10;
		synchronized (this.aClass252_10) {
			this.aClass252_10.notifyAll();
		}
		try {
			this.aThread5.join();
		} catch (@Pc(31) InterruptedException local31) {
		}
		this.aThread5 = null;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IILclient!wf;)Lclient!vg;")
	public Class4_Sub1_Sub13_Sub2 method5849(@OriginalArg(1) int arg0, @OriginalArg(2) Class269 arg1) {
		@Pc(9) Class4_Sub1_Sub13_Sub2 local9 = new Class4_Sub1_Sub13_Sub2();
		local9.anInt7452 = 1;
		@Pc(15) Class252 local15 = this.aClass252_10;
		synchronized (this.aClass252_10) {
			@Pc(33) Class4_Sub1_Sub13_Sub2 local33 = (Class4_Sub1_Sub13_Sub2) this.aClass252_10.method5697();
			while (true) {
				if (local33 == null) {
					break;
				}
				if (local33.aLong219 == (long) arg0 && arg1 == local33.aClass269_4 && local33.anInt7452 == 2) {
					local9.aBoolean542 = false;
					local9.aByteArray94 = local33.aByteArray94;
					return local9;
				}
				local33 = (Class4_Sub1_Sub13_Sub2) this.aClass252_10.method5700();
			}
		}
		local9.aByteArray94 = arg1.method6182(arg0);
		local9.aBoolean543 = true;
		local9.aBoolean542 = false;
		return local9;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Lclient!vg;B)V")
	private void method5850(@OriginalArg(0) Class4_Sub1_Sub13_Sub2 arg0) {
		@Pc(6) Class252 local6 = this.aClass252_10;
		synchronized (this.aClass252_10) {
			this.aClass252_10.method5694(arg0);
			this.anInt7282++;
			this.aClass252_10.notifyAll();
		}
	}

	@OriginalMember(owner = "client!um", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean538) {
			@Pc(6) Class252 local6 = this.aClass252_10;
			@Pc(14) Class4_Sub1_Sub13_Sub2 local14;
			synchronized (this.aClass252_10) {
				local14 = (Class4_Sub1_Sub13_Sub2) this.aClass252_10.method5698();
				if (local14 == null) {
					try {
						this.aClass252_10.wait();
					} catch (@Pc(29) InterruptedException local29) {
					}
					continue;
				}
				this.anInt7282--;
			}
			try {
				if (local14.anInt7452 == 2) {
					local14.aClass269_4.method6180((int) local14.aLong219, local14.aByteArray94, local14.aByteArray94.length);
				} else if (local14.anInt7452 == 3) {
					local14.aByteArray94 = local14.aClass269_4.method6182((int) local14.aLong219);
				}
			} catch (@Pc(74) Exception local74) {
				Static417.method5814(local74, null);
			}
			local14.aBoolean542 = false;
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Lclient!wf;II)Lclient!vg;")
	public Class4_Sub1_Sub13_Sub2 method5853(@OriginalArg(0) Class269 arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class4_Sub1_Sub13_Sub2 local15 = new Class4_Sub1_Sub13_Sub2();
		local15.anInt7452 = 3;
		local15.aLong219 = arg1;
		local15.aClass269_4 = arg0;
		local15.aBoolean543 = false;
		this.method5850(local15);
		return local15;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Lclient!wf;II[B)Lclient!vg;")
	public Class4_Sub1_Sub13_Sub2 method5854(@OriginalArg(0) Class269 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) Class4_Sub1_Sub13_Sub2 local7 = new Class4_Sub1_Sub13_Sub2();
		local7.aByteArray94 = arg2;
		local7.anInt7452 = 2;
		local7.aClass269_4 = arg0;
		local7.aLong219 = arg1;
		local7.aBoolean543 = false;
		this.method5850(local7);
		return local7;
	}
}
