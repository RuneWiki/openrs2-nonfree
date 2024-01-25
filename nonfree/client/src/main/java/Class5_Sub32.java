import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public final class Class5_Sub32 extends Class5 {

	@OriginalMember(owner = "client!qg", name = "p", descriptor = "I")
	public int anInt5143;

	@OriginalMember(owner = "client!qg", name = "q", descriptor = "I")
	public int anInt5144;

	@OriginalMember(owner = "client!qg", name = "r", descriptor = "I")
	public int anInt5145;

	@OriginalMember(owner = "client!qg", name = "u", descriptor = "I")
	public int anInt5148;

	@OriginalMember(owner = "client!qg", name = "v", descriptor = "I")
	public int anInt5149;

	@OriginalMember(owner = "client!qg", name = "z", descriptor = "Z")
	public boolean aBoolean430 = false;

	@OriginalMember(owner = "client!qg", name = "s", descriptor = "I")
	public int anInt5146 = -1;

	@OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(I)V")
	public Class5_Sub32(@OriginalArg(0) int arg0) {
		this.anInt5146 = arg0;
	}
}
