import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public final class Class2_Sub22 extends Class2 {

	@OriginalMember(owner = "client!ih", name = "p", descriptor = "Z")
	public final boolean aBoolean245;

	@OriginalMember(owner = "client!ih", name = "x", descriptor = "I")
	public final int anInt2814;

	@OriginalMember(owner = "client!ih", name = "q", descriptor = "I")
	public final int anInt2808;

	@OriginalMember(owner = "client!ih", name = "r", descriptor = "I")
	public final int anInt2809;

	@OriginalMember(owner = "client!ih", name = "B", descriptor = "I")
	public final int anInt2817;

	@OriginalMember(owner = "client!ih", name = "A", descriptor = "I")
	public final int anInt2816;

	@OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class2_Sub22(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.aBoolean245 = arg5;
		this.anInt2814 = arg1;
		this.anInt2808 = arg0;
		this.anInt2809 = arg2;
		this.anInt2817 = arg3;
		this.anInt2816 = arg4;
	}
}
