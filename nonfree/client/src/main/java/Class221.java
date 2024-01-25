import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tt")
public final class Class221 implements Runnable {

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "Lclient!pf;")
	private final Class179 aClass179_7 = new Class179();

	@OriginalMember(owner = "client!tt", name = "q", descriptor = "I")
	public int anInt6331 = 0;

	@OriginalMember(owner = "client!tt", name = "n", descriptor = "Z")
	private boolean aBoolean458 = false;

	@OriginalMember(owner = "client!tt", name = "l", descriptor = "Ljava/lang/Thread;")
	private Thread aThread3;

	@OriginalMember(owner = "client!tt", name = "<init>", descriptor = "(Lclient!kd;)V")
	public Class221(@OriginalArg(0) Class123 arg0) {
		@Pc(20) Class86 local20 = arg0.method3251(5, this);
		while (local20.anInt2590 == 0) {
			Static215.method3855(10L);
		}
		if (local20.anInt2590 == 2) {
			throw new RuntimeException();
		}
		this.aThread3 = (Thread) local20.anObject2;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(I)V")
	public void method5497() {
		this.aBoolean458 = true;
		@Pc(9) Class179 local9 = this.aClass179_7;
		synchronized (this.aClass179_7) {
			this.aClass179_7.notifyAll();
		}
		try {
			this.aThread3.join();
		} catch (@Pc(29) InterruptedException local29) {
		}
		this.aThread3 = null;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!sj;I)V")
	private void method5501(@OriginalArg(0) Class2_Sub7_Sub17_Sub1 arg0) {
		@Pc(2) Class179 local2 = this.aClass179_7;
		synchronized (this.aClass179_7) {
			this.aClass179_7.method4491(arg0);
			this.anInt6331++;
			this.aClass179_7.notifyAll();
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IILclient!hc;)Lclient!sj;")
	public Class2_Sub7_Sub17_Sub1 method5502(@OriginalArg(1) int arg0, @OriginalArg(2) Class93 arg1) {
		@Pc(13) Class2_Sub7_Sub17_Sub1 local13 = new Class2_Sub7_Sub17_Sub1();
		local13.anInt5887 = 3;
		local13.aBoolean500 = false;
		local13.aLong209 = arg0;
		local13.aClass93_3 = arg1;
		this.method5501(local13);
		return local13;
	}

	@OriginalMember(owner = "client!tt", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean458) {
			@Pc(6) Class179 local6 = this.aClass179_7;
			@Pc(14) Class2_Sub7_Sub17_Sub1 local14;
			synchronized (this.aClass179_7) {
				local14 = (Class2_Sub7_Sub17_Sub1) this.aClass179_7.method4490();
				if (local14 == null) {
					try {
						this.aClass179_7.wait();
					} catch (@Pc(29) InterruptedException local29) {
					}
					continue;
				}
				this.anInt6331--;
			}
			try {
				if (local14.anInt5887 == 2) {
					local14.aClass93_3.method2228(local14.aByteArray82, (int) local14.aLong209, local14.aByteArray82.length);
				} else if (local14.anInt5887 == 3) {
					local14.aByteArray82 = local14.aClass93_3.method2226((int) local14.aLong209);
				}
			} catch (@Pc(74) Exception local74) {
				Static346.method5531(local74, null);
			}
			local14.aBoolean502 = false;
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(ZLclient!hc;I)Lclient!sj;")
	public Class2_Sub7_Sub17_Sub1 method5503(@OriginalArg(1) Class93 arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class2_Sub7_Sub17_Sub1 local9 = new Class2_Sub7_Sub17_Sub1();
		local9.anInt5887 = 1;
		@Pc(15) Class179 local15 = this.aClass179_7;
		synchronized (this.aClass179_7) {
			@Pc(23) Class2_Sub7_Sub17_Sub1 local23 = (Class2_Sub7_Sub17_Sub1) this.aClass179_7.method4487();
			while (true) {
				if (local23 == null) {
					break;
				}
				if (local23.aLong209 == (long) arg1 && arg0 == local23.aClass93_3 && local23.anInt5887 == 2) {
					local9.aByteArray82 = local23.aByteArray82;
					local9.aBoolean502 = false;
					return local9;
				}
				local23 = (Class2_Sub7_Sub17_Sub1) this.aClass179_7.method4494();
			}
		}
		local9.aByteArray82 = arg0.method2226(arg1);
		local9.aBoolean502 = false;
		local9.aBoolean500 = true;
		return local9;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!hc;[BIB)Lclient!sj;")
	public Class2_Sub7_Sub17_Sub1 method5505(@OriginalArg(0) Class93 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(11) Class2_Sub7_Sub17_Sub1 local11 = new Class2_Sub7_Sub17_Sub1();
		local11.aClass93_3 = arg0;
		local11.aLong209 = arg2;
		local11.anInt5887 = 2;
		local11.aBoolean500 = false;
		local11.aByteArray82 = arg1;
		this.method5501(local11);
		return local11;
	}
}
