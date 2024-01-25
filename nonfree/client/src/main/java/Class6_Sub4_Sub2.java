import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ao")
public final class Class6_Sub4_Sub2 extends Class6_Sub4 {

	@OriginalMember(owner = "client!ao", name = "E", descriptor = "I")
	private int anInt541 = 32768;

	@OriginalMember(owner = "client!ao", name = "<init>", descriptor = "()V")
	public Class6_Sub4_Sub2() {
		super(3, false);
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7753(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass187_41.method4558(arg0);
		if (super.aClass187_41.aBoolean374) {
			@Pc(21) int[] local21 = this.method7748(1, arg0);
			@Pc(27) int[] local27 = this.method7748(2, arg0);
			for (@Pc(29) int local29 = 0; local29 < Static408.anInt7209; local29++) {
				@Pc(39) int local39 = local21[local29] >> 4 & 0xFF;
				@Pc(48) int local48 = this.anInt541 * local27[local29] >> 12;
				@Pc(56) int local56 = Static300.anIntArray410[local39] * local48 >> 12;
				@Pc(64) int local64 = Static435.anIntArray543[local39] * local48 >> 12;
				@Pc(73) int local73 = local29 + (local56 >> 12) & Static368.anInt6505;
				@Pc(82) int local82 = Static457.anInt7873 & arg0 + (local64 >> 12);
				@Pc(88) int[] local88 = this.method7748(0, local82);
				local11[local29] = local88[local73];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(B)V")
	@Override
	public void method7754() {
		Static571.method7641();
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IILclient!ji;)V")
	@Override
	public void method7750(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub21 arg1) {
		if (arg0 == 0) {
			this.anInt541 = arg1.method6003() << 4;
		} else if (arg0 == 1) {
			super.aBoolean728 = arg1.method6069() == 1;
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7757(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass27_41.method911(arg0);
		if (super.aClass27_41.aBoolean54) {
			@Pc(29) int[] local29 = this.method7748(1, arg0);
			@Pc(35) int[] local35 = this.method7748(2, arg0);
			@Pc(39) int[] local39 = local19[0];
			@Pc(43) int[] local43 = local19[1];
			@Pc(47) int[] local47 = local19[2];
			for (@Pc(49) int local49 = 0; local49 < Static408.anInt7209; local49++) {
				@Pc(61) int local61 = local29[local49] * 255 >> 12 & 0xFF;
				@Pc(70) int local70 = this.anInt541 * local35[local49] >> 12;
				@Pc(78) int local78 = local70 * Static300.anIntArray410[local61] >> 12;
				@Pc(86) int local86 = local70 * Static435.anIntArray543[local61] >> 12;
				@Pc(94) int local94 = local49 + (local78 >> 12) & Static368.anInt6505;
				@Pc(103) int local103 = arg0 + (local86 >> 12) & Static457.anInt7873;
				@Pc(109) int[][] local109 = this.method7747(local103, 0);
				local39[local49] = local109[0][local94];
				local43[local49] = local109[1][local94];
				local47[local49] = local109[2][local94];
			}
		}
		return local19;
	}
}
