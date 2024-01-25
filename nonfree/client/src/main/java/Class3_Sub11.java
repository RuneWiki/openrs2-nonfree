import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public final class Class3_Sub11 extends Class3 {

	@OriginalMember(owner = "client!ee", name = "p", descriptor = "I")
	public final int anInt2093;

	@OriginalMember(owner = "client!ee", name = "r", descriptor = "Z")
	public final boolean aBoolean166;

	@OriginalMember(owner = "client!ee", name = "q", descriptor = "I")
	public final int anInt2094;

	@OriginalMember(owner = "client!ee", name = "l", descriptor = "I")
	public final int anInt2090;

	@OriginalMember(owner = "client!ee", name = "m", descriptor = "I")
	public final int anInt2091;

	@OriginalMember(owner = "client!ee", name = "t", descriptor = "I")
	public final int anInt2096;

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class3_Sub11(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt2093 = arg1;
		this.aBoolean166 = arg5;
		this.anInt2094 = arg2;
		this.anInt2090 = arg4;
		this.anInt2091 = arg3;
		this.anInt2096 = arg0;
	}
}
