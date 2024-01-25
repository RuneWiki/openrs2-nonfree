import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!no")
public final class Class11_Sub2_Sub3 extends Class11_Sub2 implements Interface4 {

	@OriginalMember(owner = "client!no", name = "lb", descriptor = "Lclient!ct;")
	public static Class30 lb;

	@OriginalMember(owner = "client!no", name = "Q", descriptor = "B")
	private final byte aByte32;

	@OriginalMember(owner = "client!no", name = "Z", descriptor = "B")
	private final byte aByte33;

	@OriginalMember(owner = "client!no", name = "S", descriptor = "Z")
	private final boolean aBoolean320;

	@OriginalMember(owner = "client!no", name = "E", descriptor = "B")
	private final byte aByte31;

	@OriginalMember(owner = "client!no", name = "L", descriptor = "S")
	private final short aShort59;

	@OriginalMember(owner = "client!no", name = "M", descriptor = "Z")
	private boolean aBoolean319;

	@OriginalMember(owner = "client!no", name = "H", descriptor = "Z")
	private final boolean aBoolean318;

	@OriginalMember(owner = "client!no", name = "ab", descriptor = "Z")
	private final boolean aBoolean321;

	@OriginalMember(owner = "client!no", name = "jb", descriptor = "Lclient!bi;")
	public Class3 aClass3_3;

	@OriginalMember(owner = "client!no", name = "I", descriptor = "Lclient!qh;")
	private Class1_Sub4_Sub4 aClass1_Sub4_Sub4_2;

