import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tp")
public final class Class10_Sub4 extends Class10 {

	@OriginalMember(owner = "client!tp", name = "j", descriptor = "I")
	private final int anInt7910;

	@OriginalMember(owner = "client!tp", name = "n", descriptor = "I")
	private final int anInt7914;

	@OriginalMember(owner = "client!tp", name = "m", descriptor = "I")
	private final int anInt7913;

	@OriginalMember(owner = "client!tp", name = "h", descriptor = "I")
	private final int anInt7909;

	@OriginalMember(owner = "client!tp", name = "<init>", descriptor = "(IIIIIII)V")
	public Class10_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt7910 = arg3;
		this.anInt7914 = arg2;
		this.anInt7913 = arg0;
		this.anInt7909 = arg1;
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(III)V")
	@Override
	public void method6568(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(18) int local18 = arg0 * this.anInt7913 >> 12;
		@Pc(25) int local25 = this.anInt7914 * arg0 >> 12;
		@Pc(32) int local32 = arg1 * this.anInt7909 >> 12;
		@Pc(39) int local39 = arg1 * this.anInt7910 >> 12;
		Static280.method4539(local39, local18, super.anInt7903, local25, local32);
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(IIB)V")
	@Override
	public void method6571(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(17) int local17 = arg1 * this.anInt7913 >> 12;
		@Pc(24) int local24 = this.anInt7914 * arg1 >> 12;
		@Pc(31) int local31 = this.anInt7909 * arg0 >> 12;
		@Pc(38) int local38 = this.anInt7910 * arg0 >> 12;
		Static523.method7174(super.anInt7906, local38, local31, local17, super.anInt7907, local24);
	}

	@OriginalMember(owner = "client!tp", name = "b", descriptor = "(III)V")
	@Override
	public void method6570(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = this.anInt7913 * arg1 >> 12;
		@Pc(21) int local21 = arg1 * this.anInt7914 >> 12;
		@Pc(28) int local28 = this.anInt7909 * arg0 >> 12;
		@Pc(35) int local35 = this.anInt7910 * arg0 >> 12;
		Static270.method4439(super.anInt7907, super.anInt7903, local21, local35, local28, super.anInt7906, local14);
	}
}
