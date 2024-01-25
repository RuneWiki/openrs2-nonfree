import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nr")
public final class Class4_Sub1_Sub1_Sub3 extends Class4_Sub1_Sub1 implements Interface9 {

	@OriginalMember(owner = "client!nr", name = "pb", descriptor = "Lclient!rga;")
	private Class315 aClass315_6;

	@OriginalMember(owner = "client!nr", name = "W", descriptor = "Z")
	private boolean aBoolean450 = false;

	@OriginalMember(owner = "client!nr", name = "kb", descriptor = "Lclient!mca;")
	public final Class230 aClass230_3;

	@OriginalMember(owner = "client!nr", name = "T", descriptor = "Z")
	private final boolean aBoolean451;

	@OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(Lclient!ha;Lclient!tk;IIIIIZIIIIIII)V")
	public Class4_Sub1_Sub1_Sub3(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Class354 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt9378 == 1, Static325.method4959(arg12, arg13));
		this.aClass230_3 = new Class230(arg0, arg1, arg12, arg13, super.aByte139, arg3, this, arg7, arg14);
		this.aBoolean451 = arg1.anInt9386 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(BLclient!ha;)V")
	@Override
	public void method8342(@OriginalArg(1) Class100 arg0) {
		@Pc(17) Class43 local17 = this.aClass230_3.method5196(262144, true, arg0, true);
		if (local17 != null) {
			@Pc(22) Class10 local22 = arg0.method8610();
			local22.method4214(super.anInt9805, super.anInt9797, super.anInt9803);
			this.aClass230_3.method5193(super.aShort103, super.aShort102, super.aShort105, super.aShort104, arg0, local22, local17, false);
		}
	}

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "(I)I")
	@Override
	public int method8366() {
		return this.aClass230_3.anInt5809;
	}

	@OriginalMember(owner = "client!nr", name = "e", descriptor = "(B)I")
	@Override
	public int method8341(@OriginalArg(0) byte arg0) {
		if (arg0 >= -112) {
			this.method8361((Class100) null);
		}
		return this.aClass230_3.method5184(124);
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8363(@OriginalArg(1) Class100 arg0) {
		this.aClass230_3.method5195(arg0);
	}

	@OriginalMember(owner = "client!nr", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method8339() {
		return false;
	}

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "(B)I")
	@Override
	public int method8367() {
		return this.aClass230_3.anInt5822;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(ZILclient!ha;ILclient!rda;II)V")
	@Override
	public void method8354(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class100 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class4_Sub1 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg5 <= -10) {
			throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8361(@OriginalArg(0) Class100 arg0) {
		this.aClass230_3.method5192(arg0);
	}

	@OriginalMember(owner = "client!nr", name = "d", descriptor = "(B)V")
	@Override
	public void method8351(@OriginalArg(0) byte arg0) {
		if (arg0 < -41) {
			throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!nr", name = "f", descriptor = "(B)Z")
	@Override
	public boolean method8356() {
		return false;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lclient!dq;I)V")
	public void method5892(@OriginalArg(0) Class87 arg0) {
		this.aClass230_3.method5190(arg0);
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8365() {
		return this.aClass230_3.method5178();
	}

	@OriginalMember(owner = "client!nr", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method8344() {
		return this.aBoolean450;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(IIILclient!ha;)Z")
	@Override
	public boolean method8353(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class100 arg2) {
		@Pc(14) Class43 local14 = this.aClass230_3.method5196(131072, false, arg2, false);
		if (local14 == null) {
			return false;
		} else {
			@Pc(22) Class10 local22 = arg2.method8610();
			local22.method4214(super.anInt9805, super.anInt9797, super.anInt9803);
			return Static305.aBoolean339 ? local14.method8844(arg1, arg0, local22, false, 0, Static216.anInt1170) : local14.method8852(arg1, arg0, local22, false, 0);
		}
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lclient!ha;B)Lclient!kv;")
	@Override
	public Class4_Sub6 method8355(@OriginalArg(0) Class100 arg0) {
		@Pc(14) Class43 local14 = this.aClass230_3.method5196(2048, false, arg0, true);
		if (local14 == null) {
			return null;
		}
		@Pc(22) Class10 local22 = arg0.method8610();
		local22.method4214(super.anInt9805, super.anInt9797, super.anInt9803);
		@Pc(45) Class4_Sub6 local45 = Static281.method4512(this.aBoolean451, 1);
		this.aClass230_3.method5193(super.aShort103, super.aShort102, super.aShort105, super.aShort104, arg0, local22, local14, true);
		if (Static305.aBoolean339) {
			local14.method8846(local22, local45.aClass4_Sub8Array1[0], Static216.anInt1170, 0);
		} else {
			local14.method8849(local22, local45.aClass4_Sub8Array1[0], 0);
		}
		if (this.aClass230_3.aClass4_Sub9_4 != null) {
			@Pc(95) Class336 local95 = this.aClass230_3.aClass4_Sub9_4.method8046();
			if (Static305.aBoolean339) {
				arg0.method8618(local95, Static216.anInt1170);
			} else {
				arg0.method8586(local95);
			}
		}
		this.aBoolean450 = local14.F() || this.aClass230_3.aClass4_Sub9_4 != null;
		if (this.aClass315_6 == null) {
			this.aClass315_6 = Static645.method8909(local14, super.anInt9805, super.anInt9803, super.anInt9797);
		} else {
			Static282.method4541(super.anInt9803, local14, this.aClass315_6, super.anInt9805, super.anInt9797);
		}
		return local45;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(I)V")
	@Override
	public void method8362() {
	}

	@OriginalMember(owner = "client!nr", name = "c", descriptor = "(B)I")
	@Override
	public int method8364() {
		return this.aClass230_3.anInt5826;
	}

	@OriginalMember(owner = "client!nr", name = "g", descriptor = "(I)I")
	@Override
	public int method8347() {
		return this.aClass230_3.method5191();
	}

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "(Lclient!ha;B)Lclient!rga;")
	@Override
	public Class315 method8350(@OriginalArg(0) Class100 arg0) {
		return this.aClass315_6;
	}
}
