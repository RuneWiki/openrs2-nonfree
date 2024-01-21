import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!na")
public abstract class Class56 {

	@OriginalMember(owner = "client!na", name = "g", descriptor = "Lclient!w;")
	private Class83 aClass83_2;

	@OriginalMember(owner = "client!na", name = "m", descriptor = "[[I")
	private int[][] anIntArrayArray21;

	@OriginalMember(owner = "client!na", name = "n", descriptor = "[I")
	protected int[] anIntArray296;

	@OriginalMember(owner = "client!na", name = "p", descriptor = "[[I")
	private int[][] anIntArrayArray22;

	@OriginalMember(owner = "client!na", name = "s", descriptor = "[Lclient!w;")
	private Class83[] aClass83Array2;

	@OriginalMember(owner = "client!na", name = "t", descriptor = "[I")
	private int[] anIntArray297;

	@OriginalMember(owner = "client!na", name = "w", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray2;

	@OriginalMember(owner = "client!na", name = "x", descriptor = "[Ljava/lang/Object;")
	protected Object[] anObjectArray3;

	@OriginalMember(owner = "client!na", name = "y", descriptor = "[I")
	private int[] anIntArray298;

	@OriginalMember(owner = "client!na", name = "I", descriptor = "[I")
	protected int[] anIntArray299;

	@OriginalMember(owner = "client!na", name = "M", descriptor = "I")
	private int anInt2323;

	@OriginalMember(owner = "client!na", name = "N", descriptor = "[I")
	protected int[] anIntArray300;

	@OriginalMember(owner = "client!na", name = "P", descriptor = "I")
	public int anInt2325;

	@OriginalMember(owner = "client!na", name = "d", descriptor = "Z")
	private final boolean aBoolean94;

	@OriginalMember(owner = "client!na", name = "W", descriptor = "Z")
	private final boolean aBoolean95;

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "(ZZ)V")
	protected Class56(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean94 = arg0;
		this.aBoolean95 = arg1;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IZ)Z")
	public final boolean method1665(@OriginalArg(0) int arg0) {
		if (this.anObjectArray3[arg0] == null) {
			this.method1676(arg0);
			return this.anObjectArray3[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(III)[B")
	public final byte[] method1666(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.method1683(null, arg0, arg1);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(BLclient!pe;I)I")
	public final int method1667(@OriginalArg(1) Class65 arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class65 local12 = arg0.method1486();
		return this.aClass83Array2[arg1].method1961(local12.method1499());
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(I)Z")
	public final boolean method1668() {
		@Pc(3) boolean local3 = true;
		for (@Pc(16) int local16 = 0; local16 < this.anIntArray298.length; local16++) {
			@Pc(23) int local23 = this.anIntArray298[local16];
			if (this.anObjectArray3[local23] == null) {
				this.method1676(local23);
				if (this.anObjectArray3[local23] == null) {
					local3 = false;
				}
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!pe;Lclient!pe;I)Z")
	public final boolean method1669(@OriginalArg(0) Class65 arg0, @OriginalArg(1) Class65 arg1) {
		@Pc(3) Class65 local3 = arg1.method1486();
		@Pc(16) Class65 local16 = arg0.method1486();
		@Pc(24) int local24 = this.aClass83_2.method1961(local3.method1499());
		@Pc(34) int local34 = this.aClass83Array2[local24].method1961(local16.method1499());
		return this.method1670(local24, local34);
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(III)Z")
	public final boolean method1670(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 < 0 || arg0 >= this.anObjectArrayArray2.length || this.anObjectArrayArray2[arg0] == null || arg1 < 0 || arg1 >= this.anObjectArrayArray2[arg0].length) {
			return false;
		} else if (this.anObjectArrayArray2[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray3[arg0] == null) {
			this.method1676(arg0);
			return this.anObjectArray3[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(II)V")
	public final void method1672(@OriginalArg(1) int arg0) {
		for (@Pc(13) int local13 = 0; local13 < this.anObjectArrayArray2[arg0].length; local13++) {
			this.anObjectArrayArray2[arg0][local13] = null;
		}
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(II)[I")
	public final int[] method1673(@OriginalArg(0) int arg0) {
		return this.anIntArrayArray21[arg0];
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(BI)[B")
	public final byte[] method1675(@OriginalArg(1) int arg0) {
		if (this.anObjectArrayArray2.length == 1) {
			return this.method1666(arg0, 0);
		} else if (this.anObjectArrayArray2[arg0].length == 1) {
			return this.method1666(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IB)V")
	protected void method1676(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(B[B)V")
	protected final void method1677(@OriginalArg(1) byte[] arg0) {
		this.anInt2325 = Static75.method1674(arg0, arg0.length);
		@Pc(19) Class2_Sub4 local19 = new Class2_Sub4(Static112.method1818(arg0));
		@Pc(23) int local23 = local19.method933();
		if (local23 != 5 && local23 != 6) {
			throw new RuntimeException("Incorrect JS5 protocol number: " + local23);
		}
		@Pc(49) int local49 = 0;
		if (local23 >= 6) {
			local19.method903();
		}
		@Pc(60) int local60 = local19.method933();
		this.anInt2323 = local19.method896();
		this.anIntArray298 = new int[this.anInt2323];
		@Pc(72) int local72 = -1;
		for (@Pc(74) int local74 = 0; local74 < this.anInt2323; local74++) {
			this.anIntArray298[local74] = local49 += local19.method896();
			if (local72 < this.anIntArray298[local74]) {
				local72 = this.anIntArray298[local74];
			}
		}
		this.anIntArray299 = new int[local72 + 1];
		this.anObjectArrayArray2 = new Object[local72 + 1][];
		this.anIntArray296 = new int[local72 + 1];
		this.anObjectArray3 = new Object[local72 + 1];
		this.anIntArrayArray21 = new int[local72 + 1][];
		this.anIntArray300 = new int[local72 + 1];
		@Pc(153) int local153;
		if (local60 != 0) {
			this.anIntArray297 = new int[local72 + 1];
			for (local153 = 0; local153 < this.anInt2323; local153++) {
				this.anIntArray297[this.anIntArray298[local153]] = local19.method903();
			}
			this.aClass83_2 = new Class83(this.anIntArray297);
		}
		for (local153 = 0; local153 < this.anInt2323; local153++) {
			this.anIntArray299[this.anIntArray298[local153]] = local19.method903();
		}
		for (@Pc(206) int local206 = 0; local206 < this.anInt2323; local206++) {
			this.anIntArray296[this.anIntArray298[local206]] = local19.method903();
		}
		for (@Pc(229) int local229 = 0; local229 < this.anInt2323; local229++) {
			this.anIntArray300[this.anIntArray298[local229]] = local19.method896();
		}
		@Pc(261) int local261;
		@Pc(268) int local268;
		@Pc(263) int local263;
		@Pc(276) int local276;
		for (@Pc(252) int local252 = 0; local252 < this.anInt2323; local252++) {
			local49 = 0;
			local261 = this.anIntArray298[local252];
			local263 = -1;
			local268 = this.anIntArray300[local261];
			this.anIntArrayArray21[local261] = new int[local268];
			for (local276 = 0; local276 < local268; local276++) {
				@Pc(293) int local293 = this.anIntArrayArray21[local261][local276] = local49 += local19.method896();
				if (local263 < local293) {
					local263 = local293;
				}
			}
			this.anObjectArrayArray2[local261] = new Object[local263 + 1];
		}
		if (local60 == 0) {
			return;
		}
		this.aClass83Array2 = new Class83[local72 + 1];
		this.anIntArrayArray22 = new int[local72 + 1][];
		for (local261 = 0; local261 < this.anInt2323; local261++) {
			local268 = this.anIntArray298[local261];
			local263 = this.anIntArray300[local268];
			this.anIntArrayArray22[local268] = new int[this.anObjectArrayArray2[local268].length];
			for (local276 = 0; local276 < local263; local276++) {
				this.anIntArrayArray22[local268][this.anIntArrayArray21[local268][local276]] = local19.method903();
			}
			this.aClass83Array2[local268] = new Class83(this.anIntArrayArray22[local268]);
		}
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(IB)I")
	public final int method1678(@OriginalArg(0) int arg0) {
		return this.anObjectArrayArray2[arg0].length;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(ZLclient!pe;)V")
	public final void method1680(@OriginalArg(1) Class65 arg0) {
		@Pc(3) Class65 local3 = arg0.method1486();
		@Pc(15) int local15 = this.aClass83_2.method1961(local3.method1499());
		if (local15 >= 0) {
			this.method1687(local15);
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(B)I")
	public final int method1681() {
		return this.anObjectArrayArray2.length;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!pe;Lclient!pe;B)[B")
	public final byte[] method1682(@OriginalArg(0) Class65 arg0, @OriginalArg(1) Class65 arg1) {
		@Pc(3) Class65 local3 = arg1.method1486();
		@Pc(11) Class65 local11 = arg0.method1486();
		@Pc(24) int local24 = this.aClass83_2.method1961(local3.method1499());
		@Pc(34) int local34 = this.aClass83Array2[local24].method1961(local11.method1499());
		return this.method1666(local34, local24);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "([IIII)[B")
	public final byte[] method1683(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 < 0 || this.anObjectArrayArray2.length <= arg2 || this.anObjectArrayArray2[arg2] == null || arg1 < 0 || this.anObjectArrayArray2[arg2].length <= arg1) {
			return null;
		}
		if (this.anObjectArrayArray2[arg2][arg1] == null) {
			@Pc(51) boolean local51 = this.method1689(arg2, arg0);
			if (!local51) {
				this.method1676(arg2);
				local51 = this.method1689(arg2, arg0);
				if (!local51) {
					return null;
				}
			}
		}
		@Pc(79) byte[] local79 = Static128.method1955(false, this.anObjectArrayArray2[arg2][arg1]);
		if (this.aBoolean95) {
			this.anObjectArrayArray2[arg2][arg1] = null;
		}
		return local79;
	}

	@OriginalMember(owner = "client!na", name = "c", descriptor = "(I)V")
	public final void method1685() {
		for (@Pc(3) int local3 = 0; local3 < this.anObjectArrayArray2.length; local3++) {
			if (this.anObjectArrayArray2[local3] != null) {
				for (@Pc(12) int local12 = 0; local12 < this.anObjectArrayArray2[local3].length; local12++) {
					this.anObjectArrayArray2[local3][local12] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(IZ)[B")
	public final byte[] method1686(@OriginalArg(0) int arg0) {
		if (this.anObjectArrayArray2.length == 1) {
			return this.method1688(arg0, 0);
		} else if (this.anObjectArrayArray2[arg0].length == 1) {
			return this.method1688(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!na", name = "c", descriptor = "(II)V")
	protected void method1687(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(BII)[B")
	public final byte[] method1688(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 < 0 || this.anObjectArrayArray2.length <= arg1 || this.anObjectArrayArray2[arg1] == null || arg0 < 0 || this.anObjectArrayArray2[arg1].length <= arg0) {
			return null;
		}
		if (this.anObjectArrayArray2[arg1][arg0] == null) {
			@Pc(50) boolean local50 = this.method1689(arg1, null);
			if (!local50) {
				this.method1676(arg1);
				local50 = this.method1689(arg1, null);
				if (!local50) {
					return null;
				}
			}
		}
		return Static128.method1955(false, this.anObjectArrayArray2[arg1][arg0]);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(I[IB)Z")
	private boolean method1689(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		if (this.anObjectArray3[arg0] == null) {
			return false;
		}
		@Pc(20) int local20 = this.anIntArray300[arg0];
		@Pc(25) int[] local25 = this.anIntArrayArray21[arg0];
		@Pc(27) boolean local27 = true;
		@Pc(32) Object[] local32 = this.anObjectArrayArray2[arg0];
		for (@Pc(34) int local34 = 0; local34 < local20; local34++) {
			if (local32[local25[local34]] == null) {
				local27 = false;
				break;
			}
		}
		if (local27) {
			return true;
		}
		@Pc(91) byte[] local91;
		if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
			local91 = Static128.method1955(false, this.anObjectArray3[arg0]);
		} else {
			local91 = Static128.method1955(true, this.anObjectArray3[arg0]);
			@Pc(96) Class2_Sub4 local96 = new Class2_Sub4(local91);
			local96.method950(local96.aByteArray20.length, arg1);
		}
		@Pc(117) byte[] local117;
		try {
			local117 = Static112.method1818(local91);
		} catch (@Pc(119) RuntimeException local119) {
			throw Static41.method730(local119, "T3 - " + (arg1 != null) + "," + arg0 + "," + local91.length + "," + Static75.method1674(local91, local91.length) + "," + Static75.method1674(local91, local91.length - 2) + "," + this.anIntArray299[arg0] + "," + this.anInt2325);
		}
		if (this.aBoolean94) {
			this.anObjectArray3[arg0] = null;
		}
		if (local20 > 1) {
			@Pc(186) int local186 = local117.length;
			@Pc(188) int local188 = local186 - 1;
			@Pc(193) int local193 = local117[local188] & 0xFF;
			@Pc(201) int local201 = local188 - local20 * 4 * local193;
			@Pc(204) int[] local204 = new int[local20];
			@Pc(209) Class2_Sub4 local209 = new Class2_Sub4(local117);
			local209.anInt1298 = local201;
			@Pc(219) int local219;
			for (@Pc(214) int local214 = 0; local214 < local193; local214++) {
				@Pc(217) int local217 = 0;
				for (local219 = 0; local219 < local20; local219++) {
					local217 += local209.method903();
					local204[local219] += local217;
				}
			}
			@Pc(252) byte[][] local252 = new byte[local20][];
			for (local219 = 0; local219 < local20; local219++) {
				local252[local219] = new byte[local204[local219]];
				local204[local219] = 0;
			}
			local209.anInt1298 = local201;
			@Pc(279) int local279 = 0;
			@Pc(284) int local284;
			for (@Pc(281) int local281 = 0; local281 < local193; local281++) {
				local284 = 0;
				for (@Pc(286) int local286 = 0; local286 < local20; local286++) {
					local284 += local209.method903();
					Static135.method359(local117, local279, local252[local286], local204[local286], local284);
					local204[local286] += local284;
					local279 += local284;
				}
			}
			for (local284 = 0; local284 < local20; local284++) {
				if (this.aBoolean95) {
					local32[local25[local284]] = local252[local284];
				} else {
					local32[local25[local284]] = Static33.method628(local252[local284]);
				}
			}
		} else if (this.aBoolean95) {
			local32[local25[0]] = local117;
		} else {
			local32[local25[0]] = Static33.method628(local117);
		}
		return true;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(ILclient!pe;)I")
	public final int method1690(@OriginalArg(1) Class65 arg0) {
		@Pc(15) Class65 local15 = arg0.method1486();
		return this.aClass83_2.method1961(local15.method1499());
	}
}
