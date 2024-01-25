import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dca")
public final class Class49_Sub1_Sub1 extends Class49_Sub1 implements Interface18 {

	@OriginalMember(owner = "client!dca", name = "B", descriptor = "Lclient!ud;")
	private Class291 aClass291_1;

	@OriginalMember(owner = "client!dca", name = "U", descriptor = "B")
	private final byte aByte26;

	@OriginalMember(owner = "client!dca", name = "J", descriptor = "S")
	private final short aShort22;

	@OriginalMember(owner = "client!dca", name = "t", descriptor = "B")
	private final byte aByte24;

	@OriginalMember(owner = "client!dca", name = "G", descriptor = "Z")
	private final boolean aBoolean101;

	@OriginalMember(owner = "client!dca", name = "s", descriptor = "Z")
	private final boolean aBoolean98;

	@OriginalMember(owner = "client!dca", name = "x", descriptor = "Z")
	private boolean aBoolean99;

	@OriginalMember(owner = "client!dca", name = "K", descriptor = "B")
	private final byte aByte25;

	@OriginalMember(owner = "client!dca", name = "F", descriptor = "Z")
	private final boolean aBoolean100;

	@OriginalMember(owner = "client!dca", name = "w", descriptor = "Lclient!r;")
	public Class145 aClass145_1;

	@OriginalMember(owner = "client!dca", name = "I", descriptor = "Lclient!k;")
	private Class1_Sub1_Sub9 aClass1_Sub1_Sub9_1;

	static {
		new Class306("If you are not, please change your password to something more obscure!", "nicht der Fall ist, ändere dein Passwort zu einem ungewöhnlicheren Begriff!", "Si ce n'est pas le cas, remplacez votre mot de passe par une formule moins évidente !", "Caso não esteja, altere sua senha para algo mais obscuro!");
		new Class306("Select", "Auswählen", "Sélectionner", "Selecionar");
	}

