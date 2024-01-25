import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public final class Class2_Sub20 extends Class2 {

	@OriginalMember(owner = "client!hi", name = "i", descriptor = "I")
	public int anInt2968;

	@OriginalMember(owner = "client!hi", name = "m", descriptor = "I")
	public int anInt2971;

	@OriginalMember(owner = "client!hi", name = "n", descriptor = "I")
	public int anInt2972;

	@OriginalMember(owner = "client!hi", name = "o", descriptor = "I")
	public int anInt2973;

	@OriginalMember(owner = "client!hi", name = "p", descriptor = "I")
	public int anInt2974;

	@OriginalMember(owner = "client!hi", name = "l", descriptor = "I")
	public int anInt2970 = -1;

	@OriginalMember(owner = "client!hi", name = "j", descriptor = "Z")
	public boolean aBoolean213 = false;

	@OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(I)V")
	public Class2_Sub20(@OriginalArg(0) int arg0) {
		this.anInt2970 = arg0;
	}
}
