import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class221_Sub2 extends Class221 {

	@OriginalMember(owner = "client!pd", name = "k", descriptor = "I")
	private final int anInt6985;

	@OriginalMember(owner = "client!pd", name = "o", descriptor = "I")
	private final int anInt6989;

	@OriginalMember(owner = "client!pd", name = "q", descriptor = "I")
	private final int anInt6990;

	@OriginalMember(owner = "client!pd", name = "j", descriptor = "I")
	private final int anInt6984;

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(IIIIIII)V")
	public Class221_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt6985 = arg3;
		this.anInt6989 = arg1;
		this.anInt6990 = arg0;
		this.anInt6984 = arg2;
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(III)V")
	@Override
	public void method7276(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IBI)V")
	@Override
	public void method7271(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt6990 * arg0 >> 12;
		@Pc(17) int local17 = this.anInt6984 * arg0 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt6989 >> 12;
		@Pc(31) int local31 = arg1 * this.anInt6985 >> 12;
		Static370.method5500(local24, local31, super.anInt8713, super.anInt8716, local10, super.anInt8717, local17);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(III)V")
	@Override
	public void method7274(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt6990 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt6984 >> 12;
		@Pc(28) int local28 = this.anInt6989 * arg1 >> 12;
		@Pc(35) int local35 = arg1 * this.anInt6985 >> 12;
		Static515.method7135(local10, local28, super.anInt8716, local17, local35);
	}
}
