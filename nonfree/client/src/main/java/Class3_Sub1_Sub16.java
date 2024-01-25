import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mh")
public final class Class3_Sub1_Sub16 extends Class3_Sub1 {

	@OriginalMember(owner = "client!mh", name = "P", descriptor = "I")
	private int anInt6323 = 32768;

	@OriginalMember(owner = "client!mh", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub16() {
		super(3, false);
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IILclient!ika;)V")
	@Override
	public void method9582(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt6323 = arg1.method2028(-14795) << 4;
		} else if (arg0 == 1) {
			super.aBoolean773 = arg1.method2048(255) == 1;
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method9573(@OriginalArg(1) int arg0) {
		@Pc(18) int[] local18 = super.aClass305_41.method6989(arg0);
		if (super.aClass305_41.aBoolean550) {
			@Pc(28) int[] local28 = this.method9577(1, arg0);
			@Pc(36) int[] local36 = this.method9577(2, arg0);
			for (@Pc(38) int local38 = 0; local38 < Static379.anInt5859; local38++) {
				@Pc(48) int local48 = local28[local38] >> 4 & 0xFF;
				@Pc(57) int local57 = this.anInt6323 * local36[local38] >> 12;
				@Pc(65) int local65 = Static523.anIntArray592[local48] * local57 >> 12;
				@Pc(73) int local73 = Static642.anIntArray715[local48] * local57 >> 12;
				@Pc(82) int local82 = Static711.anInt10997 & local38 + (local65 >> 12);
				@Pc(90) int local90 = (local73 >> 12) + arg0 & Static652.anInt2344;
				@Pc(96) int[] local96 = this.method9577(0, local90);
				local18[local38] = local96[local82];
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(BI)[[I")
	@Override
	public int[][] method9580(@OriginalArg(1) int arg0) {
		@Pc(13) int[][] local13 = super.aClass281_41.method6493(arg0);
		if (super.aClass281_41.aBoolean509) {
			@Pc(30) int[] local30 = this.method9577(1, arg0);
			@Pc(36) int[] local36 = this.method9577(2, arg0);
			@Pc(40) int[] local40 = local13[0];
			@Pc(44) int[] local44 = local13[1];
			@Pc(48) int[] local48 = local13[2];
			for (@Pc(50) int local50 = 0; local50 < Static379.anInt5859; local50++) {
				@Pc(62) int local62 = local30[local50] * 255 >> 12 & 0xFF;
				@Pc(71) int local71 = local36[local50] * this.anInt6323 >> 12;
				@Pc(79) int local79 = Static523.anIntArray592[local62] * local71 >> 12;
				@Pc(87) int local87 = local71 * Static642.anIntArray715[local62] >> 12;
				@Pc(95) int local95 = Static711.anInt10997 & local50 + (local79 >> 12);
				@Pc(104) int local104 = arg0 + (local87 >> 12) & Static652.anInt2344;
				@Pc(110) int[][] local110 = this.method9576(local104, 0);
				local40[local50] = local110[0][local95];
				local44[local50] = local110[1][local95];
				local48[local50] = local110[2][local95];
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(B)V")
	@Override
	public void method9578() {
		Static561.method7327();
	}
}
