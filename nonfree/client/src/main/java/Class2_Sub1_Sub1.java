import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aba")
public final class Class2_Sub1_Sub1 extends Class2_Sub1 implements Interface22 {

	@OriginalMember(owner = "client!aba", name = "A", descriptor = "Lclient!cd;")
	private Class44 aClass44_1;

	@OriginalMember(owner = "client!aba", name = "T", descriptor = "B")
	private final byte aByte2;

	@OriginalMember(owner = "client!aba", name = "O", descriptor = "Z")
	private final boolean aBoolean12;

	@OriginalMember(owner = "client!aba", name = "z", descriptor = "B")
	private final byte aByte1;

	@OriginalMember(owner = "client!aba", name = "D", descriptor = "Z")
	private final boolean aBoolean11;

	@OriginalMember(owner = "client!aba", name = "E", descriptor = "S")
	private final short aShort3;

	@OriginalMember(owner = "client!aba", name = "V", descriptor = "Z")
	private boolean aBoolean13;

	@OriginalMember(owner = "client!aba", name = "q", descriptor = "Z")
	private final boolean aBoolean10;

	@OriginalMember(owner = "client!aba", name = "Y", descriptor = "Lclient!w;")
	private Class3_Sub4_Sub2 aClass3_Sub4_Sub2_1;

	@OriginalMember(owner = "client!aba", name = "y", descriptor = "Lclient!ba;")
	private Class21 aClass21_1;

