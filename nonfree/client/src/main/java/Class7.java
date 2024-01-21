import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ah")
public abstract class Class7 {

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray2;

	@OriginalMember(owner = "client!ah", name = "c", descriptor = "Lclient!nb;")
	private Class56 aClass56_2;

	@OriginalMember(owner = "client!ah", name = "g", descriptor = "[I")
	protected int[] anIntArray223;

	@OriginalMember(owner = "client!ah", name = "h", descriptor = "[Lclient!nb;")
	private Class56[] aClass56Array2;

	@OriginalMember(owner = "client!ah", name = "l", descriptor = "I")
	private int anInt1189;

	@OriginalMember(owner = "client!ah", name = "p", descriptor = "[Ljava/lang/Object;")
	protected Object[] anObjectArray3;

	@OriginalMember(owner = "client!ah", name = "F", descriptor = "[[I")
	private int[][] anIntArrayArray17;

	@OriginalMember(owner = "client!ah", name = "G", descriptor = "[I")
	private int[] anIntArray224;

	@OriginalMember(owner = "client!ah", name = "H", descriptor = "[I")
	private int[] anIntArray225;

	@OriginalMember(owner = "client!ah", name = "I", descriptor = "[I")
	protected int[] anIntArray226;

	@OriginalMember(owner = "client!ah", name = "K", descriptor = "[I")
	protected int[] anIntArray227;

	@OriginalMember(owner = "client!ah", name = "L", descriptor = "[[I")
	private int[][] anIntArrayArray18;

	@OriginalMember(owner = "client!ah", name = "O", descriptor = "I")
	public int anInt1207;

	@OriginalMember(owner = "client!ah", name = "j", descriptor = "Z")
	private final boolean aBoolean61;

	@OriginalMember(owner = "client!ah", name = "M", descriptor = "Z")
	private final boolean aBoolean62;

