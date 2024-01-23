import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vi")
public final class Class4_Sub1_Sub38 extends Class4_Sub1 {

	@OriginalMember(owner = "client!vi", name = "W", descriptor = "I")
	private int anInt5588 = 1;

	@OriginalMember(owner = "client!vi", name = "V", descriptor = "I")
	private int anInt5587 = 1;

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub38() {
		super(1, false);
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method4732(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = this.aClass116_41.method2709(arg0);
		if (this.aClass116_41.aBoolean230) {
			@Pc(32) int local32 = this.anInt5588 + this.anInt5588 + 1;
			@Pc(36) int local36 = 65536 / local32;
			@Pc(44) int local44 = this.anInt5587 + this.anInt5587 + 1;
			@Pc(48) int local48 = 65536 / local44;
			@Pc(51) int[][][] local51 = new int[local32][][];
			@Pc(82) int local82;
			@Pc(90) int local90;
			@Pc(84) int local84;
			for (@Pc(57) int local57 = arg0 - this.anInt5588; local57 <= arg0 + this.anInt5588; local57++) {
				@Pc(76) int[][] local76 = this.method4723(0, local57 & Static262.anInt5002);
				@Pc(80) int[][] local80 = new int[3][Static73.anInt1626];
				local82 = 0;
				local84 = 0;
				@Pc(88) int[] local88 = local76[0];
				local90 = 0;
				@Pc(94) int[] local94 = local76[2];
				@Pc(98) int[] local98 = local76[1];
				for (@Pc(102) int local102 = -this.anInt5587; local102 <= this.anInt5587; local102++) {
					@Pc(114) int local114 = Static48.anInt901 & local102;
					local90 += local98[local114];
					local82 += local88[local114];
					local84 += local94[local114];
				}
				@Pc(139) int[] local139 = local80[0];
				@Pc(143) int[] local143 = local80[1];
				@Pc(147) int[] local147 = local80[2];
				@Pc(149) int local149 = 0;
				while (Static73.anInt1626 > local149) {
					local139[local149] = local48 * local82 >> 16;
					local143[local149] = local90 * local48 >> 16;
					local147[local149] = local48 * local84 >> 16;
					@Pc(184) int local184 = local149 - this.anInt5587 & Static48.anInt901;
					local90 -= local98[local184];
					local82 -= local88[local184];
					local149++;
					local84 -= local94[local184];
					@Pc(211) int local211 = local149 + this.anInt5587 & Static48.anInt901;
					local82 += local88[local211];
					local90 += local98[local211];
					local84 += local94[local211];
				}
				local51[local57 + this.anInt5588 - arg0] = local80;
			}
			@Pc(249) int[] local249 = local11[1];
			@Pc(253) int[] local253 = local11[2];
			@Pc(257) int[] local257 = local11[0];
			for (local82 = 0; local82 < Static73.anInt1626; local82++) {
				local90 = 0;
				local84 = 0;
				@Pc(268) int local268 = 0;
				for (@Pc(270) int local270 = 0; local270 < local32; local270++) {
					@Pc(277) int[][] local277 = local51[local270];
					local268 += local277[2][local82];
					local90 += local277[0][local82];
					local84 += local277[1][local82];
				}
				local257[local82] = local36 * local90 >> 16;
				local249[local82] = local36 * local84 >> 16;
				local253[local82] = local268 * local36 >> 16;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public void method4724(@OriginalArg(1) Class4_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5587 = arg0.method4666();
		} else if (arg1 == 1) {
			this.anInt5588 = arg0.method4666();
		} else if (arg1 == 2) {
			this.aBoolean398 = arg0.method4666() == 1;
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4731(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = this.aClass35_41.method730(arg0);
		if (this.aClass35_41.aBoolean51) {
			@Pc(33) int local33 = this.anInt5588 + this.anInt5588 + 1;
			@Pc(37) int local37 = 65536 / local33;
			@Pc(45) int local45 = this.anInt5587 + this.anInt5587 + 1;
			@Pc(49) int local49 = 65536 / local45;
			@Pc(52) int[][] local52 = new int[local33][];
			@Pc(58) int local58;
			for (local58 = arg0 - this.anInt5588; local58 <= arg0 + this.anInt5588; local58++) {
				@Pc(75) int[] local75 = this.method4736(Static262.anInt5002 & local58, 0);
				@Pc(78) int[] local78 = new int[Static73.anInt1626];
				@Pc(80) int local80 = 0;
				@Pc(84) int local84;
				for (local84 = -this.anInt5587; local84 <= this.anInt5587; local84++) {
					local80 += local75[Static48.anInt901 & local84];
				}
				local84 = 0;
				while (local84 < Static73.anInt1626) {
					local78[local84] = local80 * local49 >> 16;
					local80 -= local75[Static48.anInt901 & local84 - this.anInt5587];
					local84++;
					local80 += local75[local84 + this.anInt5587 & Static48.anInt901];
				}
				local52[local58 + this.anInt5588 - arg0] = local78;
			}
			for (local58 = 0; local58 < Static73.anInt1626; local58++) {
				@Pc(167) int local167 = 0;
				for (@Pc(169) int local169 = 0; local169 < local33; local169++) {
					local167 += local52[local169][local58];
				}
				local19[local58] = local37 * local167 >> 16;
			}
		}
		return local19;
	}
}
