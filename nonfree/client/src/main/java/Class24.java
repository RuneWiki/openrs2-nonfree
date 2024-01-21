import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public abstract class Class24 {

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "[[I")
	private int[][] anIntArrayArray10;

	@OriginalMember(owner = "client!nb", name = "j", descriptor = "[Lclient!kd;")
	private Class42[] aClass42Array2;

	@OriginalMember(owner = "client!nb", name = "q", descriptor = "Lclient!kd;")
	private Class42 aClass42_2;

	@OriginalMember(owner = "client!nb", name = "s", descriptor = "[I")
	protected int[] anIntArray111;

	@OriginalMember(owner = "client!nb", name = "y", descriptor = "I")
	private int anInt903;

	@OriginalMember(owner = "client!nb", name = "D", descriptor = "[I")
	protected int[] anIntArray112;

	@OriginalMember(owner = "client!nb", name = "E", descriptor = "[I")
	private int[] anIntArray113;

	@OriginalMember(owner = "client!nb", name = "H", descriptor = "[I")
	protected int[] anIntArray114;

	@OriginalMember(owner = "client!nb", name = "Q", descriptor = "I")
	public int anInt917;

	@OriginalMember(owner = "client!nb", name = "R", descriptor = "[Ljava/lang/Object;")
	protected Object[] anObjectArray2;

	@OriginalMember(owner = "client!nb", name = "T", descriptor = "[[I")
	private int[][] anIntArrayArray11;

	@OriginalMember(owner = "client!nb", name = "V", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray2;

	@OriginalMember(owner = "client!nb", name = "Y", descriptor = "[I")
	private int[] anIntArray115;

	@OriginalMember(owner = "client!nb", name = "ab", descriptor = "Z")
	private final boolean aBoolean37;

	@OriginalMember(owner = "client!nb", name = "d", descriptor = "Z")
	private final boolean aBoolean36;

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(ZZ)V")
	protected Class24(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean37 = arg0;
		this.aBoolean36 = arg1;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILclient!vc;)I")
	public final int method650(@OriginalArg(1) Class71 arg0) {
		@Pc(3) Class71 local3 = arg0.method1792();
		return this.aClass42_2.method1046(local3.method1782());
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!vc;I)V")
	public final void method651(@OriginalArg(0) Class71 arg0) {
		@Pc(15) Class71 local15 = arg0.method1792();
		@Pc(23) int local23 = this.aClass42_2.method1046(local15.method1782());
		if (local23 >= 0) {
			this.method661(local23);
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)V")
	public final void method652() {
		for (@Pc(3) int local3 = 0; local3 < this.anObjectArrayArray2.length; local3++) {
			if (this.anObjectArrayArray2[local3] != null) {
				for (@Pc(12) int local12 = 0; local12 < this.anObjectArrayArray2[local3].length; local12++) {
					this.anObjectArrayArray2[local3][local12] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(III)[B")
	public final byte[] method653(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 < 0 || this.anObjectArrayArray2.length <= arg0 || this.anObjectArrayArray2[arg0] == null || arg1 < 0 || this.anObjectArrayArray2[arg0].length <= arg1) {
			return null;
		}
		if (this.anObjectArrayArray2[arg0][arg1] == null) {
			@Pc(50) boolean local50 = this.method678(arg0, null);
			if (!local50) {
				this.method672(arg0);
				local50 = this.method678(arg0, null);
				if (!local50) {
					return null;
				}
			}
		}
		return Static116.method1898(false, this.anObjectArrayArray2[arg0][arg1]);
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IBI)Z")
	public final boolean method656(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 < 0 || this.anObjectArrayArray2.length <= arg0 || this.anObjectArrayArray2[arg0] == null || arg1 < 0 || arg1 >= this.anObjectArrayArray2[arg0].length) {
			return false;
		} else if (this.anObjectArrayArray2[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray2[arg0] == null) {
			this.method672(arg0);
			return this.anObjectArray2[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(BI)[B")
	public final byte[] method658(@OriginalArg(1) int arg0) {
		if (this.anObjectArrayArray2.length == 1) {
			return this.method653(0, arg0);
		} else if (this.anObjectArrayArray2[arg0].length == 1) {
			return this.method653(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "([IIII)[B")
	public final byte[] method659(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 < 0 || arg2 >= this.anObjectArrayArray2.length || this.anObjectArrayArray2[arg2] == null || arg1 < 0 || this.anObjectArrayArray2[arg2].length <= arg1) {
			return null;
		}
		if (this.anObjectArrayArray2[arg2][arg1] == null) {
			@Pc(46) boolean local46 = this.method678(arg2, arg0);
			if (!local46) {
				this.method672(arg2);
				local46 = this.method678(arg2, arg0);
				if (!local46) {
					return null;
				}
			}
		}
		@Pc(72) byte[] local72 = Static116.method1898(false, this.anObjectArrayArray2[arg2][arg1]);
		if (this.aBoolean36) {
			this.anObjectArrayArray2[arg2][arg1] = null;
		}
		return local72;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IZ)I")
	public final int method660(@OriginalArg(0) int arg0) {
		return this.anObjectArrayArray2[arg0].length;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IB)V")
	protected void method661(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILclient!vc;I)I")
	public final int method664(@OriginalArg(1) Class71 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class71 local7 = arg0.method1792();
		return this.aClass42Array2[arg1].method1046(local7.method1782());
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(IB)Z")
	public final boolean method666(@OriginalArg(0) int arg0) {
		if (this.anObjectArray2[arg0] == null) {
			this.method672(arg0);
			return this.anObjectArray2[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)[B")
	public final byte[] method668(@OriginalArg(1) int arg0) {
		if (this.anObjectArrayArray2.length == 1) {
			return this.method679(0, arg0);
		} else if (this.anObjectArrayArray2[arg0].length == 1) {
			return this.method679(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(II)[I")
	public final int[] method669(@OriginalArg(0) int arg0) {
		return this.anIntArrayArray11[arg0];
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILclient!vc;Lclient!vc;)Z")
	public final boolean method670(@OriginalArg(1) Class71 arg0, @OriginalArg(2) Class71 arg1) {
		@Pc(15) Class71 local15 = arg0.method1792();
		@Pc(19) Class71 local19 = arg1.method1792();
		@Pc(27) int local27 = this.aClass42_2.method1046(local15.method1782());
		@Pc(37) int local37 = this.aClass42Array2[local27].method1046(local19.method1782());
		return this.method656(local27, local37);
	}

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "(I)I")
	public final int method671() {
		return this.anObjectArrayArray2.length;
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(IZ)V")
	protected void method672(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Z)Z")
	public final boolean method673() {
		@Pc(7) boolean local7 = true;
		for (@Pc(9) int local9 = 0; local9 < this.anIntArray115.length; local9++) {
			@Pc(16) int local16 = this.anIntArray115[local9];
			if (this.anObjectArray2[local16] == null) {
				this.method672(local16);
				if (this.anObjectArray2[local16] == null) {
					local7 = false;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "([BI)V")
	protected final void method674(@OriginalArg(0) byte[] arg0) {
		this.anInt917 = Static72.method1206(arg0, arg0.length);
		@Pc(19) Class5_Sub11 local19 = new Class5_Sub11(Static7.method189(arg0));
		@Pc(23) int local23 = local19.method1546();
		if (local23 != 5) {
			return;
		}
		@Pc(31) int local31 = local19.method1546();
		this.anInt903 = local19.method1543();
		this.anIntArray115 = new int[this.anInt903];
		@Pc(45) int local45 = 0;
		@Pc(47) int local47 = -1;
		for (@Pc(49) int local49 = 0; local49 < this.anInt903; local49++) {
			this.anIntArray115[local49] = local45 += local19.method1543();
			if (local47 < this.anIntArray115[local49]) {
				local47 = this.anIntArray115[local49];
			}
		}
		this.anIntArrayArray11 = new int[local47 + 1][];
		this.anIntArray114 = new int[local47 + 1];
		this.anObjectArray2 = new Object[local47 + 1];
		this.anObjectArrayArray2 = new Object[local47 + 1][];
		this.anIntArray111 = new int[local47 + 1];
		this.anIntArray112 = new int[local47 + 1];
		@Pc(124) int local124;
		if (local31 != 0) {
			this.anIntArray113 = new int[local47 + 1];
			for (local124 = 0; local124 < this.anInt903; local124++) {
				this.anIntArray113[this.anIntArray115[local124]] = local19.method1540();
			}
			this.aClass42_2 = new Class42(this.anIntArray113);
		}
		for (local124 = 0; local124 < this.anInt903; local124++) {
			this.anIntArray114[this.anIntArray115[local124]] = local19.method1540();
		}
		for (@Pc(179) int local179 = 0; local179 < this.anInt903; local179++) {
			this.anIntArray111[this.anIntArray115[local179]] = local19.method1540();
		}
		for (@Pc(202) int local202 = 0; local202 < this.anInt903; local202++) {
			this.anIntArray112[this.anIntArray115[local202]] = local19.method1543();
		}
		@Pc(234) int local234;
		@Pc(241) int local241;
		@Pc(236) int local236;
		@Pc(249) int local249;
		for (@Pc(225) int local225 = 0; local225 < this.anInt903; local225++) {
			local45 = 0;
			local234 = this.anIntArray115[local225];
			local236 = -1;
			local241 = this.anIntArray112[local234];
			this.anIntArrayArray11[local234] = new int[local241];
			for (local249 = 0; local249 < local241; local249++) {
				@Pc(266) int local266 = this.anIntArrayArray11[local234][local249] = local45 += local19.method1543();
				if (local266 > local236) {
					local236 = local266;
				}
			}
			this.anObjectArrayArray2[local234] = new Object[local236 + 1];
		}
		if (local31 == 0) {
			return;
		}
		this.anIntArrayArray10 = new int[local47 + 1][];
		this.aClass42Array2 = new Class42[local47 + 1];
		for (local234 = 0; local234 < this.anInt903; local234++) {
			local241 = this.anIntArray115[local234];
			local236 = this.anIntArray112[local241];
			this.anIntArrayArray10[local241] = new int[this.anObjectArrayArray2[local241].length];
			for (local249 = 0; local249 < local236; local249++) {
				this.anIntArrayArray10[local241][this.anIntArrayArray11[local241][local249]] = local19.method1540();
			}
			this.aClass42Array2[local241] = new Class42(this.anIntArrayArray10[local241]);
		}
	}

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "(II)V")
	public final void method675(@OriginalArg(0) int arg0) {
		for (@Pc(7) int local7 = 0; local7 < this.anObjectArrayArray2[arg0].length; local7++) {
			this.anObjectArrayArray2[arg0][local7] = null;
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(II[I)Z")
	private boolean method678(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.anObjectArray2[arg0] == null) {
			return false;
		}
		@Pc(17) int local17 = this.anIntArray112[arg0];
		@Pc(22) int[] local22 = this.anIntArrayArray11[arg0];
		@Pc(27) Object[] local27 = this.anObjectArrayArray2[arg0];
		@Pc(38) boolean local38 = true;
		for (@Pc(40) int local40 = 0; local40 < local17; local40++) {
			if (local27[local22[local40]] == null) {
				local38 = false;
				break;
			}
		}
		if (local38) {
			return true;
		}
		@Pc(94) byte[] local94;
		if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
			local94 = Static116.method1898(false, this.anObjectArray2[arg0]);
		} else {
			local94 = Static116.method1898(true, this.anObjectArray2[arg0]);
			@Pc(99) Class5_Sub11 local99 = new Class5_Sub11(local94);
			local99.method1507(local99.aByteArray23.length, arg1);
		}
		@Pc(121) byte[] local121;
		try {
			local121 = Static7.method189(local94);
		} catch (@Pc(123) RuntimeException local123) {
			throw Static102.method1645(local123, "T3 - " + (arg1 != null) + "," + arg0 + "," + local94.length + "," + Static72.method1206(local94, local94.length) + "," + Static72.method1206(local94, local94.length - 2) + "," + this.anIntArray114[arg0] + "," + this.anInt917);
		}
		if (this.aBoolean37) {
			this.anObjectArray2[arg0] = null;
		}
		if (local17 <= 1) {
			local27[local22[0]] = Static115.method1807(local121);
		} else {
			@Pc(203) int local203 = local121.length;
			@Pc(205) int local205 = local203 - 1;
			@Pc(210) int local210 = local121[local205] & 0xFF;
			@Pc(218) int local218 = local205 - local17 * local210 * 4;
			@Pc(223) Class5_Sub11 local223 = new Class5_Sub11(local121);
			local223.anInt2233 = local218;
			@Pc(229) int[] local229 = new int[local17];
			@Pc(237) int local237;
			for (@Pc(231) int local231 = 0; local231 < local210; local231++) {
				@Pc(235) int local235 = 0;
				for (local237 = 0; local237 < local17; local237++) {
					local235 += local223.method1540();
					local229[local237] += local235;
				}
			}
			@Pc(271) byte[][] local271 = new byte[local17][];
			for (local237 = 0; local237 < local17; local237++) {
				local271[local237] = new byte[local229[local237]];
				local229[local237] = 0;
			}
			local223.anInt2233 = local218;
			@Pc(299) int local299 = 0;
			@Pc(305) int local305;
			for (@Pc(301) int local301 = 0; local301 < local210; local301++) {
				local305 = 0;
				for (@Pc(307) int local307 = 0; local307 < local17; local307++) {
					local305 += local223.method1540();
					Static127.method1745(local121, local299, local271[local307], local229[local307], local305);
					local299 += local305;
					local229[local307] += local305;
				}
			}
			for (local305 = 0; local305 < local17; local305++) {
				local27[local22[local305]] = Static115.method1807(local271[local305]);
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(III)[B")
	public final byte[] method679(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.method659(null, arg1, arg0);
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!vc;Lclient!vc;I)[B")
	public final byte[] method680(@OriginalArg(0) Class71 arg0, @OriginalArg(1) Class71 arg1) {
		@Pc(3) Class71 local3 = arg1.method1792();
		@Pc(16) Class71 local16 = arg0.method1792();
		@Pc(26) int local26 = this.aClass42_2.method1046(local3.method1782());
		@Pc(36) int local36 = this.aClass42Array2[local26].method1046(local16.method1782());
		return this.method679(local26, local36);
	}
}
