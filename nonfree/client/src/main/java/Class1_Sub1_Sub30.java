import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qda")
public final class Class1_Sub1_Sub30 extends Class1_Sub1 {

	@OriginalMember(owner = "client!qda", name = "P", descriptor = "I")
	private int anInt7349 = 32768;

	@OriginalMember(owner = "client!qda", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub30() {
		super(3, false);
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method7705(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass46_41.method856(arg0);
		if (super.aClass46_41.aBoolean76) {
			@Pc(27) int[] local27 = this.method7709(arg0, 1);
			@Pc(35) int[] local35 = this.method7709(arg0, 2);
			@Pc(39) int[] local39 = local11[0];
			@Pc(43) int[] local43 = local11[1];
			@Pc(47) int[] local47 = local11[2];
			for (@Pc(49) int local49 = 0; local49 < Static279.anInt4906; local49++) {
				@Pc(61) int local61 = local27[local49] * 255 >> 12 & 0xFF;
				@Pc(70) int local70 = local35[local49] * this.anInt7349 >> 12;
				@Pc(78) int local78 = local70 * Static359.anIntArray435[local61] >> 12;
				@Pc(86) int local86 = local70 * Static508.anIntArray651[local61] >> 12;
				@Pc(94) int local94 = local49 + (local78 >> 12) & Static216.anInt4134;
				@Pc(102) int local102 = Static171.anInt3020 & arg0 + (local86 >> 12);
				@Pc(108) int[][] local108 = this.method7700(local102, 0);
				local39[local49] = local108[0][local94];
				local43[local49] = local108[1][local94];
				local47[local49] = local108[2][local94];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(ILclient!mo;I)V")
	@Override
	public void method7708(@OriginalArg(1) Class1_Sub35 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt7349 = arg0.method5771() << 4;
		} else if (arg1 == 1) {
			super.aBoolean737 = arg0.method5750() == 1;
		}
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(I)V")
	@Override
	public void method7699() {
		Static499.method3357();
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method7706(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass223_41.method4438(arg0);
		if (super.aClass223_41.aBoolean442) {
			@Pc(29) int[] local29 = this.method7709(arg0, 1);
			@Pc(35) int[] local35 = this.method7709(arg0, 2);
			for (@Pc(37) int local37 = 0; local37 < Static279.anInt4906; local37++) {
				@Pc(47) int local47 = local29[local37] >> 4 & 0xFF;
				@Pc(56) int local56 = local35[local37] * this.anInt7349 >> 12;
				@Pc(64) int local64 = Static359.anIntArray435[local47] * local56 >> 12;
				@Pc(72) int local72 = local56 * Static508.anIntArray651[local47] >> 12;
				@Pc(80) int local80 = (local64 >> 12) + local37 & Static216.anInt4134;
				@Pc(88) int local88 = Static171.anInt3020 & (local72 >> 12) + arg0;
				@Pc(94) int[] local94 = this.method7709(local88, 0);
				local19[local37] = local94[local80];
			}
		}
		return local19;
	}
}
