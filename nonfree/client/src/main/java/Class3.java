import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ab")
public abstract class Class3 {

	@OriginalMember(owner = "client!ab", name = "h", descriptor = "[[I")
	private int[][] anIntArrayArray29;

	@OriginalMember(owner = "client!ab", name = "i", descriptor = "[I")
	protected int[] anIntArray345;

	@OriginalMember(owner = "client!ab", name = "l", descriptor = "[I")
	protected int[] anIntArray346;

	@OriginalMember(owner = "client!ab", name = "t", descriptor = "[I")
	protected int[] anIntArray347;

	@OriginalMember(owner = "client!ab", name = "B", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray2;

	@OriginalMember(owner = "client!ab", name = "E", descriptor = "[Lclient!gd;")
	private Class37[] aClass37Array2;

	@OriginalMember(owner = "client!ab", name = "G", descriptor = "I")
	private int anInt4309;

	@OriginalMember(owner = "client!ab", name = "H", descriptor = "[Ljava/lang/Object;")
	protected Object[] anObjectArray29;

	@OriginalMember(owner = "client!ab", name = "I", descriptor = "I")
	public int anInt4310;

	@OriginalMember(owner = "client!ab", name = "J", descriptor = "Lclient!gd;")
	private Class37 aClass37_2;

	@OriginalMember(owner = "client!ab", name = "O", descriptor = "[I")
	private int[] anIntArray348;

	@OriginalMember(owner = "client!ab", name = "R", descriptor = "[I")
	private int[] anIntArray349;

	@OriginalMember(owner = "client!ab", name = "U", descriptor = "[[I")
	private int[][] anIntArrayArray30;

	@OriginalMember(owner = "client!ab", name = "Z", descriptor = "[I")
	private int[] anIntArray350;

	@OriginalMember(owner = "client!ab", name = "r", descriptor = "Z")
	private final boolean aBoolean232;

	@OriginalMember(owner = "client!ab", name = "bb", descriptor = "Z")
	private final boolean aBoolean233;

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(ZZ)V")
	protected Class3(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean232 = arg0;
		this.aBoolean233 = arg1;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "([BB)V")
	protected final void method3245(@OriginalArg(0) byte[] arg0) {
		this.anInt4310 = Static201.method3329(arg0, arg0.length);
		@Pc(15) Class1_Sub14 local15 = new Class1_Sub14(Static68.method1066(arg0));
		@Pc(19) int local19 = local15.method3010();
		if (local19 != 5 && local19 != 6) {
			throw new RuntimeException("Incorrect JS5 protocol number: " + local19);
		}
		if (local19 >= 6) {
			local15.method3058();
		}
		@Pc(55) int local55 = local15.method3010();
		this.anInt4309 = local15.method3023();
		this.anIntArray350 = new int[this.anInt4309];
		@Pc(67) int local67 = 0;
		@Pc(69) int local69 = -1;
		for (@Pc(71) int local71 = 0; local71 < this.anInt4309; local71++) {
			this.anIntArray350[local71] = local67 += local15.method3023();
			if (this.anIntArray350[local71] > local69) {
				local69 = this.anIntArray350[local71];
			}
		}
		this.anObjectArray29 = new Object[local69 + 1];
		this.anIntArrayArray29 = new int[local69 + 1][];
		this.anIntArray346 = new int[local69 + 1];
		this.anIntArray348 = new int[local69 + 1];
		this.anObjectArrayArray2 = new Object[local69 + 1][];
		this.anIntArray347 = new int[local69 + 1];
		this.anIntArray345 = new int[local69 + 1];
		@Pc(164) int local164;
		@Pc(183) int local183;
		if (local55 != 0) {
			this.anIntArray349 = new int[local69 + 1];
			for (local164 = 0; local164 < local69 + 1; local164++) {
				this.anIntArray349[local164] = -1;
			}
			for (local183 = 0; local183 < this.anInt4309; local183++) {
				this.anIntArray349[this.anIntArray350[local183]] = local15.method3058();
			}
			this.aClass37_2 = new Class37(this.anIntArray349);
		}
		for (local164 = 0; local164 < this.anInt4309; local164++) {
			this.anIntArray347[this.anIntArray350[local164]] = local15.method3058();
		}
		for (local183 = 0; local183 < this.anInt4309; local183++) {
			this.anIntArray345[this.anIntArray350[local183]] = local15.method3058();
		}
		for (@Pc(255) int local255 = 0; local255 < this.anInt4309; local255++) {
			this.anIntArray346[this.anIntArray350[local255]] = local15.method3023();
		}
		@Pc(287) int local287;
		@Pc(292) int local292;
		@Pc(300) int local300;
		@Pc(302) int local302;
		@Pc(319) int local319;
		for (@Pc(278) int local278 = 0; local278 < this.anInt4309; local278++) {
			local67 = 0;
			local287 = this.anIntArray350[local278];
			local292 = this.anIntArray346[local287];
			this.anIntArrayArray29[local287] = new int[local292];
			local300 = -1;
			for (local302 = 0; local302 < local292; local302++) {
				local319 = this.anIntArrayArray29[local287][local302] = local67 += local15.method3023();
				if (local300 < local319) {
					local300 = local319;
				}
			}
			this.anIntArray348[local287] = local300 + 1;
			if (local300 + 1 == local292) {
				this.anIntArrayArray29[local287] = null;
			}
		}
		if (local55 == 0) {
			return;
		}
		this.anIntArrayArray30 = new int[local69 + 1][];
		this.aClass37Array2 = new Class37[local69 + 1];
		for (local287 = 0; local287 < this.anInt4309; local287++) {
			local292 = this.anIntArray350[local287];
			local300 = this.anIntArray346[local292];
			this.anIntArrayArray30[local292] = new int[this.anIntArray348[local292]];
			for (local302 = 0; local302 < this.anIntArray348[local292]; local302++) {
				this.anIntArrayArray30[local292][local302] = -1;
			}
			for (local319 = 0; local319 < local300; local319++) {
				@Pc(431) int local431;
				if (this.anIntArrayArray29[local292] == null) {
					local431 = local319;
				} else {
					local431 = this.anIntArrayArray29[local292][local319];
				}
				this.anIntArrayArray30[local292][local431] = local15.method3058();
			}
			this.aClass37Array2[local292] = new Class37(this.anIntArrayArray30[local292]);
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILclient!vd;)I")
	public final int method3246(@OriginalArg(1) Class92 arg0) {
		@Pc(3) Class92 local3 = arg0.method3220();
		@Pc(11) int local11 = this.aClass37_2.method1004(local3.method3210());
		return this.method3267(local11) ? local11 : -1;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIB)Z")
	public final boolean method3247(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method3274(arg0, arg1)) {
			return false;
		} else if (this.anObjectArrayArray2[arg1] != null && this.anObjectArrayArray2[arg1][arg0] != null) {
			return true;
		} else if (this.anObjectArray29[arg1] == null) {
			this.method3268(arg1);
			return this.anObjectArray29[arg1] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "([IIIZ)[B")
	public final byte[] method3248(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!this.method3274(arg1, arg2)) {
			return null;
		}
		if (this.anObjectArrayArray2[arg2] == null || this.anObjectArrayArray2[arg2][arg1] == null) {
			@Pc(29) boolean local29 = this.method3269(arg2, arg0);
			if (!local29) {
				this.method3268(arg2);
				local29 = this.method3269(arg2, arg0);
				if (!local29) {
					return null;
				}
			}
		}
		@Pc(61) byte[] local61 = Static189.method3110(false, this.anObjectArrayArray2[arg2][arg1]);
		if (this.aBoolean233) {
			this.anObjectArrayArray2[arg2][arg1] = null;
			if (this.anIntArray348[arg2] == 1) {
				this.anObjectArrayArray2[arg2] = null;
			}
		}
		return local61;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)Z")
	public final boolean method3249() {
		@Pc(7) boolean local7 = true;
		for (@Pc(9) int local9 = 0; local9 < this.anIntArray350.length; local9++) {
			@Pc(16) int local16 = this.anIntArray350[local9];
			if (this.anObjectArray29[local16] == null) {
				this.method3268(local16);
				if (this.anObjectArray29[local16] == null) {
					local7 = false;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lclient!vd;B)I")
	public final int method3250(@OriginalArg(0) Class92 arg0) {
		@Pc(9) Class92 local9 = arg0.method3220();
		@Pc(17) int local17 = this.aClass37_2.method1004(local9.method3210());
		return this.method3277(local17);
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)I")
	public final int method3251() {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < this.anObjectArray29.length; local11++) {
			if (this.anIntArray346[local11] > 0) {
				local9 += 100;
				local7 += this.method3277(local11);
			}
		}
		if (local9 == 0) {
			return 100;
		} else {
			return local7 * 100 / local9;
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILclient!vd;Lclient!vd;)[B")
	public final byte[] method3252(@OriginalArg(1) Class92 arg0, @OriginalArg(2) Class92 arg1) {
		@Pc(7) Class92 local7 = arg1.method3220();
		@Pc(11) Class92 local11 = arg0.method3220();
		@Pc(21) int local21 = this.aClass37_2.method1004(local7.method3210());
		if (this.method3267(local21)) {
			@Pc(38) int local38 = this.aClass37Array2[local21].method1004(local11.method3210());
			return this.method3265(local21, local38);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(ZI)Z")
	public final boolean method3253(@OriginalArg(1) int arg0) {
		if (this.anIntArray348.length == 1) {
			return this.method3247(arg0, 0);
		} else if (!this.method3267(arg0)) {
			return false;
		} else if (this.anIntArray348[arg0] == 1) {
			return this.method3247(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lclient!vd;I)Z")
	public final boolean method3255(@OriginalArg(0) Class92 arg0) {
		@Pc(3) Class92 local3 = arg0.method3220();
		@Pc(11) int local11 = this.aClass37_2.method1004(local3.method3210());
		return this.method3273(local11);
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(BI)V")
	protected void method3256(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(II)[I")
	public final int[] method3258(@OriginalArg(0) int arg0) {
		if (!this.method3267(arg0)) {
			return null;
		}
		@Pc(23) int[] local23 = this.anIntArrayArray29[arg0];
		if (local23 == null) {
			local23 = new int[this.anIntArray346[arg0]];
			@Pc(33) int local33 = 0;
			while (local33 < local23.length) {
				local23[local33] = local33++;
			}
		}
		return local23;
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(BI)[B")
	public final byte[] method3260(@OriginalArg(1) int arg0) {
		if (this.anIntArray348.length == 1) {
			return this.method3265(0, arg0);
		} else if (!this.method3267(arg0)) {
			return null;
		} else if (this.anIntArray348[arg0] == 1) {
			return this.method3265(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "(II)V")
	public final void method3261(@OriginalArg(1) int arg0) {
		if (this.method3267(arg0)) {
			this.anObjectArrayArray2[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lclient!vd;IB)I")
	public final int method3262(@OriginalArg(0) Class92 arg0, @OriginalArg(1) int arg1) {
		if (this.method3267(arg1)) {
			@Pc(20) Class92 local20 = arg0.method3220();
			@Pc(30) int local30 = this.aClass37Array2[arg1].method1004(local20.method3210());
			return this.method3274(local30, arg1) ? local30 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(ILclient!vd;)V")
	public final void method3264(@OriginalArg(1) Class92 arg0) {
		@Pc(9) Class92 local9 = arg0.method3220();
		@Pc(17) int local17 = this.aClass37_2.method1004(local9.method3210());
		this.method3256(local17);
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(III)[B")
	public final byte[] method3265(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.method3248(null, arg1, arg0);
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)I")
	public final int method3266() {
		return this.anIntArray348.length;
	}

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "(II)Z")
	protected final boolean method3267(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && this.anIntArray348.length > arg0 && this.anIntArray348[arg0] != 0) {
			return true;
		} else if (Static18.aBoolean37) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ab", name = "e", descriptor = "(II)V")
	protected void method3268(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(II[I)Z")
	private boolean method3269(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		if (!this.method3267(arg0)) {
			return false;
		} else if (this.anObjectArray29[arg0] == null) {
			return false;
		} else {
			@Pc(26) int local26 = this.anIntArray346[arg0];
			@Pc(31) int[] local31 = this.anIntArrayArray29[arg0];
			if (this.anObjectArrayArray2[arg0] == null) {
				this.anObjectArrayArray2[arg0] = new Object[this.anIntArray348[arg0]];
			}
			@Pc(50) Object[] local50 = this.anObjectArrayArray2[arg0];
			@Pc(52) boolean local52 = true;
			for (@Pc(54) int local54 = 0; local54 < local26; local54++) {
				@Pc(62) int local62;
				if (local31 == null) {
					local62 = local54;
				} else {
					local62 = local31[local54];
				}
				if (local50[local62] == null) {
					local52 = false;
					break;
				}
			}
			if (local52) {
				return true;
			}
			@Pc(114) byte[] local114;
			if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
				local114 = Static189.method3110(false, this.anObjectArray29[arg0]);
			} else {
				local114 = Static189.method3110(true, this.anObjectArray29[arg0]);
				@Pc(129) Class1_Sub14 local129 = new Class1_Sub14(local114);
				local129.method3021(arg1, local129.aByteArray49.length);
			}
			@Pc(143) byte[] local143;
			try {
				local143 = Static68.method1066(local114);
			} catch (@Pc(145) RuntimeException local145) {
				throw Static178.method2905(local145, "T3 - " + (arg1 != null) + "," + arg0 + "," + local114.length + "," + Static201.method3329(local114, local114.length) + "," + Static201.method3329(local114, local114.length - 2) + "," + this.anIntArray347[arg0] + "," + this.anInt4310);
			}
			if (this.aBoolean232) {
				this.anObjectArray29[arg0] = null;
			}
			@Pc(215) int local215;
			if (local26 <= 1) {
				if (local31 == null) {
					local215 = 0;
				} else {
					local215 = local31[0];
				}
				if (this.aBoolean233) {
					local50[local215] = local143;
				} else {
					local50[local215] = Static14.method256(local143);
				}
			} else {
				local215 = local143.length;
				local215--;
				@Pc(247) int local247 = local143[local215] & 0xFF;
				@Pc(252) Class1_Sub14 local252 = new Class1_Sub14(local143);
				local215 -= local26 * local247 * 4;
				local252.anInt4061 = local215;
				@Pc(266) int[] local266 = new int[local26];
				@Pc(274) int local274;
				for (@Pc(268) int local268 = 0; local268 < local247; local268++) {
					@Pc(272) int local272 = 0;
					for (local274 = 0; local274 < local26; local274++) {
						local272 += local252.method3058();
						local266[local274] += local272;
					}
				}
				@Pc(304) byte[][] local304 = new byte[local26][];
				for (local274 = 0; local274 < local26; local274++) {
					local304[local274] = new byte[local266[local274]];
					local266[local274] = 0;
				}
				@Pc(329) int local329 = 0;
				local252.anInt4061 = local215;
				@Pc(338) int local338;
				@Pc(340) int local340;
				for (@Pc(334) int local334 = 0; local334 < local247; local334++) {
					local338 = 0;
					for (local340 = 0; local340 < local26; local340++) {
						local338 += local252.method3058();
						Static216.method2200(local143, local329, local304[local340], local266[local340], local338);
						local266[local340] += local338;
						local329 += local338;
					}
				}
				for (local338 = 0; local338 < local26; local338++) {
					if (local31 == null) {
						local340 = local338;
					} else {
						local340 = local31[local338];
					}
					if (this.aBoolean233) {
						local50[local340] = local304[local338];
					} else {
						local50[local340] = Static14.method256(local304[local338]);
					}
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!ab", name = "f", descriptor = "(II)I")
	public final int method3270(@OriginalArg(1) int arg0) {
		return this.method3267(arg0) ? this.anIntArray348[arg0] : 0;
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(B)V")
	public final void method3271() {
		for (@Pc(9) int local9 = 0; local9 < this.anObjectArrayArray2.length; local9++) {
			this.anObjectArrayArray2[local9] = null;
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(BLclient!vd;Lclient!vd;)Z")
	public final boolean method3272(@OriginalArg(1) Class92 arg0, @OriginalArg(2) Class92 arg1) {
		@Pc(3) Class92 local3 = arg0.method3220();
		@Pc(19) Class92 local19 = arg1.method3220();
		@Pc(27) int local27 = this.aClass37_2.method1004(local3.method3210());
		if (this.method3267(local27)) {
			@Pc(44) int local44 = this.aClass37Array2[local27].method1004(local19.method3210());
			return this.method3247(local44, local27);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ab", name = "g", descriptor = "(II)Z")
	public final boolean method3273(@OriginalArg(1) int arg0) {
		if (!this.method3267(arg0)) {
			return false;
		} else if (this.anObjectArray29[arg0] == null) {
			this.method3268(arg0);
			return this.anObjectArray29[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(III)Z")
	private boolean method3274(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 >= 0 && arg0 >= 0 && arg1 < this.anIntArray348.length && this.anIntArray348[arg1] > arg0) {
			return true;
		} else if (Static18.aBoolean37) {
			throw new IllegalArgumentException(arg1 + "," + arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "(III)[B")
	public final byte[] method3275(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method3274(arg0, arg1)) {
			return null;
		}
		if (this.anObjectArrayArray2[arg1] == null || this.anObjectArrayArray2[arg1][arg0] == null) {
			@Pc(31) boolean local31 = this.method3269(arg1, null);
			if (!local31) {
				this.method3268(arg1);
				local31 = this.method3269(arg1, null);
				if (!local31) {
					return null;
				}
			}
		}
		return Static189.method3110(false, this.anObjectArrayArray2[arg1][arg0]);
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(ZZZ)V")
	public final void method3276(@OriginalArg(2) boolean arg0) {
		this.anIntArrayArray30 = null;
		this.aClass37Array2 = null;
		if (arg0) {
			this.aClass37_2 = null;
			this.anIntArray349 = null;
		}
	}

	@OriginalMember(owner = "client!ab", name = "h", descriptor = "(II)I")
	protected int method3277(@OriginalArg(1) int arg0) {
		if (this.method3267(arg0)) {
			return this.anObjectArray29[arg0] == null ? 0 : 100;
		} else {
			return 0;
		}
	}
}
