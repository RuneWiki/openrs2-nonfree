import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ig")
public final class Class6_Sub1_Sub11 extends Class6_Sub1 {

	@OriginalMember(owner = "client!ig", name = "A", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray1 = new Rectangle[100];

	@OriginalMember(owner = "client!ig", name = "B", descriptor = "[I")
	public static final int[] anIntArray407;

	@OriginalMember(owner = "client!ig", name = "z", descriptor = "Lclient!mq;")
	public final Class29_Sub2_Sub2 aClass29_Sub2_Sub2_1;

	static {
		@Pc(10) int local10;
		for (local10 = 0; local10 < 100; local10++) {
			aRectangleArray1[local10] = new Rectangle();
		}
		anIntArray407 = new int[4096];
		for (local10 = 0; local10 < 4096; local10++) {
			anIntArray407[local10] = Static111.method1752(local10);
		}
	}

	@OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(Lclient!mq;)V")
	public Class6_Sub1_Sub11(@OriginalArg(0) Class29_Sub2_Sub2 arg0) {
		this.aClass29_Sub2_Sub2_1 = arg0;
	}
}
