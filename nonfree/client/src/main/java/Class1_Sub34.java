import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public final class Class1_Sub34 extends Class1 {

	@OriginalMember(owner = "client!po", name = "l", descriptor = "I")
	public final int anInt5424;

	@OriginalMember(owner = "client!po", name = "n", descriptor = "I")
	public final int anInt5426;

	@OriginalMember(owner = "client!po", name = "s", descriptor = "I")
	public final int anInt5429;

	@OriginalMember(owner = "client!po", name = "o", descriptor = "Z")
	public final boolean aBoolean615;

	@OriginalMember(owner = "client!po", name = "r", descriptor = "I")
	public final int anInt5428;

	@OriginalMember(owner = "client!po", name = "m", descriptor = "I")
	public final int anInt5425;

	@OriginalMember(owner = "client!po", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class1_Sub34(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt5424 = arg1;
		this.anInt5426 = arg2;
		this.anInt5429 = arg0;
		this.aBoolean615 = arg5;
		this.anInt5428 = arg4;
		this.anInt5425 = arg3;
	}
}
