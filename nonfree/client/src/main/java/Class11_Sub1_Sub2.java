import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bi")
public final class Class11_Sub1_Sub2 extends Class11_Sub1 implements Interface7 {

	@OriginalMember(owner = "client!bi", name = "ab", descriptor = "S")
	private final short aShort21;

	@OriginalMember(owner = "client!bi", name = "O", descriptor = "Z")
	private final boolean aBoolean74;

	@OriginalMember(owner = "client!bi", name = "Y", descriptor = "Z")
	private boolean aBoolean75;

	@OriginalMember(owner = "client!bi", name = "N", descriptor = "B")
	private final byte aByte18;

	@OriginalMember(owner = "client!bi", name = "D", descriptor = "B")
	private final byte aByte16;

	@OriginalMember(owner = "client!bi", name = "E", descriptor = "Z")
	private final boolean aBoolean73;

	@OriginalMember(owner = "client!bi", name = "K", descriptor = "B")
	private final byte aByte17;

	@OriginalMember(owner = "client!bi", name = "B", descriptor = "Z")
	private final boolean aBoolean72;

	@OriginalMember(owner = "client!bi", name = "H", descriptor = "Lclient!e;")
	public Class8 aClass8_1;

	@OriginalMember(owner = "client!bi", name = "x", descriptor = "Lclient!i;")
	private Class1_Sub3_Sub11 aClass1_Sub3_Sub11_1;

