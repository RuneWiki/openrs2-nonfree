import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gm")
public final class Class3_Sub3_Sub1 extends Class3_Sub3 implements Interface10 {

	@OriginalMember(owner = "client!gm", name = "B", descriptor = "B")
	private final byte aByte25;

	@OriginalMember(owner = "client!gm", name = "R", descriptor = "B")
	private final byte aByte27;

	@OriginalMember(owner = "client!gm", name = "J", descriptor = "B")
	private final byte aByte26;

	@OriginalMember(owner = "client!gm", name = "Q", descriptor = "S")
	private final short aShort37;

	@OriginalMember(owner = "client!gm", name = "O", descriptor = "Z")
	private final boolean aBoolean174;

	@OriginalMember(owner = "client!gm", name = "v", descriptor = "Z")
	private boolean aBoolean171;

	@OriginalMember(owner = "client!gm", name = "G", descriptor = "Z")
	private final boolean aBoolean173;

	@OriginalMember(owner = "client!gm", name = "w", descriptor = "Z")
	private final boolean aBoolean172;

	@OriginalMember(owner = "client!gm", name = "H", descriptor = "Lclient!h;")
	private Class6_Sub1_Sub8 aClass6_Sub1_Sub8_4;

	@OriginalMember(owner = "client!gm", name = "E", descriptor = "Lclient!cd;")
	public Class39 aClass39_4;

	static {
		new Class231("Attempting to join channel...", "Chatraum wird betreten...", "Tentative de connexion au canal...", "Tentando acessar canal...");
	}

