import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kka")
public final class Class5_Sub31 extends Class5 {

	@OriginalMember(owner = "client!kka", name = "m", descriptor = "Z")
	public final boolean aBoolean430;

	@OriginalMember(owner = "client!kka", name = "o", descriptor = "I")
	public final int anInt5588;

	@OriginalMember(owner = "client!kka", name = "r", descriptor = "I")
	public final int anInt5586;

	@OriginalMember(owner = "client!kka", name = "q", descriptor = "I")
	public final int anInt5589;

	@OriginalMember(owner = "client!kka", name = "p", descriptor = "I")
	public final int anInt5590;

	@OriginalMember(owner = "client!kka", name = "k", descriptor = "I")
	public final int anInt5587;

	@OriginalMember(owner = "client!kka", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class5_Sub31(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.aBoolean430 = arg5;
		this.anInt5588 = arg3;
		this.anInt5586 = arg2;
		this.anInt5589 = arg1;
		this.anInt5590 = arg0;
		this.anInt5587 = arg4;
	}
}
