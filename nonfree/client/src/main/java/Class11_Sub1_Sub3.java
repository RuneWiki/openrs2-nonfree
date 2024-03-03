import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kr")
public final class Class11_Sub1_Sub3 extends Class11_Sub1 implements Interface6 {

	@OriginalMember(owner = "client!kr", name = "H", descriptor = "[I")
	public static final int[] anIntArray206 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@OriginalMember(owner = "client!kr", name = "u", descriptor = "Z")
	private final boolean aBoolean229;

	@OriginalMember(owner = "client!kr", name = "A", descriptor = "Z")
	private boolean aBoolean231;

	@OriginalMember(owner = "client!kr", name = "N", descriptor = "B")
	private final byte aByte32;

	@OriginalMember(owner = "client!kr", name = "w", descriptor = "B")
	private final byte aByte30;

	@OriginalMember(owner = "client!kr", name = "C", descriptor = "B")
	private final byte aByte31;

	@OriginalMember(owner = "client!kr", name = "r", descriptor = "S")
	private final short aShort40;

	@OriginalMember(owner = "client!kr", name = "y", descriptor = "Z")
	private final boolean aBoolean230;

	@OriginalMember(owner = "client!kr", name = "E", descriptor = "Z")
	private final boolean aBoolean232;

	@OriginalMember(owner = "client!kr", name = "R", descriptor = "Lclient!gn;")
	public Class31 aClass31_5;

	@OriginalMember(owner = "client!kr", name = "s", descriptor = "Lclient!kb;")
	private Class2_Sub2_Sub4 aClass2_Sub2_Sub4_4;

