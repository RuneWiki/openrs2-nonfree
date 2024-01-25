import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public final class Class2_Sub3_Sub30 extends Class2_Sub3 {

	@OriginalMember(owner = "client!ta", name = "J", descriptor = "I")
	private int anInt6070 = 1;

	@OriginalMember(owner = "client!ta", name = "K", descriptor = "I")
	private int anInt6071 = 1;

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub30() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5702(@OriginalArg(1) int arg0) {
		@Pc(15) int[][] local15 = super.aClass90_41.method2391(arg0);
		if (super.aClass90_41.aBoolean257) {
			@Pc(35) int local35 = this.anInt6071 + this.anInt6071 + 1;
			@Pc(39) int local39 = 65536 / local35;
			@Pc(47) int local47 = this.anInt6070 + this.anInt6070 + 1;
			@Pc(51) int local51 = 65536 / local47;
			@Pc(54) int[][][] local54 = new int[local35][][];
			@Pc(78) int local78;
			@Pc(80) int local80;
			for (@Pc(60) int local60 = arg0 - this.anInt6071; local60 <= arg0 + this.anInt6071; local60++) {
				@Pc(70) int[][] local70 = this.method5707(Static241.anInt5135 & local60, 0);
				@Pc(74) int[][] local74 = new int[3][Static263.anInt5504];
				@Pc(76) int local76 = 0;
				local78 = 0;
				local80 = 0;
				@Pc(84) int[] local84 = local70[0];
				@Pc(88) int[] local88 = local70[1];
				@Pc(92) int[] local92 = local70[2];
				for (@Pc(96) int local96 = -this.anInt6070; local96 <= this.anInt6070; local96++) {
					@Pc(102) int local102 = local96 & Static171.anInt3863;
					local78 += local88[local102];
					local76 += local84[local102];
					local80 += local92[local102];
				}
				@Pc(133) int[] local133 = local74[0];
				@Pc(137) int[] local137 = local74[1];
				@Pc(141) int[] local141 = local74[2];
				@Pc(143) int local143 = 0;
				while (Static263.anInt5504 > local143) {
					local133[local143] = local76 * local51 >> 16;
					local137[local143] = local78 * local51 >> 16;
					local141[local143] = local51 * local80 >> 16;
					@Pc(177) int local177 = local143 - this.anInt6070 & Static171.anInt3863;
					local78 -= local88[local177];
					local143++;
					local76 -= local84[local177];
					local80 -= local92[local177];
					@Pc(204) int local204 = Static171.anInt3863 & local143 + this.anInt6070;
					local76 += local84[local204];
					local80 += local92[local204];
					local78 += local88[local204];
				}
				local54[local60 + this.anInt6071 - arg0] = local74;
			}
			@Pc(249) int[] local249 = local15[0];
			@Pc(253) int[] local253 = local15[1];
			@Pc(257) int[] local257 = local15[2];
			for (local78 = 0; local78 < Static263.anInt5504; local78++) {
				local80 = 0;
				@Pc(265) int local265 = 0;
				@Pc(267) int local267 = 0;
				for (@Pc(269) int local269 = 0; local269 < local35; local269++) {
					@Pc(275) int[][] local275 = local54[local269];
					local265 += local275[1][local78];
					local267 += local275[2][local78];
					local80 += local275[0][local78];
				}
				local249[local78] = local80 * local39 >> 16;
				local253[local78] = local265 * local39 >> 16;
				local257[local78] = local267 * local39 >> 16;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IILclient!ef;)V")
	@Override
	public void method5704(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub12 arg1) {
		if (arg0 == 0) {
			this.anInt6070 = arg1.method3124();
		} else if (arg0 == 1) {
			this.anInt6071 = arg1.method3124();
		} else if (arg0 == 2) {
			super.aBoolean606 = arg1.method3124() == 1;
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5699(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass137_41.method3984(arg0);
		if (super.aClass137_41.aBoolean400) {
			@Pc(28) int local28 = this.anInt6071 + this.anInt6071 + 1;
			@Pc(32) int local32 = 65536 / local28;
			@Pc(41) int local41 = this.anInt6070 + this.anInt6070 + 1;
			@Pc(45) int local45 = 65536 / local41;
			@Pc(48) int[][] local48 = new int[local28][];
			@Pc(71) int local71;
			for (@Pc(54) int local54 = arg0 - this.anInt6071; local54 <= this.anInt6071 + arg0; local54++) {
				@Pc(66) int[] local66 = this.method5700(0, Static241.anInt5135 & local54);
				@Pc(69) int[] local69 = new int[Static263.anInt5504];
				local71 = 0;
				for (@Pc(75) int local75 = -this.anInt6070; local75 <= this.anInt6070; local75++) {
					local71 += local66[Static171.anInt3863 & local75];
				}
				@Pc(96) int local96 = 0;
				while (Static263.anInt5504 > local96) {
					local69[local96] = local71 * local45 >> 16;
					local71 -= local66[local96 - this.anInt6070 & Static171.anInt3863];
					local96++;
					local71 += local66[this.anInt6070 + local96 & Static171.anInt3863];
				}
				local48[this.anInt6071 + local54 - arg0] = local69;
			}
			for (@Pc(159) int local159 = 0; local159 < Static263.anInt5504; local159++) {
				@Pc(163) int local163 = 0;
				for (local71 = 0; local71 < local28; local71++) {
					local163 += local48[local71][local159];
				}
				local16[local159] = local163 * local32 >> 16;
			}
		}
		return local16;
	}
}
