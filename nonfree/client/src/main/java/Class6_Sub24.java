import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iga")
public final class Class6_Sub24 extends Class6 {

	@OriginalMember(owner = "client!iga", name = "q", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray2 = new Rectangle[100];

	@OriginalMember(owner = "client!iga", name = "w", descriptor = "I")
	public int anInt4789;

	@OriginalMember(owner = "client!iga", name = "j", descriptor = "I")
	public int anInt4792;

	@OriginalMember(owner = "client!iga", name = "v", descriptor = "I")
	public int anInt4794;

	@OriginalMember(owner = "client!iga", name = "s", descriptor = "I")
	public int anInt4795;

	@OriginalMember(owner = "client!iga", name = "o", descriptor = "I")
	public int anInt4797;

	@OriginalMember(owner = "client!iga", name = "u", descriptor = "I")
	public int anInt4787 = -1;

	@OriginalMember(owner = "client!iga", name = "n", descriptor = "Z")
	public boolean aBoolean365 = false;

	static {
		for (@Pc(31) int local31 = 0; local31 < 100; local31++) {
			aRectangleArray2[local31] = new Rectangle();
		}
	}

	@OriginalMember(owner = "client!iga", name = "<init>", descriptor = "(I)V")
	public Class6_Sub24(@OriginalArg(0) int arg0) {
		this.anInt4787 = arg0;
	}
}
