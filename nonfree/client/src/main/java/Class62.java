import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!we")
public abstract class Class62 {

	@OriginalMember(owner = "client!we", name = "c", descriptor = "[[I")
	private int[][] anIntArrayArray20;

	@OriginalMember(owner = "client!we", name = "g", descriptor = "[I")
	protected int[] anIntArray283;

	@OriginalMember(owner = "client!we", name = "t", descriptor = "[I")
	private int[] anIntArray284;

	@OriginalMember(owner = "client!we", name = "w", descriptor = "[I")
	protected int[] anIntArray285;

	@OriginalMember(owner = "client!we", name = "y", descriptor = "[Lclient!kc;")
	private Class42[] aClass42Array2;

	@OriginalMember(owner = "client!we", name = "D", descriptor = "[I")
	private int[] anIntArray286;

	@OriginalMember(owner = "client!we", name = "F", descriptor = "I")
	private int anInt2176;

	@OriginalMember(owner = "client!we", name = "I", descriptor = "Lclient!kc;")
	private Class42 aClass42_2;

	@OriginalMember(owner = "client!we", name = "J", descriptor = "[Ljava/lang/Object;")
	protected Object[] anObjectArray2;

	@OriginalMember(owner = "client!we", name = "L", descriptor = "[[I")
	private int[][] anIntArrayArray21;

	@OriginalMember(owner = "client!we", name = "M", descriptor = "I")
	public int anInt2180;

