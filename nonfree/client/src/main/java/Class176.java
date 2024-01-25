import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ig")
public final class Class176 implements Runnable {

	@OriginalMember(owner = "client!ig", name = "n", descriptor = "Lclient!gw;")
	private final Class147 aClass147_3 = new Class147();

	@OriginalMember(owner = "client!ig", name = "g", descriptor = "Z")
	private boolean aBoolean282 = false;

	@OriginalMember(owner = "client!ig", name = "d", descriptor = "I")
	public int anInt4202 = 0;

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "Ljava/lang/Thread;")
	private Thread aThread3;

	@OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(Lclient!br;)V")
	public Class176(@OriginalArg(0) Class47 arg0) {
		@Pc(20) Class338 local20 = arg0.method1394(5, this);
		while (local20.anInt8934 == 0) {
			Static550.method7219(10L);
		}
		if (local20.anInt8934 == 2) {
			throw new RuntimeException();
		}
		this.aThread3 = (Thread) local20.anObject16;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lclient!jq;IZ)Lclient!pla;")
	public Class3_Sub7_Sub7_Sub2 method3850(@OriginalArg(0) Class199 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class3_Sub7_Sub7_Sub2 local9 = new Class3_Sub7_Sub7_Sub2();
		local9.anInt8036 = 1;
		@Pc(15) Class147 local15 = this.aClass147_3;
		synchronized (this.aClass147_3) {
			@Pc(23) Class3_Sub7_Sub7_Sub2 local23 = (Class3_Sub7_Sub7_Sub2) this.aClass147_3.method3334();
			while (true) {
				if (local23 == null) {
					break;
				}
				if ((long) arg1 == local23.aLong336 && local23.aClass199_4 == arg0 && local23.anInt8036 == 2) {
					local9.aByteArray81 = local23.aByteArray81;
					local9.aBoolean537 = false;
					return local9;
				}
				local23 = (Class3_Sub7_Sub7_Sub2) this.aClass147_3.method3332();
			}
		}
		local9.aByteArray81 = arg0.method4689(arg1);
		local9.aBoolean538 = true;
		local9.aBoolean537 = false;
		return local9;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILclient!jq;I)Lclient!pla;")
	public Class3_Sub7_Sub7_Sub2 method3851(@OriginalArg(1) Class199 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class3_Sub7_Sub7_Sub2 local7 = new Class3_Sub7_Sub7_Sub2();
		local7.aBoolean538 = false;
		local7.aClass199_4 = arg0;
		local7.anInt8036 = 3;
		local7.aLong336 = (long) arg1;
		this.method3858(local7);
		return local7;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(B)V")
	public void method3853() {
		this.aBoolean282 = true;
		@Pc(14) Class147 local14 = this.aClass147_3;
		synchronized (this.aClass147_3) {
			this.aClass147_3.notifyAll();
		}
		try {
			this.aThread3.join();
		} catch (@Pc(30) InterruptedException local30) {
		}
		this.aThread3 = null;
	}

	@OriginalMember(owner = "client!ig", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean282) {
			@Pc(6) Class147 local6 = this.aClass147_3;
			@Pc(14) Class3_Sub7_Sub7_Sub2 local14;
			synchronized (this.aClass147_3) {
				local14 = (Class3_Sub7_Sub7_Sub2) this.aClass147_3.method3333();
				if (local14 == null) {
					try {
						this.aClass147_3.wait();
					} catch (@Pc(32) InterruptedException local32) {
					}
					continue;
				}
				this.anInt4202--;
			}
			try {
				if (local14.anInt8036 == 2) {
					local14.aClass199_4.method4693(local14.aByteArray81.length, (int) local14.aLong336, local14.aByteArray81);
				} else if (local14.anInt8036 == 3) {
					local14.aByteArray81 = local14.aClass199_4.method4689((int) local14.aLong336);
				}
			} catch (@Pc(81) Exception local81) {
				Static275.method4893((String) null, local81);
			}
			local14.aBoolean537 = false;
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILclient!jq;[BB)Lclient!pla;")
	public Class3_Sub7_Sub7_Sub2 method3857(@OriginalArg(0) int arg0, @OriginalArg(1) Class199 arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(15) Class3_Sub7_Sub7_Sub2 local15 = new Class3_Sub7_Sub7_Sub2();
		local15.anInt8036 = 2;
		local15.aByteArray81 = arg2;
		local15.aBoolean538 = false;
		local15.aLong336 = (long) arg0;
		local15.aClass199_4 = arg1;
		this.method3858(local15);
		return local15;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lclient!pla;B)V")
	private void method3858(@OriginalArg(0) Class3_Sub7_Sub7_Sub2 arg0) {
		@Pc(2) Class147 local2 = this.aClass147_3;
		synchronized (this.aClass147_3) {
			this.aClass147_3.method3335(arg0);
			this.anInt4202++;
			this.aClass147_3.notifyAll();
		}
	}
}
