import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class Class8_Sub5_Sub1_Sub2 extends Class8_Sub5_Sub1 {

	@OriginalMember(owner = "client!td", name = "E", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray2 = new Rectangle[100];

	@OriginalMember(owner = "client!td", name = "H", descriptor = "Ljava/lang/Object;")
	private final Object anObject19;

	static {
		for (@Pc(12) int local12 = 0; local12 < 100; local12++) {
			aRectangleArray2[local12] = new Rectangle();
		}
	}

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class8_Sub5_Sub1_Sub2(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject19 = arg0;
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method7578() {
		return this.anObject19;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7577() {
		return false;
	}
}
