import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ba")
public final class Class15 {

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "I")
	public int anInt430;

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "Lclient!hk;")
	public Class97 aClass97_1;

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "[I")
	public int[] anIntArray92;

	@OriginalMember(owner = "client!ba", name = "d", descriptor = "[[I")
	public int[][] anIntArrayArray2;

	@OriginalMember(owner = "client!ba", name = "g", descriptor = "[I")
	public int[] anIntArray93;

	@OriginalMember(owner = "client!ba", name = "h", descriptor = "I")
	public int anInt432;

	@OriginalMember(owner = "client!ba", name = "j", descriptor = "[I")
	public int[] anIntArray94;

	@OriginalMember(owner = "client!ba", name = "k", descriptor = "[[I")
	public int[][] anIntArrayArray3;

	@OriginalMember(owner = "client!ba", name = "l", descriptor = "I")
	public int anInt434;

	@OriginalMember(owner = "client!ba", name = "m", descriptor = "[I")
	public int[] anIntArray95;

	@OriginalMember(owner = "client!ba", name = "n", descriptor = "[I")
	public int[] anIntArray96;

	@OriginalMember(owner = "client!ba", name = "o", descriptor = "[I")
	public int[] anIntArray97;

	@OriginalMember(owner = "client!ba", name = "p", descriptor = "[Lclient!hk;")
	public Class97[] aClass97Array1;

	@OriginalMember(owner = "client!ba", name = "f", descriptor = "I")
	public final int anInt431;

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "([BI)V")
	public Class15(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.anInt431 = Static121.method2478(arg0, arg0.length);
		if (arg1 != this.anInt431) {
			throw new RuntimeException();
		}
		this.method343(arg0);
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(B[B)V")
	private void method343(@OriginalArg(1) byte[] arg0) {
		@Pc(12) Class2_Sub16 local12 = new Class2_Sub16(Static225.method3692(arg0));
		@Pc(16) int local16 = local12.method5350();
		if (local16 != 5 && local16 != 6) {
			throw new RuntimeException();
		}
		if (local16 >= 6) {
			this.anInt434 = local12.method5346();
		} else {
			this.anInt434 = 0;
		}
		@Pc(49) int local49 = local12.method5350();
		this.anInt432 = local12.method5312();
		@Pc(56) int local56 = 0;
		@Pc(58) int local58 = -1;
		this.anIntArray96 = new int[this.anInt432];
		for (@Pc(65) int local65 = 0; local65 < this.anInt432; local65++) {
			this.anIntArray96[local65] = local56 += local12.method5312();
			if (local58 < this.anIntArray96[local65]) {
				local58 = this.anIntArray96[local65];
			}
		}
		this.anInt430 = local58 + 1;
		this.anIntArray92 = new int[this.anInt430];
		this.anIntArray97 = new int[this.anInt430];
		this.anIntArray93 = new int[this.anInt430];
		this.anIntArray95 = new int[this.anInt430];
		this.anIntArrayArray2 = new int[this.anInt430][];
		@Pc(143) int local143;
		@Pc(157) int local157;
		if (local49 != 0) {
			this.anIntArray94 = new int[this.anInt430];
			for (local143 = 0; local143 < this.anInt430; local143++) {
				this.anIntArray94[local143] = -1;
			}
			for (local157 = 0; local157 < this.anInt432; local157++) {
				this.anIntArray94[this.anIntArray96[local157]] = local12.method5346();
			}
			this.aClass97_1 = new Class97(this.anIntArray94);
		}
		for (local143 = 0; local143 < this.anInt432; local143++) {
			this.anIntArray97[this.anIntArray96[local143]] = local12.method5346();
		}
		for (local157 = 0; local157 < this.anInt432; local157++) {
			this.anIntArray93[this.anIntArray96[local157]] = local12.method5346();
		}
		for (@Pc(229) int local229 = 0; local229 < this.anInt432; local229++) {
			this.anIntArray95[this.anIntArray96[local229]] = local12.method5312();
		}
		@Pc(259) int local259;
		@Pc(266) int local266;
		@Pc(274) int local274;
		@Pc(276) int local276;
		@Pc(293) int local293;
		for (@Pc(252) int local252 = 0; local252 < this.anInt432; local252++) {
			local259 = this.anIntArray96[local252];
			local56 = 0;
			local266 = this.anIntArray95[local259];
			this.anIntArrayArray2[local259] = new int[local266];
			local274 = -1;
			for (local276 = 0; local276 < local266; local276++) {
				local293 = this.anIntArrayArray2[local259][local276] = local56 += local12.method5312();
				if (local274 < local293) {
					local274 = local293;
				}
			}
			this.anIntArray92[local259] = local274 + 1;
			if (local266 == local274 + 1) {
				this.anIntArrayArray2[local259] = null;
			}
		}
		if (local49 == 0) {
			return;
		}
		this.anIntArrayArray3 = new int[local58 + 1][];
		this.aClass97Array1 = new Class97[local58 + 1];
		for (local259 = 0; local259 < this.anInt432; local259++) {
			local266 = this.anIntArray96[local259];
			local274 = this.anIntArray95[local266];
			this.anIntArrayArray3[local266] = new int[this.anIntArray92[local266]];
			for (local276 = 0; local276 < this.anIntArray92[local266]; local276++) {
				this.anIntArrayArray3[local266][local276] = -1;
			}
			for (local293 = 0; local293 < local274; local293++) {
				@Pc(402) int local402;
				if (this.anIntArrayArray2[local266] == null) {
					local402 = local293;
				} else {
					local402 = this.anIntArrayArray2[local266][local293];
				}
				this.anIntArrayArray3[local266][local402] = local12.method5346();
			}
			this.aClass97Array1[local266] = new Class97(this.anIntArrayArray3[local266]);
		}
	}
}
