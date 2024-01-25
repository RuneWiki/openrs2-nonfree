import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bg")
public final class Class3_Sub2_Sub3 extends Class3_Sub2 {

	@OriginalMember(owner = "client!bg", name = "J", descriptor = "[I")
	private int[] anIntArray40;

	@OriginalMember(owner = "client!bg", name = "K", descriptor = "[I")
	private int[] anIntArray41;

	@OriginalMember(owner = "client!bg", name = "V", descriptor = "[[I")
	private int[][] anIntArrayArray11;

	@OriginalMember(owner = "client!bg", name = "G", descriptor = "I")
	private int anInt688 = 0;

	@OriginalMember(owner = "client!bg", name = "P", descriptor = "[S")
	private final short[] aShortArray8 = new short[257];

	@OriginalMember(owner = "client!bg", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub3() {
		super(1, true);
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(IB)[I")
	private int[] method717(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray41;
		} else if (arg0 >= this.anIntArrayArray11.length) {
			return this.anIntArray40;
		} else {
			return this.anIntArrayArray11[arg0];
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Z)V")
	private void method719() {
		@Pc(14) int[] local14 = this.anIntArrayArray11[0];
		@Pc(19) int[] local19 = this.anIntArrayArray11[1];
		@Pc(28) int[] local28 = this.anIntArrayArray11[this.anIntArrayArray11.length - 2];
		@Pc(37) int[] local37 = this.anIntArrayArray11[this.anIntArrayArray11.length - 1];
		this.anIntArray41 = new int[] { local14[0] + local14[0] - local19[0], local14[1] - (local19[1] - local14[1]) };
		this.anIntArray40 = new int[] { local28[0] + local28[0] - local37[0], local28[1] + local28[1] + -local37[1] };
	}

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "(I)V")
	@Override
	public void method8332() {
		if (this.anIntArrayArray11 == null) {
			this.anIntArrayArray11 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray11.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt688 == 2) {
			this.method719();
		}
		Static468.method6978();
		this.method722();
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8336(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass330_41.method7983(arg0);
		if (super.aClass330_41.aBoolean806) {
			@Pc(21) int[] local21 = this.method8340(arg0, 0);
			for (@Pc(23) int local23 = 0; local23 < Static164.anInt8839; local23++) {
				@Pc(31) int local31 = local21[local23] >> 4;
				if (local31 < 0) {
					local31 = 0;
				}
				if (local31 > 256) {
					local31 = 256;
				}
				local11[local23] = this.aShortArray8[local31];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IBLclient!tn;)V")
	@Override
	public void method8335(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub15 arg1) {
		if (arg0 != 0) {
			return;
		}
		this.anInt688 = arg1.method8401();
		this.anIntArrayArray11 = new int[arg1.method8401()][2];
		for (@Pc(28) int local28 = 0; local28 < this.anIntArrayArray11.length; local28++) {
			this.anIntArrayArray11[local28][0] = arg1.method8414();
			this.anIntArrayArray11[local28][1] = arg1.method8414();
		}
	}

	@OriginalMember(owner = "client!bg", name = "f", descriptor = "(I)V")
	private void method722() {
		@Pc(8) int local8 = this.anInt688;
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
				for (local28 = 1; this.anIntArrayArray11.length - 1 > local28 && this.anIntArrayArray11[local28][0] <= local26; local28++) {
				}
				local59 = this.anIntArrayArray11[local28 - 1];
				local64 = this.anIntArrayArray11[local28];
				local73 = this.method717(local28 - 2)[1];
				local77 = local59[1];
				local81 = local64[1];
				local90 = this.method717(local28 + 1)[1];
				@Pc(107) int local107 = (local26 - local59[0] << 12) / (local64[0] - local59[0]);
				@Pc(113) int local113 = local107 * local107 >> 12;
				@Pc(122) int local122 = local77 + local90 - local81 - local73;
				@Pc(130) int local130 = local73 - local122 - local77;
				@Pc(135) int local135 = local81 - local73;
				@Pc(147) int local147 = local113 * (local107 * local122 >> 12) >> 12;
				@Pc(153) int local153 = local113 * local130 >> 12;
				@Pc(159) int local159 = local107 * local135 >> 12;
				@Pc(168) int local168 = local153 + local147 + local159 + local77;
				if (local168 <= -32768) {
					local168 = -32767;
				}
				if (local168 >= 32768) {
					local168 = 32767;
				}
				this.aShortArray8[local8] = (short) local168;
			}
		} else if (local8 == 1) {
			for (local8 = 0; local8 < 257; local8++) {
				local26 = local8 << 4;
				for (local28 = 1; this.anIntArrayArray11.length - 1 > local28 && this.anIntArrayArray11[local28][0] <= local26; local28++) {
				}
				local59 = this.anIntArrayArray11[local28 - 1];
				local64 = this.anIntArrayArray11[local28];
				local73 = (local26 - local59[0] << 12) / (local64[0] - local59[0]);
				local77 = 4096 - Static365.anIntArray410[local73 >> 5 & 0xFF] >> 1;
				local81 = 4096 - local77;
				local90 = local59[1] * local81 + local64[1] * local77 >> 12;
				if (local90 <= -32768) {
					local90 = -32767;
				}
				if (local90 >= 32768) {
					local90 = 32767;
				}
				this.aShortArray8[local8] = (short) local90;
			}
		} else {
			for (local8 = 0; local8 < 257; local8++) {
				local26 = local8 << 4;
				for (local28 = 1; local28 < this.anIntArrayArray11.length - 1 && local26 >= this.anIntArrayArray11[local28][0]; local28++) {
				}
				local59 = this.anIntArrayArray11[local28 - 1];
				local64 = this.anIntArrayArray11[local28];
				local73 = (local26 - local59[0] << 12) / (local64[0] - local59[0]);
				local77 = 4096 - local73;
				local81 = local64[1] * local73 + local59[1] * local77 >> 12;
				if (local81 <= -32768) {
					local81 = -32767;
				}
				if (local81 >= 32768) {
					local81 = 32767;
				}
				this.aShortArray8[local8] = (short) local81;
			}
		}
	}
}
