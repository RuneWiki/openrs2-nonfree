import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cd")
public final class Class3_Sub1_Sub3 extends Class3_Sub1 {

	@OriginalMember(owner = "client!cd", name = "Z", descriptor = "I")
	private int anInt456;

	@OriginalMember(owner = "client!cd", name = "eb", descriptor = "I")
	public int anInt461;

	@OriginalMember(owner = "client!cd", name = "db", descriptor = "I")
	private int anInt460 = 0;

	@OriginalMember(owner = "client!cd", name = "jb", descriptor = "[S")
	private final short[] aShortArray3 = new short[6];

	@OriginalMember(owner = "client!cd", name = "cb", descriptor = "I")
	private int anInt459 = 0;

	@OriginalMember(owner = "client!cd", name = "Y", descriptor = "I")
	private int anInt455 = 0;

	@OriginalMember(owner = "client!cd", name = "fb", descriptor = "[S")
	private final short[] aShortArray2 = new short[6];

	@OriginalMember(owner = "client!cd", name = "mb", descriptor = "I")
	private int anInt465 = 128;

	@OriginalMember(owner = "client!cd", name = "ob", descriptor = "I")
	private int anInt467 = 128;

	@OriginalMember(owner = "client!cd", name = "wb", descriptor = "I")
	public int anInt470 = -1;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILclient!b;Z)V")
	private void method339(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub2 arg1) {
		if (arg0 == 1) {
			this.anInt456 = arg1.method276();
		} else if (arg0 == 2) {
			this.anInt470 = arg1.method276();
		} else if (arg0 == 4) {
			this.anInt465 = arg1.method276();
		} else if (arg0 == 5) {
			this.anInt467 = arg1.method276();
		} else if (arg0 == 6) {
			this.anInt460 = arg1.method276();
		} else if (arg0 == 7) {
			this.anInt455 = arg1.method270();
		} else if (arg0 == 8) {
			this.anInt459 = arg1.method270();
		} else if (arg0 >= 40 && arg0 < 50) {
			this.aShortArray3[arg0 - 40] = (short) arg1.method276();
		} else if (arg0 >= 50 && arg0 < 60) {
			this.aShortArray2[arg0 - 50] = (short) arg1.method276();
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(BI)Lclient!t;")
	public Class3_Sub1_Sub2_Sub6 method341(@OriginalArg(1) int arg0) {
		@Pc(9) Class3_Sub1_Sub2_Sub6 local9 = (Class3_Sub1_Sub2_Sub6) Static94.aClass52_50.method1342((long) this.anInt461);
		if (local9 == null) {
			@Pc(21) Class3_Sub1_Sub2_Sub1 local21 = Static10.method222(Static105.aClass44_57, this.anInt456);
			if (local21 == null) {
				return null;
			}
			for (@Pc(27) int local27 = 0; local27 < 6; local27++) {
				if (this.aShortArray3[0] != 0) {
					local21.method223(this.aShortArray3[local27], this.aShortArray2[local27]);
				}
			}
			local9 = local21.method215(this.anInt455 + 64, this.anInt459 + 850, -30, -50, -30);
			Static94.aClass52_50.method1344(local9, (long) this.anInt461);
		}
		@Pc(95) Class3_Sub1_Sub2_Sub6 local95;
		if (this.anInt470 == -1 || arg0 == -1) {
			local95 = local9.method1792(true);
		} else {
			local95 = Static41.method770(this.anInt470).method595(local9, arg0);
		}
		if (this.anInt465 != 128 || this.anInt467 != 128) {
			local95.method1793(this.anInt465, this.anInt467, this.anInt465);
		}
		if (this.anInt460 != 0) {
			if (this.anInt460 == 90) {
				local95.method1784();
			}
			if (this.anInt460 == 180) {
				local95.method1784();
				local95.method1784();
			}
			if (this.anInt460 == 270) {
				local95.method1784();
				local95.method1784();
				local95.method1784();
			}
		}
		return local95;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILclient!b;)V")
	public void method345(@OriginalArg(1) Class3_Sub2 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method270();
			if (local9 == 0) {
				return;
			}
			this.method339(local9, arg0);
		}
	}
}
