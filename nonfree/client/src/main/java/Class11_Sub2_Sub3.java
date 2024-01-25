import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nu")
public final class Class11_Sub2_Sub3 extends Class11_Sub2 implements Interface7 {

	@OriginalMember(owner = "client!nu", name = "K", descriptor = "Z")
	private boolean aBoolean447;

	@OriginalMember(owner = "client!nu", name = "v", descriptor = "S")
	private final short aShort72;

	@OriginalMember(owner = "client!nu", name = "q", descriptor = "B")
	private final byte aByte69;

	@OriginalMember(owner = "client!nu", name = "F", descriptor = "Z")
	private final boolean aBoolean446;

	@OriginalMember(owner = "client!nu", name = "J", descriptor = "B")
	private final byte aByte70;

	@OriginalMember(owner = "client!nu", name = "Q", descriptor = "Z")
	private final boolean aBoolean448;

	@OriginalMember(owner = "client!nu", name = "V", descriptor = "Z")
	private final boolean aBoolean450;

	@OriginalMember(owner = "client!nu", name = "w", descriptor = "Lclient!e;")
	private Class8 aClass8_4;

	@OriginalMember(owner = "client!nu", name = "I", descriptor = "Lclient!i;")
	private Class1_Sub3_Sub11 aClass1_Sub3_Sub11_4;

