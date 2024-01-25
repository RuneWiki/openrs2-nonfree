import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public final class Class5_Sub44 extends Class5 {

	@OriginalMember(owner = "client!ps", name = "m", descriptor = "I")
	public final int anInt7791;

	@OriginalMember(owner = "client!ps", name = "p", descriptor = "I")
	public final int anInt7794;

	@OriginalMember(owner = "client!ps", name = "u", descriptor = "I")
	public final int anInt7798;

	@OriginalMember(owner = "client!ps", name = "v", descriptor = "I")
	public final int anInt7799;

	@OriginalMember(owner = "client!ps", name = "w", descriptor = "Z")
	public final boolean aBoolean667;

	@OriginalMember(owner = "client!ps", name = "s", descriptor = "I")
	public final int anInt7796;

	@OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class5_Sub44(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt7791 = arg1;
		this.anInt7794 = arg2;
		this.anInt7798 = arg0;
		this.anInt7799 = arg4;
		this.aBoolean667 = arg5;
		this.anInt7796 = arg3;
	}
}
