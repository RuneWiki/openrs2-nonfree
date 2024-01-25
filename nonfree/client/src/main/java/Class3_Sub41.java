import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public final class Class3_Sub41 extends Class3 {

	@OriginalMember(owner = "client!vr", name = "l", descriptor = "I")
	public int anInt6275;

	@OriginalMember(owner = "client!vr", name = "n", descriptor = "I")
	public int anInt6276;

	@OriginalMember(owner = "client!vr", name = "o", descriptor = "I")
	public int anInt6277;

	@OriginalMember(owner = "client!vr", name = "p", descriptor = "I")
	public int anInt6278;

	@OriginalMember(owner = "client!vr", name = "r", descriptor = "I")
	public int anInt6280;

	@OriginalMember(owner = "client!vr", name = "q", descriptor = "I")
	public int anInt6279 = -1;

	@OriginalMember(owner = "client!vr", name = "s", descriptor = "Z")
	public boolean aBoolean490 = false;

	@OriginalMember(owner = "client!vr", name = "<init>", descriptor = "(I)V")
	public Class3_Sub41(@OriginalArg(0) int arg0) {
		this.anInt6279 = arg0;
	}
}
