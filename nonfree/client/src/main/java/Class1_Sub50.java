import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public final class Class1_Sub50 extends Class1 {

	@OriginalMember(owner = "client!vt", name = "m", descriptor = "Z")
	public final boolean aBoolean698;

	@OriginalMember(owner = "client!vt", name = "j", descriptor = "I")
	public final int anInt9372;

	@OriginalMember(owner = "client!vt", name = "p", descriptor = "I")
	public final int anInt9376;

	@OriginalMember(owner = "client!vt", name = "n", descriptor = "I")
	public final int anInt9374;

	@OriginalMember(owner = "client!vt", name = "o", descriptor = "I")
	public final int anInt9375;

	@OriginalMember(owner = "client!vt", name = "l", descriptor = "I")
	public final int anInt9373;

	@OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class1_Sub50(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.aBoolean698 = arg5;
		this.anInt9372 = arg2;
		this.anInt9376 = arg1;
		this.anInt9374 = arg3;
		this.anInt9375 = arg4;
		this.anInt9373 = arg0;
	}
}
