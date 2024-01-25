import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public final class Class2_Sub1 extends Class2 {

	@OriginalMember(owner = "client!aa", name = "j", descriptor = "I")
	public final int anInt11;

	@OriginalMember(owner = "client!aa", name = "n", descriptor = "I")
	public final int anInt14;

	@OriginalMember(owner = "client!aa", name = "r", descriptor = "I")
	public final int anInt16;

	@OriginalMember(owner = "client!aa", name = "q", descriptor = "I")
	public final int anInt15;

	@OriginalMember(owner = "client!aa", name = "s", descriptor = "I")
	public final int anInt17;

	@OriginalMember(owner = "client!aa", name = "p", descriptor = "Z")
	public final boolean aBoolean1;

	@OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class2_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt11 = arg3;
		this.anInt14 = arg4;
		this.anInt16 = arg0;
		this.anInt15 = arg2;
		this.anInt17 = arg1;
		this.aBoolean1 = arg5;
	}
}
