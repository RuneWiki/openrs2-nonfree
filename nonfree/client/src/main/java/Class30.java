import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public final class Class30 {

	@OriginalMember(owner = "client!p", name = "f", descriptor = "Z")
	public boolean aBoolean197 = true;

	@OriginalMember(owner = "client!p", name = "a", descriptor = "I")
	public int anInt856;

	@OriginalMember(owner = "client!p", name = "b", descriptor = "I")
	public int anInt857;

	@OriginalMember(owner = "client!p", name = "c", descriptor = "I")
	public int anInt858;

	@OriginalMember(owner = "client!p", name = "d", descriptor = "I")
	public int anInt859;

	@OriginalMember(owner = "client!p", name = "e", descriptor = "I")
	public int anInt860;

	@OriginalMember(owner = "client!p", name = "g", descriptor = "I")
	public int anInt861;

	@OriginalMember(owner = "client!p", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class30(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.anInt856 = arg0;
		this.anInt857 = arg1;
		this.anInt858 = arg2;
		this.anInt859 = arg3;
		this.anInt860 = arg4;
		this.anInt861 = arg5;
		this.aBoolean197 = arg6;
	}
}
