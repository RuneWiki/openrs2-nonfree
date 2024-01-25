import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public final class Class1_Sub15 extends Class1 {

	@OriginalMember(owner = "client!fp", name = "n", descriptor = "I")
	public int anInt1842;

	@OriginalMember(owner = "client!fp", name = "o", descriptor = "I")
	public int anInt1843;

	@OriginalMember(owner = "client!fp", name = "r", descriptor = "I")
	public int anInt1846;

	@OriginalMember(owner = "client!fp", name = "t", descriptor = "I")
	public int anInt1848;

	@OriginalMember(owner = "client!fp", name = "w", descriptor = "I")
	public int anInt1850;

	@OriginalMember(owner = "client!fp", name = "s", descriptor = "I")
	public int anInt1847 = -1;

	@OriginalMember(owner = "client!fp", name = "v", descriptor = "Z")
	public boolean aBoolean195 = false;

	@OriginalMember(owner = "client!fp", name = "<init>", descriptor = "(I)V")
	public Class1_Sub15(@OriginalArg(0) int arg0) {
		this.anInt1847 = arg0;
	}
}
