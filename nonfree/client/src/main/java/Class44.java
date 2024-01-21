import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public abstract class Class44 {

	@OriginalMember(owner = "client!tb", name = "f", descriptor = "[Ljava/lang/Object;")
	protected Object[] anObjectArray2;

	@OriginalMember(owner = "client!tb", name = "l", descriptor = "[I")
	protected int[] anIntArray128;

	@OriginalMember(owner = "client!tb", name = "o", descriptor = "I")
	private int anInt1669;

	@OriginalMember(owner = "client!tb", name = "q", descriptor = "[Lclient!ud;")
	private Class74[] aClass74Array2;

	@OriginalMember(owner = "client!tb", name = "s", descriptor = "[I")
	private int[] anIntArray129;

	@OriginalMember(owner = "client!tb", name = "u", descriptor = "[I")
	protected int[] anIntArray130;

	@OriginalMember(owner = "client!tb", name = "x", descriptor = "[[I")
	private int[][] anIntArrayArray13;

	@OriginalMember(owner = "client!tb", name = "C", descriptor = "[[I")
	private int[][] anIntArrayArray14;

	@OriginalMember(owner = "client!tb", name = "I", descriptor = "I")
	public int anInt1682;

	@OriginalMember(owner = "client!tb", name = "J", descriptor = "Lclient!ud;")
	private Class74 aClass74_2;

	@OriginalMember(owner = "client!tb", name = "R", descriptor = "[I")
	private int[] anIntArray131;

	@OriginalMember(owner = "client!tb", name = "Z", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray2;

	@OriginalMember(owner = "client!tb", name = "ab", descriptor = "[I")
	protected int[] anIntArray132;

	@OriginalMember(owner = "client!tb", name = "X", descriptor = "Z")
	private final boolean aBoolean77;

	@OriginalMember(owner = "client!tb", name = "O", descriptor = "Z")
	private final boolean aBoolean76;

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(ZZ)V")
	protected Class44(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean77 = arg1;
		this.aBoolean76 = arg0;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILclient!oa;Lclient!oa;)[B")
	public final byte[] method1131(@OriginalArg(1) Class56 arg0, @OriginalArg(2) Class56 arg1) {
		@Pc(12) Class56 local12 = arg0.method1422();
		@Pc(16) Class56 local16 = arg1.method1422();
		@Pc(26) int local26 = this.aClass74_2.method1907(local12.method1416());
		@Pc(38) int local38 = this.aClass74Array2[local26].method1907(local16.method1416());
		return this.method1146(local26, local38);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(BLclient!oa;)V")
	public final void method1132(@OriginalArg(1) Class56 arg0) {
		@Pc(11) Class56 local11 = arg0.method1422();
		@Pc(23) int local23 = this.aClass74_2.method1907(local11.method1416());
		if (local23 >= 0) {
			this.method1150(local23);
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "([III)Z")
	private boolean method1133(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		if (this.anObjectArray2[arg1] == null) {
			return false;
		}
		@Pc(17) int[] local17 = this.anIntArrayArray13[arg1];
		@Pc(22) int local22 = this.anIntArray132[arg1];
		@Pc(24) boolean local24 = true;
		@Pc(29) Object[] local29 = this.anObjectArrayArray2[arg1];
		for (@Pc(31) int local31 = 0; local31 < local22; local31++) {
			if (local29[local17[local31]] == null) {
				local24 = false;
				break;
			}
		}
		if (local24) {
			return true;
		}
		@Pc(92) byte[] local92;
		if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
			local92 = Static68.method1237(false, this.anObjectArray2[arg1]);
		} else {
			local92 = Static68.method1237(true, this.anObjectArray2[arg1]);
			@Pc(97) Class3_Sub2 local97 = new Class3_Sub2(local92);
			local97.method271(local97.aByteArray7.length, arg0);
		}
		@Pc(119) byte[] local119;
		try {
			local119 = Static46.method1522(local92);
		} catch (@Pc(121) RuntimeException local121) {
			throw Static71.method1309(local121, "T3 - " + (arg0 != null) + "," + arg1 + "," + local92.length + "," + Static4.method38(local92, local92.length) + "," + Static4.method38(local92, local92.length - 2) + "," + this.anIntArray128[arg1] + "," + this.anInt1682);
		}
		if (this.aBoolean76) {
			this.anObjectArray2[arg1] = null;
		}
		if (local22 > 1) {
			@Pc(190) int local190 = local119.length;
			@Pc(193) int local193 = local190 - 1;
			@Pc(197) int local197 = local119[local193] & 0xFF;
			@Pc(205) int local205 = local193 - local22 * 4 * local197;
			@Pc(210) Class3_Sub2 local210 = new Class3_Sub2(local119);
			local210.anInt413 = local205;
			@Pc(216) int[] local216 = new int[local22];
			@Pc(224) int local224;
			for (@Pc(218) int local218 = 0; local218 < local197; local218++) {
				@Pc(222) int local222 = 0;
				for (local224 = 0; local224 < local22; local224++) {
					local222 += local210.method278();
					local216[local224] += local222;
				}
			}
			@Pc(258) byte[][] local258 = new byte[local22][];
			for (local224 = 0; local224 < local22; local224++) {
				local258[local224] = new byte[local216[local224]];
				local216[local224] = 0;
			}
			@Pc(283) int local283 = 0;
			local210.anInt413 = local205;
			@Pc(292) int local292;
			for (@Pc(288) int local288 = 0; local288 < local197; local288++) {
				local292 = 0;
				for (@Pc(294) int local294 = 0; local294 < local22; local294++) {
					local292 += local210.method278();
					Static128.method140(local119, local283, local258[local294], local216[local294], local292);
					local216[local294] += local292;
					local283 += local292;
				}
			}
			for (local292 = 0; local292 < local22; local292++) {
				local29[local17[local292]] = Static47.method880(local258[local292]);
			}
		} else {
			local29[local17[0]] = Static47.method880(local119);
		}
		return true;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(II)Z")
	public final boolean method1134(@OriginalArg(1) int arg0) {
		if (this.anObjectArray2[arg0] == null) {
			this.method1159(arg0);
			return this.anObjectArray2[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!oa;IB)I")
	public final int method1136(@OriginalArg(0) Class56 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class56 local3 = arg0.method1422();
		return this.aClass74Array2[arg1].method1907(local3.method1416());
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(III)Z")
	public final boolean method1137(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 < 0 || this.anObjectArrayArray2.length <= arg0 || this.anObjectArrayArray2[arg0] == null || arg1 < 0 || arg1 >= this.anObjectArrayArray2[arg0].length) {
			return false;
		} else if (this.anObjectArrayArray2[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray2[arg0] == null) {
			this.method1159(arg0);
			return this.anObjectArray2[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(I[B)V")
	protected final void method1138(@OriginalArg(1) byte[] arg0) {
		this.anInt1682 = Static4.method38(arg0, arg0.length);
		@Pc(19) Class3_Sub2 local19 = new Class3_Sub2(Static46.method1522(arg0));
		@Pc(23) int local23 = local19.method270();
		if (local23 != 5) {
			return;
		}
		@Pc(29) int local29 = 0;
		@Pc(33) int local33 = local19.method270();
		this.anInt1669 = local19.method276();
		this.anIntArray131 = new int[this.anInt1669];
		@Pc(45) int local45 = -1;
		for (@Pc(47) int local47 = 0; local47 < this.anInt1669; local47++) {
			this.anIntArray131[local47] = local29 += local19.method276();
			if (local45 < this.anIntArray131[local47]) {
				local45 = this.anIntArray131[local47];
			}
		}
		this.anIntArray130 = new int[local45 + 1];
		this.anIntArray132 = new int[local45 + 1];
		this.anObjectArray2 = new Object[local45 + 1];
		this.anIntArray128 = new int[local45 + 1];
		this.anIntArrayArray13 = new int[local45 + 1][];
		this.anObjectArrayArray2 = new Object[local45 + 1][];
		@Pc(125) int local125;
		if (local33 != 0) {
			this.anIntArray129 = new int[local45 + 1];
			for (local125 = 0; local125 < this.anInt1669; local125++) {
				this.anIntArray129[this.anIntArray131[local125]] = local19.method278();
			}
			this.aClass74_2 = new Class74(this.anIntArray129);
		}
		for (local125 = 0; local125 < this.anInt1669; local125++) {
			this.anIntArray128[this.anIntArray131[local125]] = local19.method278();
		}
		for (@Pc(174) int local174 = 0; local174 < this.anInt1669; local174++) {
			this.anIntArray130[this.anIntArray131[local174]] = local19.method278();
		}
		for (@Pc(193) int local193 = 0; local193 < this.anInt1669; local193++) {
			this.anIntArray132[this.anIntArray131[local193]] = local19.method276();
		}
		@Pc(221) int local221;
		@Pc(226) int local226;
		@Pc(228) int local228;
		@Pc(236) int local236;
		for (@Pc(212) int local212 = 0; local212 < this.anInt1669; local212++) {
			local29 = 0;
			local221 = this.anIntArray131[local212];
			local226 = this.anIntArray132[local221];
			local228 = -1;
			this.anIntArrayArray13[local221] = new int[local226];
			for (local236 = 0; local236 < local226; local236++) {
				@Pc(255) int local255 = this.anIntArrayArray13[local221][local236] = local29 += local19.method276();
				if (local255 > local228) {
					local228 = local255;
				}
			}
			this.anObjectArrayArray2[local221] = new Object[local228 + 1];
		}
		if (local33 == 0) {
			return;
		}
		this.aClass74Array2 = new Class74[local45 + 1];
		this.anIntArrayArray14 = new int[local45 + 1][];
		for (local221 = 0; local221 < this.anInt1669; local221++) {
			local226 = this.anIntArray131[local221];
			local228 = this.anIntArray132[local226];
			this.anIntArrayArray14[local226] = new int[this.anObjectArrayArray2[local226].length];
			for (local236 = 0; local236 < local228; local236++) {
				this.anIntArrayArray14[local226][this.anIntArrayArray13[local226][local236]] = local19.method278();
			}
			this.aClass74Array2[local226] = new Class74(this.anIntArrayArray14[local226]);
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)V")
	public final void method1139() {
		for (@Pc(11) int local11 = 0; local11 < this.anObjectArrayArray2.length; local11++) {
			if (this.anObjectArrayArray2[local11] != null) {
				for (@Pc(20) int local20 = 0; local20 < this.anObjectArrayArray2[local11].length; local20++) {
					this.anObjectArrayArray2[local11][local20] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!oa;Lclient!oa;I)Z")
	public final boolean method1141(@OriginalArg(0) Class56 arg0, @OriginalArg(1) Class56 arg1) {
		@Pc(7) Class56 local7 = arg1.method1422();
		@Pc(11) Class56 local11 = arg0.method1422();
		@Pc(21) int local21 = this.aClass74_2.method1907(local7.method1416());
		@Pc(35) int local35 = this.aClass74Array2[local21].method1907(local11.method1416());
		return this.method1137(local21, local35);
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(B)I")
	public final int method1143() {
		return this.anObjectArrayArray2.length;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Z)Z")
	public final boolean method1145() {
		@Pc(3) boolean local3 = true;
		for (@Pc(9) int local9 = 0; local9 < this.anIntArray131.length; local9++) {
			@Pc(16) int local16 = this.anIntArray131[local9];
			if (this.anObjectArray2[local16] == null) {
				this.method1159(local16);
				if (this.anObjectArray2[local16] == null) {
					local3 = false;
				}
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(III)[B")
	public final byte[] method1146(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.method1153(arg1, arg0, null);
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(BII)[B")
	public final byte[] method1147(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 < 0 || this.anObjectArrayArray2.length <= arg0 || this.anObjectArrayArray2[arg0] == null || arg1 < 0 || arg1 >= this.anObjectArrayArray2[arg0].length) {
			return null;
		}
		if (this.anObjectArrayArray2[arg0][arg1] == null) {
			@Pc(48) boolean local48 = this.method1133(null, arg0);
			if (!local48) {
				this.method1159(arg0);
				local48 = this.method1133(null, arg0);
				if (!local48) {
					return null;
				}
			}
		}
		return Static68.method1237(false, this.anObjectArrayArray2[arg0][arg1]);
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(BLclient!oa;)I")
	public final int method1148(@OriginalArg(1) Class56 arg0) {
		@Pc(3) Class56 local3 = arg0.method1422();
		return this.aClass74_2.method1907(local3.method1416());
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(II)[I")
	public final int[] method1149(@OriginalArg(0) int arg0) {
		return this.anIntArrayArray13[arg0];
	}

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "(II)V")
	protected void method1150(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IB)I")
	public final int method1151(@OriginalArg(0) int arg0) {
		return this.anObjectArrayArray2[arg0].length;
	}

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "(II)[B")
	public final byte[] method1152(@OriginalArg(1) int arg0) {
		if (this.anObjectArrayArray2.length == 1) {
			return this.method1147(0, arg0);
		} else if (this.anObjectArrayArray2[arg0].length == 1) {
			return this.method1147(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(II[IB)[B")
	public final byte[] method1153(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		if (arg1 < 0 || arg1 >= this.anObjectArrayArray2.length || this.anObjectArrayArray2[arg1] == null || arg0 < 0 || arg0 >= this.anObjectArrayArray2[arg1].length) {
			return null;
		}
		if (this.anObjectArrayArray2[arg1][arg0] == null) {
			@Pc(46) boolean local46 = this.method1133(arg2, arg1);
			if (!local46) {
				this.method1159(arg1);
				local46 = this.method1133(arg2, arg1);
				if (!local46) {
					return null;
				}
			}
		}
		@Pc(83) byte[] local83 = Static68.method1237(false, this.anObjectArrayArray2[arg1][arg0]);
		if (this.aBoolean77) {
			this.anObjectArrayArray2[arg1][arg0] = null;
		}
		return local83;
	}

	@OriginalMember(owner = "client!tb", name = "e", descriptor = "(II)V")
	public final void method1154(@OriginalArg(0) int arg0) {
		for (@Pc(12) int local12 = 0; local12 < this.anObjectArrayArray2[arg0].length; local12++) {
			this.anObjectArrayArray2[arg0][local12] = null;
		}
	}

	@OriginalMember(owner = "client!tb", name = "f", descriptor = "(II)[B")
	public final byte[] method1155(@OriginalArg(1) int arg0) {
		if (this.anObjectArrayArray2.length == 1) {
			return this.method1146(0, arg0);
		} else if (this.anObjectArrayArray2[arg0].length == 1) {
			return this.method1146(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(IB)V")
	protected void method1159(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!tb", name = "g", descriptor = "(II)Z")
	public final boolean method1160(@OriginalArg(1) int arg0) {
		if (this.anObjectArrayArray2.length == 1) {
			return this.method1137(0, arg0);
		} else if (this.anObjectArrayArray2[arg0].length == 1) {
			return this.method1137(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}
}
