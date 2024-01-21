import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!k")
public abstract class Class33 {

	@OriginalMember(owner = "client!k", name = "b", descriptor = "[Lclient!ca;")
	private Class10[] aClass10Array2;

	@OriginalMember(owner = "client!k", name = "e", descriptor = "[[I")
	private int[][] anIntArrayArray16;

	@OriginalMember(owner = "client!k", name = "g", descriptor = "[I")
	protected int[] anIntArray259;

	@OriginalMember(owner = "client!k", name = "j", descriptor = "[[I")
	private int[][] anIntArrayArray17;

	@OriginalMember(owner = "client!k", name = "q", descriptor = "[I")
	private int[] anIntArray260;

	@OriginalMember(owner = "client!k", name = "v", descriptor = "[I")
	protected int[] anIntArray261;

	@OriginalMember(owner = "client!k", name = "x", descriptor = "I")
	public int anInt1930;

	@OriginalMember(owner = "client!k", name = "B", descriptor = "I")
	private int anInt1933;

	@OriginalMember(owner = "client!k", name = "L", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!k", name = "S", descriptor = "[I")
	protected int[] anIntArray263;

	@OriginalMember(owner = "client!k", name = "T", descriptor = "[I")
	private int[] anIntArray264;

	@OriginalMember(owner = "client!k", name = "U", descriptor = "Lclient!ca;")
	private Class10 aClass10_2;

	@OriginalMember(owner = "client!k", name = "V", descriptor = "[[B")
	protected byte[][] aByteArrayArray7;

	@OriginalMember(owner = "client!k", name = "A", descriptor = "Z")
	private final boolean aBoolean101;

	@OriginalMember(owner = "client!k", name = "k", descriptor = "Z")
	private final boolean aBoolean100;

	@OriginalMember(owner = "client!k", name = "<init>", descriptor = "(ZZ)V")
	protected Class33(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean101 = arg1;
		this.aBoolean100 = arg0;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(II)[I")
	public final int[] method1131(@OriginalArg(1) int arg0) {
		return this.anIntArrayArray16[arg0];
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "([III)Z")
	private boolean method1132(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aByteArrayArray7[arg1] == null) {
			return false;
		}
		@Pc(17) int local17 = this.anIntArray261[arg1];
		@Pc(22) int[] local22 = this.anIntArrayArray16[arg1];
		@Pc(24) boolean local24 = true;
		@Pc(29) byte[][] local29 = this.aByteArrayArrayArray8[arg1];
		for (@Pc(39) int local39 = 0; local39 < local17; local39++) {
			if (local29[local22[local39]] == null) {
				local24 = false;
				break;
			}
		}
		if (local24) {
			return true;
		}
		@Pc(97) byte[] local97;
		if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
			local97 = this.aByteArrayArray7[arg1];
		} else {
			local97 = new byte[this.aByteArrayArray7[arg1].length];
			Static118.method1745(this.aByteArrayArray7[arg1], 0, local97, 0, local97.length);
			@Pc(112) Class2_Sub8 local112 = new Class2_Sub8(local97);
			local112.method1418(local112.aByteArray59.length, arg0);
		}
		@Pc(131) byte[] local131;
		try {
			local131 = Static83.method1432(local97);
		} catch (@Pc(133) RuntimeException local133) {
			throw Static75.method1296(local133, "T3 - " + (arg0 != null) + "," + arg1 + "," + local97.length + "," + Static110.method1843(local97.length, local97) + "," + Static110.method1843(local97.length - 2, local97) + "," + this.anIntArray263[arg1] + "," + this.anInt1930);
		}
		if (this.aBoolean100) {
			this.aByteArrayArray7[arg1] = null;
		}
		if (local17 <= 1) {
			local29[local22[0]] = local131;
		} else {
			@Pc(210) int local210 = local131.length;
			@Pc(213) int[] local213 = new int[local17];
			@Pc(216) int local216 = local210 - 1;
			@Pc(220) int local220 = local131[local216] & 0xFF;
			@Pc(225) Class2_Sub8 local225 = new Class2_Sub8(local131);
			@Pc(233) int local233 = local216 - local17 * local220 * 4;
			local225.anInt2342 = local233;
			@Pc(242) int local242;
			@Pc(244) int local244;
			for (@Pc(238) int local238 = 0; local238 < local220; local238++) {
				local242 = 0;
				for (local244 = 0; local244 < local17; local244++) {
					local242 += local225.method1406();
					local213[local244] += local242;
				}
			}
			for (local242 = 0; local242 < local17; local242++) {
				if (local29[local22[local242]] == null) {
					local29[local22[local242]] = new byte[local213[local242]];
				}
				local213[local242] = 0;
			}
			local244 = 0;
			local225.anInt2342 = local233;
			for (@Pc(301) int local301 = 0; local301 < local220; local301++) {
				@Pc(305) int local305 = 0;
				for (@Pc(307) int local307 = 0; local307 < local17; local307++) {
					local305 += local225.method1406();
					Static118.method1745(local131, local244, local29[local22[local307]], local213[local307], local305);
					local244 += local305;
					local213[local307] += local305;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!k", name = "b", descriptor = "(II)V")
	protected void method1133(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(I[III)[B")
	public final byte[] method1134(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		if (arg0 < 0 || this.aByteArrayArrayArray8.length <= arg0 || this.aByteArrayArrayArray8[arg0] == null || arg2 < 0 || arg2 >= this.aByteArrayArrayArray8[arg0].length) {
			return null;
		}
		if (this.aByteArrayArrayArray8[arg0][arg2] == null) {
			@Pc(39) boolean local39 = this.method1132(arg1, arg0);
			if (!local39) {
				this.method1151(arg0);
				local39 = this.method1132(arg1, arg0);
				if (!local39) {
					return null;
				}
			}
		}
		@Pc(62) byte[] local62 = this.aByteArrayArrayArray8[arg0][arg2];
		if (this.aBoolean101) {
			this.aByteArrayArrayArray8[arg0][arg2] = null;
		}
		return local62;
	}

	@OriginalMember(owner = "client!k", name = "b", descriptor = "(I)I")
	public final int method1135() {
		return this.aByteArrayArrayArray8.length;
	}

	@OriginalMember(owner = "client!k", name = "c", descriptor = "(II)[B")
	public final byte[] method1136(@OriginalArg(0) int arg0) {
		if (this.aByteArrayArrayArray8.length == 1) {
			return this.method1150(arg0, 0);
		} else if (this.aByteArrayArrayArray8[arg0].length == 1) {
			return this.method1150(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!k", name = "c", descriptor = "(I)V")
	public final void method1137() {
		for (@Pc(3) int local3 = 0; local3 < this.aByteArrayArrayArray8.length; local3++) {
			if (this.aByteArrayArrayArray8[local3] != null) {
				for (@Pc(12) int local12 = 0; local12 < this.aByteArrayArrayArray8[local3].length; local12++) {
					this.aByteArrayArrayArray8[local3][local12] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Lclient!wb;Lclient!wb;I)[B")
	public final byte[] method1138(@OriginalArg(0) Class65 arg0, @OriginalArg(1) Class65 arg1) {
		@Pc(3) Class65 local3 = arg0.method1776();
		@Pc(20) Class65 local20 = arg1.method1776();
		@Pc(28) int local28 = this.aClass10_2.method264(local3.method1759());
		@Pc(38) int local38 = this.aClass10Array2[local28].method264(local20.method1759());
		return this.method1150(local38, local28);
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(BI)[B")
	public final byte[] method1139(@OriginalArg(1) int arg0) {
		if (this.aByteArrayArrayArray8.length == 1) {
			return this.method1154(arg0, 0);
		} else if (this.aByteArrayArrayArray8[arg0].length == 1) {
			return this.method1154(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(III)Z")
	public final boolean method1140(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 < 0 || arg1 >= this.aByteArrayArrayArray8.length || this.aByteArrayArrayArray8[arg1] == null || arg0 < 0 || this.aByteArrayArrayArray8[arg1].length <= arg0) {
			return false;
		} else if (this.aByteArrayArrayArray8[arg1][arg0] != null) {
			return true;
		} else if (this.aByteArrayArray7[arg1] == null) {
			this.method1151(arg1);
			return this.aByteArrayArray7[arg1] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!k", name = "d", descriptor = "(II)Z")
	public final boolean method1141(@OriginalArg(1) int arg0) {
		if (this.aByteArrayArray7[arg0] == null) {
			this.method1151(arg0);
			return this.aByteArrayArray7[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(ILclient!wb;)V")
	public final void method1142(@OriginalArg(1) Class65 arg0) {
		@Pc(3) Class65 local3 = arg0.method1776();
		@Pc(11) int local11 = this.aClass10_2.method264(local3.method1759());
		if (local11 >= 0) {
			this.method1133(local11);
		}
	}

	@OriginalMember(owner = "client!k", name = "e", descriptor = "(II)V")
	public final void method1143(@OriginalArg(0) int arg0) {
		for (@Pc(3) int local3 = 0; local3 < this.aByteArrayArrayArray8[arg0].length; local3++) {
			this.aByteArrayArrayArray8[arg0][local3] = null;
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Lclient!wb;ZI)I")
	public final int method1144(@OriginalArg(0) Class65 arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class65 local14 = arg0.method1776();
		return this.aClass10Array2[arg1].method264(local14.method1759());
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Z)Z")
	public final boolean method1146() {
		@Pc(3) boolean local3 = true;
		for (@Pc(9) int local9 = 0; local9 < this.anIntArray264.length; local9++) {
			@Pc(16) int local16 = this.anIntArray264[local9];
			if (this.aByteArrayArray7[local16] == null) {
				this.method1151(local16);
				if (this.aByteArrayArray7[local16] == null) {
					local3 = false;
				}
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(I[B)V")
	protected final void method1147(@OriginalArg(1) byte[] arg0) {
		this.anInt1930 = Static110.method1843(arg0.length, arg0);
		@Pc(19) Class2_Sub8 local19 = new Class2_Sub8(Static83.method1432(arg0));
		@Pc(23) int local23 = local19.method1410();
		if (local23 != 5) {
			return;
		}
		@Pc(33) int local33 = local19.method1410();
		@Pc(35) int local35 = 0;
		this.anInt1933 = local19.method1396();
		this.anIntArray264 = new int[this.anInt1933];
		@Pc(47) int local47 = -1;
		for (@Pc(49) int local49 = 0; local49 < this.anInt1933; local49++) {
			this.anIntArray264[local49] = local35 += local19.method1396();
			if (local47 < this.anIntArray264[local49]) {
				local47 = this.anIntArray264[local49];
			}
		}
		this.anIntArrayArray16 = new int[local47 + 1][];
		this.anIntArray263 = new int[local47 + 1];
		this.anIntArray259 = new int[local47 + 1];
		this.aByteArrayArray7 = new byte[local47 + 1][];
		this.aByteArrayArrayArray8 = new byte[local47 + 1][][];
		this.anIntArray261 = new int[local47 + 1];
		@Pc(136) int local136;
		if (local33 != 0) {
			this.anIntArray260 = new int[local47 + 1];
			for (local136 = 0; local136 < this.anInt1933; local136++) {
				this.anIntArray260[this.anIntArray264[local136]] = local19.method1406();
			}
			this.aClass10_2 = new Class10(this.anIntArray260);
		}
		for (local136 = 0; local136 < this.anInt1933; local136++) {
			this.anIntArray263[this.anIntArray264[local136]] = local19.method1406();
		}
		for (@Pc(185) int local185 = 0; local185 < this.anInt1933; local185++) {
			this.anIntArray259[this.anIntArray264[local185]] = local19.method1406();
		}
		for (@Pc(208) int local208 = 0; local208 < this.anInt1933; local208++) {
			this.anIntArray261[this.anIntArray264[local208]] = local19.method1396();
		}
		@Pc(234) int local234;
		@Pc(241) int local241;
		@Pc(243) int local243;
		@Pc(251) int local251;
		for (@Pc(227) int local227 = 0; local227 < this.anInt1933; local227++) {
			local234 = this.anIntArray264[local227];
			local35 = 0;
			local241 = this.anIntArray261[local234];
			local243 = -1;
			this.anIntArrayArray16[local234] = new int[local241];
			for (local251 = 0; local251 < local241; local251++) {
				@Pc(268) int local268 = this.anIntArrayArray16[local234][local251] = local35 += local19.method1396();
				if (local268 > local243) {
					local243 = local268;
				}
			}
			this.aByteArrayArrayArray8[local234] = new byte[local243 + 1][];
		}
		if (local33 == 0) {
			return;
		}
		this.aClass10Array2 = new Class10[local47 + 1];
		this.anIntArrayArray17 = new int[local47 + 1][];
		for (local234 = 0; local234 < this.anInt1933; local234++) {
			local241 = this.anIntArray264[local234];
			local243 = this.anIntArray261[local241];
			this.anIntArrayArray17[local241] = new int[this.aByteArrayArrayArray8[local241].length];
			for (local251 = 0; local251 < local243; local251++) {
				this.anIntArrayArray17[local241][this.anIntArrayArray16[local241][local251]] = local19.method1406();
			}
			this.aClass10Array2[local241] = new Class10(this.anIntArrayArray17[local241]);
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Lclient!wb;I)I")
	public final int method1149(@OriginalArg(0) Class65 arg0) {
		@Pc(3) Class65 local3 = arg0.method1776();
		return this.aClass10_2.method264(local3.method1759());
	}

	@OriginalMember(owner = "client!k", name = "b", descriptor = "(III)[B")
	public final byte[] method1150(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.method1134(arg1, null, arg0);
	}

	@OriginalMember(owner = "client!k", name = "f", descriptor = "(II)V")
	protected void method1151(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Lclient!wb;ILclient!wb;)Z")
	public final boolean method1152(@OriginalArg(0) Class65 arg0, @OriginalArg(2) Class65 arg1) {
		@Pc(12) Class65 local12 = arg1.method1776();
		@Pc(18) Class65 local18 = arg0.method1776();
		@Pc(26) int local26 = this.aClass10_2.method264(local12.method1759());
		@Pc(36) int local36 = this.aClass10Array2[local26].method264(local18.method1759());
		return this.method1140(local36, local26);
	}

	@OriginalMember(owner = "client!k", name = "g", descriptor = "(II)I")
	public final int method1153(@OriginalArg(1) int arg0) {
		return this.aByteArrayArrayArray8[arg0].length;
	}

	@OriginalMember(owner = "client!k", name = "c", descriptor = "(III)[B")
	public final byte[] method1154(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 < 0 || arg1 >= this.aByteArrayArrayArray8.length || this.aByteArrayArrayArray8[arg1] == null || arg0 < 0 || this.aByteArrayArrayArray8[arg1].length <= arg0) {
			return null;
		}
		if (this.aByteArrayArrayArray8[arg1][arg0] == null) {
			@Pc(48) boolean local48 = this.method1132(null, arg1);
			if (!local48) {
				this.method1151(arg1);
				local48 = this.method1132(null, arg1);
				if (!local48) {
					return null;
				}
			}
		}
		return this.aByteArrayArrayArray8[arg1][arg0];
	}
}
