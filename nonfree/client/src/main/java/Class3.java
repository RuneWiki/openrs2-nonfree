import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ac")
public abstract class Class3 {

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!ac", name = "o", descriptor = "[[I")
	private int[][] anIntArrayArray16;

	@OriginalMember(owner = "client!ac", name = "t", descriptor = "[I")
	protected int[] anIntArray171;

	@OriginalMember(owner = "client!ac", name = "z", descriptor = "I")
	public int anInt1287;

	@OriginalMember(owner = "client!ac", name = "A", descriptor = "[I")
	private int[] anIntArray172;

	@OriginalMember(owner = "client!ac", name = "E", descriptor = "[Lclient!p;")
	private Class49[] aClass49Array2;

	@OriginalMember(owner = "client!ac", name = "L", descriptor = "[[I")
	private int[][] anIntArrayArray17;

	@OriginalMember(owner = "client!ac", name = "P", descriptor = "[I")
	private int[] anIntArray173;

	@OriginalMember(owner = "client!ac", name = "Q", descriptor = "[I")
	protected int[] anIntArray174;

	@OriginalMember(owner = "client!ac", name = "R", descriptor = "[[B")
	protected byte[][] aByteArrayArray21;

	@OriginalMember(owner = "client!ac", name = "V", descriptor = "I")
	private int anInt1296;

	@OriginalMember(owner = "client!ac", name = "Y", descriptor = "[I")
	protected int[] anIntArray175;

	@OriginalMember(owner = "client!ac", name = "eb", descriptor = "Lclient!p;")
	private Class49 aClass49_2;

	@OriginalMember(owner = "client!ac", name = "S", descriptor = "Z")
	private final boolean aBoolean65;

	@OriginalMember(owner = "client!ac", name = "h", descriptor = "Z")
	private final boolean aBoolean64;

	@OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(ZZ)V")
	protected Class3(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean65 = arg0;
		this.aBoolean64 = arg1;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!kc;ILclient!kc;)[B")
	public final byte[] method922(@OriginalArg(0) Class36 arg0, @OriginalArg(2) Class36 arg1) {
		@Pc(11) Class36 local11 = arg1.method1016();
		@Pc(19) Class36 local19 = arg0.method1016();
		@Pc(27) int local27 = this.aClass49_2.method1464(local11.method1041());
		@Pc(37) int local37 = this.aClass49Array2[local27].method1464(local19.method1041());
		return this.method928(local37, local27);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "([IBI)Z")
	private boolean method923(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aByteArrayArray21[arg1] == null) {
			return false;
		}
		@Pc(15) int[] local15 = this.anIntArrayArray17[arg1];
		@Pc(29) int local29 = this.anIntArray171[arg1];
		@Pc(34) byte[][] local34 = this.aByteArrayArrayArray6[arg1];
		@Pc(36) boolean local36 = true;
		for (@Pc(38) int local38 = 0; local38 < local29; local38++) {
			if (local34[local15[local38]] == null) {
				local36 = false;
				break;
			}
		}
		if (local36) {
			return true;
		}
		@Pc(94) byte[] local94;
		if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
			local94 = this.aByteArrayArray21[arg1];
		} else {
			local94 = new byte[this.aByteArrayArray21[arg1].length];
			Static122.method709(this.aByteArrayArray21[arg1], 0, local94, 0, local94.length);
			@Pc(109) Class2_Sub12 local109 = new Class2_Sub12(local94);
			local109.method1369(local109.aByteArray20.length, arg0);
		}
		@Pc(127) byte[] local127;
		try {
			local127 = Static3.method944(local94);
		} catch (@Pc(129) RuntimeException local129) {
			throw Static17.method336(local129, "T3 - " + (arg0 != null) + "," + arg1 + "," + local94.length + "," + Static85.method1559(local94, local94.length) + "," + Static85.method1559(local94, local94.length - 2) + "," + this.anIntArray175[arg1] + "," + this.anInt1287);
		}
		if (this.aBoolean65) {
			this.aByteArrayArray21[arg1] = null;
		}
		if (local29 > 1) {
			@Pc(196) int local196 = local127.length;
			@Pc(199) int local199 = local196 - 1;
			@Pc(203) int local203 = local127[local199] & 0xFF;
			@Pc(206) int[] local206 = new int[local29];
			@Pc(211) Class2_Sub12 local211 = new Class2_Sub12(local127);
			@Pc(219) int local219 = local199 - local203 * local29 * 4;
			local211.anInt1939 = local219;
			@Pc(227) int local227;
			@Pc(229) int local229;
			for (@Pc(224) int local224 = 0; local224 < local203; local224++) {
				local227 = 0;
				for (local229 = 0; local229 < local29; local229++) {
					local227 += local211.method1412();
					local206[local229] += local227;
				}
			}
			for (local227 = 0; local227 < local29; local227++) {
				if (local34[local15[local227]] == null) {
					local34[local15[local227]] = new byte[local206[local227]];
				}
				local206[local227] = 0;
			}
			local211.anInt1939 = local219;
			local229 = 0;
			for (@Pc(292) int local292 = 0; local292 < local203; local292++) {
				@Pc(295) int local295 = 0;
				for (@Pc(297) int local297 = 0; local297 < local29; local297++) {
					local295 += local211.method1412();
					Static122.method709(local127, local229, local34[local15[local297]], local206[local297], local295);
					local206[local297] += local295;
					local229 += local295;
				}
			}
		} else {
			local34[local15[0]] = local127;
		}
		return true;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)[B")
	public final byte[] method925(@OriginalArg(1) int arg0) {
		if (this.aByteArrayArrayArray6.length == 1) {
			return this.method928(arg0, 0);
		} else if (this.aByteArrayArrayArray6[arg0].length == 1) {
			return this.method928(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(Lclient!kc;ILclient!kc;)Z")
	public final boolean method926(@OriginalArg(0) Class36 arg0, @OriginalArg(2) Class36 arg1) {
		@Pc(7) Class36 local7 = arg0.method1016();
		@Pc(11) Class36 local11 = arg1.method1016();
		@Pc(19) int local19 = this.aClass49_2.method1464(local7.method1041());
		@Pc(37) int local37 = this.aClass49Array2[local19].method1464(local11.method1041());
		return this.method934(local19, local37);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!kc;I)V")
	public final void method927(@OriginalArg(0) Class36 arg0) {
		@Pc(3) Class36 local3 = arg0.method1016();
		@Pc(11) int local11 = this.aClass49_2.method1464(local3.method1041());
		if (local11 >= 0) {
			this.method942(local11);
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IZI)[B")
	public final byte[] method928(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.method933(arg0, arg1, null);
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(II)Z")
	public final boolean method930(@OriginalArg(1) int arg0) {
		if (this.aByteArrayArray21[arg0] == null) {
			this.method945(arg0);
			return this.aByteArrayArray21[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIZ)[B")
	public final byte[] method931(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 < 0 || arg0 >= this.aByteArrayArrayArray6.length || this.aByteArrayArrayArray6[arg0] == null || arg1 < 0 || this.aByteArrayArrayArray6[arg0].length <= arg1) {
			return null;
		}
		if (this.aByteArrayArrayArray6[arg0][arg1] == null) {
			@Pc(50) boolean local50 = this.method923(null, arg0);
			if (!local50) {
				this.method945(arg0);
				local50 = this.method923(null, arg0);
				if (!local50) {
					return null;
				}
			}
		}
		return this.aByteArrayArrayArray6[arg0][arg1];
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(Lclient!kc;I)I")
	public final int method932(@OriginalArg(0) Class36 arg0) {
		@Pc(17) Class36 local17 = arg0.method1016();
		return this.aClass49_2.method1464(local17.method1041());
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(II[IB)[B")
	public final byte[] method933(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		if (arg1 < 0 || this.aByteArrayArrayArray6.length <= arg1 || this.aByteArrayArrayArray6[arg1] == null || arg0 < 0 || this.aByteArrayArrayArray6[arg1].length <= arg0) {
			return null;
		}
		if (this.aByteArrayArrayArray6[arg1][arg0] == null) {
			@Pc(50) boolean local50 = this.method923(arg2, arg1);
			if (!local50) {
				this.method945(arg1);
				local50 = this.method923(arg2, arg1);
				if (!local50) {
					return null;
				}
			}
		}
		@Pc(73) byte[] local73 = this.aByteArrayArrayArray6[arg1][arg0];
		if (this.aBoolean64) {
			this.aByteArrayArrayArray6[arg1][arg0] = null;
		}
		return local73;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IBI)Z")
	public final boolean method934(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 < 0 || this.aByteArrayArrayArray6.length <= arg0 || this.aByteArrayArrayArray6[arg0] == null || arg1 < 0 || arg1 >= this.aByteArrayArrayArray6[arg0].length) {
			return false;
		} else if (this.aByteArrayArrayArray6[arg0][arg1] != null) {
			return true;
		} else if (this.aByteArrayArray21[arg0] == null) {
			this.method945(arg0);
			return this.aByteArrayArray21[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)Z")
	public final boolean method935() {
		@Pc(13) boolean local13 = true;
		for (@Pc(15) int local15 = 0; local15 < this.anIntArray173.length; local15++) {
			@Pc(22) int local22 = this.anIntArray173[local15];
			if (this.aByteArrayArray21[local22] == null) {
				this.method945(local22);
				if (this.aByteArrayArray21[local22] == null) {
					local13 = false;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILclient!kc;I)I")
	public final int method936(@OriginalArg(0) int arg0, @OriginalArg(1) Class36 arg1) {
		@Pc(12) Class36 local12 = arg1.method1016();
		return this.aClass49Array2[arg0].method1464(local12.method1041());
	}

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "(II)V")
	public final void method937(@OriginalArg(0) int arg0) {
		for (@Pc(3) int local3 = 0; local3 < this.aByteArrayArrayArray6[arg0].length; local3++) {
			this.aByteArrayArrayArray6[arg0][local3] = null;
		}
	}

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "(I)V")
	public final void method939() {
		for (@Pc(7) int local7 = 0; local7 < this.aByteArrayArrayArray6.length; local7++) {
			if (this.aByteArrayArrayArray6[local7] != null) {
				for (@Pc(16) int local16 = 0; local16 < this.aByteArrayArrayArray6[local7].length; local16++) {
					this.aByteArrayArrayArray6[local7][local16] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZI)[B")
	public final byte[] method940(@OriginalArg(1) int arg0) {
		if (this.aByteArrayArrayArray6.length == 1) {
			return this.method931(0, arg0);
		} else if (this.aByteArrayArrayArray6[arg0].length == 1) {
			return this.method931(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "(II)V")
	protected void method942(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "(II)[I")
	public final int[] method943(@OriginalArg(0) int arg0) {
		return this.anIntArrayArray17[arg0];
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(ZI)V")
	protected void method945(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!ac", name = "f", descriptor = "(II)I")
	public final int method946(@OriginalArg(1) int arg0) {
		return this.aByteArrayArrayArray6[arg0].length;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)I")
	public final int method947() {
		return this.aByteArrayArrayArray6.length;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "([BZ)V")
	protected final void method948(@OriginalArg(0) byte[] arg0) {
		this.anInt1287 = Static85.method1559(arg0, arg0.length);
		@Pc(23) Class2_Sub12 local23 = new Class2_Sub12(Static3.method944(arg0));
		@Pc(27) int local27 = local23.method1399();
		if (local27 != 5) {
			return;
		}
		@Pc(37) int local37 = local23.method1399();
		this.anInt1296 = local23.method1366();
		this.anIntArray173 = new int[this.anInt1296];
		@Pc(49) int local49 = 0;
		@Pc(51) int local51 = -1;
		for (@Pc(53) int local53 = 0; local53 < this.anInt1296; local53++) {
			this.anIntArray173[local53] = local49 += local23.method1366();
			if (this.anIntArray173[local53] > local51) {
				local51 = this.anIntArray173[local53];
			}
		}
		this.aByteArrayArrayArray6 = new byte[local51 + 1][][];
		this.anIntArray174 = new int[local51 + 1];
		this.aByteArrayArray21 = new byte[local51 + 1][];
		this.anIntArray171 = new int[local51 + 1];
		this.anIntArray175 = new int[local51 + 1];
		this.anIntArrayArray17 = new int[local51 + 1][];
		@Pc(131) int local131;
		if (local37 != 0) {
			this.anIntArray172 = new int[local51 + 1];
			for (local131 = 0; local131 < this.anInt1296; local131++) {
				this.anIntArray172[this.anIntArray173[local131]] = local23.method1412();
			}
			this.aClass49_2 = new Class49(this.anIntArray172);
		}
		for (local131 = 0; local131 < this.anInt1296; local131++) {
			this.anIntArray175[this.anIntArray173[local131]] = local23.method1412();
		}
		for (@Pc(181) int local181 = 0; local181 < this.anInt1296; local181++) {
			this.anIntArray174[this.anIntArray173[local181]] = local23.method1412();
		}
		for (@Pc(204) int local204 = 0; local204 < this.anInt1296; local204++) {
			this.anIntArray171[this.anIntArray173[local204]] = local23.method1366();
		}
		@Pc(230) int local230;
		@Pc(237) int local237;
		@Pc(245) int local245;
		@Pc(247) int local247;
		for (@Pc(223) int local223 = 0; local223 < this.anInt1296; local223++) {
			local230 = this.anIntArray173[local223];
			local49 = 0;
			local237 = this.anIntArray171[local230];
			this.anIntArrayArray17[local230] = new int[local237];
			local245 = -1;
			for (local247 = 0; local247 < local237; local247++) {
				@Pc(264) int local264 = this.anIntArrayArray17[local230][local247] = local49 += local23.method1366();
				if (local264 > local245) {
					local245 = local264;
				}
			}
			this.aByteArrayArrayArray6[local230] = new byte[local245 + 1][];
		}
		if (local37 == 0) {
			return;
		}
		this.aClass49Array2 = new Class49[local51 + 1];
		this.anIntArrayArray16 = new int[local51 + 1][];
		for (local230 = 0; local230 < this.anInt1296; local230++) {
			local237 = this.anIntArray173[local230];
			local245 = this.anIntArray171[local237];
			this.anIntArrayArray16[local237] = new int[this.aByteArrayArrayArray6[local237].length];
			for (local247 = 0; local247 < local245; local247++) {
				this.anIntArrayArray16[local237][this.anIntArrayArray17[local237][local247]] = local23.method1412();
			}
			this.aClass49Array2[local237] = new Class49(this.anIntArrayArray16[local237]);
		}
	}
}
