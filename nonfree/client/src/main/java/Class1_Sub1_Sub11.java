import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ob")
public final class Class1_Sub1_Sub11 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ob", name = "ab", descriptor = "[I")
	public static int[] anIntArray247 = new int[256];

	@OriginalMember(owner = "client!ob", name = "S", descriptor = "I")
	public int anInt1776;

	@OriginalMember(owner = "client!ob", name = "gb", descriptor = "I")
	private int anInt1785;

	@OriginalMember(owner = "client!ob", name = "X", descriptor = "[I")
	private final int[] anIntArray246 = new int[6];

	@OriginalMember(owner = "client!ob", name = "db", descriptor = "I")
	public int anInt1784 = -1;

	@OriginalMember(owner = "client!ob", name = "W", descriptor = "I")
	private int anInt1780 = 0;

	@OriginalMember(owner = "client!ob", name = "nb", descriptor = "[I")
	private final int[] anIntArray249 = new int[6];

	@OriginalMember(owner = "client!ob", name = "ib", descriptor = "I")
	private int anInt1787 = 0;

	@OriginalMember(owner = "client!ob", name = "hb", descriptor = "I")
	private int anInt1786 = 0;

	@OriginalMember(owner = "client!ob", name = "qb", descriptor = "I")
	private int anInt1792 = 128;

	@OriginalMember(owner = "client!ob", name = "kb", descriptor = "I")
	private int anInt1789 = 128;

	static {
		for (@Pc(21) int local21 = 0; local21 < 256; local21++) {
			@Pc(24) int local24 = local21;
			for (@Pc(26) int local26 = 0; local26 < 8; local26++) {
				if ((local24 & 0x1) == 1) {
					local24 = local24 >>> 1 ^ 0xEDB88320;
				} else {
					local24 >>>= 0x1;
				}
			}
			anIntArray247[local21] = local24;
		}
	}

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "(II)Lclient!pc;")
	public Class1_Sub1_Sub8_Sub3 method1256(@OriginalArg(1) int arg0) {
		@Pc(16) Class1_Sub1_Sub8_Sub3 local16 = (Class1_Sub1_Sub8_Sub3) Static43.aClass37_17.method982((long) this.anInt1776);
		if (local16 == null) {
			local16 = Static76.method1372(Static53.aClass33_32, this.anInt1785);
			if (local16 == null) {
				return null;
			}
			for (@Pc(34) int local34 = 0; local34 < 6; local34++) {
				if (this.anIntArray249[0] != 0) {
					local16.method1383(this.anIntArray249[local34], this.anIntArray246[local34]);
				}
			}
			local16.method1377();
			local16.method1394(this.anInt1780 + 64, this.anInt1786 + 850, -30, -50, -30, true);
			Static43.aClass37_17.method981((long) this.anInt1776, local16);
		}
		@Pc(93) Class1_Sub1_Sub8_Sub3 local93;
		if (this.anInt1784 == -1 || arg0 == -1) {
			local93 = local16.method1368(true);
		} else {
			local93 = Static30.method574(this.anInt1784).method1623(arg0, local16);
		}
		if (this.anInt1792 != 128 || this.anInt1789 != 128) {
			local93.method1364(this.anInt1792, this.anInt1789, this.anInt1792);
		}
		if (this.anInt1787 != 0) {
			if (this.anInt1787 == 90) {
				local93.method1390();
			}
			if (this.anInt1787 == 180) {
				local93.method1390();
				local93.method1390();
			}
			if (this.anInt1787 == 270) {
				local93.method1390();
				local93.method1390();
				local93.method1390();
			}
		}
		return local93;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!ka;I)V")
	public void method1260(@OriginalArg(0) Class1_Sub8 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method1186();
			if (local11 == 0) {
				return;
			}
			this.method1262(local11, arg0);
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILclient!ka;I)V")
	private void method1262(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub8 arg1) {
		if (arg0 == 1) {
			this.anInt1785 = arg1.method1199();
		} else if (arg0 == 2) {
			this.anInt1784 = arg1.method1199();
		} else if (arg0 == 4) {
			this.anInt1792 = arg1.method1199();
		} else if (arg0 == 5) {
			this.anInt1789 = arg1.method1199();
		} else if (arg0 == 6) {
			this.anInt1787 = arg1.method1199();
		} else if (arg0 == 7) {
			this.anInt1780 = arg1.method1186();
		} else if (arg0 == 8) {
			this.anInt1786 = arg1.method1186();
		} else if (arg0 >= 40 && arg0 < 50) {
			this.anIntArray249[arg0 - 40] = arg1.method1199();
		} else if (arg0 >= 50 && arg0 < 60) {
			this.anIntArray246[arg0 - 50] = arg1.method1199();
		}
	}
}
