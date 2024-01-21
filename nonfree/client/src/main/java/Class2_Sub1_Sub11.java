import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public final class Class2_Sub1_Sub11 extends Class2_Sub1 {

	@OriginalMember(owner = "client!me", name = "V", descriptor = "I")
	private int anInt1668;

	@OriginalMember(owner = "client!me", name = "Cb", descriptor = "I")
	public int anInt1686;

	@OriginalMember(owner = "client!me", name = "ab", descriptor = "[I")
	private final int[] anIntArray207 = new int[6];

	@OriginalMember(owner = "client!me", name = "mb", descriptor = "I")
	public int anInt1677 = -1;

	@OriginalMember(owner = "client!me", name = "rb", descriptor = "I")
	private int anInt1680 = 0;

	@OriginalMember(owner = "client!me", name = "pb", descriptor = "[I")
	private final int[] anIntArray212 = new int[6];

	@OriginalMember(owner = "client!me", name = "nb", descriptor = "I")
	private int anInt1678 = 0;

	@OriginalMember(owner = "client!me", name = "wb", descriptor = "I")
	private int anInt1684 = 128;

	@OriginalMember(owner = "client!me", name = "ub", descriptor = "I")
	private int anInt1682 = 128;

	@OriginalMember(owner = "client!me", name = "Fb", descriptor = "I")
	private int anInt1688 = 0;

	@OriginalMember(owner = "client!me", name = "c", descriptor = "(II)Lclient!fd;")
	public Class2_Sub1_Sub4_Sub1 method1152(@OriginalArg(0) int arg0) {
		@Pc(18) Class2_Sub1_Sub4_Sub1 local18 = (Class2_Sub1_Sub4_Sub1) Static26.aClass22_8.method711((long) this.anInt1686);
		if (local18 == null) {
			local18 = Static30.method669(Static109.aClass3_25, this.anInt1668);
			if (local18 == null) {
				return null;
			}
			for (@Pc(32) int local32 = 0; local32 < 6; local32++) {
				if (this.anIntArray212[0] != 0) {
					local18.method674(this.anIntArray212[local32], this.anIntArray207[local32]);
				}
			}
			local18.method681();
			local18.method655(this.anInt1680 + 64, this.anInt1678 + 850, -30, -50, -30, true);
			Static26.aClass22_8.method712(local18, (long) this.anInt1686);
		}
		@Pc(89) Class2_Sub1_Sub4_Sub1 local89;
		if (this.anInt1677 == -1 || arg0 == -1) {
			local89 = local18.method660(true);
		} else {
			local89 = Static56.method1045(this.anInt1677).method1676(local18, arg0);
		}
		if (this.anInt1682 != 128 || this.anInt1684 != 128) {
			local89.method665(this.anInt1682, this.anInt1684, this.anInt1682);
		}
		if (this.anInt1688 != 0) {
			if (this.anInt1688 == 90) {
				local89.method684();
			}
			if (this.anInt1688 == 180) {
				local89.method684();
				local89.method684();
			}
			if (this.anInt1688 == 270) {
				local89.method684();
				local89.method684();
				local89.method684();
			}
		}
		return local89;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IILclient!wd;)V")
	private void method1153(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub12 arg1) {
		if (arg0 == 1) {
			this.anInt1668 = arg1.method1366();
		} else if (arg0 == 2) {
			this.anInt1677 = arg1.method1366();
		} else if (arg0 == 4) {
			this.anInt1682 = arg1.method1366();
		} else if (arg0 == 5) {
			this.anInt1684 = arg1.method1366();
		} else if (arg0 == 6) {
			this.anInt1688 = arg1.method1366();
		} else if (arg0 == 7) {
			this.anInt1680 = arg1.method1399();
		} else if (arg0 == 8) {
			this.anInt1678 = arg1.method1399();
		} else if (arg0 >= 40 && arg0 < 50) {
			this.anIntArray212[arg0 - 40] = arg1.method1366();
		} else if (arg0 >= 50 && arg0 < 60) {
			this.anIntArray207[arg0 - 50] = arg1.method1366();
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ILclient!wd;)V")
	public void method1155(@OriginalArg(1) Class2_Sub12 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method1399();
			if (local12 == 0) {
				return;
			}
			this.method1153(local12, arg0);
		}
	}
}
