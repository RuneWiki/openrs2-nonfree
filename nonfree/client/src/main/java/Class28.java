import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public final class Class28 {

	@OriginalMember(owner = "client!o", name = "f", descriptor = "Z")
	public boolean aBoolean207 = true;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "I")
	public int anInt801;

	@OriginalMember(owner = "client!o", name = "b", descriptor = "I")
	public int anInt802;

	@OriginalMember(owner = "client!o", name = "c", descriptor = "I")
	public int anInt803;

	@OriginalMember(owner = "client!o", name = "d", descriptor = "I")
	public int anInt804;

	@OriginalMember(owner = "client!o", name = "e", descriptor = "I")
	public int anInt805;

	@OriginalMember(owner = "client!o", name = "g", descriptor = "I")
	public int anInt806;

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class28(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.anInt801 = arg0;
		this.anInt802 = arg1;
		this.anInt803 = arg2;
		this.anInt804 = arg3;
		this.anInt805 = arg4;
		this.anInt806 = arg5;
		this.aBoolean207 = arg6;
	}
}
