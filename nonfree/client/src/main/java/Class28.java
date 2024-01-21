import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public final class Class28 {

	@OriginalMember(owner = "client!o", name = "f", descriptor = "Z")
	public boolean aBoolean221 = true;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "I")
	public int anInt778;

	@OriginalMember(owner = "client!o", name = "b", descriptor = "I")
	public int anInt779;

	@OriginalMember(owner = "client!o", name = "c", descriptor = "I")
	public int anInt780;

	@OriginalMember(owner = "client!o", name = "d", descriptor = "I")
	public int anInt781;

	@OriginalMember(owner = "client!o", name = "e", descriptor = "I")
	public int anInt782;

	@OriginalMember(owner = "client!o", name = "g", descriptor = "I")
	public int anInt783;

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class28(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.anInt778 = arg0;
		this.anInt779 = arg1;
		this.anInt780 = arg2;
		this.anInt781 = arg3;
		this.anInt782 = arg4;
		this.anInt783 = arg5;
		this.aBoolean221 = arg6;
	}
}
