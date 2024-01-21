import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public final class Class31 {

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "Z")
	public boolean aBoolean57 = true;

	@OriginalMember(owner = "client!ha", name = "n", descriptor = "I")
	public final int anInt1455;

	@OriginalMember(owner = "client!ha", name = "i", descriptor = "I")
	public final int anInt1452;

	@OriginalMember(owner = "client!ha", name = "h", descriptor = "I")
	public final int anInt1451;

	@OriginalMember(owner = "client!ha", name = "o", descriptor = "I")
	public final int anInt1456;

	@OriginalMember(owner = "client!ha", name = "g", descriptor = "I")
	public final int anInt1450;

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
	public final int anInt1447;

	@OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class31(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.anInt1455 = arg0;
		this.anInt1452 = arg5;
		this.anInt1451 = arg2;
		this.aBoolean57 = arg6;
		this.anInt1456 = arg3;
		this.anInt1450 = arg4;
		this.anInt1447 = arg1;
	}
}
