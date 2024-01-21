import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mh")
public final class Class5_Sub3 extends Class5 {

	@OriginalMember(owner = "client!mh", name = "q", descriptor = "Z")
	public boolean aBoolean124 = false;

	@OriginalMember(owner = "client!mh", name = "N", descriptor = "I")
	private int anInt2749 = 0;

	@OriginalMember(owner = "client!mh", name = "v", descriptor = "I")
	private int anInt2735 = -32768;

	@OriginalMember(owner = "client!mh", name = "O", descriptor = "I")
	private int anInt2750 = 0;

	@OriginalMember(owner = "client!mh", name = "E", descriptor = "I")
	private final int anInt2743;

	@OriginalMember(owner = "client!mh", name = "l", descriptor = "I")
	public final int anInt2730;

	@OriginalMember(owner = "client!mh", name = "z", descriptor = "I")
	public final int anInt2739;

	@OriginalMember(owner = "client!mh", name = "B", descriptor = "I")
	public final int anInt2740;

	@OriginalMember(owner = "client!mh", name = "C", descriptor = "I")
	public final int anInt2741;

	@OriginalMember(owner = "client!mh", name = "t", descriptor = "I")
	public final int anInt2734;

	@OriginalMember(owner = "client!mh", name = "F", descriptor = "Lclient!td;")
	private Class1_Sub2_Sub22 aClass1_Sub2_Sub22_1;

	@OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(IIIIIII)V")
	public Class5_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt2743 = arg0;
		this.anInt2730 = arg4;
		this.anInt2739 = arg2;
		this.anInt2740 = arg3;
		this.anInt2741 = arg6 + arg5;
		this.anInt2734 = arg1;
		@Pc(39) int local39 = Static72.method1365(this.anInt2743).anInt294;
		if (local39 == -1) {
			this.aBoolean124 = true;
		} else {
			this.aBoolean124 = false;
			this.aClass1_Sub2_Sub22_1 = Static85.method2622(local39);
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)V")
	public void method2093(@OriginalArg(0) int arg0) {
		if (this.aBoolean124) {
			return;
		}
		this.anInt2750 += arg0;
		while (this.aClass1_Sub2_Sub22_1.anIntArray344[this.anInt2749] < this.anInt2750) {
			this.anInt2750 -= this.aClass1_Sub2_Sub22_1.anIntArray344[this.anInt2749];
			this.anInt2749++;
			if (this.anInt2749 >= this.aClass1_Sub2_Sub22_1.anIntArray346.length) {
				this.aBoolean124 = true;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method3164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		@Pc(7) Class5_Sub1 local7 = this.method2095();
		if (local7 != null) {
			local7.method3164(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			this.anInt2735 = local7.method3163();
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Z)Lclient!lg;")
	private Class5_Sub1 method2095() {
		@Pc(18) Class1_Sub2_Sub3 local18 = Static72.method1365(this.anInt2743);
		@Pc(27) Class5_Sub1 local27;
		if (this.aBoolean124) {
			local27 = local18.method299(-1);
		} else {
			local27 = local18.method299(this.anInt2749);
		}
		return local27 == null ? null : local27;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "()I")
	@Override
	public int method3163() {
		return this.anInt2735;
	}
}
