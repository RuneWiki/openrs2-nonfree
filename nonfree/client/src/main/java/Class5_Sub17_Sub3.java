import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iia")
public final class Class5_Sub17_Sub3 extends Class5_Sub17 {

	@OriginalMember(owner = "client!iia", name = "P", descriptor = "[I")
	public static final int[] anIntArray248 = new int[32];

	@OriginalMember(owner = "client!iia", name = "I", descriptor = "Z")
	private boolean aBoolean395;

	@OriginalMember(owner = "client!iia", name = "J", descriptor = "Z")
	private boolean aBoolean396;

	@OriginalMember(owner = "client!iia", name = "M", descriptor = "I")
	private int anInt4724;

	@OriginalMember(owner = "client!iia", name = "t", descriptor = "Lclient!fca;")
	private final Class114 aClass114_26 = new Class114();

	@OriginalMember(owner = "client!iia", name = "N", descriptor = "I")
	private int anInt4725 = 256;

	@OriginalMember(owner = "client!iia", name = "O", descriptor = "I")
	private int anInt4726 = 0;

	@OriginalMember(owner = "client!iia", name = "Q", descriptor = "I")
	private int anInt4727 = 256;

	@OriginalMember(owner = "client!iia", name = "E", descriptor = "I")
	private final int anInt4720;

	static {
		@Pc(10) int local10 = 2;
		for (@Pc(12) int local12 = 0; local12 < 32; local12++) {
			anIntArray248[local12] = local10 - 1;
			local10 += local10;
		}
	}

	@OriginalMember(owner = "client!iia", name = "<init>", descriptor = "(I)V")
	public Class5_Sub17_Sub3(@OriginalArg(0) int arg0) {
		this.anInt4720 = arg0;
	}

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method6650(@OriginalArg(0) int arg0) {
		if (this.aBoolean395) {
			return;
		}
		while (true) {
			@Pc(11) Class5_Sub3_Sub14 local11 = this.method3988();
			if (local11 == null) {
				if (this.aBoolean396) {
					this.method9052();
					Static677.aClass97_6.method2402();
				}
				return;
			}
			if (arg0 < local11.aShortArrayArray12[0].length - this.anInt4724) {
				this.anInt4724 += arg0;
				return;
			}
			arg0 -= local11.aShortArrayArray12[0].length - this.anInt4724;
			this.method3997();
		}
	}

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(Z)Lclient!pt;")
	private synchronized Class5_Sub3_Sub14 method3988() {
		return (Class5_Sub3_Sub14) this.aClass114_26.method2805();
	}

	@OriginalMember(owner = "client!iia", name = "b", descriptor = "(II)V")
	public void method3989(@OriginalArg(0) int arg0) {
		this.anInt4725 = arg0;
		this.anInt4727 = arg0;
	}

	@OriginalMember(owner = "client!iia", name = "b", descriptor = "(I)V")
	public synchronized void method3990() {
		this.aBoolean396 = true;
	}

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "()I")
	@Override
	public int method6646() {
		return 1;
	}

	@OriginalMember(owner = "client!iia", name = "d", descriptor = "()Lclient!km;")
	@Override
	public Class5_Sub17 method6652() {
		return null;
	}

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(IZ)V")
	public synchronized void method3992(@OriginalArg(1) boolean arg0) {
		this.aBoolean395 = arg0;
	}

	@OriginalMember(owner = "client!iia", name = "c", descriptor = "(Z)I")
	public synchronized int method3993() {
		return this.anInt4726;
	}

	@OriginalMember(owner = "client!iia", name = "d", descriptor = "(Z)D")
	public synchronized double method3994() {
		if (this.anInt4726 < 1) {
			return -1.0D;
		} else {
			@Pc(23) Class5_Sub3_Sub14 local23 = (Class5_Sub3_Sub14) this.aClass114_26.method2805();
			return local23 == null ? -1.0D : local23.aDouble19 - (double) ((float) local23.aShortArrayArray12[0].length / (float) Static302.anInt5797);
		}
	}

	@OriginalMember(owner = "client!iia", name = "b", descriptor = "()Lclient!km;")
	@Override
	public Class5_Sub17 method6649() {
		return null;
	}

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(IDI)Lclient!pt;")
	public Class5_Sub3_Sub14 method3996(@OriginalArg(1) double arg0, @OriginalArg(2) int arg1) {
		@Pc(19) long local19 = (long) (this.anInt4720 << 0 | arg1);
		@Pc(25) Class5_Sub3_Sub14 local25 = (Class5_Sub3_Sub14) Static677.aClass97_6.method2405(local19);
		if (local25 == null) {
			local25 = new Class5_Sub3_Sub14(new short[this.anInt4720][arg1], arg0);
		} else {
			local25.aDouble19 = arg0;
			Static677.aClass97_6.method2403(local19);
		}
		return local25;
	}

	@OriginalMember(owner = "client!iia", name = "f", descriptor = "(I)V")
	private synchronized void method3997() {
		@Pc(13) Class5_Sub3_Sub14 local13 = this.method3988();
		if (local13 != null) {
			local13.method9052();
			this.anInt4724 = 0;
			this.anInt4726--;
			Static677.aClass97_6.method2400(local13, local13.method6594());
		}
	}

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method6647(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean395) {
			return;
		}
		if (this.method3988() != null) {
			@Pc(27) int local27 = arg1 + arg2;
			if (Static143.aBoolean243) {
				local27 <<= 0x1;
			}
			@Pc(37) byte local37 = 0;
			if (this.anInt4720 == 2) {
				local37 = 1;
			}
			while (arg1 < local27) {
				@Pc(51) Class5_Sub3_Sub14 local51 = this.method3988();
				if (local51 == null) {
					return;
				}
				@Pc(57) short[][] local57 = local51.aShortArrayArray12;
				while (arg1 < local27 && this.anInt4724 < local57[0].length) {
					if (Static143.aBoolean243) {
						arg0[arg1++] = local57[0][this.anInt4724] * this.anInt4727;
						arg0[arg1++] = local57[local37][this.anInt4724] * this.anInt4725;
					} else {
						@Pc(91) int local91 = arg1++;
						arg0[local91] += local57[0][this.anInt4724] * this.anInt4727 + this.anInt4725 * local57[local37][this.anInt4724];
					}
					this.anInt4724++;
				}
				if (local57[0].length <= this.anInt4724) {
					this.method3997();
				}
			}
		} else if (this.aBoolean396) {
			this.method9052();
			Static677.aClass97_6.method2402();
		}
	}

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(Lclient!pt;I)V")
	public synchronized void method3998(@OriginalArg(0) Class5_Sub3_Sub14 arg0) {
		while (this.anInt4726 >= 100) {
			this.aClass114_26.method2813();
			this.anInt4726--;
		}
		this.aClass114_26.method2807(arg0);
		this.anInt4726++;
	}
}
