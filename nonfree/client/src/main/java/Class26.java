import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public final class Class26 {

	@OriginalMember(owner = "client!di", name = "g", descriptor = "Z")
	public boolean aBoolean32 = true;

	@OriginalMember(owner = "client!di", name = "e", descriptor = "I")
	public int anInt800;

	@OriginalMember(owner = "client!di", name = "l", descriptor = "I")
	public int anInt805;

	@OriginalMember(owner = "client!di", name = "c", descriptor = "I")
	public int anInt798;

	@OriginalMember(owner = "client!di", name = "i", descriptor = "I")
	public int anInt803;

	@OriginalMember(owner = "client!di", name = "j", descriptor = "I")
	public int anInt804;

	@OriginalMember(owner = "client!di", name = "a", descriptor = "I")
	public int anInt796;

	@OriginalMember(owner = "client!di", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class26(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.anInt800 = arg0;
		this.anInt805 = arg3;
		this.anInt798 = arg4;
		this.anInt803 = arg2;
		this.anInt804 = arg5;
		this.anInt796 = arg1;
		this.aBoolean32 = arg6;
	}
}
