import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fja")
public final class Class4_Sub1_Sub3_Sub1 extends Class4_Sub1_Sub3 implements Interface9 {

	@OriginalMember(owner = "client!fja", name = "S", descriptor = "Lclient!rga;")
	private Class315 aClass315_2;

	@OriginalMember(owner = "client!fja", name = "ab", descriptor = "Z")
	private boolean aBoolean231 = false;

	@OriginalMember(owner = "client!fja", name = "J", descriptor = "Lclient!mca;")
	public final Class230 aClass230_1;

	@OriginalMember(owner = "client!fja", name = "db", descriptor = "Z")
	private final boolean aBoolean230;

	@OriginalMember(owner = "client!fja", name = "<init>", descriptor = "(Lclient!ha;Lclient!tk;IIIIIZII)V")
	public Class4_Sub1_Sub3_Sub1(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Class354 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(arg4, arg5, arg6, arg2, arg3, arg1.anInt9429);
		this.aClass230_1 = new Class230(arg0, arg1, 22, arg8, arg2, arg3, this, arg7, arg9);
		this.aBoolean230 = arg1.anInt9386 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!fja", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8365() {
		return this.aClass230_1.method5178();
	}

	@OriginalMember(owner = "client!fja", name = "f", descriptor = "(B)Z")
	@Override
	public boolean method8356() {
		return false;
	}

	@OriginalMember(owner = "client!fja", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8363(@OriginalArg(1) Class100 arg0) {
		this.aClass230_1.method5195(arg0);
	}

	@OriginalMember(owner = "client!fja", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method8344() {
		return this.aBoolean231;
	}

	@OriginalMember(owner = "client!fja", name = "c", descriptor = "(B)I")
	@Override
	public int method8364() {
		return this.aClass230_1.anInt5826;
	}

	@OriginalMember(owner = "client!fja", name = "e", descriptor = "(B)I")
	@Override
	public int method8341(@OriginalArg(0) byte arg0) {
		if (arg0 >= -112) {
			Static158.aClass371_5 = null;
		}
		return this.aClass230_1.method5184(108);
	}

	@OriginalMember(owner = "client!fja", name = "a", descriptor = "(ZILclient!ha;ILclient!rda;II)V")
	@Override
	public void method8354(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class100 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class4_Sub1 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg5 > -10) {
			Static158.aClass371_5 = null;
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!fja", name = "a", descriptor = "(I)V")
	@Override
	public void method8362() {
	}

	@OriginalMember(owner = "client!fja", name = "b", descriptor = "(B)I")
	@Override
	public int method8367() {
		return this.aClass230_1.anInt5822;
	}

	@OriginalMember(owner = "client!fja", name = "a", descriptor = "(Lclient!ha;B)Lclient!kv;")
	@Override
	public Class4_Sub6 method8355(@OriginalArg(0) Class100 arg0) {
		@Pc(14) Class43 local14 = this.aClass230_1.method5196(2048, false, arg0, true);
		if (local14 == null) {
			return null;
		}
		@Pc(22) Class10 local22 = arg0.method8610();
		local22.method4214(super.anInt9805, super.anInt9797, super.anInt9803);
		@Pc(42) Class4_Sub6 local42 = Static281.method4512(this.aBoolean230, 1);
		@Pc(47) int local47 = super.anInt9805 >> 9;
		@Pc(52) int local52 = super.anInt9803 >> 9;
		this.aClass230_1.method5193(local47, local52, local52, local47, arg0, local22, local14, true);
		if (Static305.aBoolean339) {
			local14.method8846(local22, local42.aClass4_Sub8Array1[0], Static216.anInt1170, 0);
		} else {
			local14.method8849(local22, local42.aClass4_Sub8Array1[0], 0);
		}
		if (this.aClass230_1.aClass4_Sub9_4 != null) {
			@Pc(98) Class336 local98 = this.aClass230_1.aClass4_Sub9_4.method8046();
			if (Static305.aBoolean339) {
				arg0.method8618(local98, Static216.anInt1170);
			} else {
				arg0.method8586(local98);
			}
		}
		this.aBoolean231 = local14.F() || this.aClass230_1.aClass4_Sub9_4 != null;
		if (this.aClass315_2 == null) {
			this.aClass315_2 = Static645.method8909(local14, super.anInt9805, super.anInt9803, super.anInt9797);
		} else {
			Static282.method4541(super.anInt9803, local14, this.aClass315_2, super.anInt9805, super.anInt9797);
		}
		return local42;
	}

	@OriginalMember(owner = "client!fja", name = "d", descriptor = "(B)V")
	@Override
	public void method8351(@OriginalArg(0) byte arg0) {
		if (arg0 > -41) {
			this.aBoolean231 = false;
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!fja", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8361(@OriginalArg(0) Class100 arg0) {
		this.aClass230_1.method5192(arg0);
	}

	@OriginalMember(owner = "client!fja", name = "b", descriptor = "(I)I")
	@Override
	public int method8366() {
		return this.aClass230_1.anInt5809;
	}

	@OriginalMember(owner = "client!fja", name = "a", descriptor = "(BLclient!ha;)V")
	@Override
	public void method8342(@OriginalArg(1) Class100 arg0) {
		@Pc(12) Class43 local12 = this.aClass230_1.method5196(262144, true, arg0, true);
		if (local12 == null) {
			return;
		}
		@Pc(19) int local19 = super.anInt9805 >> 9;
		@Pc(24) int local24 = super.anInt9803 >> 9;
		@Pc(27) Class10 local27 = arg0.method8610();
		local27.method4214(super.anInt9805, super.anInt9797, super.anInt9803);
		this.aClass230_1.method5193(local19, local24, local24, local19, arg0, local27, local12, false);
	}

	@OriginalMember(owner = "client!fja", name = "a", descriptor = "(IIILclient!ha;)Z")
	@Override
	public boolean method8353(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class100 arg2) {
		@Pc(14) Class43 local14 = this.aClass230_1.method5196(131072, false, arg2, false);
		if (local14 == null) {
			return false;
		} else {
			@Pc(22) Class10 local22 = arg2.method8610();
			local22.method4214(super.anInt9805, super.anInt9797, super.anInt9803);
			return Static305.aBoolean339 ? local14.method8844(arg1, arg0, local22, false, 0, Static216.anInt1170) : local14.method8852(arg1, arg0, local22, false, 0);
		}
	}

	@OriginalMember(owner = "client!fja", name = "a", descriptor = "(BLclient!dq;)V")
	public void method2931(@OriginalArg(1) Class87 arg0) {
		this.aClass230_1.method5190(arg0);
	}

	@OriginalMember(owner = "client!fja", name = "g", descriptor = "(I)I")
	@Override
	public int method8347() {
		return this.aClass230_1.method5191();
	}

	@OriginalMember(owner = "client!fja", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method8339() {
		return false;
	}

	@OriginalMember(owner = "client!fja", name = "b", descriptor = "(Lclient!ha;B)Lclient!rga;")
	@Override
	public Class315 method8350(@OriginalArg(0) Class100 arg0) {
		return this.aClass315_2;
	}
}
