import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tk")
public abstract class Class157 {

	@OriginalMember(owner = "client!tk", name = "h", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray3 = new Rectangle[100];

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "I")
	public int anInt4784;

	@OriginalMember(owner = "client!tk", name = "c", descriptor = "I")
	public int anInt4786;

	@OriginalMember(owner = "client!tk", name = "m", descriptor = "I")
	public int anInt4794;

	static {
		for (@Pc(4) int local4 = 0; local4 < 100; local4++) {
			aRectangleArray3[local4] = new Rectangle();
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)Z")
	public final boolean method4206() {
		return (this.anInt4784 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "(I)Z")
	public final boolean method4207() {
		return (this.anInt4784 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(B)Z")
	public final boolean method4210() {
		return (this.anInt4784 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "(B)Z")
	public final boolean method4213() {
		return (this.anInt4784 & 0x2) != 0;
	}
}
