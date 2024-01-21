import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public abstract class Class42 {

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "[I")
	private int[] anIntArray259;

	@OriginalMember(owner = "client!mb", name = "i", descriptor = "I")
	private int anInt2369;

	@OriginalMember(owner = "client!mb", name = "o", descriptor = "[[I")
	private int[][] anIntArrayArray25;

	@OriginalMember(owner = "client!mb", name = "r", descriptor = "I")
	public int anInt2376;

	@OriginalMember(owner = "client!mb", name = "s", descriptor = "[[I")
	private int[][] anIntArrayArray26;

	@OriginalMember(owner = "client!mb", name = "C", descriptor = "Lclient!vd;")
	private Class64 aClass64_2;

	@OriginalMember(owner = "client!mb", name = "D", descriptor = "[I")
	private int[] anIntArray260;

	@OriginalMember(owner = "client!mb", name = "G", descriptor = "[I")
	protected int[] anIntArray261;

	@OriginalMember(owner = "client!mb", name = "H", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!mb", name = "J", descriptor = "[I")
	protected int[] anIntArray262;

	@OriginalMember(owner = "client!mb", name = "M", descriptor = "[I")
	protected int[] anIntArray263;

	@OriginalMember(owner = "client!mb", name = "O", descriptor = "[[B")
	protected byte[][] aByteArrayArray8;

	@OriginalMember(owner = "client!mb", name = "P", descriptor = "[Lclient!vd;")
	private Class64[] aClass64Array2;

	@OriginalMember(owner = "client!mb", name = "E", descriptor = "Z")
	private final boolean aBoolean146;

	@OriginalMember(owner = "client!mb", name = "y", descriptor = "Z")
	private final boolean aBoolean145;

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(ZZ)V")
	protected Class42(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean146 = arg1;
		this.aBoolean145 = arg0;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(III)Z")
	public final boolean method1493(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 < 0 || arg1 >= this.aByteArrayArrayArray14.length || this.aByteArrayArrayArray14[arg1] == null || arg0 < 0 || this.aByteArrayArrayArray14[arg1].length <= arg0) {
			return false;
		} else if (this.aByteArrayArrayArray14[arg1][arg0] != null) {
			return true;
		} else if (this.aByteArrayArray8[arg1] == null) {
			this.method1505(arg1);
			return this.aByteArrayArray8[arg1] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)I")
	public final int method1494(@OriginalArg(1) int arg0) {
		return this.aByteArrayArrayArray14[arg0].length;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "([BZ)V")
	protected final void method1495(@OriginalArg(0) byte[] arg0) {
		this.anInt2376 = Static54.method1776(arg0.length, arg0);
		@Pc(19) Class3_Sub8 local19 = new Class3_Sub8(Static105.method1825(arg0));
		@Pc(23) int local23 = local19.method1803();
		if (local23 != 5) {
			return;
		}
		@Pc(38) int local38 = local19.method1803();
		this.anInt2369 = local19.method1789();
		@Pc(45) int local45 = 0;
		this.anIntArray259 = new int[this.anInt2369];
		@Pc(52) int local52 = -1;
		for (@Pc(54) int local54 = 0; local54 < this.anInt2369; local54++) {
			this.anIntArray259[local54] = local45 += local19.method1789();
			if (this.anIntArray259[local54] > local52) {
				local52 = this.anIntArray259[local54];
			}
		}
		this.aByteArrayArray8 = new byte[local52 + 1][];
		this.anIntArrayArray25 = new int[local52 + 1][];
		this.aByteArrayArrayArray14 = new byte[local52 + 1][][];
		this.anIntArray261 = new int[local52 + 1];
		this.anIntArray263 = new int[local52 + 1];
		this.anIntArray262 = new int[local52 + 1];
		@Pc(133) int local133;
		if (local38 != 0) {
			this.anIntArray260 = new int[local52 + 1];
			for (local133 = 0; local133 < this.anInt2369; local133++) {
				this.anIntArray260[this.anIntArray259[local133]] = local19.method1770();
			}
			this.aClass64_2 = new Class64(this.anIntArray260);
		}
		for (local133 = 0; local133 < this.anInt2369; local133++) {
			this.anIntArray262[this.anIntArray259[local133]] = local19.method1770();
		}
		for (@Pc(182) int local182 = 0; local182 < this.anInt2369; local182++) {
			this.anIntArray263[this.anIntArray259[local182]] = local19.method1770();
		}
		for (@Pc(205) int local205 = 0; local205 < this.anInt2369; local205++) {
			this.anIntArray261[this.anIntArray259[local205]] = local19.method1789();
		}
		@Pc(237) int local237;
		@Pc(242) int local242;
		@Pc(250) int local250;
		@Pc(252) int local252;
		for (@Pc(228) int local228 = 0; local228 < this.anInt2369; local228++) {
			local45 = 0;
			local237 = this.anIntArray259[local228];
			local242 = this.anIntArray261[local237];
			this.anIntArrayArray25[local237] = new int[local242];
			local250 = -1;
			for (local252 = 0; local252 < local242; local252++) {
				@Pc(269) int local269 = this.anIntArrayArray25[local237][local252] = local45 += local19.method1789();
				if (local269 > local250) {
					local250 = local269;
				}
			}
			this.aByteArrayArrayArray14[local237] = new byte[local250 + 1][];
		}
		if (local38 == 0) {
			return;
		}
		this.anIntArrayArray26 = new int[local52 + 1][];
		this.aClass64Array2 = new Class64[local52 + 1];
		for (local237 = 0; local237 < this.anInt2369; local237++) {
			local242 = this.anIntArray259[local237];
			local250 = this.anIntArray261[local242];
			this.anIntArrayArray26[local242] = new int[this.aByteArrayArrayArray14[local242].length];
			for (local252 = 0; local252 < local250; local252++) {
				this.anIntArrayArray26[local242][this.anIntArrayArray25[local242][local252]] = local19.method1770();
			}
			this.aClass64Array2[local242] = new Class64(this.anIntArrayArray26[local242]);
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)I")
	public final int method1496() {
		return this.aByteArrayArrayArray14.length;
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(II)[I")
	public final int[] method1497(@OriginalArg(0) int arg0) {
		return this.anIntArrayArray25[arg0];
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!v;II)I")
	public final int method1498(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class62 local8 = arg0.method1704();
		return this.aClass64Array2[arg1].method1828(local8.method1703());
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(III)[B")
	public final byte[] method1499(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 < 0 || this.aByteArrayArrayArray14.length <= arg0 || this.aByteArrayArrayArray14[arg0] == null || arg1 < 0 || this.aByteArrayArrayArray14[arg0].length <= arg1) {
			return null;
		}
		if (this.aByteArrayArrayArray14[arg0][arg1] == null) {
			@Pc(49) boolean local49 = this.method1514(null, arg0);
			if (!local49) {
				this.method1505(arg0);
				local49 = this.method1514(null, arg0);
				if (!local49) {
					return null;
				}
			}
		}
		return this.aByteArrayArrayArray14[arg0][arg1];
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(II)V")
	protected void method1501(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "(II)V")
	public final void method1502(@OriginalArg(1) int arg0) {
		for (@Pc(3) int local3 = 0; local3 < this.aByteArrayArrayArray14[arg0].length; local3++) {
			this.aByteArrayArrayArray14[arg0][local3] = null;
		}
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)Z")
	public final boolean method1503() {
		@Pc(7) boolean local7 = true;
		for (@Pc(14) int local14 = 0; local14 < this.anIntArray259.length; local14++) {
			@Pc(21) int local21 = this.anIntArray259[local14];
			if (this.aByteArrayArray8[local21] == null) {
				this.method1505(local21);
				if (this.aByteArrayArray8[local21] == null) {
					local7 = false;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(III)[B")
	public final byte[] method1504(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.method1513(arg0, arg1, null);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BI)V")
	protected void method1505(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!v;Lclient!v;I)[B")
	public final byte[] method1506(@OriginalArg(0) Class62 arg0, @OriginalArg(1) Class62 arg1) {
		@Pc(3) Class62 local3 = arg1.method1704();
		@Pc(17) Class62 local17 = arg0.method1704();
		@Pc(25) int local25 = this.aClass64_2.method1828(local3.method1703());
		@Pc(39) int local39 = this.aClass64Array2[local25].method1828(local17.method1703());
		return this.method1504(local25, local39);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IB)[B")
	public final byte[] method1507(@OriginalArg(0) int arg0) {
		if (this.aByteArrayArrayArray14.length == 1) {
			return this.method1499(0, arg0);
		} else if (this.aByteArrayArrayArray14[arg0].length == 1) {
			return this.method1499(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BLclient!v;)V")
	public final void method1508(@OriginalArg(1) Class62 arg0) {
		@Pc(7) Class62 local7 = arg0.method1704();
		@Pc(17) int local17 = this.aClass64_2.method1828(local7.method1703());
		if (local17 >= 0) {
			this.method1501(local17);
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IZ)Z")
	public final boolean method1510(@OriginalArg(0) int arg0) {
		if (this.aByteArrayArray8[arg0] == null) {
			this.method1505(arg0);
			return this.aByteArrayArray8[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "(II)[B")
	public final byte[] method1512(@OriginalArg(0) int arg0) {
		if (this.aByteArrayArrayArray14.length == 1) {
			return this.method1504(0, arg0);
		} else if (this.aByteArrayArrayArray14[arg0].length == 1) {
			return this.method1504(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(III[I)[B")
	public final byte[] method1513(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		if (arg0 < 0 || arg0 >= this.aByteArrayArrayArray14.length || this.aByteArrayArrayArray14[arg0] == null || arg1 < 0 || arg1 >= this.aByteArrayArrayArray14[arg0].length) {
			return null;
		}
		if (this.aByteArrayArrayArray14[arg0][arg1] == null) {
			@Pc(48) boolean local48 = this.method1514(arg2, arg0);
			if (!local48) {
				this.method1505(arg0);
				local48 = this.method1514(arg2, arg0);
				if (!local48) {
					return null;
				}
			}
		}
		@Pc(71) byte[] local71 = this.aByteArrayArrayArray14[arg0][arg1];
		if (this.aBoolean146) {
			this.aByteArrayArrayArray14[arg0][arg1] = null;
		}
		return local71;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "([IBI)Z")
	private boolean method1514(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aByteArrayArray8[arg1] == null) {
			return false;
		}
		@Pc(17) int local17 = this.anIntArray261[arg1];
		@Pc(22) int[] local22 = this.anIntArrayArray25[arg1];
		@Pc(32) byte[][] local32 = this.aByteArrayArrayArray14[arg1];
		@Pc(34) boolean local34 = true;
		for (@Pc(36) int local36 = 0; local36 < local17; local36++) {
			if (local32[local22[local36]] == null) {
				local34 = false;
				break;
			}
		}
		if (local34) {
			return true;
		}
		@Pc(81) byte[] local81;
		if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
			local81 = this.aByteArrayArray8[arg1];
		} else {
			local81 = new byte[this.aByteArrayArray8[arg1].length];
			Static112.method491(this.aByteArrayArray8[arg1], 0, local81, 0, local81.length);
			@Pc(96) Class3_Sub8 local96 = new Class3_Sub8(local81);
			local96.method1781(local96.aByteArray26.length, arg0);
		}
		@Pc(115) byte[] local115;
		try {
			local115 = Static105.method1825(local81);
		} catch (@Pc(117) RuntimeException local117) {
			throw Static95.method1609(local117, "T3 - " + (arg0 != null) + "," + arg1 + "," + local81.length + "," + Static54.method1776(local81.length, local81) + "," + Static54.method1776(local81.length - 2, local81) + "," + this.anIntArray262[arg1] + "," + this.anInt2376);
		}
		if (this.aBoolean145) {
			this.aByteArrayArray8[arg1] = null;
		}
		if (local17 <= 1) {
			local32[local22[0]] = local115;
		} else {
			@Pc(192) int local192 = local115.length;
			@Pc(195) int local195 = local192 - 1;
			@Pc(199) int local199 = local115[local195] & 0xFF;
			@Pc(207) int local207 = local195 - local199 * 4 * local17;
			@Pc(210) int[] local210 = new int[local17];
			@Pc(215) Class3_Sub8 local215 = new Class3_Sub8(local115);
			local215.anInt2704 = local207;
			@Pc(224) int local224;
			@Pc(226) int local226;
			for (@Pc(220) int local220 = 0; local220 < local199; local220++) {
				local224 = 0;
				for (local226 = 0; local226 < local17; local226++) {
					local224 += local215.method1770();
					local210[local226] += local224;
				}
			}
			for (local224 = 0; local224 < local17; local224++) {
				if (local32[local22[local224]] == null) {
					local32[local22[local224]] = new byte[local210[local224]];
				}
				local210[local224] = 0;
			}
			local215.anInt2704 = local207;
			local226 = 0;
			for (@Pc(287) int local287 = 0; local287 < local199; local287++) {
				@Pc(291) int local291 = 0;
				for (@Pc(293) int local293 = 0; local293 < local17; local293++) {
					local291 += local215.method1770();
					Static112.method491(local115, local226, local32[local22[local293]], local210[local293], local291);
					local226 += local291;
					local210[local293] += local291;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!v;ILclient!v;)Z")
	public final boolean method1517(@OriginalArg(0) Class62 arg0, @OriginalArg(2) Class62 arg1) {
		@Pc(3) Class62 local3 = arg1.method1704();
		@Pc(19) Class62 local19 = arg0.method1704();
		@Pc(27) int local27 = this.aClass64_2.method1828(local3.method1703());
		@Pc(37) int local37 = this.aClass64Array2[local27].method1828(local19.method1703());
		return this.method1493(local37, local27);
	}

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "(I)V")
	public final void method1520() {
		for (@Pc(7) int local7 = 0; local7 < this.aByteArrayArrayArray14.length; local7++) {
			if (this.aByteArrayArrayArray14[local7] != null) {
				for (@Pc(16) int local16 = 0; local16 < this.aByteArrayArrayArray14[local7].length; local16++) {
					this.aByteArrayArrayArray14[local7][local16] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!v;Z)I")
	public final int method1521(@OriginalArg(0) Class62 arg0) {
		@Pc(12) Class62 local12 = arg0.method1704();
		return this.aClass64_2.method1828(local12.method1703());
	}
}
