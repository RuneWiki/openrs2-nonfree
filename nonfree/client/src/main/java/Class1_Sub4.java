import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public final class Class1_Sub4 extends Class1 {

	@OriginalMember(owner = "client!al", name = "s", descriptor = "I")
	public final int anInt217;

	@OriginalMember(owner = "client!al", name = "t", descriptor = "I")
	public final int anInt218;

	@OriginalMember(owner = "client!al", name = "p", descriptor = "Z")
	public final boolean aBoolean21;

	@OriginalMember(owner = "client!al", name = "k", descriptor = "I")
	public final int anInt212;

	@OriginalMember(owner = "client!al", name = "r", descriptor = "I")
	public final int anInt216;

	@OriginalMember(owner = "client!al", name = "o", descriptor = "I")
	public final int anInt214;

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt217 = arg1;
		this.anInt218 = arg4;
		this.aBoolean21 = arg5;
		this.anInt212 = arg2;
		this.anInt216 = arg3;
		this.anInt214 = arg0;
	}
}
