import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!d")
public final class Class3_Sub1_Sub1 extends Class3_Sub1 implements Interface10 {

	@OriginalMember(owner = "client!d", name = "S", descriptor = "B")
	private final byte aByte15;

	@OriginalMember(owner = "client!d", name = "Q", descriptor = "Z")
	private boolean aBoolean117;

	@OriginalMember(owner = "client!d", name = "C", descriptor = "Z")
	private final boolean aBoolean115;

	@OriginalMember(owner = "client!d", name = "O", descriptor = "S")
	private final short aShort9;

	@OriginalMember(owner = "client!d", name = "A", descriptor = "B")
	private final byte aByte14;

	@OriginalMember(owner = "client!d", name = "R", descriptor = "Z")
	private final boolean aBoolean118;

	@OriginalMember(owner = "client!d", name = "W", descriptor = "B")
	private final byte aByte16;

	@OriginalMember(owner = "client!d", name = "z", descriptor = "Z")
	private final boolean aBoolean114;

	@OriginalMember(owner = "client!d", name = "t", descriptor = "Lclient!h;")
	private Class6_Sub1_Sub8 aClass6_Sub1_Sub8_2;

	@OriginalMember(owner = "client!d", name = "F", descriptor = "Lclient!cd;")
	public Class39 aClass39_2;

