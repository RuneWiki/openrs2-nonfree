import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wr")
public final class Class4_Sub5_Sub21 extends Class4_Sub5 {

	@OriginalMember(owner = "client!wr", name = "A", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray2 = new Rectangle[100];

	@OriginalMember(owner = "client!wr", name = "v", descriptor = "I")
	public int anInt10581 = 0;

	static {
		for (@Pc(4) int local4 = 0; local4 < 100; local4++) {
			aRectangleArray2[local4] = new Rectangle();
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(ILclient!es;)V")
	public void method8948(@OriginalArg(1) Class4_Sub11 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method8865();
			if (local5 == 0) {
				return;
			}
			this.method8950(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(ILclient!es;I)V")
	private void method8950(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub11 arg1) {
		if (arg0 == 2) {
			this.anInt10581 = arg1.method8859();
		}
	}
}
