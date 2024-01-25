import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wj")
public final class Class8_Sub2_Sub38 extends Class8_Sub2 {

	@OriginalMember(owner = "client!wj", name = "H", descriptor = "I")
	private int anInt10531 = 32768;

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "()V")
	public Class8_Sub2_Sub38() {
		super(3, false);
	}

	@OriginalMember(owner = "client!wj", name = "c", descriptor = "(B)V")
	@Override
	public void method8508() {
		Static282.method4762();
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method8500(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass269_41.method6817(arg0);
		if (super.aClass269_41.aBoolean591) {
			@Pc(29) int[] local29 = this.method8505(arg0, 1);
			@Pc(35) int[] local35 = this.method8505(arg0, 2);
			@Pc(39) int[] local39 = local19[0];
			@Pc(43) int[] local43 = local19[1];
			@Pc(47) int[] local47 = local19[2];
			for (@Pc(49) int local49 = 0; local49 < Static538.anInt9297; local49++) {
				@Pc(61) int local61 = local29[local49] * 255 >> 12 & 0xFF;
				@Pc(70) int local70 = local35[local49] * this.anInt10531 >> 12;
				@Pc(78) int local78 = local70 * Static308.anIntArray360[local61] >> 12;
				@Pc(86) int local86 = local70 * Static246.anIntArray317[local61] >> 12;
				@Pc(94) int local94 = (local78 >> 12) + local49 & Static263.anInt5634;
				@Pc(102) int local102 = Static17.anInt866 & (local86 >> 12) + arg0;
				@Pc(108) int[][] local108 = this.method8510(0, local102);
				local39[local49] = local108[0][local94];
				local43[local49] = local108[1][local94];
				local47[local49] = local108[2][local94];
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(ILclient!ig;Z)V")
	@Override
	public void method8501(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt10531 = arg1.method8578() << 4;
		} else if (arg0 == 1) {
			super.aBoolean753 = arg1.method8525() == 1;
		}
	}

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method8507(@OriginalArg(1) int arg0) {
		@Pc(20) int[] local20 = super.aClass50_41.method1685(arg0);
		if (super.aClass50_41.aBoolean135) {
			@Pc(30) int[] local30 = this.method8505(arg0, 1);
			@Pc(36) int[] local36 = this.method8505(arg0, 2);
			for (@Pc(38) int local38 = 0; local38 < Static538.anInt9297; local38++) {
				@Pc(48) int local48 = local30[local38] >> 4 & 0xFF;
				@Pc(57) int local57 = this.anInt10531 * local36[local38] >> 12;
				@Pc(65) int local65 = Static308.anIntArray360[local48] * local57 >> 12;
				@Pc(73) int local73 = local57 * Static246.anIntArray317[local48] >> 12;
				@Pc(81) int local81 = (local65 >> 12) + local38 & Static263.anInt5634;
				@Pc(90) int local90 = Static17.anInt866 & arg0 + (local73 >> 12);
				@Pc(96) int[] local96 = this.method8505(local90, 0);
				local20[local38] = local96[local81];
			}
		}
		return local20;
	}
}
