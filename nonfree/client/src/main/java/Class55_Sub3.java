import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kga")
public final class Class55_Sub3 extends Class55 {

	@OriginalMember(owner = "client!kga", name = "s", descriptor = "I")
	private final int anInt5475;

	@OriginalMember(owner = "client!kga", name = "m", descriptor = "I")
	private final int anInt5478;

	@OriginalMember(owner = "client!kga", name = "u", descriptor = "I")
	private final int anInt5479;

	@OriginalMember(owner = "client!kga", name = "n", descriptor = "I")
	private final int anInt5474;

	@OriginalMember(owner = "client!kga", name = "p", descriptor = "I")
	private final int anInt5484;

	@OriginalMember(owner = "client!kga", name = "h", descriptor = "I")
	private final int anInt5482;

	@OriginalMember(owner = "client!kga", name = "l", descriptor = "I")
	private final int anInt5486;

	@OriginalMember(owner = "client!kga", name = "j", descriptor = "I")
	private final int anInt5477;

	@OriginalMember(owner = "client!kga", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class55_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt5475 = arg4;
		this.anInt5478 = arg7;
		this.anInt5479 = arg0;
		this.anInt5474 = arg2;
		this.anInt5484 = arg5;
		this.anInt5482 = arg6;
		this.anInt5486 = arg1;
		this.anInt5477 = arg3;
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(IBI)V")
	@Override
	public void method6532(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(III)V")
	@Override
	public void method6528(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt5479 >> 12;
		@Pc(17) int local17 = this.anInt5486 * arg0 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt5474 >> 12;
		@Pc(31) int local31 = this.anInt5477 * arg0 >> 12;
		@Pc(38) int local38 = arg1 * this.anInt5475 >> 12;
		@Pc(52) int local52 = this.anInt5484 * arg0 >> 12;
		@Pc(59) int local59 = this.anInt5482 * arg1 >> 12;
		@Pc(66) int local66 = this.anInt5478 * arg0 >> 12;
		Static26.method945(local10, super.anInt7555, local38, local31, local17, local24, local52, local59, local66);
	}

	@OriginalMember(owner = "client!kga", name = "b", descriptor = "(III)V")
	@Override
	public void method6527(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
