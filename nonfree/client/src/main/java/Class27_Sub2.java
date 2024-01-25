import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cp")
public final class Class27_Sub2 extends Class27 {

	@OriginalMember(owner = "client!cp", name = "n", descriptor = "[Lclient!wd;")
	public static final Class210[] aClass210Array1 = new Class210[5];

	@OriginalMember(owner = "client!cp", name = "u", descriptor = "I")
	private final int anInt886;

	@OriginalMember(owner = "client!cp", name = "q", descriptor = "I")
	private final int anInt882;

	@OriginalMember(owner = "client!cp", name = "t", descriptor = "I")
	private final int anInt885;

	@OriginalMember(owner = "client!cp", name = "v", descriptor = "I")
	private final int anInt887;

	static {
		for (@Pc(4) int local4 = 0; local4 < aClass210Array1.length; local4++) {
			aClass210Array1[local4] = new Class210();
		}
	}

	@OriginalMember(owner = "client!cp", name = "<init>", descriptor = "(IIIIII)V")
	public Class27_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt886 = arg0;
		this.anInt882 = arg1;
		this.anInt885 = arg2;
		this.anInt887 = arg3;
	}

	@OriginalMember(owner = "client!cp", name = "b", descriptor = "(III)V")
	@Override
	public void method5366(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(III)V")
	@Override
	public void method5360(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(IZI)V")
	@Override
	public void method5361(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt886 * arg1 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt885 >> 12;
		@Pc(24) int local24 = this.anInt882 * arg0 >> 12;
		@Pc(37) int local37 = arg0 * this.anInt887 >> 12;
		Static309.method5231(local37, super.anInt6257, local24, local10, local17);
	}
}
