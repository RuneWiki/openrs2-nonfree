import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public final class Class20 {

	@OriginalMember(owner = "client!ed", name = "v", descriptor = "Z")
	public boolean aBoolean32 = true;

	@OriginalMember(owner = "client!ed", name = "i", descriptor = "I")
	public final int anInt760;

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "I")
	public final int anInt756;

	@OriginalMember(owner = "client!ed", name = "s", descriptor = "I")
	public final int anInt765;

	@OriginalMember(owner = "client!ed", name = "r", descriptor = "I")
	public final int anInt764;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
	public final int anInt755;

	@OriginalMember(owner = "client!ed", name = "e", descriptor = "I")
	public final int anInt757;

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class20(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.anInt760 = arg1;
		this.anInt756 = arg0;
		this.aBoolean32 = arg6;
		this.anInt765 = arg2;
		this.anInt764 = arg4;
		this.anInt755 = arg3;
		this.anInt757 = arg5;
	}
}
