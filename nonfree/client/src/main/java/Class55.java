import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rb")
public abstract class Class55 {

	@OriginalMember(owner = "client!rb", name = "e", descriptor = "I")
	public int anInt2838;

	@OriginalMember(owner = "client!rb", name = "i", descriptor = "[I")
	protected int[] anIntArray396;

	@OriginalMember(owner = "client!rb", name = "l", descriptor = "[I")
	private int[] anIntArray397;

	@OriginalMember(owner = "client!rb", name = "p", descriptor = "[Lclient!k;")
	private Class30[] aClass30Array2;

	@OriginalMember(owner = "client!rb", name = "t", descriptor = "[[I")
	private int[][] anIntArrayArray69;

	@OriginalMember(owner = "client!rb", name = "u", descriptor = "Lclient!k;")
	private Class30 aClass30_2;

	@OriginalMember(owner = "client!rb", name = "w", descriptor = "[I")
	protected int[] anIntArray398;

	@OriginalMember(owner = "client!rb", name = "C", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray9;

	@OriginalMember(owner = "client!rb", name = "D", descriptor = "[[B")
	protected byte[][] aByteArrayArray8;

	@OriginalMember(owner = "client!rb", name = "J", descriptor = "[[I")
	private int[][] anIntArrayArray70;

	@OriginalMember(owner = "client!rb", name = "K", descriptor = "[I")
	private int[] anIntArray399;

	@OriginalMember(owner = "client!rb", name = "R", descriptor = "[I")
	protected int[] anIntArray400;

	@OriginalMember(owner = "client!rb", name = "T", descriptor = "I")
	private int anInt2861;

	@OriginalMember(owner = "client!rb", name = "B", descriptor = "Z")
	private final boolean aBoolean131;

	@OriginalMember(owner = "client!rb", name = "L", descriptor = "Z")
	private final boolean aBoolean132;

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(ZZ)V")
	protected Class55(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean131 = arg1;
		this.aBoolean132 = arg0;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!gd;ILclient!gd;)Z")
	public final boolean method1862(@OriginalArg(0) Class23 arg0, @OriginalArg(2) Class23 arg1) {
		@Pc(3) Class23 local3 = arg1.method537();
		@Pc(11) Class23 local11 = arg0.method537();
		@Pc(27) int local27 = this.aClass30_2.method989(local3.method523());
		@Pc(37) int local37 = this.aClass30Array2[local27].method989(local11.method523());
		return this.method1886(local27, local37);
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V")
	public final void method1863() {
		for (@Pc(5) int local5 = 0; local5 < this.aByteArrayArrayArray9.length; local5++) {
			if (this.aByteArrayArrayArray9[local5] != null) {
				for (@Pc(13) int local13 = 0; local13 < this.aByteArrayArrayArray9[local5].length; local13++) {
					this.aByteArrayArrayArray9[local5][local13] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IB)[B")
	public final byte[] method1864(@OriginalArg(0) int arg0) {
		if (this.aByteArrayArrayArray9.length == 1) {
			return this.method1883(0, arg0);
		} else if (this.aByteArrayArrayArray9[arg0].length == 1) {
			return this.method1883(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)I")
	public final int method1865(@OriginalArg(1) int arg0) {
		return this.aByteArrayArrayArray9[arg0].length;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIB)[B")
	public final byte[] method1867(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method1881(arg0, null, arg1);
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(II)Z")
	public final boolean method1868(@OriginalArg(1) int arg0) {
		if (this.aByteArrayArray8[arg0] == null) {
			this.method1872(arg0);
			return this.aByteArrayArray8[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(I[B)V")
	protected final void method1869(@OriginalArg(1) byte[] arg0) {
		this.anInt2838 = Static112.method1918(arg0.length, arg0);
		@Pc(17) Class1_Sub5 local17 = new Class1_Sub5(Static72.method1292(arg0));
		@Pc(21) int local21 = local17.method716();
		if (local21 != 5) {
			return;
		}
		@Pc(31) int local31 = local17.method716();
		@Pc(33) int local33 = -1;
		@Pc(35) int local35 = 0;
		this.anInt2861 = local17.method715();
		this.anIntArray397 = new int[this.anInt2861];
		for (@Pc(47) int local47 = 0; local47 < this.anInt2861; local47++) {
			this.anIntArray397[local47] = local35 += local17.method715();
			if (this.anIntArray397[local47] > local33) {
				local33 = this.anIntArray397[local47];
			}
		}
		this.aByteArrayArrayArray9 = new byte[local33 + 1][][];
		this.anIntArray398 = new int[local33 + 1];
		this.anIntArrayArray69 = new int[local33 + 1][];
		this.aByteArrayArray8 = new byte[local33 + 1][];
		this.anIntArray396 = new int[local33 + 1];
		this.anIntArray400 = new int[local33 + 1];
		@Pc(124) int local124;
		if (local31 != 0) {
			this.anIntArray399 = new int[local33 + 1];
			for (local124 = 0; local124 < this.anInt2861; local124++) {
				this.anIntArray399[this.anIntArray397[local124]] = local17.method692();
			}
			this.aClass30_2 = new Class30(this.anIntArray399);
		}
		for (local124 = 0; local124 < this.anInt2861; local124++) {
			this.anIntArray400[this.anIntArray397[local124]] = local17.method692();
		}
		for (@Pc(171) int local171 = 0; local171 < this.anInt2861; local171++) {
			this.anIntArray398[this.anIntArray397[local171]] = local17.method692();
		}
		for (@Pc(193) int local193 = 0; local193 < this.anInt2861; local193++) {
			this.anIntArray396[this.anIntArray397[local193]] = local17.method715();
		}
		@Pc(221) int local221;
		@Pc(226) int local226;
		@Pc(216) int local216;
		@Pc(234) int local234;
		for (@Pc(211) int local211 = 0; local211 < this.anInt2861; local211++) {
			local35 = 0;
			local216 = -1;
			local221 = this.anIntArray397[local211];
			local226 = this.anIntArray396[local221];
			this.anIntArrayArray69[local221] = new int[local226];
			for (local234 = 0; local234 < local226; local234++) {
				@Pc(250) int local250 = this.anIntArrayArray69[local221][local234] = local35 += local17.method715();
				if (local250 > local216) {
					local216 = local250;
				}
			}
			this.aByteArrayArrayArray9[local221] = new byte[local216 + 1][];
		}
		if (local31 == 0) {
			return;
		}
		this.anIntArrayArray70 = new int[local33 + 1][];
		this.aClass30Array2 = new Class30[local33 + 1];
		for (local221 = 0; local221 < this.anInt2861; local221++) {
			local226 = this.anIntArray397[local221];
			local216 = this.anIntArray396[local226];
			this.anIntArrayArray70[local226] = new int[this.aByteArrayArrayArray9[local226].length];
			for (local234 = 0; local234 < local216; local234++) {
				this.anIntArrayArray70[local226][this.anIntArrayArray69[local226][local234]] = local17.method692();
			}
			this.aClass30Array2[local226] = new Class30(this.anIntArrayArray70[local226]);
		}
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(IB)[B")
	public final byte[] method1871(@OriginalArg(0) int arg0) {
		if (this.aByteArrayArrayArray9.length == 1) {
			return this.method1867(arg0, 0);
		} else if (this.aByteArrayArrayArray9[arg0].length == 1) {
			return this.method1867(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IZ)V")
	protected void method1872(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(II[I)Z")
	private boolean method1874(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aByteArrayArray8[arg0] == null) {
			return false;
		}
		@Pc(15) int local15 = this.anIntArray396[arg0];
		@Pc(20) int[] local20 = this.anIntArrayArray69[arg0];
		@Pc(22) boolean local22 = true;
		@Pc(27) byte[][] local27 = this.aByteArrayArrayArray9[arg0];
		for (@Pc(29) int local29 = 0; local29 < local15; local29++) {
			if (local27[local20[local29]] == null) {
				local22 = false;
				break;
			}
		}
		if (local22) {
			return true;
		}
		@Pc(76) byte[] local76;
		if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
			local76 = this.aByteArrayArray8[arg0];
		} else {
			local76 = new byte[this.aByteArrayArray8[arg0].length];
			Static123.method1270(this.aByteArrayArray8[arg0], 0, local76, 0, local76.length);
			@Pc(91) Class1_Sub5 local91 = new Class1_Sub5(local76);
			local91.method697(local91.aByteArray6.length, arg1);
		}
		@Pc(109) byte[] local109;
		try {
			local109 = Static72.method1292(local76);
		} catch (@Pc(111) RuntimeException local111) {
			throw Static33.method569(local111, "T3 - " + (arg1 != null) + "," + arg0 + "," + local76.length + "," + Static112.method1918(local76.length, local76) + "," + Static112.method1918(local76.length - 2, local76) + "," + this.anIntArray400[arg0] + "," + this.anInt2838);
		}
		if (this.aBoolean132) {
			this.aByteArrayArray8[arg0] = null;
		}
		if (local15 <= 1) {
			local27[local20[0]] = local109;
		} else {
			@Pc(185) int local185 = local109.length;
			@Pc(187) int local187 = local185 - 1;
			@Pc(192) int local192 = local109[local187] & 0xFF;
			@Pc(200) int local200 = local187 - local192 * local15 * 4;
			@Pc(203) int[] local203 = new int[local15];
			@Pc(208) Class1_Sub5 local208 = new Class1_Sub5(local109);
			local208.anInt1266 = local200;
			@Pc(216) int local216;
			@Pc(218) int local218;
			for (@Pc(213) int local213 = 0; local213 < local192; local213++) {
				local216 = 0;
				for (local218 = 0; local218 < local15; local218++) {
					local216 += local208.method692();
					local203[local218] += local216;
				}
			}
			for (local216 = 0; local216 < local15; local216++) {
				if (local27[local20[local216]] == null) {
					local27[local20[local216]] = new byte[local203[local216]];
				}
				local203[local216] = 0;
			}
			local208.anInt1266 = local200;
			local218 = 0;
			for (@Pc(281) int local281 = 0; local281 < local192; local281++) {
				@Pc(284) int local284 = 0;
				for (@Pc(286) int local286 = 0; local286 < local15; local286++) {
					local284 += local208.method692();
					Static123.method1270(local109, local218, local27[local20[local286]], local203[local286], local284);
					local218 += local284;
					local203[local286] += local284;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(ZI)[I")
	public final int[] method1875(@OriginalArg(1) int arg0) {
		return this.anIntArrayArray69[arg0];
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IZLclient!gd;)I")
	public final int method1876(@OriginalArg(0) int arg0, @OriginalArg(2) Class23 arg1) {
		@Pc(7) Class23 local7 = arg1.method537();
		return this.aClass30Array2[arg0].method989(local7.method523());
	}

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "(I)Z")
	public final boolean method1877() {
		@Pc(13) boolean local13 = true;
		for (@Pc(15) int local15 = 0; local15 < this.anIntArray397.length; local15++) {
			@Pc(22) int local22 = this.anIntArray397[local15];
			if (this.aByteArrayArray8[local22] == null) {
				this.method1872(local22);
				if (this.aByteArrayArray8[local22] == null) {
					local13 = false;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "(II)V")
	protected void method1878(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILclient!gd;Lclient!gd;)[B")
	public final byte[] method1879(@OriginalArg(1) Class23 arg0, @OriginalArg(2) Class23 arg1) {
		@Pc(3) Class23 local3 = arg1.method537();
		@Pc(19) Class23 local19 = arg0.method537();
		@Pc(27) int local27 = this.aClass30_2.method989(local3.method523());
		@Pc(37) int local37 = this.aClass30Array2[local27].method989(local19.method523());
		return this.method1867(local37, local27);
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(II[II)[B")
	public final byte[] method1881(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		if (arg2 < 0 || arg2 >= this.aByteArrayArrayArray9.length || this.aByteArrayArrayArray9[arg2] == null || arg0 < 0 || arg0 >= this.aByteArrayArrayArray9[arg2].length) {
			return null;
		}
		if (this.aByteArrayArrayArray9[arg2][arg0] == null) {
			@Pc(48) boolean local48 = this.method1874(arg2, arg1);
			if (!local48) {
				this.method1872(arg2);
				local48 = this.method1874(arg2, arg1);
				if (!local48) {
					return null;
				}
			}
		}
		@Pc(73) byte[] local73 = this.aByteArrayArrayArray9[arg2][arg0];
		if (this.aBoolean131) {
			this.aByteArrayArrayArray9[arg2][arg0] = null;
		}
		return local73;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(III)[B")
	public final byte[] method1883(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 < 0 || arg0 >= this.aByteArrayArrayArray9.length || this.aByteArrayArrayArray9[arg0] == null || arg1 < 0 || arg1 >= this.aByteArrayArrayArray9[arg0].length) {
			return null;
		}
		if (this.aByteArrayArrayArray9[arg0][arg1] == null) {
			@Pc(51) boolean local51 = this.method1874(arg0, null);
			if (!local51) {
				this.method1872(arg0);
				local51 = this.method1874(arg0, null);
				if (!local51) {
					return null;
				}
			}
		}
		return this.aByteArrayArrayArray9[arg0][arg1];
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!gd;Z)V")
	public final void method1884(@OriginalArg(0) Class23 arg0) {
		@Pc(7) Class23 local7 = arg0.method537();
		@Pc(15) int local15 = this.aClass30_2.method989(local7.method523());
		if (local15 >= 0) {
			this.method1878(local15);
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!gd;I)I")
	public final int method1885(@OriginalArg(0) Class23 arg0) {
		@Pc(5) Class23 local5 = arg0.method537();
		return this.aClass30_2.method989(local5.method523());
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IBI)Z")
	public final boolean method1886(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 < 0 || arg0 >= this.aByteArrayArrayArray9.length || this.aByteArrayArrayArray9[arg0] == null || arg1 < 0 || this.aByteArrayArrayArray9[arg0].length <= arg1) {
			return false;
		} else if (this.aByteArrayArrayArray9[arg0][arg1] != null) {
			return true;
		} else if (this.aByteArrayArray8[arg0] == null) {
			this.method1872(arg0);
			return this.aByteArrayArray8[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(BI)V")
	public final void method1887(@OriginalArg(1) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.aByteArrayArrayArray9[arg0].length; local1++) {
			this.aByteArrayArrayArray9[arg0][local1] = null;
		}
	}

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "(I)I")
	public final int method1888() {
		return this.aByteArrayArrayArray9.length;
	}
}
