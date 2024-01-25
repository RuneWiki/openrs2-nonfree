import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vn")
public final class Class3_Sub4 extends Class3 {

	@OriginalMember(owner = "client!vn", name = "l", descriptor = "I")
	private final int anInt9996;

	@OriginalMember(owner = "client!vn", name = "n", descriptor = "I")
	private final int anInt9998;

	@OriginalMember(owner = "client!vn", name = "j", descriptor = "I")
	private final int anInt9995;

	@OriginalMember(owner = "client!vn", name = "i", descriptor = "I")
	private final int anInt9994;

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(IIIIII)V")
	public Class3_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt9996 = arg1;
		this.anInt9998 = arg3;
		this.anInt9995 = arg2;
		this.anInt9994 = arg0;
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(III)V")
	@Override
	public void method8487(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(III)V")
	@Override
	public void method8485(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = this.anInt9994 * arg1 >> 12;
		@Pc(25) int local25 = this.anInt9995 * arg1 >> 12;
		@Pc(32) int local32 = this.anInt9996 * arg0 >> 12;
		@Pc(39) int local39 = arg0 * this.anInt9998 >> 12;
		Static139.method2089(local25, super.anInt9988, local32, local39, local18);
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IBI)V")
	@Override
	public void method8489(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
