import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pf")
public final class Class4_Sub2_Sub29 extends Class4_Sub2 {

	@OriginalMember(owner = "client!pf", name = "M", descriptor = "[I")
	private int[] anIntArray468;

	@OriginalMember(owner = "client!pf", name = "O", descriptor = "[[I")
	private int[][] anIntArrayArray50;

	@OriginalMember(owner = "client!pf", name = "T", descriptor = "[I")
	private int[] anIntArray469;

	@OriginalMember(owner = "client!pf", name = "N", descriptor = "I")
	private int anInt5424 = 0;

	@OriginalMember(owner = "client!pf", name = "U", descriptor = "[S")
	private final short[] aShortArray70 = new short[257];

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub29() {
		super(1, true);
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IBLclient!tl;)V")
	@Override
	public void method5843(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub30 arg1) {
		if (arg0 != 0) {
			return;
		}
		this.anInt5424 = arg1.method4864();
		this.anIntArrayArray50 = new int[arg1.method4864()][2];
		for (@Pc(29) int local29 = 0; local29 < this.anIntArrayArray50.length; local29++) {
			this.anIntArrayArray50[local29][0] = arg1.method4877();
			this.anIntArrayArray50[local29][1] = arg1.method4877();
		}
	}

	@OriginalMember(owner = "client!pf", name = "d", descriptor = "(B)V")
	private void method4173() {
		@Pc(8) int[] local8 = this.anIntArrayArray50[0];
		@Pc(13) int[] local13 = this.anIntArrayArray50[1];
		@Pc(28) int[] local28 = this.anIntArrayArray50[this.anIntArrayArray50.length - 2];
		@Pc(37) int[] local37 = this.anIntArrayArray50[this.anIntArrayArray50.length - 1];
		this.anIntArray468 = new int[] { local28[0] + local28[0] - local37[0], local28[1] + (local28[1] - local37[1]) };
		this.anIntArray469 = new int[] { local8[0] + local8[0] - local13[0], local8[1] - (-local8[1] + local13[1]) };
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5838(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass9_41.method279(arg0);
		if (super.aClass9_41.aBoolean15) {
			@Pc(26) int[] local26 = this.method5847(0, arg0);
			for (@Pc(28) int local28 = 0; local28 < Static350.anInt6330; local28++) {
				@Pc(36) int local36 = local26[local28] >> 4;
				if (local36 < 0) {
					local36 = 0;
				}
				if (local36 > 256) {
					local36 = 256;
				}
				local16[local28] = this.aShortArray70[local36];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!pf", name = "d", descriptor = "(I)V")
	@Override
	public void method5845() {
		if (this.anIntArrayArray50 == null) {
			this.anIntArrayArray50 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray50.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt5424 == 2) {
			this.method4173();
		}
		Static47.method995();
		this.method4174();
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Z)V")
	private void method4174() {
		@Pc(8) int local8 = this.anInt5424;
		@Pc(28) int local28;
		@Pc(26) int local26;
		@Pc(59) int[] local59;
		@Pc(64) int[] local64;
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(81) int local81;
		@Pc(90) int local90;
		if (local8 == 2) {
			for (local8 = 0; local8 < 257; local8++) {
				local26 = local8 << 4;
				for (local28 = 1; local28 < this.anIntArrayArray50.length - 1 && this.anIntArrayArray50[local28][0] <= local26; local28++) {
				}
				local59 = this.anIntArrayArray50[local28 - 1];
				local64 = this.anIntArrayArray50[local28];
				local73 = this.method4175(local28 - 2)[1];
				local77 = local59[1];
				local81 = local64[1];
				local90 = this.method4175(local28 + 1)[1];
				@Pc(107) int local107 = (local26 - local59[0] << 12) / (local64[0] - local59[0]);
				@Pc(113) int local113 = local107 * local107 >> 12;
				@Pc(123) int local123 = local90 + local77 - local73 - local81;
				@Pc(130) int local130 = local73 - local77 - local123;
				@Pc(135) int local135 = local81 - local73;
				@Pc(147) int local147 = local113 * (local123 * local107 >> 12) >> 12;
				@Pc(153) int local153 = local130 * local113 >> 12;
				@Pc(159) int local159 = local107 * local135 >> 12;
				@Pc(167) int local167 = local77 + local153 + local147 + local159;
				if (local167 <= -32768) {
					local167 = -32767;
				}
				if (local167 >= 32768) {
					local167 = 32767;
				}
				this.aShortArray70[local8] = (short) local167;
			}
		} else if (local8 == 1) {
			for (local8 = 0; local8 < 257; local8++) {
				local26 = local8 << 4;
				for (local28 = 1; local28 < this.anIntArrayArray50.length - 1 && local26 >= this.anIntArrayArray50[local28][0]; local28++) {
				}
				local59 = this.anIntArrayArray50[local28 - 1];
				local64 = this.anIntArrayArray50[local28];
				local73 = (local26 - local59[0] << 12) / (local64[0] - local59[0]);
				local77 = 4096 - Static100.anIntArray135[local73 >> 5 & 0xFF] >> 1;
				local81 = 4096 - local77;
				local90 = local81 * local59[1] + local77 * local64[1] >> 12;
				if (local90 <= -32768) {
					local90 = -32767;
				}
				if (local90 >= 32768) {
					local90 = 32767;
				}
				this.aShortArray70[local8] = (short) local90;
			}
		} else {
			for (local8 = 0; local8 < 257; local8++) {
				local26 = local8 << 4;
				for (local28 = 1; this.anIntArrayArray50.length - 1 > local28 && local26 >= this.anIntArrayArray50[local28][0]; local28++) {
				}
				local59 = this.anIntArrayArray50[local28 - 1];
				local64 = this.anIntArrayArray50[local28];
				local73 = (local26 - local59[0] << 12) / (local64[0] - local59[0]);
				local77 = 4096 - local73;
				local81 = local59[1] * local77 + local64[1] * local73 >> 12;
				if (local81 <= -32768) {
					local81 = -32767;
				}
				if (local81 >= 32768) {
					local81 = 32767;
				}
				this.aShortArray70[local8] = (short) local81;
			}
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IB)[I")
	private int[] method4175(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray469;
		} else if (arg0 >= this.anIntArrayArray50.length) {
			return this.anIntArray468;
		} else {
			return this.anIntArrayArray50[arg0];
		}
	}
}
