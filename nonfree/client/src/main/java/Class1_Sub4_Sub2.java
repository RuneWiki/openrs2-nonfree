import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ut")
public final class Class1_Sub4_Sub2 extends Class1_Sub4 implements Interface6 {

	@OriginalMember(owner = "client!ut", name = "r", descriptor = "Lclient!ed;")
	private Class68 aClass68_8;

	@OriginalMember(owner = "client!ut", name = "n", descriptor = "Z")
	private boolean aBoolean626;

	@OriginalMember(owner = "client!ut", name = "q", descriptor = "B")
	private final byte aByte104;

	@OriginalMember(owner = "client!ut", name = "v", descriptor = "Z")
	private final boolean aBoolean627;

	@OriginalMember(owner = "client!ut", name = "E", descriptor = "B")
	private final byte aByte105;

	@OriginalMember(owner = "client!ut", name = "B", descriptor = "S")
	private final short aShort147;

	@OriginalMember(owner = "client!ut", name = "J", descriptor = "Z")
	private final boolean aBoolean629;

	@OriginalMember(owner = "client!ut", name = "F", descriptor = "Z")
	private final boolean aBoolean628;

	@OriginalMember(owner = "client!ut", name = "D", descriptor = "Lclient!r;")
	private Class63 aClass63_6;

	@OriginalMember(owner = "client!ut", name = "s", descriptor = "Lclient!k;")
	private Class2_Sub13_Sub6 aClass2_Sub13_Sub6_6;

	static {
		new Class202("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.", "Échangez ce reçu contre l'objet correspondant dans la banque de votre choix.", "Vá a qualquer banco para trocar esta nota pelo objeto equivalente.");
		new Class202("Unable to delete name - system busy.", "Name konnte nicht gelöscht werden - Systemfehler.", "Impossible d'effacer le nom - système occupé.", "Não foi possível deletar o nome - sistema ocupado.");
	}

