import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public final class Class4_Sub32 extends Class4 {

	@OriginalMember(owner = "client!ps", name = "q", descriptor = "I")
	public int anInt5602;

	@OriginalMember(owner = "client!ps", name = "r", descriptor = "I")
	public int anInt5603;

	@OriginalMember(owner = "client!ps", name = "t", descriptor = "I")
	public int anInt5605;

	@OriginalMember(owner = "client!ps", name = "u", descriptor = "I")
	public int anInt5606;

	@OriginalMember(owner = "client!ps", name = "w", descriptor = "I")
	public int anInt5607;

	@OriginalMember(owner = "client!ps", name = "p", descriptor = "I")
	public int anInt5601 = -1;

	@OriginalMember(owner = "client!ps", name = "v", descriptor = "Z")
	public boolean aBoolean373 = false;

	@OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(I)V")
	public Class4_Sub32(@OriginalArg(0) int arg0) {
		this.anInt5601 = arg0;
	}
}
