import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ga")
public abstract class Class30 {

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray2;

	@OriginalMember(owner = "client!ga", name = "j", descriptor = "[I")
	private int[] anIntArray259;

	@OriginalMember(owner = "client!ga", name = "q", descriptor = "[Lclient!mc;")
	private Class55[] aClass55Array2;

	@OriginalMember(owner = "client!ga", name = "s", descriptor = "[I")
	protected int[] anIntArray260;

	@OriginalMember(owner = "client!ga", name = "t", descriptor = "[I")
	protected int[] anIntArray261;

	@OriginalMember(owner = "client!ga", name = "v", descriptor = "I")
	public int anInt1954;

	@OriginalMember(owner = "client!ga", name = "y", descriptor = "[Ljava/lang/Object;")
	protected Object[] anObjectArray2;

	@OriginalMember(owner = "client!ga", name = "B", descriptor = "Lclient!mc;")
	private Class55 aClass55_2;

	@OriginalMember(owner = "client!ga", name = "C", descriptor = "[I")
	protected int[] anIntArray262;

	@OriginalMember(owner = "client!ga", name = "E", descriptor = "[[I")
	private int[][] anIntArrayArray20;

	@OriginalMember(owner = "client!ga", name = "G", descriptor = "[[I")
	private int[][] anIntArrayArray21;

	@OriginalMember(owner = "client!ga", name = "K", descriptor = "[I")
	private int[] anIntArray263;

	@OriginalMember(owner = "client!ga", name = "Q", descriptor = "I")
	private int anInt1967;

	@OriginalMember(owner = "client!ga", name = "O", descriptor = "Z")
	private final boolean aBoolean98;

