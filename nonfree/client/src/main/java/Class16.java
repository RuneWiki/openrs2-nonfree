import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ai")
public final class Class16 {

	@OriginalMember(owner = "client!ai", name = "v", descriptor = "I")
	public int anInt182;

	@OriginalMember(owner = "client!ai", name = "d", descriptor = "[I")
	public int[] anIntArray15;

	@OriginalMember(owner = "client!ai", name = "f", descriptor = "[[I")
	public int[][] anIntArrayArray5;

	@OriginalMember(owner = "client!ai", name = "m", descriptor = "[Lclient!jja;")
	public Class189[] aClass189Array1;

	@OriginalMember(owner = "client!ai", name = "q", descriptor = "I")
	public int anInt185;

	@OriginalMember(owner = "client!ai", name = "l", descriptor = "Lclient!jja;")
	public Class189 aClass189_1;

	@OriginalMember(owner = "client!ai", name = "r", descriptor = "[[B")
	public byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!ai", name = "i", descriptor = "[I")
	public int[] anIntArray17;

	@OriginalMember(owner = "client!ai", name = "z", descriptor = "[I")
	public int[] anIntArray18;

	@OriginalMember(owner = "client!ai", name = "h", descriptor = "[[I")
	public int[][] anIntArrayArray6;

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "[I")
	public int[] anIntArray19;

	@OriginalMember(owner = "client!ai", name = "k", descriptor = "I")
	public int anInt189;

	@OriginalMember(owner = "client!ai", name = "y", descriptor = "[I")
	public int[] anIntArray20;

	@OriginalMember(owner = "client!ai", name = "s", descriptor = "[I")
	public int[] anIntArray21;

	@OriginalMember(owner = "client!ai", name = "x", descriptor = "I")
	public final int anInt184;

	@OriginalMember(owner = "client!ai", name = "u", descriptor = "[B")
	private byte[] aByteArray1;

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "([BI[B)V")
	public Class16(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		this.anInt184 = Static199.method2983(arg0.length, arg0);
		if (arg1 != this.anInt184) {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			if (arg2.length != 64) {
				throw new RuntimeException();
			}
			this.aByteArray1 = Static197.method2948(arg0.length, arg0, 0);
			for (@Pc(43) int local43 = 0; local43 < 64; local43++) {
				if (this.aByteArray1[local43] != arg2[local43]) {
					throw new RuntimeException();
				}
			}
		}
		this.method247(arg0);
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(I[B)V")
	private void method247(@OriginalArg(1) byte[] arg0) {
		@Pc(14) Class14_Sub21 local14 = new Class14_Sub21(Static666.method9235(arg0));
		@Pc(18) int local18 = local14.method7695(118);
		if (local18 < 5 || local18 > 6) {
			throw new RuntimeException();
		}
		if (local18 >= 6) {
			this.anInt185 = local14.method7748();
		} else {
			this.anInt185 = 0;
		}
		@Pc(58) int local58 = local14.method7695(125);
		@Pc(67) boolean local67 = (local58 & 0x1) != 0;
		this.anInt189 = local14.method7717(-1978450544);
		@Pc(86) boolean local86 = (local58 & 0x2) != 0;
		@Pc(88) int local88 = 0;
		this.anIntArray17 = new int[this.anInt189];
		@Pc(95) int local95 = -1;
		for (@Pc(97) int local97 = 0; local97 < this.anInt189; local97++) {
			this.anIntArray17[local97] = local88 += local14.method7717(-1978450544);
			if (local95 < this.anIntArray17[local97]) {
				local95 = this.anIntArray17[local97];
			}
		}
		this.anInt182 = local95 + 1;
		this.anIntArrayArray5 = new int[this.anInt182][];
		if (local86) {
			this.aByteArrayArray1 = new byte[this.anInt182][];
		}
		this.anIntArray15 = new int[this.anInt182];
		this.anIntArray19 = new int[this.anInt182];
		this.anIntArray20 = new int[this.anInt182];
		this.anIntArray18 = new int[this.anInt182];
		@Pc(180) int local180;
		@Pc(200) int local200;
		if (local67) {
			this.anIntArray21 = new int[this.anInt182];
			for (local180 = 0; local180 < this.anInt182; local180++) {
				this.anIntArray21[local180] = -1;
			}
			for (local200 = 0; local200 < this.anInt189; local200++) {
				this.anIntArray21[this.anIntArray17[local200]] = local14.method7748();
			}
			this.aClass189_1 = new Class189(this.anIntArray21);
		}
		for (local180 = 0; local180 < this.anInt189; local180++) {
			this.anIntArray19[this.anIntArray17[local180]] = local14.method7748();
		}
		if (local86) {
			for (local200 = 0; local200 < this.anInt189; local200++) {
				@Pc(274) byte[] local274 = new byte[64];
				local14.method7750(64, 0, local274);
				this.aByteArrayArray1[this.anIntArray17[local200]] = local274;
			}
		}
		for (local200 = 0; local200 < this.anInt189; local200++) {
			this.anIntArray18[this.anIntArray17[local200]] = local14.method7748();
		}
		for (@Pc(322) int local322 = 0; local322 < this.anInt189; local322++) {
			this.anIntArray15[this.anIntArray17[local322]] = local14.method7717(-1978450544);
		}
		@Pc(356) int local356;
		@Pc(363) int local363;
		@Pc(371) int local371;
		@Pc(373) int local373;
		@Pc(390) int local390;
		for (@Pc(345) int local345 = 0; local345 < this.anInt189; local345++) {
			local356 = this.anIntArray17[local345];
			local88 = 0;
			local363 = this.anIntArray15[local356];
			this.anIntArrayArray5[local356] = new int[local363];
			local371 = -1;
			for (local373 = 0; local373 < local363; local373++) {
				local390 = this.anIntArrayArray5[local356][local373] = local88 += local14.method7717(-1978450544);
				if (local390 > local371) {
					local371 = local390;
				}
			}
			this.anIntArray20[local356] = local371 + 1;
			if (local363 == local371 + 1) {
				this.anIntArrayArray5[local356] = null;
			}
		}
		if (!local67) {
			return;
		}
		this.anIntArrayArray6 = new int[local95 + 1][];
		this.aClass189Array1 = new Class189[local95 + 1];
		for (local356 = 0; local356 < this.anInt189; local356++) {
			local363 = this.anIntArray17[local356];
			local371 = this.anIntArray15[local363];
			this.anIntArrayArray6[local363] = new int[this.anIntArray20[local363]];
			for (local373 = 0; local373 < this.anIntArray20[local363]; local373++) {
				this.anIntArrayArray6[local363][local373] = -1;
			}
			for (local390 = 0; local390 < local371; local390++) {
				@Pc(524) int local524;
				if (this.anIntArrayArray5[local363] == null) {
					local524 = local390;
				} else {
					local524 = this.anIntArrayArray5[local363][local390];
				}
				this.anIntArrayArray6[local363][local524] = local14.method7748();
			}
			this.aClass189Array1[local363] = new Class189(this.anIntArrayArray6[local363]);
		}
	}
}
