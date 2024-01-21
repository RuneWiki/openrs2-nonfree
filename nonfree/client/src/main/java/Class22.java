import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public final class Class22 {

	@OriginalMember(owner = "client!n", name = "f", descriptor = "Z")
	public boolean aBoolean99 = true;

	@OriginalMember(owner = "client!n", name = "a", descriptor = "I")
	public int anInt465;

	@OriginalMember(owner = "client!n", name = "b", descriptor = "I")
	public int anInt466;

	@OriginalMember(owner = "client!n", name = "c", descriptor = "I")
	public int anInt467;

	@OriginalMember(owner = "client!n", name = "d", descriptor = "I")
	public int anInt468;

	@OriginalMember(owner = "client!n", name = "e", descriptor = "I")
	public int anInt469;

	@OriginalMember(owner = "client!n", name = "g", descriptor = "I")
	public int anInt470;

	@OriginalMember(owner = "client!n", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class22(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.anInt465 = arg0;
		this.anInt466 = arg1;
		this.anInt467 = arg2;
		this.anInt468 = arg3;
		this.anInt469 = arg4;
		this.anInt470 = arg5;
		this.aBoolean99 = arg6;
	}
}
