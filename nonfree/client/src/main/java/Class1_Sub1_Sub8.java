import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gf")
public final class Class1_Sub1_Sub8 extends Class1_Sub1 {

	@OriginalMember(owner = "client!gf", name = "S", descriptor = "I")
	private int anInt2022 = 32768;

	@OriginalMember(owner = "client!gf", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub8() {
		super(3, false);
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method4749(@OriginalArg(0) int arg0) {
		@Pc(15) int[][] local15 = this.aClass70_41.method1662(arg0);
		if (this.aClass70_41.aBoolean118) {
			@Pc(29) int[] local29 = this.method4746(1, arg0);
			@Pc(35) int[] local35 = this.method4746(2, arg0);
			@Pc(39) int[] local39 = local15[0];
			@Pc(43) int[] local43 = local15[2];
			@Pc(47) int[] local47 = local15[1];
			for (@Pc(49) int local49 = 0; local49 < Static75.anInt1848; local49++) {
				@Pc(62) int local62 = local29[local49] * 255 >> 12 & 0xFF;
				@Pc(71) int local71 = local35[local49] * this.anInt2022 >> 12;
				@Pc(79) int local79 = local71 * Static74.anIntArray191[local62] >> 12;
				@Pc(87) int local87 = Static179.anIntArray362[local62] * local71 >> 12;
				@Pc(95) int local95 = Static145.anInt3482 & local49 + (local79 >> 12);
				@Pc(103) int local103 = (local87 >> 12) + arg0 & Static178.anInt4007;
				@Pc(109) int[][] local109 = this.method4758(0, local103);
				local39[local49] = local109[0][local95];
				local47[local49] = local109[1][local95];
				local43[local49] = local109[2][local95];
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!gf", name = "d", descriptor = "(B)V")
	@Override
	public void method4756() {
		Static39.method882();
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(ZI)[I")
	@Override
	public int[] method4757(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = this.aClass114_41.method3364(arg0);
		if (this.aClass114_41.aBoolean211) {
			@Pc(21) int[] local21 = this.method4746(1, arg0);
			@Pc(27) int[] local27 = this.method4746(2, arg0);
			for (@Pc(29) int local29 = 0; local29 < Static75.anInt1848; local29++) {
				@Pc(44) int local44 = local21[local29] >> 4 & 0xFF;
				@Pc(53) int local53 = local27[local29] * this.anInt2022 >> 12;
				@Pc(61) int local61 = local53 * Static74.anIntArray191[local44] >> 12;
				@Pc(69) int local69 = (local61 >> 12) + local29 & Static145.anInt3482;
				@Pc(77) int local77 = Static179.anIntArray362[local44] * local53 >> 12;
				@Pc(86) int local86 = Static178.anInt4007 & arg0 + (local77 >> 12);
				@Pc(92) int[] local92 = this.method4746(0, local86);
				local11[local29] = local92[local69];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(BLclient!im;I)V")
	@Override
	public void method4760(@OriginalArg(1) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2022 = arg0.method2652() << 4;
		} else if (arg1 == 1) {
			this.aBoolean324 = arg0.method2655() == 1;
		}
	}
}
