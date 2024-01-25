import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gfa")
public final class Class135 implements Interface3 {

	@OriginalMember(owner = "client!gfa", name = "m", descriptor = "Lclient!vd;")
	private final Class378 aClass378_2 = new Class378(256);

	@OriginalMember(owner = "client!gfa", name = "o", descriptor = "Lclient!nca;")
	private final Class254 aClass254_73;

	@OriginalMember(owner = "client!gfa", name = "h", descriptor = "Lclient!nca;")
	private final Class254 aClass254_74;

	@OriginalMember(owner = "client!gfa", name = "n", descriptor = "I")
	private final int anInt3288;

	@OriginalMember(owner = "client!gfa", name = "g", descriptor = "[Lclient!afa;")
	private final Class8[] aClass8Array1;

	@OriginalMember(owner = "client!gfa", name = "<init>", descriptor = "(Lclient!nca;Lclient!nca;Lclient!nca;)V")
	public Class135(@OriginalArg(0) Class254 arg0, @OriginalArg(1) Class254 arg1, @OriginalArg(2) Class254 arg2) {
		this.aClass254_73 = arg1;
		this.aClass254_74 = arg2;
		@Pc(24) Class2_Sub20 local24 = new Class2_Sub20(arg0.method6087(0, 0));
		this.anInt3288 = local24.method8575();
		this.aClass8Array1 = new Class8[this.anInt3288];
		for (@Pc(36) int local36 = 0; local36 < this.anInt3288; local36++) {
			if (local24.method8581(-17416) == 1) {
				this.aClass8Array1[local36] = new Class8();
			}
		}
		for (@Pc(65) int local65 = 0; local65 < this.anInt3288; local65++) {
			if (this.aClass8Array1[local65] != null) {
				this.aClass8Array1[local65].aBoolean32 = local24.method8581(-17416) == 0;
			}
		}
		for (@Pc(105) int local105 = 0; local105 < this.anInt3288; local105++) {
			if (this.aClass8Array1[local105] != null) {
				this.aClass8Array1[local105].aBoolean28 = local24.method8581(-17416) == 1;
			}
		}
		for (@Pc(143) int local143 = 0; local143 < this.anInt3288; local143++) {
			if (this.aClass8Array1[local143] != null) {
				this.aClass8Array1[local143].aBoolean34 = local24.method8581(-17416) == 1;
			}
		}
		for (@Pc(183) int local183 = 0; local183 < this.anInt3288; local183++) {
			if (this.aClass8Array1[local183] != null) {
				this.aClass8Array1[local183].aByte12 = local24.method8536();
			}
		}
		for (@Pc(211) int local211 = 0; local211 < this.anInt3288; local211++) {
			if (this.aClass8Array1[local211] != null) {
				this.aClass8Array1[local211].aByte13 = local24.method8536();
			}
		}
		for (@Pc(239) int local239 = 0; local239 < this.anInt3288; local239++) {
			if (this.aClass8Array1[local239] != null) {
				this.aClass8Array1[local239].aByte15 = local24.method8536();
			}
		}
		for (@Pc(267) int local267 = 0; local267 < this.anInt3288; local267++) {
			if (this.aClass8Array1[local267] != null) {
				this.aClass8Array1[local267].aByte11 = local24.method8536();
			}
		}
		for (@Pc(295) int local295 = 0; local295 < this.anInt3288; local295++) {
			if (this.aClass8Array1[local295] != null) {
				this.aClass8Array1[local295].aShort10 = (short) local24.method8575();
			}
		}
		for (@Pc(328) int local328 = 0; local328 < this.anInt3288; local328++) {
			if (this.aClass8Array1[local328] != null) {
				this.aClass8Array1[local328].aByte16 = local24.method8536();
			}
		}
		for (@Pc(360) int local360 = 0; local360 < this.anInt3288; local360++) {
			if (this.aClass8Array1[local360] != null) {
				this.aClass8Array1[local360].aByte14 = local24.method8536();
			}
		}
		for (@Pc(388) int local388 = 0; local388 < this.anInt3288; local388++) {
			if (this.aClass8Array1[local388] != null) {
				this.aClass8Array1[local388].aBoolean35 = local24.method8581(-17416) == 1;
			}
		}
		for (@Pc(422) int local422 = 0; local422 < this.anInt3288; local422++) {
			if (this.aClass8Array1[local422] != null) {
				this.aClass8Array1[local422].aBoolean30 = local24.method8581(-17416) == 1;
			}
		}
		for (@Pc(462) int local462 = 0; local462 < this.anInt3288; local462++) {
			if (this.aClass8Array1[local462] != null) {
				this.aClass8Array1[local462].aByte10 = local24.method8536();
			}
		}
		for (@Pc(494) int local494 = 0; local494 < this.anInt3288; local494++) {
			if (this.aClass8Array1[local494] != null) {
				this.aClass8Array1[local494].aBoolean31 = local24.method8581(-17416) == 1;
			}
		}
		for (@Pc(534) int local534 = 0; local534 < this.anInt3288; local534++) {
			if (this.aClass8Array1[local534] != null) {
				this.aClass8Array1[local534].aBoolean33 = local24.method8581(-17416) == 1;
			}
		}
		for (@Pc(570) int local570 = 0; local570 < this.anInt3288; local570++) {
			if (this.aClass8Array1[local570] != null) {
				this.aClass8Array1[local570].aBoolean29 = local24.method8581(-17416) == 1;
			}
		}
		for (@Pc(610) int local610 = 0; local610 < this.anInt3288; local610++) {
			if (this.aClass8Array1[local610] != null) {
				this.aClass8Array1[local610].anInt188 = local24.method8581(-17416);
			}
		}
		for (@Pc(642) int local642 = 0; local642 < this.anInt3288; local642++) {
			if (this.aClass8Array1[local642] != null) {
				this.aClass8Array1[local642].anInt189 = local24.method8555(-9372);
			}
		}
		for (@Pc(674) int local674 = 0; local674 < this.anInt3288; local674++) {
			if (this.aClass8Array1[local674] != null) {
				this.aClass8Array1[local674].anInt186 = local24.method8581(-17416);
			}
		}
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(IIIIZF)[I")
	@Override
	public int[] method2854(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) float arg3) {
		return this.method2859(arg1).method7372(this.aClass254_74, this.aClass8Array1[arg1].aBoolean30, (double) arg3, this, arg0, arg2);
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(II)Lclient!qja;")
	private Class2_Sub6_Sub16 method2859(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub6 local10 = this.aClass378_2.method9118((long) arg0);
		if (local10 != null) {
			return (Class2_Sub6_Sub16) local10;
		}
		@Pc(22) byte[] local22 = this.aClass254_73.method6079(arg0);
		if (local22 == null) {
			return null;
		} else {
			@Pc(35) Class2_Sub6_Sub16 local35 = new Class2_Sub6_Sub16(new Class2_Sub20(local22));
			this.aClass378_2.method9117((long) arg0, local35);
			return local35;
		}
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(ZI)Z")
	@Override
	public boolean method2852(@OriginalArg(1) int arg0) {
		@Pc(16) Class2_Sub6_Sub16 local16 = this.method2859(arg0);
		return local16 != null && local16.method7371(this.aClass254_74, this);
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(IB)Lclient!afa;")
	@Override
	public Class8 method2857(@OriginalArg(0) int arg0) {
		return this.aClass8Array1[arg0];
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(I)I")
	@Override
	public int method2856() {
		return this.anInt3288;
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(FIIIZI)[F")
	@Override
	public float[] method2855(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		return this.method2859(arg3).method7370(arg1, this.aClass8Array1[arg3].aBoolean30, this.aClass254_74, arg2, this);
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(IBFIIZ)[I")
	@Override
	public int[] method2853(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return this.method2859(arg0).method7369(arg3, this.aClass8Array1[arg0].aBoolean30, arg2, this, arg4, (double) arg1, this.aClass254_74);
	}
}
