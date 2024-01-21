import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public abstract class Class11 {

	@OriginalMember(owner = "client!he", name = "e", descriptor = "[I")
	protected int[] anIntArray39;

	@OriginalMember(owner = "client!he", name = "k", descriptor = "[[I")
	private int[][] anIntArrayArray3;

	@OriginalMember(owner = "client!he", name = "l", descriptor = "[I")
	protected int[] anIntArray40;

	@OriginalMember(owner = "client!he", name = "m", descriptor = "[I")
	private int[] anIntArray41;

	@OriginalMember(owner = "client!he", name = "p", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!he", name = "u", descriptor = "[[I")
	private int[][] anIntArrayArray4;

	@OriginalMember(owner = "client!he", name = "v", descriptor = "[I")
	protected int[] anIntArray42;

	@OriginalMember(owner = "client!he", name = "A", descriptor = "I")
	public int anInt267;

	@OriginalMember(owner = "client!he", name = "O", descriptor = "I")
	private int anInt277;

	@OriginalMember(owner = "client!he", name = "P", descriptor = "[Lclient!a;")
	private Class1[] aClass1Array2;

	@OriginalMember(owner = "client!he", name = "Q", descriptor = "[[B")
	protected byte[][] aByteArrayArray4;

	@OriginalMember(owner = "client!he", name = "T", descriptor = "Lclient!a;")
	private Class1 aClass1_2;

	@OriginalMember(owner = "client!he", name = "ab", descriptor = "[I")
	private int[] anIntArray44;

	@OriginalMember(owner = "client!he", name = "V", descriptor = "Z")
	private final boolean aBoolean10;

	@OriginalMember(owner = "client!he", name = "E", descriptor = "Z")
	private final boolean aBoolean9;

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "(ZZ)V")
	protected Class11(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean10 = arg0;
		this.aBoolean9 = arg1;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IZI)[B")
	public final byte[] method203(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.method211(arg1, null, arg0);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!va;I)V")
	public final void method204(@OriginalArg(0) Class61 arg0) {
		@Pc(11) Class61 local11 = arg0.method1613();
		@Pc(19) int local19 = this.aClass1_2.method2(local11.method1603());
		if (local19 >= 0) {
			this.method206(local19);
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ZI)V")
	protected void method206(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(I)Z")
	public final boolean method207() {
		@Pc(13) boolean local13 = true;
		for (@Pc(15) int local15 = 0; local15 < this.anIntArray41.length; local15++) {
			@Pc(22) int local22 = this.anIntArray41[local15];
			if (this.aByteArrayArray4[local22] == null) {
				this.method222(local22);
				if (this.aByteArrayArray4[local22] == null) {
					local13 = false;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "([IBI)Z")
	private boolean method208(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aByteArrayArray4[arg1] == null) {
			return false;
		}
		@Pc(15) int[] local15 = this.anIntArrayArray3[arg1];
		@Pc(20) int local20 = this.anIntArray42[arg1];
		@Pc(22) boolean local22 = true;
		@Pc(27) byte[][] local27 = this.aByteArrayArrayArray2[arg1];
		for (@Pc(29) int local29 = 0; local29 < local20; local29++) {
			if (local27[local15[local29]] == null) {
				local22 = false;
				break;
			}
		}
		if (local22) {
			return true;
		}
		@Pc(86) byte[] local86;
		if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
			local86 = this.aByteArrayArray4[arg1];
		} else {
			local86 = new byte[this.aByteArrayArray4[arg1].length];
			Static110.method560(this.aByteArrayArray4[arg1], 0, local86, 0, local86.length);
			@Pc(109) Class10_Sub10 local109 = new Class10_Sub10(local86);
			local109.method1128(local109.aByteArray9.length, arg0);
		}
		@Pc(121) byte[] local121;
		try {
			local121 = Static29.method530(local86);
		} catch (@Pc(123) RuntimeException local123) {
			throw Static57.method832(local123, "T3 - " + (arg0 != null) + "," + arg1 + "," + local86.length + "," + Static38.method633(local86.length, local86) + "," + Static38.method633(local86.length - 2, local86) + "," + this.anIntArray39[arg1] + "," + this.anInt267);
		}
		if (this.aBoolean10) {
			this.aByteArrayArray4[arg1] = null;
		}
		if (local20 <= 1) {
			local27[local15[0]] = local121;
		} else {
			@Pc(197) int local197 = local121.length;
			@Pc(199) int local199 = local197 - 1;
			@Pc(204) int local204 = local121[local199] & 0xFF;
			@Pc(212) int local212 = local199 - local20 * local204 * 4;
			@Pc(217) Class10_Sub10 local217 = new Class10_Sub10(local121);
			local217.anInt1957 = local212;
			@Pc(223) int[] local223 = new int[local20];
			@Pc(228) int local228;
			@Pc(230) int local230;
			for (@Pc(225) int local225 = 0; local225 < local204; local225++) {
				local228 = 0;
				for (local230 = 0; local230 < local20; local230++) {
					local228 += local217.method1112();
					local223[local230] += local228;
				}
			}
			for (local228 = 0; local228 < local20; local228++) {
				if (local27[local15[local228]] == null) {
					local27[local15[local228]] = new byte[local223[local228]];
				}
				local223[local228] = 0;
			}
			local217.anInt1957 = local212;
			local230 = 0;
			for (@Pc(289) int local289 = 0; local289 < local204; local289++) {
				@Pc(292) int local292 = 0;
				for (@Pc(294) int local294 = 0; local294 < local20; local294++) {
					local292 += local217.method1112();
					Static110.method560(local121, local230, local27[local15[local294]], local223[local294], local292);
					local230 += local292;
					local223[local294] += local292;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(III)[B")
	public final byte[] method209(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 < 0 || this.aByteArrayArrayArray2.length <= arg1 || this.aByteArrayArrayArray2[arg1] == null || arg0 < 0 || arg0 >= this.aByteArrayArrayArray2[arg1].length) {
			return null;
		}
		if (this.aByteArrayArrayArray2[arg1][arg0] == null) {
			@Pc(51) boolean local51 = this.method208(null, arg1);
			if (!local51) {
				this.method222(arg1);
				local51 = this.method208(null, arg1);
				if (!local51) {
					return null;
				}
			}
		}
		return this.aByteArrayArrayArray2[arg1][arg0];
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(II)[B")
	public final byte[] method210(@OriginalArg(1) int arg0) {
		if (this.aByteArrayArrayArray2.length == 1) {
			return this.method203(0, arg0);
		} else if (this.aByteArrayArrayArray2[arg0].length == 1) {
			return this.method203(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IB[II)[B")
	public final byte[] method211(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		if (arg2 < 0 || arg2 >= this.aByteArrayArrayArray2.length || this.aByteArrayArrayArray2[arg2] == null || arg0 < 0 || this.aByteArrayArrayArray2[arg2].length <= arg0) {
			return null;
		}
		if (this.aByteArrayArrayArray2[arg2][arg0] == null) {
			@Pc(50) boolean local50 = this.method208(arg1, arg2);
			if (!local50) {
				this.method222(arg2);
				local50 = this.method208(arg1, arg2);
				if (!local50) {
					return null;
				}
			}
		}
		@Pc(73) byte[] local73 = this.aByteArrayArrayArray2[arg2][arg0];
		if (this.aBoolean9) {
			this.aByteArrayArrayArray2[arg2][arg0] = null;
		}
		return local73;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Z[B)V")
	protected final void method212(@OriginalArg(1) byte[] arg0) {
		this.anInt267 = Static38.method633(arg0.length, arg0);
		@Pc(17) Class10_Sub10 local17 = new Class10_Sub10(Static29.method530(arg0));
		@Pc(21) int local21 = local17.method1111();
		if (local21 != 5) {
			return;
		}
		@Pc(35) int local35 = local17.method1111();
		this.anInt277 = local17.method1160();
		this.anIntArray41 = new int[this.anInt277];
		@Pc(47) int local47 = 0;
		@Pc(49) int local49 = -1;
		for (@Pc(51) int local51 = 0; local51 < this.anInt277; local51++) {
			this.anIntArray41[local51] = local47 += local17.method1160();
			if (local49 < this.anIntArray41[local51]) {
				local49 = this.anIntArray41[local51];
			}
		}
		this.aByteArrayArray4 = new byte[local49 + 1][];
		this.anIntArray40 = new int[local49 + 1];
		this.aByteArrayArrayArray2 = new byte[local49 + 1][][];
		this.anIntArrayArray3 = new int[local49 + 1][];
		this.anIntArray39 = new int[local49 + 1];
		this.anIntArray42 = new int[local49 + 1];
		@Pc(142) int local142;
		if (local35 != 0) {
			this.anIntArray44 = new int[local49 + 1];
			for (local142 = 0; local142 < this.anInt277; local142++) {
				this.anIntArray44[this.anIntArray41[local142]] = local17.method1112();
			}
			this.aClass1_2 = new Class1(this.anIntArray44);
		}
		for (local142 = 0; local142 < this.anInt277; local142++) {
			this.anIntArray39[this.anIntArray41[local142]] = local17.method1112();
		}
		for (@Pc(193) int local193 = 0; local193 < this.anInt277; local193++) {
			this.anIntArray40[this.anIntArray41[local193]] = local17.method1112();
		}
		for (@Pc(215) int local215 = 0; local215 < this.anInt277; local215++) {
			this.anIntArray42[this.anIntArray41[local215]] = local17.method1160();
		}
		@Pc(241) int local241;
		@Pc(246) int local246;
		@Pc(254) int local254;
		@Pc(256) int local256;
		for (@Pc(233) int local233 = 0; local233 < this.anInt277; local233++) {
			local47 = 0;
			local241 = this.anIntArray41[local233];
			local246 = this.anIntArray42[local241];
			this.anIntArrayArray3[local241] = new int[local246];
			local254 = -1;
			for (local256 = 0; local256 < local246; local256++) {
				@Pc(272) int local272 = this.anIntArrayArray3[local241][local256] = local47 += local17.method1160();
				if (local254 < local272) {
					local254 = local272;
				}
			}
			this.aByteArrayArrayArray2[local241] = new byte[local254 + 1][];
		}
		if (local35 == 0) {
			return;
		}
		this.aClass1Array2 = new Class1[local49 + 1];
		this.anIntArrayArray4 = new int[local49 + 1][];
		for (local241 = 0; local241 < this.anInt277; local241++) {
			local246 = this.anIntArray41[local241];
			local254 = this.anIntArray42[local246];
			this.anIntArrayArray4[local246] = new int[this.aByteArrayArrayArray2[local246].length];
			for (local256 = 0; local256 < local254; local256++) {
				this.anIntArrayArray4[local246][this.anIntArrayArray3[local246][local256]] = local17.method1112();
			}
			this.aClass1Array2[local246] = new Class1(this.anIntArrayArray4[local246]);
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!va;Lclient!va;I)[B")
	public final byte[] method215(@OriginalArg(0) Class61 arg0, @OriginalArg(1) Class61 arg1) {
		@Pc(13) Class61 local13 = arg0.method1613();
		@Pc(21) Class61 local21 = arg1.method1613();
		@Pc(29) int local29 = this.aClass1_2.method2(local13.method1603());
		@Pc(39) int local39 = this.aClass1Array2[local29].method2(local21.method1603());
		return this.method203(local29, local39);
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(I)V")
	public final void method216() {
		for (@Pc(15) int local15 = 0; local15 < this.aByteArrayArrayArray2.length; local15++) {
			if (this.aByteArrayArrayArray2[local15] != null) {
				for (@Pc(24) int local24 = 0; local24 < this.aByteArrayArrayArray2[local15].length; local24++) {
					this.aByteArrayArrayArray2[local15][local24] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IZ)I")
	public final int method217(@OriginalArg(0) int arg0) {
		return this.aByteArrayArrayArray2[arg0].length;
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(III)Z")
	public final boolean method218(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 < 0 || this.aByteArrayArrayArray2.length <= arg0 || this.aByteArrayArrayArray2[arg0] == null || arg1 < 0 || this.aByteArrayArrayArray2[arg0].length <= arg1) {
			return false;
		} else if (this.aByteArrayArrayArray2[arg0][arg1] != null) {
			return true;
		} else if (this.aByteArrayArray4[arg0] == null) {
			this.method222(arg0);
			return this.aByteArrayArray4[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(II)Z")
	public final boolean method219(@OriginalArg(1) int arg0) {
		if (this.aByteArrayArray4[arg0] == null) {
			this.method222(arg0);
			return this.aByteArrayArray4[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(ZI)V")
	public final void method220(@OriginalArg(1) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.aByteArrayArrayArray2[arg0].length; local1++) {
			this.aByteArrayArrayArray2[arg0][local1] = null;
		}
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(Lclient!va;I)I")
	public final int method221(@OriginalArg(0) Class61 arg0) {
		@Pc(12) Class61 local12 = arg0.method1613();
		return this.aClass1_2.method2(local12.method1603());
	}

	@OriginalMember(owner = "client!he", name = "c", descriptor = "(II)V")
	protected void method222(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!he", name = "d", descriptor = "(II)[I")
	public final int[] method223(@OriginalArg(0) int arg0) {
		return this.anIntArrayArray3[arg0];
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(Lclient!va;Lclient!va;I)Z")
	public final boolean method224(@OriginalArg(0) Class61 arg0, @OriginalArg(1) Class61 arg1) {
		@Pc(3) Class61 local3 = arg0.method1613();
		@Pc(13) Class61 local13 = arg1.method1613();
		@Pc(25) int local25 = this.aClass1_2.method2(local3.method1603());
		@Pc(35) int local35 = this.aClass1Array2[local25].method2(local13.method1603());
		return this.method218(local25, local35);
	}

	@OriginalMember(owner = "client!he", name = "c", descriptor = "(I)I")
	public final int method225() {
		return this.aByteArrayArrayArray2.length;
	}

	@OriginalMember(owner = "client!he", name = "e", descriptor = "(II)[B")
	public final byte[] method226(@OriginalArg(0) int arg0) {
		if (this.aByteArrayArrayArray2.length == 1) {
			return this.method209(arg0, 0);
		} else if (this.aByteArrayArrayArray2[arg0].length == 1) {
			return this.method209(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IBLclient!va;)I")
	public final int method227(@OriginalArg(0) int arg0, @OriginalArg(2) Class61 arg1) {
		@Pc(15) Class61 local15 = arg1.method1613();
		return this.aClass1Array2[arg0].method2(local15.method1603());
	}
}
