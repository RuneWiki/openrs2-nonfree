import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cd")
public final class Class1_Sub2_Sub7 extends Class1_Sub2 {

	@OriginalMember(owner = "client!cd", name = "X", descriptor = "I")
	private int anInt653;

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method3398(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass85_41.method3438(arg0);
		if (super.aClass85_41.aBoolean177) {
			@Pc(26) int[] local26 = this.method3401(arg0, 1);
			@Pc(32) int[] local32 = this.method3401(arg0, 2);
			for (@Pc(34) int local34 = 0; local34 < Static22.anInt596; local34++) {
				@Pc(44) int local44 = local26[local34] >> 4 & 0xFF;
				@Pc(53) int local53 = local32[local34] * this.anInt653 >> 12;
				@Pc(61) int local61 = local53 * Static185.anIntArray441[local44] >> 12;
				@Pc(69) int local69 = local53 * Static147.anIntArray366[local44] >> 12;
				@Pc(77) int local77 = Static28.anInt833 & (local61 >> 12) + local34;
				@Pc(85) int local85 = Static14.anInt436 & arg0 + (local69 >> 12);
				@Pc(91) int[] local91 = this.method3401(local85, 0);
				local16[local34] = local91[local77];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "(I)V")
	@Override
	public void method3389() {
		Static127.method2534();
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3391(@OriginalArg(1) int arg0) {
		@Pc(7) int[][] local7 = super.aClass19_41.method1028(arg0);
		if (super.aClass19_41.aBoolean54) {
			@Pc(17) int[] local17 = this.method3401(arg0, 1);
			@Pc(23) int[] local23 = this.method3401(arg0, 2);
			@Pc(27) int[] local27 = local7[0];
			@Pc(31) int[] local31 = local7[1];
			@Pc(35) int[] local35 = local7[2];
			for (@Pc(37) int local37 = 0; local37 < Static22.anInt596; local37++) {
				@Pc(49) int local49 = local17[local37] * 255 >> 12 & 0xFF;
				@Pc(58) int local58 = this.anInt653 * local23[local37] >> 12;
				@Pc(66) int local66 = local58 * Static147.anIntArray366[local49] >> 12;
				@Pc(74) int local74 = Static14.anInt436 & (local66 >> 12) + arg0;
				@Pc(82) int local82 = Static185.anIntArray441[local49] * local58 >> 12;
				@Pc(91) int local91 = local37 + (local82 >> 12) & Static28.anInt833;
				@Pc(97) int[][] local97 = this.method3390(local74, 0);
				local27[local37] = local97[0][local91];
				local31[local37] = local97[1][local91];
				local35[local37] = local97[2][local91];
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IILclient!fa;)V")
	@Override
	public void method3393(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub9 arg1) {
		if (arg0 == 0) {
			this.anInt653 = arg1.method1280() << 4;
		} else if (arg0 == 1) {
			super.aBoolean173 = arg1.method1234() == 1;
		}
	}
}
