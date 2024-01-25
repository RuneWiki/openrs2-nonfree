import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bj")
public final class Class30 implements Runnable {

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "[I")
	public static final int[] anIntArray73 = new int[32];

	@OriginalMember(owner = "client!bj", name = "c", descriptor = "Lclient!rp;")
	private final Class259 aClass259_2 = new Class259();

	@OriginalMember(owner = "client!bj", name = "g", descriptor = "Z")
	private boolean aBoolean95 = false;

	@OriginalMember(owner = "client!bj", name = "i", descriptor = "I")
	public int anInt1104 = 0;

	@OriginalMember(owner = "client!bj", name = "m", descriptor = "Ljava/lang/Thread;")
	private Thread aThread2;

	static {
		@Pc(4) int local4 = 2;
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			anIntArray73[local6] = local4 - 1;
			local4 += local4;
		}
	}

	@OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(Lclient!pq;)V")
	public Class30(@OriginalArg(0) Class229 arg0) {
		@Pc(20) Class311 local20 = arg0.method6060(5, this);
		while (local20.anInt9169 == 0) {
			Static265.method3147(10L);
		}
		if (local20.anInt9169 == 2) {
			throw new RuntimeException();
		}
		this.aThread2 = (Thread) local20.anObject17;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(IILclient!es;)Lclient!dm;")
	public Class1_Sub2_Sub6_Sub1 method1114(@OriginalArg(1) int arg0, @OriginalArg(2) Class90 arg1) {
		@Pc(9) Class1_Sub2_Sub6_Sub1 local9 = new Class1_Sub2_Sub6_Sub1();
		local9.anInt1974 = 1;
		@Pc(15) Class259 local15 = this.aClass259_2;
		synchronized (this.aClass259_2) {
			@Pc(23) Class1_Sub2_Sub6_Sub1 local23 = (Class1_Sub2_Sub6_Sub1) this.aClass259_2.method6652();
			while (true) {
				if (local23 == null) {
					break;
				}
				if ((long) arg0 == local23.aLong228 && arg1 == local23.aClass90_3 && local23.anInt1974 == 2) {
					local9.aBoolean497 = false;
					local9.aByteArray17 = local23.aByteArray17;
					return local9;
				}
				local23 = (Class1_Sub2_Sub6_Sub1) this.aClass259_2.method6654();
			}
		}
		local9.aByteArray17 = arg1.method2269(arg0);
		local9.aBoolean496 = true;
		local9.aBoolean497 = false;
		return local9;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V")
	public void method1115() {
		this.aBoolean95 = true;
		@Pc(9) Class259 local9 = this.aClass259_2;
		synchronized (this.aClass259_2) {
			this.aClass259_2.notifyAll();
		}
		try {
			this.aThread2.join();
		} catch (@Pc(35) InterruptedException local35) {
		}
		this.aThread2 = null;
	}

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "(IILclient!es;)Lclient!dm;")
	public Class1_Sub2_Sub6_Sub1 method1116(@OriginalArg(0) int arg0, @OriginalArg(2) Class90 arg1) {
		@Pc(7) Class1_Sub2_Sub6_Sub1 local7 = new Class1_Sub2_Sub6_Sub1();
		local7.aBoolean496 = false;
		local7.anInt1974 = 3;
		local7.aLong228 = arg0;
		local7.aClass90_3 = arg1;
		this.method1118(local7);
		return local7;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(I[BLclient!es;I)Lclient!dm;")
	public Class1_Sub2_Sub6_Sub1 method1117(@OriginalArg(1) byte[] arg0, @OriginalArg(2) Class90 arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class1_Sub2_Sub6_Sub1 local7 = new Class1_Sub2_Sub6_Sub1();
		local7.aLong228 = arg2;
		local7.aByteArray17 = arg0;
		local7.aBoolean496 = false;
		local7.aClass90_3 = arg1;
		local7.anInt1974 = 2;
		this.method1118(local7);
		return local7;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(BLclient!dm;)V")
	private void method1118(@OriginalArg(1) Class1_Sub2_Sub6_Sub1 arg0) {
		@Pc(14) Class259 local14 = this.aClass259_2;
		synchronized (this.aClass259_2) {
			this.aClass259_2.method6656(arg0);
			this.anInt1104++;
			this.aClass259_2.notifyAll();
		}
	}

	@OriginalMember(owner = "client!bj", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean95) {
			@Pc(10) Class259 local10 = this.aClass259_2;
			@Pc(18) Class1_Sub2_Sub6_Sub1 local18;
			synchronized (this.aClass259_2) {
				local18 = (Class1_Sub2_Sub6_Sub1) this.aClass259_2.method6658();
				if (local18 == null) {
					try {
						this.aClass259_2.wait();
					} catch (@Pc(33) InterruptedException local33) {
					}
					continue;
				}
				this.anInt1104--;
			}
			try {
				if (local18.anInt1974 == 2) {
					local18.aClass90_3.method2271(local18.aByteArray17, (int) local18.aLong228, local18.aByteArray17.length);
				} else if (local18.anInt1974 == 3) {
					local18.aByteArray17 = local18.aClass90_3.method2269((int) local18.aLong228);
				}
			} catch (@Pc(78) Exception local78) {
				Static25.method773(local78, null);
			}
			local18.aBoolean497 = false;
		}
	}
}
