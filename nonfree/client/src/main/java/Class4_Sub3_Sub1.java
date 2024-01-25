import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ap")
public final class Class4_Sub3_Sub1 extends Class4_Sub3 {

	@OriginalMember(owner = "client!ap", name = "I", descriptor = "I")
	private int anInt267 = 32768;

	static {
		new Class21("Select", "Auswählen", "Sélectionner", "Selecionar");
	}

	@OriginalMember(owner = "client!ap", name = "<init>", descriptor = "()V")
	public Class4_Sub3_Sub1() {
		super(3, false);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6335(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass93_41.method2622(arg0);
		if (super.aClass93_41.aBoolean189) {
			@Pc(21) int[] local21 = this.method6337(1, arg0);
			@Pc(27) int[] local27 = this.method6337(2, arg0);
			@Pc(31) int[] local31 = local11[0];
			@Pc(35) int[] local35 = local11[1];
			@Pc(39) int[] local39 = local11[2];
			for (@Pc(41) int local41 = 0; local41 < Static304.anInt5637; local41++) {
				@Pc(53) int local53 = local21[local41] * 255 >> 12 & 0xFF;
				@Pc(62) int local62 = this.anInt267 * local27[local41] >> 12;
				@Pc(70) int local70 = local62 * Static131.anIntArray179[local53] >> 12;
				@Pc(78) int local78 = Static275.anIntArray396[local53] * local62 >> 12;
				@Pc(87) int local87 = local41 + (local70 >> 12) & Static279.anInt5254;
				@Pc(95) int local95 = arg0 + (local78 >> 12) & Static429.anInt7355;
				@Pc(101) int[][] local101 = this.method6331(local95, 0);
				local31[local41] = local101[0][local87];
				local35[local41] = local101[1][local87];
				local39[local41] = local101[2][local87];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ap", name = "e", descriptor = "(B)V")
	@Override
	public void method6341() {
		Static58.method1272();
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(ILclient!wn;I)V")
	@Override
	public void method6340(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt267 = arg1.method4560() << 4;
		} else if (arg0 == 1) {
			super.aBoolean587 = arg1.method4614() == 1;
		}
	}

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6339(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = super.aClass157_41.method4027(arg0);
		if (super.aClass157_41.aBoolean315) {
			@Pc(30) int[] local30 = this.method6337(1, arg0);
			@Pc(36) int[] local36 = this.method6337(2, arg0);
			for (@Pc(38) int local38 = 0; local38 < Static304.anInt5637; local38++) {
				@Pc(48) int local48 = local30[local38] >> 4 & 0xFF;
				@Pc(57) int local57 = local36[local38] * this.anInt267 >> 12;
				@Pc(65) int local65 = local57 * Static131.anIntArray179[local48] >> 12;
				@Pc(73) int local73 = local57 * Static275.anIntArray396[local48] >> 12;
				@Pc(82) int local82 = local38 + (local65 >> 12) & Static279.anInt5254;
				@Pc(90) int local90 = arg0 + (local73 >> 12) & Static429.anInt7355;
				@Pc(96) int[] local96 = this.method6337(0, local90);
				local13[local38] = local96[local82];
			}
		}
		return local13;
	}
}
