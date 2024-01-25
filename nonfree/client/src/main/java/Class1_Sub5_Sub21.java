import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oe")
public final class Class1_Sub5_Sub21 extends Class1_Sub5 {

	@OriginalMember(owner = "client!oe", name = "L", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray4 = new Rectangle[100];

	@OriginalMember(owner = "client!oe", name = "S", descriptor = "I")
	private int anInt4527;

	static {
		for (@Pc(4) int local4 = 0; local4 < 100; local4++) {
			aRectangleArray4[local4] = new Rectangle();
		}
	}

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(I)V")
	public Class1_Sub5_Sub21(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt4527 = 4096;
		this.anInt4527 = arg0;
	}

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "()V")
	public Class1_Sub5_Sub21() {
		this(4096);
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5805(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass214_41.method5651(arg0);
		if (super.aClass214_41.aBoolean544) {
			Static361.method1852(local9, 0, Static75.anInt1566, this.anInt4527);
		}
		return local9;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!nj;II)V")
	@Override
	public void method5814(@OriginalArg(0) Class1_Sub21 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt4527 = (arg0.method5720() << 12) / 255;
		}
	}
}