	@OriginalMember(owner = "client!dca", name = "<init>", descriptor = "(Lclient!qa;Lclient!bu;IIIIZIIZ)V")
	public Class49_Sub1_Sub1(@OriginalArg(0) Class122 arg0, @OriginalArg(1) Class36 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg3, arg4, arg5, Static190.method2955(arg7, arg8));
		super.anInt8032 = arg5;
		super.anInt8035 = arg3;
		this.aByte26 = (byte) arg2;
		this.aShort22 = (short) arg1.anInt952;
		this.aByte24 = (byte) arg7;
		this.aBoolean101 = arg1.anInt992 != 0 && !arg6;
		this.aBoolean98 = arg6;
		this.aBoolean99 = arg9;
		this.aByte25 = (byte) arg8;
		this.aBoolean100 = arg0.method7248() && arg1.aBoolean59 && !this.aBoolean98 && Static544.aClass1_Sub22_Sub1_1.method4655(Static374.anInt6861) != 0;
		@Pc(71) int local71 = 2048;
		if (this.aBoolean99) {
			local71 |= 0x10000;
		}
		@Pc(86) Class305 local86 = this.method1447(local71, arg0, this.aBoolean100);
		if (local86 != null) {
			this.aClass145_1 = local86.aClass145_7;
			this.aClass1_Sub1_Sub9_1 = local86.aClass1_Sub1_Sub9_6;
			if (this.aBoolean99) {
				this.aClass145_1 = this.aClass145_1.method6672((byte) 0, local71, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(IIILclient!qa;IZLclient!lb;)V")
	@Override
	public void method7456(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class122 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Class49 arg5) {
		if (arg5 instanceof Class49_Sub1_Sub1) {
			@Pc(32) Class49_Sub1_Sub1 local32 = (Class49_Sub1_Sub1) arg5;
			if (this.aClass145_1 != null && local32.aClass145_1 != null) {
				this.aClass145_1.method6674(local32.aClass145_1, arg3, arg1, arg0, arg4);
			}
		} else if (arg5 instanceof Class49_Sub2_Sub4) {
			@Pc(12) Class49_Sub2_Sub4 local12 = (Class49_Sub2_Sub4) arg5;
			if (this.aClass145_1 != null && local12.aClass145_5 != null) {
				this.aClass145_1.method6674(local12.aClass145_5, arg3, arg1, arg0, arg4);
			}
		}
	}

	@OriginalMember(owner = "client!dca", name = "b", descriptor = "(I)I")
	@Override
	public int method7467() {
		return this.aShort22 & 0xFFFF;
	}

	@OriginalMember(owner = "client!dca", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method7451() {
		return this.aBoolean99;
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(IILclient!qa;I)Z")
	@Override
	public boolean method7452(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class122 arg2) {
		@Pc(14) Class145 local14 = this.method1451(arg2, 131072);
		if (local14 == null) {
			return false;
		} else {
			@Pc(19) Class118 local19 = arg2.method7256();
			local19.oa(super.anInt8035, super.anInt8033, super.anInt8032);
			return local14.method6683(arg0, arg1, local19, false);
		}
	}

	@OriginalMember(owner = "client!dca", name = "c", descriptor = "(I)I")
	@Override
	public int method7469() {
		return this.aByte25;
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method7466(@OriginalArg(1) Class122 arg0) {
		@Pc(18) Class1_Sub1_Sub9 local18;
		if (this.aClass1_Sub1_Sub9_1 == null && this.aBoolean100) {
			@Pc(29) Class305 local29 = this.method1447(262144, arg0, true);
			local18 = local29 == null ? null : local29.aClass1_Sub1_Sub9_6;
		} else {
			local18 = this.aClass1_Sub1_Sub9_1;
			this.aClass1_Sub1_Sub9_1 = null;
		}
		if (local18 != null) {
			Static449.method6410(local18, this.aByte26, super.anInt8035, super.anInt8032, null);
		}
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method7470(@OriginalArg(0) Class122 arg0) {
		@Pc(14) Class1_Sub1_Sub9 local14;
		if (this.aClass1_Sub1_Sub9_1 == null && this.aBoolean100) {
			@Pc(25) Class305 local25 = this.method1447(262144, arg0, true);
			local14 = local25 == null ? null : local25.aClass1_Sub1_Sub9_6;
		} else {
			local14 = this.aClass1_Sub1_Sub9_1;
			this.aClass1_Sub1_Sub9_1 = null;
		}
		if (local14 != null) {
			Static371.method5720(local14, this.aByte26, super.anInt8035, super.anInt8032, null);
		}
	}

	@OriginalMember(owner = "client!dca", name = "b", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method7455(@OriginalArg(0) Class122 arg0) {
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(IILclient!qa;)Lclient!r;")
	@Override
	public Class145 method7468(@OriginalArg(0) int arg0, @OriginalArg(2) Class122 arg1) {
		return this.method1451(arg1, arg0);
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(I)I")
	@Override
	public int method7465() {
		return this.aByte24;
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(BILclient!qa;Z)Lclient!vq;")
	private Class305 method1447(@OriginalArg(1) int arg0, @OriginalArg(2) Class122 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(19) Class36 local19 = Static308.aClass96_4.method2274(this.aShort22 & 0xFFFF);
		@Pc(27) Class205 local27;
		@Pc(35) Class205 local35;
		if (this.aBoolean98) {
			local27 = Static209.aClass205Array2[this.aByte26];
			local35 = Static16.aClass205Array1[0];
		} else {
			local27 = Static16.aClass205Array1[this.aByte26];
			if (this.aByte26 >= 3) {
				local35 = null;
			} else {
				local35 = Static16.aClass205Array1[this.aByte26 + 1];
			}
		}
		return local19.method963(super.anInt8032, local27, super.anInt8035, this.aByte24, arg0, arg1, super.anInt8033, local35, this.aByte25, arg2);
	}

	@OriginalMember(owner = "client!dca", name = "b", descriptor = "(B)V")
	@Override
	public void method7457() {
		this.aBoolean99 = false;
		if (this.aClass145_1 != null) {
			this.aClass145_1.m(this.aClass145_1.ba() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!dca", name = "b", descriptor = "(ILclient!qa;)Lclient!ud;")
	@Override
	public Class291 method7460(@OriginalArg(1) Class122 arg0) {
		if (this.aClass291_1 == null) {
			this.aClass291_1 = Static158.method2472(this.method1451(arg0, 0), super.anInt8032, super.anInt8033, super.anInt8035);
		}
		return this.aClass291_1;
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(ILclient!qa;I)Lclient!r;")
	private Class145 method1451(@OriginalArg(1) Class122 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass145_1 != null && arg0.method7225(this.aClass145_1.ba(), arg1) == 0) {
			return this.aClass145_1;
		} else {
			@Pc(27) Class305 local27 = this.method1447(arg1, arg0, false);
			return local27 == null ? null : local27.aClass145_7;
		}
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(BLclient!qa;)Lclient!qba;")
	@Override
	public Class72_Sub7 method7453(@OriginalArg(1) Class122 arg0) {
		if (this.aClass145_1 == null) {
			return null;
		}
		@Pc(19) Class118 local19 = arg0.method7256();
		local19.oa(super.anInt8035, super.anInt8033, super.anInt8032);
		@Pc(29) Class72_Sub7 local29 = null;
		if (this.aBoolean101) {
			local29 = Static186.method2914(1);
		}
		this.aClass145_1.method6686(local19, local29 == null ? null : local29.aClass72_Sub2Array1[0], 0);
		return local29;
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7471() {
		return this.aBoolean100;
	}

	@OriginalMember(owner = "client!dca", name = "d", descriptor = "(I)V")
	@Override
	public void method7472() {
		if (this.aClass145_1 != null) {
			this.aClass145_1.method6668();
		}
	}
}
