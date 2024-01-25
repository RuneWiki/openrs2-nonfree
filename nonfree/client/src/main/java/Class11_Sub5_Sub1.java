import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lm")
public final class Class11_Sub5_Sub1 extends Class11_Sub5 implements Interface4 {

	@OriginalMember(owner = "client!lm", name = "o", descriptor = "Z")
	private boolean aBoolean281;

	@OriginalMember(owner = "client!lm", name = "P", descriptor = "Z")
	private final boolean aBoolean284;

	@OriginalMember(owner = "client!lm", name = "v", descriptor = "B")
	private final byte aByte27;

	@OriginalMember(owner = "client!lm", name = "t", descriptor = "S")
	private final short aShort49;

	@OriginalMember(owner = "client!lm", name = "s", descriptor = "B")
	private final byte aByte26;

	@OriginalMember(owner = "client!lm", name = "w", descriptor = "Z")
	private final boolean aBoolean282;

	@OriginalMember(owner = "client!lm", name = "n", descriptor = "B")
	private final byte aByte25;

	@OriginalMember(owner = "client!lm", name = "D", descriptor = "Z")
	private final boolean aBoolean283;

	@OriginalMember(owner = "client!lm", name = "u", descriptor = "Lclient!bi;")
	public Class3 aClass3_1;

	@OriginalMember(owner = "client!lm", name = "Q", descriptor = "Lclient!qh;")
	private Class1_Sub4_Sub4 aClass1_Sub4_Sub4_1;

	static {
		new Class106("Now talking in clan channel of player: ", "Clanchat dieses Spieler beigetreten: ", "Vous participez actuellement au canal de clan du joueur : ", "Falando no canal do clã do jogador: ");
	}

