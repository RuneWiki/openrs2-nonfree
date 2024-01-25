import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public final class Class4_Sub12 extends Class4 {

	@OriginalMember(owner = "client!dt", name = "j", descriptor = "I")
	public int anInt1563;

	@OriginalMember(owner = "client!dt", name = "m", descriptor = "I")
	public int anInt1565;

	@OriginalMember(owner = "client!dt", name = "o", descriptor = "I")
	public int anInt1567;

	@OriginalMember(owner = "client!dt", name = "r", descriptor = "I")
	public int anInt1570;

	@OriginalMember(owner = "client!dt", name = "v", descriptor = "I")
	public int anInt1572;

	@OriginalMember(owner = "client!dt", name = "s", descriptor = "Z")
	public boolean aBoolean104 = false;

	@OriginalMember(owner = "client!dt", name = "n", descriptor = "I")
	public int anInt1566 = -1;

	@OriginalMember(owner = "client!dt", name = "<init>", descriptor = "(I)V")
	public Class4_Sub12(@OriginalArg(0) int arg0) {
		this.anInt1566 = arg0;
	}
}
