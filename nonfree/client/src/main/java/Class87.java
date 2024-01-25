import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fn")
public final class Class87 implements Runnable {

	@OriginalMember(owner = "client!fn", name = "h", descriptor = "Lclient!ld;")
	private final Class145 aClass145_2 = new Class145();

	@OriginalMember(owner = "client!fn", name = "j", descriptor = "I")
	public int anInt2392 = 0;

	@OriginalMember(owner = "client!fn", name = "o", descriptor = "Z")
	private boolean aBoolean200 = false;

	@OriginalMember(owner = "client!fn", name = "k", descriptor = "Ljava/lang/Thread;")
	private Thread aThread1;

	@OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(Lclient!js;)V")
	public Class87(@OriginalArg(0) Class131 arg0) {
		@Pc(20) Class128 local20 = arg0.method3045(5, this);
		while (local20.anInt3727 == 0) {
			Static443.method5991(10L);
		}
		if (local20.anInt3727 == 2) {
			throw new RuntimeException();
		}
		this.aThread1 = (Thread) local20.anObject4;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "([BIILclient!oc;)Lclient!rh;")
	public Class2_Sub2_Sub12_Sub2 method1747(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class175 arg2) {
		@Pc(7) Class2_Sub2_Sub12_Sub2 local7 = new Class2_Sub2_Sub12_Sub2();
		local7.aLong223 = arg1;
		local7.aByteArray165 = arg0;
		local7.anInt5981 = 2;
		local7.aBoolean525 = false;
		local7.aClass175_4 = arg2;
		this.method1751(local7);
		return local7;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IILclient!oc;)Lclient!rh;")
	public Class2_Sub2_Sub12_Sub2 method1749(@OriginalArg(1) int arg0, @OriginalArg(2) Class175 arg1) {
		@Pc(9) Class2_Sub2_Sub12_Sub2 local9 = new Class2_Sub2_Sub12_Sub2();
		local9.anInt5981 = 1;
		@Pc(15) Class145 local15 = this.aClass145_2;
		synchronized (this.aClass145_2) {
			@Pc(23) Class2_Sub2_Sub12_Sub2 local23 = (Class2_Sub2_Sub12_Sub2) this.aClass145_2.method3390();
			while (true) {
				if (local23 == null) {
					break;
				}
				if ((long) arg0 == local23.aLong223 && local23.aClass175_4 == arg1 && local23.anInt5981 == 2) {
					local9.aByteArray165 = local23.aByteArray165;
					local9.aBoolean526 = false;
					return local9;
				}
				local23 = (Class2_Sub2_Sub12_Sub2) this.aClass145_2.method3384();
			}
		}
		local9.aByteArray165 = arg1.method4075(arg0);
		local9.aBoolean525 = true;
		local9.aBoolean526 = false;
		return local9;
	}

	@OriginalMember(owner = "client!fn", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean200) {
			@Pc(10) Class145 local10 = this.aClass145_2;
			@Pc(18) Class2_Sub2_Sub12_Sub2 local18;
			synchronized (this.aClass145_2) {
				local18 = (Class2_Sub2_Sub12_Sub2) this.aClass145_2.method3391();
				if (local18 == null) {
					try {
						this.aClass145_2.wait();
					} catch (@Pc(33) InterruptedException local33) {
					}
					continue;
				}
				this.anInt2392--;
			}
			try {
				if (local18.anInt5981 == 2) {
					local18.aClass175_4.method4072(local18.aByteArray165, local18.aByteArray165.length, (int) local18.aLong223);
				} else if (local18.anInt5981 == 3) {
					local18.aByteArray165 = local18.aClass175_4.method4075((int) local18.aLong223);
				}
			} catch (@Pc(76) Exception local76) {
				Static80.method1410(local76, null);
			}
			local18.aBoolean526 = false;
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(ILclient!oc;I)Lclient!rh;")
	public Class2_Sub2_Sub12_Sub2 method1750(@OriginalArg(0) int arg0, @OriginalArg(1) Class175 arg1) {
		@Pc(7) Class2_Sub2_Sub12_Sub2 local7 = new Class2_Sub2_Sub12_Sub2();
		local7.anInt5981 = 3;
		local7.aLong223 = arg0;
		local7.aBoolean525 = false;
		local7.aClass175_4 = arg1;
		this.method1751(local7);
		return local7;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lclient!rh;I)V")
	private void method1751(@OriginalArg(0) Class2_Sub2_Sub12_Sub2 arg0) {
		@Pc(6) Class145 local6 = this.aClass145_2;
		synchronized (this.aClass145_2) {
			this.aClass145_2.method3387(arg0);
			this.anInt2392++;
			this.aClass145_2.notifyAll();
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(B)V")
	public void method1752() {
		this.aBoolean200 = true;
		@Pc(17) Class145 local17 = this.aClass145_2;
		synchronized (this.aClass145_2) {
			this.aClass145_2.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(33) InterruptedException local33) {
		}
		this.aThread1 = null;
	}
}