	@OriginalMember(owner = "client!ga", name = "h", descriptor = "Z")
	private final boolean aBoolean97;

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(ZZ)V")
	protected Class30(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean98 = arg0;
		this.aBoolean97 = arg1;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)I")
	public final int method1278(@OriginalArg(0) int arg0) {
		return this.anObjectArrayArray2[arg0].length;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IB)V")
	protected void method1279(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(III)[B")
	public final byte[] method1280(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 < 0 || this.anObjectArrayArray2.length <= arg0 || this.anObjectArrayArray2[arg0] == null || arg1 < 0 || this.anObjectArrayArray2[arg0].length <= arg1) {
			return null;
		}
		if (this.anObjectArrayArray2[arg0][arg1] == null) {
			@Pc(52) boolean local52 = this.method1294(arg0, null);
			if (!local52) {
				this.method1279(arg0);
				local52 = this.method1294(arg0, null);
				if (!local52) {
					return null;
				}
			}
		}
		return Static115.method2042(false, this.anObjectArrayArray2[arg0][arg1]);
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!ed;B)I")
	public final int method1281(@OriginalArg(0) Class23 arg0) {
		@Pc(15) Class23 local15 = arg0.method638();
		return this.aClass55_2.method1723(local15.method657());
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "([IIII)[B")
	public final byte[] method1282(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 < 0 || this.anObjectArrayArray2.length <= arg1 || this.anObjectArrayArray2[arg1] == null || arg2 < 0 || this.anObjectArrayArray2[arg1].length <= arg2) {
			return null;
		}
		if (this.anObjectArrayArray2[arg1][arg2] == null) {
			@Pc(48) boolean local48 = this.method1294(arg1, arg0);
			if (!local48) {
				this.method1279(arg1);
				local48 = this.method1294(arg1, arg0);
				if (!local48) {
					return null;
				}
			}
		}
		@Pc(74) byte[] local74 = Static115.method2042(false, this.anObjectArrayArray2[arg1][arg2]);
		if (this.aBoolean97) {
			this.anObjectArrayArray2[arg1][arg2] = null;
		}
		return local74;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(ZI)V")
	public final void method1283(@OriginalArg(1) int arg0) {
		for (@Pc(11) int local11 = 0; local11 < this.anObjectArrayArray2[arg0].length; local11++) {
			this.anObjectArrayArray2[arg0][local11] = null;
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIZ)Z")
	public final boolean method1284(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 < 0 || arg0 >= this.anObjectArrayArray2.length || this.anObjectArrayArray2[arg0] == null || arg1 < 0 || arg1 >= this.anObjectArrayArray2[arg0].length) {
			return false;
		} else if (this.anObjectArrayArray2[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray2[arg0] == null) {
			this.method1279(arg0);
			return this.anObjectArray2[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(II)Z")
	public final boolean method1286(@OriginalArg(0) int arg0) {
		if (this.anObjectArrayArray2.length == 1) {
			return this.method1284(0, arg0);
		} else if (this.anObjectArrayArray2[arg0].length == 1) {
			return this.method1284(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(IB)V")
	protected void method1287(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)Z")
	public final boolean method1288() {
		@Pc(7) boolean local7 = true;
		for (@Pc(16) int local16 = 0; local16 < this.anIntArray259.length; local16++) {
			@Pc(23) int local23 = this.anIntArray259[local16];
			if (this.anObjectArray2[local23] == null) {
				this.method1279(local23);
				if (this.anObjectArray2[local23] == null) {
					local7 = false;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!ed;BLclient!ed;)[B")
	public final byte[] method1289(@OriginalArg(0) Class23 arg0, @OriginalArg(2) Class23 arg1) {
		@Pc(3) Class23 local3 = arg1.method638();
		@Pc(20) Class23 local20 = arg0.method638();
		@Pc(30) int local30 = this.aClass55_2.method1723(local3.method657());
		@Pc(40) int local40 = this.aClass55Array2[local30].method1723(local20.method657());
		return this.method1301(local30, local40);
	}

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "(II)[I")
	public final int[] method1290(@OriginalArg(1) int arg0) {
		return this.anIntArrayArray20[arg0];
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(I)I")
	public final int method1291() {
		return this.anObjectArrayArray2.length;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IZ)Z")
	public final boolean method1292(@OriginalArg(0) int arg0) {
		if (this.anObjectArray2[arg0] == null) {
			this.method1279(arg0);
			return this.anObjectArray2[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "([BI)V")
	protected final void method1293(@OriginalArg(0) byte[] arg0) {
		this.anInt1954 = Static64.method1136(arg0, arg0.length);
		@Pc(24) Class1_Sub8 local24 = new Class1_Sub8(Static114.method2034(arg0));
		@Pc(28) int local28 = local24.method861();
		if (local28 != 5 && local28 != 6) {
			throw new RuntimeException("Incorrect JS5 protocol number: " + local28);
		}
		if (local28 >= 6) {
			local24.method868();
		}
		@Pc(60) int local60 = 0;
		@Pc(64) int local64 = local24.method861();
		this.anInt1967 = local24.method878();
		this.anIntArray259 = new int[this.anInt1967];
		@Pc(78) int local78 = -1;
		for (@Pc(80) int local80 = 0; local80 < this.anInt1967; local80++) {
			this.anIntArray259[local80] = local60 += local24.method878();
			if (this.anIntArray259[local80] > local78) {
				local78 = this.anIntArray259[local80];
			}
		}
		this.anIntArrayArray20 = new int[local78 + 1][];
		this.anIntArray260 = new int[local78 + 1];
		this.anIntArray262 = new int[local78 + 1];
		this.anObjectArrayArray2 = new Object[local78 + 1][];
		this.anObjectArray2 = new Object[local78 + 1];
		this.anIntArray261 = new int[local78 + 1];
		@Pc(157) int local157;
		@Pc(172) int local172;
		if (local64 != 0) {
			this.anIntArray263 = new int[local78 + 1];
			for (local157 = 0; local157 < local78 + 1; local157++) {
				this.anIntArray263[local157] = -1;
			}
			for (local172 = 0; local172 < this.anInt1967; local172++) {
				this.anIntArray263[this.anIntArray259[local172]] = local24.method868();
			}
			this.aClass55_2 = new Class55(this.anIntArray263);
		}
		for (local157 = 0; local157 < this.anInt1967; local157++) {
			this.anIntArray262[this.anIntArray259[local157]] = local24.method868();
		}
		for (local172 = 0; local172 < this.anInt1967; local172++) {
			this.anIntArray261[this.anIntArray259[local172]] = local24.method868();
		}
		for (@Pc(242) int local242 = 0; local242 < this.anInt1967; local242++) {
			this.anIntArray260[this.anIntArray259[local242]] = local24.method878();
		}
		@Pc(276) int local276;
		@Pc(281) int local281;
		@Pc(271) int local271;
		@Pc(289) int local289;
		@Pc(306) int local306;
		for (@Pc(265) int local265 = 0; local265 < this.anInt1967; local265++) {
			local60 = 0;
			local271 = -1;
			local276 = this.anIntArray259[local265];
			local281 = this.anIntArray260[local276];
			this.anIntArrayArray20[local276] = new int[local281];
			for (local289 = 0; local289 < local281; local289++) {
				local306 = this.anIntArrayArray20[local276][local289] = local60 += local24.method878();
				if (local306 > local271) {
					local271 = local306;
				}
			}
			this.anObjectArrayArray2[local276] = new Object[local271 + 1];
		}
		if (local64 == 0) {
			return;
		}
		this.aClass55Array2 = new Class55[local78 + 1];
		this.anIntArrayArray21 = new int[local78 + 1][];
		for (local276 = 0; local276 < this.anInt1967; local276++) {
			local281 = this.anIntArray259[local276];
			local271 = this.anIntArray260[local281];
			this.anIntArrayArray21[local281] = new int[this.anObjectArrayArray2[local281].length];
			for (local289 = 0; local289 < this.anObjectArrayArray2[local281].length; local289++) {
				this.anIntArrayArray21[local281][local289] = -1;
			}
			for (local306 = 0; local306 < local271; local306++) {
				this.anIntArrayArray21[local281][this.anIntArrayArray20[local281][local306]] = local24.method868();
			}
			this.aClass55Array2[local281] = new Class55(this.anIntArrayArray21[local281]);
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(II[I)Z")
	private boolean method1294(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.anObjectArray2[arg0] == null) {
			return false;
		}
		@Pc(17) int local17 = this.anIntArray260[arg0];
		@Pc(22) int[] local22 = this.anIntArrayArray20[arg0];
		@Pc(32) Object[] local32 = this.anObjectArrayArray2[arg0];
		@Pc(34) boolean local34 = true;
		for (@Pc(36) int local36 = 0; local36 < local17; local36++) {
			if (local32[local22[local36]] == null) {
				local34 = false;
				break;
			}
		}
		if (local34) {
			return true;
		}
		@Pc(91) byte[] local91;
		if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
			local91 = Static115.method2042(false, this.anObjectArray2[arg0]);
		} else {
			local91 = Static115.method2042(true, this.anObjectArray2[arg0]);
			@Pc(96) Class1_Sub8 local96 = new Class1_Sub8(local91);
			local96.method905(arg1, local96.aByteArray12.length);
		}
		@Pc(118) byte[] local118;
		try {
			local118 = Static114.method2034(local91);
		} catch (@Pc(120) RuntimeException local120) {
			throw Static5.method3151(local120, "T3 - " + (arg1 != null) + "," + arg0 + "," + local91.length + "," + Static64.method1136(local91, local91.length) + "," + Static64.method1136(local91, local91.length - 2) + "," + this.anIntArray262[arg0] + "," + this.anInt1954);
		}
		if (this.aBoolean98) {
			this.anObjectArray2[arg0] = null;
		}
		if (local17 > 1) {
			@Pc(187) int local187 = local118.length;
			@Pc(190) int local190 = local187 - 1;
			@Pc(194) int local194 = local118[local190] & 0xFF;
			@Pc(202) int local202 = local190 - local17 * 4 * local194;
			@Pc(205) int[] local205 = new int[local17];
			@Pc(210) Class1_Sub8 local210 = new Class1_Sub8(local118);
			local210.anInt1357 = local202;
			@Pc(221) int local221;
			for (@Pc(215) int local215 = 0; local215 < local194; local215++) {
				@Pc(219) int local219 = 0;
				for (local221 = 0; local221 < local17; local221++) {
					local219 += local210.method868();
					local205[local221] += local219;
				}
			}
			@Pc(255) byte[][] local255 = new byte[local17][];
			for (local221 = 0; local221 < local17; local221++) {
				local255[local221] = new byte[local205[local221]];
				local205[local221] = 0;
			}
			local210.anInt1357 = local202;
			@Pc(283) int local283 = 0;
			@Pc(289) int local289;
			for (@Pc(285) int local285 = 0; local285 < local194; local285++) {
				local289 = 0;
				for (@Pc(291) int local291 = 0; local291 < local17; local291++) {
					local289 += local210.method868();
					Static184.method628(local118, local283, local255[local291], local205[local291], local289);
					local283 += local289;
					local205[local291] += local289;
				}
			}
			for (local289 = 0; local289 < local17; local289++) {
				if (this.aBoolean97) {
					local32[local22[local289]] = local255[local289];
				} else {
					local32[local22[local289]] = Static182.method3162(local255[local289]);
				}
			}
		} else if (this.aBoolean97) {
			local32[local22[0]] = local118;
		} else {
			local32[local22[0]] = Static182.method3162(local118);
		}
		return true;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(BLclient!ed;Lclient!ed;)Z")
	public final boolean method1295(@OriginalArg(1) Class23 arg0, @OriginalArg(2) Class23 arg1) {
		@Pc(7) Class23 local7 = arg0.method638();
		@Pc(11) Class23 local11 = arg1.method638();
		@Pc(19) int local19 = this.aClass55_2.method1723(local7.method657());
		@Pc(29) int local29 = this.aClass55Array2[local19].method1723(local11.method657());
		return this.method1284(local19, local29);
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!ed;BI)I")
	public final int method1296(@OriginalArg(0) Class23 arg0, @OriginalArg(2) int arg1) {
		@Pc(3) Class23 local3 = arg0.method638();
		return this.aClass55Array2[arg1].method1723(local3.method657());
	}

	@OriginalMember(owner = "client!ga", name = "d", descriptor = "(II)[B")
	public final byte[] method1298(@OriginalArg(1) int arg0) {
		if (this.anObjectArrayArray2.length == 1) {
			return this.method1301(0, arg0);
		} else if (this.anObjectArrayArray2[arg0].length == 1) {
			return this.method1301(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "(I)V")
	public final void method1299() {
		for (@Pc(3) int local3 = 0; local3 < this.anObjectArrayArray2.length; local3++) {
			if (this.anObjectArrayArray2[local3] != null) {
				for (@Pc(20) int local20 = 0; local20 < this.anObjectArrayArray2[local3].length; local20++) {
					this.anObjectArrayArray2[local3][local20] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!ed;Z)V")
	public final void method1300(@OriginalArg(0) Class23 arg0) {
		@Pc(7) Class23 local7 = arg0.method638();
		@Pc(15) int local15 = this.aClass55_2.method1723(local7.method657());
		if (local15 >= 0) {
			this.method1287(local15);
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIB)[B")
	public final byte[] method1301(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method1282(null, arg0, arg1);
	}
}
