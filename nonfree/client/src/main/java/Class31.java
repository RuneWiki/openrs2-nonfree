import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public final class Class31 {

	@OriginalMember(owner = "client!ja", name = "f", descriptor = "Z")
	public boolean aBoolean64 = true;

	@OriginalMember(owner = "client!ja", name = "d", descriptor = "I")
	public final int anInt1392;

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "I")
	public final int anInt1390;

	@OriginalMember(owner = "client!ja", name = "j", descriptor = "I")
	public final int anInt1396;

	@OriginalMember(owner = "client!ja", name = "l", descriptor = "I")
	public final int anInt1397;

	@OriginalMember(owner = "client!ja", name = "t", descriptor = "I")
	public final int anInt1400;

	@OriginalMember(owner = "client!ja", name = "i", descriptor = "I")
	public final int anInt1395;

	@OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class31(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.anInt1392 = arg0;
		this.anInt1390 = arg3;
		this.anInt1396 = arg5;
		this.aBoolean64 = arg6;
		this.anInt1397 = arg4;
		this.anInt1400 = arg1;
		this.anInt1395 = arg2;
	}
}