	@OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(Lclient!qa;Lclient!ih;IIIIZIZ)V")
	public Class1_Sub4_Sub2(@OriginalArg(0) Class39 arg0, @OriginalArg(1) Class129 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg3, arg4, arg5, arg1.anInt3647, arg1.aBoolean290, arg1.aBoolean288);
		this.aBoolean626 = arg8;
		this.aByte104 = (byte) arg7;
		this.aBoolean627 = arg6;
		super.anInt9271 = arg5;
		this.aByte105 = (byte) arg2;
		this.aShort147 = (short) arg1.anInt3646;
		super.anInt9269 = arg3;
		this.aBoolean629 = arg1.anInt3660 != 0 && !arg6;
		this.aBoolean628 = arg0.method6065() && arg1.aBoolean291 && !this.aBoolean627 && Static281.aClass2_Sub19_Sub1_1.method2135(Static266.anInt4923) != 0;
		@Pc(66) int local66 = 2048;
		if (this.aBoolean626) {
			local66 |= 0x10000;
		}
		@Pc(81) Class252 local81 = this.method7299(local66, arg0, this.aBoolean628);
		if (local81 != null) {
			this.aClass63_6 = local81.aClass63_5;
			this.aClass2_Sub13_Sub6_6 = local81.aClass2_Sub13_Sub6_5;
			if (this.aBoolean626) {
				this.aClass63_6 = this.aClass63_6.method7706((byte) 0, local66, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ut", name = "c", descriptor = "(I)I")
	@Override
	public int method7688() {
		return this.aShort147 & 0xFFFF;
	}

	@OriginalMember(owner = "client!ut", name = "b", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method7686(@OriginalArg(0) Class39 arg0) {
		@Pc(14) Class2_Sub13_Sub6 local14;
		if (this.aClass2_Sub13_Sub6_6 == null && this.aBoolean628) {
			@Pc(25) Class252 local25 = this.method7299(262144, arg0, true);
			local14 = local25 == null ? null : local25.aClass2_Sub13_Sub6_5;
		} else {
			local14 = this.aClass2_Sub13_Sub6_6;
			this.aClass2_Sub13_Sub6_6 = null;
		}
		if (local14 != null) {
			Static297.method4693(local14, this.aByte105, super.anInt9269, super.anInt9271, null);
		}
	}

	@OriginalMember(owner = "client!ut", name = "b", descriptor = "(B)V")
	@Override
	public void method7675() {
		this.aBoolean626 = false;
		if (this.aClass63_6 != null) {
			this.aClass63_6.m(this.aClass63_6.ba() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(IILclient!qa;Z)Lclient!rp;")
	private Class252 method7299(@OriginalArg(1) int arg0, @OriginalArg(2) Class39 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(13) Class129 local13 = Static505.aClass206_4.method5326(this.aShort147 & 0xFFFF);
		@Pc(21) Class75 local21;
		@Pc(34) Class75 local34;
		if (this.aBoolean627) {
			local34 = Static164.aClass75Array1[0];
			local21 = Static427.aClass75Array2[this.aByte105];
		} else {
			local21 = Static164.aClass75Array1[this.aByte105];
			if (this.aByte105 < 3) {
				local34 = Static164.aClass75Array1[this.aByte105 + 1];
			} else {
				local34 = null;
			}
		}
		return local13.method3271(super.anInt9270, super.anInt9269, local21, super.anInt9271, 22, arg2, arg0, this.aByte104, local34, arg1);
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(ILclient!qa;IB)Z")
	@Override
	public boolean method7673(@OriginalArg(0) int arg0, @OriginalArg(1) Class39 arg1, @OriginalArg(2) int arg2) {
		@Pc(14) Class63 local14 = this.method7300(arg1, 131072);
		if (local14 == null) {
			return false;
		} else {
			@Pc(19) Class181 local19 = arg1.method6022();
			local19.oa(super.anInt9269, super.anInt9270, super.anInt9271);
			return local14.method7697(arg0, arg2, local19, false);
		}
	}

	@OriginalMember(owner = "client!ut", name = "b", descriptor = "(I)I")
	@Override
	public int method7687() {
		return this.aByte104;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(ILclient!qa;)Lclient!lb;")
	@Override
	public Class6_Sub5 method7680(@OriginalArg(1) Class39 arg0) {
		if (this.aClass63_6 == null) {
			return null;
		}
		@Pc(11) Class181 local11 = arg0.method6022();
		local11.oa(super.anInt9269, super.anInt9270, super.anInt9271);
		@Pc(27) Class6_Sub5 local27 = null;
		if (this.aBoolean629) {
			local27 = Static356.method2696(1);
		}
		this.aClass63_6.method7700(local11, local27 == null ? null : local27.aClass6_Sub4Array1[0], 0);
		return local27;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(Z)I")
	@Override
	public int method7685() {
		return 22;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(BLclient!qa;)Lclient!ed;")
	@Override
	public Class68 method7676(@OriginalArg(1) Class39 arg0) {
		if (this.aClass68_8 == null) {
			this.aClass68_8 = Static51.method920(super.anInt9270, super.anInt9269, super.anInt9271, this.method7300(arg0, 0));
		}
		return this.aClass68_8;
	}

	@OriginalMember(owner = "client!ut", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method7671() {
		return this.aBoolean626;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lclient!qa;IB)Lclient!r;")
	private Class63 method7300(@OriginalArg(0) Class39 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass63_6 != null && arg0.method6070(this.aClass63_6.ba(), arg1) == 0) {
			return this.aClass63_6;
		} else {
			@Pc(23) Class252 local23 = this.method7299(arg1, arg0, false);
			return local23 == null ? null : local23.aClass63_5;
		}
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(B)V")
	@Override
	public void method7683() {
		if (this.aClass63_6 != null) {
			this.aClass63_6.method7696();
		}
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(BILclient!qa;)Lclient!r;")
	@Override
	public Class63 method7689(@OriginalArg(1) int arg0, @OriginalArg(2) Class39 arg1) {
		return this.method7300(arg1, arg0);
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lclient!qa;Z)V")
	@Override
	public void method7677(@OriginalArg(0) Class39 arg0) {
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(ILclient!qa;IIZLclient!se;I)V")
	@Override
	public void method7672(@OriginalArg(0) int arg0, @OriginalArg(1) Class39 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class1 arg4, @OriginalArg(6) int arg5) {
		if (!(arg4 instanceof Class1_Sub4_Sub2)) {
			return;
		}
		@Pc(13) Class1_Sub4_Sub2 local13 = (Class1_Sub4_Sub2) arg4;
		if (this.aClass63_6 != null && local13.aClass63_6 != null) {
			this.aClass63_6.method7705(local13.aClass63_6, arg5, arg2, arg0, arg3);
			return;
		}
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7684() {
		return this.aBoolean628;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method7682(@OriginalArg(0) Class39 arg0) {
		@Pc(25) Class2_Sub13_Sub6 local25;
		if (this.aClass2_Sub13_Sub6_6 == null && this.aBoolean628) {
			@Pc(18) Class252 local18 = this.method7299(262144, arg0, true);
			local25 = local18 == null ? null : local18.aClass2_Sub13_Sub6_5;
		} else {
			local25 = this.aClass2_Sub13_Sub6_6;
			this.aClass2_Sub13_Sub6_6 = null;
		}
		if (local25 != null) {
			Static151.method2619(local25, this.aByte105, super.anInt9269, super.anInt9271, null);
		}
	}
}
