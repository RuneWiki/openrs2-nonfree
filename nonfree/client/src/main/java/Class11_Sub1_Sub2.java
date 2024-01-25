import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cba")
public abstract class Class11_Sub1_Sub2 extends Class11_Sub1 {

	@OriginalMember(owner = "client!cba", name = "<init>", descriptor = "(IIIII)V")
	public Class11_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super.anInt8908 = arg1;
		super.anInt8902 = arg0;
		super.aByte113 = (byte) arg3;
		super.anInt8906 = arg2;
		super.aByte112 = (byte) arg4;
	}

	@OriginalMember(owner = "client!cba", name = "i", descriptor = "(I)V")
	@Override
	public final void method7222() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!cba", name = "h", descriptor = "(I)Z")
	@Override
	public final boolean method7216() {
		return Static496.aBooleanArrayArray7[(super.anInt8902 >> Static166.anInt7796) + Static548.anInt9156 - Static115.anInt1985][Static548.anInt9156 + (super.anInt8906 >> Static166.anInt7796) - Static326.anInt4975];
	}

	@OriginalMember(owner = "client!cba", name = "f", descriptor = "(B)Z")
	@Override
	public final boolean method7221() {
		@Pc(20) Class21 local20 = Static488.method6717(super.aByte113, super.anInt8902 >> Static166.anInt7796, super.anInt8906 >> Static166.anInt7796);
		return local20 != null && local20.aClass11_Sub1_Sub1_1.aBoolean574 ? Static578.method7757(super.anInt8906 >> Static166.anInt7796, super.anInt8902 >> Static166.anInt7796, local20.aClass11_Sub1_Sub1_1.method7212() + this.method7212(), super.aByte113) : Static120.method2175(super.anInt8906 >> Static166.anInt7796, super.aByte113, super.anInt8902 >> Static166.anInt7796);
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "([Lclient!tw;I)I")
	@Override
	public final int method7204(@OriginalArg(0) Class1_Sub24[] arg0) {
		return this.method7203(super.anInt8906 >> Static166.anInt7796, arg0, super.anInt8902 >> Static166.anInt7796);
	}

	@OriginalMember(owner = "client!cba", name = "g", descriptor = "(I)Z")
	@Override
	public final boolean method7214() {
		return false;
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(Lclient!vv;IIZLclient!r;II)V")
	@Override
	public final void method7215(@OriginalArg(0) Class11_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class78 arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}
}
