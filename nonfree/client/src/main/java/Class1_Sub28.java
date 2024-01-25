import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public final class Class1_Sub28 extends Class1 {

	@OriginalMember(owner = "client!ls", name = "p", descriptor = "I")
	public int anInt4272;

	@OriginalMember(owner = "client!ls", name = "q", descriptor = "I")
	public int anInt4273;

	@OriginalMember(owner = "client!ls", name = "s", descriptor = "I")
	public int anInt4275;

	@OriginalMember(owner = "client!ls", name = "t", descriptor = "I")
	public int anInt4276;

	@OriginalMember(owner = "client!ls", name = "w", descriptor = "I")
	public int anInt4277;

	@OriginalMember(owner = "client!ls", name = "r", descriptor = "I")
	public int anInt4274 = -1;

	@OriginalMember(owner = "client!ls", name = "u", descriptor = "Z")
	public boolean aBoolean284 = false;

	@OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(I)V")
	public Class1_Sub28(@OriginalArg(0) int arg0) {
		this.anInt4274 = arg0;
	}
}
