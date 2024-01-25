import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gaa")
public final class Class22_Sub2 extends Class22 {

	@OriginalMember(owner = "client!gaa", name = "l", descriptor = "I")
	private final int anInt3199;

	@OriginalMember(owner = "client!gaa", name = "k", descriptor = "I")
	private final int anInt3198;

	@OriginalMember(owner = "client!gaa", name = "m", descriptor = "I")
	private final int anInt3200;

	@OriginalMember(owner = "client!gaa", name = "p", descriptor = "I")
	private final int anInt3202;

	@OriginalMember(owner = "client!gaa", name = "<init>", descriptor = "(IIIIIII)V")
	public Class22_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt3199 = arg2;
		this.anInt3198 = arg0;
		this.anInt3200 = arg3;
		this.anInt3202 = arg1;
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(III)V")
	@Override
	public void method6562(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt3198 >> 12;
		@Pc(17) int local17 = this.anInt3199 * arg1 >> 12;
		@Pc(24) int local24 = this.anInt3202 * arg0 >> 12;
		@Pc(37) int local37 = arg0 * this.anInt3200 >> 12;
		Static288.method8155(super.anInt7880, super.anInt7878, local17, super.anInt7882, local24, local37, local10);
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method6561(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(18) int local18 = arg0 * this.anInt3198 >> 12;
		@Pc(25) int local25 = arg0 * this.anInt3199 >> 12;
		@Pc(32) int local32 = arg1 * this.anInt3202 >> 12;
		@Pc(39) int local39 = this.anInt3200 * arg1 >> 12;
		Static478.method7172(super.anInt7882, local39, local18, super.anInt7878, local25, local32);
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(IIB)V")
	@Override
	public void method6565(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt3198 * arg0 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt3199 >> 12;
		@Pc(24) int local24 = this.anInt3202 * arg1 >> 12;
		@Pc(40) int local40 = this.anInt3200 * arg1 >> 12;
		Static566.method8099(local10, super.anInt7880, local40, local24, local17);
	}
}
