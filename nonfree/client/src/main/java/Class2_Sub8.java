import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public final class Class2_Sub8 extends Class2 {

	@OriginalMember(owner = "client!bv", name = "t", descriptor = "I")
	public final int anInt1145;

	@OriginalMember(owner = "client!bv", name = "x", descriptor = "I")
	public final int anInt1148;

	@OriginalMember(owner = "client!bv", name = "r", descriptor = "I")
	public final int anInt1143;

	@OriginalMember(owner = "client!bv", name = "p", descriptor = "Z")
	public final boolean aBoolean98;

	@OriginalMember(owner = "client!bv", name = "s", descriptor = "I")
	public final int anInt1144;

	@OriginalMember(owner = "client!bv", name = "o", descriptor = "I")
	public final int anInt1142;

	@OriginalMember(owner = "client!bv", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class2_Sub8(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt1145 = arg4;
		this.anInt1148 = arg1;
		this.anInt1143 = arg3;
		this.aBoolean98 = arg5;
		this.anInt1144 = arg2;
		this.anInt1142 = arg0;
	}
}
