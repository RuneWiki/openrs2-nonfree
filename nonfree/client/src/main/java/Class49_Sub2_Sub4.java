import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pba")
public final class Class49_Sub2_Sub4 extends Class49_Sub2 implements Interface18 {

	@OriginalMember(owner = "client!pba", name = "D", descriptor = "Lclient!ud;")
	private Class291 aClass291_4;

	@OriginalMember(owner = "client!pba", name = "E", descriptor = "Z")
	private boolean aBoolean460;

	@OriginalMember(owner = "client!pba", name = "G", descriptor = "Z")
	private final boolean aBoolean461;

	@OriginalMember(owner = "client!pba", name = "B", descriptor = "S")
	private final short aShort106;

	@OriginalMember(owner = "client!pba", name = "H", descriptor = "B")
	private final byte aByte91;

	@OriginalMember(owner = "client!pba", name = "F", descriptor = "B")
	private final byte aByte90;

	@OriginalMember(owner = "client!pba", name = "U", descriptor = "B")
	private final byte aByte92;

	@OriginalMember(owner = "client!pba", name = "S", descriptor = "Z")
	private final boolean aBoolean462;

	@OriginalMember(owner = "client!pba", name = "V", descriptor = "Z")
	private final boolean aBoolean463;

	@OriginalMember(owner = "client!pba", name = "Z", descriptor = "Lclient!k;")
	private Class1_Sub1_Sub9 aClass1_Sub1_Sub9_4;

	@OriginalMember(owner = "client!pba", name = "z", descriptor = "Lclient!r;")
	public Class145 aClass145_5;

