import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public final class Class3_Sub5 extends Class3 {

	@OriginalMember(owner = "client!bd", name = "l", descriptor = "I")
	public int anInt541;

	@OriginalMember(owner = "client!bd", name = "n", descriptor = "I")
	public int anInt543;

	@OriginalMember(owner = "client!bd", name = "q", descriptor = "I")
	public int anInt545;

	@OriginalMember(owner = "client!bd", name = "t", descriptor = "I")
	public int anInt548;

	@OriginalMember(owner = "client!bd", name = "w", descriptor = "I")
	public int anInt551;

	@OriginalMember(owner = "client!bd", name = "k", descriptor = "Z")
	public boolean aBoolean28 = false;

	@OriginalMember(owner = "client!bd", name = "o", descriptor = "I")
	public int anInt544 = -1;

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(I)V")
	public Class3_Sub5(@OriginalArg(0) int arg0) {
		this.anInt544 = arg0;
	}
}
