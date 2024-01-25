import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kba")
public abstract class Class43 {

	@OriginalMember(owner = "client!kba", name = "e", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray6 = new Rectangle[100];

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "I")
	protected final int anInt8582;

	@OriginalMember(owner = "client!kba", name = "g", descriptor = "I")
	public final int anInt8586;

	@OriginalMember(owner = "client!kba", name = "b", descriptor = "I")
	public final int anInt8583;

	static {
		for (@Pc(10) int local10 = 0; local10 < 100; local10++) {
			aRectangleArray6[local10] = new Rectangle();
		}
	}

	@OriginalMember(owner = "client!kba", name = "<init>", descriptor = "(III)V")
	protected Class43(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt8582 = arg2;
		this.anInt8586 = arg1;
		this.anInt8583 = arg0;
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(III)V")
	public abstract void method7030(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!kba", name = "b", descriptor = "(III)V")
	public abstract void method7033(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!kba", name = "c", descriptor = "(III)V")
	public abstract void method7034(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