	static {
		new Class306("To use this item please login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Veuillez vous connecter à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
	}

	@OriginalMember(owner = "client!pba", name = "<init>", descriptor = "(Lclient!qa;Lclient!bu;IIIIIZIIIIIIZ)V")
	public Class49_Sub2_Sub4(@OriginalArg(0) Class122 arg0, @OriginalArg(1) Class36 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt991 == 1, Static468.method6556(arg13, arg12));
		this.aBoolean460 = arg14;
		this.aBoolean461 = arg7;
		this.aShort106 = (short) arg1.anInt952;
		this.aByte91 = (byte) arg12;
		this.aByte90 = (byte) arg13;
		this.aByte92 = (byte) arg3;
		this.aBoolean462 = arg1.anInt992 != 0 && !arg7;
		this.aBoolean463 = arg0.method7248() && arg1.aBoolean59 && !this.aBoolean461 && Static544.aClass1_Sub22_Sub1_1.method4655(Static374.anInt6861) != 0;
		@Pc(79) int local79 = 2048;
		if (this.aBoolean460) {
			local79 |= 0x10000;
		}
		@Pc(94) Class305 local94 = this.method5372(arg0, local79, this.aBoolean463);
		if (local94 != null) {
			this.aClass1_Sub1_Sub9_4 = local94.aClass1_Sub1_Sub9_6;
			this.aClass145_5 = local94.aClass145_7;
			if (this.aBoolean460) {
				this.aClass145_5 = this.aClass145_5.method6672((byte) 0, local79, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7471() {
		return this.aBoolean463;
	}

	@OriginalMember(owner = "client!pba", name = "b", descriptor = "(ILclient!qa;)Lclient!ud;")
	@Override
	public Class291 method7460(@OriginalArg(1) Class122 arg0) {
		if (this.aClass291_4 == null) {
			this.aClass291_4 = Static158.method2472(this.method5373(0, arg0), super.anInt7141, super.anInt7140, super.anInt7137);
		}
		return this.aClass291_4;
	}

	@OriginalMember(owner = "client!pba", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method7451() {
		return this.aBoolean460;
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(IILclient!qa;)Lclient!r;")
	@Override
	public Class145 method7468(@OriginalArg(0) int arg0, @OriginalArg(2) Class122 arg1) {
		return this.method5373(arg0, arg1);
	}

	@OriginalMember(owner = "client!pba", name = "b", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method7455(@OriginalArg(0) Class122 arg0) {
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method7466(@OriginalArg(1) Class122 arg0) {
		@Pc(19) Class1_Sub1_Sub9 local19;
		if (this.aClass1_Sub1_Sub9_4 == null && this.aBoolean463) {
			@Pc(32) Class305 local32 = this.method5372(arg0, 262144, true);
			local19 = local32 == null ? null : local32.aClass1_Sub1_Sub9_6;
		} else {
			local19 = this.aClass1_Sub1_Sub9_4;
			this.aClass1_Sub1_Sub9_4 = null;
		}
		if (local19 != null) {
			Static449.method6410(local19, this.aByte92, super.anInt7137, super.anInt7141, null);
		}
	}

	@OriginalMember(owner = "client!pba", name = "h", descriptor = "(I)I")
	public int method5371() {
		return this.aClass145_5 == null ? 15 : this.aClass145_5.e() / 4;
	}

	@OriginalMember(owner = "client!pba", name = "d", descriptor = "(I)V")
	@Override
	public void method7472() {
		if (this.aClass145_5 != null) {
			this.aClass145_5.method6668();
		}
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(IIILclient!qa;IZLclient!lb;)V")
	@Override
	public void method7456(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class122 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Class49 arg5) {
		if (arg5 instanceof Class49_Sub1_Sub1) {
			@Pc(16) Class49_Sub1_Sub1 local16 = (Class49_Sub1_Sub1) arg5;
			if (this.aClass145_5 != null && local16.aClass145_1 != null) {
				this.aClass145_5.method6674(local16.aClass145_1, arg3, arg1, arg0, arg4);
			}
		} else if (arg5 instanceof Class49_Sub2_Sub4) {
			@Pc(38) Class49_Sub2_Sub4 local38 = (Class49_Sub2_Sub4) arg5;
			if (this.aClass145_5 != null && local38.aClass145_5 != null) {
				this.aClass145_5.method6674(local38.aClass145_5, arg3, arg1, arg0, arg4);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!pba", name = "c", descriptor = "(B)I")
	@Override
	public int method5994() {
		return this.aClass145_5 == null ? 0 : this.aClass145_5.TA();
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(Lclient!qa;IIZ)Lclient!vq;")
	private Class305 method5372(@OriginalArg(0) Class122 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(19) Class36 local19 = Static308.aClass96_4.method2274(this.aShort106 & 0xFFFF);
		@Pc(27) Class205 local27;
		@Pc(40) Class205 local40;
		if (this.aBoolean461) {
			local27 = Static209.aClass205Array2[this.aByte92];
			local40 = Static16.aClass205Array1[0];
		} else {
			local27 = Static16.aClass205Array1[this.aByte92];
			if (this.aByte92 < 3) {
				local40 = Static16.aClass205Array1[this.aByte92 + 1];
			} else {
				local40 = null;
			}
		}
		return local19.method963(super.anInt7141, local27, super.anInt7137, this.aByte91 == 11 ? 10 : this.aByte91, arg1, arg0, super.anInt7140, local40, this.aByte91 == 11 ? this.aByte90 + 4 : this.aByte90, arg2);
	}

	@OriginalMember(owner = "client!pba", name = "b", descriptor = "(B)V")
	@Override
	public void method7457() {
		this.aBoolean460 = false;
		if (this.aClass145_5 != null) {
			this.aClass145_5.m(this.aClass145_5.ba() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(BLclient!qa;)Lclient!qba;")
	@Override
	public Class72_Sub7 method7453(@OriginalArg(1) Class122 arg0) {
		if (this.aClass145_5 == null) {
			return null;
		}
		@Pc(19) Class118 local19 = arg0.method7256();
		local19.oa(super.anInt7137, super.anInt7140, super.anInt7141);
		@Pc(29) Class72_Sub7 local29 = null;
		if (this.aBoolean462) {
			local29 = Static186.method2914(1);
		}
		this.aClass145_5.method6686(local19, local29 == null ? null : local29.aClass72_Sub2Array1[0], 0);
		return local29;
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(ILclient!qa;I)Lclient!r;")
	private Class145 method5373(@OriginalArg(0) int arg0, @OriginalArg(1) Class122 arg1) {
		if (this.aClass145_5 != null && arg1.method7225(this.aClass145_5.ba(), arg0) == 0) {
			return this.aClass145_5;
		} else {
			@Pc(29) Class305 local29 = this.method5372(arg1, arg0, false);
			return local29 == null ? null : local29.aClass145_7;
		}
	}

	@OriginalMember(owner = "client!pba", name = "b", descriptor = "(I)I")
	@Override
	public int method7467() {
		return this.aShort106 & 0xFFFF;
	}

	@OriginalMember(owner = "client!pba", name = "c", descriptor = "(I)I")
	@Override
	public int method7469() {
		return this.aByte90;
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method7470(@OriginalArg(0) Class122 arg0) {
		@Pc(29) Class1_Sub1_Sub9 local29;
		if (this.aClass1_Sub1_Sub9_4 == null && this.aBoolean463) {
			@Pc(22) Class305 local22 = this.method5372(arg0, 262144, true);
			local29 = local22 == null ? null : local22.aClass1_Sub1_Sub9_6;
		} else {
			local29 = this.aClass1_Sub1_Sub9_4;
			this.aClass1_Sub1_Sub9_4 = null;
		}
		if (local29 != null) {
			Static371.method5720(local29, this.aByte92, super.anInt7137, super.anInt7141, null);
		}
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(I)I")
	@Override
	public int method7465() {
		return this.aByte91;
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(IILclient!qa;I)Z")
	@Override
	public boolean method7452(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class122 arg2) {
		@Pc(15) Class145 local15 = this.method5373(131072, arg2);
		if (local15 == null) {
			return false;
		} else {
			@Pc(20) Class118 local20 = arg2.method7256();
			local20.oa(super.anInt7137, super.anInt7140, super.anInt7141);
			return local15.method6683(arg0, arg1, local20, false);
		}
	}
}
