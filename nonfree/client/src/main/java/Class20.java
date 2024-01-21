import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public abstract class Class20 {

	@OriginalMember(owner = "client!pd", name = "y", descriptor = "[I")
	public static int[] anIntArray79 = new int[256];

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "I")
	private int anInt707;

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "Lclient!cb;")
	private Class14 aClass14_2;

	@OriginalMember(owner = "client!pd", name = "e", descriptor = "[I")
	protected int[] anIntArray76;

	@OriginalMember(owner = "client!pd", name = "i", descriptor = "[[I")
	private int[][] anIntArrayArray6;

	@OriginalMember(owner = "client!pd", name = "j", descriptor = "[I")
	private int[] anIntArray77;

	@OriginalMember(owner = "client!pd", name = "l", descriptor = "[[I")
	private int[][] anIntArrayArray7;

	@OriginalMember(owner = "client!pd", name = "q", descriptor = "[Lclient!cb;")
	private Class14[] aClass14Array2;

	@OriginalMember(owner = "client!pd", name = "x", descriptor = "I")
	protected int anInt719;

	@OriginalMember(owner = "client!pd", name = "z", descriptor = "[Ljava/lang/Object;")
	protected Object[] anObjectArray2;

	@OriginalMember(owner = "client!pd", name = "D", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray2;

	@OriginalMember(owner = "client!pd", name = "F", descriptor = "[I")
	protected int[] anIntArray80;

	@OriginalMember(owner = "client!pd", name = "J", descriptor = "[I")
	private int[] anIntArray81;

	@OriginalMember(owner = "client!pd", name = "O", descriptor = "[I")
	protected int[] anIntArray82;

	@OriginalMember(owner = "client!pd", name = "R", descriptor = "I")
	public int anInt731;

	@OriginalMember(owner = "client!pd", name = "p", descriptor = "Z")
	private final boolean aBoolean30;

	@OriginalMember(owner = "client!pd", name = "I", descriptor = "Z")
	private final boolean aBoolean31;

	static {
		for (@Pc(26) int local26 = 0; local26 < 256; local26++) {
			@Pc(29) int local29 = local26;
			for (@Pc(31) int local31 = 0; local31 < 8; local31++) {
				if ((local29 & 0x1) == 1) {
					local29 = local29 >>> 1 ^ 0xEDB88320;
				} else {
					local29 >>>= 0x1;
				}
			}
			anIntArray79[local26] = local29;
		}
	}

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(ZZ)V")
	protected Class20(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean30 = arg1;
		this.aBoolean31 = arg0;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)Z")
	public final boolean method466() {
		@Pc(7) boolean local7 = true;
		for (@Pc(9) int local9 = 0; local9 < this.anIntArray81.length; local9++) {
			@Pc(24) int local24 = this.anIntArray81[local9];
			if (this.anObjectArray2[local24] == null) {
				this.method485(local24);
				if (this.anObjectArray2[local24] == null) {
					local7 = false;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(II[I)Z")
	private boolean method467(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.anObjectArray2[arg0] == null) {
			return false;
		}
		@Pc(15) int local15 = this.anIntArray80[arg0];
		@Pc(20) int[] local20 = this.anIntArrayArray6[arg0];
		@Pc(25) Object[] local25 = this.anObjectArrayArray2[arg0];
		@Pc(27) boolean local27 = true;
		for (@Pc(29) int local29 = 0; local29 < local15; local29++) {
			if (local25[local20[local29]] == null) {
				local27 = false;
				break;
			}
		}
		if (local27) {
			return true;
		}
		@Pc(83) byte[] local83;
		if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
			local83 = Static14.method244(this.anObjectArray2[arg0], false);
		} else {
			local83 = Static14.method244(this.anObjectArray2[arg0], true);
			@Pc(97) Class4_Sub16 local97 = new Class4_Sub16(local83);
			local97.method1484(local97.aByteArray22.length, arg1);
		}
		@Pc(111) byte[] local111;
		try {
			local111 = Static72.method537(local83);
		} catch (@Pc(113) RuntimeException local113) {
			throw Static20.method390(local113, "T3 - " + (arg1 != null) + "," + arg0 + "," + local83.length + "," + Static31.method544(local83, local83.length) + "," + Static31.method544(local83, local83.length - 2) + "," + this.anIntArray76[arg0] + "," + this.anInt731);
		}
		if (this.aBoolean31) {
			this.anObjectArray2[arg0] = null;
		}
		if (local15 > 1) {
			@Pc(200) int local200 = local111.length;
			@Pc(203) int local203 = local200 - 1;
			@Pc(207) int local207 = local111[local203] & 0xFF;
			@Pc(215) int local215 = local203 - local15 * local207 * 4;
			@Pc(220) Class4_Sub16 local220 = new Class4_Sub16(local111);
			@Pc(223) int[] local223 = new int[local15];
			local220.anInt2019 = local215;
			@Pc(233) int local233;
			for (@Pc(228) int local228 = 0; local228 < local207; local228++) {
				@Pc(231) int local231 = 0;
				for (local233 = 0; local233 < local15; local233++) {
					local231 += local220.method1486();
					local223[local233] += local231;
				}
			}
			@Pc(262) byte[][] local262 = new byte[local15][];
			for (local233 = 0; local233 < local15; local233++) {
				local262[local233] = new byte[local223[local233]];
				local223[local233] = 0;
			}
			local220.anInt2019 = local215;
			@Pc(289) int local289 = 0;
			@Pc(294) int local294;
			for (@Pc(291) int local291 = 0; local291 < local207; local291++) {
				local294 = 0;
				for (@Pc(296) int local296 = 0; local296 < local15; local296++) {
					local294 += local220.method1486();
					Static134.method1168(local111, local289, local262[local296], local223[local296], local294);
					local223[local296] += local294;
					local289 += local294;
				}
			}
			for (local294 = 0; local294 < local15; local294++) {
				if (this.aBoolean30) {
					local25[local20[local294]] = local262[local294];
				} else {
					local25[local20[local294]] = Static71.method1198(local262[local294]);
				}
			}
		} else if (this.aBoolean30) {
			local25[local20[0]] = local111;
		} else {
			local25[local20[0]] = Static71.method1198(local111);
		}
		return true;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)I")
	public final int method468() {
		return this.anObjectArrayArray2.length;
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(II)V")
	protected void method470(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "(II)I")
	public final int method471(@OriginalArg(1) int arg0) {
		return this.anObjectArrayArray2[arg0].length;
	}

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "(II)Z")
	public final boolean method472(@OriginalArg(0) int arg0) {
		if (this.anObjectArray2[arg0] == null) {
			this.method485(arg0);
			return this.anObjectArray2[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(BLclient!ja;)V")
	public final void method473(@OriginalArg(1) Class39 arg0) {
		@Pc(15) Class39 local15 = arg0.method950();
		@Pc(23) int local23 = this.aClass14_2.method248(local15.method967());
		if (local23 >= 0) {
			this.method470(local23);
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(III)[B")
	public final byte[] method474(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.method483(arg0, null, arg1);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lclient!ja;BI)I")
	public final int method475(@OriginalArg(0) Class39 arg0, @OriginalArg(2) int arg1) {
		@Pc(3) Class39 local3 = arg0.method950();
		return this.aClass14Array2[arg1].method248(local3.method967());
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lclient!ja;Lclient!ja;Z)[B")
	public final byte[] method477(@OriginalArg(0) Class39 arg0, @OriginalArg(1) Class39 arg1) {
		@Pc(7) Class39 local7 = arg0.method950();
		@Pc(11) Class39 local11 = arg1.method950();
		@Pc(19) int local19 = this.aClass14_2.method248(local7.method967());
		@Pc(29) int local29 = this.aClass14Array2[local19].method248(local11.method967());
		return this.method474(local19, local29);
	}

	@OriginalMember(owner = "client!pd", name = "e", descriptor = "(II)[I")
	public final int[] method479(@OriginalArg(0) int arg0) {
		return this.anIntArrayArray6[arg0];
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(I)V")
	public final void method480() {
		for (@Pc(5) int local5 = 0; local5 < this.anObjectArrayArray2.length; local5++) {
			if (this.anObjectArrayArray2[local5] != null) {
				for (@Pc(13) int local13 = 0; local13 < this.anObjectArrayArray2[local5].length; local13++) {
					this.anObjectArrayArray2[local5][local13] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIB)[B")
	public final byte[] method481(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 < 0 || this.anObjectArrayArray2.length <= arg0 || this.anObjectArrayArray2[arg0] == null || arg1 < 0 || this.anObjectArrayArray2[arg0].length <= arg1) {
			return null;
		}
		if (this.anObjectArrayArray2[arg0][arg1] == null) {
			@Pc(47) boolean local47 = this.method467(arg0, null);
			if (!local47) {
				this.method485(arg0);
				local47 = this.method467(arg0, null);
				if (!local47) {
					return null;
				}
			}
		}
		return Static14.method244(this.anObjectArrayArray2[arg0][arg1], false);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(ZI)[B")
	public final byte[] method482(@OriginalArg(1) int arg0) {
		if (this.anObjectArrayArray2.length == 1) {
			return this.method481(0, arg0);
		} else if (this.anObjectArrayArray2[arg0].length == 1) {
			return this.method481(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(II[II)[B")
	public final byte[] method483(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		if (arg0 < 0 || arg0 >= this.anObjectArrayArray2.length || this.anObjectArrayArray2[arg0] == null || arg2 < 0 || this.anObjectArrayArray2[arg0].length <= arg2) {
			return null;
		}
		if (this.anObjectArrayArray2[arg0][arg2] == null) {
			@Pc(46) boolean local46 = this.method467(arg0, arg1);
			if (!local46) {
				this.method485(arg0);
				local46 = this.method467(arg0, arg1);
				if (!local46) {
					return null;
				}
			}
		}
		@Pc(80) byte[] local80 = Static14.method244(this.anObjectArrayArray2[arg0][arg2], false);
		if (this.aBoolean30) {
			this.anObjectArrayArray2[arg0][arg2] = null;
		}
		return local80;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILclient!ja;)I")
	public final int method484(@OriginalArg(1) Class39 arg0) {
		@Pc(16) Class39 local16 = arg0.method950();
		return this.aClass14_2.method248(local16.method967());
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IB)V")
	protected void method485(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!pd", name = "f", descriptor = "(II)[B")
	public final byte[] method486(@OriginalArg(1) int arg0) {
		if (this.anObjectArrayArray2.length == 1) {
			return this.method474(0, arg0);
		} else if (this.anObjectArrayArray2[arg0].length == 1) {
			return this.method474(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(BLclient!ja;Lclient!ja;)Z")
	public final boolean method487(@OriginalArg(1) Class39 arg0, @OriginalArg(2) Class39 arg1) {
		@Pc(7) Class39 local7 = arg1.method950();
		@Pc(11) Class39 local11 = arg0.method950();
		@Pc(19) int local19 = this.aClass14_2.method248(local7.method967());
		@Pc(29) int local29 = this.aClass14Array2[local19].method248(local11.method967());
		return this.method491(local19, local29);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "([BZ)V")
	protected final void method488(@OriginalArg(0) byte[] arg0) {
		this.anInt731 = Static31.method544(arg0, arg0.length);
		@Pc(15) Class4_Sub16 local15 = new Class4_Sub16(Static72.method537(arg0));
		@Pc(19) int local19 = local15.method1474();
		if (local19 != 5 && local19 != 6) {
			throw new RuntimeException("Incorrect JS5 protocol number: " + local19);
		}
		@Pc(46) int local46 = 0;
		if (local19 < 6) {
			this.anInt719 = 0;
		} else {
			this.anInt719 = local15.method1486();
		}
		@Pc(65) int local65 = local15.method1474();
		this.anInt707 = local15.method1490();
		this.anIntArray81 = new int[this.anInt707];
		@Pc(77) int local77 = -1;
		for (@Pc(79) int local79 = 0; local79 < this.anInt707; local79++) {
			this.anIntArray81[local79] = local46 += local15.method1490();
			if (this.anIntArray81[local79] > local77) {
				local77 = this.anIntArray81[local79];
			}
		}
		this.anIntArray80 = new int[local77 + 1];
		this.anIntArrayArray6 = new int[local77 + 1][];
		this.anObjectArrayArray2 = new Object[local77 + 1][];
		this.anObjectArray2 = new Object[local77 + 1];
		this.anIntArray82 = new int[local77 + 1];
		this.anIntArray76 = new int[local77 + 1];
		@Pc(157) int local157;
		if (local65 != 0) {
			this.anIntArray77 = new int[local77 + 1];
			for (local157 = 0; local157 < this.anInt707; local157++) {
				this.anIntArray77[this.anIntArray81[local157]] = local15.method1486();
			}
			this.aClass14_2 = new Class14(this.anIntArray77);
		}
		for (local157 = 0; local157 < this.anInt707; local157++) {
			this.anIntArray76[this.anIntArray81[local157]] = local15.method1486();
		}
		for (@Pc(206) int local206 = 0; local206 < this.anInt707; local206++) {
			this.anIntArray82[this.anIntArray81[local206]] = local15.method1486();
		}
		for (@Pc(234) int local234 = 0; local234 < this.anInt707; local234++) {
			this.anIntArray80[this.anIntArray81[local234]] = local15.method1490();
		}
		@Pc(260) int local260;
		@Pc(267) int local267;
		@Pc(275) int local275;
		@Pc(277) int local277;
		for (@Pc(253) int local253 = 0; local253 < this.anInt707; local253++) {
			local260 = this.anIntArray81[local253];
			local46 = 0;
			local267 = this.anIntArray80[local260];
			this.anIntArrayArray6[local260] = new int[local267];
			local275 = -1;
			for (local277 = 0; local277 < local267; local277++) {
				@Pc(294) int local294 = this.anIntArrayArray6[local260][local277] = local46 += local15.method1490();
				if (local275 < local294) {
					local275 = local294;
				}
			}
			this.anObjectArrayArray2[local260] = new Object[local275 + 1];
		}
		if (local65 == 0) {
			return;
		}
		this.anIntArrayArray7 = new int[local77 + 1][];
		this.aClass14Array2 = new Class14[local77 + 1];
		for (local260 = 0; local260 < this.anInt707; local260++) {
			local267 = this.anIntArray81[local260];
			local275 = this.anIntArray80[local267];
			this.anIntArrayArray7[local267] = new int[this.anObjectArrayArray2[local267].length];
			for (local277 = 0; local277 < local275; local277++) {
				this.anIntArrayArray7[local267][this.anIntArrayArray6[local267][local277]] = local15.method1486();
			}
			this.aClass14Array2[local267] = new Class14(this.anIntArrayArray7[local267]);
		}
	}

	@OriginalMember(owner = "client!pd", name = "g", descriptor = "(II)V")
	public final void method489(@OriginalArg(0) int arg0) {
		for (@Pc(7) int local7 = 0; local7 < this.anObjectArrayArray2[arg0].length; local7++) {
			this.anObjectArrayArray2[arg0][local7] = null;
		}
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(III)Z")
	public final boolean method491(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 < 0 || this.anObjectArrayArray2.length <= arg0 || this.anObjectArrayArray2[arg0] == null || arg1 < 0 || arg1 >= this.anObjectArrayArray2[arg0].length) {
			return false;
		} else if (this.anObjectArrayArray2[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray2[arg0] == null) {
			this.method485(arg0);
			return this.anObjectArray2[arg0] != null;
		} else {
			return true;
		}
	}
}
