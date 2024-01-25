import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public final class Class105_Sub3 extends Class105 {

	@OriginalMember(owner = "client!re", name = "v", descriptor = "I")
	private final int anInt6184;

	@OriginalMember(owner = "client!re", name = "q", descriptor = "I")
	private final int anInt6180;

	@OriginalMember(owner = "client!re", name = "p", descriptor = "I")
	private final int anInt6179;

	@OriginalMember(owner = "client!re", name = "t", descriptor = "I")
	private final int anInt6182;

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "(IIIIII)V")
	public Class105_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt6184 = arg3;
		this.anInt6180 = arg0;
		this.anInt6179 = arg1;
		this.anInt6182 = arg2;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IZI)V")
	@Override
	public void method5928(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt6180 * arg0 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt6182 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt6179 >> 12;
		@Pc(36) int local36 = arg1 * this.anInt6184 >> 12;
		Static205.method2887(super.anInt7370, local24, local10, local17, local36);
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIB)V")
	@Override
	public void method5922(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(IIB)V")
	@Override
	public void method5927(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
