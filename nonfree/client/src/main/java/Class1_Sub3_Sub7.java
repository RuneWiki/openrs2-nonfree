import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!de")
public final class Class1_Sub3_Sub7 extends Class1_Sub3 {

	@OriginalMember(owner = "client!de", name = "S", descriptor = "I")
	private int anInt830;

	@OriginalMember(owner = "client!de", name = "nb", descriptor = "I")
	public int anInt841;

	@OriginalMember(owner = "client!de", name = "bb", descriptor = "I")
	public int anInt834 = -1;

	@OriginalMember(owner = "client!de", name = "hb", descriptor = "I")
	private int anInt838 = 0;

	@OriginalMember(owner = "client!de", name = "U", descriptor = "I")
	private int anInt832 = 0;

	@OriginalMember(owner = "client!de", name = "ab", descriptor = "[S")
	private final short[] aShortArray4 = new short[6];

	@OriginalMember(owner = "client!de", name = "sb", descriptor = "I")
	private int anInt843 = 0;

	@OriginalMember(owner = "client!de", name = "wb", descriptor = "I")
	private int anInt847 = 128;

	@OriginalMember(owner = "client!de", name = "xb", descriptor = "I")
	private int anInt848 = 128;

	@OriginalMember(owner = "client!de", name = "Z", descriptor = "[S")
	private final short[] aShortArray3 = new short[6];

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(II)Lclient!eb;")
	public Class1_Sub3_Sub4_Sub4 method584(@OriginalArg(1) int arg0) {
		@Pc(21) Class1_Sub3_Sub4_Sub4 local21 = (Class1_Sub3_Sub4_Sub4) Static49.aClass28_32.method796((long) this.anInt841);
		if (local21 == null) {
			@Pc(29) Class1_Sub3_Sub4_Sub1 local29 = Static14.method357(Static131.aClass41_33, this.anInt830);
			if (local29 == null) {
				return null;
			}
			for (@Pc(35) int local35 = 0; local35 < 6; local35++) {
				if (this.aShortArray3[0] != 0) {
					local29.method347(this.aShortArray3[local35], this.aShortArray4[local35]);
				}
			}
			local21 = local29.method356(this.anInt838 + 64, this.anInt843 + 850, -30, -50, -30);
			Static49.aClass28_32.method789(local21, (long) this.anInt841);
		}
		@Pc(93) Class1_Sub3_Sub4_Sub4 local93;
		if (this.anInt834 == -1 || arg0 == -1) {
			local93 = local21.method639(true);
		} else {
			local93 = Static77.method1316(this.anInt834).method1437(arg0, local21);
		}
		if (this.anInt847 != 128 || this.anInt848 != 128) {
			local93.method635(this.anInt847, this.anInt848, this.anInt847);
		}
		if (this.anInt832 != 0) {
			if (this.anInt832 == 90) {
				local93.method632();
			}
			if (this.anInt832 == 180) {
				local93.method632();
				local93.method632();
			}
			if (this.anInt832 == 270) {
				local93.method632();
				local93.method632();
				local93.method632();
			}
		}
		return local93;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!rd;II)V")
	private void method588(@OriginalArg(0) Class1_Sub20 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt830 = arg0.method2087();
		} else if (arg1 == 2) {
			this.anInt834 = arg0.method2087();
		} else if (arg1 == 4) {
			this.anInt847 = arg0.method2087();
		} else if (arg1 == 5) {
			this.anInt848 = arg0.method2087();
		} else if (arg1 == 6) {
			this.anInt832 = arg0.method2087();
		} else if (arg1 == 7) {
			this.anInt838 = arg0.method2053();
		} else if (arg1 == 8) {
			this.anInt843 = arg0.method2053();
		} else if (arg1 >= 40 && arg1 < 50) {
			this.aShortArray3[arg1 - 40] = (short) arg0.method2087();
			return;
		} else if (arg1 >= 50 && arg1 < 60) {
			this.aShortArray4[arg1 - 50] = (short) arg0.method2087();
			return;
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!rd;I)V")
	public void method591(@OriginalArg(0) Class1_Sub20 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2053();
			if (local5 == 0) {
				return;
			}
			this.method588(arg0, local5);
		}
	}
}
