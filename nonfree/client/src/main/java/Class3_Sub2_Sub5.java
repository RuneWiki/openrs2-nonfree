import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cj")
public final class Class3_Sub2_Sub5 extends Class3_Sub2 {

	@OriginalMember(owner = "client!cj", name = "E", descriptor = "I")
	private int anInt1432 = 32768;

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub5() {
		super(3, false);
	}

	@OriginalMember(owner = "client!cj", name = "c", descriptor = "(I)V")
	@Override
	public void method8332() {
		Static468.method6978();
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8331(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass214_41.method5655(arg0);
		if (super.aClass214_41.aBoolean577) {
			@Pc(29) int[] local29 = this.method8340(arg0, 1);
			@Pc(35) int[] local35 = this.method8340(arg0, 2);
			@Pc(39) int[] local39 = local19[0];
			@Pc(43) int[] local43 = local19[1];
			@Pc(47) int[] local47 = local19[2];
			for (@Pc(49) int local49 = 0; local49 < Static164.anInt8839; local49++) {
				@Pc(61) int local61 = local29[local49] * 255 >> 12 & 0xFF;
				@Pc(70) int local70 = local35[local49] * this.anInt1432 >> 12;
				@Pc(78) int local78 = Static365.anIntArray410[local61] * local70 >> 12;
				@Pc(86) int local86 = local70 * Static8.anIntArray7[local61] >> 12;
				@Pc(94) int local94 = (local78 >> 12) + local49 & Static52.anInt1120;
				@Pc(102) int local102 = arg0 + (local86 >> 12) & Static46.anInt1029;
				@Pc(108) int[][] local108 = this.method8337(0, local102);
				local39[local49] = local108[0][local94];
				local43[local49] = local108[1][local94];
				local47[local49] = local108[2][local94];
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IBLclient!tn;)V")
	@Override
	public void method8335(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub15 arg1) {
		if (arg0 == 0) {
			this.anInt1432 = arg1.method8414() << 4;
		} else if (arg0 == 1) {
			super.aBoolean855 = arg1.method8401() == 1;
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8336(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass330_41.method7983(arg0);
		if (super.aClass330_41.aBoolean806) {
			@Pc(29) int[] local29 = this.method8340(arg0, 1);
			@Pc(35) int[] local35 = this.method8340(arg0, 2);
			for (@Pc(37) int local37 = 0; local37 < Static164.anInt8839; local37++) {
				@Pc(47) int local47 = local29[local37] >> 4 & 0xFF;
				@Pc(56) int local56 = this.anInt1432 * local35[local37] >> 12;
				@Pc(64) int local64 = Static365.anIntArray410[local47] * local56 >> 12;
				@Pc(72) int local72 = local56 * Static8.anIntArray7[local47] >> 12;
				@Pc(80) int local80 = Static52.anInt1120 & local37 + (local64 >> 12);
				@Pc(88) int local88 = (local72 >> 12) + arg0 & Static46.anInt1029;
				@Pc(94) int[] local94 = this.method8340(local88, 0);
				local19[local37] = local94[local80];
			}
		}
		return local19;
	}
}
