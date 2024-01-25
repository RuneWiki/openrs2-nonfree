import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jg")
public abstract class Class14_Sub1_Sub4 extends Class14_Sub1 {

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(IIIII)V")
	public Class14_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super.aByte126 = (byte) arg4;
		super.anInt9321 = arg1;
		super.aByte125 = (byte) arg3;
		super.anInt9315 = arg2;
		super.anInt9317 = arg0;
	}

	@OriginalMember(owner = "client!jg", name = "d", descriptor = "(I)Z")
	@Override
	public final boolean method7992() {
		return false;
	}

	@OriginalMember(owner = "client!jg", name = "g", descriptor = "(I)V")
	@Override
	public final void method8001() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!jg", name = "e", descriptor = "(I)Z")
	@Override
	public final boolean method7993() {
		return Static601.aBooleanArrayArray17[Static597.anInt9765 + (super.anInt9317 >> Static162.anInt2830) - Static484.anInt8046][(super.anInt9315 >> Static162.anInt2830) + (Static597.anInt9765 - Static263.anInt4379)];
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lclient!kf;Lclient!ha;IIIZI)V")
	@Override
	public final void method7996(@OriginalArg(0) Class14_Sub1 arg0, @OriginalArg(1) Class126 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(Lclient!ha;B)Z")
	@Override
	public final boolean method8000(@OriginalArg(0) Class126 arg0) {
		@Pc(15) Class66 local15 = Static501.method8160(super.aByte125, super.anInt9317 >> Static162.anInt2830, super.anInt9315 >> Static162.anInt2830);
		return local15 != null && local15.aClass14_Sub1_Sub1_1.aBoolean376 ? Static435.method6486(super.anInt9315 >> Static162.anInt2830, local15.aClass14_Sub1_Sub1_1.method8004() + this.method8004(), super.aByte125, super.anInt9317 >> Static162.anInt2830) : Static422.method6374(super.aByte125, super.anInt9317 >> Static162.anInt2830, super.anInt9315 >> Static162.anInt2830);
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "([Lclient!tn;B)I")
	@Override
	public final int method7990(@OriginalArg(0) Class5_Sub27[] arg0) {
		return this.method8005(arg0, super.anInt9317 >> Static162.anInt2830, super.anInt9315 >> Static162.anInt2830);
	}
}
