import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class31_Sub4 extends Class31 {

	@OriginalMember(owner = "client!uc", name = "n", descriptor = "I")
	private final int anInt6945;

	@OriginalMember(owner = "client!uc", name = "o", descriptor = "I")
	private final int anInt6946;

	@OriginalMember(owner = "client!uc", name = "B", descriptor = "I")
	private final int anInt6956;

	@OriginalMember(owner = "client!uc", name = "v", descriptor = "I")
	private final int anInt6951;

	@OriginalMember(owner = "client!uc", name = "s", descriptor = "I")
	private final int anInt6949;

	@OriginalMember(owner = "client!uc", name = "i", descriptor = "I")
	private final int anInt6940;

	@OriginalMember(owner = "client!uc", name = "z", descriptor = "I")
	private final int anInt6954;

	@OriginalMember(owner = "client!uc", name = "q", descriptor = "I")
	private final int anInt6947;

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class31_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt6945 = arg3;
		this.anInt6946 = arg7;
		this.anInt6956 = arg4;
		this.anInt6951 = arg2;
		this.anInt6949 = arg0;
		this.anInt6940 = arg1;
		this.anInt6954 = arg5;
		this.anInt6947 = arg6;
	}

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "(III)V")
	@Override
	public void method5446(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(III)V")
	@Override
	public void method5444(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(III)V")
	@Override
	public void method5445(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt6949 >> 12;
		@Pc(17) int local17 = this.anInt6940 * arg0 >> 12;
		@Pc(29) int local29 = this.anInt6951 * arg1 >> 12;
		@Pc(36) int local36 = arg0 * this.anInt6945 >> 12;
		@Pc(43) int local43 = this.anInt6956 * arg1 >> 12;
		@Pc(50) int local50 = arg0 * this.anInt6954 >> 12;
		@Pc(57) int local57 = this.anInt6947 * arg1 >> 12;
		@Pc(64) int local64 = this.anInt6946 * arg0 >> 12;
		Static391.method5380(local43, local64, local29, local57, local10, local50, super.anInt6939, local36, local17);
	}
}
