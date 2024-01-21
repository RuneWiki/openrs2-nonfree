import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public final class Class83 {

	@OriginalMember(owner = "client!we", name = "g", descriptor = "Z")
	public boolean aBoolean284 = true;

	@OriginalMember(owner = "client!we", name = "z", descriptor = "I")
	public final int anInt3149;

	@OriginalMember(owner = "client!we", name = "w", descriptor = "I")
	public final int anInt3146;

	@OriginalMember(owner = "client!we", name = "x", descriptor = "I")
	public final int anInt3147;

	@OriginalMember(owner = "client!we", name = "b", descriptor = "I")
	public final int anInt3137;

	@OriginalMember(owner = "client!we", name = "n", descriptor = "I")
	public final int anInt3144;

	@OriginalMember(owner = "client!we", name = "h", descriptor = "I")
	public final int anInt3141;

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class83(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.anInt3149 = arg5;
		this.anInt3146 = arg0;
		this.anInt3147 = arg4;
		this.anInt3137 = arg1;
		this.anInt3144 = arg2;
		this.anInt3141 = arg3;
		this.aBoolean284 = arg6;
	}
}
