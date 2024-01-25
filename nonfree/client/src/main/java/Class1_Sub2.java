import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!laa")
public abstract class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!laa", name = "d", descriptor = "I")
	public final int anInt6984;

	@OriginalMember(owner = "client!laa", name = "n", descriptor = "I")
	protected final int anInt6992;

	@OriginalMember(owner = "client!laa", name = "g", descriptor = "I")
	protected int anInt6986;

	@OriginalMember(owner = "client!laa", name = "f", descriptor = "I")
	protected int anInt6985;

	@OriginalMember(owner = "client!laa", name = "<init>", descriptor = "(IIII)V")
	protected Class1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6984 = arg3;
		this.anInt6992 = arg1;
		this.anInt6986 = arg2;
		this.anInt6985 = arg0;
	}
}
