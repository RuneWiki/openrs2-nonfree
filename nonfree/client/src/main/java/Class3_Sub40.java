import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public final class Class3_Sub40 extends Class3 {

	@OriginalMember(owner = "client!pc", name = "y", descriptor = "I")
	public final int anInt7197;

	@OriginalMember(owner = "client!pc", name = "z", descriptor = "I")
	public final int anInt7198;

	@OriginalMember(owner = "client!pc", name = "x", descriptor = "I")
	public final int anInt7196;

	@OriginalMember(owner = "client!pc", name = "A", descriptor = "Z")
	public final boolean aBoolean497;

	@OriginalMember(owner = "client!pc", name = "t", descriptor = "I")
	public final int anInt7192;

	@OriginalMember(owner = "client!pc", name = "w", descriptor = "I")
	public final int anInt7195;

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class3_Sub40(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt7197 = arg3;
		this.anInt7198 = arg1;
		this.anInt7196 = arg4;
		this.aBoolean497 = arg5;
		this.anInt7192 = arg2;
		this.anInt7195 = arg0;
	}
}
