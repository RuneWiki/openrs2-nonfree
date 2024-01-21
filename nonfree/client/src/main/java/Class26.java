import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public final class Class26 {

	@OriginalMember(owner = "client!ha", name = "q", descriptor = "Z")
	public boolean aBoolean62 = true;

	@OriginalMember(owner = "client!ha", name = "n", descriptor = "I")
	public final int anInt1094;

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "I")
	public final int anInt1090;

	@OriginalMember(owner = "client!ha", name = "r", descriptor = "I")
	public final int anInt1095;

	@OriginalMember(owner = "client!ha", name = "l", descriptor = "I")
	public final int anInt1093;

	@OriginalMember(owner = "client!ha", name = "h", descriptor = "I")
	public final int anInt1091;

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "I")
	public final int anInt1089;

	@OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class26(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.anInt1094 = arg4;
		this.anInt1090 = arg0;
		this.aBoolean62 = arg6;
		this.anInt1095 = arg2;
		this.anInt1093 = arg5;
		this.anInt1091 = arg3;
		this.anInt1089 = arg1;
	}
}