	@OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lclient!fp;Lclient!gn;IIIIZIIZ)V")
	public Class11_Sub5_Sub1(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class71 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg3, arg4, arg5, Static281.method5012(arg7, arg8));
		this.aBoolean281 = arg9;
		super.anInt5141 = (short) arg5;
		super.anInt5140 = (short) arg3;
		this.aBoolean284 = arg1.anInt2377 != 0 && !arg6;
		this.aByte27 = (byte) arg7;
		this.aShort49 = (short) arg1.anInt2365;
		this.aByte26 = (byte) arg2;
		this.aBoolean282 = arg6;
		this.aByte25 = (byte) arg8;
		this.aBoolean283 = arg0.method4583() && arg1.aBoolean165 && !this.aBoolean282 && Static218.anInt4352 != 0;
		@Pc(67) int local67 = 1024;
		if (this.aBoolean281) {
			local67 |= 0x8000;
		}
		@Pc(82) Class221 local82 = this.method3505(this.aBoolean283, local67, arg0);
		if (local82 != null) {
			this.aClass3_1 = local82.aClass3_7;
			this.aClass1_Sub4_Sub4_1 = local82.aClass1_Sub4_Sub4_6;
			if (this.aBoolean281) {
				this.aClass3_1 = this.aClass3_1.method1261((byte) 0, local67, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5924() {
		return this.aBoolean283;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lclient!fp;II)Lclient!bi;")
	@Override
	public Class3 method5921(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1) {
		return this.method3503(arg1, arg0);
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IILclient!fp;)Lclient!bi;")
	private Class3 method3503(@OriginalArg(0) int arg0, @OriginalArg(2) Class63 arg1) {
		if (this.aClass3_1 != null && arg1.method4574(this.aClass3_1.method1256(), arg0) == 0) {
			return this.aClass3_1;
		} else {
			@Pc(26) Class221 local26 = this.method3505(false, arg0, arg1);
			return local26 == null ? null : local26.aClass3_7;
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(B)I")
	@Override
	public int method5927() {
		return this.aShort49 & 0xFFFF;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)I")
	@Override
	public int method5922() {
		return this.aByte25;
	}

	@OriginalMember(owner = "client!lm", name = "d", descriptor = "(I)V")
	@Override
	public void method5911() {
		this.aBoolean281 = false;
		if (this.aClass3_1 != null) {
			this.aClass3_1.method1270(this.aClass3_1.method1256() & 0xFFFF7FFF);
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(ILclient!fp;)Lclient!uq;")
	@Override
	public Class32_Sub7 method5909(@OriginalArg(1) Class63 arg0) {
		if (this.aClass3_1 == null) {
			return null;
		}
		@Pc(11) Class129 local11 = arg0.method4634();
		local11.method5774(super.anInt5140, super.anInt5142, super.anInt5141);
		@Pc(27) Class32_Sub7 local27 = null;
		if (this.aBoolean284) {
			local27 = Static67.method1550(1);
		}
		this.aClass3_1.method1242(local11, local27 == null ? null : local27.aClass32_Sub4Array1[0], 0);
		return local27;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(ZIBLclient!fp;)Lclient!wk;")
	private Class221 method3505(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class63 arg2) {
		@Pc(12) Class71 local12 = Static219.method4081(this.aShort49 & 0xFFFF);
		@Pc(20) Class36 local20;
		@Pc(24) Class36 local24;
		if (this.aBoolean282) {
			local20 = Static200.aClass36Array4[this.aByte26];
			local24 = Static50.aClass36Array3[0];
		} else {
			if (this.aByte26 < 3) {
				local24 = Static50.aClass36Array3[this.aByte26 + 1];
			} else {
				local24 = null;
			}
			local20 = Static50.aClass36Array3[this.aByte26];
		}
		return local12.method2280(local24, super.anInt5141, super.anInt5140, this.aByte27, arg0, super.anInt5142, arg2, arg1, local20, this.aByte25);
	}

	@OriginalMember(owner = "client!lm", name = "c", descriptor = "(I)I")
	@Override
	public int method5925() {
		return this.aByte27;
	}

	@OriginalMember(owner = "client!lm", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method5913() {
		return this.aBoolean281;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lclient!fp;III)Z")
	@Override
	public boolean method5914(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class3 local9 = this.method3503(65536, arg0);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class129 local14 = arg0.method4634();
			local14.method5774(super.anInt5140, super.anInt5142, super.anInt5141);
			return local9.method1283(arg2, arg1, local14, false);
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lclient!fp;Lclient!je;ZIIII)V")
	@Override
	public void method5915(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (arg1 instanceof Class11_Sub5_Sub1) {
			@Pc(9) Class11_Sub5_Sub1 local9 = (Class11_Sub5_Sub1) arg1;
			if (this.aClass3_1 != null && local9.aClass3_1 != null) {
				this.aClass3_1.method1258(local9.aClass3_1, arg4, arg3, arg5, arg2);
			}
		} else if (arg1 instanceof Class11_Sub2_Sub3) {
			@Pc(32) Class11_Sub2_Sub3 local32 = (Class11_Sub2_Sub3) arg1;
			if (this.aClass3_1 != null && local32.aClass3_3 != null) {
				this.aClass3_1.method1258(local32.aClass3_3, arg4, arg3, arg5, arg2);
			}
		}
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(ILclient!fp;)V")
	@Override
	public void method5912(@OriginalArg(1) Class63 arg0) {
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lclient!fp;Z)V")
	@Override
	public void method5920(@OriginalArg(0) Class63 arg0) {
		@Pc(30) Class1_Sub4_Sub4 local30;
		if (this.aClass1_Sub4_Sub4_1 == null && this.aBoolean283) {
			@Pc(23) Class221 local23 = this.method3505(true, 131072, arg0);
			local30 = local23 == null ? null : local23.aClass1_Sub4_Sub4_6;
		} else {
			local30 = this.aClass1_Sub4_Sub4_1;
			this.aClass1_Sub4_Sub4_1 = null;
		}
		if (local30 != null) {
			Static38.method932(local30, this.aByte26, super.anInt5140, super.anInt5141, null);
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lclient!fp;I)V")
	@Override
	public void method5926(@OriginalArg(0) Class63 arg0) {
		@Pc(14) Class1_Sub4_Sub4 local14;
		if (this.aClass1_Sub4_Sub4_1 == null && this.aBoolean283) {
			@Pc(25) Class221 local25 = this.method3505(true, 131072, arg0);
			local14 = local25 == null ? null : local25.aClass1_Sub4_Sub4_6;
		} else {
			local14 = this.aClass1_Sub4_Sub4_1;
			this.aClass1_Sub4_Sub4_1 = null;
		}
		if (local14 != null) {
			Static150.method4953(local14, this.aByte26, super.anInt5140, super.anInt5141, null);
		}
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(I)V")
	@Override
	public void method5923() {
		if (this.aClass3_1 != null) {
			this.aClass3_1.method1243();
		}
	}
}
