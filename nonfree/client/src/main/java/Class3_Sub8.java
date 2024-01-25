import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public final class Class3_Sub8 extends Class3 {

	@OriginalMember(owner = "client!bi", name = "m", descriptor = "I")
	public int anInt1245;

	@OriginalMember(owner = "client!bi", name = "n", descriptor = "I")
	public int anInt1246;

	@OriginalMember(owner = "client!bi", name = "q", descriptor = "I")
	public int anInt1247;

	@OriginalMember(owner = "client!bi", name = "r", descriptor = "I")
	public int anInt1248;

	@OriginalMember(owner = "client!bi", name = "t", descriptor = "I")
	public int anInt1249;

	@OriginalMember(owner = "client!bi", name = "i", descriptor = "I")
	public int anInt1242 = -1;

	@OriginalMember(owner = "client!bi", name = "k", descriptor = "Z")
	public boolean aBoolean108 = false;

	@OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(I)V")
	public Class3_Sub8(@OriginalArg(0) int arg0) {
		this.anInt1242 = arg0;
	}
}