	@OriginalMember(owner = "client!d", name = "<init>", descriptor = "(Lclient!qq;Lclient!in;IIIIZIIZ)V")
	public Class3_Sub1_Sub1(@OriginalArg(0) Class28 arg0, @OriginalArg(1) Class118 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg3, arg4, arg5, Static328.method4698(arg8, arg7));
		this.aByte15 = (byte) arg8;
		this.aBoolean117 = arg9;
		this.aBoolean115 = arg1.anInt2984 != 0 && !arg6;
		this.aShort9 = (short) arg1.anInt3021;
		super.anInt6327 = arg3;
		this.aByte14 = (byte) arg2;
		this.aBoolean118 = arg6;
		this.aByte16 = (byte) arg7;
		super.anInt6325 = arg5;
		this.aBoolean114 = arg0.method3522() && arg1.aBoolean212 && !this.aBoolean118 && Static8.aClass173_Sub1_1.anInt4420 != 0;
		@Pc(66) int local66 = 2048;
		if (this.aBoolean117) {
			local66 |= 0x10000;
		}
		@Pc(81) Class51 local81 = this.method1224(local66, arg0, this.aBoolean114);
		if (local81 != null) {
			this.aClass6_Sub1_Sub8_2 = local81.aClass6_Sub1_Sub8_3;
			this.aClass39_2 = local81.aClass39_3;
			if (this.aBoolean117) {
				this.aClass39_2 = this.aClass39_2.method4863((byte) 0, local66, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Z)I")
	@Override
	public int method5807() {
		return this.aByte16;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IILclient!qq;Z)Lclient!di;")
	private Class51 method1224(@OriginalArg(1) int arg0, @OriginalArg(2) Class28 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(19) Class118 local19 = Static113.aClass127_2.method2820(this.aShort9 & 0xFFFF);
		@Pc(27) Class84 local27;
		@Pc(31) Class84 local31;
		if (this.aBoolean118) {
			local27 = Static365.aClass84Array3[this.aByte14];
			local31 = Static93.aClass84Array1[0];
		} else {
			if (this.aByte14 >= 3) {
				local31 = null;
			} else {
				local31 = Static93.aClass84Array1[this.aByte14 + 1];
			}
			local27 = Static93.aClass84Array1[this.aByte14];
		}
		return local19.method2716(this.aByte15, super.anInt6325, super.anInt6327, local31, super.anInt6329, arg0, this.aByte16, arg1, local27, arg2);
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(ZLclient!qq;)V")
	@Override
	public void method5809(@OriginalArg(1) Class28 arg0) {
		@Pc(29) Class6_Sub1_Sub8 local29;
		if (this.aClass6_Sub1_Sub8_2 == null && this.aBoolean114) {
			@Pc(22) Class51 local22 = this.method1224(262144, arg0, true);
			local29 = local22 == null ? null : local22.aClass6_Sub1_Sub8_3;
		} else {
			local29 = this.aClass6_Sub1_Sub8_2;
			this.aClass6_Sub1_Sub8_2 = null;
		}
		if (local29 != null) {
			Static441.method5932(local29, this.aByte14, super.anInt6327, super.anInt6325, null);
		}
	}

	@OriginalMember(owner = "client!d", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5791() {
		return this.aBoolean117;
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(ZLclient!qq;)V")
	@Override
	public void method5792(@OriginalArg(1) Class28 arg0) {
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!qq;BII)Z")
	@Override
	public boolean method5797(@OriginalArg(0) Class28 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class39 local16 = this.method1230(131072, arg0);
		if (local16 == null) {
			return false;
		} else {
			@Pc(21) Class132 local21 = arg0.method3564();
			local21.method3986(super.anInt6327, super.anInt6329, super.anInt6325);
			return local16.method4888(arg1, arg2, local21, false);
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(ILclient!qq;Lclient!ps;ZZII)V")
	@Override
	public void method5794(@OriginalArg(0) int arg0, @OriginalArg(1) Class28 arg1, @OriginalArg(2) Class3 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg2 instanceof Class3_Sub1_Sub1) {
			@Pc(38) Class3_Sub1_Sub1 local38 = (Class3_Sub1_Sub1) arg2;
			if (this.aClass39_2 == null || local38.aClass39_2 == null) {
				return;
			}
			this.aClass39_2.method4895(local38.aClass39_2, arg5, arg0, arg4, arg3);
		} else if (arg2 instanceof Class3_Sub3_Sub1) {
			@Pc(19) Class3_Sub3_Sub1 local19 = (Class3_Sub3_Sub1) arg2;
			if (this.aClass39_2 != null && local19.aClass39_4 != null) {
				this.aClass39_2.method4895(local19.aClass39_4, arg5, arg0, arg4, arg3);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5806() {
		return this.aBoolean114;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(B)I")
	@Override
	public int method5812() {
		return this.aShort9 & 0xFFFF;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!qq;I)V")
	@Override
	public void method5813(@OriginalArg(0) Class28 arg0) {
		@Pc(21) Class6_Sub1_Sub8 local21;
		if (this.aClass6_Sub1_Sub8_2 == null && this.aBoolean114) {
			@Pc(34) Class51 local34 = this.method1224(262144, arg0, true);
			local21 = local34 == null ? null : local34.aClass6_Sub1_Sub8_3;
		} else {
			local21 = this.aClass6_Sub1_Sub8_2;
			this.aClass6_Sub1_Sub8_2 = null;
		}
		if (local21 != null) {
			Static192.method3030(local21, this.aByte14, super.anInt6327, super.anInt6325, null);
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!qq;ZI)Lclient!cd;")
	@Override
	public Class39 method5808(@OriginalArg(0) Class28 arg0, @OriginalArg(2) int arg1) {
		return this.method1230(arg1, arg0);
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(BLclient!qq;)Lclient!km;")
	@Override
	public Class48_Sub6 method5790(@OriginalArg(1) Class28 arg0) {
		if (this.aClass39_2 == null) {
			return null;
		}
		@Pc(16) Class132 local16 = arg0.method3564();
		local16.method3986(super.anInt6327, super.anInt6329, super.anInt6325);
		@Pc(26) Class48_Sub6 local26 = null;
		if (this.aBoolean115) {
			local26 = Static403.method5489(1);
		}
		this.aClass39_2.method4910(local16, local26 == null ? null : local26.aClass48_Sub7Array1[0], 0);
		return local26;
	}

	@OriginalMember(owner = "client!d", name = "e", descriptor = "(I)V")
	@Override
	public void method5798() {
		this.aBoolean117 = false;
		if (this.aClass39_2 != null) {
			this.aClass39_2.method4891(this.aClass39_2.method4900() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!d", name = "c", descriptor = "(I)I")
	@Override
	public int method5811() {
		return this.aByte15;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IILclient!qq;)Lclient!cd;")
	private Class39 method1230(@OriginalArg(1) int arg0, @OriginalArg(2) Class28 arg1) {
		if (this.aClass39_2 != null && arg1.method3532(this.aClass39_2.method4900(), arg0) == 0) {
			return this.aClass39_2;
		} else {
			@Pc(33) Class51 local33 = this.method1224(arg0, arg1, false);
			return local33 == null ? null : local33.aClass39_3;
		}
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(I)V")
	@Override
	public void method5810() {
		if (this.aClass39_2 != null) {
			this.aClass39_2.method4887();
		}
	}
}