	@OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(Lclient!qq;Lclient!in;IIIIIZIIIIIIZ)V")
	public Class3_Sub3_Sub1(@OriginalArg(0) Class28 arg0, @OriginalArg(1) Class118 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt3023 == 1, Static92.method1591(arg12, arg13));
		this.aByte25 = (byte) arg3;
		this.aByte27 = (byte) arg12;
		this.aByte26 = (byte) arg13;
		this.aShort37 = (short) arg1.anInt3021;
		this.aBoolean174 = arg1.anInt2984 != 0 && !arg7;
		this.aBoolean171 = arg14;
		this.aBoolean173 = arg7;
		this.aBoolean172 = arg0.method3522() && arg1.aBoolean212 && !this.aBoolean173 && Static8.aClass173_Sub1_1.anInt4420 != 0;
		@Pc(80) int local80 = 2048;
		if (this.aBoolean171) {
			local80 |= 0x10000;
		}
		@Pc(95) Class51 local95 = this.method2133(local80, arg0, this.aBoolean172);
		if (local95 != null) {
			this.aClass6_Sub1_Sub8_4 = local95.aClass6_Sub1_Sub8_3;
			this.aClass39_4 = local95.aClass39_3;
			if (this.aBoolean171) {
				this.aClass39_4 = this.aClass39_4.method4863((byte) 0, local80, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(ILclient!qq;Lclient!ps;ZZII)V")
	@Override
	public void method5794(@OriginalArg(0) int arg0, @OriginalArg(1) Class28 arg1, @OriginalArg(2) Class3 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg2 instanceof Class3_Sub1_Sub1) {
			@Pc(32) Class3_Sub1_Sub1 local32 = (Class3_Sub1_Sub1) arg2;
			if (this.aClass39_4 != null && local32.aClass39_2 != null) {
				this.aClass39_4.method4895(local32.aClass39_2, arg5, arg0, arg4, arg3);
			}
		} else if (arg2 instanceof Class3_Sub3_Sub1) {
			@Pc(12) Class3_Sub3_Sub1 local12 = (Class3_Sub3_Sub1) arg2;
			if (this.aClass39_4 != null && local12.aClass39_4 != null) {
				this.aClass39_4.method4895(local12.aClass39_4, arg5, arg0, arg4, arg3);
			}
		}
	}

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "(I)V")
	@Override
	public void method5810() {
		if (this.aClass39_4 != null) {
			this.aClass39_4.method4887();
		}
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(Z)I")
	@Override
	public int method5807() {
		return this.aByte27;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(IZLclient!qq;Z)Lclient!di;")
	private Class51 method2133(@OriginalArg(0) int arg0, @OriginalArg(2) Class28 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(19) Class118 local19 = Static113.aClass127_2.method2820(this.aShort37 & 0xFFFF);
		@Pc(31) Class84 local31;
		@Pc(26) Class84 local26;
		if (this.aBoolean173) {
			local26 = Static93.aClass84Array1[0];
			local31 = Static365.aClass84Array3[this.aByte25];
		} else {
			local31 = Static93.aClass84Array1[this.aByte25];
			if (this.aByte25 >= 3) {
				local26 = null;
			} else {
				local26 = Static93.aClass84Array1[this.aByte25 + 1];
			}
		}
		return local19.method2716(this.aByte27 == 11 ? this.aByte26 + 4 : this.aByte26, super.anInt6677, super.anInt6675, local26, super.anInt6673, arg0, this.aByte27 == 11 ? 10 : this.aByte27, arg1, local31, arg2);
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lclient!qq;I)V")
	@Override
	public void method5813(@OriginalArg(0) Class28 arg0) {
		@Pc(31) Class6_Sub1_Sub8 local31;
		if (this.aClass6_Sub1_Sub8_4 == null && this.aBoolean172) {
			@Pc(24) Class51 local24 = this.method2133(262144, arg0, true);
			local31 = local24 == null ? null : local24.aClass6_Sub1_Sub8_3;
		} else {
			local31 = this.aClass6_Sub1_Sub8_4;
			this.aClass6_Sub1_Sub8_4 = null;
		}
		if (local31 != null) {
			Static192.method3030(local31, this.aByte25, super.anInt6675, super.anInt6677, null);
		}
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(B)I")
	@Override
	public int method5812() {
		return this.aShort37 & 0xFFFF;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(ZLclient!qq;)V")
	@Override
	public void method5809(@OriginalArg(1) Class28 arg0) {
		@Pc(21) Class6_Sub1_Sub8 local21;
		if (this.aClass6_Sub1_Sub8_4 == null && this.aBoolean172) {
			@Pc(36) Class51 local36 = this.method2133(262144, arg0, true);
			local21 = local36 == null ? null : local36.aClass6_Sub1_Sub8_3;
		} else {
			local21 = this.aClass6_Sub1_Sub8_4;
			this.aClass6_Sub1_Sub8_4 = null;
		}
		if (local21 != null) {
			Static441.method5932(local21, this.aByte25, super.anInt6675, super.anInt6677, null);
		}
	}

	@OriginalMember(owner = "client!gm", name = "e", descriptor = "(I)V")
	@Override
	public void method5798() {
		this.aBoolean171 = false;
		if (this.aClass39_4 != null) {
			this.aClass39_4.method4891(this.aClass39_4.method4900() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!gm", name = "i", descriptor = "(I)I")
	public int method2135() {
		return this.aClass39_4 == null ? 15 : this.aClass39_4.method4868() / 4;
	}

	@OriginalMember(owner = "client!gm", name = "g", descriptor = "(I)I")
	@Override
	public int method5503() {
		return this.aClass39_4 == null ? 0 : this.aClass39_4.method4875();
	}

	@OriginalMember(owner = "client!gm", name = "c", descriptor = "(I)I")
	@Override
	public int method5811() {
		return this.aByte26;
	}

	@OriginalMember(owner = "client!gm", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5791() {
		return this.aBoolean171;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(BLclient!qq;)Lclient!km;")
	@Override
	public Class48_Sub6 method5790(@OriginalArg(1) Class28 arg0) {
		if (this.aClass39_4 == null) {
			return null;
		}
		@Pc(17) Class132 local17 = arg0.method3564();
		local17.method3986(super.anInt6675, super.anInt6673, super.anInt6677);
		@Pc(27) Class48_Sub6 local27 = null;
		if (this.aBoolean174) {
			local27 = Static403.method5489(1);
		}
		this.aClass39_4.method4910(local17, local27 == null ? null : local27.aClass48_Sub7Array1[0], 0);
		return local27;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(ILclient!qq;I)Lclient!cd;")
	private Class39 method2137(@OriginalArg(0) int arg0, @OriginalArg(1) Class28 arg1) {
		if (this.aClass39_4 != null && arg1.method3532(this.aClass39_4.method4900(), arg0) == 0) {
			return this.aClass39_4;
		} else {
			@Pc(31) Class51 local31 = this.method2133(arg0, arg1, false);
			return local31 == null ? null : local31.aClass39_3;
		}
	}

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "(ZLclient!qq;)V")
	@Override
	public void method5792(@OriginalArg(1) Class28 arg0) {
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5806() {
		return this.aBoolean172;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lclient!qq;BII)Z")
	@Override
	public boolean method5797(@OriginalArg(0) Class28 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class39 local9 = this.method2137(131072, arg0);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class132 local14 = arg0.method3564();
			local14.method3986(super.anInt6675, super.anInt6673, super.anInt6677);
			return local9.method4888(arg1, arg2, local14, false);
		}
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lclient!qq;ZI)Lclient!cd;")
	@Override
	public Class39 method5808(@OriginalArg(0) Class28 arg0, @OriginalArg(2) int arg1) {
		return this.method2137(arg1, arg0);
	}
}
