import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public final class Class3_Sub50 extends Class3 {

	@OriginalMember(owner = "client!ue", name = "p", descriptor = "I")
	public final int anInt10079;

	@OriginalMember(owner = "client!ue", name = "m", descriptor = "I")
	public final int anInt10077;

	@OriginalMember(owner = "client!ue", name = "l", descriptor = "I")
	public final int anInt10076;

	@OriginalMember(owner = "client!ue", name = "o", descriptor = "I")
	public final int anInt10078;

	@OriginalMember(owner = "client!ue", name = "s", descriptor = "Z")
	public final boolean aBoolean708;

	@OriginalMember(owner = "client!ue", name = "r", descriptor = "I")
	public final int anInt10080;

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class3_Sub50(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt10079 = arg3;
		this.anInt10077 = arg4;
		this.anInt10076 = arg0;
		this.anInt10078 = arg2;
		this.aBoolean708 = arg5;
		this.anInt10080 = arg1;
	}
}
