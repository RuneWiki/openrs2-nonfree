import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lga")
public final class Class2_Sub32 extends Class2 {

	@OriginalMember(owner = "client!lga", name = "r", descriptor = "I")
	public int anInt6570;

	@OriginalMember(owner = "client!lga", name = "s", descriptor = "I")
	public int anInt6571;

	@OriginalMember(owner = "client!lga", name = "t", descriptor = "I")
	public int anInt6572;

	@OriginalMember(owner = "client!lga", name = "u", descriptor = "I")
	public int anInt6573;

	@OriginalMember(owner = "client!lga", name = "w", descriptor = "I")
	public int anInt6574;

	@OriginalMember(owner = "client!lga", name = "p", descriptor = "Z")
	public boolean aBoolean491 = false;

	@OriginalMember(owner = "client!lga", name = "o", descriptor = "I")
	public int anInt6568 = -1;

	@OriginalMember(owner = "client!lga", name = "<init>", descriptor = "(I)V")
	public Class2_Sub32(@OriginalArg(0) int arg0) {
		this.anInt6568 = arg0;
	}
}
