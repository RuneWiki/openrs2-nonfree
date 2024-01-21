import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public final class Class3_Sub3_Sub11 extends Class3_Sub3 {

	@OriginalMember(owner = "client!rc", name = "Z", descriptor = "I")
	public int anInt2488;

	@OriginalMember(owner = "client!rc", name = "ub", descriptor = "I")
	private int anInt2502;

	@OriginalMember(owner = "client!rc", name = "U", descriptor = "I")
	private int anInt2483 = 128;

	@OriginalMember(owner = "client!rc", name = "fb", descriptor = "I")
	private int anInt2492 = 0;

	@OriginalMember(owner = "client!rc", name = "X", descriptor = "I")
	private int anInt2486 = 0;

	@OriginalMember(owner = "client!rc", name = "eb", descriptor = "I")
	private int anInt2491 = 0;

	@OriginalMember(owner = "client!rc", name = "jb", descriptor = "[I")
	private final int[] anIntArray368 = new int[6];

	@OriginalMember(owner = "client!rc", name = "pb", descriptor = "I")
	private int anInt2498 = 128;

	@OriginalMember(owner = "client!rc", name = "W", descriptor = "I")
	public int anInt2485 = -1;

	@OriginalMember(owner = "client!rc", name = "nb", descriptor = "[I")
	private final int[] anIntArray369 = new int[6];

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!wd;I)V")
	public void method1707(@OriginalArg(0) Class3_Sub11 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1421();
			if (local5 == 0) {
				return;
			}
			this.method1711(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)Lclient!de;")
	public Class3_Sub3_Sub1_Sub1 method1710(@OriginalArg(1) int arg0) {
		@Pc(13) Class3_Sub3_Sub1_Sub1 local13 = (Class3_Sub3_Sub1_Sub1) Static28.aClass21_14.method658((long) this.anInt2488);
		if (local13 == null) {
			local13 = Static21.method398(Static39.aClass54_18, this.anInt2502);
			if (local13 == null) {
				return null;
			}
			for (@Pc(27) int local27 = 0; local27 < 6; local27++) {
				if (this.anIntArray369[0] != 0) {
					local13.method406(this.anIntArray369[local27], this.anIntArray368[local27]);
				}
			}
			local13.method396();
			local13.method407(this.anInt2486 + 64, 850 - -this.anInt2492, -30, -50, -30, true);
			Static28.aClass21_14.method660(local13, (long) this.anInt2488);
		}
		@Pc(96) Class3_Sub3_Sub1_Sub1 local96;
		if (this.anInt2485 == -1 || arg0 == -1) {
			local96 = local13.method422(true);
		} else {
			local96 = Static16.method298(this.anInt2485).method1801(arg0, local13);
		}
		if (this.anInt2483 != 128 || this.anInt2498 != 128) {
			local96.method418(this.anInt2483, this.anInt2498, this.anInt2483);
		}
		if (this.anInt2491 != 0) {
			if (this.anInt2491 == 90) {
				local96.method408();
			}
			if (this.anInt2491 == 180) {
				local96.method408();
				local96.method408();
			}
			if (this.anInt2491 == 270) {
				local96.method408();
				local96.method408();
				local96.method408();
			}
		}
		return local96;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!wd;II)V")
	private void method1711(@OriginalArg(0) Class3_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2502 = arg0.method1451();
		} else if (arg1 == 2) {
			this.anInt2485 = arg0.method1451();
		} else if (arg1 == 4) {
			this.anInt2483 = arg0.method1451();
		} else if (arg1 == 5) {
			this.anInt2498 = arg0.method1451();
		} else if (arg1 == 6) {
			this.anInt2491 = arg0.method1451();
		} else if (arg1 == 7) {
			this.anInt2486 = arg0.method1421();
		} else if (arg1 == 8) {
			this.anInt2492 = arg0.method1421();
		} else if (arg1 >= 40 && arg1 < 50) {
			this.anIntArray369[arg1 - 40] = arg0.method1451();
		} else if (arg1 >= 50 && arg1 < 60) {
			this.anIntArray368[arg1 - 50] = arg0.method1451();
		}
	}
}
