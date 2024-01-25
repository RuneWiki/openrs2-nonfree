import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bj")
public final class Class20_Sub1 extends Class20 {

	@OriginalMember(owner = "client!bj", name = "A", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray1 = new Rectangle[100];

	@OriginalMember(owner = "client!bj", name = "p", descriptor = "Ljava/lang/String;")
	public String aString9;

	@OriginalMember(owner = "client!bj", name = "r", descriptor = "I")
	public int anInt500;

	@OriginalMember(owner = "client!bj", name = "C", descriptor = "Ljava/lang/String;")
	public String aString10;

	@OriginalMember(owner = "client!bj", name = "x", descriptor = "I")
	public int anInt506 = -1;

	static {
		for (@Pc(6) int local6 = 0; local6 < 100; local6++) {
			aRectangleArray1[local6] = new Rectangle();
		}
	}

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "(B)Lclient!lq;")
	public Class125 method733() {
		return Static92.aClass125Array2[super.anInt492];
	}
}
