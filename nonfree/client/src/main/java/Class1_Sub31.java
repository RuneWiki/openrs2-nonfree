import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kw")
public final class Class1_Sub31 extends Class1 {

	@OriginalMember(owner = "client!kw", name = "v", descriptor = "I")
	public final int anInt5081;

	@OriginalMember(owner = "client!kw", name = "s", descriptor = "Z")
	public final boolean aBoolean378;

	@OriginalMember(owner = "client!kw", name = "y", descriptor = "I")
	public final int anInt5084;

	@OriginalMember(owner = "client!kw", name = "t", descriptor = "I")
	public final int anInt5079;

	@OriginalMember(owner = "client!kw", name = "x", descriptor = "I")
	public final int anInt5083;

	@OriginalMember(owner = "client!kw", name = "m", descriptor = "I")
	public final int anInt5075;

	@OriginalMember(owner = "client!kw", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class1_Sub31(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt5081 = arg3;
		this.aBoolean378 = arg5;
		this.anInt5084 = arg0;
		this.anInt5079 = arg1;
		this.anInt5083 = arg2;
		this.anInt5075 = arg4;
	}
}
