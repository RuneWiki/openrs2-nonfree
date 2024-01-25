import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public final class Class1_Sub15 extends Class1 {

	@OriginalMember(owner = "client!dw", name = "s", descriptor = "I")
	public final int anInt1845;

	@OriginalMember(owner = "client!dw", name = "p", descriptor = "I")
	public final int anInt1843;

	@OriginalMember(owner = "client!dw", name = "o", descriptor = "I")
	public final int anInt1842;

	@OriginalMember(owner = "client!dw", name = "m", descriptor = "I")
	public final int anInt1841;

	@OriginalMember(owner = "client!dw", name = "n", descriptor = "Z")
	public final boolean aBoolean110;

	@OriginalMember(owner = "client!dw", name = "u", descriptor = "I")
	public final int anInt1846;

	@OriginalMember(owner = "client!dw", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class1_Sub15(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt1845 = arg0;
		this.anInt1843 = arg4;
		this.anInt1842 = arg1;
		this.anInt1841 = arg3;
		this.aBoolean110 = arg5;
		this.anInt1846 = arg2;
	}
}
