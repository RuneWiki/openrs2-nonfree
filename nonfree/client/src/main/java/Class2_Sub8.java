import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public final class Class2_Sub8 extends Class2 {

	@OriginalMember(owner = "client!dh", name = "p", descriptor = "I")
	public int anInt1037;

	@OriginalMember(owner = "client!dh", name = "q", descriptor = "I")
	public int anInt1038;

	@OriginalMember(owner = "client!dh", name = "u", descriptor = "I")
	public int anInt1040;

	@OriginalMember(owner = "client!dh", name = "w", descriptor = "I")
	public int anInt1042;

	@OriginalMember(owner = "client!dh", name = "x", descriptor = "I")
	public int anInt1043;

	@OriginalMember(owner = "client!dh", name = "s", descriptor = "I")
	public int anInt1039 = -1;

	@OriginalMember(owner = "client!dh", name = "r", descriptor = "Z")
	public boolean aBoolean104 = false;

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(I)V")
	public Class2_Sub8(@OriginalArg(0) int arg0) {
		this.anInt1039 = arg0;
	}
}
