import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nha")
public final class Class4_Sub1_Sub2_Sub2 extends Class4_Sub1_Sub2 implements Interface9 {

	@OriginalMember(owner = "client!nha", name = "K", descriptor = "Lclient!rga;")
	private Class315 aClass315_5;

	@OriginalMember(owner = "client!nha", name = "ab", descriptor = "Z")
	private boolean aBoolean432 = false;

	@OriginalMember(owner = "client!nha", name = "bb", descriptor = "Lclient!mca;")
	public final Class230 aClass230_2;

	@OriginalMember(owner = "client!nha", name = "hb", descriptor = "Z")
	private final boolean aBoolean433;

	@OriginalMember(owner = "client!nha", name = "<init>", descriptor = "(Lclient!ha;Lclient!tk;IIIIIZIII)V")
	public Class4_Sub1_Sub2_Sub2(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Class354 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg4, arg5, arg6, arg2, arg3, Static167.method3017(arg8, arg9));
		this.aClass230_2 = new Class230(arg0, arg1, arg8, arg9, super.aByte139, arg3, this, arg7, arg10);
		this.aBoolean433 = arg1.anInt9386 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!nha", name = "b", descriptor = "(I)I")
	@Override
	public int method8366() {
		return this.aClass230_2.anInt5809;
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(ZILclient!ha;ILclient!rda;II)V")
	@Override
	public void method8354(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class100 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class4_Sub1 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg5 <= -10) {
			throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(IIILclient!ha;)Z")
	@Override
	public boolean method8353(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class100 arg2) {
		@Pc(14) Class43 local14 = this.aClass230_2.method5196(131072, false, arg2, false);
		if (local14 == null) {
			return false;
		} else {
			@Pc(22) Class10 local22 = arg2.method8610();
			local22.method4214(super.anInt9805, super.anInt9797, super.anInt9803);
			return Static305.aBoolean339 ? local14.method8844(arg1, arg0, local22, false, 0, Static216.anInt1170) : local14.method8852(arg1, arg0, local22, false, 0);
		}
	}

	@OriginalMember(owner = "client!nha", name = "d", descriptor = "(B)V")
	@Override
	public void method8351(@OriginalArg(0) byte arg0) {
		if (arg0 <= -41) {
			throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(I)V")
	@Override
	public void method8362() {
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(BLclient!ha;)V")
	@Override
	public void method8342(@OriginalArg(1) Class100 arg0) {
		@Pc(12) Class43 local12 = this.aClass230_2.method5196(262144, true, arg0, true);
		if (local12 == null) {
			return;
		}
		@Pc(28) int local28 = super.anInt9805 >> 9;
		@Pc(33) int local33 = super.anInt9803 >> 9;
		@Pc(36) Class10 local36 = arg0.method8610();
		local36.method4214(super.anInt9805, super.anInt9797, super.anInt9803);
		this.aClass230_2.method5193(local28, local33, local33, local28, arg0, local36, local12, false);
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8365() {
		return this.aClass230_2.method5178();
	}

	@OriginalMember(owner = "client!nha", name = "b", descriptor = "(Lclient!ha;B)Lclient!rga;")
	@Override
	public Class315 method8350(@OriginalArg(0) Class100 arg0) {
		return this.aClass315_5;
	}

	@OriginalMember(owner = "client!nha", name = "e", descriptor = "(B)I")
	@Override
	public int method8341(@OriginalArg(0) byte arg0) {
		if (arg0 >= -112) {
			this.method8367();
		}
		return this.aClass230_2.method5184(108);
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8363(@OriginalArg(1) Class100 arg0) {
		this.aClass230_2.method5195(arg0);
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(Lclient!ha;B)Lclient!kv;")
	@Override
	public Class4_Sub6 method8355(@OriginalArg(0) Class100 arg0) {
		@Pc(14) Class43 local14 = this.aClass230_2.method5196(2048, false, arg0, true);
		if (local14 == null) {
			return null;
		}
		@Pc(22) Class10 local22 = arg0.method8610();
		local22.method4214(super.anInt9805, super.anInt9797, super.anInt9803);
		@Pc(36) Class4_Sub6 local36 = Static281.method4512(this.aBoolean433, 1);
		@Pc(41) int local41 = super.anInt9805 >> 9;
		@Pc(46) int local46 = super.anInt9803 >> 9;
		this.aClass230_2.method5193(local41, local46, local46, local41, arg0, local22, local14, true);
		if (Static305.aBoolean339) {
			local14.method8846(local22, local36.aClass4_Sub8Array1[0], Static216.anInt1170, 0);
		} else {
			local14.method8849(local22, local36.aClass4_Sub8Array1[0], 0);
		}
		if (this.aClass230_2.aClass4_Sub9_4 != null) {
			@Pc(98) Class336 local98 = this.aClass230_2.aClass4_Sub9_4.method8046();
			if (Static305.aBoolean339) {
				arg0.method8618(local98, Static216.anInt1170);
			} else {
				arg0.method8586(local98);
			}
		}
		this.aBoolean432 = local14.F() || this.aClass230_2.aClass4_Sub9_4 != null;
		if (this.aClass315_5 == null) {
			this.aClass315_5 = Static645.method8909(local14, super.anInt9805, super.anInt9803, super.anInt9797);
		} else {
			Static282.method4541(super.anInt9803, local14, this.aClass315_5, super.anInt9805, super.anInt9797);
		}
		return local36;
	}

	@OriginalMember(owner = "client!nha", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method8344() {
		return this.aBoolean432;
	}

	@OriginalMember(owner = "client!nha", name = "b", descriptor = "(B)I")
	@Override
	public int method8367() {
		return this.aClass230_2.anInt5822;
	}

	@OriginalMember(owner = "client!nha", name = "f", descriptor = "(B)Z")
	@Override
	public boolean method8356() {
		return false;
	}

	@OriginalMember(owner = "client!nha", name = "g", descriptor = "(I)I")
	@Override
	public int method8347() {
		return this.aClass230_2.method5191();
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(Lclient!dq;Z)V")
	public void method5780(@OriginalArg(0) Class87 arg0) {
		this.aClass230_2.method5190(arg0);
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8361(@OriginalArg(0) Class100 arg0) {
		this.aClass230_2.method5192(arg0);
	}

	@OriginalMember(owner = "client!nha", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method8339() {
		return false;
	}

	@OriginalMember(owner = "client!nha", name = "c", descriptor = "(B)I")
	@Override
	public int method8364() {
		return this.aClass230_2.anInt5826;
	}
}
