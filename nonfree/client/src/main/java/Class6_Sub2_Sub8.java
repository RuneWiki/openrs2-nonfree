import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!od")
public final class Class6_Sub2_Sub8 extends Class6_Sub2 {

	@OriginalMember(owner = "client!od", name = "gb", descriptor = "I")
	public int anInt2065;

	@OriginalMember(owner = "client!od", name = "Hb", descriptor = "I")
	private int anInt2080;

	@OriginalMember(owner = "client!od", name = "Db", descriptor = "I")
	private int anInt2077 = 0;

	@OriginalMember(owner = "client!od", name = "wb", descriptor = "[I")
	private final int[] anIntArray192 = new int[6];

	@OriginalMember(owner = "client!od", name = "vb", descriptor = "I")
	private int anInt2074 = 128;

	@OriginalMember(owner = "client!od", name = "zb", descriptor = "[I")
	private final int[] anIntArray193 = new int[6];

	@OriginalMember(owner = "client!od", name = "Jb", descriptor = "I")
	private int anInt2081 = 0;

	@OriginalMember(owner = "client!od", name = "Lb", descriptor = "I")
	private int anInt2083 = 128;

	@OriginalMember(owner = "client!od", name = "hb", descriptor = "I")
	public int anInt2066 = -1;

	@OriginalMember(owner = "client!od", name = "mb", descriptor = "I")
	private int anInt2069 = 0;

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IB)Lclient!jb;")
	public Class6_Sub2_Sub3_Sub3 method1404(@OriginalArg(0) int arg0) {
		@Pc(17) Class6_Sub2_Sub3_Sub3 local17 = (Class6_Sub2_Sub3_Sub3) Static98.aClass36_34.method1154((long) this.anInt2065);
		if (local17 == null) {
			local17 = Static42.method974(Static12.aClass40_11, this.anInt2080);
			if (local17 == null) {
				return null;
			}
			for (@Pc(35) int local35 = 0; local35 < 6; local35++) {
				if (this.anIntArray192[0] != 0) {
					local17.method961(this.anIntArray192[local35], this.anIntArray193[local35]);
				}
			}
			local17.method978();
			local17.method965(this.anInt2077 + 64, 850 - -this.anInt2069, -30, -50, -30, true);
			Static98.aClass36_34.method1161((long) this.anInt2065, local17);
		}
		@Pc(100) Class6_Sub2_Sub3_Sub3 local100;
		if (this.anInt2066 == -1 || arg0 == -1) {
			local100 = local17.method959(true);
		} else {
			local100 = Static4.method1608(this.anInt2066).method1861(arg0, local17);
		}
		if (this.anInt2083 != 128 || this.anInt2074 != 128) {
			local100.method957(this.anInt2083, this.anInt2074, this.anInt2083);
		}
		if (this.anInt2081 != 0) {
			if (this.anInt2081 == 90) {
				local100.method968();
			}
			if (this.anInt2081 == 180) {
				local100.method968();
				local100.method968();
			}
			if (this.anInt2081 == 270) {
				local100.method968();
				local100.method968();
				local100.method968();
			}
		}
		return local100;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ILclient!b;)V")
	public void method1405(@OriginalArg(1) Class6_Sub1 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method1495();
			if (local15 == 0) {
				return;
			}
			this.method1408(arg0, local15);
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(BLclient!b;I)V")
	private void method1408(@OriginalArg(1) Class6_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2080 = arg0.method1500();
		} else if (arg1 == 2) {
			this.anInt2066 = arg0.method1500();
		} else if (arg1 == 4) {
			this.anInt2083 = arg0.method1500();
		} else if (arg1 == 5) {
			this.anInt2074 = arg0.method1500();
		} else if (arg1 == 6) {
			this.anInt2081 = arg0.method1500();
		} else if (arg1 == 7) {
			this.anInt2077 = arg0.method1495();
		} else if (arg1 == 8) {
			this.anInt2069 = arg0.method1495();
		} else if (arg1 >= 40 && arg1 < 50) {
			this.anIntArray192[arg1 - 40] = arg0.method1500();
		} else if (arg1 >= 50 && arg1 < 60) {
			this.anIntArray193[arg1 - 50] = arg0.method1500();
		}
	}
}
