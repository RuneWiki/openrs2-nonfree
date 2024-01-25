import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oea")
public final class Class3_Sub44 extends Class3 {

	@OriginalMember(owner = "client!oea", name = "s", descriptor = "I")
	public final int anInt6805;

	@OriginalMember(owner = "client!oea", name = "v", descriptor = "I")
	public final int anInt6807;

	@OriginalMember(owner = "client!oea", name = "p", descriptor = "I")
	public final int anInt6803;

	@OriginalMember(owner = "client!oea", name = "u", descriptor = "I")
	public final int anInt6806;

	@OriginalMember(owner = "client!oea", name = "z", descriptor = "Z")
	public final boolean aBoolean486;

	@OriginalMember(owner = "client!oea", name = "n", descriptor = "I")
	public final int anInt6801;

	@OriginalMember(owner = "client!oea", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class3_Sub44(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt6805 = arg4;
		this.anInt6807 = arg3;
		this.anInt6803 = arg1;
		this.anInt6806 = arg0;
		this.aBoolean486 = arg5;
		this.anInt6801 = arg2;
	}
}
