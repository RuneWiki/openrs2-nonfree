import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bla")
public final class Class2_Sub8 extends Class2 {

	@OriginalMember(owner = "client!bla", name = "m", descriptor = "I")
	public final int anInt917;

	@OriginalMember(owner = "client!bla", name = "r", descriptor = "I")
	public final int anInt916;

	@OriginalMember(owner = "client!bla", name = "o", descriptor = "I")
	public final int anInt914;

	@OriginalMember(owner = "client!bla", name = "n", descriptor = "I")
	public final int anInt915;

	@OriginalMember(owner = "client!bla", name = "q", descriptor = "Z")
	public final boolean aBoolean116;

	@OriginalMember(owner = "client!bla", name = "p", descriptor = "I")
	public final int anInt918;

	@OriginalMember(owner = "client!bla", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class2_Sub8(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt917 = arg1;
		this.anInt916 = arg2;
		this.anInt914 = arg4;
		this.anInt915 = arg0;
		this.aBoolean116 = arg5;
		this.anInt918 = arg3;
	}
}
