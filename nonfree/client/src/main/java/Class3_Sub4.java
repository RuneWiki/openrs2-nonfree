import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sk")
public final class Class3_Sub4 extends Class3 {

	@OriginalMember(owner = "client!sk", name = "o", descriptor = "I")
	private int anInt4890;

	@OriginalMember(owner = "client!sk", name = "u", descriptor = "I")
	private int anInt4895;

	@OriginalMember(owner = "client!sk", name = "q", descriptor = "I")
	private int anInt4892;

	@OriginalMember(owner = "client!sk", name = "n", descriptor = "I")
	private int anInt4889;

	@OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(IIIIIII)V")
	public Class3_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt4890 = arg0;
		this.anInt4895 = arg3;
		this.anInt4892 = arg1;
		this.anInt4889 = arg2;
	}

	@OriginalMember(owner = "client!sk", name = "c", descriptor = "(III)V")
	@Override
	public void method3667(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(6) int local6 = arg1 * this.anInt4890 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt4889 >> 12;
		@Pc(24) int local24 = arg0 * this.anInt4892 >> 12;
		@Pc(31) int local31 = arg0 * this.anInt4895 >> 12;
		Static87.method1419(local31, local17, this.anInt4883, local6, local24);
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(III)V")
	@Override
	public void method3663(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt4890 * arg0 >> 12;
		@Pc(25) int local25 = this.anInt4889 * arg0 >> 12;
		@Pc(32) int local32 = arg1 * this.anInt4895 >> 12;
		@Pc(39) int local39 = arg1 * this.anInt4892 >> 12;
		Static77.method1228(local25, local32, this.anInt4887, local39, local10, this.anInt4886);
	}

	@OriginalMember(owner = "client!sk", name = "d", descriptor = "(III)V")
	@Override
	public void method3668(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(6) int local6 = this.anInt4890 * arg0 >> 12;
		@Pc(18) int local18 = this.anInt4889 * arg0 >> 12;
		@Pc(29) int local29 = arg1 * this.anInt4892 >> 12;
		@Pc(36) int local36 = arg1 * this.anInt4895 >> 12;
		Static284.method4231(this.anInt4883, local36, local18, this.anInt4887, this.anInt4886, local29, local6);
	}
}
