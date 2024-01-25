import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rg")
public final class Class305 {

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray1 = new Rectangle[100];

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "[I")
	public int[] anIntArray464;

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "Lclient!aga;")
	public Class5_Sub2_Sub2 aClass5_Sub2_Sub2_1;

	@OriginalMember(owner = "client!rg", name = "d", descriptor = "I")
	public int anInt8528;

	static {
		for (@Pc(6) int local6 = 0; local6 < 100; local6++) {
			aRectangleArray1[local6] = new Rectangle();
		}
	}
}
