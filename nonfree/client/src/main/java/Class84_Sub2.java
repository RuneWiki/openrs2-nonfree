import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jca")
public final class Class84_Sub2 extends Class84 {

	@OriginalMember(owner = "client!jca", name = "A", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray2 = new Rectangle[100];

	@OriginalMember(owner = "client!jca", name = "u", descriptor = "I")
	public final int anInt5113;

	@OriginalMember(owner = "client!jca", name = "z", descriptor = "I")
	public final int anInt5118;

	static {
		for (@Pc(4) int local4 = 0; local4 < 100; local4++) {
			aRectangleArray2[local4] = new Rectangle();
		}
	}

	@OriginalMember(owner = "client!jca", name = "<init>", descriptor = "(Lclient!eaa;Lclient!cq;IIIIIIIII)V")
	public Class84_Sub2(@OriginalArg(0) Class92 arg0, @OriginalArg(1) Class65 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt5113 = arg9;
		this.anInt5118 = arg10;
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(I)Lclient!aca;")
	@Override
	public Class6 method8749() {
		return Static109.aClass6_8;
	}
}
