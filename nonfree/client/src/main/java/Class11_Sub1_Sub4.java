import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public abstract class Class11_Sub1_Sub4 extends Class11_Sub1 {

	@OriginalMember(owner = "client!jb", name = "C", descriptor = "S")
	public final short aShort109;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(IIIIII)V")
	protected Class11_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super.aByte113 = (byte) arg3;
		super.aByte112 = (byte) arg4;
		super.anInt8902 = arg0;
		super.anInt8908 = arg1;
		super.anInt8906 = arg2;
		this.aShort109 = (short) arg5;
	}

	@OriginalMember(owner = "client!jb", name = "f", descriptor = "(B)Z")
	@Override
	public final boolean method7221() {
		return Static120.method2175(super.anInt8906 >> Static166.anInt7796, super.aByte112, super.anInt8902 >> Static166.anInt7796);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "([Lclient!tw;I)I")
	@Override
	public final int method7204(@OriginalArg(0) Class1_Sub24[] arg0) {
		return this.method7203(super.anInt8906 >> Static166.anInt7796, arg0, super.anInt8902 >> Static166.anInt7796);
	}

	@OriginalMember(owner = "client!jb", name = "h", descriptor = "(I)Z")
	@Override
	public final boolean method7216() {
		return Static496.aBooleanArrayArray7[Static548.anInt9156 + (super.anInt8902 >> Static166.anInt7796) - Static115.anInt1985][Static548.anInt9156 + (super.anInt8906 >> Static166.anInt7796) - Static326.anInt4975];
	}
}
