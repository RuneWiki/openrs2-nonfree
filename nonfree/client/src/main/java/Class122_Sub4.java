import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!si")
public final class Class122_Sub4 extends Class122 {

	@OriginalMember(owner = "client!si", name = "v", descriptor = "I")
	private final int anInt5914;

	@OriginalMember(owner = "client!si", name = "l", descriptor = "I")
	private final int anInt5906;

	@OriginalMember(owner = "client!si", name = "o", descriptor = "I")
	private final int anInt5908;

	@OriginalMember(owner = "client!si", name = "w", descriptor = "I")
	private final int anInt5915;

	@OriginalMember(owner = "client!si", name = "<init>", descriptor = "(IIIIII)V")
	public Class122_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt5914 = arg3;
		this.anInt5906 = arg0;
		this.anInt5908 = arg2;
		this.anInt5915 = arg1;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(ZII)V")
	@Override
	public void method4965(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt5906 * arg1 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt5908 >> 12;
		@Pc(24) int local24 = arg0 * this.anInt5915 >> 12;
		@Pc(31) int local31 = this.anInt5914 * arg0 >> 12;
		Static18.method363(super.anInt5900, local31, local10, local17, local24);
	}

	@OriginalMember(owner = "client!si", name = "b", descriptor = "(III)V")
	@Override
	public void method4969(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(III)V")
	@Override
	public void method4968(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
