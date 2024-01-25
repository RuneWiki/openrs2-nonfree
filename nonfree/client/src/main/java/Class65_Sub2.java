import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public final class Class65_Sub2 extends Class65 {

	@OriginalMember(owner = "client!ki", name = "w", descriptor = "I")
	public final int anInt4757;

	@OriginalMember(owner = "client!ki", name = "u", descriptor = "I")
	public final int anInt4755;

	@OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(Lclient!fw;Lclient!dg;IIIIIII)V")
	public Class65_Sub2(@OriginalArg(0) Class114 arg0, @OriginalArg(1) Class72 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
		this.anInt4757 = arg7;
		this.anInt4755 = arg8;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)Lclient!hs;")
	@Override
	public Class136 method5811() {
		return Static270.aClass136_68;
	}
}
