import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lt")
public final class Class6_Sub4_Sub25 extends Class6_Sub4 {

	@OriginalMember(owner = "client!lt", name = "M", descriptor = "I")
	private int anInt6247 = 32768;

	@OriginalMember(owner = "client!lt", name = "<init>", descriptor = "()V")
	public Class6_Sub4_Sub25() {
		super(3, false);
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8323(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass372_41.method8736(arg0);
		if (super.aClass372_41.aBoolean691) {
			@Pc(26) int[] local26 = this.method8313(arg0, 1);
			@Pc(32) int[] local32 = this.method8313(arg0, 2);
			for (@Pc(34) int local34 = 0; local34 < Static6.anInt111; local34++) {
				@Pc(44) int local44 = local26[local34] >> 4 & 0xFF;
				@Pc(53) int local53 = local32[local34] * this.anInt6247 >> 12;
				@Pc(61) int local61 = Static407.anIntArray406[local44] * local53 >> 12;
				@Pc(69) int local69 = Static343.anIntArray404[local44] * local53 >> 12;
				@Pc(77) int local77 = (local61 >> 12) + local34 & Static325.anInt6209;
				@Pc(85) int local85 = Static2.anInt12 & arg0 + (local69 >> 12);
				@Pc(91) int[] local91 = this.method8313(local85, 0);
				local11[local34] = local91[local77];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(IILclient!rg;)V")
	@Override
	public void method8314(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub40 arg1) {
		if (arg0 == 0) {
			this.anInt6247 = arg1.method8571() << 4;
		} else if (arg0 == 1) {
			super.aBoolean674 = arg1.method8604() == 1;
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(B)V")
	@Override
	public void method8315() {
		Static381.method5939();
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8320(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass307_41.method7792(arg0);
		if (super.aClass307_41.aBoolean613) {
			@Pc(29) int[] local29 = this.method8313(arg0, 1);
			@Pc(35) int[] local35 = this.method8313(arg0, 2);
			@Pc(39) int[] local39 = local11[0];
			@Pc(43) int[] local43 = local11[1];
			@Pc(47) int[] local47 = local11[2];
			for (@Pc(49) int local49 = 0; local49 < Static6.anInt111; local49++) {
				@Pc(61) int local61 = local29[local49] * 255 >> 12 & 0xFF;
				@Pc(70) int local70 = local35[local49] * this.anInt6247 >> 12;
				@Pc(78) int local78 = local70 * Static407.anIntArray406[local61] >> 12;
				@Pc(86) int local86 = Static343.anIntArray404[local61] * local70 >> 12;
				@Pc(94) int local94 = (local78 >> 12) + local49 & Static325.anInt6209;
				@Pc(102) int local102 = arg0 + (local86 >> 12) & Static2.anInt12;
				@Pc(108) int[][] local108 = this.method8319(0, local102);
				local39[local49] = local108[0][local94];
				local43[local49] = local108[1][local94];
				local47[local49] = local108[2][local94];
			}
		}
		return local11;
	}
}
