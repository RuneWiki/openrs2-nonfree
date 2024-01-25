import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public abstract class Class1_Sub5 extends Class1 {

	@OriginalMember(owner = "client!nm", name = "j", descriptor = "I")
	protected int anInt6404;

	@OriginalMember(owner = "client!nm", name = "k", descriptor = "I")
	protected int anInt6405;

	@OriginalMember(owner = "client!nm", name = "l", descriptor = "I")
	protected final int anInt6406;

	@OriginalMember(owner = "client!nm", name = "n", descriptor = "I")
	public final int anInt6407;

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(IIII)V")
	protected Class1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6404 = arg2;
		this.anInt6405 = arg0;
		this.anInt6406 = arg1;
		this.anInt6407 = arg3;
	}
}
