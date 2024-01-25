import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!km")
public final class Class132 {

	@OriginalMember(owner = "client!km", name = "a", descriptor = "[I")
	public int[] anIntArray232;

	@OriginalMember(owner = "client!km", name = "c", descriptor = "[I")
	public int[] anIntArray233;

	@OriginalMember(owner = "client!km", name = "d", descriptor = "[Lclient!tc;")
	public Class233[] aClass233Array1;

	@OriginalMember(owner = "client!km", name = "h", descriptor = "[[I")
	public int[][] anIntArrayArray28;

	@OriginalMember(owner = "client!km", name = "i", descriptor = "[I")
	public int[] anIntArray234;

	@OriginalMember(owner = "client!km", name = "k", descriptor = "I")
	public int anInt3727;

	@OriginalMember(owner = "client!km", name = "l", descriptor = "[I")
	public int[] anIntArray235;

	@OriginalMember(owner = "client!km", name = "m", descriptor = "[I")
	public int[] anIntArray236;

	@OriginalMember(owner = "client!km", name = "n", descriptor = "[I")
	public int[] anIntArray237;

	@OriginalMember(owner = "client!km", name = "o", descriptor = "I")
	public int anInt3728;

	@OriginalMember(owner = "client!km", name = "p", descriptor = "I")
	public int anInt3729;

	@OriginalMember(owner = "client!km", name = "r", descriptor = "Lclient!tc;")
	public Class233 aClass233_1;

	@OriginalMember(owner = "client!km", name = "t", descriptor = "[[I")
	public int[][] anIntArrayArray29;

	@OriginalMember(owner = "client!km", name = "b", descriptor = "I")
	public final int anInt3723;

	static {
		new Class111("", 76);
	}

	@OriginalMember(owner = "client!km", name = "<init>", descriptor = "([BI)V")
	public Class132(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.anInt3723 = Static108.method1799(arg0.length, arg0);
		if (arg1 != this.anInt3723) {
			throw new RuntimeException();
		}
		this.method3202(arg0);
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "([BI)V")
	private void method3202(@OriginalArg(0) byte[] arg0) {
		@Pc(14) Class3_Sub25 local14 = new Class3_Sub25(Static201.method3087(arg0));
		@Pc(18) int local18 = local14.method4096();
		if (local18 != 5 && local18 != 6) {
			throw new RuntimeException();
		}
		if (local18 >= 6) {
			this.anInt3729 = local14.method4108();
		} else {
			this.anInt3729 = 0;
		}
		@Pc(49) int local49 = local14.method4096();
		this.anInt3728 = local14.method4083();
		@Pc(58) int local58 = 0;
		@Pc(60) int local60 = -1;
		this.anIntArray236 = new int[this.anInt3728];
		for (@Pc(67) int local67 = 0; local67 < this.anInt3728; local67++) {
			this.anIntArray236[local67] = local58 += local14.method4083();
			if (local60 < this.anIntArray236[local67]) {
				local60 = this.anIntArray236[local67];
			}
		}
		this.anInt3727 = local60 + 1;
		this.anIntArray234 = new int[this.anInt3727];
		this.anIntArray237 = new int[this.anInt3727];
		this.anIntArray233 = new int[this.anInt3727];
		this.anIntArray232 = new int[this.anInt3727];
		this.anIntArrayArray29 = new int[this.anInt3727][];
		@Pc(146) int local146;
		@Pc(160) int local160;
		if (local49 != 0) {
			this.anIntArray235 = new int[this.anInt3727];
			for (local146 = 0; local146 < this.anInt3727; local146++) {
				this.anIntArray235[local146] = -1;
			}
			for (local160 = 0; local160 < this.anInt3728; local160++) {
				this.anIntArray235[this.anIntArray236[local160]] = local14.method4108();
			}
			this.aClass233_1 = new Class233(this.anIntArray235);
		}
		for (local146 = 0; local146 < this.anInt3728; local146++) {
			this.anIntArray233[this.anIntArray236[local146]] = local14.method4108();
		}
		for (local160 = 0; local160 < this.anInt3728; local160++) {
			this.anIntArray237[this.anIntArray236[local160]] = local14.method4108();
		}
		for (@Pc(234) int local234 = 0; local234 < this.anInt3728; local234++) {
			this.anIntArray234[this.anIntArray236[local234]] = local14.method4083();
		}
		@Pc(260) int local260;
		@Pc(267) int local267;
		@Pc(275) int local275;
		@Pc(277) int local277;
		@Pc(294) int local294;
		for (@Pc(253) int local253 = 0; local253 < this.anInt3728; local253++) {
			local260 = this.anIntArray236[local253];
			local58 = 0;
			local267 = this.anIntArray234[local260];
			this.anIntArrayArray29[local260] = new int[local267];
			local275 = -1;
			for (local277 = 0; local277 < local267; local277++) {
				local294 = this.anIntArrayArray29[local260][local277] = local58 += local14.method4083();
				if (local275 < local294) {
					local275 = local294;
				}
			}
			this.anIntArray232[local260] = local275 + 1;
			if (local275 + 1 == local267) {
				this.anIntArrayArray29[local260] = null;
			}
		}
		if (local49 == 0) {
			return;
		}
		this.aClass233Array1 = new Class233[local60 + 1];
		this.anIntArrayArray28 = new int[local60 + 1][];
		for (local260 = 0; local260 < this.anInt3728; local260++) {
			local267 = this.anIntArray236[local260];
			local275 = this.anIntArray234[local267];
			this.anIntArrayArray28[local267] = new int[this.anIntArray232[local267]];
			for (local277 = 0; local277 < this.anIntArray232[local267]; local277++) {
				this.anIntArrayArray28[local267][local277] = -1;
			}
			for (local294 = 0; local294 < local275; local294++) {
				@Pc(404) int local404;
				if (this.anIntArrayArray29[local267] == null) {
					local404 = local294;
				} else {
					local404 = this.anIntArrayArray29[local267][local294];
				}
				this.anIntArrayArray28[local267][local404] = local14.method4108();
			}
			this.aClass233Array1[local267] = new Class233(this.anIntArrayArray28[local267]);
		}
	}
}
