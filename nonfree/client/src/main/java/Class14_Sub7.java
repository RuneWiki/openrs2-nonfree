import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public final class Class14_Sub7 extends Class14 {

	@OriginalMember(owner = "client!ch", name = "z", descriptor = "I")
	public final int anInt912;

	@OriginalMember(owner = "client!ch", name = "n", descriptor = "I")
	public final int anInt903;

	@OriginalMember(owner = "client!ch", name = "m", descriptor = "Z")
	public final boolean aBoolean48;

	@OriginalMember(owner = "client!ch", name = "x", descriptor = "I")
	public final int anInt910;

	@OriginalMember(owner = "client!ch", name = "v", descriptor = "I")
	public final int anInt909;

	@OriginalMember(owner = "client!ch", name = "o", descriptor = "I")
	public final int anInt904;

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class14_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt912 = arg0;
		this.anInt903 = arg2;
		this.aBoolean48 = arg5;
		this.anInt910 = arg4;
		this.anInt909 = arg3;
		this.anInt904 = arg1;
	}
}
