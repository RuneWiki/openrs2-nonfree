import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public final class Class131 {

	@OriginalMember(owner = "client!pf", name = "m", descriptor = "Z")
	public boolean aBoolean249 = true;

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "I")
	public int anInt4070;

	@OriginalMember(owner = "client!pf", name = "d", descriptor = "I")
	public int anInt4071;

	@OriginalMember(owner = "client!pf", name = "j", descriptor = "I")
	public int anInt4075;

	@OriginalMember(owner = "client!pf", name = "g", descriptor = "I")
	public int anInt4073;

	@OriginalMember(owner = "client!pf", name = "k", descriptor = "I")
	public int anInt4076;

	@OriginalMember(owner = "client!pf", name = "l", descriptor = "I")
	public int anInt4077;

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class131(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.anInt4070 = arg5;
		this.anInt4071 = arg1;
		this.anInt4075 = arg2;
		this.aBoolean249 = arg6;
		this.anInt4073 = arg3;
		this.anInt4076 = arg0;
		this.anInt4077 = arg4;
	}
}
