import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public final class Class27 {

	@OriginalMember(owner = "client!o", name = "f", descriptor = "Z")
	public boolean aBoolean159 = true;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "I")
	public int anInt633;

	@OriginalMember(owner = "client!o", name = "b", descriptor = "I")
	public int anInt634;

	@OriginalMember(owner = "client!o", name = "c", descriptor = "I")
	public int anInt635;

	@OriginalMember(owner = "client!o", name = "d", descriptor = "I")
	public int anInt636;

	@OriginalMember(owner = "client!o", name = "e", descriptor = "I")
	public int anInt637;

	@OriginalMember(owner = "client!o", name = "g", descriptor = "I")
	public int anInt638;

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class27(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.anInt633 = arg0;
		this.anInt634 = arg1;
		this.anInt635 = arg2;
		this.anInt636 = arg3;
		this.anInt637 = arg4;
		this.anInt638 = arg5;
		this.aBoolean159 = arg6;
	}
}
