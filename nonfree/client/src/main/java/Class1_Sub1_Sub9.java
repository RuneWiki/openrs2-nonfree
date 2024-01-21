import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Class1_Sub1_Sub9 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ib", name = "eb", descriptor = "I")
	private int anInt1420;

	@OriginalMember(owner = "client!ib", name = "gb", descriptor = "I")
	public int anInt1422;

	@OriginalMember(owner = "client!ib", name = "jb", descriptor = "I")
	private int anInt1423 = 0;

	@OriginalMember(owner = "client!ib", name = "rb", descriptor = "I")
	public int anInt1428 = -1;

	@OriginalMember(owner = "client!ib", name = "pb", descriptor = "I")
	private int anInt1426 = 128;

	@OriginalMember(owner = "client!ib", name = "ub", descriptor = "[I")
	private final int[] anIntArray169 = new int[6];

	@OriginalMember(owner = "client!ib", name = "tb", descriptor = "I")
	private int anInt1429 = 0;

	@OriginalMember(owner = "client!ib", name = "vb", descriptor = "[I")
	private final int[] anIntArray170 = new int[6];

	@OriginalMember(owner = "client!ib", name = "wb", descriptor = "I")
	private int anInt1430 = 0;

	@OriginalMember(owner = "client!ib", name = "zb", descriptor = "I")
	private int anInt1433 = 128;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lclient!rc;II)V")
	private void method888(@OriginalArg(0) Class1_Sub5 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt1420 = arg0.method715();
		} else if (arg1 == 2) {
			this.anInt1428 = arg0.method715();
		} else if (arg1 == 4) {
			this.anInt1433 = arg0.method715();
		} else if (arg1 == 5) {
			this.anInt1426 = arg0.method715();
		} else if (arg1 == 6) {
			this.anInt1430 = arg0.method715();
		} else if (arg1 == 7) {
			this.anInt1429 = arg0.method716();
		} else if (arg1 == 8) {
			this.anInt1423 = arg0.method716();
		} else if (arg1 >= 40 && arg1 < 50) {
			this.anIntArray170[arg1 - 40] = arg0.method715();
		} else if (arg1 >= 50 && arg1 < 60) {
			this.anIntArray169[arg1 - 50] = arg0.method715();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(BI)Lclient!qb;")
	public Class1_Sub1_Sub2_Sub6 method889(@OriginalArg(1) int arg0) {
		@Pc(7) Class1_Sub1_Sub2_Sub6 local7 = (Class1_Sub1_Sub2_Sub6) Static113.aClass5_64.method98((long) this.anInt1422);
		if (local7 == null) {
			local7 = Static81.method1442(Static84.aClass55_37, this.anInt1420);
			if (local7 == null) {
				return null;
			}
			for (@Pc(25) int local25 = 0; local25 < 6; local25++) {
				if (this.anIntArray170[0] != 0) {
					local7.method1427(this.anIntArray170[local25], this.anIntArray169[local25]);
				}
			}
			local7.method1426();
			local7.method1437(this.anInt1429 + 64, 850 - -this.anInt1423, -30, -50, -30, true);
			Static113.aClass5_64.method97(local7, (long) this.anInt1422);
		}
		@Pc(90) Class1_Sub1_Sub2_Sub6 local90;
		if (this.anInt1428 == -1 || arg0 == -1) {
			local90 = local7.method1447(true);
		} else {
			local90 = Static18.method249(this.anInt1428).method592(local7, arg0);
		}
		if (this.anInt1433 != 128 || this.anInt1426 != 128) {
			local90.method1428(this.anInt1433, this.anInt1426, this.anInt1433);
		}
		if (this.anInt1430 != 0) {
			if (this.anInt1430 == 90) {
				local90.method1450();
			}
			if (this.anInt1430 == 180) {
				local90.method1450();
				local90.method1450();
			}
			if (this.anInt1430 == 270) {
				local90.method1450();
				local90.method1450();
				local90.method1450();
			}
		}
		return local90;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lclient!rc;B)V")
	public void method890(@OriginalArg(0) Class1_Sub5 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method716();
			if (local11 == 0) {
				return;
			}
			this.method888(arg0, local11);
		}
	}
}
