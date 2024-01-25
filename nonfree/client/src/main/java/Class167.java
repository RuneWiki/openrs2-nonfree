import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qh")
public final class Class167 {

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "[I")
	public int[] anIntArray437;

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "[Lclient!dg;")
	public Class48[] aClass48Array1;

	@OriginalMember(owner = "client!qh", name = "f", descriptor = "I")
	public int anInt5306;

	@OriginalMember(owner = "client!qh", name = "g", descriptor = "[I")
	public int[] anIntArray439;

	@OriginalMember(owner = "client!qh", name = "h", descriptor = "I")
	public int anInt5307;

	@OriginalMember(owner = "client!qh", name = "k", descriptor = "[[I")
	public int[][] anIntArrayArray50;

	@OriginalMember(owner = "client!qh", name = "p", descriptor = "[I")
	public int[] anIntArray441;

	@OriginalMember(owner = "client!qh", name = "s", descriptor = "I")
	public int anInt5312;

	@OriginalMember(owner = "client!qh", name = "u", descriptor = "[I")
	public int[] anIntArray443;

	@OriginalMember(owner = "client!qh", name = "v", descriptor = "[[I")
	public int[][] anIntArrayArray51;

	@OriginalMember(owner = "client!qh", name = "w", descriptor = "[I")
	public int[] anIntArray444;

	@OriginalMember(owner = "client!qh", name = "x", descriptor = "[I")
	public int[] anIntArray445;

	@OriginalMember(owner = "client!qh", name = "A", descriptor = "Lclient!dg;")
	public Class48 aClass48_1;

	@OriginalMember(owner = "client!qh", name = "o", descriptor = "I")
	public final int anInt5311;

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "([BI)V")
	public Class167(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.anInt5311 = Static325.method5353(arg0, arg0.length);
		if (this.anInt5311 != arg1) {
			throw new RuntimeException();
		}
		this.method4404(arg0);
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "([BI)V")
	private void method4404(@OriginalArg(0) byte[] arg0) {
		@Pc(12) Class4_Sub7 local12 = new Class4_Sub7(Static51.method954(arg0));
		@Pc(16) int local16 = local12.method2380();
		if (local16 != 5 && local16 != 6) {
			throw new RuntimeException();
		}
		if (local16 >= 6) {
			this.anInt5306 = local12.method2389();
		} else {
			this.anInt5306 = 0;
		}
		@Pc(45) int local45 = local12.method2380();
		this.anInt5307 = local12.method2404();
		@Pc(54) int local54 = 0;
		this.anIntArray444 = new int[this.anInt5307];
		@Pc(61) int local61 = -1;
		for (@Pc(63) int local63 = 0; local63 < this.anInt5307; local63++) {
			this.anIntArray444[local63] = local54 += local12.method2404();
			if (local61 < this.anIntArray444[local63]) {
				local61 = this.anIntArray444[local63];
			}
		}
		this.anInt5312 = local61 + 1;
		this.anIntArray437 = new int[this.anInt5312];
		this.anIntArray441 = new int[this.anInt5312];
		this.anIntArrayArray50 = new int[this.anInt5312][];
		this.anIntArray439 = new int[this.anInt5312];
		this.anIntArray443 = new int[this.anInt5312];
		@Pc(133) int local133;
		@Pc(151) int local151;
		if (local45 != 0) {
			this.anIntArray445 = new int[this.anInt5312];
			for (local133 = 0; local133 < this.anInt5312; local133++) {
				this.anIntArray445[local133] = -1;
			}
			for (local151 = 0; local151 < this.anInt5307; local151++) {
				this.anIntArray445[this.anIntArray444[local151]] = local12.method2389();
			}
			this.aClass48_1 = new Class48(this.anIntArray445);
		}
		for (local133 = 0; local133 < this.anInt5307; local133++) {
			this.anIntArray439[this.anIntArray444[local133]] = local12.method2389();
		}
		for (local151 = 0; local151 < this.anInt5307; local151++) {
			this.anIntArray443[this.anIntArray444[local151]] = local12.method2389();
		}
		for (@Pc(223) int local223 = 0; local223 < this.anInt5307; local223++) {
			this.anIntArray441[this.anIntArray444[local223]] = local12.method2404();
		}
		@Pc(253) int local253;
		@Pc(260) int local260;
		@Pc(262) int local262;
		@Pc(270) int local270;
		@Pc(287) int local287;
		for (@Pc(246) int local246 = 0; local246 < this.anInt5307; local246++) {
			local253 = this.anIntArray444[local246];
			local54 = 0;
			local260 = this.anIntArray441[local253];
			local262 = -1;
			this.anIntArrayArray50[local253] = new int[local260];
			for (local270 = 0; local270 < local260; local270++) {
				local287 = this.anIntArrayArray50[local253][local270] = local54 += local12.method2404();
				if (local287 > local262) {
					local262 = local287;
				}
			}
			this.anIntArray437[local253] = local262 + 1;
			if (local260 == local262 + 1) {
				this.anIntArrayArray50[local253] = null;
			}
		}
		if (local45 == 0) {
			return;
		}
		this.anIntArrayArray51 = new int[local61 + 1][];
		this.aClass48Array1 = new Class48[local61 + 1];
		for (local253 = 0; local253 < this.anInt5307; local253++) {
			local260 = this.anIntArray444[local253];
			local262 = this.anIntArray441[local260];
			this.anIntArrayArray51[local260] = new int[this.anIntArray437[local260]];
			for (local270 = 0; local270 < this.anIntArray437[local260]; local270++) {
				this.anIntArrayArray51[local260][local270] = -1;
			}
			for (local287 = 0; local287 < local262; local287++) {
				@Pc(397) int local397;
				if (this.anIntArrayArray50[local260] == null) {
					local397 = local287;
				} else {
					local397 = this.anIntArrayArray50[local260][local287];
				}
				this.anIntArrayArray51[local260][local397] = local12.method2389();
			}
			this.aClass48Array1[local260] = new Class48(this.anIntArrayArray51[local260]);
		}
	}
}
