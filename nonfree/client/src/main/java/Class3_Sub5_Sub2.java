import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uk")
public final class Class3_Sub5_Sub2 extends Class3_Sub5 implements Interface10 {

	@OriginalMember(owner = "client!uk", name = "C", descriptor = "Z")
	private boolean aBoolean460;

	@OriginalMember(owner = "client!uk", name = "D", descriptor = "B")
	private final byte aByte99;

	@OriginalMember(owner = "client!uk", name = "X", descriptor = "B")
	private final byte aByte100;

	@OriginalMember(owner = "client!uk", name = "O", descriptor = "S")
	private final short aShort99;

	@OriginalMember(owner = "client!uk", name = "x", descriptor = "Z")
	private final boolean aBoolean459;

	@OriginalMember(owner = "client!uk", name = "E", descriptor = "Z")
	private final boolean aBoolean461;

	@OriginalMember(owner = "client!uk", name = "G", descriptor = "Z")
	private final boolean aBoolean462;

	@OriginalMember(owner = "client!uk", name = "L", descriptor = "Lclient!h;")
	private Class6_Sub1_Sub8 aClass6_Sub1_Sub8_6;

	@OriginalMember(owner = "client!uk", name = "P", descriptor = "Lclient!cd;")
	private Class39 aClass39_7;

