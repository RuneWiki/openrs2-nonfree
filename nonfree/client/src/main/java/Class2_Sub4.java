import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!em")
public abstract class Class2_Sub4 extends Class2 {

	@OriginalMember(owner = "client!em", name = "g", descriptor = "[I")
	public static final int[] anIntArray452 = new int[4096];

	@OriginalMember(owner = "client!em", name = "c", descriptor = "I")
	protected int anInt6416;

	@OriginalMember(owner = "client!em", name = "e", descriptor = "I")
	public final int anInt6417;

	@OriginalMember(owner = "client!em", name = "f", descriptor = "I")
	protected int anInt6418;

	@OriginalMember(owner = "client!em", name = "h", descriptor = "I")
	protected final int anInt6419;

	static {
		for (@Pc(10) int local10 = 0; local10 < 4096; local10++) {
			anIntArray452[local10] = Static82.method1226(local10);
		}
	}

	@OriginalMember(owner = "client!em", name = "<init>", descriptor = "(IIII)V")
	protected Class2_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6416 = arg2;
		this.anInt6417 = arg3;
		this.anInt6418 = arg0;
		this.anInt6419 = arg1;
	}
}
