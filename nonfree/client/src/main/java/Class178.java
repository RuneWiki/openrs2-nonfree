import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public final class Class178 {

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "[I")
	public int[] anIntArray409;

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "[I")
	public int[] anIntArray410;

	@OriginalMember(owner = "client!ne", name = "e", descriptor = "Lclient!qs;")
	public Class207 aClass207_1;

	@OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
	public int anInt4953;

	@OriginalMember(owner = "client!ne", name = "h", descriptor = "[[I")
	public int[][] anIntArrayArray116;

	@OriginalMember(owner = "client!ne", name = "i", descriptor = "[I")
	public int[] anIntArray412;

	@OriginalMember(owner = "client!ne", name = "j", descriptor = "[I")
	public int[] anIntArray413;

	@OriginalMember(owner = "client!ne", name = "k", descriptor = "[I")
	public int[] anIntArray414;

	@OriginalMember(owner = "client!ne", name = "l", descriptor = "[I")
	public int[] anIntArray415;

	@OriginalMember(owner = "client!ne", name = "n", descriptor = "[[I")
	public int[][] anIntArrayArray117;

	@OriginalMember(owner = "client!ne", name = "o", descriptor = "I")
	public int anInt4955;

	@OriginalMember(owner = "client!ne", name = "q", descriptor = "I")
	public int anInt4957;

	@OriginalMember(owner = "client!ne", name = "s", descriptor = "[Lclient!qs;")
	public Class207[] aClass207Array1;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
	public final int anInt4951;

	static {
		new Class231(null, "bevor du die Option 'Regelverstoß melden' benutzt.", null, null);
	}

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "([BI)V")
	public Class178(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.anInt4951 = Static203.method2863(arg0.length, arg0);
		if (this.anInt4951 != arg1) {
			throw new RuntimeException();
		}
		this.method3913(arg0);
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "([BB)V")
	private void method3913(@OriginalArg(0) byte[] arg0) {
		@Pc(14) Class2_Sub17 local14 = new Class2_Sub17(Static290.method4111(arg0));
		@Pc(18) int local18 = local14.method6138();
		if (local18 != 5 && local18 != 6) {
			throw new RuntimeException();
		}
		if (local18 < 6) {
			this.anInt4957 = 0;
		} else {
			this.anInt4957 = local14.method6129();
		}
		@Pc(51) int local51 = local14.method6138();
		this.anInt4953 = local14.method6148();
		@Pc(60) int local60 = 0;
		@Pc(62) int local62 = -1;
		this.anIntArray413 = new int[this.anInt4953];
		for (@Pc(69) int local69 = 0; local69 < this.anInt4953; local69++) {
			this.anIntArray413[local69] = local60 += local14.method6148();
			if (this.anIntArray413[local69] > local62) {
				local62 = this.anIntArray413[local69];
			}
		}
		this.anInt4955 = local62 + 1;
		this.anIntArray414 = new int[this.anInt4955];
		this.anIntArrayArray117 = new int[this.anInt4955][];
		this.anIntArray415 = new int[this.anInt4955];
		this.anIntArray409 = new int[this.anInt4955];
		this.anIntArray410 = new int[this.anInt4955];
		@Pc(150) int local150;
		@Pc(168) int local168;
		if (local51 != 0) {
			this.anIntArray412 = new int[this.anInt4955];
			for (local150 = 0; local150 < this.anInt4955; local150++) {
				this.anIntArray412[local150] = -1;
			}
			for (local168 = 0; local168 < this.anInt4953; local168++) {
				this.anIntArray412[this.anIntArray413[local168]] = local14.method6129();
			}
			this.aClass207_1 = new Class207(this.anIntArray412);
		}
		for (local150 = 0; local150 < this.anInt4953; local150++) {
			this.anIntArray415[this.anIntArray413[local150]] = local14.method6129();
		}
		for (local168 = 0; local168 < this.anInt4953; local168++) {
			this.anIntArray410[this.anIntArray413[local168]] = local14.method6129();
		}
		for (@Pc(243) int local243 = 0; local243 < this.anInt4953; local243++) {
			this.anIntArray414[this.anIntArray413[local243]] = local14.method6148();
		}
		@Pc(273) int local273;
		@Pc(280) int local280;
		@Pc(288) int local288;
		@Pc(290) int local290;
		@Pc(307) int local307;
		for (@Pc(266) int local266 = 0; local266 < this.anInt4953; local266++) {
			local273 = this.anIntArray413[local266];
			local60 = 0;
			local280 = this.anIntArray414[local273];
			this.anIntArrayArray117[local273] = new int[local280];
			local288 = -1;
			for (local290 = 0; local290 < local280; local290++) {
				local307 = this.anIntArrayArray117[local273][local290] = local60 += local14.method6148();
				if (local288 < local307) {
					local288 = local307;
				}
			}
			this.anIntArray409[local273] = local288 + 1;
			if (local288 + 1 == local280) {
				this.anIntArrayArray117[local273] = null;
			}
		}
		if (local51 == 0) {
			return;
		}
		this.anIntArrayArray116 = new int[local62 + 1][];
		this.aClass207Array1 = new Class207[local62 + 1];
		for (local273 = 0; local273 < this.anInt4953; local273++) {
			local280 = this.anIntArray413[local273];
			local288 = this.anIntArray414[local280];
			this.anIntArrayArray116[local280] = new int[this.anIntArray409[local280]];
			for (local290 = 0; local290 < this.anIntArray409[local280]; local290++) {
				this.anIntArrayArray116[local280][local290] = -1;
			}
			for (local307 = 0; local307 < local288; local307++) {
				@Pc(417) int local417;
				if (this.anIntArrayArray117[local280] == null) {
					local417 = local307;
				} else {
					local417 = this.anIntArrayArray117[local280][local307];
				}
				this.anIntArrayArray116[local280][local417] = local14.method6129();
			}
			this.aClass207Array1[local280] = new Class207(this.anIntArrayArray116[local280]);
		}
	}
}
