import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public final class Class24 {

	@OriginalMember(owner = "client!ee", name = "h", descriptor = "Z")
	public boolean aBoolean51 = true;

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "I")
	public final int anInt1093;

	@OriginalMember(owner = "client!ee", name = "g", descriptor = "I")
	public final int anInt1096;

	@OriginalMember(owner = "client!ee", name = "f", descriptor = "I")
	public final int anInt1095;

	@OriginalMember(owner = "client!ee", name = "k", descriptor = "I")
	public final int anInt1098;

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "I")
	public final int anInt1094;

	@OriginalMember(owner = "client!ee", name = "s", descriptor = "I")
	public final int anInt1100;

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class24(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.anInt1093 = arg0;
		this.aBoolean51 = arg6;
		this.anInt1096 = arg5;
		this.anInt1095 = arg2;
		this.anInt1098 = arg4;
		this.anInt1094 = arg1;
		this.anInt1100 = arg3;
	}
}
