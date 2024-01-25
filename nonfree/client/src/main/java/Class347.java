import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public final class Class347 {

	@OriginalMember(owner = "client!vr", name = "d", descriptor = "I")
	public final int anInt9255;

	@OriginalMember(owner = "client!vr", name = "g", descriptor = "I")
	public final int anInt9257;

	@OriginalMember(owner = "client!vr", name = "h", descriptor = "I")
	public final int anInt9258;

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "I")
	public final int anInt9253;

	@OriginalMember(owner = "client!vr", name = "<init>", descriptor = "(IIII)V")
	public Class347(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt9255 = arg2;
		this.anInt9257 = arg1;
		this.anInt9258 = arg3;
		this.anInt9253 = arg0;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(II)Lclient!vr;")
	public Class347 method7640(@OriginalArg(1) int arg0) {
		return new Class347(this.anInt9253, arg0, this.anInt9255, this.anInt9258);
	}
}
