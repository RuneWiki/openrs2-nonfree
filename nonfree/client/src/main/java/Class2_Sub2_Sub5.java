import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public final class Class2_Sub2_Sub5 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ee", name = "Q", descriptor = "Lclient!o;")
	public static Class40 aClass40_179 = Static12.method257("*6n*6nRecovery Questions Last Set:*6n@gre@");

	@OriginalMember(owner = "client!ee", name = "Y", descriptor = "Lclient!o;")
	public static Class40 aClass40_180 = Static12.method257("Loading wordpack )2 0(U");

	@OriginalMember(owner = "client!ee", name = "ib", descriptor = "Lclient!od;")
	public static Class44 aClass44_4 = new Class44();

	@OriginalMember(owner = "client!ee", name = "mb", descriptor = "Lclient!o;")
	public static Class40 aClass40_184 = Static12.method257("Login to a members(W server to use this object)3");

	@OriginalMember(owner = "client!ee", name = "jb", descriptor = "Lclient!o;")
	public static Class40 aClass40_181 = aClass40_184;

	@OriginalMember(owner = "client!ee", name = "lb", descriptor = "Lclient!o;")
	public static Class40 aClass40_183 = Static12.method257("You have @gre@");

	@OriginalMember(owner = "client!ee", name = "kb", descriptor = "Lclient!o;")
	public static Class40 aClass40_182 = Static12.method257("::fpsoff");

	@OriginalMember(owner = "client!ee", name = "ob", descriptor = "I")
	public static int anInt641 = 0;

	@OriginalMember(owner = "client!ee", name = "X", descriptor = "I")
	public int anInt634;

	@OriginalMember(owner = "client!ee", name = "fb", descriptor = "I")
	private int anInt639;

	@OriginalMember(owner = "client!ee", name = "T", descriptor = "I")
	private int anInt630 = 0;

	@OriginalMember(owner = "client!ee", name = "W", descriptor = "I")
	private int anInt633 = 128;

	@OriginalMember(owner = "client!ee", name = "O", descriptor = "I")
	private int anInt627 = 128;

	@OriginalMember(owner = "client!ee", name = "S", descriptor = "[I")
	private final int[] anIntArray113 = new int[6];

	@OriginalMember(owner = "client!ee", name = "hb", descriptor = "I")
	public int anInt640 = -1;

	@OriginalMember(owner = "client!ee", name = "bb", descriptor = "I")
	private int anInt636 = 0;

	@OriginalMember(owner = "client!ee", name = "ab", descriptor = "[I")
	private final int[] anIntArray114 = new int[6];

	@OriginalMember(owner = "client!ee", name = "P", descriptor = "I")
	private int anInt628 = 0;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(BI)Lclient!ne;", line = 6)
	public Class2_Sub2_Sub12_Sub4 method501(@OriginalArg(1) int arg0) {
		@Pc(13) Class2_Sub2_Sub12_Sub4 local13 = (Class2_Sub2_Sub12_Sub4) Class42.aClass47_15.method1325((long) this.anInt634);
		if (local13 == null) {
			local13 = Static65.method1163(Static84.aClass5_28, this.anInt639);
			if (local13 == null) {
				return null;
			}
			for (@Pc(27) int local27 = 0; local27 < 6; local27++) {
				if (this.anIntArray113[0] != 0) {
					local13.method1140(this.anIntArray113[local27], this.anIntArray114[local27]);
				}
			}
			local13.method1160();
			local13.method1153(this.anInt636 + 64, this.anInt630 + 850, -30, -50, -30, true);
			Class42.aClass47_15.method1332((long) this.anInt634, local13);
		}
		@Pc(92) Class2_Sub2_Sub12_Sub4 local92;
		if (this.anInt640 == -1 || arg0 == -1) {
			local92 = local13.method1147(true);
		} else {
			local92 = Static57.method1042(this.anInt640).method518(local13, arg0);
		}
		if (this.anInt627 != 128 || this.anInt633 != 128) {
			local92.method1156(this.anInt627, this.anInt633, this.anInt627);
		}
		if (this.anInt628 != 0) {
			if (this.anInt628 == 90) {
				local92.method1148();
			}
			if (this.anInt628 == 180) {
				local92.method1148();
				local92.method1148();
			}
			if (this.anInt628 == 270) {
				local92.method1148();
				local92.method1148();
				local92.method1148();
			}
		}
		return local92;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILclient!eb;)V", line = 937)
	public void method504(@OriginalArg(1) Class2_Sub3 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1708();
			if (local5 == 0) {
				return;
			}
			this.method505(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IILclient!eb;)V", line = 967)
	private void method505(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub3 arg1) {
		if (arg0 == 1) {
			this.anInt639 = arg1.method1704();
		} else if (arg0 == 2) {
			this.anInt640 = arg1.method1704();
		} else if (arg0 == 4) {
			this.anInt627 = arg1.method1704();
		} else if (arg0 == 5) {
			this.anInt633 = arg1.method1704();
		} else if (arg0 == 6) {
			this.anInt628 = arg1.method1704();
		} else if (arg0 == 7) {
			this.anInt636 = arg1.method1708();
		} else if (arg0 == 8) {
			this.anInt630 = arg1.method1708();
		} else if (arg0 >= 40 && arg0 < 50) {
			this.anIntArray113[arg0 - 40] = arg1.method1704();
		} else if (arg0 >= 50 && arg0 < 60) {
			this.anIntArray114[arg0 - 50] = arg1.method1704();
		}
	}
}
