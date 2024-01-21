import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ag")
public abstract class Class4 {

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "[[I")
	private int[][] anIntArrayArray26;

	@OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
	private int anInt3154;

	@OriginalMember(owner = "client!ag", name = "l", descriptor = "[Ljava/lang/Object;")
	protected Object[] anObjectArray28;

	@OriginalMember(owner = "client!ag", name = "o", descriptor = "[I")
	protected int[] anIntArray302;

	@OriginalMember(owner = "client!ag", name = "r", descriptor = "[I")
	private int[] anIntArray303;

	@OriginalMember(owner = "client!ag", name = "s", descriptor = "[I")
	private int[] anIntArray304;

	@OriginalMember(owner = "client!ag", name = "E", descriptor = "[I")
	protected int[] anIntArray305;

	@OriginalMember(owner = "client!ag", name = "I", descriptor = "[[I")
	private int[][] anIntArrayArray27;

	@OriginalMember(owner = "client!ag", name = "J", descriptor = "Lclient!od;")
	private Class64 aClass64_2;

	@OriginalMember(owner = "client!ag", name = "Q", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray2;

	@OriginalMember(owner = "client!ag", name = "S", descriptor = "[I")
	protected int[] anIntArray306;

	@OriginalMember(owner = "client!ag", name = "T", descriptor = "[I")
	private int[] anIntArray307;

	@OriginalMember(owner = "client!ag", name = "Z", descriptor = "I")
	public int anInt3186;

	@OriginalMember(owner = "client!ag", name = "cb", descriptor = "[Lclient!od;")
	private Class64[] aClass64Array2;

	@OriginalMember(owner = "client!ag", name = "t", descriptor = "Z")
	private final boolean aBoolean237;

	@OriginalMember(owner = "client!ag", name = "j", descriptor = "Z")
	private final boolean aBoolean236;

	@OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(ZZ)V")
	protected Class4(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean237 = arg1;
		this.aBoolean236 = arg0;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!dd;B)I")
	public final int method2241(@OriginalArg(0) Class13 arg0) {
		@Pc(3) Class13 local3 = arg0.method876();
		@Pc(22) int local22 = this.aClass64_2.method2302(local3.method885());
		return this.method2246(local22) ? local22 : -1;
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(I)Z")
	public final boolean method2242() {
		@Pc(7) boolean local7 = true;
		for (@Pc(14) int local14 = 0; local14 < this.anIntArray304.length; local14++) {
			@Pc(21) int local21 = this.anIntArray304[local14];
			if (this.anObjectArray28[local21] == null) {
				this.method2250(local21);
				if (this.anObjectArray28[local21] == null) {
					local7 = false;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(III)[B")
	public final byte[] method2243(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.method2251(null, arg0, arg1);
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)Z")
	public final boolean method2244(@OriginalArg(1) int arg0) {
		if (this.anIntArray303.length == 1) {
			return this.method2247(0, arg0);
		} else if (!this.method2246(arg0)) {
			return false;
		} else if (this.anIntArray303[arg0] == 1) {
			return this.method2247(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IB)[B")
	public final byte[] method2245(@OriginalArg(0) int arg0) {
		if (this.anIntArray303.length == 1) {
			return this.method2243(0, arg0);
		} else if (!this.method2246(arg0)) {
			return null;
		} else if (this.anIntArray303[arg0] == 1) {
			return this.method2243(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(II)Z")
	protected final boolean method2246(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < this.anIntArray303.length && this.anIntArray303[arg0] != 0) {
			return true;
		} else if (Static32.aBoolean320) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(III)Z")
	public final boolean method2247(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method2256(arg0, arg1)) {
			return false;
		} else if (this.anObjectArrayArray2[arg0] != null && this.anObjectArrayArray2[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray28[arg0] == null) {
			this.method2250(arg0);
			return this.anObjectArray28[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "(I)I")
	public final int method2248() {
		return this.anIntArray303.length;
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(IB)V")
	public final void method2249(@OriginalArg(0) int arg0) {
		if (this.method2246(arg0)) {
			this.anObjectArrayArray2[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "(II)V")
	protected void method2250(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "([IIII)[B")
	public final byte[] method2251(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!this.method2256(arg1, arg2)) {
			return null;
		}
		if (this.anObjectArrayArray2[arg1] == null || this.anObjectArrayArray2[arg1][arg2] == null) {
			@Pc(35) boolean local35 = this.method2252(arg0, arg1);
			if (!local35) {
				this.method2250(arg1);
				local35 = this.method2252(arg0, arg1);
				if (!local35) {
					return null;
				}
			}
		}
		@Pc(61) byte[] local61 = Static94.method1976(false, this.anObjectArrayArray2[arg1][arg2]);
		if (this.aBoolean237) {
			this.anObjectArrayArray2[arg1][arg2] = null;
			if (this.anIntArray303[arg1] == 1) {
				this.anObjectArrayArray2[arg1] = null;
			}
		}
		return local61;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(I[II)Z")
	private boolean method2252(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		if (!this.method2246(arg1)) {
			return false;
		} else if (this.anObjectArray28[arg1] == null) {
			return false;
		} else {
			@Pc(24) int[] local24 = this.anIntArrayArray26[arg1];
			@Pc(29) int local29 = this.anIntArray306[arg1];
			if (this.anObjectArrayArray2[arg1] == null) {
				this.anObjectArrayArray2[arg1] = new Object[this.anIntArray303[arg1]];
			}
			@Pc(53) Object[] local53 = this.anObjectArrayArray2[arg1];
			@Pc(55) boolean local55 = true;
			for (@Pc(57) int local57 = 0; local57 < local29; local57++) {
				@Pc(63) int local63;
				if (local24 == null) {
					local63 = local57;
				} else {
					local63 = local24[local57];
				}
				if (local53[local63] == null) {
					local55 = false;
					break;
				}
			}
			if (local55) {
				return true;
			}
			@Pc(115) byte[] local115;
			if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
				local115 = Static94.method1976(false, this.anObjectArray28[arg1]);
			} else {
				local115 = Static94.method1976(true, this.anObjectArray28[arg1]);
				@Pc(120) Class1_Sub8 local120 = new Class1_Sub8(local115);
				local120.method1601(local120.aByteArray27.length, arg0);
			}
			@Pc(142) byte[] local142;
			try {
				local142 = Static109.method2133(local115);
			} catch (@Pc(144) RuntimeException local144) {
				throw Static45.method1188(local144, "T3 - " + (arg0 != null) + "," + arg1 + "," + local115.length + "," + Static111.method2162(local115, local115.length) + "," + Static111.method2162(local115, local115.length - 2) + "," + this.anIntArray302[arg1] + "," + this.anInt3186);
			}
			if (this.aBoolean236) {
				this.anObjectArray28[arg1] = null;
			}
			@Pc(214) int local214;
			if (local29 <= 1) {
				if (local24 == null) {
					local214 = 0;
				} else {
					local214 = local24[0];
				}
				if (this.aBoolean237) {
					local53[local214] = local142;
				} else {
					local53[local214] = Static43.method1147(local142);
				}
			} else {
				local214 = local142.length;
				local214--;
				@Pc(248) int local248 = local142[local214] & 0xFF;
				local214 -= local248 * 4 * local29;
				@Pc(261) Class1_Sub8 local261 = new Class1_Sub8(local142);
				local261.anInt2195 = local214;
				@Pc(267) int[] local267 = new int[local29];
				@Pc(275) int local275;
				for (@Pc(269) int local269 = 0; local269 < local248; local269++) {
					@Pc(273) int local273 = 0;
					for (local275 = 0; local275 < local29; local275++) {
						local273 += local261.method1626();
						local267[local275] += local273;
					}
				}
				@Pc(309) byte[][] local309 = new byte[local29][];
				for (local275 = 0; local275 < local29; local275++) {
					local309[local275] = new byte[local267[local275]];
					local267[local275] = 0;
				}
				local261.anInt2195 = local214;
				@Pc(337) int local337 = 0;
				@Pc(343) int local343;
				@Pc(345) int local345;
				for (@Pc(339) int local339 = 0; local339 < local248; local339++) {
					local343 = 0;
					for (local345 = 0; local345 < local29; local345++) {
						local343 += local261.method1626();
						Static193.method2480(local142, local337, local309[local345], local267[local345], local343);
						local267[local345] += local343;
						local337 += local343;
					}
				}
				for (local343 = 0; local343 < local29; local343++) {
					if (local24 == null) {
						local345 = local343;
					} else {
						local345 = local24[local343];
					}
					if (this.aBoolean237) {
						local53[local345] = local309[local343];
					} else {
						local53[local345] = Static43.method1147(local309[local343]);
					}
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZIZ)V")
	public final void method2253(@OriginalArg(2) boolean arg0) {
		if (arg0) {
			this.aClass64_2 = null;
			this.anIntArray307 = null;
		}
		this.aClass64Array2 = null;
		this.anIntArrayArray27 = null;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!dd;Lclient!dd;I)Z")
	public final boolean method2254(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class13 arg1) {
		@Pc(3) Class13 local3 = arg0.method876();
		@Pc(7) Class13 local7 = arg1.method876();
		@Pc(15) int local15 = this.aClass64_2.method2302(local3.method885());
		if (this.method2246(local15)) {
			@Pc(38) int local38 = this.aClass64Array2[local15].method2302(local7.method885());
			return this.method2247(local15, local38);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILclient!dd;B)I")
	public final int method2255(@OriginalArg(0) int arg0, @OriginalArg(1) Class13 arg1) {
		if (this.method2246(arg0)) {
			@Pc(14) Class13 local14 = arg1.method876();
			@Pc(32) int local32 = this.aClass64Array2[arg0].method2302(local14.method885());
			return this.method2256(arg0, local32) ? local32 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "(III)Z")
	private boolean method2256(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 >= 0 && arg1 >= 0 && arg0 < this.anIntArray303.length && arg1 < this.anIntArray303[arg0]) {
			return true;
		} else if (Static32.aBoolean320) {
			throw new IllegalArgumentException(arg0 + "," + arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ag", name = "d", descriptor = "(II)I")
	protected int method2257(@OriginalArg(1) int arg0) {
		if (this.method2246(arg0)) {
			return this.anObjectArray28[arg0] == null ? 0 : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(BI)I")
	public final int method2260(@OriginalArg(1) int arg0) {
		return this.method2246(arg0) ? this.anIntArray303[arg0] : 0;
	}

	@OriginalMember(owner = "client!ag", name = "d", descriptor = "(III)[B")
	public final byte[] method2261(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method2256(arg0, arg1)) {
			return null;
		}
		if (this.anObjectArrayArray2[arg0] == null || this.anObjectArrayArray2[arg0][arg1] == null) {
			@Pc(36) boolean local36 = this.method2252(null, arg0);
			if (!local36) {
				this.method2250(arg0);
				local36 = this.method2252(null, arg0);
				if (!local36) {
					return null;
				}
			}
		}
		return Static94.method1976(false, this.anObjectArrayArray2[arg0][arg1]);
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILclient!dd;Lclient!dd;)[B")
	public final byte[] method2262(@OriginalArg(1) Class13 arg0, @OriginalArg(2) Class13 arg1) {
		@Pc(7) Class13 local7 = arg0.method876();
		@Pc(11) Class13 local11 = arg1.method876();
		@Pc(19) int local19 = this.aClass64_2.method2302(local7.method885());
		if (this.method2246(local19)) {
			@Pc(38) int local38 = this.aClass64Array2[local19].method2302(local11.method885());
			return this.method2243(local19, local38);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "(IB)V")
	protected void method2263(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ag", name = "d", descriptor = "(I)I")
	public final int method2264() {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < this.anObjectArray28.length; local11++) {
			if (this.anIntArray306[local11] > 0) {
				local7 += 100;
				local9 += this.method2257(local11);
			}
		}
		if (local7 == 0) {
			return 100;
		} else {
			return local9 * 100 / local7;
		}
	}

	@OriginalMember(owner = "client!ag", name = "e", descriptor = "(II)[I")
	public final int[] method2265(@OriginalArg(0) int arg0) {
		if (!this.method2246(arg0)) {
			return null;
		}
		@Pc(22) int[] local22 = this.anIntArrayArray26[arg0];
		if (local22 == null) {
			local22 = new int[this.anIntArray306[arg0]];
			@Pc(32) int local32 = 0;
			while (local32 < local22.length) {
				local22[local32] = local32++;
			}
		}
		return local22;
	}

	@OriginalMember(owner = "client!ag", name = "e", descriptor = "(I)V")
	public final void method2266() {
		for (@Pc(10) int local10 = 0; local10 < this.anObjectArrayArray2.length; local10++) {
			this.anObjectArrayArray2[local10] = null;
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(BLclient!dd;)V")
	public final void method2267(@OriginalArg(1) Class13 arg0) {
		@Pc(15) Class13 local15 = arg0.method876();
		@Pc(23) int local23 = this.aClass64_2.method2302(local15.method885());
		this.method2263(local23);
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Z[B)V")
	protected final void method2268(@OriginalArg(1) byte[] arg0) {
		this.anInt3186 = Static111.method2162(arg0, arg0.length);
		@Pc(19) Class1_Sub8 local19 = new Class1_Sub8(Static109.method2133(arg0));
		@Pc(23) int local23 = local19.method1607();
		if (local23 != 5 && local23 != 6) {
			throw new RuntimeException("Incorrect JS5 protocol number: " + local23);
		}
		if (local23 >= 6) {
			local19.method1626();
		}
		@Pc(53) int local53 = 0;
		@Pc(57) int local57 = local19.method1607();
		@Pc(59) int local59 = -1;
		this.anInt3154 = local19.method1642();
		this.anIntArray304 = new int[this.anInt3154];
		for (@Pc(71) int local71 = 0; local71 < this.anInt3154; local71++) {
			this.anIntArray304[local71] = local53 += local19.method1642();
			if (this.anIntArray304[local71] > local59) {
				local59 = this.anIntArray304[local71];
			}
		}
		this.anObjectArrayArray2 = new Object[local59 + 1][];
		this.anIntArray302 = new int[local59 + 1];
		this.anIntArray303 = new int[local59 + 1];
		this.anIntArrayArray26 = new int[local59 + 1][];
		this.anIntArray305 = new int[local59 + 1];
		this.anIntArray306 = new int[local59 + 1];
		this.anObjectArray28 = new Object[local59 + 1];
		@Pc(162) int local162;
		@Pc(177) int local177;
		if (local57 != 0) {
			this.anIntArray307 = new int[local59 + 1];
			for (local162 = 0; local162 < local59 + 1; local162++) {
				this.anIntArray307[local162] = -1;
			}
			for (local177 = 0; local177 < this.anInt3154; local177++) {
				this.anIntArray307[this.anIntArray304[local177]] = local19.method1626();
			}
			this.aClass64_2 = new Class64(this.anIntArray307);
		}
		for (local162 = 0; local162 < this.anInt3154; local162++) {
			this.anIntArray302[this.anIntArray304[local162]] = local19.method1626();
		}
		for (local177 = 0; local177 < this.anInt3154; local177++) {
			this.anIntArray305[this.anIntArray304[local177]] = local19.method1626();
		}
		for (@Pc(245) int local245 = 0; local245 < this.anInt3154; local245++) {
			this.anIntArray306[this.anIntArray304[local245]] = local19.method1642();
		}
		@Pc(273) int local273;
		@Pc(278) int local278;
		@Pc(286) int local286;
		@Pc(288) int local288;
		@Pc(305) int local305;
		for (@Pc(264) int local264 = 0; local264 < this.anInt3154; local264++) {
			local53 = 0;
			local273 = this.anIntArray304[local264];
			local278 = this.anIntArray306[local273];
			this.anIntArrayArray26[local273] = new int[local278];
			local286 = -1;
			for (local288 = 0; local288 < local278; local288++) {
				local305 = this.anIntArrayArray26[local273][local288] = local53 += local19.method1642();
				if (local305 > local286) {
					local286 = local305;
				}
			}
			this.anIntArray303[local273] = local286 + 1;
			if (local286 + 1 == local278) {
				this.anIntArrayArray26[local273] = null;
			}
		}
		if (local57 == 0) {
			return;
		}
		this.aClass64Array2 = new Class64[local59 + 1];
		this.anIntArrayArray27 = new int[local59 + 1][];
		for (local273 = 0; local273 < this.anInt3154; local273++) {
			local278 = this.anIntArray304[local273];
			local286 = this.anIntArray306[local278];
			this.anIntArrayArray27[local278] = new int[this.anIntArray303[local278]];
			for (local288 = 0; local288 < this.anIntArray303[local278]; local288++) {
				this.anIntArrayArray27[local278][local288] = -1;
			}
			for (local305 = 0; local305 < local286; local305++) {
				@Pc(422) int local422;
				if (this.anIntArrayArray26[local278] == null) {
					local422 = local305;
				} else {
					local422 = this.anIntArrayArray26[local278][local305];
				}
				this.anIntArrayArray27[local278][local422] = local19.method1626();
			}
			this.aClass64Array2[local278] = new Class64(this.anIntArrayArray27[local278]);
		}
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(BI)Z")
	public final boolean method2269(@OriginalArg(1) int arg0) {
		if (!this.method2246(arg0)) {
			return false;
		} else if (this.anObjectArray28[arg0] == null) {
			this.method2250(arg0);
			return this.anObjectArray28[arg0] != null;
		} else {
			return true;
		}
	}
}
