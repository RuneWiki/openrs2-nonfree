import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hf")
public final class Class4_Sub4_Sub7 extends Class4_Sub4 {

	@OriginalMember(owner = "client!hf", name = "L", descriptor = "I")
	private int anInt1227;

	@OriginalMember(owner = "client!hf", name = "M", descriptor = "I")
	public int anInt1228;

	@OriginalMember(owner = "client!hf", name = "P", descriptor = "[S")
	private final short[] aShortArray4 = new short[6];

	@OriginalMember(owner = "client!hf", name = "N", descriptor = "I")
	private int anInt1229 = 0;

	@OriginalMember(owner = "client!hf", name = "U", descriptor = "I")
	private int anInt1233 = 0;

	@OriginalMember(owner = "client!hf", name = "Q", descriptor = "I")
	public int anInt1231 = -1;

	@OriginalMember(owner = "client!hf", name = "S", descriptor = "[S")
	private final short[] aShortArray5 = new short[6];

	@OriginalMember(owner = "client!hf", name = "O", descriptor = "I")
	private int anInt1230 = 128;

	@OriginalMember(owner = "client!hf", name = "cb", descriptor = "I")
	private int anInt1239 = 128;

	@OriginalMember(owner = "client!hf", name = "eb", descriptor = "I")
	private int anInt1241 = 0;

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lclient!re;I)V")
	public void method850(@OriginalArg(0) Class4_Sub13 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method1223();
			if (local9 == 0) {
				return;
			}
			this.method851(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IZLclient!re;)V")
	private void method851(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub13 arg1) {
		if (arg0 == 1) {
			this.anInt1227 = arg1.method1244();
		} else if (arg0 == 2) {
			this.anInt1231 = arg1.method1244();
		} else if (arg0 == 4) {
			this.anInt1239 = arg1.method1244();
		} else if (arg0 == 5) {
			this.anInt1230 = arg1.method1244();
		} else if (arg0 == 6) {
			this.anInt1229 = arg1.method1244();
		} else if (arg0 == 7) {
			this.anInt1233 = arg1.method1223();
		} else if (arg0 == 8) {
			this.anInt1241 = arg1.method1223();
		} else if (arg0 >= 40 && arg0 < 50) {
			this.aShortArray4[arg0 - 40] = (short) arg1.method1244();
			return;
		} else if (arg0 >= 50 && arg0 < 60) {
			this.aShortArray5[arg0 - 50] = (short) arg1.method1244();
			return;
		}
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(II)Lclient!rb;")
	public Class4_Sub4_Sub1_Sub6 method853(@OriginalArg(1) int arg0) {
		@Pc(18) Class4_Sub4_Sub1_Sub6 local18 = (Class4_Sub4_Sub1_Sub6) Static15.aClass48_66.method1390((long) this.anInt1228);
		if (local18 == null) {
			@Pc(26) Class4_Sub4_Sub1_Sub7 local26 = Static118.method2001(Static65.aClass40_49, this.anInt1227);
			if (local26 == null) {
				return null;
			}
			for (@Pc(32) int local32 = 0; local32 < 6; local32++) {
				if (this.aShortArray4[0] != 0) {
					local26.method1998(this.aShortArray4[local32], this.aShortArray5[local32]);
				}
			}
			local18 = local26.method2003(this.anInt1233 + 64, this.anInt1241 + 850, -30, -50, -30);
			Static15.aClass48_66.method1392(local18, (long) this.anInt1228);
		}
		@Pc(88) Class4_Sub4_Sub1_Sub6 local88;
		if (this.anInt1231 == -1 || arg0 == -1) {
			local88 = local18.method1791(true);
		} else {
			local88 = Static127.method2102(this.anInt1231).method1916(local18, arg0);
		}
		if (this.anInt1239 != 128 || this.anInt1230 != 128) {
			local88.method1793(this.anInt1239, this.anInt1230, this.anInt1239);
		}
		if (this.anInt1229 != 0) {
			if (this.anInt1229 == 90) {
				local88.method1786();
			}
			if (this.anInt1229 == 180) {
				local88.method1786();
				local88.method1786();
			}
			if (this.anInt1229 == 270) {
				local88.method1786();
				local88.method1786();
				local88.method1786();
			}
		}
		return local88;
	}
}
