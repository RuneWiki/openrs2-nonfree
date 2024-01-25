import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public abstract class Class11_Sub1_Sub5 extends Class11_Sub1 {

	@OriginalMember(owner = "client!ml", name = "M", descriptor = "S")
	public short aShort59;

	@OriginalMember(owner = "client!ml", name = "L", descriptor = "S")
	public short aShort58;

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class11_Sub1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super.anInt8908 = arg1;
		super.anInt8902 = arg0;
		super.aByte113 = (byte) arg3;
		super.aByte112 = (byte) arg4;
		this.aShort59 = (short) arg5;
		super.anInt8906 = arg2;
		this.aShort58 = (short) arg6;
	}

	@OriginalMember(owner = "client!ml", name = "h", descriptor = "(I)Z")
	@Override
	public final boolean method7216() {
		return Static496.aBooleanArrayArray7[(super.anInt8902 >> Static166.anInt7796) + Static548.anInt9156 - Static115.anInt1985][Static548.anInt9156 + (super.anInt8906 >> Static166.anInt7796) - Static326.anInt4975];
	}

	@OriginalMember(owner = "client!ml", name = "f", descriptor = "(B)Z")
	@Override
	public final boolean method7221() {
		return Static578.method7757(super.anInt8906 >> Static166.anInt7796, super.anInt8902 >> Static166.anInt7796, this.method7212(), super.aByte112);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "([Lclient!tw;I)I")
	@Override
	public final int method7204(@OriginalArg(0) Class1_Sub24[] arg0) {
		return this.method7203(super.anInt8906 >> Static166.anInt7796, arg0, super.anInt8902 >> Static166.anInt7796);
	}

	@OriginalMember(owner = "client!ml", name = "i", descriptor = "(I)V")
	@Override
	public final void method7222() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ml", name = "g", descriptor = "(I)Z")
	@Override
	public final boolean method7214() {
		return false;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lclient!vv;IIZLclient!r;II)V")
	@Override
	public final void method7215(@OriginalArg(0) Class11_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class78 arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}
}
