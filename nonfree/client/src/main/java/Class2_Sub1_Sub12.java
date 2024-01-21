import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pc")
public final class Class2_Sub1_Sub12 extends Class2_Sub1 {

	@OriginalMember(owner = "client!pc", name = "mb", descriptor = "[I")
	public static int[] anIntArray287 = new int[99];

	@OriginalMember(owner = "client!pc", name = "Z", descriptor = "I")
	private int anInt2202;

	@OriginalMember(owner = "client!pc", name = "kb", descriptor = "I")
	public int anInt2207;

	@OriginalMember(owner = "client!pc", name = "S", descriptor = "I")
	private int anInt2198 = 0;

	@OriginalMember(owner = "client!pc", name = "Y", descriptor = "I")
	private int anInt2201 = 0;

	@OriginalMember(owner = "client!pc", name = "cb", descriptor = "I")
	private int anInt2204 = 128;

	@OriginalMember(owner = "client!pc", name = "U", descriptor = "I")
	public int anInt2199 = -1;

	@OriginalMember(owner = "client!pc", name = "hb", descriptor = "[S")
	private final short[] aShortArray11 = new short[6];

	@OriginalMember(owner = "client!pc", name = "jb", descriptor = "I")
	private int anInt2206 = 128;

	@OriginalMember(owner = "client!pc", name = "ib", descriptor = "[S")
	private final short[] aShortArray12 = new short[6];

	@OriginalMember(owner = "client!pc", name = "P", descriptor = "I")
	private int anInt2195 = 0;

	static {
		@Pc(25) int local25 = 0;
		for (@Pc(27) int local27 = 0; local27 < 99; local27++) {
			@Pc(32) int local32 = local27 + 1;
			@Pc(45) int local45 = (int) ((double) local32 + Math.pow(2.0D, (double) local32 / 7.0D) * 300.0D);
			local25 += local45;
			anIntArray287[local27] = local25 / 4;
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(BLclient!wb;I)V")
	private void method1340(@OriginalArg(1) Class2_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2202 = arg0.method1783();
		} else if (arg1 == 2) {
			this.anInt2199 = arg0.method1783();
		} else if (arg1 == 4) {
			this.anInt2206 = arg0.method1783();
		} else if (arg1 == 5) {
			this.anInt2204 = arg0.method1783();
		} else if (arg1 == 6) {
			this.anInt2201 = arg0.method1783();
		} else if (arg1 == 7) {
			this.anInt2195 = arg0.method1780();
		} else if (arg1 == 8) {
			this.anInt2198 = arg0.method1780();
		} else if (arg1 >= 40 && arg1 < 50) {
			this.aShortArray12[arg1 - 40] = (short) arg0.method1783();
		} else if (arg1 >= 50 && arg1 < 60) {
			this.aShortArray11[arg1 - 50] = (short) arg0.method1783();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILclient!wb;)V")
	public void method1342(@OriginalArg(1) Class2_Sub17 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method1780();
			if (local14 == 0) {
				return;
			}
			this.method1340(arg0, local14);
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(BI)Lclient!be;")
	public Class2_Sub1_Sub1_Sub2 method1343(@OriginalArg(1) int arg0) {
		@Pc(15) Class2_Sub1_Sub1_Sub2 local15 = (Class2_Sub1_Sub1_Sub2) Static94.aClass32_45.method887((long) this.anInt2207);
		if (local15 == null) {
			@Pc(23) Class2_Sub1_Sub1_Sub6 local23 = Static26.method540(Static28.aClass11_38, this.anInt2202);
			if (local23 == null) {
				return null;
			}
			for (@Pc(29) int local29 = 0; local29 < 6; local29++) {
				if (this.aShortArray12[0] != 0) {
					local23.method559(this.aShortArray12[local29], this.aShortArray11[local29]);
				}
			}
			local15 = local23.method548(this.anInt2195 + 64, 850 - -this.anInt2198, -30, -50, -30);
			Static94.aClass32_45.method880(local15, (long) this.anInt2207);
		}
		@Pc(90) Class2_Sub1_Sub1_Sub2 local90;
		if (this.anInt2199 == -1 || arg0 == -1) {
			local90 = local15.method204(true);
		} else {
			local90 = Static93.method1443(this.anInt2199).method738(local15, arg0);
		}
		if (this.anInt2206 != 128 || this.anInt2204 != 128) {
			local90.method218(this.anInt2206, this.anInt2204, this.anInt2206);
		}
		if (this.anInt2201 != 0) {
			if (this.anInt2201 == 90) {
				local90.method215();
			}
			if (this.anInt2201 == 180) {
				local90.method215();
				local90.method215();
			}
			if (this.anInt2201 == 270) {
				local90.method215();
				local90.method215();
				local90.method215();
			}
		}
		return local90;
	}
}
