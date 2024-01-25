import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dj")
public final class Class47_Sub2_Sub1 extends Class47_Sub2 implements Interface11 {

	@OriginalMember(owner = "client!dj", name = "W", descriptor = "Z")
	private final boolean aBoolean117;

	@OriginalMember(owner = "client!dj", name = "T", descriptor = "Z")
	private final boolean aBoolean116;

	@OriginalMember(owner = "client!dj", name = "Q", descriptor = "Z")
	private boolean aBoolean115;

	@OriginalMember(owner = "client!dj", name = "V", descriptor = "S")
	private final short aShort18;

	@OriginalMember(owner = "client!dj", name = "E", descriptor = "B")
	private final byte aByte15;

	@OriginalMember(owner = "client!dj", name = "Z", descriptor = "B")
	private final byte aByte17;

	@OriginalMember(owner = "client!dj", name = "N", descriptor = "B")
	private final byte aByte16;

	@OriginalMember(owner = "client!dj", name = "K", descriptor = "Z")
	private final boolean aBoolean114;

	@OriginalMember(owner = "client!dj", name = "D", descriptor = "Lclient!c;")
	public Class37 aClass37_3;

	@OriginalMember(owner = "client!dj", name = "w", descriptor = "Lclient!j;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_2;

	@OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(Lclient!qa;Lclient!bo;IIIIZIIZ)V")
	public Class47_Sub2_Sub1(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class29 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg3, arg4, arg5, Static177.method2861(arg8, arg7));
		this.aBoolean117 = arg1.anInt550 != 0 && !arg6;
		super.anInt7431 = arg5;
		this.aBoolean116 = arg6;
		this.aBoolean115 = arg9;
		this.aShort18 = (short) arg1.anInt545;
		this.aByte15 = (byte) arg8;
		super.anInt7430 = arg3;
		this.aByte17 = (byte) arg2;
		this.aByte16 = (byte) arg7;
		this.aBoolean114 = arg0.method4638() && arg1.aBoolean44 && !this.aBoolean116 && Static327.aClass230_Sub1_1.method5636(Static146.anInt2664) != 0;
		@Pc(71) int local71 = 2048;
		if (this.aBoolean115) {
			local71 |= 0x10000;
		}
		@Pc(86) Class209 local86 = this.method1096(this.aBoolean114, arg0, local71);
		if (local86 != null) {
			this.aClass37_3 = local86.aClass37_6;
			this.aClass1_Sub1_Sub3_2 = local86.aClass1_Sub1_Sub3_5;
			if (this.aBoolean115) {
				this.aClass37_3 = this.aClass37_3.method4155((byte) 0, local71, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!dj", name = "c", descriptor = "(I)V")
	@Override
	public void method5745() {
		if (this.aClass37_3 != null) {
			this.aClass37_3.method4158();
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IILclient!qa;IZLclient!ha;I)V")
	@Override
	public void method5733(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class121 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class47 arg4, @OriginalArg(6) int arg5) {
		if (arg4 instanceof Class47_Sub2_Sub1) {
			@Pc(36) Class47_Sub2_Sub1 local36 = (Class47_Sub2_Sub1) arg4;
			if (this.aClass37_3 == null || local36.aClass37_3 == null) {
				return;
			}
			this.aClass37_3.method4165(local36.aClass37_3, arg1, arg0, arg5, arg3);
		} else if (arg4 instanceof Class47_Sub1_Sub2) {
			@Pc(17) Class47_Sub1_Sub2 local17 = (Class47_Sub1_Sub2) arg4;
			if (this.aClass37_3 != null && local17.aClass37_2 != null) {
				this.aClass37_3.method4165(local17.aClass37_2, arg1, arg0, arg5, arg3);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!dj", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5725() {
		return this.aBoolean115;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Z)I")
	@Override
	public int method5747() {
		return this.aByte16;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5740() {
		return this.aBoolean114;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILclient!qa;)Lclient!bw;")
	@Override
	public Class36_Sub1 method5734(@OriginalArg(1) Class121 arg0) {
		if (this.aClass37_3 == null) {
			return null;
		}
		@Pc(16) Class43 local16 = arg0.method4588();
		local16.R(super.anInt7430, super.anInt7432, super.anInt7431);
		@Pc(26) Class36_Sub1 local26 = null;
		if (this.aBoolean117) {
			local26 = Static309.method4241(1);
		}
		this.aClass37_3.method4167(local16, local26 == null ? null : local26.aClass36_Sub8Array1[0], 0);
		return local26;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILclient!qa;I)Lclient!c;")
	private Class37 method1095(@OriginalArg(0) int arg0, @OriginalArg(1) Class121 arg1) {
		if (this.aClass37_3 != null && arg1.method4634(this.aClass37_3.n(), arg0) == 0) {
			return this.aClass37_3;
		} else {
			@Pc(27) Class209 local27 = this.method1096(false, arg1, arg0);
			return local27 == null ? null : local27.aClass37_6;
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(ZLclient!qa;II)Lclient!rl;")
	private Class209 method1096(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class121 arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class29 local13 = Static251.aClass207_2.method4977(this.aShort18 & 0xFFFF);
		@Pc(31) Class70 local31;
		@Pc(26) Class70 local26;
		if (this.aBoolean116) {
			local26 = Static60.aClass70Array1[0];
			local31 = Static315.aClass70Array3[this.aByte17];
		} else {
			local31 = Static60.aClass70Array1[this.aByte17];
			if (this.aByte17 < 3) {
				local26 = Static60.aClass70Array1[this.aByte17 + 1];
			} else {
				local26 = null;
			}
		}
		return local13.method464(arg1, local26, super.anInt7432, this.aByte16, super.anInt7430, this.aByte15, arg0, super.anInt7431, arg2, local31);
	}

	@OriginalMember(owner = "client!dj", name = "c", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method5732(@OriginalArg(0) Class121 arg0) {
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)I")
	@Override
	public int method5744() {
		return this.aShort18 & 0xFFFF;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method5741(@OriginalArg(0) Class121 arg0) {
		@Pc(18) Class1_Sub1_Sub3 local18;
		if (this.aClass1_Sub1_Sub3_2 == null && this.aBoolean114) {
			@Pc(29) Class209 local29 = this.method1096(true, arg0, 262144);
			local18 = local29 == null ? null : local29.aClass1_Sub1_Sub3_5;
		} else {
			local18 = this.aClass1_Sub1_Sub3_2;
			this.aClass1_Sub1_Sub3_2 = null;
		}
		if (local18 != null) {
			Static317.method4368(local18, this.aByte17, super.anInt7430, super.anInt7431, null);
		}
	}

	@OriginalMember(owner = "client!dj", name = "d", descriptor = "(I)V")
	@Override
	public void method5723() {
		this.aBoolean115 = false;
		if (this.aClass37_3 != null) {
			this.aClass37_3.u(this.aClass37_3.n() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "(I)I")
	@Override
	public int method5742() {
		return this.aByte15;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIILclient!qa;)Z")
	@Override
	public boolean method5727(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class121 arg2) {
		@Pc(16) Class37 local16 = this.method1095(131072, arg2);
		if (local16 == null) {
			return false;
		} else {
			@Pc(21) Class43 local21 = arg2.method4588();
			local21.R(super.anInt7430, super.anInt7432, super.anInt7431);
			return local16.method4166(arg1, arg0, local21, false);
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IILclient!qa;)Lclient!c;")
	@Override
	public Class37 method5746(@OriginalArg(1) int arg0, @OriginalArg(2) Class121 arg1) {
		return this.method1095(arg0, arg1);
	}

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method5743(@OriginalArg(0) Class121 arg0) {
		@Pc(31) Class1_Sub1_Sub3 local31;
		if (this.aClass1_Sub1_Sub3_2 == null && this.aBoolean114) {
			@Pc(24) Class209 local24 = this.method1096(true, arg0, 262144);
			local31 = local24 == null ? null : local24.aClass1_Sub1_Sub3_5;
		} else {
			local31 = this.aClass1_Sub1_Sub3_2;
			this.aClass1_Sub1_Sub3_2 = null;
		}
		if (local31 != null) {
			Static1.method23(local31, this.aByte17, super.anInt7430, super.anInt7431, null);
		}
	}
}
