import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fb")
public final class Class2_Sub23_Sub1 extends Class2_Sub23 {

	@OriginalMember(owner = "client!fb", name = "q", descriptor = "Z")
	private boolean aBoolean274;

	@OriginalMember(owner = "client!fb", name = "M", descriptor = "I")
	private int anInt2760;

	@OriginalMember(owner = "client!fb", name = "O", descriptor = "Z")
	private boolean aBoolean275;

	@OriginalMember(owner = "client!fb", name = "G", descriptor = "Lclient!cga;")
	private final Class60 aClass60_52 = new Class60();

	@OriginalMember(owner = "client!fb", name = "W", descriptor = "I")
	private int anInt2757 = 0;

	@OriginalMember(owner = "client!fb", name = "F", descriptor = "I")
	private int anInt2763 = 256;

	@OriginalMember(owner = "client!fb", name = "u", descriptor = "I")
	private int anInt2762 = 256;

	@OriginalMember(owner = "client!fb", name = "v", descriptor = "I")
	private final int anInt2753;

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(I)V")
	public Class2_Sub23_Sub1(@OriginalArg(0) int arg0) {
		this.anInt2753 = arg0;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IZ)V")
	public synchronized void method2416(@OriginalArg(1) boolean arg0) {
		this.aBoolean274 = arg0;
	}

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "(I)V")
	public synchronized void method2417() {
		this.aBoolean275 = true;
	}

	@OriginalMember(owner = "client!fb", name = "d", descriptor = "()Lclient!gm;")
	@Override
	public Class2_Sub23 method7676() {
		return null;
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "()Lclient!gm;")
	@Override
	public Class2_Sub23 method7677() {
		return null;
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)I")
	public synchronized int method2419() {
		return this.anInt2757;
	}

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "()I")
	@Override
	public int method7674() {
		return 1;
	}

	@OriginalMember(owner = "client!fb", name = "f", descriptor = "(I)V")
	private synchronized void method2421() {
		@Pc(7) Class2_Sub6_Sub6 local7 = this.method2425();
		if (local7 != null) {
			local7.method9872();
			this.anInt2757--;
			this.anInt2760 = 0;
			Static264.aClass378_3.method9117(local7.method3365(), local7);
		}
	}

	@OriginalMember(owner = "client!fb", name = "g", descriptor = "(I)D")
	public synchronized double method2422() {
		if (this.anInt2757 < 1) {
			return -1.0D;
		} else {
			@Pc(24) Class2_Sub6_Sub6 local24 = (Class2_Sub6_Sub6) this.aClass60_52.method1226(7);
			return local24 == null ? -1.0D : (double) -((float) local24.aShortArrayArray4[0].length / (float) Static24.anInt294) + local24.aDouble22;
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)V")
	public void method2423(@OriginalArg(0) int arg0) {
		this.anInt2763 = arg0;
		this.anInt2762 = arg0;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method7675(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean274) {
			return;
		}
		if (this.method2425() != null) {
			@Pc(33) int local33 = arg1 + arg2;
			if (Static42.aBoolean76) {
				local33 <<= 0x1;
			}
			@Pc(43) byte local43 = 0;
			if (this.anInt2753 == 2) {
				local43 = 1;
			}
			while (arg1 < local33) {
				@Pc(57) Class2_Sub6_Sub6 local57 = this.method2425();
				if (local57 == null) {
					return;
				}
				@Pc(63) short[][] local63 = local57.aShortArrayArray4;
				while (arg1 < local33 && this.anInt2760 < local63[0].length) {
					if (Static42.aBoolean76) {
						arg0[arg1++] = local63[0][this.anInt2760] * this.anInt2763;
						arg0[arg1++] = this.anInt2762 * local63[local43][this.anInt2760];
					} else {
						@Pc(101) int local101 = arg1++;
						arg0[local101] += this.anInt2762 * local63[local43][this.anInt2760] + local63[0][this.anInt2760] * this.anInt2763;
					}
					this.anInt2760++;
				}
				if (local63[0].length <= this.anInt2760) {
					this.method2421();
				}
			}
		} else if (this.aBoolean275) {
			this.method9872();
			Static264.aClass378_3.method9115();
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method7671(@OriginalArg(0) int arg0) {
		if (this.aBoolean274) {
			return;
		}
		while (true) {
			@Pc(14) Class2_Sub6_Sub6 local14 = this.method2425();
			if (local14 == null) {
				if (this.aBoolean275) {
					this.method9872();
					Static264.aClass378_3.method9115();
				}
				return;
			}
			if (local14.aShortArrayArray4[0].length - this.anInt2760 > arg0) {
				this.anInt2760 += arg0;
				return;
			}
			arg0 -= local14.aShortArrayArray4[0].length - this.anInt2760;
			this.method2421();
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(DII)Lclient!hha;")
	public Class2_Sub6_Sub6 method2424(@OriginalArg(0) double arg0, @OriginalArg(2) int arg1) {
		@Pc(17) long local17 = (long) (arg1 | this.anInt2753 << 0);
		@Pc(23) Class2_Sub6_Sub6 local23 = (Class2_Sub6_Sub6) Static264.aClass378_3.method9118(local17);
		if (local23 == null) {
			local23 = new Class2_Sub6_Sub6(new short[this.anInt2753][arg1], arg0);
		} else {
			local23.aDouble22 = arg0;
			Static264.aClass378_3.method9114(local17);
		}
		return local23;
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(Z)Lclient!hha;")
	private synchronized Class2_Sub6_Sub6 method2425() {
		return (Class2_Sub6_Sub6) this.aClass60_52.method1226(7);
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(BLclient!hha;)V")
	public synchronized void method2427(@OriginalArg(1) Class2_Sub6_Sub6 arg0) {
		while (this.anInt2757 >= 100) {
			this.aClass60_52.method1225();
			this.anInt2757--;
		}
		this.aClass60_52.method1233(arg0);
		this.anInt2757++;
	}
}
