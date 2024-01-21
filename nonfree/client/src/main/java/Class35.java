import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public final class Class35 {

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "Z")
	public boolean aBoolean65 = true;

	@OriginalMember(owner = "client!ja", name = "n", descriptor = "I")
	public final int anInt1318;

	@OriginalMember(owner = "client!ja", name = "d", descriptor = "I")
	public final int anInt1312;

	@OriginalMember(owner = "client!ja", name = "i", descriptor = "I")
	public final int anInt1315;

	@OriginalMember(owner = "client!ja", name = "k", descriptor = "I")
	public final int anInt1316;

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "I")
	public final int anInt1311;

	@OriginalMember(owner = "client!ja", name = "h", descriptor = "I")
	public final int anInt1314;

	@OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class35(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.anInt1318 = arg5;
		this.anInt1312 = arg1;
		this.anInt1315 = arg2;
		this.aBoolean65 = arg6;
		this.anInt1316 = arg3;
		this.anInt1311 = arg0;
		this.anInt1314 = arg4;
	}
}
