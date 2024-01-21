import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public abstract class Class14 {

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "I")
	public int anInt1886;

	@OriginalMember(owner = "client!dd", name = "g", descriptor = "[[I")
	private int[][] anIntArrayArray17;

	@OriginalMember(owner = "client!dd", name = "h", descriptor = "I")
	private int anInt1889;

	@OriginalMember(owner = "client!dd", name = "k", descriptor = "[Ljava/lang/Object;")
	protected Object[] anObjectArray2;

	@OriginalMember(owner = "client!dd", name = "l", descriptor = "[I")
	protected int[] anIntArray245;

	@OriginalMember(owner = "client!dd", name = "q", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray2;

	@OriginalMember(owner = "client!dd", name = "r", descriptor = "[I")
	private int[] anIntArray246;

	@OriginalMember(owner = "client!dd", name = "B", descriptor = "[I")
	private int[] anIntArray248;

	@OriginalMember(owner = "client!dd", name = "G", descriptor = "[I")
	protected int[] anIntArray249;

	@OriginalMember(owner = "client!dd", name = "L", descriptor = "[[I")
	private int[][] anIntArrayArray18;

	@OriginalMember(owner = "client!dd", name = "W", descriptor = "Lclient!tb;")
	private Class72 aClass72_2;

	@OriginalMember(owner = "client!dd", name = "Y", descriptor = "[Lclient!tb;")
	private Class72[] aClass72Array2;

	@OriginalMember(owner = "client!dd", name = "cb", descriptor = "[I")
	protected int[] anIntArray251;

	@OriginalMember(owner = "client!dd", name = "K", descriptor = "Z")
	private final boolean aBoolean72;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "Z")
	private final boolean aBoolean70;

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(ZZ)V")
	protected Class14(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean72 = arg1;
		this.aBoolean70 = arg0;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(I[II)Z")
	private boolean method1142(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.anObjectArray2[arg1] == null) {
			return false;
		}
		@Pc(15) int local15 = this.anIntArray249[arg1];
		@Pc(20) int[] local20 = this.anIntArrayArray18[arg1];
		@Pc(25) Object[] local25 = this.anObjectArrayArray2[arg1];
		@Pc(27) boolean local27 = true;
		for (@Pc(29) int local29 = 0; local29 < local15; local29++) {
			if (local25[local20[local29]] == null) {
				local27 = false;
				break;
			}
		}
		if (local27) {
			return true;
		}
		@Pc(82) byte[] local82;
		if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
			local82 = Static128.method1987(false, this.anObjectArray2[arg1]);
		} else {
			local82 = Static128.method1987(true, this.anObjectArray2[arg1]);
			@Pc(98) Class8_Sub20 local98 = new Class8_Sub20(local82);
			local98.method1880(arg0, local98.aByteArray44.length);
		}
		@Pc(112) byte[] local112;
		try {
			local112 = Static20.method369(local82);
		} catch (@Pc(114) RuntimeException local114) {
			throw Static107.method1516(local114, "T3 - " + (arg0 != null) + "," + arg1 + "," + local82.length + "," + Static97.method1364(local82, local82.length) + "," + Static97.method1364(local82, local82.length - 2) + "," + this.anIntArray251[arg1] + "," + this.anInt1886);
		}
		if (this.aBoolean70) {
			this.anObjectArray2[arg1] = null;
		}
		if (local15 > 1) {
			@Pc(203) int local203 = local112.length;
			@Pc(206) int local206 = local203 - 1;
			@Pc(210) int local210 = local112[local206] & 0xFF;
			@Pc(215) Class8_Sub20 local215 = new Class8_Sub20(local112);
			@Pc(223) int local223 = local206 - local15 * local210 * 4;
			local215.anInt2853 = local223;
			@Pc(229) int[] local229 = new int[local15];
			@Pc(236) int local236;
			for (@Pc(231) int local231 = 0; local231 < local210; local231++) {
				@Pc(234) int local234 = 0;
				for (local236 = 0; local236 < local15; local236++) {
					local234 += local215.method1853();
					local229[local236] += local234;
				}
			}
			@Pc(265) byte[][] local265 = new byte[local15][];
			for (local236 = 0; local236 < local15; local236++) {
				local265[local236] = new byte[local229[local236]];
				local229[local236] = 0;
			}
			@Pc(285) int local285 = 0;
			local215.anInt2853 = local223;
			@Pc(293) int local293;
			for (@Pc(290) int local290 = 0; local290 < local210; local290++) {
				local293 = 0;
				for (@Pc(295) int local295 = 0; local295 < local15; local295++) {
					local293 += local215.method1853();
					Static140.method1345(local112, local285, local265[local295], local229[local295], local293);
					local229[local295] += local293;
					local285 += local293;
				}
			}
			for (local293 = 0; local293 < local15; local293++) {
				if (this.aBoolean72) {
					local25[local20[local293]] = local265[local293];
				} else {
					local25[local20[local293]] = Static45.method679(local265[local293]);
				}
			}
		} else if (this.aBoolean72) {
			local25[local20[0]] = local112;
		} else {
			local25[local20[0]] = Static45.method679(local112);
		}
		return true;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "([BI)V")
	protected final void method1143(@OriginalArg(0) byte[] arg0) {
		this.anInt1886 = Static97.method1364(arg0, arg0.length);
		@Pc(19) Class8_Sub20 local19 = new Class8_Sub20(Static20.method369(arg0));
		@Pc(23) int local23 = local19.method1872();
		if (local23 != 5 && local23 != 6) {
			throw new RuntimeException("Incorrect JS5 protocol number: " + local23);
		}
		if (local23 >= 6) {
			local19.method1853();
		}
		@Pc(51) int local51 = local19.method1872();
		this.anInt1889 = local19.method1839();
		@Pc(58) int local58 = 0;
		this.anIntArray248 = new int[this.anInt1889];
		@Pc(65) int local65 = -1;
		for (@Pc(67) int local67 = 0; local67 < this.anInt1889; local67++) {
			this.anIntArray248[local67] = local58 += local19.method1839();
			if (local65 < this.anIntArray248[local67]) {
				local65 = this.anIntArray248[local67];
			}
		}
		this.anObjectArrayArray2 = new Object[local65 + 1][];
		this.anObjectArray2 = new Object[local65 + 1];
		this.anIntArray245 = new int[local65 + 1];
		this.anIntArray251 = new int[local65 + 1];
		this.anIntArray249 = new int[local65 + 1];
		this.anIntArrayArray18 = new int[local65 + 1][];
		@Pc(149) int local149;
		@Pc(168) int local168;
		if (local51 != 0) {
			this.anIntArray246 = new int[local65 + 1];
			for (local149 = 0; local149 < local65 + 1; local149++) {
				this.anIntArray246[local149] = -1;
			}
			for (local168 = 0; local168 < this.anInt1889; local168++) {
				this.anIntArray246[this.anIntArray248[local168]] = local19.method1853();
			}
			this.aClass72_2 = new Class72(this.anIntArray246);
		}
		for (local149 = 0; local149 < this.anInt1889; local149++) {
			this.anIntArray251[this.anIntArray248[local149]] = local19.method1853();
		}
		for (local168 = 0; local168 < this.anInt1889; local168++) {
			this.anIntArray245[this.anIntArray248[local168]] = local19.method1853();
		}
		for (@Pc(236) int local236 = 0; local236 < this.anInt1889; local236++) {
			this.anIntArray249[this.anIntArray248[local236]] = local19.method1839();
		}
		@Pc(268) int local268;
		@Pc(273) int local273;
		@Pc(281) int local281;
		@Pc(283) int local283;
		@Pc(300) int local300;
		for (@Pc(259) int local259 = 0; local259 < this.anInt1889; local259++) {
			local58 = 0;
			local268 = this.anIntArray248[local259];
			local273 = this.anIntArray249[local268];
			this.anIntArrayArray18[local268] = new int[local273];
			local281 = -1;
			for (local283 = 0; local283 < local273; local283++) {
				local300 = this.anIntArrayArray18[local268][local283] = local58 += local19.method1839();
				if (local281 < local300) {
					local281 = local300;
				}
			}
			this.anObjectArrayArray2[local268] = new Object[local281 + 1];
		}
		if (local51 == 0) {
			return;
		}
		this.aClass72Array2 = new Class72[local65 + 1];
		this.anIntArrayArray17 = new int[local65 + 1][];
		for (local268 = 0; local268 < this.anInt1889; local268++) {
			local273 = this.anIntArray248[local268];
			local281 = this.anIntArray249[local273];
			this.anIntArrayArray17[local273] = new int[this.anObjectArrayArray2[local273].length];
			for (local283 = 0; local283 < this.anObjectArrayArray2[local273].length; local283++) {
				this.anIntArrayArray17[local273][local283] = -1;
			}
			for (local300 = 0; local300 < local281; local300++) {
				this.anIntArrayArray17[local273][this.anIntArrayArray18[local273][local300]] = local19.method1853();
			}
			this.aClass72Array2[local273] = new Class72(this.anIntArrayArray17[local273]);
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)I")
	public final int method1144(@OriginalArg(1) int arg0) {
		return this.anObjectArrayArray2[arg0].length;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(III)Z")
	public final boolean method1145(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 < 0 || this.anObjectArrayArray2.length <= arg0 || this.anObjectArrayArray2[arg0] == null || arg1 < 0 || this.anObjectArrayArray2[arg0].length <= arg1) {
			return false;
		} else if (this.anObjectArrayArray2[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray2[arg0] == null) {
			this.method1161(arg0);
			return this.anObjectArray2[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILclient!ic;)V")
	public final void method1146(@OriginalArg(1) Class34 arg0) {
		@Pc(7) Class34 local7 = arg0.method834();
		@Pc(15) int local15 = this.aClass72_2.method1618(local7.method839());
		if (local15 >= 0) {
			this.method1167(local15);
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)Z")
	public final boolean method1148() {
		@Pc(7) boolean local7 = true;
		for (@Pc(9) int local9 = 0; local9 < this.anIntArray248.length; local9++) {
			@Pc(16) int local16 = this.anIntArray248[local9];
			if (this.anObjectArray2[local16] == null) {
				this.method1161(local16);
				if (this.anObjectArray2[local16] == null) {
					local7 = false;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZII[I)[B")
	public final byte[] method1149(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		if (arg1 < 0 || arg1 >= this.anObjectArrayArray2.length || this.anObjectArrayArray2[arg1] == null || arg0 < 0 || this.anObjectArrayArray2[arg1].length <= arg0) {
			return null;
		}
		if (this.anObjectArrayArray2[arg1][arg0] == null) {
			@Pc(51) boolean local51 = this.method1142(arg2, arg1);
			if (!local51) {
				this.method1161(arg1);
				local51 = this.method1142(arg2, arg1);
				if (!local51) {
					return null;
				}
			}
		}
		@Pc(77) byte[] local77 = Static128.method1987(false, this.anObjectArrayArray2[arg1][arg0]);
		if (this.aBoolean72) {
			this.anObjectArrayArray2[arg1][arg0] = null;
		}
		return local77;
	}

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "(II)Z")
	public final boolean method1150(@OriginalArg(0) int arg0) {
		if (this.anObjectArray2[arg0] == null) {
			this.method1161(arg0);
			return this.anObjectArray2[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)I")
	public final int method1151() {
		return this.anObjectArrayArray2.length;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IZ)[I")
	public final int[] method1153(@OriginalArg(0) int arg0) {
		return this.anIntArrayArray18[arg0];
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILclient!ic;Lclient!ic;)Z")
	public final boolean method1154(@OriginalArg(1) Class34 arg0, @OriginalArg(2) Class34 arg1) {
		@Pc(3) Class34 local3 = arg0.method834();
		@Pc(11) Class34 local11 = arg1.method834();
		@Pc(19) int local19 = this.aClass72_2.method1618(local3.method839());
		@Pc(29) int local29 = this.aClass72Array2[local19].method1618(local11.method839());
		return this.method1145(local19, local29);
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(ZII)[B")
	public final byte[] method1156(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.method1149(arg0, arg1, null);
	}

	@OriginalMember(owner = "client!dd", name = "d", descriptor = "(II)[B")
	public final byte[] method1157(@OriginalArg(0) int arg0) {
		if (this.anObjectArrayArray2.length == 1) {
			return this.method1156(arg0, 0);
		} else if (this.anObjectArrayArray2[arg0].length == 1) {
			return this.method1156(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V")
	public final void method1158() {
		for (@Pc(13) int local13 = 0; local13 < this.anObjectArrayArray2.length; local13++) {
			if (this.anObjectArrayArray2[local13] != null) {
				for (@Pc(21) int local21 = 0; local21 < this.anObjectArrayArray2[local13].length; local21++) {
					this.anObjectArrayArray2[local13][local21] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IILclient!ic;)I")
	public final int method1159(@OriginalArg(1) int arg0, @OriginalArg(2) Class34 arg1) {
		@Pc(12) Class34 local12 = arg1.method834();
		return this.aClass72Array2[arg0].method1618(local12.method839());
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(BI)V")
	protected void method1161(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIB)[B")
	public final byte[] method1162(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 < 0 || arg0 >= this.anObjectArrayArray2.length || this.anObjectArrayArray2[arg0] == null || arg1 < 0 || this.anObjectArrayArray2[arg0].length <= arg1) {
			return null;
		}
		if (this.anObjectArrayArray2[arg0][arg1] == null) {
			@Pc(58) boolean local58 = this.method1142(null, arg0);
			if (!local58) {
				this.method1161(arg0);
				local58 = this.method1142(null, arg0);
				if (!local58) {
					return null;
				}
			}
		}
		return Static128.method1987(false, this.anObjectArrayArray2[arg0][arg1]);
	}

	@OriginalMember(owner = "client!dd", name = "e", descriptor = "(II)V")
	public final void method1163(@OriginalArg(1) int arg0) {
		for (@Pc(9) int local9 = 0; local9 < this.anObjectArrayArray2[arg0].length; local9++) {
			this.anObjectArrayArray2[arg0][local9] = null;
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lclient!ic;I)I")
	public final int method1164(@OriginalArg(0) Class34 arg0) {
		@Pc(15) Class34 local15 = arg0.method834();
		return this.aClass72_2.method1618(local15.method839());
	}

	@OriginalMember(owner = "client!dd", name = "f", descriptor = "(II)[B")
	public final byte[] method1165(@OriginalArg(0) int arg0) {
		if (this.anObjectArrayArray2.length == 1) {
			return this.method1162(0, arg0);
		} else if (this.anObjectArrayArray2[arg0].length == 1) {
			return this.method1162(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lclient!ic;ILclient!ic;)[B")
	public final byte[] method1166(@OriginalArg(0) Class34 arg0, @OriginalArg(2) Class34 arg1) {
		@Pc(3) Class34 local3 = arg0.method834();
		@Pc(17) Class34 local17 = arg1.method834();
		@Pc(25) int local25 = this.aClass72_2.method1618(local3.method839());
		@Pc(35) int local35 = this.aClass72Array2[local25].method1618(local17.method839());
		return this.method1156(local35, local25);
	}

	@OriginalMember(owner = "client!dd", name = "g", descriptor = "(II)V")
	protected void method1167(@OriginalArg(1) int arg0) {
	}
}
