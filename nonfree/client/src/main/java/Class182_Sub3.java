import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rb")
public final class Class182_Sub3 extends Class182 {

	@OriginalMember(owner = "client!rb", name = "q", descriptor = "I")
	private final int anInt7793;

	@OriginalMember(owner = "client!rb", name = "p", descriptor = "I")
	private final int anInt7792;

	@OriginalMember(owner = "client!rb", name = "u", descriptor = "I")
	private final int anInt7796;

	@OriginalMember(owner = "client!rb", name = "k", descriptor = "I")
	private final int anInt7789;

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(IIIIII)V")
	public Class182_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt7793 = arg1;
		this.anInt7792 = arg0;
		this.anInt7796 = arg2;
		this.anInt7789 = arg3;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIB)V")
	@Override
	public void method6584(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(III)V")
	@Override
	public void method6586(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt7792 >> 12;
		@Pc(25) int local25 = this.anInt7796 * arg1 >> 12;
		@Pc(32) int local32 = arg0 * this.anInt7793 >> 12;
		@Pc(39) int local39 = this.anInt7789 * arg0 >> 12;
		Static280.method4642(local32, local25, super.anInt7941, local10, local39);
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IBI)V")
	@Override
	public void method6581(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