	@OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(ZZ)V")
	protected Class7(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean61 = arg0;
		this.aBoolean62 = arg1;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(III)[B")
	public final byte[] method1011(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 < 0 || arg1 >= this.anObjectArrayArray2.length || this.anObjectArrayArray2[arg1] == null || arg0 < 0 || arg0 >= this.anObjectArrayArray2[arg1].length) {
			return null;
		}
		if (this.anObjectArrayArray2[arg1][arg0] == null) {
			@Pc(52) boolean local52 = this.method1030(null, arg1);
			if (!local52) {
				this.method1020(arg1);
				local52 = this.method1030(null, arg1);
				if (!local52) {
					return null;
				}
			}
		}
		return Static12.method473(false, this.anObjectArrayArray2[arg1][arg0]);
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)Z")
	public final boolean method1012() {
		@Pc(7) boolean local7 = true;
		for (@Pc(9) int local9 = 0; local9 < this.anIntArray224.length; local9++) {
			@Pc(16) int local16 = this.anIntArray224[local9];
			if (this.anObjectArray3[local16] == null) {
				this.method1020(local16);
				if (this.anObjectArray3[local16] == null) {
					local7 = false;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "(I)V")
	public final void method1013() {
		for (@Pc(5) int local5 = 0; local5 < this.anObjectArrayArray2.length; local5++) {
			if (this.anObjectArrayArray2[local5] != null) {
				for (@Pc(13) int local13 = 0; local13 < this.anObjectArrayArray2[local5].length; local13++) {
					this.anObjectArrayArray2[local5][local13] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(BII)Z")
	public final boolean method1014(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 < 0 || this.anObjectArrayArray2.length <= arg1 || this.anObjectArrayArray2[arg1] == null || arg0 < 0 || this.anObjectArrayArray2[arg1].length <= arg0) {
			return false;
		} else if (this.anObjectArrayArray2[arg1][arg0] != null) {
			return true;
		} else if (this.anObjectArray3[arg1] == null) {
			this.method1020(arg1);
			return this.anObjectArray3[arg1] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(II)[I")
	public final int[] method1015(@OriginalArg(1) int arg0) {
		return this.anIntArrayArray18[arg0];
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(BLclient!eh;)V")
	public final void method1016(@OriginalArg(1) Class28 arg0) {
		@Pc(9) Class28 local9 = arg0.method931();
		@Pc(21) int local21 = this.aClass56_2.method2118(local9.method922());
		if (local21 >= 0) {
			this.method1024(local21);
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(I[B)V")
	protected final void method1017(@OriginalArg(1) byte[] arg0) {
		this.anInt1207 = Static52.method1209(arg0, arg0.length);
		@Pc(17) Class3_Sub8 local17 = new Class3_Sub8(Static118.method2372(arg0));
		@Pc(21) int local21 = local17.method1545();
		if (local21 != 5 && local21 != 6) {
			throw new RuntimeException("Incorrect JS5 protocol number: " + local21);
		}
		@Pc(42) int local42 = 0;
		if (local21 >= 6) {
			local17.method1540();
		}
		@Pc(53) int local53 = local17.method1545();
		@Pc(55) int local55 = -1;
		this.anInt1189 = local17.method1510();
		this.anIntArray224 = new int[this.anInt1189];
		for (@Pc(69) int local69 = 0; local69 < this.anInt1189; local69++) {
			this.anIntArray224[local69] = local42 += local17.method1510();
			if (local55 < this.anIntArray224[local69]) {
				local55 = this.anIntArray224[local69];
			}
		}
		this.anIntArray227 = new int[local55 + 1];
		this.anIntArrayArray18 = new int[local55 + 1][];
		this.anIntArray226 = new int[local55 + 1];
		this.anObjectArrayArray2 = new Object[local55 + 1][];
		this.anObjectArray3 = new Object[local55 + 1];
		this.anIntArray223 = new int[local55 + 1];
		@Pc(153) int local153;
		@Pc(167) int local167;
		if (local53 != 0) {
			this.anIntArray225 = new int[local55 + 1];
			for (local153 = 0; local153 < local55 + 1; local153++) {
				this.anIntArray225[local153] = -1;
			}
			for (local167 = 0; local167 < this.anInt1189; local167++) {
				this.anIntArray225[this.anIntArray224[local167]] = local17.method1540();
			}
			this.aClass56_2 = new Class56(this.anIntArray225);
		}
		for (local153 = 0; local153 < this.anInt1189; local153++) {
			this.anIntArray226[this.anIntArray224[local153]] = local17.method1540();
		}
		for (local167 = 0; local167 < this.anInt1189; local167++) {
			this.anIntArray223[this.anIntArray224[local167]] = local17.method1540();
		}
		for (@Pc(239) int local239 = 0; local239 < this.anInt1189; local239++) {
			this.anIntArray227[this.anIntArray224[local239]] = local17.method1510();
		}
		@Pc(267) int local267;
		@Pc(272) int local272;
		@Pc(260) int local260;
		@Pc(280) int local280;
		@Pc(298) int local298;
		for (@Pc(257) int local257 = 0; local257 < this.anInt1189; local257++) {
			local260 = -1;
			local42 = 0;
			local267 = this.anIntArray224[local257];
			local272 = this.anIntArray227[local267];
			this.anIntArrayArray18[local267] = new int[local272];
			for (local280 = 0; local280 < local272; local280++) {
				local298 = this.anIntArrayArray18[local267][local280] = local42 += local17.method1510();
				if (local260 < local298) {
					local260 = local298;
				}
			}
			this.anObjectArrayArray2[local267] = new Object[local260 + 1];
		}
		if (local53 == 0) {
			return;
		}
		this.aClass56Array2 = new Class56[local55 + 1];
		this.anIntArrayArray17 = new int[local55 + 1][];
		for (local267 = 0; local267 < this.anInt1189; local267++) {
			local272 = this.anIntArray224[local267];
			local260 = this.anIntArray227[local272];
			this.anIntArrayArray17[local272] = new int[this.anObjectArrayArray2[local272].length];
			for (local280 = 0; local280 < this.anObjectArrayArray2[local272].length; local280++) {
				this.anIntArrayArray17[local272][local280] = -1;
			}
			for (local298 = 0; local298 < local260; local298++) {
				this.anIntArrayArray17[local272][this.anIntArrayArray18[local272][local298]] = local17.method1540();
			}
			this.aClass56Array2[local272] = new Class56(this.anIntArrayArray17[local272]);
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(BI)V")
	protected void method1020(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "(III)[B")
	public final byte[] method1021(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.method1033(null, arg1, arg0);
	}

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "(II)I")
	public final int method1022(@OriginalArg(1) int arg0) {
		return this.anObjectArrayArray2[arg0].length;
	}

	@OriginalMember(owner = "client!ah", name = "c", descriptor = "(II)Z")
	public final boolean method1023(@OriginalArg(0) int arg0) {
		if (this.anObjectArrayArray2.length == 1) {
			return this.method1014(arg0, 0);
		} else if (this.anObjectArrayArray2[arg0].length == 1) {
			return this.method1014(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "(BI)V")
	protected void method1024(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(B)I")
	public final int method1025() {
		return this.anObjectArrayArray2.length;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IB)[B")
	public final byte[] method1026(@OriginalArg(0) int arg0) {
		if (this.anObjectArrayArray2.length == 1) {
			return this.method1021(0, arg0);
		} else if (this.anObjectArrayArray2[arg0].length == 1) {
			return this.method1021(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IZ)Z")
	public final boolean method1027(@OriginalArg(0) int arg0) {
		if (this.anObjectArray3[arg0] == null) {
			this.method1020(arg0);
			return this.anObjectArray3[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(BLclient!eh;Lclient!eh;)Z")
	public final boolean method1028(@OriginalArg(1) Class28 arg0, @OriginalArg(2) Class28 arg1) {
		@Pc(3) Class28 local3 = arg1.method931();
		@Pc(16) Class28 local16 = arg0.method931();
		@Pc(24) int local24 = this.aClass56_2.method2118(local3.method922());
		@Pc(34) int local34 = this.aClass56Array2[local24].method2118(local16.method922());
		return this.method1014(local34, local24);
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lclient!eh;I)I")
	public final int method1029(@OriginalArg(0) Class28 arg0) {
		@Pc(7) Class28 local7 = arg0.method931();
		return this.aClass56_2.method2118(local7.method922());
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "([IBI)Z")
	private boolean method1030(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.anObjectArray3[arg1] == null) {
			return false;
		}
		@Pc(15) int local15 = this.anIntArray227[arg1];
		@Pc(20) int[] local20 = this.anIntArrayArray18[arg1];
		@Pc(25) Object[] local25 = this.anObjectArrayArray2[arg1];
		@Pc(27) boolean local27 = true;
		for (@Pc(34) int local34 = 0; local34 < local15; local34++) {
			if (local25[local20[local34]] == null) {
				local27 = false;
				break;
			}
		}
		if (local27) {
			return true;
		}
		@Pc(91) byte[] local91;
		if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
			local91 = Static12.method473(false, this.anObjectArray3[arg1]);
		} else {
			local91 = Static12.method473(true, this.anObjectArray3[arg1]);
			@Pc(105) Class3_Sub8 local105 = new Class3_Sub8(local91);
			local105.method1501(local105.aByteArray19.length, arg0);
		}
		@Pc(117) byte[] local117;
		try {
			local117 = Static118.method2372(local91);
		} catch (@Pc(119) RuntimeException local119) {
			throw Static14.method526(local119, "T3 - " + (arg0 != null) + "," + arg1 + "," + local91.length + "," + Static52.method1209(local91, local91.length) + "," + Static52.method1209(local91, local91.length - 2) + "," + this.anIntArray226[arg1] + "," + this.anInt1207);
		}
		if (this.aBoolean61) {
			this.anObjectArray3[arg1] = null;
		}
		if (local15 > 1) {
			@Pc(208) int local208 = local117.length;
			@Pc(211) int local211 = local208 - 1;
			@Pc(215) int local215 = local117[local211] & 0xFF;
			@Pc(218) int[] local218 = new int[local15];
			@Pc(226) int local226 = local211 - local215 * 4 * local15;
			@Pc(231) Class3_Sub8 local231 = new Class3_Sub8(local117);
			local231.anInt1948 = local226;
			@Pc(241) int local241;
			for (@Pc(236) int local236 = 0; local236 < local215; local236++) {
				@Pc(239) int local239 = 0;
				for (local241 = 0; local241 < local15; local241++) {
					local239 += local231.method1540();
					local218[local241] += local239;
				}
			}
			@Pc(266) byte[][] local266 = new byte[local15][];
			for (local241 = 0; local241 < local15; local241++) {
				local266[local241] = new byte[local218[local241]];
				local218[local241] = 0;
			}
			local231.anInt1948 = local226;
			@Pc(289) int local289 = 0;
			@Pc(294) int local294;
			for (@Pc(291) int local291 = 0; local291 < local215; local291++) {
				local294 = 0;
				for (@Pc(296) int local296 = 0; local296 < local15; local296++) {
					local294 += local231.method1540();
					Static188.method2240(local117, local289, local266[local296], local218[local296], local294);
					local289 += local294;
					local218[local296] += local294;
				}
			}
			for (local294 = 0; local294 < local15; local294++) {
				if (this.aBoolean62) {
					local25[local20[local294]] = local266[local294];
				} else {
					local25[local20[local294]] = Static47.method1123(local266[local294]);
				}
			}
		} else if (this.aBoolean62) {
			local25[local20[0]] = local117;
		} else {
			local25[local20[0]] = Static47.method1123(local117);
		}
		return true;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lclient!eh;IZ)I")
	public final int method1031(@OriginalArg(0) Class28 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class28 local3 = arg0.method931();
		return this.aClass56Array2[arg1].method2118(local3.method922());
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lclient!eh;ILclient!eh;)[B")
	public final byte[] method1032(@OriginalArg(0) Class28 arg0, @OriginalArg(2) Class28 arg1) {
		@Pc(7) Class28 local7 = arg1.method931();
		@Pc(11) Class28 local11 = arg0.method931();
		@Pc(26) int local26 = this.aClass56_2.method2118(local7.method922());
		@Pc(36) int local36 = this.aClass56Array2[local26].method2118(local11.method922());
		return this.method1021(local26, local36);
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "([IIII)[B")
	public final byte[] method1033(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 < 0 || arg2 >= this.anObjectArrayArray2.length || this.anObjectArrayArray2[arg2] == null || arg1 < 0 || this.anObjectArrayArray2[arg2].length <= arg1) {
			return null;
		}
		if (this.anObjectArrayArray2[arg2][arg1] == null) {
			@Pc(58) boolean local58 = this.method1030(arg0, arg2);
			if (!local58) {
				this.method1020(arg2);
				local58 = this.method1030(arg0, arg2);
				if (!local58) {
					return null;
				}
			}
		}
		@Pc(84) byte[] local84 = Static12.method473(false, this.anObjectArrayArray2[arg2][arg1]);
		if (this.aBoolean62) {
			this.anObjectArrayArray2[arg2][arg1] = null;
		}
		return local84;
	}

	@OriginalMember(owner = "client!ah", name = "d", descriptor = "(II)V")
	public final void method1034(@OriginalArg(1) int arg0) {
		for (@Pc(8) int local8 = 0; local8 < this.anObjectArrayArray2[arg0].length; local8++) {
			this.anObjectArrayArray2[arg0][local8] = null;
		}
	}
}
