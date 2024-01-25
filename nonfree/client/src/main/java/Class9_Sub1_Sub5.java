import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oaa")
public abstract class Class9_Sub1_Sub5 extends Class9_Sub1 {

	@OriginalMember(owner = "client!oaa", name = "<init>", descriptor = "(IIIII)V")
	public Class9_Sub1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super.aByte140 = (byte) arg4;
		super.anInt10695 = arg2;
		super.aByte139 = (byte) arg3;
		super.anInt10690 = arg1;
		super.anInt10694 = arg0;
	}

	@OriginalMember(owner = "client!oaa", name = "f", descriptor = "(B)Z")
	@Override
	public final boolean method9079() {
		return Static181.aBooleanArrayArray2[(super.anInt10694 >> Static626.anInt9669) - (Static507.anInt8070 - Static720.anInt11190)][Static720.anInt11190 + (super.anInt10695 >> Static626.anInt9669) - Static527.anInt8230];
	}

	@OriginalMember(owner = "client!oaa", name = "f", descriptor = "(I)V")
	@Override
	public final void method9086() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Lclient!ha;I)Z")
	@Override
	public final boolean method9082(@OriginalArg(0) Class22 arg0) {
		@Pc(22) Class181 local22 = Static84.method1819(super.aByte139, super.anInt10694 >> Static626.anInt9669, super.anInt10695 >> Static626.anInt9669);
		return local22 != null && local22.aClass9_Sub1_Sub1_1.aBoolean725 ? Static218.method3254(super.aByte139, super.anInt10695 >> Static626.anInt9669, local22.aClass9_Sub1_Sub1_1.method9081() + this.method9081(), super.anInt10694 >> Static626.anInt9669) : Static323.method4705(super.aByte139, super.anInt10695 >> Static626.anInt9669, super.anInt10694 >> Static626.anInt9669);
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Lclient!ee;Lclient!ha;IZIIZ)V")
	@Override
	public final void method9091(@OriginalArg(0) Class9_Sub1 arg0, @OriginalArg(1) Class22 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "([Lclient!jw;I)I")
	@Override
	public final int method9094(@OriginalArg(0) Class3_Sub5[] arg0) {
		return this.method9096(super.anInt10694 >> Static626.anInt9669, super.anInt10695 >> Static626.anInt9669, arg0);
	}

	@OriginalMember(owner = "client!oaa", name = "b", descriptor = "(Z)Z")
	@Override
	public final boolean method9077() {
		return false;
	}
}
