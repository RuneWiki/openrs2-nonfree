import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class Class2_Sub1_Sub15 extends Class2_Sub1 {

	@OriginalMember(owner = "client!sd", name = "jb", descriptor = "I")
	public int anInt2682;

	@OriginalMember(owner = "client!sd", name = "zb", descriptor = "I")
	private int anInt2692;

	@OriginalMember(owner = "client!sd", name = "db", descriptor = "I")
	private int anInt2678 = 0;

	@OriginalMember(owner = "client!sd", name = "mb", descriptor = "I")
	private int anInt2683 = 128;

	@OriginalMember(owner = "client!sd", name = "hb", descriptor = "I")
	public int anInt2681 = -1;

	@OriginalMember(owner = "client!sd", name = "sb", descriptor = "I")
	private int anInt2686 = 0;

	@OriginalMember(owner = "client!sd", name = "ub", descriptor = "[I")
	private final int[] anIntArray398 = new int[6];

	@OriginalMember(owner = "client!sd", name = "nb", descriptor = "[I")
	private final int[] anIntArray396 = new int[6];

	@OriginalMember(owner = "client!sd", name = "yb", descriptor = "I")
	private int anInt2691 = 0;

	@OriginalMember(owner = "client!sd", name = "xb", descriptor = "I")
	private int anInt2690 = 128;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!fe;II)V")
	private void method1647(@OriginalArg(0) Class2_Sub8 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt2692 = arg0.method1396();
		} else if (arg1 == 2) {
			this.anInt2681 = arg0.method1396();
		} else if (arg1 == 4) {
			this.anInt2690 = arg0.method1396();
		} else if (arg1 == 5) {
			this.anInt2683 = arg0.method1396();
		} else if (arg1 == 6) {
			this.anInt2678 = arg0.method1396();
		} else if (arg1 == 7) {
			this.anInt2691 = arg0.method1410();
		} else if (arg1 == 8) {
			this.anInt2686 = arg0.method1410();
		} else if (arg1 >= 40 && arg1 < 50) {
			this.anIntArray398[arg1 - 40] = arg0.method1396();
		} else if (arg1 >= 50 && arg1 < 60) {
			this.anIntArray396[arg1 - 50] = arg0.method1396();
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!fe;I)V")
	public void method1653(@OriginalArg(0) Class2_Sub8 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method1410();
			if (local15 == 0) {
				return;
			}
			this.method1647(arg0, local15);
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IB)Lclient!r;")
	public Class2_Sub1_Sub1_Sub6 method1654(@OriginalArg(0) int arg0) {
		@Pc(19) Class2_Sub1_Sub1_Sub6 local19 = (Class2_Sub1_Sub1_Sub6) Static51.aClass21_22.method744((long) this.anInt2682);
		if (local19 == null) {
			local19 = Static86.method1543(Static60.aClass33_31, this.anInt2692);
			if (local19 == null) {
				return null;
			}
			for (@Pc(33) int local33 = 0; local33 < 6; local33++) {
				if (this.anIntArray398[0] != 0) {
					local19.method1515(this.anIntArray398[local33], this.anIntArray396[local33]);
				}
			}
			local19.method1524();
			local19.method1535(this.anInt2691 + 64, 850 - -this.anInt2686, -30, -50, -30, true);
			Static51.aClass21_22.method745((long) this.anInt2682, local19);
		}
		@Pc(90) Class2_Sub1_Sub1_Sub6 local90;
		if (this.anInt2681 == -1 || arg0 == -1) {
			local90 = local19.method1527(true);
		} else {
			local90 = Static71.method1291(this.anInt2681).method739(arg0, local19);
		}
		if (this.anInt2690 != 128 || this.anInt2683 != 128) {
			local90.method1517(this.anInt2690, this.anInt2683, this.anInt2690);
		}
		if (this.anInt2678 != 0) {
			if (this.anInt2678 == 90) {
				local90.method1539();
			}
			if (this.anInt2678 == 180) {
				local90.method1539();
				local90.method1539();
			}
			if (this.anInt2678 == 270) {
				local90.method1539();
				local90.method1539();
				local90.method1539();
			}
		}
		return local90;
	}
}