	static {
		new Class142("To use this item please login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Veuillez vous connecter à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
	}

	@OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(Lclient!za;Lclient!fu;IIIIIZIIIIIIZ)V")
	public Class11_Sub1_Sub2(@OriginalArg(0) Class117 arg0, @OriginalArg(1) Class87 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt1926 == 1, Static408.method3884(arg13, arg12));
		this.aShort21 = (short) arg1.anInt1925;
		this.aBoolean74 = arg1.anInt1928 != 0 && !arg7;
		this.aBoolean75 = arg14;
		this.aByte18 = (byte) arg12;
		this.aByte16 = (byte) arg3;
		this.aBoolean73 = arg7;
		this.aByte17 = (byte) arg13;
		this.aBoolean72 = arg0.method5691() && arg1.aBoolean207 && !this.aBoolean73 && Static126.aClass19_Sub1_1.method3337(Static214.anInt3968) != 0;
		@Pc(77) int local77 = 2048;
		if (this.aBoolean75) {
			local77 |= 0x10000;
		}
		@Pc(92) Class212 local92 = this.method452(local77, arg0, this.aBoolean72);
		if (local92 != null) {
			this.aClass8_1 = local92.aClass8_6;
			this.aClass1_Sub3_Sub11_1 = local92.aClass1_Sub3_Sub11_5;
			if (this.aBoolean75) {
				this.aClass8_1 = this.aClass8_1.method5983((byte) 0, local77, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)I")
	@Override
	public int method4895() {
		return this.aShort21 & 0xFFFF;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILclient!za;ILclient!ge;IZI)V")
	@Override
	public void method5179(@OriginalArg(1) Class117 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class11 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		if (arg2 instanceof Class11_Sub3_Sub2) {
			@Pc(28) Class11_Sub3_Sub2 local28 = (Class11_Sub3_Sub2) arg2;
			if (this.aClass8_1 != null && local28.aClass8_2 != null) {
				this.aClass8_1.method5996(local28.aClass8_2, arg3, arg1, arg5, arg4);
			}
		} else if (arg2 instanceof Class11_Sub1_Sub2) {
			@Pc(8) Class11_Sub1_Sub2 local8 = (Class11_Sub1_Sub2) arg2;
			if (this.aClass8_1 != null && local8.aClass8_1 != null) {
				this.aClass8_1.method5996(local8.aClass8_1, arg3, arg1, arg5, arg4);
			}
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!za;B)V")
	@Override
	public void method4902(@OriginalArg(0) Class117 arg0) {
		@Pc(33) Class1_Sub3_Sub11 local33;
		if (this.aClass1_Sub3_Sub11_1 == null && this.aBoolean72) {
			@Pc(26) Class212 local26 = this.method452(262144, arg0, true);
			local33 = local26 == null ? null : local26.aClass1_Sub3_Sub11_5;
		} else {
			local33 = this.aClass1_Sub3_Sub11_1;
			this.aClass1_Sub3_Sub11_1 = null;
		}
		if (local33 != null) {
			Static7.method118(local33, this.aByte16, super.anInt6428, super.anInt6430, null);
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IILclient!za;I)Z")
	@Override
	public boolean method5180(@OriginalArg(1) int arg0, @OriginalArg(2) Class117 arg1, @OriginalArg(3) int arg2) {
		@Pc(18) Class8 local18 = this.method449(arg1, 131072);
		if (local18 == null) {
			return false;
		} else {
			@Pc(23) Class34 local23 = arg1.method5685();
			local23.U(super.anInt6428, super.anInt6437, super.anInt6430);
			return local18.method5985(arg0, arg2, local23, false);
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!za;I)V")
	@Override
	public void method5182(@OriginalArg(0) Class117 arg0) {
	}

	@OriginalMember(owner = "client!bi", name = "d", descriptor = "(I)V")
	@Override
	public void method4900() {
		if (this.aClass8_1 != null) {
			this.aClass8_1.method5991();
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!za;II)Lclient!e;")
	private Class8 method449(@OriginalArg(0) Class117 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass8_1 != null && arg0.method5732(this.aClass8_1.RA(), arg1) == 0) {
			return this.aClass8_1;
		} else {
			@Pc(31) Class212 local31 = this.method452(arg1, arg0, false);
			return local31 == null ? null : local31.aClass8_6;
		}
	}

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "(I)I")
	@Override
	public int method4899() {
		return this.aByte17;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)I")
	@Override
	public int method4897() {
		return this.aByte18;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILclient!za;I)Lclient!e;")
	@Override
	public Class8 method4901(@OriginalArg(1) Class117 arg0, @OriginalArg(2) int arg1) {
		return this.method449(arg0, arg1);
	}

	@OriginalMember(owner = "client!bi", name = "e", descriptor = "(I)V")
	@Override
	public void method5177() {
		this.aBoolean75 = false;
		if (this.aClass8_1 != null) {
			this.aClass8_1.D(this.aClass8_1.RA() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "(B)I")
	@Override
	public int method5184() {
		return this.aClass8_1 == null ? 0 : this.aClass8_1.B();
	}

	@OriginalMember(owner = "client!bi", name = "e", descriptor = "(B)I")
	public int method450() {
		return this.aClass8_1 == null ? 15 : this.aClass8_1.k() / 4;
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method4898() {
		return this.aBoolean72;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILclient!za;BZ)Lclient!qr;")
	private Class212 method452(@OriginalArg(0) int arg0, @OriginalArg(1) Class117 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(20) Class87 local20 = Static86.aClass248_7.method5246(this.aShort21 & 0xFFFF);
		@Pc(45) Class139 local45;
		@Pc(31) Class139 local31;
		if (this.aBoolean73) {
			local45 = Static397.aClass139Array2[this.aByte16];
			local31 = Static157.aClass139Array1[0];
		} else {
			if (this.aByte16 >= 3) {
				local31 = null;
			} else {
				local31 = Static157.aClass139Array1[this.aByte16 + 1];
			}
			local45 = Static157.aClass139Array1[this.aByte16];
		}
		return local20.method1564(arg1, this.aByte18 == 11 ? 10 : this.aByte18, arg0, this.aByte18 == 11 ? this.aByte17 + 4 : this.aByte17, super.anInt6430, super.anInt6428, arg2, local45, super.anInt6437, local31);
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5183() {
		return this.aBoolean75;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILclient!za;)V")
	@Override
	public void method4896(@OriginalArg(1) Class117 arg0) {
		@Pc(25) Class1_Sub3_Sub11 local25;
		if (this.aClass1_Sub3_Sub11_1 == null && this.aBoolean72) {
			@Pc(18) Class212 local18 = this.method452(262144, arg0, true);
			local25 = local18 == null ? null : local18.aClass1_Sub3_Sub11_5;
		} else {
			local25 = this.aClass1_Sub3_Sub11_1;
			this.aClass1_Sub3_Sub11_1 = null;
		}
		if (local25 != null) {
			Static413.method5276(local25, this.aByte16, super.anInt6428, super.anInt6430, null);
		}
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(Lclient!za;B)Lclient!kf;")
	@Override
	public Class111_Sub3 method5181(@OriginalArg(0) Class117 arg0) {
		if (this.aClass8_1 == null) {
			return null;
		}
		@Pc(18) Class34 local18 = arg0.method5685();
		local18.U(super.anInt6428, super.anInt6437, super.anInt6430);
		@Pc(28) Class111_Sub3 local28 = null;
		if (this.aBoolean74) {
			local28 = Static238.method3398(1);
		}
		this.aClass8_1.method5987(local18, local28 == null ? null : local28.aClass111_Sub8Array1[0], 0);
		return local28;
	}
}
