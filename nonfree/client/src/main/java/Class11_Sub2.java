import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!de")
public final class Class11_Sub2 extends Class11 {

	@OriginalMember(owner = "client!de", name = "y", descriptor = "I")
	private int anInt955;

	@OriginalMember(owner = "client!de", name = "u", descriptor = "I")
	private int anInt951;

	@OriginalMember(owner = "client!de", name = "w", descriptor = "I")
	private int anInt953;

	@OriginalMember(owner = "client!de", name = "v", descriptor = "I")
	private int anInt952;

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "(IIIIII)V")
	public Class11_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt955 = arg2;
		this.anInt951 = arg1;
		this.anInt953 = arg0;
		this.anInt952 = arg3;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(III)V")
	@Override
	public void method1936(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method1939(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6 = arg0 * this.anInt953 >> 12;
		@Pc(25) int local25 = this.anInt955 * arg0 >> 12;
		@Pc(32) int local32 = this.anInt952 * arg1 >> 12;
		@Pc(39) int local39 = this.anInt951 * arg1 >> 12;
		Static257.method4059(local39, local32, this.anInt2466, local6, local25);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IIB)V")
	@Override
	public void method1935(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
