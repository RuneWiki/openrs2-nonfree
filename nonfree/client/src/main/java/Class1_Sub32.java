import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public final class Class1_Sub32 extends Class1 {

	@OriginalMember(owner = "client!oh", name = "l", descriptor = "I")
	public final int anInt4543;

	@OriginalMember(owner = "client!oh", name = "k", descriptor = "I")
	public final int anInt4542;

	@OriginalMember(owner = "client!oh", name = "t", descriptor = "I")
	public final int anInt4551;

	@OriginalMember(owner = "client!oh", name = "z", descriptor = "I")
	public final int anInt4555;

	@OriginalMember(owner = "client!oh", name = "w", descriptor = "Z")
	public final boolean aBoolean362;

	@OriginalMember(owner = "client!oh", name = "r", descriptor = "I")
	public final int anInt4549;

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class1_Sub32(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt4543 = arg0;
		this.anInt4542 = arg2;
		this.anInt4551 = arg3;
		this.anInt4555 = arg1;
		this.aBoolean362 = arg5;
		this.anInt4549 = arg4;
	}
}
