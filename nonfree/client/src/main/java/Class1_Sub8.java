import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public final class Class1_Sub8 extends Class1 {

	@OriginalMember(owner = "client!da", name = "r", descriptor = "I")
	public int anInt1160;

	@OriginalMember(owner = "client!da", name = "u", descriptor = "I")
	public int anInt1163;

	@OriginalMember(owner = "client!da", name = "v", descriptor = "I")
	public int anInt1164;

	@OriginalMember(owner = "client!da", name = "w", descriptor = "I")
	public int anInt1165;

	@OriginalMember(owner = "client!da", name = "A", descriptor = "I")
	public int anInt1169;

	@OriginalMember(owner = "client!da", name = "z", descriptor = "I")
	public int anInt1168 = -1;

	@OriginalMember(owner = "client!da", name = "o", descriptor = "Z")
	public boolean aBoolean100 = false;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "(I)V")
	public Class1_Sub8(@OriginalArg(0) int arg0) {
		this.anInt1168 = arg0;
	}
}
