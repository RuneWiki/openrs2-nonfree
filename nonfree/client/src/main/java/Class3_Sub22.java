import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gba")
public final class Class3_Sub22 extends Class3 {

	@OriginalMember(owner = "client!gba", name = "j", descriptor = "I")
	public int anInt4116;

	@OriginalMember(owner = "client!gba", name = "k", descriptor = "I")
	public int anInt4117;

	@OriginalMember(owner = "client!gba", name = "n", descriptor = "I")
	public int anInt4119;

	@OriginalMember(owner = "client!gba", name = "q", descriptor = "I")
	public int anInt4120;

	@OriginalMember(owner = "client!gba", name = "w", descriptor = "I")
	public int anInt4124;

	@OriginalMember(owner = "client!gba", name = "p", descriptor = "Z")
	public boolean aBoolean356 = false;

	@OriginalMember(owner = "client!gba", name = "t", descriptor = "I")
	public int anInt4123 = -1;

	@OriginalMember(owner = "client!gba", name = "<init>", descriptor = "(I)V")
	public Class3_Sub22(@OriginalArg(0) int arg0) {
		this.anInt4123 = arg0;
	}
}
