import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bj")
public final class Class37 {

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "[I")
	public int[] anIntArray86;

	@OriginalMember(owner = "client!bj", name = "c", descriptor = "Lclient!ica;")
	public Class150 aClass150_1;

	@OriginalMember(owner = "client!bj", name = "g", descriptor = "[I")
	public int[] anIntArray87;

	@OriginalMember(owner = "client!bj", name = "h", descriptor = "[I")
	public int[] anIntArray88;

	@OriginalMember(owner = "client!bj", name = "i", descriptor = "[[B")
	public byte[][] aByteArrayArray3;

	@OriginalMember(owner = "client!bj", name = "j", descriptor = "[[I")
	public int[][] anIntArrayArray5;

	@OriginalMember(owner = "client!bj", name = "k", descriptor = "[I")
	public int[] anIntArray89;

	@OriginalMember(owner = "client!bj", name = "l", descriptor = "[I")
	public int[] anIntArray90;

	@OriginalMember(owner = "client!bj", name = "m", descriptor = "I")
	public int anInt1033;

	@OriginalMember(owner = "client!bj", name = "n", descriptor = "I")
	public int anInt1034;

	@OriginalMember(owner = "client!bj", name = "p", descriptor = "[I")
	public int[] anIntArray91;

	@OriginalMember(owner = "client!bj", name = "q", descriptor = "[Lclient!ica;")
	public Class150[] aClass150Array1;

	@OriginalMember(owner = "client!bj", name = "t", descriptor = "[[I")
	public int[][] anIntArrayArray6;

	@OriginalMember(owner = "client!bj", name = "v", descriptor = "I")
	public int anInt1038;

	@OriginalMember(owner = "client!bj", name = "d", descriptor = "I")
	public final int anInt1032;

	@OriginalMember(owner = "client!bj", name = "e", descriptor = "[B")
	private byte[] aByteArray7;

	@OriginalMember(owner = "client!bj", name = "<init>", descriptor = "([BI[B)V")
	public Class37(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		this.anInt1032 = Static396.method5593(arg0.length, arg0);
		if (arg1 != this.anInt1032) {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			if (arg2.length != 64) {
				throw new RuntimeException();
			}
			this.aByteArray7 = Static492.method7091(0, arg0, arg0.length);
			for (@Pc(44) int local44 = 0; local44 < 64; local44++) {
				if (this.aByteArray7[local44] != arg2[local44]) {
					throw new RuntimeException();
				}
			}
		}
		this.method1110(arg0);
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "([BI)V")
	private void method1110(@OriginalArg(0) byte[] arg0) {
		@Pc(12) Class3_Sub25 local12 = new Class3_Sub25(Static482.method7009(arg0));
		@Pc(16) int local16 = local12.method8632();
		if (local16 < 5 || local16 > 6) {
			throw new RuntimeException();
		}
		if (local16 >= 6) {
			this.anInt1034 = local12.method8618();
		} else {
			this.anInt1034 = 0;
		}
		@Pc(47) int local47 = local12.method8632();
		@Pc(55) boolean local55 = (local47 & 0x1) != 0;
		@Pc(63) boolean local63 = (local47 & 0x2) != 0;
		this.anInt1038 = local12.method8593();
		@Pc(70) int local70 = 0;
		@Pc(72) int local72 = -1;
		this.anIntArray89 = new int[this.anInt1038];
		for (@Pc(79) int local79 = 0; local79 < this.anInt1038; local79++) {
			this.anIntArray89[local79] = local70 += local12.method8593();
			if (local72 < this.anIntArray89[local79]) {
				local72 = this.anIntArray89[local79];
			}
		}
		this.anInt1033 = local72 + 1;
		if (local63) {
			this.aByteArrayArray3 = new byte[this.anInt1033][];
		}
		this.anIntArray87 = new int[this.anInt1033];
		this.anIntArray88 = new int[this.anInt1033];
		this.anIntArray91 = new int[this.anInt1033];
		this.anIntArrayArray6 = new int[this.anInt1033][];
		this.anIntArray86 = new int[this.anInt1033];
		@Pc(166) int local166;
		@Pc(180) int local180;
		if (local55) {
			this.anIntArray90 = new int[this.anInt1033];
			for (local166 = 0; local166 < this.anInt1033; local166++) {
				this.anIntArray90[local166] = -1;
			}
			for (local180 = 0; local180 < this.anInt1038; local180++) {
				this.anIntArray90[this.anIntArray89[local180]] = local12.method8618();
			}
			this.aClass150_1 = new Class150(this.anIntArray90);
		}
		for (local166 = 0; local166 < this.anInt1038; local166++) {
			this.anIntArray88[this.anIntArray89[local166]] = local12.method8618();
		}
		if (local63) {
			for (local180 = 0; local180 < this.anInt1038; local180++) {
				@Pc(236) byte[] local236 = new byte[64];
				local12.method8623(0, 64, local236);
				this.aByteArrayArray3[this.anIntArray89[local180]] = local236;
			}
		}
		for (local180 = 0; local180 < this.anInt1038; local180++) {
			this.anIntArray91[this.anIntArray89[local180]] = local12.method8618();
		}
		for (@Pc(276) int local276 = 0; local276 < this.anInt1038; local276++) {
			this.anIntArray86[this.anIntArray89[local276]] = local12.method8593();
		}
		@Pc(306) int local306;
		@Pc(311) int local311;
		@Pc(321) int local321;
		@Pc(323) int local323;
		@Pc(340) int local340;
		for (@Pc(299) int local299 = 0; local299 < this.anInt1038; local299++) {
			local306 = this.anIntArray89[local299];
			local311 = this.anIntArray86[local306];
			local70 = 0;
			this.anIntArrayArray6[local306] = new int[local311];
			local321 = -1;
			for (local323 = 0; local323 < local311; local323++) {
				local340 = this.anIntArrayArray6[local306][local323] = local70 += local12.method8593();
				if (local321 < local340) {
					local321 = local340;
				}
			}
			this.anIntArray87[local306] = local321 + 1;
			if (local321 + 1 == local311) {
				this.anIntArrayArray6[local306] = null;
			}
		}
		if (!local55) {
			return;
		}
		this.aClass150Array1 = new Class150[local72 + 1];
		this.anIntArrayArray5 = new int[local72 + 1][];
		for (local306 = 0; local306 < this.anInt1038; local306++) {
			local311 = this.anIntArray89[local306];
			local321 = this.anIntArray86[local311];
			this.anIntArrayArray5[local311] = new int[this.anIntArray87[local311]];
			for (local323 = 0; local323 < this.anIntArray87[local311]; local323++) {
				this.anIntArrayArray5[local311][local323] = -1;
			}
			for (local340 = 0; local340 < local321; local340++) {
				@Pc(449) int local449;
				if (this.anIntArrayArray6[local311] == null) {
					local449 = local340;
				} else {
					local449 = this.anIntArrayArray6[local311][local340];
				}
				this.anIntArrayArray5[local311][local449] = local12.method8618();
			}
			this.aClass150Array1[local311] = new Class150(this.anIntArrayArray5[local311]);
		}
	}
}
