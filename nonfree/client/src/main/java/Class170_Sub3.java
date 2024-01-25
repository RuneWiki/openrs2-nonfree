import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pn")
public final class Class170_Sub3 extends Class170 {

	@OriginalMember(owner = "client!pn", name = "n", descriptor = "I")
	private final int anInt7153;

	@OriginalMember(owner = "client!pn", name = "h", descriptor = "I")
	private final int anInt7147;

	@OriginalMember(owner = "client!pn", name = "t", descriptor = "I")
	private final int anInt7158;

	@OriginalMember(owner = "client!pn", name = "k", descriptor = "I")
	private final int anInt7150;

	@OriginalMember(owner = "client!pn", name = "i", descriptor = "I")
	private final int anInt7148;

	@OriginalMember(owner = "client!pn", name = "s", descriptor = "I")
	private final int anInt7157;

	@OriginalMember(owner = "client!pn", name = "p", descriptor = "I")
	private final int anInt7154;

	@OriginalMember(owner = "client!pn", name = "l", descriptor = "I")
	private final int anInt7151;

	@OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class170_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt7153 = arg6;
		this.anInt7147 = arg5;
		this.anInt7158 = arg7;
		this.anInt7150 = arg4;
		this.anInt7148 = arg0;
		this.anInt7157 = arg1;
		this.anInt7154 = arg3;
		this.anInt7151 = arg2;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(III)V")
	@Override
	public void method6131(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = arg1 * this.anInt7148 >> 12;
		@Pc(22) int local22 = arg0 * this.anInt7157 >> 12;
		@Pc(29) int local29 = this.anInt7151 * arg1 >> 12;
		@Pc(36) int local36 = this.anInt7154 * arg0 >> 12;
		@Pc(43) int local43 = arg1 * this.anInt7150 >> 12;
		@Pc(50) int local50 = arg0 * this.anInt7147 >> 12;
		@Pc(57) int local57 = this.anInt7153 * arg1 >> 12;
		@Pc(64) int local64 = arg0 * this.anInt7158 >> 12;
		Static264.method4338(local43, local64, super.anInt7392, local22, local29, local15, local57, local50, local36);
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIB)V")
	@Override
	public void method6129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(BII)V")
	@Override
	public void method6128(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