	@OriginalMember(owner = "client!we", name = "O", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray2;

	@OriginalMember(owner = "client!we", name = "cb", descriptor = "[I")
	protected int[] anIntArray287;

	@OriginalMember(owner = "client!we", name = "bb", descriptor = "Z")
	private final boolean aBoolean87;

	@OriginalMember(owner = "client!we", name = "x", descriptor = "Z")
	private final boolean aBoolean86;

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "(ZZ)V")
	protected Class62(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean87 = arg1;
		this.aBoolean86 = arg0;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(III)[B")
	public final byte[] method1496(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 < 0 || this.anObjectArrayArray2.length <= arg1 || this.anObjectArrayArray2[arg1] == null || arg0 < 0 || arg0 >= this.anObjectArrayArray2[arg1].length) {
			return null;
		}
		if (this.anObjectArrayArray2[arg1][arg0] == null) {
			@Pc(50) boolean local50 = this.method1497(arg1, null);
			if (!local50) {
				this.method1503(arg1);
				local50 = this.method1497(arg1, null);
				if (!local50) {
					return null;
				}
			}
		}
		return Static51.method941(this.anObjectArrayArray2[arg1][arg0], false);
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(I[II)Z")
	private boolean method1497(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		if (this.anObjectArray2[arg0] == null) {
			return false;
		}
		@Pc(17) int local17 = this.anIntArray285[arg0];
		@Pc(22) int[] local22 = this.anIntArrayArray21[arg0];
		@Pc(27) Object[] local27 = this.anObjectArrayArray2[arg0];
		@Pc(29) boolean local29 = true;
		for (@Pc(31) int local31 = 0; local31 < local17; local31++) {
			if (local27[local22[local31]] == null) {
				local29 = false;
				break;
			}
		}
		if (local29) {
			return true;
		}
		@Pc(94) byte[] local94;
		if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
			local94 = Static51.method941(this.anObjectArray2[arg0], false);
		} else {
			local94 = Static51.method941(this.anObjectArray2[arg0], true);
			@Pc(109) Class3_Sub7 local109 = new Class3_Sub7(local94);
			local109.method634(arg1, local109.aByteArray15.length);
		}
		@Pc(121) byte[] local121;
		try {
			local121 = Static57.method1049(local94);
		} catch (@Pc(123) RuntimeException local123) {
			throw Static56.method1041(local123, "T3 - " + (arg1 != null) + "," + arg0 + "," + local94.length + "," + Static8.method133(local94, local94.length) + "," + Static8.method133(local94, local94.length - 2) + "," + this.anIntArray287[arg0] + "," + this.anInt2180);
		}
		if (this.aBoolean86) {
			this.anObjectArray2[arg0] = null;
		}
		if (local17 <= 1) {
			local27[local22[0]] = Static75.method1251(local121);
		} else {
			@Pc(201) int local201 = local121.length;
			@Pc(204) int local204 = local201 - 1;
			@Pc(208) int local208 = local121[local204] & 0xFF;
			@Pc(213) Class3_Sub7 local213 = new Class3_Sub7(local121);
			@Pc(216) int[] local216 = new int[local17];
			@Pc(224) int local224 = local204 - local208 * local17 * 4;
			local213.anInt964 = local224;
			@Pc(235) int local235;
			for (@Pc(229) int local229 = 0; local229 < local208; local229++) {
				@Pc(233) int local233 = 0;
				for (local235 = 0; local235 < local17; local235++) {
					local233 += local213.method638();
					local216[local235] += local233;
				}
			}
			@Pc(265) byte[][] local265 = new byte[local17][];
			for (local235 = 0; local235 < local17; local235++) {
				local265[local235] = new byte[local216[local235]];
				local216[local235] = 0;
			}
			local213.anInt964 = local224;
			@Pc(293) int local293 = 0;
			@Pc(299) int local299;
			for (@Pc(295) int local295 = 0; local295 < local208; local295++) {
				local299 = 0;
				for (@Pc(301) int local301 = 0; local301 < local17; local301++) {
					local299 += local213.method638();
					Static127.method202(local121, local293, local265[local301], local216[local301], local299);
					local293 += local299;
					local216[local301] += local299;
				}
			}
			for (local299 = 0; local299 < local17; local299++) {
				local27[local22[local299]] = Static75.method1251(local265[local299]);
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(II[II)[B")
	public final byte[] method1498(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		if (arg0 < 0 || arg0 >= this.anObjectArrayArray2.length || this.anObjectArrayArray2[arg0] == null || arg2 < 0 || arg2 >= this.anObjectArrayArray2[arg0].length) {
			return null;
		}
		if (this.anObjectArrayArray2[arg0][arg2] == null) {
			@Pc(50) boolean local50 = this.method1497(arg0, arg1);
			if (!local50) {
				this.method1503(arg0);
				local50 = this.method1497(arg0, arg1);
				if (!local50) {
					return null;
				}
			}
		}
		@Pc(76) byte[] local76 = Static51.method941(this.anObjectArrayArray2[arg0][arg2], false);
		if (this.aBoolean87) {
			this.anObjectArrayArray2[arg0][arg2] = null;
		}
		return local76;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Z)Z")
	public final boolean method1499() {
		@Pc(7) boolean local7 = true;
		for (@Pc(16) int local16 = 0; local16 < this.anIntArray284.length; local16++) {
			@Pc(23) int local23 = this.anIntArray284[local16];
			if (this.anObjectArray2[local23] == null) {
				this.method1503(local23);
				if (this.anObjectArray2[local23] == null) {
					local7 = false;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IB)V")
	protected void method1500(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(I)I")
	public final int method1501() {
		return this.anObjectArrayArray2.length;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ILclient!na;I)I")
	public final int method1502(@OriginalArg(1) Class53 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class53 local8 = arg0.method1269();
		return this.aClass42Array2[arg1].method1080(local8.method1265());
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(II)V")
	protected void method1503(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ZLclient!na;)I")
	public final int method1504(@OriginalArg(1) Class53 arg0) {
		@Pc(3) Class53 local3 = arg0.method1269();
		return this.aClass42_2.method1080(local3.method1265());
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IZ)Z")
	public final boolean method1505(@OriginalArg(0) int arg0) {
		if (this.anObjectArrayArray2.length == 1) {
			return this.method1515(arg0, 0);
		} else if (this.anObjectArrayArray2[arg0].length == 1) {
			return this.method1515(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(II)[I")
	public final int[] method1506(@OriginalArg(1) int arg0) {
		return this.anIntArrayArray21[arg0];
	}

	@OriginalMember(owner = "client!we", name = "c", descriptor = "(II)I")
	public final int method1507(@OriginalArg(1) int arg0) {
		return this.anObjectArrayArray2[arg0].length;
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(IB)V")
	public final void method1508(@OriginalArg(0) int arg0) {
		for (@Pc(3) int local3 = 0; local3 < this.anObjectArrayArray2[arg0].length; local3++) {
			this.anObjectArrayArray2[arg0][local3] = null;
		}
	}

	@OriginalMember(owner = "client!we", name = "c", descriptor = "(IB)[B")
	public final byte[] method1509(@OriginalArg(0) int arg0) {
		if (this.anObjectArrayArray2.length == 1) {
			return this.method1512(0, arg0);
		} else if (this.anObjectArrayArray2[arg0].length == 1) {
			return this.method1512(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!we", name = "d", descriptor = "(II)[B")
	public final byte[] method1510(@OriginalArg(0) int arg0) {
		if (this.anObjectArrayArray2.length == 1) {
			return this.method1496(arg0, 0);
		} else if (this.anObjectArrayArray2[arg0].length == 1) {
			return this.method1496(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ILclient!na;)V")
	public final void method1511(@OriginalArg(1) Class53 arg0) {
		@Pc(3) Class53 local3 = arg0.method1269();
		@Pc(17) int local17 = this.aClass42_2.method1080(local3.method1265());
		if (local17 >= 0) {
			this.method1500(local17);
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(BII)[B")
	public final byte[] method1512(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.method1498(arg0, null, arg1);
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ZI)Z")
	public final boolean method1513(@OriginalArg(1) int arg0) {
		if (this.anObjectArray2[arg0] == null) {
			this.method1503(arg0);
			return this.anObjectArray2[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(III)Z")
	public final boolean method1515(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 < 0 || arg1 >= this.anObjectArrayArray2.length || this.anObjectArrayArray2[arg1] == null || arg0 < 0 || this.anObjectArrayArray2[arg1].length <= arg0) {
			return false;
		} else if (this.anObjectArrayArray2[arg1][arg0] != null) {
			return true;
		} else if (this.anObjectArray2[arg1] == null) {
			this.method1503(arg1);
			return this.anObjectArray2[arg1] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Z[B)V")
	protected final void method1516(@OriginalArg(1) byte[] arg0) {
		this.anInt2180 = Static8.method133(arg0, arg0.length);
		@Pc(19) Class3_Sub7 local19 = new Class3_Sub7(Static57.method1049(arg0));
		@Pc(23) int local23 = local19.method647();
		if (local23 != 5) {
			return;
		}
		@Pc(33) int local33 = local19.method647();
		@Pc(35) int local35 = 0;
		this.anInt2176 = local19.method602();
		@Pc(42) int local42 = -1;
		this.anIntArray284 = new int[this.anInt2176];
		for (@Pc(49) int local49 = 0; local49 < this.anInt2176; local49++) {
			this.anIntArray284[local49] = local35 += local19.method602();
			if (this.anIntArray284[local49] > local42) {
				local42 = this.anIntArray284[local49];
			}
		}
		this.anObjectArrayArray2 = new Object[local42 + 1][];
		this.anIntArray283 = new int[local42 + 1];
		this.anIntArrayArray21 = new int[local42 + 1][];
		this.anIntArray287 = new int[local42 + 1];
		this.anIntArray285 = new int[local42 + 1];
		this.anObjectArray2 = new Object[local42 + 1];
		@Pc(131) int local131;
		if (local33 != 0) {
			this.anIntArray286 = new int[local42 + 1];
			for (local131 = 0; local131 < this.anInt2176; local131++) {
				this.anIntArray286[this.anIntArray284[local131]] = local19.method638();
			}
			this.aClass42_2 = new Class42(this.anIntArray286);
		}
		for (local131 = 0; local131 < this.anInt2176; local131++) {
			this.anIntArray287[this.anIntArray284[local131]] = local19.method638();
		}
		for (@Pc(180) int local180 = 0; local180 < this.anInt2176; local180++) {
			this.anIntArray283[this.anIntArray284[local180]] = local19.method638();
		}
		for (@Pc(205) int local205 = 0; local205 < this.anInt2176; local205++) {
			this.anIntArray285[this.anIntArray284[local205]] = local19.method602();
		}
		@Pc(231) int local231;
		@Pc(238) int local238;
		@Pc(246) int local246;
		@Pc(248) int local248;
		for (@Pc(224) int local224 = 0; local224 < this.anInt2176; local224++) {
			local231 = this.anIntArray284[local224];
			local35 = 0;
			local238 = this.anIntArray285[local231];
			this.anIntArrayArray21[local231] = new int[local238];
			local246 = -1;
			for (local248 = 0; local248 < local238; local248++) {
				@Pc(265) int local265 = this.anIntArrayArray21[local231][local248] = local35 += local19.method602();
				if (local246 < local265) {
					local246 = local265;
				}
			}
			this.anObjectArrayArray2[local231] = new Object[local246 + 1];
		}
		if (local33 == 0) {
			return;
		}
		this.anIntArrayArray20 = new int[local42 + 1][];
		this.aClass42Array2 = new Class42[local42 + 1];
		for (local231 = 0; local231 < this.anInt2176; local231++) {
			local238 = this.anIntArray284[local231];
			local246 = this.anIntArray285[local238];
			this.anIntArrayArray20[local238] = new int[this.anObjectArrayArray2[local238].length];
			for (local248 = 0; local248 < local246; local248++) {
				this.anIntArrayArray20[local238][this.anIntArrayArray21[local238][local248]] = local19.method638();
			}
			this.aClass42Array2[local238] = new Class42(this.anIntArrayArray20[local238]);
		}
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(B)V")
	public final void method1519() {
		for (@Pc(3) int local3 = 0; local3 < this.anObjectArrayArray2.length; local3++) {
			if (this.anObjectArrayArray2[local3] != null) {
				for (@Pc(12) int local12 = 0; local12 < this.anObjectArrayArray2[local3].length; local12++) {
					this.anObjectArrayArray2[local3][local12] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Lclient!na;Lclient!na;I)Z")
	public final boolean method1520(@OriginalArg(0) Class53 arg0, @OriginalArg(1) Class53 arg1) {
		@Pc(7) Class53 local7 = arg1.method1269();
		@Pc(19) Class53 local19 = arg0.method1269();
		@Pc(27) int local27 = this.aClass42_2.method1080(local7.method1265());
		@Pc(37) int local37 = this.aClass42Array2[local27].method1080(local19.method1265());
		return this.method1515(local37, local27);
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Lclient!na;ILclient!na;)[B")
	public final byte[] method1521(@OriginalArg(0) Class53 arg0, @OriginalArg(2) Class53 arg1) {
		@Pc(12) Class53 local12 = arg0.method1269();
		@Pc(18) Class53 local18 = arg1.method1269();
		@Pc(28) int local28 = this.aClass42_2.method1080(local12.method1265());
		@Pc(38) int local38 = this.aClass42Array2[local28].method1080(local18.method1265());
		return this.method1512(local28, local38);
	}
}
