import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public final class Class3_Sub16 extends Class3 {

	@OriginalMember(owner = "client!fb", name = "j", descriptor = "I")
	public int anInt1893;

	@OriginalMember(owner = "client!fb", name = "k", descriptor = "I")
	public int anInt1894;

	@OriginalMember(owner = "client!fb", name = "m", descriptor = "I")
	public int anInt1895;

	@OriginalMember(owner = "client!fb", name = "o", descriptor = "I")
	public int anInt1897;

	@OriginalMember(owner = "client!fb", name = "r", descriptor = "I")
	public int anInt1899;

	@OriginalMember(owner = "client!fb", name = "n", descriptor = "I")
	public int anInt1896 = -1;

	@OriginalMember(owner = "client!fb", name = "p", descriptor = "Z")
	public boolean aBoolean115 = false;

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(I)V")
	public Class3_Sub16(@OriginalArg(0) int arg0) {
		this.anInt1896 = arg0;
	}
}
