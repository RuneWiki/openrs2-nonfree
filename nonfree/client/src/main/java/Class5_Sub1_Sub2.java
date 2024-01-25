import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cha")
public final class Class5_Sub1_Sub2 extends Class5_Sub1 {

	@OriginalMember(owner = "client!cha", name = "C", descriptor = "I")
	private int anInt1186 = 32768;

	@OriginalMember(owner = "client!cha", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub2() {
		super(3, false);
	}

	@OriginalMember(owner = "client!cha", name = "a", descriptor = "(I)V")
	@Override
	public void method9204() {
		Static19.method298();
	}

	@OriginalMember(owner = "client!cha", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method9212(@OriginalArg(1) int arg0) {
		@Pc(21) int[] local21 = super.aClass83_41.method1414((byte) -64, arg0);
		if (super.aClass83_41.aBoolean148) {
			@Pc(31) int[] local31 = this.method9210(1, arg0);
			@Pc(37) int[] local37 = this.method9210(2, arg0);
			for (@Pc(39) int local39 = 0; local39 < Static648.anInt9588; local39++) {
				@Pc(49) int local49 = local31[local39] >> 4 & 0xFF;
				@Pc(58) int local58 = local37[local39] * this.anInt1186 >> 12;
				@Pc(66) int local66 = Static633.anIntArray577[local49] * local58 >> 12;
				@Pc(74) int local74 = local58 * Static19.anIntArray23[local49] >> 12;
				@Pc(83) int local83 = Static116.anInt3312 & local39 + (local66 >> 12);
				@Pc(91) int local91 = arg0 + (local74 >> 12) & Static542.anInt9254;
				@Pc(97) int[] local97 = this.method9210(0, local91);
				local21[local39] = local97[local83];
			}
		}
		return local21;
	}

	@OriginalMember(owner = "client!cha", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method9205(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = super.aClass307_41.method7497(arg0);
		if (super.aClass307_41.aBoolean662) {
			@Pc(27) int[] local27 = this.method9210(1, arg0);
			@Pc(33) int[] local33 = this.method9210(2, arg0);
			@Pc(37) int[] local37 = local17[0];
			@Pc(41) int[] local41 = local17[1];
			@Pc(45) int[] local45 = local17[2];
			for (@Pc(47) int local47 = 0; local47 < Static648.anInt9588; local47++) {
				@Pc(59) int local59 = local27[local47] * 255 >> 12 & 0xFF;
				@Pc(68) int local68 = local33[local47] * this.anInt1186 >> 12;
				@Pc(76) int local76 = Static633.anIntArray577[local59] * local68 >> 12;
				@Pc(84) int local84 = local68 * Static19.anIntArray23[local59] >> 12;
				@Pc(93) int local93 = Static116.anInt3312 & local47 + (local76 >> 12);
				@Pc(102) int local102 = Static542.anInt9254 & arg0 + (local84 >> 12);
				@Pc(108) int[][] local108 = this.method9203(0, local102);
				local37[local47] = local108[0][local93];
				local41[local47] = local108[1][local93];
				local45[local47] = local108[2][local93];
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!cha", name = "a", descriptor = "(BILclient!ib;)V")
	@Override
	public void method9209(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub23 arg1) {
		if (arg0 == 0) {
			this.anInt1186 = arg1.method8519() << 4;
		} else if (arg0 == 1) {
			super.aBoolean786 = arg1.method8529() == 1;
		}
	}
}
