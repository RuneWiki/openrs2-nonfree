import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public final class Class26 {

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "Z")
	public boolean aBoolean47 = true;

	@OriginalMember(owner = "client!fa", name = "f", descriptor = "I")
	public final int anInt1069;

	@OriginalMember(owner = "client!fa", name = "j", descriptor = "I")
	public final int anInt1072;

	@OriginalMember(owner = "client!fa", name = "g", descriptor = "I")
	public final int anInt1070;

	@OriginalMember(owner = "client!fa", name = "e", descriptor = "I")
	public final int anInt1068;

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "I")
	public final int anInt1066;

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "I")
	public final int anInt1065;

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class26(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.anInt1069 = arg4;
		this.anInt1072 = arg3;
		this.anInt1070 = arg2;
		this.anInt1068 = arg5;
		this.anInt1066 = arg0;
		this.aBoolean47 = arg6;
		this.anInt1065 = arg1;
	}
}
