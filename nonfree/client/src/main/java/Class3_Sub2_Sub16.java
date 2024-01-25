import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ir")
public final class Class3_Sub2_Sub16 extends Class3_Sub2 {

	@OriginalMember(owner = "client!ir", name = "F", descriptor = "I")
	private int anInt4925 = 32768;

	@OriginalMember(owner = "client!ir", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub16() {
		super(3, false);
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8664(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass84_41.method2125(arg0);
		if (super.aClass84_41.aBoolean201) {
			@Pc(27) int[] local27 = this.method8669(arg0, 1);
			@Pc(33) int[] local33 = this.method8669(arg0, 2);
			for (@Pc(35) int local35 = 0; local35 < Static201.anInt3738; local35++) {
				@Pc(45) int local45 = local27[local35] >> 4 & 0xFF;
				@Pc(54) int local54 = this.anInt4925 * local33[local35] >> 12;
				@Pc(62) int local62 = local54 * Static57.anIntArray535[local45] >> 12;
				@Pc(70) int local70 = Static44.anIntArray55[local45] * local54 >> 12;
				@Pc(78) int local78 = (local62 >> 12) + local35 & Static201.anInt3740;
				@Pc(86) int local86 = (local70 >> 12) + arg0 & Static575.anInt9412;
				@Pc(92) int[] local92 = this.method8669(local86, 0);
				local17[local35] = local92[local78];
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lclient!dc;II)V")
	@Override
	public void method8663(@OriginalArg(0) Class3_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4925 = arg0.method5610() << 4;
		} else if (arg1 == 1) {
			super.aBoolean778 = arg0.method5633() == 1;
		}
	}

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "(I)V")
	@Override
	public void method8673() {
		Static3.method41();
	}

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8665(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass296_41.method7238(arg0);
		if (super.aClass296_41.aBoolean608) {
			@Pc(29) int[] local29 = this.method8669(arg0, 1);
			@Pc(35) int[] local35 = this.method8669(arg0, 2);
			@Pc(39) int[] local39 = local11[0];
			@Pc(43) int[] local43 = local11[1];
			@Pc(47) int[] local47 = local11[2];
			for (@Pc(49) int local49 = 0; local49 < Static201.anInt3738; local49++) {
				@Pc(61) int local61 = local29[local49] * 255 >> 12 & 0xFF;
				@Pc(70) int local70 = local35[local49] * this.anInt4925 >> 12;
				@Pc(78) int local78 = Static57.anIntArray535[local61] * local70 >> 12;
				@Pc(86) int local86 = local70 * Static44.anIntArray55[local61] >> 12;
				@Pc(94) int local94 = local49 + (local78 >> 12) & Static201.anInt3740;
				@Pc(102) int local102 = Static575.anInt9412 & (local86 >> 12) + arg0;
				@Pc(108) int[][] local108 = this.method8672(0, local102);
				local39[local49] = local108[0][local94];
				local43[local49] = local108[1][local94];
				local47[local49] = local108[2][local94];
			}
		}
		return local11;
	}
}
