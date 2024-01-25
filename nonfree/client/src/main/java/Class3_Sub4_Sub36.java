import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!um")
public final class Class3_Sub4_Sub36 extends Class3_Sub4 {

	@OriginalMember(owner = "client!um", name = "O", descriptor = "I")
	private int anInt7032 = 32768;

	@OriginalMember(owner = "client!um", name = "<init>", descriptor = "()V")
	public Class3_Sub4_Sub36() {
		super(3, false);
	}

	@OriginalMember(owner = "client!um", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method6134(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass109_41.method2831(arg0);
		if (super.aClass109_41.aBoolean250) {
			@Pc(21) int[] local21 = this.method6139(1, arg0);
			@Pc(27) int[] local27 = this.method6139(2, arg0);
			for (@Pc(29) int local29 = 0; local29 < Static148.anInt2687; local29++) {
				@Pc(39) int local39 = local21[local29] >> 4 & 0xFF;
				@Pc(48) int local48 = local27[local29] * this.anInt7032 >> 12;
				@Pc(56) int local56 = local48 * Static331.anIntArray491[local39] >> 12;
				@Pc(64) int local64 = local48 * Static418.anIntArray448[local39] >> 12;
				@Pc(72) int local72 = Static225.anInt3793 & local29 + (local56 >> 12);
				@Pc(81) int local81 = arg0 + (local64 >> 12) & Static165.anInt2326;
				@Pc(87) int[] local87 = this.method6139(0, local81);
				local11[local29] = local87[local72];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!um", name = "g", descriptor = "(I)V")
	@Override
	public void method6146() {
		Static417.method5714();
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method6144(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass148_41.method3566(arg0);
		if (super.aClass148_41.aBoolean309) {
			@Pc(29) int[] local29 = this.method6139(1, arg0);
			@Pc(35) int[] local35 = this.method6139(2, arg0);
			@Pc(39) int[] local39 = local11[0];
			@Pc(43) int[] local43 = local11[1];
			@Pc(47) int[] local47 = local11[2];
			for (@Pc(49) int local49 = 0; local49 < Static148.anInt2687; local49++) {
				@Pc(61) int local61 = local29[local49] * 255 >> 12 & 0xFF;
				@Pc(70) int local70 = this.anInt7032 * local35[local49] >> 12;
				@Pc(78) int local78 = local70 * Static331.anIntArray491[local61] >> 12;
				@Pc(86) int local86 = local70 * Static418.anIntArray448[local61] >> 12;
				@Pc(95) int local95 = Static225.anInt3793 & local49 + (local78 >> 12);
				@Pc(103) int local103 = (local86 >> 12) + arg0 & Static165.anInt2326;
				@Pc(109) int[][] local109 = this.method6138(local103, 0);
				local39[local49] = local109[0][local95];
				local43[local49] = local109[1][local95];
				local47[local49] = local109[2][local95];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Lclient!nj;II)V")
	@Override
	public void method6141(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt7032 = arg0.method4083() << 4;
		} else if (arg1 == 1) {
			super.aBoolean504 = arg0.method4096() == 1;
		}
	}
}