	@OriginalMember(owner = "client!no", name = "<init>", descriptor = "(Lclient!fp;Lclient!gn;IIIIIZIIIIIIZ)V")
	public Class11_Sub2_Sub3(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class71 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt2409 == 1, Static224.method4158(arg13, arg12));
		this.aByte32 = (byte) arg12;
		this.aByte33 = (byte) arg3;
		this.aBoolean320 = arg1.anInt2377 != 0 && !arg7;
		this.aByte31 = (byte) arg13;
		this.aShort59 = (short) arg1.anInt2365;
		this.aBoolean319 = arg14;
		this.aBoolean318 = arg7;
		this.aBoolean321 = arg0.method4583() && arg1.aBoolean165 && !this.aBoolean318 && Static218.anInt4352 != 0;
		@Pc(73) int local73 = 1024;
		if (this.aBoolean319) {
			local73 |= 0x8000;
		}
		@Pc(88) Class221 local88 = this.method4014(arg0, this.aBoolean321, local73);
		if (local88 != null) {
			this.aClass3_3 = local88.aClass3_7;
			this.aClass1_Sub4_Sub4_2 = local88.aClass1_Sub4_Sub4_6;
			if (this.aBoolean319) {
				this.aClass3_3 = this.aClass3_3.method1261((byte) 0, local73, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Lclient!fp;Lclient!je;ZIIII)V")
	@Override
	public void method5915(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (arg1 instanceof Class11_Sub5_Sub1) {
			@Pc(5) Class11_Sub5_Sub1 local5 = (Class11_Sub5_Sub1) arg1;
			if (this.aClass3_3 != null && local5.aClass3_1 != null) {
				this.aClass3_3.method1258(local5.aClass3_1, arg4, arg3, arg5, arg2);
			}
		} else if (arg1 instanceof Class11_Sub2_Sub3) {
			@Pc(28) Class11_Sub2_Sub3 local28 = (Class11_Sub2_Sub3) arg1;
			if (this.aClass3_3 != null && local28.aClass3_3 != null) {
				this.aClass3_3.method1258(local28.aClass3_3, arg4, arg3, arg5, arg2);
			}
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(ILclient!fp;)Lclient!uq;")
	@Override
	public Class32_Sub7 method5909(@OriginalArg(1) Class63 arg0) {
		if (this.aClass3_3 == null) {
			return null;
		}
		@Pc(11) Class129 local11 = arg0.method4634();
		local11.method5774(super.anInt6729, super.anInt6727, super.anInt6726);
		@Pc(26) Class32_Sub7 local26 = null;
		if (this.aBoolean320) {
			local26 = Static67.method1550(1);
		}
		this.aClass3_3.method1242(local11, local26 == null ? null : local26.aClass32_Sub4Array1[0], 0);
		return local26;
	}

	@OriginalMember(owner = "client!no", name = "e", descriptor = "(I)I")
	public int method4009() {
		return this.aClass3_3 == null ? 15 : this.aClass3_3.method1255() / 4;
	}

	@OriginalMember(owner = "client!no", name = "b", descriptor = "(I)V")
	@Override
	public void method5923() {
		if (this.aClass3_3 != null) {
			this.aClass3_3.method1243();
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(ILclient!fp;Z)Lclient!bi;")
	private Class3 method4012(@OriginalArg(0) int arg0, @OriginalArg(1) Class63 arg1) {
		if (this.aClass3_3 != null && arg1.method4574(this.aClass3_3.method1256(), arg0) == 0) {
			return this.aClass3_3;
		} else {
			@Pc(23) Class221 local23 = this.method4014(arg1, false, arg0);
			return local23 == null ? null : local23.aClass3_7;
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(I)I")
	@Override
	public int method5922() {
		return this.aByte31;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Lclient!fp;Z)V")
	@Override
	public void method5920(@OriginalArg(0) Class63 arg0) {
		@Pc(30) Class1_Sub4_Sub4 local30;
		if (this.aClass1_Sub4_Sub4_2 == null && this.aBoolean321) {
			@Pc(23) Class221 local23 = this.method4014(arg0, true, 131072);
			local30 = local23 == null ? null : local23.aClass1_Sub4_Sub4_6;
		} else {
			local30 = this.aClass1_Sub4_Sub4_2;
			this.aClass1_Sub4_Sub4_2 = null;
		}
		if (local30 != null) {
			Static38.method932(local30, this.aByte33, super.anInt6729, super.anInt6726, null);
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Lclient!fp;I)V")
	@Override
	public void method5926(@OriginalArg(0) Class63 arg0) {
		@Pc(14) Class1_Sub4_Sub4 local14;
		if (this.aClass1_Sub4_Sub4_2 == null && this.aBoolean321) {
			@Pc(25) Class221 local25 = this.method4014(arg0, true, 131072);
			local14 = local25 == null ? null : local25.aClass1_Sub4_Sub4_6;
		} else {
			local14 = this.aClass1_Sub4_Sub4_2;
			this.aClass1_Sub4_Sub4_2 = null;
		}
		if (local14 != null) {
			Static150.method4953(local14, this.aByte33, super.anInt6729, super.anInt6726, null);
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Lclient!fp;II)Lclient!bi;")
	@Override
	public Class3 method5921(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1) {
		return this.method4012(arg1, arg0);
	}

	@OriginalMember(owner = "client!no", name = "d", descriptor = "(I)V")
	@Override
	public void method5911() {
		this.aBoolean319 = false;
		if (this.aClass3_3 != null) {
			this.aClass3_3.method1270(this.aClass3_3.method1256() & 0xFFFF7FFF);
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5924() {
		return this.aBoolean321;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Lclient!fp;III)Z")
	@Override
	public boolean method5914(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class3 local14 = this.method4012(65536, arg0);
		if (local14 == null) {
			return false;
		} else {
			@Pc(19) Class129 local19 = arg0.method4634();
			local19.method5774(super.anInt6729, super.anInt6727, super.anInt6726);
			return local14.method1283(arg2, arg1, local19, false);
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(B)I")
	@Override
	public int method5927() {
		return this.aShort59 & 0xFFFF;
	}

	@OriginalMember(owner = "client!no", name = "b", descriptor = "(ILclient!fp;)V")
	@Override
	public void method5912(@OriginalArg(1) Class63 arg0) {
	}

	@OriginalMember(owner = "client!no", name = "e", descriptor = "(B)I")
	@Override
	public int method5877() {
		return this.aClass3_3 == null ? 0 : this.aClass3_3.method1245();
	}

	@OriginalMember(owner = "client!no", name = "c", descriptor = "(I)I")
	@Override
	public int method5925() {
		return this.aByte32;
	}

	@OriginalMember(owner = "client!no", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method5913() {
		return this.aBoolean319;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(ILclient!fp;ZI)Lclient!wk;")
	private Class221 method4014(@OriginalArg(1) Class63 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(18) Class71 local18 = Static219.method4081(this.aShort59 & 0xFFFF);
		@Pc(30) Class36 local30;
		@Pc(25) Class36 local25;
		if (this.aBoolean318) {
			local25 = Static50.aClass36Array3[0];
			local30 = Static200.aClass36Array4[this.aByte33];
		} else {
			local30 = Static50.aClass36Array3[this.aByte33];
			if (this.aByte33 < 3) {
				local25 = Static50.aClass36Array3[this.aByte33 + 1];
			} else {
				local25 = null;
			}
		}
		return local18.method2280(local25, super.anInt6726, super.anInt6729, this.aByte32 == 11 ? 10 : this.aByte32, arg1, super.anInt6727, arg0, arg2, local30, this.aByte32 == 11 ? this.aByte31 + 4 : this.aByte31);
	}
}