	static {
		new Class79("Your friendlist is full, max of 100 for free users, and 200 for members.", "Ihre Freunde-Liste ist voll!", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para usuários não pagantes, e 200 para membros.");
	}

	@OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(Lclient!wm;Lclient!ct;IIIIZIIZ)V", line = 293)
	public Class11_Sub1_Sub3(@OriginalArg(0) Class19 arg0, @OriginalArg(1) Class41 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg3, arg4, arg5, Static166.method2346(arg7, arg8));
		this.aBoolean229 = arg1.anInt1334 != 0 && !arg6;
		this.aBoolean231 = arg9;
		this.aByte32 = (byte) arg7;
		super.anInt3482 = (short) arg3;
		this.aByte30 = (byte) arg2;
		this.aByte31 = (byte) arg8;
		super.anInt3481 = (short) arg5;
		this.aShort40 = (short) arg1.anInt1349;
		this.aBoolean230 = arg6;
		this.aBoolean232 = arg0.method2880() && arg1.aBoolean110 && !this.aBoolean230 && Static203.aClass177_Sub1_2.anInt4876 != 0;
		@Pc(68) int local68 = 1024;
		if (this.aBoolean231) {
			local68 |= 0x8000;
		}
		@Pc(83) Class105 local83 = this.method3471(local68, arg0, this.aBoolean232);
		if (local83 != null) {
			this.aClass31_5 = local83.aClass31_3;
			this.aClass2_Sub2_Sub4_4 = local83.aClass2_Sub2_Sub4_3;
			if (this.aBoolean231) {
				this.aClass31_5 = this.aClass31_5.method3801((byte) 0, local68, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "(I)V", line = 5)
	@Override
	public void method6083() {
		if (this.aClass31_5 != null) {
			this.aClass31_5.method3811();
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(IIILclient!wm;ZLclient!hp;Z)V", line = 19)
	@Override
	public void method6076(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class19 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class11 arg5) {
		if (arg5 instanceof Class11_Sub1_Sub3) {
			@Pc(32) Class11_Sub1_Sub3 local32 = (Class11_Sub1_Sub3) arg5;
			if (this.aClass31_5 != null && local32.aClass31_5 != null) {
				this.aClass31_5.method3804(local32.aClass31_5, arg0, arg2, arg1, arg4);
			}
		} else if (arg5 instanceof Class11_Sub5_Sub1) {
			@Pc(12) Class11_Sub5_Sub1 local12 = (Class11_Sub5_Sub1) arg5;
			if (this.aClass31_5 != null && local12.aClass31_2 != null) {
				this.aClass31_5.method3804(local12.aClass31_2, arg0, arg2, arg1, arg4);
			}
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(Lclient!wm;I)V", line = 62)
	@Override
	public void method6084(@OriginalArg(0) Class19 arg0) {
		@Pc(14) Class2_Sub2_Sub4 local14;
		if (this.aClass2_Sub2_Sub4_4 == null && this.aBoolean232) {
			@Pc(25) Class105 local25 = this.method3471(131072, arg0, true);
			local14 = local25 == null ? null : local25.aClass2_Sub2_Sub4_3;
		} else {
			local14 = this.aClass2_Sub2_Sub4_4;
			this.aClass2_Sub2_Sub4_4 = null;
		}
		if (local14 != null) {
			Static145.method2782(local14, this.aByte30, super.anInt3482, super.anInt3481, null);
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(Z)Z", line = 89)
	@Override
	public boolean method6087() {
		return this.aBoolean232;
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(BLclient!wm;)V", line = 127)
	@Override
	public void method6088(@OriginalArg(1) Class19 arg0) {
		@Pc(20) Class2_Sub2_Sub4 local20;
		if (this.aClass2_Sub2_Sub4_4 == null && this.aBoolean232) {
			@Pc(31) Class105 local31 = this.method3471(131072, arg0, true);
			local20 = local31 == null ? null : local31.aClass2_Sub2_Sub4_3;
		} else {
			local20 = this.aClass2_Sub2_Sub4_4;
			this.aClass2_Sub2_Sub4_4 = null;
		}
		if (local20 != null) {
			Static53.method1621(local20, this.aByte30, super.anInt3482, super.anInt3481, null);
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(IILclient!wm;)Lclient!gn;", line = 155)
	private Class31 method3468(@OriginalArg(0) int arg0, @OriginalArg(2) Class19 arg1) {
		if (this.aClass31_5 != null && arg1.method2865(this.aClass31_5.method3828(), arg0) == 0) {
			return this.aClass31_5;
		} else {
			@Pc(34) Class105 local34 = this.method3471(arg0, arg1, false);
			return local34 == null ? null : local34.aClass31_3;
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(Lclient!wm;B)V", line = 176)
	@Override
	public void method6071(@OriginalArg(0) Class19 arg0) {
	}

	@OriginalMember(owner = "client!kr", name = "g", descriptor = "(I)Z", line = 189)
	@Override
	public boolean method6077() {
		return this.aBoolean231;
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(IIBLclient!wm;)Z", line = 256)
	@Override
	public boolean method6069(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class19 arg2) {
		@Pc(15) Class31 local15 = this.method3468(65536, arg2);
		if (local15 == null) {
			return false;
		} else {
			@Pc(20) Class14 local20 = arg2.method2810();
			local20.method3923(super.anInt3482, super.anInt3480, super.anInt3481);
			return local15.method3821(arg0, arg1, local20, false);
		}
	}

	@OriginalMember(owner = "client!kr", name = "d", descriptor = "(I)I", line = 278)
	@Override
	public int method6086() {
		return this.aShort40 & 0xFFFF;
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)I", line = 328)
	@Override
	public int method6082() {
		return this.aByte32;
	}

	@OriginalMember(owner = "client!kr", name = "e", descriptor = "(I)V", line = 345)
	@Override
	public void method6070() {
		this.aBoolean231 = false;
		if (this.aClass31_5 != null) {
			this.aClass31_5.method3815(this.aClass31_5.method3828() & 0xFFFF7FFF);
		}
	}

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "(Lclient!wm;B)Lclient!nf;", line = 362)
	@Override
	public Class12_Sub4 method6074(@OriginalArg(0) Class19 arg0) {
		if (this.aClass31_5 == null) {
			return null;
		}
		@Pc(11) Class14 local11 = arg0.method2810();
		local11.method3923(super.anInt3482, super.anInt3480, super.anInt3481);
		@Pc(21) Class12_Sub4 local21 = null;
		if (this.aBoolean229) {
			local21 = Static138.method2708(1);
		}
		this.aClass31_5.method3836(local11, local21 == null ? null : local21.aClass12_Sub2Array1[0], 0);
		return local21;
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(IZLclient!wm;Z)Lclient!ij;", line = 400)
	private Class105 method3471(@OriginalArg(0) int arg0, @OriginalArg(2) Class19 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(19) Class41 local19 = Static334.aClass202_4.method5164(this.aShort40 & 0xFFFF);
		@Pc(27) Class6 local27;
		@Pc(35) Class6 local35;
		if (this.aBoolean230) {
			local35 = Static307.aClass6Array3[0];
			local27 = Static174.aClass6Array2[this.aByte30];
		} else {
			local27 = Static307.aClass6Array3[this.aByte30];
			if (this.aByte30 >= 3) {
				local35 = null;
			} else {
				local35 = Static307.aClass6Array3[this.aByte30 + 1];
			}
		}
		return local19.method1521(super.anInt3480, local27, this.aByte31, super.anInt3481, super.anInt3482, arg0, arg2, arg1, local35, this.aByte32);
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(ILclient!wm;I)Lclient!gn;", line = 433)
	@Override
	public Class31 method6089(@OriginalArg(0) int arg0, @OriginalArg(1) Class19 arg1) {
		return this.method3468(arg0, arg1);
	}

	@OriginalMember(owner = "client!kr", name = "c", descriptor = "(I)I", line = 450)
	@Override
	public int method6085() {
		return this.aByte31;
	}
}
