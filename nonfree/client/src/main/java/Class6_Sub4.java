import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lf")
public abstract class Class6_Sub4 extends Class6 {

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray4 = new Rectangle[100];

	@OriginalMember(owner = "client!lf", name = "i", descriptor = "Z")
	public boolean aBoolean302 = false;

	@OriginalMember(owner = "client!lf", name = "f", descriptor = "Z")
	public boolean aBoolean301 = false;

	@OriginalMember(owner = "client!lf", name = "g", descriptor = "I")
	protected final int anInt4002;

	@OriginalMember(owner = "client!lf", name = "h", descriptor = "I")
	protected int anInt4003;

	@OriginalMember(owner = "client!lf", name = "e", descriptor = "I")
	protected int anInt4001;

	static {
		for (@Pc(6) int local6 = 0; local6 < 100; local6++) {
			aRectangleArray4[local6] = new Rectangle();
		}
	}

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(IIIZZ)V")
	protected Class6_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean301 = arg4;
		this.anInt4002 = arg1;
		this.anInt4003 = arg0;
		this.aBoolean302 = arg3;
		this.anInt4001 = arg2;
	}
}
