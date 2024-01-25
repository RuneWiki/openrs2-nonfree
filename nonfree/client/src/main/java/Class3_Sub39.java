import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public final class Class3_Sub39 extends Class3 {

	@OriginalMember(owner = "client!on", name = "m", descriptor = "I")
	public final int anInt7254;

	@OriginalMember(owner = "client!on", name = "u", descriptor = "I")
	public final int anInt7261;

	@OriginalMember(owner = "client!on", name = "o", descriptor = "I")
	public final int anInt7256;

	@OriginalMember(owner = "client!on", name = "l", descriptor = "Z")
	public final boolean aBoolean519;

	@OriginalMember(owner = "client!on", name = "r", descriptor = "I")
	public final int anInt7258;

	@OriginalMember(owner = "client!on", name = "s", descriptor = "I")
	public final int anInt7259;

	@OriginalMember(owner = "client!on", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class3_Sub39(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt7254 = arg2;
		this.anInt7261 = arg4;
		this.anInt7256 = arg3;
		this.aBoolean519 = arg5;
		this.anInt7258 = arg0;
		this.anInt7259 = arg1;
	}
}
