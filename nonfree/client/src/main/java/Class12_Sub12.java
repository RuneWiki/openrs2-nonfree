import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public final class Class12_Sub12 extends Class12 {

	@OriginalMember(owner = "client!du", name = "p", descriptor = "I")
	public int anInt2329;

	@OriginalMember(owner = "client!du", name = "r", descriptor = "I")
	public int anInt2331;

	@OriginalMember(owner = "client!du", name = "s", descriptor = "I")
	public int anInt2332;

	@OriginalMember(owner = "client!du", name = "u", descriptor = "I")
	public int anInt2334;

	@OriginalMember(owner = "client!du", name = "v", descriptor = "I")
	public int anInt2335;

	@OriginalMember(owner = "client!du", name = "w", descriptor = "Z")
	public boolean aBoolean197 = false;

	@OriginalMember(owner = "client!du", name = "t", descriptor = "I")
	public int anInt2333 = -1;

	@OriginalMember(owner = "client!du", name = "<init>", descriptor = "(I)V")
	public Class12_Sub12(@OriginalArg(0) int arg0) {
		this.anInt2333 = arg0;
	}
}
