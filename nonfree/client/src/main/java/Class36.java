import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jd")
public abstract class Class36 {

	@OriginalMember(owner = "client!jd", name = "d", descriptor = "[I")
	private int[] anIntArray306;

	@OriginalMember(owner = "client!jd", name = "e", descriptor = "[I")
	private int[] anIntArray307;

	@OriginalMember(owner = "client!jd", name = "g", descriptor = "[I")
	protected int[] anIntArray308;

	@OriginalMember(owner = "client!jd", name = "j", descriptor = "[[I")
	private int[][] anIntArrayArray24;

	@OriginalMember(owner = "client!jd", name = "k", descriptor = "I")
	public int anInt2449;

	@OriginalMember(owner = "client!jd", name = "x", descriptor = "Lclient!ac;")
	private Class4 aClass4_2;

	@OriginalMember(owner = "client!jd", name = "z", descriptor = "I")
	private int anInt2460;

	@OriginalMember(owner = "client!jd", name = "E", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!jd", name = "J", descriptor = "[I")
	protected int[] anIntArray309;

	@OriginalMember(owner = "client!jd", name = "K", descriptor = "[[B")
	protected byte[][] aByteArrayArray11;

	@OriginalMember(owner = "client!jd", name = "M", descriptor = "[I")
	protected int[] anIntArray310;

	@OriginalMember(owner = "client!jd", name = "O", descriptor = "[[I")
	private int[][] anIntArrayArray25;

	@OriginalMember(owner = "client!jd", name = "Q", descriptor = "[Lclient!ac;")
	private Class4[] aClass4Array2;

	@OriginalMember(owner = "client!jd", name = "G", descriptor = "Z")
	private final boolean aBoolean107;

	@OriginalMember(owner = "client!jd", name = "s", descriptor = "Z")
	private final boolean aBoolean106;

	@OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(ZZ)V")
	protected Class36(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean107 = arg1;
		this.aBoolean106 = arg0;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILclient!ke;I)I")
	public final int method1754(@OriginalArg(1) Class39 arg0, @OriginalArg(2) int arg1) {
		@Pc(3) Class39 local3 = arg0.method1107();
		return this.aClass4Array2[arg1].method76(local3.method1119());
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)V")
	public final void method1755() {
		for (@Pc(11) int local11 = 0; local11 < this.aByteArrayArrayArray6.length; local11++) {
			if (this.aByteArrayArrayArray6[local11] != null) {
				for (@Pc(19) int local19 = 0; local19 < this.aByteArrayArrayArray6[local11].length; local19++) {
					this.aByteArrayArrayArray6[local11][local19] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IB)V")
	public final void method1756(@OriginalArg(0) int arg0) {
		for (@Pc(7) int local7 = 0; local7 < this.aByteArrayArrayArray6[arg0].length; local7++) {
			this.aByteArrayArrayArray6[arg0][local7] = null;
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lclient!ke;ILclient!ke;)[B")
	public final byte[] method1758(@OriginalArg(0) Class39 arg0, @OriginalArg(2) Class39 arg1) {
		@Pc(3) Class39 local3 = arg0.method1107();
		@Pc(11) Class39 local11 = arg1.method1107();
		@Pc(24) int local24 = this.aClass4_2.method76(local3.method1119());
		@Pc(34) int local34 = this.aClass4Array2[local24].method76(local11.method1119());
		return this.method1761(local24, local34);
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(III[I)[B")
	public final byte[] method1759(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		if (arg1 < 0 || arg1 >= this.aByteArrayArrayArray6.length || this.aByteArrayArrayArray6[arg1] == null || arg0 < 0 || arg0 >= this.aByteArrayArrayArray6[arg1].length) {
			return null;
		}
		if (this.aByteArrayArrayArray6[arg1][arg0] == null) {
			@Pc(46) boolean local46 = this.method1775(arg1, arg2);
			if (!local46) {
				this.method1770(arg1);
				local46 = this.method1775(arg1, arg2);
				if (!local46) {
					return null;
				}
			}
		}
		@Pc(69) byte[] local69 = this.aByteArrayArrayArray6[arg1][arg0];
		if (this.aBoolean107) {
			this.aByteArrayArrayArray6[arg1][arg0] = null;
		}
		return local69;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)[B")
	public final byte[] method1760(@OriginalArg(1) int arg0) {
		if (this.aByteArrayArrayArray6.length == 1) {
			return this.method1761(0, arg0);
		} else if (this.aByteArrayArrayArray6[arg0].length == 1) {
			return this.method1761(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IBI)[B")
	public final byte[] method1761(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.method1759(arg1, arg0, null);
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ZI)[I")
	public final int[] method1762(@OriginalArg(1) int arg0) {
		return this.anIntArrayArray25[arg0];
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(BI)I")
	public final int method1763(@OriginalArg(1) int arg0) {
		return this.aByteArrayArrayArray6[arg0].length;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IZ)[B")
	public final byte[] method1765(@OriginalArg(0) int arg0) {
		if (this.aByteArrayArrayArray6.length == 1) {
			return this.method1767(0, arg0);
		} else if (this.aByteArrayArrayArray6[arg0].length == 1) {
			return this.method1767(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lclient!ke;I)V")
	public final void method1766(@OriginalArg(0) Class39 arg0) {
		@Pc(3) Class39 local3 = arg0.method1107();
		@Pc(11) int local11 = this.aClass4_2.method76(local3.method1119());
		if (local11 >= 0) {
			this.method1778(local11);
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIB)[B")
	public final byte[] method1767(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 < 0 || arg0 >= this.aByteArrayArrayArray6.length || this.aByteArrayArrayArray6[arg0] == null || arg1 < 0 || this.aByteArrayArrayArray6[arg0].length <= arg1) {
			return null;
		}
		if (this.aByteArrayArrayArray6[arg0][arg1] == null) {
			@Pc(51) boolean local51 = this.method1775(arg0, null);
			if (!local51) {
				this.method1770(arg0);
				local51 = this.method1775(arg0, null);
				if (!local51) {
					return null;
				}
			}
		}
		return this.aByteArrayArrayArray6[arg0][arg1];
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(IBI)Z")
	public final boolean method1768(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 < 0 || this.aByteArrayArrayArray6.length <= arg1 || this.aByteArrayArrayArray6[arg1] == null || arg0 < 0 || arg0 >= this.aByteArrayArrayArray6[arg1].length) {
			return false;
		} else if (this.aByteArrayArrayArray6[arg1][arg0] != null) {
			return true;
		} else if (this.aByteArrayArray11[arg1] == null) {
			this.method1770(arg1);
			return this.aByteArrayArray11[arg1] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(Lclient!ke;ILclient!ke;)Z")
	public final boolean method1769(@OriginalArg(0) Class39 arg0, @OriginalArg(2) Class39 arg1) {
		@Pc(12) Class39 local12 = arg1.method1107();
		@Pc(16) Class39 local16 = arg0.method1107();
		@Pc(24) int local24 = this.aClass4_2.method76(local12.method1119());
		@Pc(36) int local36 = this.aClass4Array2[local24].method76(local16.method1119());
		return this.method1768(local36, local24);
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(IZ)V")
	protected void method1770(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "(II)Z")
	public final boolean method1772(@OriginalArg(1) int arg0) {
		if (this.aByteArrayArray11[arg0] == null) {
			this.method1770(arg0);
			return this.aByteArrayArray11[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)Z")
	public final boolean method1773() {
		@Pc(5) boolean local5 = true;
		for (@Pc(13) int local13 = 0; local13 < this.anIntArray307.length; local13++) {
			@Pc(19) int local19 = this.anIntArray307[local13];
			if (this.aByteArrayArray11[local19] == null) {
				this.method1770(local19);
				if (this.aByteArrayArray11[local19] == null) {
					local5 = false;
				}
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(Lclient!ke;I)I")
	public final int method1774(@OriginalArg(0) Class39 arg0) {
		@Pc(7) Class39 local7 = arg0.method1107();
		return this.aClass4_2.method76(local7.method1119());
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(II[I)Z")
	private boolean method1775(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aByteArrayArray11[arg0] == null) {
			return false;
		}
		@Pc(15) int local15 = this.anIntArray308[arg0];
		@Pc(20) int[] local20 = this.anIntArrayArray25[arg0];
		@Pc(25) byte[][] local25 = this.aByteArrayArrayArray6[arg0];
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
		@Pc(87) byte[] local87;
		if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
			local87 = this.aByteArrayArray11[arg0];
		} else {
			local87 = new byte[this.aByteArrayArray11[arg0].length];
			Static114.method1154(this.aByteArrayArray11[arg0], 0, local87, 0, local87.length);
			@Pc(110) Class2_Sub5 local110 = new Class2_Sub5(local87);
			local110.method1286(arg1, local110.aByteArray16.length);
		}
		@Pc(122) byte[] local122;
		try {
			local122 = Static42.method837(local87);
		} catch (@Pc(124) RuntimeException local124) {
			throw Static54.method1053(local124, "T3 - " + (arg1 != null) + "," + arg0 + "," + local87.length + "," + Static105.method1991(local87, local87.length) + "," + Static105.method1991(local87, local87.length - 2) + "," + this.anIntArray310[arg0] + "," + this.anInt2449);
		}
		if (this.aBoolean106) {
			this.aByteArrayArray11[arg0] = null;
		}
		if (local15 <= 1) {
			local25[local20[0]] = local122;
		} else {
			@Pc(200) int local200 = local122.length;
			@Pc(202) int local202 = local200 - 1;
			@Pc(207) int local207 = local122[local202] & 0xFF;
			@Pc(215) int local215 = local202 - local207 * local15 * 4;
			@Pc(220) Class2_Sub5 local220 = new Class2_Sub5(local122);
			local220.anInt1772 = local215;
			@Pc(226) int[] local226 = new int[local15];
			@Pc(231) int local231;
			@Pc(233) int local233;
			for (@Pc(228) int local228 = 0; local228 < local207; local228++) {
				local231 = 0;
				for (local233 = 0; local233 < local15; local233++) {
					local231 += local220.method1276();
					local226[local233] += local231;
				}
			}
			for (local231 = 0; local231 < local15; local231++) {
				if (local25[local20[local231]] == null) {
					local25[local20[local231]] = new byte[local226[local231]];
				}
				local226[local231] = 0;
			}
			local220.anInt1772 = local215;
			local233 = 0;
			for (@Pc(298) int local298 = 0; local298 < local207; local298++) {
				@Pc(301) int local301 = 0;
				for (@Pc(303) int local303 = 0; local303 < local15; local303++) {
					local301 += local220.method1276();
					Static114.method1154(local122, local233, local25[local20[local303]], local226[local303], local301);
					local226[local303] += local301;
					local233 += local301;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Z)I")
	public final int method1776() {
		return this.aByteArrayArrayArray6.length;
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(IB)V")
	protected void method1778(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "([BI)V")
	protected final void method1781(@OriginalArg(0) byte[] arg0) {
		this.anInt2449 = Static105.method1991(arg0, arg0.length);
		@Pc(19) Class2_Sub5 local19 = new Class2_Sub5(Static42.method837(arg0));
		@Pc(25) int local25 = local19.method1281();
		if (local25 != 5) {
			return;
		}
		@Pc(33) int local33 = 0;
		@Pc(39) int local39 = local19.method1281();
		@Pc(41) int local41 = -1;
		this.anInt2460 = local19.method1273();
		this.anIntArray307 = new int[this.anInt2460];
		for (@Pc(55) int local55 = 0; local55 < this.anInt2460; local55++) {
			this.anIntArray307[local55] = local33 += local19.method1273();
			if (local41 < this.anIntArray307[local55]) {
				local41 = this.anIntArray307[local55];
			}
		}
		this.aByteArrayArrayArray6 = new byte[local41 + 1][][];
		this.anIntArray308 = new int[local41 + 1];
		this.anIntArray309 = new int[local41 + 1];
		this.aByteArrayArray11 = new byte[local41 + 1][];
		this.anIntArray310 = new int[local41 + 1];
		this.anIntArrayArray25 = new int[local41 + 1][];
		@Pc(141) int local141;
		if (local39 != 0) {
			this.anIntArray306 = new int[local41 + 1];
			for (local141 = 0; local141 < this.anInt2460; local141++) {
				this.anIntArray306[this.anIntArray307[local141]] = local19.method1276();
			}
			this.aClass4_2 = new Class4(this.anIntArray306);
		}
		for (local141 = 0; local141 < this.anInt2460; local141++) {
			this.anIntArray310[this.anIntArray307[local141]] = local19.method1276();
		}
		for (@Pc(192) int local192 = 0; local192 < this.anInt2460; local192++) {
			this.anIntArray309[this.anIntArray307[local192]] = local19.method1276();
		}
		for (@Pc(211) int local211 = 0; local211 < this.anInt2460; local211++) {
			this.anIntArray308[this.anIntArray307[local211]] = local19.method1273();
		}
		@Pc(247) int local247;
		@Pc(254) int local254;
		@Pc(249) int local249;
		@Pc(262) int local262;
		for (@Pc(238) int local238 = 0; local238 < this.anInt2460; local238++) {
			local33 = 0;
			local247 = this.anIntArray307[local238];
			local249 = -1;
			local254 = this.anIntArray308[local247];
			this.anIntArrayArray25[local247] = new int[local254];
			for (local262 = 0; local262 < local254; local262++) {
				@Pc(279) int local279 = this.anIntArrayArray25[local247][local262] = local33 += local19.method1273();
				if (local279 > local249) {
					local249 = local279;
				}
			}
			this.aByteArrayArrayArray6[local247] = new byte[local249 + 1][];
		}
		if (local39 == 0) {
			return;
		}
		this.aClass4Array2 = new Class4[local41 + 1];
		this.anIntArrayArray24 = new int[local41 + 1][];
		for (local247 = 0; local247 < this.anInt2460; local247++) {
			local254 = this.anIntArray307[local247];
			local249 = this.anIntArray308[local254];
			this.anIntArrayArray24[local254] = new int[this.aByteArrayArrayArray6[local254].length];
			for (local262 = 0; local262 < local249; local262++) {
				this.anIntArrayArray24[local254][this.anIntArrayArray25[local254][local262]] = local19.method1276();
			}
			this.aClass4Array2[local254] = new Class4(this.anIntArrayArray24[local254]);
		}
	}
}
