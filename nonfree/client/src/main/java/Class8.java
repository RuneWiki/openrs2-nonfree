import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public final class Class8 {

	@OriginalMember(owner = "client!ba", name = "g", descriptor = "Z")
	public boolean aBoolean28 = true;

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "I")
	public int anInt343;

	@OriginalMember(owner = "client!ba", name = "e", descriptor = "I")
	public int anInt344;

	@OriginalMember(owner = "client!ba", name = "f", descriptor = "I")
	public int anInt345;

	@OriginalMember(owner = "client!ba", name = "s", descriptor = "I")
	public int anInt348;

	@OriginalMember(owner = "client!ba", name = "x", descriptor = "I")
	public int anInt351;

	@OriginalMember(owner = "client!ba", name = "r", descriptor = "I")
	public int anInt347;

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class8(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.aBoolean28 = arg6;
		this.anInt343 = arg0;
		this.anInt344 = arg5;
		this.anInt345 = arg3;
		this.anInt348 = arg1;
		this.anInt351 = arg4;
		this.anInt347 = arg2;
	}
}
