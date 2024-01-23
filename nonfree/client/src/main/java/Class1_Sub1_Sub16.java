import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hm")
public final class Class1_Sub1_Sub16 extends Class1_Sub1 {

	@OriginalMember(owner = "client!hm", name = "ab", descriptor = "[I")
	private int[] anIntArray237;

	@OriginalMember(owner = "client!hm", name = "cb", descriptor = "[I")
	private int[] anIntArray238;

	@OriginalMember(owner = "client!hm", name = "fb", descriptor = "[[I")
	private int[][] anIntArrayArray26;

	@OriginalMember(owner = "client!hm", name = "U", descriptor = "[S")
	private short[] aShortArray65 = new short[257];

	@OriginalMember(owner = "client!hm", name = "V", descriptor = "I")
	private int anInt2380 = 0;

	@OriginalMember(owner = "client!hm", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub16() {
		super(1, true);
	}

	@OriginalMember(owner = "client!hm", name = "d", descriptor = "(B)V")
	@Override
	public void method4720() {
		if (this.anIntArrayArray26 == null) {
			this.anIntArrayArray26 = new int[][] { { 0, 0 }, { 4096, 4096 } };
		}
		if (this.anIntArrayArray26.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt2380 == 2) {
			this.method1767();
		}
		Static275.method4162();
		this.method1771();
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lclient!qm;II)V")
	@Override
	public void method4712(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		this.anInt2380 = arg0.method2199();
		this.anIntArrayArray26 = new int[arg0.method2199()][2];
		for (@Pc(26) int local26 = 0; local26 < this.anIntArrayArray26.length; local26++) {
			this.anIntArrayArray26[local26][0] = arg0.method2244();
			this.anIntArrayArray26[local26][1] = arg0.method2244();
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4717(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = this.aClass194_41.method4738(arg0);
		if (this.aClass194_41.aBoolean411) {
			@Pc(27) int[] local27 = this.method4716(0, arg0);
			for (@Pc(29) int local29 = 0; local29 < Static62.anInt1350; local29++) {
				@Pc(42) int local42 = local27[local29] >> 4;
				if (local42 < 0) {
					local42 = 0;
				}
				if (local42 > 256) {
					local42 = 256;
				}
				local9[local29] = this.aShortArray65[local42];
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!hm", name = "e", descriptor = "(I)V")
	private void method1767() {
		@Pc(8) int[] local8 = this.anIntArrayArray26[0];
		@Pc(13) int[] local13 = this.anIntArrayArray26[1];
		@Pc(26) int[] local26 = this.anIntArrayArray26[this.anIntArrayArray26.length - 2];
		@Pc(35) int[] local35 = this.anIntArrayArray26[this.anIntArrayArray26.length - 1];
		this.anIntArray237 = new int[] { local26[0] + local26[0] - local35[0], -local35[1] + local26[1] + local26[1] };
		this.anIntArray238 = new int[] { local8[0] + local8[0] - local13[0], local8[1] + -local13[1] + local8[1] };
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(BI)[I")
	private int[] method1768(@OriginalArg(1) int arg0) {
		if (arg0 >= 0) {
			return arg0 < this.anIntArrayArray26.length ? this.anIntArrayArray26[arg0] : this.anIntArray237;
		} else {
			return this.anIntArray238;
		}
	}

	@OriginalMember(owner = "client!hm", name = "f", descriptor = "(I)V")
	private void method1771() {
		@Pc(8) int local8 = this.anInt2380;
		@Pc(28) int local28;
		@Pc(26) int local26;
		@Pc(66) int[] local66;
		@Pc(59) int[] local59;
		@Pc(75) int local75;
		@Pc(88) int local88;
		@Pc(79) int local79;
		@Pc(99) int local99;
		if (local8 == 2) {
			for (local8 = 0; local8 < 257; local8++) {
				local26 = local8 << 4;
				for (local28 = 1; this.anIntArrayArray26.length - 1 > local28 && local26 >= this.anIntArrayArray26[local28][0]; local28++) {
				}
				local59 = this.anIntArrayArray26[local28];
				local66 = this.anIntArrayArray26[local28 - 1];
				local75 = this.method1768(local28 - 2)[1];
				local79 = local59[1];
				@Pc(84) int local84 = local79 - local75;
				local88 = local66[1];
				local99 = this.method1768(local28 + 1)[1];
				@Pc(117) int local117 = (local26 - local66[0] << 12) / (local59[0] - local66[0]);
				@Pc(126) int local126 = local99 + local88 - local75 - local79;
				@Pc(132) int local132 = local117 * local117 >> 12;
				@Pc(142) int local142 = local132 * (local117 * local126 >> 12) >> 12;
				@Pc(148) int local148 = local84 * local117 >> 12;
				@Pc(156) int local156 = local75 - local126 - local88;
				@Pc(162) int local162 = local132 * local156 >> 12;
				@Pc(171) int local171 = local162 + local142 + local148 + local88;
				if (local171 <= -32768) {
					local171 = -32767;
				}
				if (local171 >= 32768) {
					local171 = 32767;
				}
				this.aShortArray65[local8] = (short) local171;
			}
		} else if (local8 == 1) {
			for (local8 = 0; local8 < 257; local8++) {
				local26 = local8 << 4;
				for (local28 = 1; this.anIntArrayArray26.length - 1 > local28 && this.anIntArrayArray26[local28][0] <= local26; local28++) {
				}
				local66 = this.anIntArrayArray26[local28 - 1];
				local59 = this.anIntArrayArray26[local28];
				local75 = (local26 - local66[0] << 12) / (local59[0] - local66[0]);
				local88 = 4096 - Static170.anIntArray340[local75 >> 5 & 0xFF] >> 1;
				local79 = 4096 - local88;
				local99 = local59[1] * local88 + local79 * local66[1] >> 12;
				if (local99 <= -32768) {
					local99 = -32767;
				}
				if (local99 >= 32768) {
					local99 = 32767;
				}
				this.aShortArray65[local8] = (short) local99;
			}
		} else {
			for (local8 = 0; local8 < 257; local8++) {
				local26 = local8 << 4;
				for (local28 = 1; this.anIntArrayArray26.length - 1 > local28 && local26 >= this.anIntArrayArray26[local28][0]; local28++) {
				}
				local59 = this.anIntArrayArray26[local28];
				local66 = this.anIntArrayArray26[local28 - 1];
				local75 = (local26 - local66[0] << 12) / (local59[0] - local66[0]);
				local88 = 4096 - local75;
				local79 = local75 * local59[1] + local66[1] * local88 >> 12;
				if (local79 <= -32768) {
					local79 = -32767;
				}
				if (local79 >= 32768) {
					local79 = 32767;
				}
				this.aShortArray65[local8] = (short) local79;
			}
		}
	}
}
