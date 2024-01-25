import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public final class Class3_Sub18 extends Class3 {

	@OriginalMember(owner = "client!dm", name = "p", descriptor = "I")
	public int anInt2278;

	@OriginalMember(owner = "client!dm", name = "q", descriptor = "I")
	public int anInt2279;

	@OriginalMember(owner = "client!dm", name = "v", descriptor = "I")
	public int anInt2281;

	@OriginalMember(owner = "client!dm", name = "y", descriptor = "I")
	public int anInt2283;

	@OriginalMember(owner = "client!dm", name = "z", descriptor = "I")
	public int anInt2284;

	@OriginalMember(owner = "client!dm", name = "s", descriptor = "Z")
	public boolean aBoolean187 = false;

	@OriginalMember(owner = "client!dm", name = "o", descriptor = "I")
	public int anInt2277 = -1;

	@OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(I)V")
	public Class3_Sub18(@OriginalArg(0) int arg0) {
		this.anInt2277 = arg0;
	}
}
