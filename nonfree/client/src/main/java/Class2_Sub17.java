import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public final class Class2_Sub17 extends Class2 {

	@OriginalMember(owner = "client!hq", name = "x", descriptor = "Lclient!h;")
	public static final Class89 aClass89_106 = new Class89(14, 6);

	@OriginalMember(owner = "client!hq", name = "s", descriptor = "I")
	public final int anInt2532;

	@OriginalMember(owner = "client!hq", name = "z", descriptor = "I")
	public final int anInt2536;

	@OriginalMember(owner = "client!hq", name = "w", descriptor = "Z")
	public final boolean aBoolean183;

	@OriginalMember(owner = "client!hq", name = "u", descriptor = "I")
	public final int anInt2534;

	@OriginalMember(owner = "client!hq", name = "y", descriptor = "I")
	public final int anInt2535;

	@OriginalMember(owner = "client!hq", name = "B", descriptor = "I")
	public final int anInt2538;

	@OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(IIIIIZ)V", line = 948)
	public Class2_Sub17(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt2532 = arg3;
		this.anInt2536 = arg1;
		this.aBoolean183 = arg5;
		this.anInt2534 = arg4;
		this.anInt2535 = arg2;
		this.anInt2538 = arg0;
	}
}
