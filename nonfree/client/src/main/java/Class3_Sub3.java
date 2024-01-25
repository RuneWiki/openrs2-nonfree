import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public abstract class Class3_Sub3 extends Class3 {

	@OriginalMember(owner = "client!et", name = "f", descriptor = "I")
	public final int anInt5869;

	@OriginalMember(owner = "client!et", name = "i", descriptor = "I")
	protected int anInt5871;

	@OriginalMember(owner = "client!et", name = "k", descriptor = "I")
	protected final int anInt5873;

	@OriginalMember(owner = "client!et", name = "j", descriptor = "I")
	protected int anInt5872;

	@OriginalMember(owner = "client!et", name = "<init>", descriptor = "(IIII)V")
	protected Class3_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5869 = arg3;
		this.anInt5871 = arg2;
		this.anInt5873 = arg1;
		this.anInt5872 = arg0;
	}
}