	@OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Lclient!qq;Lclient!in;IIIIZIZ)V")
	public Class3_Sub5_Sub2(@OriginalArg(0) Class28 arg0, @OriginalArg(1) Class118 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg3, arg4, arg5, arg1.aBoolean211, arg1.aBoolean209);
		this.aBoolean460 = arg8;
		this.aByte99 = (byte) arg2;
		this.aByte100 = (byte) arg7;
		super.anInt7084 = arg3;
		this.aShort99 = (short) arg1.anInt3021;
		super.anInt7088 = arg5;
		this.aBoolean459 = arg6;
		this.aBoolean461 = arg1.anInt2984 != 0 && !arg6;
		this.aBoolean462 = arg0.method3522() && arg1.aBoolean212 && !this.aBoolean459 && Static8.aClass173_Sub1_1.anInt4420 != 0;
		@Pc(65) int local65 = 2048;
		if (this.aBoolean460) {
			local65 |= 0x10000;
		}
		@Pc(80) Class51 local80 = this.method5557(this.aBoolean462, local65, arg0);
		if (local80 != null) {
			this.aClass6_Sub1_Sub8_6 = local80.aClass6_Sub1_Sub8_3;
			this.aClass39_7 = local80.aClass39_3;
			if (this.aBoolean460) {
				this.aClass39_7 = this.aClass39_7.method4863((byte) 0, local65, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!uk", name = "c", descriptor = "(I)I")
	@Override
	public int method5811() {
		return this.aByte100;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(ZLclient!qq;)V")
	@Override
	public void method5809(@OriginalArg(1) Class28 arg0) {
		@Pc(31) Class6_Sub1_Sub8 local31;
		if (this.aClass6_Sub1_Sub8_6 == null && this.aBoolean462) {
			@Pc(24) Class51 local24 = this.method5557(true, 262144, arg0);
			local31 = local24 == null ? null : local24.aClass6_Sub1_Sub8_3;
		} else {
			local31 = this.aClass6_Sub1_Sub8_6;
			this.aClass6_Sub1_Sub8_6 = null;
		}
		if (local31 != null) {
			Static441.method5932(local31, this.aByte99, super.anInt7084, super.anInt7088, null);
		}
	}

	@OriginalMember(owner = "client!uk", name = "e", descriptor = "(I)V")
	@Override
	public void method5798() {
		this.aBoolean460 = false;
		if (this.aClass39_7 != null) {
			this.aClass39_7.method4891(this.aClass39_7.method4900() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "(ZLclient!qq;)V")
	@Override
	public void method5792(@OriginalArg(1) Class28 arg0) {
	}

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)V")
	@Override
	public void method5810() {
		if (this.aClass39_7 != null) {
			this.aClass39_7.method4887();
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(BLclient!qq;)Lclient!km;")
	@Override
	public Class48_Sub6 method5790(@OriginalArg(1) Class28 arg0) {
		if (this.aClass39_7 == null) {
			return null;
		}
		@Pc(18) Class132 local18 = arg0.method3564();
		local18.method3986(super.anInt7084, super.anInt7091, super.anInt7088);
		@Pc(28) Class48_Sub6 local28 = null;
		if (this.aBoolean461) {
			local28 = Static403.method5489(1);
		}
		this.aClass39_7.method4910(local18, local28 == null ? null : local28.aClass48_Sub7Array1[0], 0);
		return local28;
	}

	@OriginalMember(owner = "client!uk", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5791() {
		return this.aBoolean460;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IILclient!qq;)Lclient!cd;")
	private Class39 method5555(@OriginalArg(0) int arg0, @OriginalArg(2) Class28 arg1) {
		if (this.aClass39_7 != null && arg1.method3532(this.aClass39_7.method4900(), arg0) == 0) {
			return this.aClass39_7;
		} else {
			@Pc(29) Class51 local29 = this.method5557(false, arg0, arg1);
			return local29 == null ? null : local29.aClass39_3;
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(ILclient!qq;Lclient!ps;ZZII)V")
	@Override
	public void method5794(@OriginalArg(0) int arg0, @OriginalArg(1) Class28 arg1, @OriginalArg(2) Class3 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg2 instanceof Class3_Sub5_Sub2) {
			@Pc(5) Class3_Sub5_Sub2 local5 = (Class3_Sub5_Sub2) arg2;
			if (this.aClass39_7 != null && local5.aClass39_7 != null) {
				this.aClass39_7.method4895(local5.aClass39_7, arg5, arg0, arg4, arg3);
			}
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(ZIBLclient!qq;)Lclient!di;")
	private Class51 method5557(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class28 arg2) {
		@Pc(19) Class118 local19 = Static113.aClass127_2.method2820(this.aShort99 & 0xFFFF);
		@Pc(31) Class84 local31;
		@Pc(26) Class84 local26;
		if (this.aBoolean459) {
			local26 = Static93.aClass84Array1[0];
			local31 = Static365.aClass84Array3[this.aByte99];
		} else {
			if (this.aByte99 < 3) {
				local26 = Static93.aClass84Array1[this.aByte99 + 1];
			} else {
				local26 = null;
			}
			local31 = Static93.aClass84Array1[this.aByte99];
		}
		return local19.method2716(this.aByte100, super.anInt7088, super.anInt7084, local26, super.anInt7091, arg1, 22, arg2, local31, arg0);
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lclient!qq;BII)Z")
	@Override
	public boolean method5797(@OriginalArg(0) Class28 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) Class39 local15 = this.method5555(131072, arg0);
		if (local15 == null) {
			return false;
		} else {
			@Pc(20) Class132 local20 = arg0.method3564();
			local20.method3986(super.anInt7084, super.anInt7091, super.anInt7088);
			return local15.method4888(arg1, arg2, local20, false);
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(B)I")
	@Override
	public int method5812() {
		return this.aShort99 & 0xFFFF;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Z)I")
	@Override
	public int method5807() {
		return 22;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lclient!qq;ZI)Lclient!cd;")
	@Override
	public Class39 method5808(@OriginalArg(0) Class28 arg0, @OriginalArg(2) int arg1) {
		return this.method5555(arg1, arg0);
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5806() {
		return this.aBoolean462;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lclient!qq;I)V")
	@Override
	public void method5813(@OriginalArg(0) Class28 arg0) {
		@Pc(19) Class6_Sub1_Sub8 local19;
		if (this.aClass6_Sub1_Sub8_6 == null && this.aBoolean462) {
			@Pc(30) Class51 local30 = this.method5557(true, 262144, arg0);
			local19 = local30 == null ? null : local30.aClass6_Sub1_Sub8_3;
		} else {
			local19 = this.aClass6_Sub1_Sub8_6;
			this.aClass6_Sub1_Sub8_6 = null;
		}
		if (local19 != null) {
			Static192.method3030(local19, this.aByte99, super.anInt7084, super.anInt7088, null);
		}
	}
}
