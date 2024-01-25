import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public final class Class129 {

	@OriginalMember(owner = "client!ka", name = "g", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray2 = new Rectangle[100];

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
	public final int anInt3566;

	static {
		for (@Pc(10) int local10 = 0; local10 < 100; local10++) {
			aRectangleArray2[local10] = new Rectangle();
		}
	}

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(I)V")
	public Class129(@OriginalArg(0) int arg0) {
		this.anInt3566 = arg0;
	}

	@OriginalMember(owner = "client!ka", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
