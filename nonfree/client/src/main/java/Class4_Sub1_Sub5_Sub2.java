import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uk")
public final class Class4_Sub1_Sub5_Sub2 extends Class4_Sub1_Sub5 implements Interface9 {

	@OriginalMember(owner = "client!uk", name = "T", descriptor = "Lclient!rga;")
	private Class315 aClass315_8;

	@OriginalMember(owner = "client!uk", name = "ab", descriptor = "Z")
	private boolean aBoolean690 = false;

	@OriginalMember(owner = "client!uk", name = "db", descriptor = "Lclient!mca;")
	public Class230 aClass230_4;

	@OriginalMember(owner = "client!uk", name = "Q", descriptor = "Z")
	private final boolean aBoolean689;

	@OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Lclient!ha;Lclient!tk;IIIIIZIIIII)V")
	public Class4_Sub1_Sub5_Sub2(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Class354 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
		this.aClass230_4 = new Class230(arg0, arg1, arg10, arg11, super.aByte139, arg3, this, arg7, arg12);
		this.aBoolean689 = arg1.anInt9386 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8365() {
		return this.aClass230_4.method5178();
	}

	@OriginalMember(owner = "client!uk", name = "f", descriptor = "(B)Z")
	@Override
	public boolean method8356() {
		return false;
	}

	@OriginalMember(owner = "client!uk", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method8344() {
		return this.aBoolean690;
	}

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)I")
	@Override
	public int method8366() {
		return this.aClass230_4.anInt5809;
	}

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "(B)I")
	@Override
	public int method8367() {
		return this.aClass230_4.anInt5822;
	}

	@OriginalMember(owner = "client!uk", name = "c", descriptor = "(B)I")
	@Override
	public int method8364() {
		return this.aClass230_4.anInt5826;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)V")
	@Override
	public void method8362() {
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIILclient!ha;)Z")
	@Override
	public boolean method8353(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class100 arg2) {
		@Pc(12) Class43 local12 = this.aClass230_4.method5196(131072, false, arg2, false);
		if (local12 == null) {
			return false;
		} else {
			@Pc(20) Class10 local20 = arg2.method8610();
			local20.method4214(super.aShort107 + super.anInt9805, super.anInt9797, super.anInt9803 + super.aShort106);
			return Static305.aBoolean339 ? local12.method8844(arg1, arg0, local20, false, 0, Static216.anInt1170) : local12.method8852(arg1, arg0, local20, false, 0);
		}
	}

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "(Lclient!ha;B)Lclient!rga;")
	@Override
	public Class315 method8350(@OriginalArg(0) Class100 arg0) {
		return this.aClass315_8;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lclient!ha;B)Lclient!kv;")
	@Override
	public Class4_Sub6 method8355(@OriginalArg(0) Class100 arg0) {
		@Pc(16) Class43 local16 = this.aClass230_4.method5196(2048, false, arg0, true);
		if (local16 == null) {
			return null;
		}
		@Pc(32) Class10 local32 = arg0.method8610();
		local32.method4214(super.anInt9805 + super.aShort107, super.anInt9797, super.anInt9803 + super.aShort106);
		@Pc(53) Class4_Sub6 local53 = Static281.method4512(this.aBoolean689, 1);
		@Pc(58) int local58 = super.anInt9805 >> 9;
		@Pc(63) int local63 = super.anInt9803 >> 9;
		this.aClass230_4.method5193(local58, local63, local63, local58, arg0, local32, local16, true);
		if (Static305.aBoolean339) {
			local16.method8846(local32, local53.aClass4_Sub8Array1[0], Static216.anInt1170, 0);
		} else {
			local16.method8849(local32, local53.aClass4_Sub8Array1[0], 0);
		}
		if (this.aClass230_4.aClass4_Sub9_4 != null) {
			@Pc(109) Class336 local109 = this.aClass230_4.aClass4_Sub9_4.method8046();
			if (Static305.aBoolean339) {
				arg0.method8618(local109, Static216.anInt1170);
			} else {
				arg0.method8586(local109);
			}
		}
		this.aBoolean690 = local16.F() || this.aClass230_4.aClass4_Sub9_4 != null;
		if (this.aClass315_8 == null) {
			this.aClass315_8 = Static645.method8909(local16, super.anInt9805, super.anInt9803, super.anInt9797);
		} else {
			Static282.method4541(super.anInt9803, local16, this.aClass315_8, super.anInt9805, super.anInt9797);
		}
		return local53;
	}

	@OriginalMember(owner = "client!uk", name = "e", descriptor = "(B)I")
	@Override
	public int method8341(@OriginalArg(0) byte arg0) {
		if (arg0 > -112) {
			this.aClass230_4 = null;
		}
		return this.aClass230_4.method5184(119);
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(ILclient!dq;)V")
	public void method8369(@OriginalArg(1) Class87 arg0) {
		this.aClass230_4.method5190(arg0);
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(BLclient!ha;)V")
	@Override
	public void method8342(@OriginalArg(1) Class100 arg0) {
		@Pc(21) Class43 local21 = this.aClass230_4.method5196(262144, false, arg0, true);
		if (local21 == null) {
			return;
		}
		@Pc(28) int local28 = super.anInt9805 >> 9;
		@Pc(33) int local33 = super.anInt9803 >> 9;
		@Pc(36) Class10 local36 = arg0.method8610();
		local36.method4214(super.anInt9805, super.anInt9797, super.anInt9803);
		this.aClass230_4.method5193(local28, local33, local33, local28, arg0, local36, local21, false);
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8363(@OriginalArg(1) Class100 arg0) {
		this.aClass230_4.method5195(arg0);
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8361(@OriginalArg(0) Class100 arg0) {
		this.aClass230_4.method5192(arg0);
	}

	@OriginalMember(owner = "client!uk", name = "g", descriptor = "(I)I")
	@Override
	public int method8347() {
		return this.aClass230_4.method5191();
	}
}
