import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lj")
public final class Class1_Sub4_Sub19 extends Class1_Sub4 {

	@OriginalMember(owner = "client!lj", name = "C", descriptor = "I")
	private int anInt4080 = 32768;

	@OriginalMember(owner = "client!lj", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub19() {
		super(3, false);
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5957(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass15_41.method508(arg0);
		if (super.aClass15_41.aBoolean17) {
			@Pc(26) int[] local26 = this.method5958(arg0, 1);
			@Pc(32) int[] local32 = this.method5958(arg0, 2);
			for (@Pc(34) int local34 = 0; local34 < Static66.anInt1511; local34++) {
				@Pc(44) int local44 = local26[local34] >> 4 & 0xFF;
				@Pc(53) int local53 = this.anInt4080 * local32[local34] >> 12;
				@Pc(61) int local61 = Static268.anIntArray411[local44] * local53 >> 12;
				@Pc(69) int local69 = local53 * Static390.anIntArray570[local44] >> 12;
				@Pc(78) int local78 = local34 + (local61 >> 12) & Static393.anInt6315;
				@Pc(87) int local87 = arg0 + (local69 >> 12) & Static67.anInt1514;
				@Pc(93) int[] local93 = this.method5958(local87, 0);
				local16[local34] = local93[local78];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(BILclient!hp;)V")
	@Override
	public void method5949(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub5 arg1) {
		if (arg0 == 0) {
			this.anInt4080 = arg1.method5362() << 4;
		} else if (arg0 == 1) {
			super.aBoolean501 = arg1.method5366() == 1;
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(B)V")
	@Override
	public void method5950() {
		Static170.method2715();
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5951(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass34_41.method823(arg0);
		if (super.aClass34_41.aBoolean47) {
			@Pc(29) int[] local29 = this.method5958(arg0, 1);
			@Pc(35) int[] local35 = this.method5958(arg0, 2);
			@Pc(39) int[] local39 = local19[0];
			@Pc(43) int[] local43 = local19[1];
			@Pc(47) int[] local47 = local19[2];
			for (@Pc(49) int local49 = 0; local49 < Static66.anInt1511; local49++) {
				@Pc(61) int local61 = local29[local49] * 255 >> 12 & 0xFF;
				@Pc(70) int local70 = this.anInt4080 * local35[local49] >> 12;
				@Pc(78) int local78 = Static268.anIntArray411[local61] * local70 >> 12;
				@Pc(86) int local86 = local70 * Static390.anIntArray570[local61] >> 12;
				@Pc(94) int local94 = Static393.anInt6315 & (local78 >> 12) + local49;
				@Pc(102) int local102 = Static67.anInt1514 & (local86 >> 12) + arg0;
				@Pc(108) int[][] local108 = this.method5956(local102, 0);
				local39[local49] = local108[0][local94];
				local43[local49] = local108[1][local94];
				local47[local49] = local108[2][local94];
			}
		}
		return local19;
	}
}
