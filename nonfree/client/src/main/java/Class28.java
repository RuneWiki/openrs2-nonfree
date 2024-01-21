import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public final class Class28 {

	@OriginalMember(owner = "client!o", name = "f", descriptor = "Z")
	public boolean aBoolean200 = true;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "I")
	public int anInt805;

	@OriginalMember(owner = "client!o", name = "b", descriptor = "I")
	public int anInt806;

	@OriginalMember(owner = "client!o", name = "c", descriptor = "I")
	public int anInt807;

	@OriginalMember(owner = "client!o", name = "d", descriptor = "I")
	public int anInt808;

	@OriginalMember(owner = "client!o", name = "e", descriptor = "I")
	public int anInt809;

	@OriginalMember(owner = "client!o", name = "g", descriptor = "I")
	public int anInt810;

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class28(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.anInt805 = arg0;
		this.anInt806 = arg1;
		this.anInt807 = arg2;
		this.anInt808 = arg3;
		this.anInt809 = arg4;
		this.anInt810 = arg5;
		this.aBoolean200 = arg6;
	}
}
