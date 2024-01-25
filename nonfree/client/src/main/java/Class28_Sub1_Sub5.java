import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rh")
public abstract class Class28_Sub1_Sub5 extends Class28_Sub1 {

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(IIIII)V")
	public Class28_Sub1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super.aByte173 = (byte) arg4;
		super.aByte174 = (byte) arg3;
		super.anInt10731 = arg2;
		super.anInt10729 = arg0;
		super.anInt10722 = arg1;
	}

	@OriginalMember(owner = "client!rh", name = "j", descriptor = "(I)V")
	@Override
	public final void method9285() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!rh", name = "g", descriptor = "(I)Z")
	@Override
	public final boolean method9280() {
		return Static430.aBooleanArrayArray7[Static7.anInt94 + (super.anInt10729 >> Static391.anInt10262) - Static220.anInt4183][Static7.anInt94 + (super.anInt10731 >> Static391.anInt10262) - Static547.anInt8968];
	}

	@OriginalMember(owner = "client!rh", name = "n", descriptor = "(I)Z")
	@Override
	public final boolean method9297() {
		return false;
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(ILclient!ha;)Z")
	@Override
	public final boolean method9295(@OriginalArg(1) Class13 arg0) {
		@Pc(20) Class125 local20 = Static647.method8984(super.aByte174, super.anInt10729 >> Static391.anInt10262, super.anInt10731 >> Static391.anInt10262);
		return local20 != null && local20.aClass28_Sub1_Sub1_1.aBoolean818 ? Static398.method5613(local20.aClass28_Sub1_Sub1_1.method9296() + this.method9296(), super.anInt10731 >> Static391.anInt10262, super.anInt10729 >> Static391.anInt10262, super.aByte174) : Static304.method4669(super.anInt10729 >> Static391.anInt10262, super.anInt10731 >> Static391.anInt10262, super.aByte174);
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lclient!ha;Lclient!wea;ZIIII)V")
	@Override
	public final void method9290(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class28_Sub1 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(B[Lclient!uca;)I")
	@Override
	public final int method9298(@OriginalArg(1) Class3_Sub15[] arg0) {
		return this.method9279(super.anInt10731 >> Static391.anInt10262, arg0, super.anInt10729 >> Static391.anInt10262);
	}
}
