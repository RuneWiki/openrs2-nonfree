import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uj")
public final class Class136 {

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "[[I")
	public int[][] anIntArrayArray37;

	@OriginalMember(owner = "client!uj", name = "c", descriptor = "[I")
	public int[] anIntArray450;

	@OriginalMember(owner = "client!uj", name = "e", descriptor = "[Lclient!aj;")
	public Class10[] aClass10Array1;

	@OriginalMember(owner = "client!uj", name = "h", descriptor = "I")
	public int anInt5163;

	@OriginalMember(owner = "client!uj", name = "j", descriptor = "[[I")
	public int[][] anIntArrayArray38;

	@OriginalMember(owner = "client!uj", name = "l", descriptor = "[I")
	public int[] anIntArray451;

	@OriginalMember(owner = "client!uj", name = "n", descriptor = "Lclient!aj;")
	public Class10 aClass10_1;

	@OriginalMember(owner = "client!uj", name = "o", descriptor = "[I")
	public int[] anIntArray452;

	@OriginalMember(owner = "client!uj", name = "p", descriptor = "[I")
	public int[] anIntArray453;

	@OriginalMember(owner = "client!uj", name = "t", descriptor = "[I")
	public int[] anIntArray454;

	@OriginalMember(owner = "client!uj", name = "u", descriptor = "[I")
	public int[] anIntArray455;

	@OriginalMember(owner = "client!uj", name = "w", descriptor = "I")
	public int anInt5169;

	@OriginalMember(owner = "client!uj", name = "y", descriptor = "I")
	public int anInt5170;

	@OriginalMember(owner = "client!uj", name = "v", descriptor = "I")
	public int anInt5168;

	@OriginalMember(owner = "client!uj", name = "<init>", descriptor = "([BI)V")
	public Class136(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.anInt5168 = Static121.method2367(arg0.length, arg0);
		if (arg1 != this.anInt5168) {
			throw new RuntimeException();
		}
		this.method3943(arg0);
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "([BZ)V")
	private void method3943(@OriginalArg(0) byte[] arg0) {
		@Pc(12) Class1_Sub13 local12 = new Class1_Sub13(Static182.method3130(arg0));
		@Pc(16) int local16 = local12.method1772();
		if (local16 != 5 && local16 != 6) {
			throw new RuntimeException();
		}
		if (local16 < 6) {
			this.anInt5169 = 0;
		} else {
			this.anInt5169 = local12.method1802();
		}
		@Pc(45) int local45 = local12.method1772();
		this.anInt5170 = local12.method1764();
		@Pc(52) int local52 = 0;
		@Pc(54) int local54 = -1;
		this.anIntArray452 = new int[this.anInt5170];
		for (@Pc(61) int local61 = 0; local61 < this.anInt5170; local61++) {
			this.anIntArray452[local61] = local52 += local12.method1764();
			if (this.anIntArray452[local61] > local54) {
				local54 = this.anIntArray452[local61];
			}
		}
		this.anInt5163 = local54 + 1;
		this.anIntArray454 = new int[this.anInt5163];
		this.anIntArray455 = new int[this.anInt5163];
		this.anIntArray451 = new int[this.anInt5163];
		this.anIntArray450 = new int[this.anInt5163];
		this.anIntArrayArray37 = new int[this.anInt5163][];
		@Pc(140) int local140;
		@Pc(154) int local154;
		if (local45 != 0) {
			this.anIntArray453 = new int[this.anInt5163];
			for (local140 = 0; local140 < this.anInt5163; local140++) {
				this.anIntArray453[local140] = -1;
			}
			for (local154 = 0; local154 < this.anInt5170; local154++) {
				this.anIntArray453[this.anIntArray452[local154]] = local12.method1802();
			}
			this.aClass10_1 = new Class10(this.anIntArray453);
		}
		for (local140 = 0; local140 < this.anInt5170; local140++) {
			this.anIntArray454[this.anIntArray452[local140]] = local12.method1802();
		}
		for (local154 = 0; local154 < this.anInt5170; local154++) {
			this.anIntArray455[this.anIntArray452[local154]] = local12.method1802();
		}
		for (@Pc(232) int local232 = 0; local232 < this.anInt5170; local232++) {
			this.anIntArray451[this.anIntArray452[local232]] = local12.method1764();
		}
		@Pc(264) int local264;
		@Pc(269) int local269;
		@Pc(271) int local271;
		@Pc(279) int local279;
		@Pc(296) int local296;
		for (@Pc(255) int local255 = 0; local255 < this.anInt5170; local255++) {
			local52 = 0;
			local264 = this.anIntArray452[local255];
			local269 = this.anIntArray451[local264];
			local271 = -1;
			this.anIntArrayArray37[local264] = new int[local269];
			for (local279 = 0; local279 < local269; local279++) {
				local296 = this.anIntArrayArray37[local264][local279] = local52 += local12.method1764();
				if (local271 < local296) {
					local271 = local296;
				}
			}
			this.anIntArray450[local264] = local271 + 1;
			if (local271 + 1 == local269) {
				this.anIntArrayArray37[local264] = null;
			}
		}
		if (local45 == 0) {
			return;
		}
		this.anIntArrayArray38 = new int[local54 + 1][];
		this.aClass10Array1 = new Class10[local54 + 1];
		for (local264 = 0; local264 < this.anInt5170; local264++) {
			local269 = this.anIntArray452[local264];
			local271 = this.anIntArray451[local269];
			this.anIntArrayArray38[local269] = new int[this.anIntArray450[local269]];
			for (local279 = 0; local279 < this.anIntArray450[local269]; local279++) {
				this.anIntArrayArray38[local269][local279] = -1;
			}
			for (local296 = 0; local296 < local271; local296++) {
				@Pc(397) int local397;
				if (this.anIntArrayArray37[local269] == null) {
					local397 = local296;
				} else {
					local397 = this.anIntArrayArray37[local269][local296];
				}
				this.anIntArrayArray38[local269][local397] = local12.method1802();
			}
			this.aClass10Array1[local269] = new Class10(this.anIntArrayArray38[local269]);
		}
	}
}
