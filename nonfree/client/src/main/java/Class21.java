import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cd")
public final class Class21 {

	@OriginalMember(owner = "client!cd", name = "j", descriptor = "[J")
	public static long[] aLongArray2 = new long[256];

	@OriginalMember(owner = "client!cd", name = "h", descriptor = "[I")
	private int[] anIntArray47;

	@OriginalMember(owner = "client!cd", name = "g", descriptor = "[I")
	private int[] anIntArray46;

	@OriginalMember(owner = "client!cd", name = "k", descriptor = "Lclient!fb;")
	private Class1_Sub1 aClass1_Sub1_2;

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "Lclient!fb;")
	private Class1_Sub1 aClass1_Sub1_1;

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "[Lclient!fb;")
	private Class1_Sub1[] aClass1_Sub1Array4;

	static {
		for (@Pc(12) int local12 = 0; local12 < 256; local12++) {
			@Pc(16) long local16 = (long) local12;
			for (@Pc(18) int local18 = 0; local18 < 8; local18++) {
				if ((local16 & 0x1L) == 1L) {
					local16 = local16 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local16 >>>= 0x1;
				}
			}
			aLongArray2[local12] = local16;
		}
	}

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Lclient!vf;)V")
	public Class21(@OriginalArg(0) Class1_Sub26 arg0) {
		@Pc(7) int local7 = arg0.method2945();
		this.aClass1_Sub1Array4 = new Class1_Sub1[local7];
		@Pc(13) int local13 = 0;
		@Pc(16) int[][] local16 = new int[local7][];
		@Pc(18) int local18 = 0;
		@Pc(50) int local50;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class1_Sub1 local26 = Static35.method699(arg0);
			if (local26.method3717() >= 0) {
				local13++;
			}
			if (local26.method3714() >= 0) {
				local18++;
			}
			@Pc(43) int local43 = local26.aClass1_Sub1Array42.length;
			local16[local20] = new int[local43];
			for (local50 = 0; local50 < local43; local50++) {
				local16[local20][local50] = arg0.method2945();
			}
			this.aClass1_Sub1Array4[local20] = local26;
		}
		this.anIntArray46 = new int[local13];
		local13 = 0;
		this.anIntArray47 = new int[local18];
		local18 = 0;
		for (@Pc(91) int local91 = 0; local91 < local7; local91++) {
			@Pc(98) Class1_Sub1 local98 = this.aClass1_Sub1Array4[local91];
			local50 = local98.aClass1_Sub1Array42.length;
			for (@Pc(104) int local104 = 0; local104 < local50; local104++) {
				local98.aClass1_Sub1Array42[local104] = this.aClass1_Sub1Array4[local16[local91][local104]];
			}
			@Pc(130) int local130 = local98.method3717();
			@Pc(134) int local134 = local98.method3714();
			if (local130 > 0) {
				this.anIntArray46[local13++] = local130;
			}
			if (local134 > 0) {
				this.anIntArray47[local18++] = local134;
			}
			local16[local91] = null;
		}
		this.aClass1_Sub1_2 = this.aClass1_Sub1Array4[arg0.method2945()];
		this.aClass1_Sub1_1 = this.aClass1_Sub1Array4[arg0.method2945()];
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!jb;IZILclient!wf;DIZ)[I")
	public int[] method480(@OriginalArg(0) Class28 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Interface4 arg3, @OriginalArg(5) double arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6) {
		Static52.method1045(arg4);
		Static150.anInterface4_2 = arg3;
		@Pc(20) int[] local20 = new int[arg2 * arg5];
		Static189.aClass28_64 = arg0;
		Static13.method328(arg2, arg5);
		for (@Pc(28) int local28 = 0; local28 < this.aClass1_Sub1Array4.length; local28++) {
			this.aClass1_Sub1Array4[local28].method3710(arg5, arg2);
		}
		@Pc(52) int local52;
		@Pc(48) int local48;
		@Pc(54) byte local54;
		if (arg6) {
			local48 = -1;
			local52 = arg2 - 1;
			local54 = -1;
		} else {
			local52 = 0;
			local48 = arg2;
			local54 = 1;
		}
		@Pc(64) int local64 = 0;
		for (@Pc(66) int local66 = 0; local66 < arg5; local66++) {
			if (arg1) {
				local64 = local66;
			}
			@Pc(88) int[] local88;
			@Pc(84) int[] local84;
			@Pc(86) int[] local86;
			if (this.aClass1_Sub1_2.aBoolean442) {
				@Pc(82) int[] local82 = this.aClass1_Sub1_2.method3705(local66);
				local84 = local82;
				local86 = local82;
				local88 = local82;
			} else {
				@Pc(98) int[][] local98 = this.aClass1_Sub1_2.method3704(local66);
				local86 = local98[2];
				local84 = local98[1];
				local88 = local98[0];
			}
			for (@Pc(112) int local112 = local52; local112 != local48; local112 += local54) {
				@Pc(120) int local120 = local84[local112] >> 4;
				@Pc(126) int local126 = local88[local112] >> 4;
				if (local120 > 255) {
					local120 = 255;
				}
				@Pc(137) int local137 = local86[local112] >> 4;
				if (local126 > 255) {
					local126 = 255;
				}
				if (local126 < 0) {
					local126 = 0;
				}
				local126 = Static72.anIntArray151[local126];
				if (local137 > 255) {
					local137 = 255;
				}
				if (local120 < 0) {
					local120 = 0;
				}
				local120 = Static72.anIntArray151[local120];
				if (local137 < 0) {
					local137 = 0;
				}
				local137 = Static72.anIntArray151[local137];
				local20[local64++] = (local126 << 16) - (-(local120 << 8) - local137);
				if (arg1) {
					local64 += arg2 - 1;
				}
			}
		}
		for (@Pc(217) int local217 = 0; local217 < this.aClass1_Sub1Array4.length; local217++) {
			this.aClass1_Sub1Array4[local217].method3709();
		}
		return local20;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZLclient!jb;Lclient!wf;)Z")
	public boolean method482(@OriginalArg(1) Class28 arg0, @OriginalArg(2) Interface4 arg1) {
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray46.length; local12++) {
			if (!arg0.method824(this.anIntArray46[local12])) {
				return false;
			}
		}
		for (@Pc(36) int local36 = 0; local36 < this.anIntArray47.length; local36++) {
			if (!arg1.method1633(this.anIntArray47[local36])) {
				return false;
			}
		}
		return true;
	}
}