	@OriginalMember(owner = "client!nu", name = "<init>", descriptor = "(Lclient!za;Lclient!fu;IIIIZIZ)V")
	public Class11_Sub2_Sub3(@OriginalArg(0) Class117 arg0, @OriginalArg(1) Class87 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg3, arg4, arg5, arg1.anInt1930, arg1.aBoolean214, arg1.aBoolean202);
		this.aBoolean447 = arg8;
		this.aShort72 = (short) arg1.anInt1925;
		this.aByte69 = (byte) arg2;
		this.aBoolean446 = arg6;
		super.anInt4843 = arg5;
		this.aByte70 = (byte) arg7;
		super.anInt4842 = arg3;
		this.aBoolean448 = arg1.anInt1928 != 0 && !arg6;
		this.aBoolean450 = arg0.method5691() && arg1.aBoolean207 && !this.aBoolean446 && Static126.aClass19_Sub1_1.method3337(Static214.anInt3968) != 0;
		@Pc(72) int local72 = 2048;
		if (this.aBoolean447) {
			local72 |= 0x10000;
		}
		@Pc(87) Class212 local87 = this.method3878(arg0, local72, this.aBoolean450);
		if (local87 != null) {
			this.aClass8_4 = local87.aClass8_6;
			this.aClass1_Sub3_Sub11_4 = local87.aClass1_Sub3_Sub11_5;
			if (this.aBoolean447) {
				this.aClass8_4 = this.aClass8_4.method5983((byte) 0, local72, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(ZLclient!za;IZ)Lclient!qr;")
	private Class212 method3878(@OriginalArg(1) Class117 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(13) Class87 local13 = Static86.aClass248_7.method5246(this.aShort72 & 0xFFFF);
		@Pc(26) Class139 local26;
		@Pc(30) Class139 local30;
		if (this.aBoolean446) {
			local26 = Static397.aClass139Array2[this.aByte69];
			local30 = Static157.aClass139Array1[0];
		} else {
			if (this.aByte69 < 3) {
				local30 = Static157.aClass139Array1[this.aByte69 + 1];
			} else {
				local30 = null;
			}
			local26 = Static157.aClass139Array1[this.aByte69];
		}
		return local13.method1564(arg0, 22, arg1, this.aByte70, super.anInt4843, super.anInt4842, arg2, local26, super.anInt4844, local30);
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(Lclient!za;I)V")
	@Override
	public void method5182(@OriginalArg(0) Class117 arg0) {
	}

	@OriginalMember(owner = "client!nu", name = "b", descriptor = "(Lclient!za;B)Lclient!kf;")
	@Override
	public Class111_Sub3 method5181(@OriginalArg(0) Class117 arg0) {
		if (this.aClass8_4 == null) {
			return null;
		}
		@Pc(17) Class34 local17 = arg0.method5685();
		local17.U(super.anInt4842, super.anInt4844, super.anInt4843);
		@Pc(27) Class111_Sub3 local27 = null;
		if (this.aBoolean448) {
			local27 = Static238.method3398(1);
		}
		this.aClass8_4.method5987(local17, local27 == null ? null : local27.aClass111_Sub8Array1[0], 0);
		return local27;
	}

	@OriginalMember(owner = "client!nu", name = "d", descriptor = "(I)V")
	@Override
	public void method4900() {
		if (this.aClass8_4 != null) {
			this.aClass8_4.method5991();
		}
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(IILclient!za;I)Z")
	@Override
	public boolean method5180(@OriginalArg(1) int arg0, @OriginalArg(2) Class117 arg1, @OriginalArg(3) int arg2) {
		@Pc(15) Class8 local15 = this.method3882(arg1, 131072);
		if (local15 == null) {
			return false;
		} else {
			@Pc(20) Class34 local20 = arg1.method5685();
			local20.U(super.anInt4842, super.anInt4844, super.anInt4843);
			return local15.method5985(arg0, arg2, local20, false);
		}
	}

	@OriginalMember(owner = "client!nu", name = "e", descriptor = "(I)V")
	@Override
	public void method5177() {
		this.aBoolean447 = false;
		if (this.aClass8_4 != null) {
			this.aClass8_4.D(this.aClass8_4.RA() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(ILclient!za;I)Lclient!e;")
	@Override
	public Class8 method4901(@OriginalArg(1) Class117 arg0, @OriginalArg(2) int arg1) {
		return this.method3882(arg0, arg1);
	}

	@OriginalMember(owner = "client!nu", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5183() {
		return this.aBoolean447;
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(I)I")
	@Override
	public int method4897() {
		return 22;
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(ILclient!za;)V")
	@Override
	public void method4896(@OriginalArg(1) Class117 arg0) {
		@Pc(31) Class1_Sub3_Sub11 local31;
		if (this.aClass1_Sub3_Sub11_4 == null && this.aBoolean450) {
			@Pc(24) Class212 local24 = this.method3878(arg0, 262144, true);
			local31 = local24 == null ? null : local24.aClass1_Sub3_Sub11_5;
		} else {
			local31 = this.aClass1_Sub3_Sub11_4;
			this.aClass1_Sub3_Sub11_4 = null;
		}
		if (local31 != null) {
			Static413.method5276(local31, this.aByte69, super.anInt4842, super.anInt4843, null);
		}
	}

	@OriginalMember(owner = "client!nu", name = "b", descriptor = "(ILclient!za;I)Lclient!e;")
	private Class8 method3882(@OriginalArg(1) Class117 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass8_4 != null && arg0.method5732(this.aClass8_4.RA(), arg1) == 0) {
			return this.aClass8_4;
		} else {
			@Pc(28) Class212 local28 = this.method3878(arg0, arg1, false);
			return local28 == null ? null : local28.aClass8_6;
		}
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(B)I")
	@Override
	public int method4895() {
		return this.aShort72 & 0xFFFF;
	}

	@OriginalMember(owner = "client!nu", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method4898() {
		return this.aBoolean450;
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(ILclient!za;ILclient!ge;IZI)V")
	@Override
	public void method5179(@OriginalArg(1) Class117 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class11 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		if (arg2 instanceof Class11_Sub2_Sub3) {
			@Pc(5) Class11_Sub2_Sub3 local5 = (Class11_Sub2_Sub3) arg2;
			if (this.aClass8_4 != null && local5.aClass8_4 != null) {
				this.aClass8_4.method5996(local5.aClass8_4, arg3, arg1, arg5, arg4);
			}
		}
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(Lclient!za;B)V")
	@Override
	public void method4902(@OriginalArg(0) Class117 arg0) {
		@Pc(21) Class1_Sub3_Sub11 local21;
		if (this.aClass1_Sub3_Sub11_4 == null && this.aBoolean450) {
			@Pc(32) Class212 local32 = this.method3878(arg0, 262144, true);
			local21 = local32 == null ? null : local32.aClass1_Sub3_Sub11_5;
		} else {
			local21 = this.aClass1_Sub3_Sub11_4;
			this.aClass1_Sub3_Sub11_4 = null;
		}
		if (local21 != null) {
			Static7.method118(local21, this.aByte69, super.anInt4842, super.anInt4843, null);
		}
	}

	@OriginalMember(owner = "client!nu", name = "c", descriptor = "(I)I")
	@Override
	public int method4899() {
		return this.aByte70;
	}
}
