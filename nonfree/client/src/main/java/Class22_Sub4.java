import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public abstract class Class22_Sub4 extends Class22 {

	@OriginalMember(owner = "client!gl", name = "n", descriptor = "I")
	protected final int anInt6010;

	@OriginalMember(owner = "client!gl", name = "r", descriptor = "I")
	protected int anInt6013;

	@OriginalMember(owner = "client!gl", name = "j", descriptor = "I")
	protected int anInt6009;

	@OriginalMember(owner = "client!gl", name = "t", descriptor = "I")
	public final int anInt6015;

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(IIII)V")
	protected Class22_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6010 = arg1;
		this.anInt6013 = arg2;
		this.anInt6009 = arg0;
		this.anInt6015 = arg3;
	}
}
