import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public final class Class101_Sub2 extends Class101 {

	@OriginalMember(owner = "client!oq", name = "q", descriptor = "I")
	public final int anInt7067;

	@OriginalMember(owner = "client!oq", name = "t", descriptor = "I")
	public final int anInt7070;

	@OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(Lclient!ida;Lclient!ce;IIIIIII)V")
	public Class101_Sub2(@OriginalArg(0) Class148 arg0, @OriginalArg(1) Class49 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
		this.anInt7067 = arg8;
		this.anInt7070 = arg7;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(I)Lclient!qv;")
	@Override
	public Class271 method8097() {
		return Static511.aClass271_9;
	}
}
