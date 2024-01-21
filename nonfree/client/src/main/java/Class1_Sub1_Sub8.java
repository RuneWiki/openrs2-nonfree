import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!j")
public final class Class1_Sub1_Sub8 extends Class1_Sub1 {

	@OriginalMember(owner = "client!j", name = "ab", descriptor = "I")
	private int anInt1181;

	@OriginalMember(owner = "client!j", name = "nb", descriptor = "I")
	public int anInt1192;

	@OriginalMember(owner = "client!j", name = "bb", descriptor = "I")
	private int anInt1182 = 128;

	@OriginalMember(owner = "client!j", name = "db", descriptor = "I")
	private int anInt1184 = 0;

	@OriginalMember(owner = "client!j", name = "ib", descriptor = "[S")
	private final short[] aShortArray7 = new short[6];

	@OriginalMember(owner = "client!j", name = "jb", descriptor = "I")
	private int anInt1188 = 0;

	@OriginalMember(owner = "client!j", name = "gb", descriptor = "I")
	private int anInt1187 = 0;

	@OriginalMember(owner = "client!j", name = "hb", descriptor = "[S")
	private final short[] aShortArray6 = new short[6];

	@OriginalMember(owner = "client!j", name = "xb", descriptor = "I")
	public int anInt1200 = -1;

	@OriginalMember(owner = "client!j", name = "cb", descriptor = "I")
	private int anInt1183 = 128;

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(ILclient!id;)V")
	public void method908(@OriginalArg(1) Class1_Sub6 arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.method1837();
			if (local10 == 0) {
				return;
			}
			this.method914(local10, arg0);
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IILclient!id;)V")
	private void method914(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub6 arg1) {
		if (arg0 == 1) {
			this.anInt1181 = arg1.method1842();
		} else if (arg0 == 2) {
			this.anInt1200 = arg1.method1842();
		} else if (arg0 == 4) {
			this.anInt1182 = arg1.method1842();
		} else if (arg0 == 5) {
			this.anInt1183 = arg1.method1842();
		} else if (arg0 == 6) {
			this.anInt1188 = arg1.method1842();
		} else if (arg0 == 7) {
			this.anInt1184 = arg1.method1837();
		} else if (arg0 == 8) {
			this.anInt1187 = arg1.method1837();
		} else if (arg0 >= 40 && arg0 < 50) {
			this.aShortArray7[arg0 - 40] = (short) arg1.method1842();
		} else if (arg0 >= 50 && arg0 < 60) {
			this.aShortArray6[arg0 - 50] = (short) arg1.method1842();
		}
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(II)Lclient!ue;")
	public Class1_Sub1_Sub2_Sub7 method915(@OriginalArg(1) int arg0) {
		@Pc(13) Class1_Sub1_Sub2_Sub7 local13 = (Class1_Sub1_Sub2_Sub7) Static113.aClass19_66.method410((long) this.anInt1192);
		if (local13 == null) {
			@Pc(27) Class1_Sub1_Sub2_Sub3 local27 = Static59.method1010(Static116.aClass41_75, this.anInt1181);
			if (local27 == null) {
				return null;
			}
			for (@Pc(33) int local33 = 0; local33 < 6; local33++) {
				if (this.aShortArray7[0] != 0) {
					local27.method1013(this.aShortArray7[local33], this.aShortArray6[local33]);
				}
			}
			local13 = local27.method1002(this.anInt1184 + 64, this.anInt1187 + 850, -30, -50, -30);
			Static113.aClass19_66.method409(local13, (long) this.anInt1192);
		}
		@Pc(91) Class1_Sub1_Sub2_Sub7 local91;
		if (this.anInt1200 == -1 || arg0 == -1) {
			local91 = local13.method1920(true);
		} else {
			local91 = Static10.method254(this.anInt1200).method448(arg0, local13);
		}
		if (this.anInt1182 != 128 || this.anInt1183 != 128) {
			local91.method1913(this.anInt1182, this.anInt1183, this.anInt1182);
		}
		if (this.anInt1188 != 0) {
			if (this.anInt1188 == 90) {
				local91.method1915();
			}
			if (this.anInt1188 == 180) {
				local91.method1915();
				local91.method1915();
			}
			if (this.anInt1188 == 270) {
				local91.method1915();
				local91.method1915();
				local91.method1915();
			}
		}
		return local91;
	}
}