	@OriginalMember(owner = "client!aba", name = "<init>", descriptor = "(Lclient!oa;Lclient!sa;IIIIZIZ)V")
	public Class2_Sub1_Sub1(@OriginalArg(0) Class15 arg0, @OriginalArg(1) Class292 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg3, arg4, arg5, arg1.anInt8784, arg1.aBoolean729, arg1.aBoolean728);
		this.aByte2 = (byte) arg2;
		this.aBoolean12 = arg1.anInt8778 != 0 && !arg6;
		this.aByte1 = (byte) arg7;
		super.anInt10403 = arg3;
		super.anInt10396 = arg5;
		this.aBoolean11 = arg6;
		this.aShort3 = (short) arg1.anInt8757;
		this.aBoolean13 = arg8;
		this.aBoolean10 = arg0.method5335() && arg1.aBoolean721 && !this.aBoolean11 && Static455.aClass3_Sub27_Sub1_1.method4035(Static275.anInt5823) != 0;
		@Pc(66) int local66 = 2048;
		if (this.aBoolean13) {
			local66 |= 0x10000;
		}
		@Pc(81) Class155 local81 = this.method128(this.aBoolean10, local66, arg0);
		if (local81 != null) {
			this.aClass3_Sub4_Sub2_1 = local81.aClass3_Sub4_Sub2_2;
			this.aClass21_1 = local81.aClass21_3;
			if (this.aBoolean13) {
				this.aClass21_1 = this.aClass21_1.method7131((byte) 0, local66, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(IILclient!oa;ILclient!cq;ZI)V")
	@Override
	public void method8387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2 arg4, @OriginalArg(5) boolean arg5) {
		if (arg4 instanceof Class2_Sub1_Sub1) {
			@Pc(17) Class2_Sub1_Sub1 local17 = (Class2_Sub1_Sub1) arg4;
			if (this.aClass21_1 != null && local17.aClass21_1 != null) {
				this.aClass21_1.method7147(local17.aClass21_1, arg3, arg1, arg0, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!aba", name = "b", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method8397(@OriginalArg(0) Class15 arg0) {
		@Pc(29) Class3_Sub4_Sub2 local29;
		if (this.aClass3_Sub4_Sub2_1 == null && this.aBoolean10) {
			@Pc(22) Class155 local22 = this.method128(true, 262144, arg0);
			local29 = local22 == null ? null : local22.aClass3_Sub4_Sub2_2;
		} else {
			local29 = this.aClass3_Sub4_Sub2_1;
			this.aClass3_Sub4_Sub2_1 = null;
		}
		if (local29 != null) {
			Static214.method3738(local29, this.aByte2, super.anInt10403, super.anInt10396, null);
		}
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(Lclient!oa;II)Lclient!ba;")
	@Override
	public Class21 method8400(@OriginalArg(0) Class15 arg0, @OriginalArg(1) int arg1) {
		return this.method129(arg0, arg1);
	}

	@OriginalMember(owner = "client!aba", name = "d", descriptor = "(B)V")
	@Override
	public void method8386() {
		this.aBoolean13 = false;
		if (this.aClass21_1 != null) {
			this.aClass21_1.ia(this.aClass21_1.h() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!aba", name = "c", descriptor = "(B)I")
	@Override
	public int method8399() {
		return 22;
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(Lclient!oa;B)Lclient!pl;")
	@Override
	public Class55_Sub6 method8382(@OriginalArg(0) Class15 arg0) {
		if (this.aClass21_1 == null) {
			return null;
		}
		@Pc(19) Class255 local19 = arg0.method5343();
		local19.GA(super.anInt10403, super.anInt10402, super.anInt10396);
		@Pc(29) Class55_Sub6 local29 = null;
		if (this.aBoolean12) {
			local29 = Static232.method3979(1);
		}
		this.aClass21_1.method7145(local19, local29 == null ? null : local29.aClass55_Sub3Array1[0], 0);
		return local29;
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(IILclient!oa;I)Z")
	@Override
	public boolean method8389(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15 arg2) {
		@Pc(21) Class21 local21 = this.method129(arg2, 131072);
		if (local21 == null) {
			return false;
		} else {
			@Pc(26) Class255 local26 = arg2.method5343();
			local26.GA(super.anInt10403, super.anInt10402, super.anInt10396);
			return local21.method7148(arg1, arg0, local26, false);
		}
	}

	@OriginalMember(owner = "client!aba", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method8388() {
		return this.aBoolean13;
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(Z)I")
	@Override
	public int method8402() {
		return this.aByte1;
	}

	@OriginalMember(owner = "client!aba", name = "d", descriptor = "(Lclient!oa;I)Lclient!cd;")
	@Override
	public Class44 method8385(@OriginalArg(0) Class15 arg0) {
		if (this.aClass44_1 == null) {
			this.aClass44_1 = Static5.method275(super.anInt10402, this.method129(arg0, 0), super.anInt10403, super.anInt10396);
		}
		return this.aClass44_1;
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(ZIBLclient!oa;)Lclient!id;")
	private Class155 method128(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class15 arg2) {
		@Pc(16) Class292 local16 = Static253.aClass146_2.method3356(this.aShort3 & 0xFFFF);
		@Pc(28) Class4 local28;
		@Pc(23) Class4 local23;
		if (this.aBoolean11) {
			local23 = Static381.aClass4Array2[0];
			local28 = Static495.aClass4Array4[this.aByte2];
		} else {
			if (this.aByte2 < 3) {
				local23 = Static381.aClass4Array2[this.aByte2 + 1];
			} else {
				local23 = null;
			}
			local28 = Static381.aClass4Array2[this.aByte2];
		}
		return local16.method7194(arg0, local28, super.anInt10396, super.anInt10402, 22, this.aByte1, arg2, arg1, local23, super.anInt10403);
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(B)V")
	@Override
	public void method8395() {
		if (this.aClass21_1 != null) {
			this.aClass21_1.method7142();
		}
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8401() {
		return this.aBoolean10;
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method8396(@OriginalArg(0) Class15 arg0) {
		@Pc(14) Class3_Sub4_Sub2 local14;
		if (this.aClass3_Sub4_Sub2_1 == null && this.aBoolean10) {
			@Pc(25) Class155 local25 = this.method128(true, 262144, arg0);
			local14 = local25 == null ? null : local25.aClass3_Sub4_Sub2_2;
		} else {
			local14 = this.aClass3_Sub4_Sub2_1;
			this.aClass3_Sub4_Sub2_1 = null;
		}
		if (local14 != null) {
			Static361.method5982(local14, this.aByte2, super.anInt10403, super.anInt10396, null);
		}
	}

	@OriginalMember(owner = "client!aba", name = "c", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method8384(@OriginalArg(0) Class15 arg0) {
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(BLclient!oa;I)Lclient!ba;")
	private Class21 method129(@OriginalArg(1) Class15 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass21_1 != null && arg0.method5321(this.aClass21_1.h(), arg1) == 0) {
			return this.aClass21_1;
		} else {
			@Pc(28) Class155 local28 = this.method128(false, arg1, arg0);
			return local28 == null ? null : local28.aClass21_3;
		}
	}

	@OriginalMember(owner = "client!aba", name = "b", descriptor = "(B)I")
	@Override
	public int method8398() {
		return this.aShort3 & 0xFFFF;
	}
}
