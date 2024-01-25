import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rj")
public final class Class320 {

	@OriginalMember(owner = "client!rj", name = "d", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray2 = new Rectangle[100];

	static {
		for (@Pc(37) int local37 = 0; local37 < 100; local37++) {
			aRectangleArray2[local37] = new Rectangle();
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(B)Z")
	public boolean method7780() {
		return Static155.aClass320_4 == this | Static146.aClass320_3 == this;
	}

	@OriginalMember(owner = "client!rj", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
