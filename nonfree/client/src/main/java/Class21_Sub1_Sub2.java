import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jh")
public final class Class21_Sub1_Sub2 extends Class21_Sub1 {

	@OriginalMember(owner = "client!jh", name = "l", descriptor = "Lclient!qh;")
	private Class7_Sub4 aClass7_Sub4_2;

	@OriginalMember(owner = "client!jh", name = "j", descriptor = "Lclient!qi;")
	private final Class82_Sub2 aClass82_Sub2_21;

	@OriginalMember(owner = "client!jh", name = "i", descriptor = "I")
	private final int anInt2986;

	@OriginalMember(owner = "client!jh", name = "m", descriptor = "I")
	private final int anInt2988;

	@OriginalMember(owner = "client!jh", name = "k", descriptor = "I")
	private final int anInt2987;

	@OriginalMember(owner = "client!jh", name = "d", descriptor = "I")
	private final int anInt2983;

	@OriginalMember(owner = "client!jh", name = "f", descriptor = "I")
	private final int anInt2984;

	@OriginalMember(owner = "client!jh", name = "h", descriptor = "I")
	private final int anInt2985;

	@OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(Lclient!qi;IIIIII)V")
	public Class21_Sub1_Sub2(@OriginalArg(0) Class82_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass82_Sub2_21 = arg0;
		this.anInt2986 = arg2;
		this.anInt2988 = arg6;
		this.anInt2987 = arg1;
		this.anInt2983 = arg4;
		this.anInt2984 = arg5;
		this.anInt2985 = arg3;
	}

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "(B)Lclient!qh;")
	@Override
	public Class7_Sub4 method2723() {
		if (this.aClass7_Sub4_2 == null) {
			Static167.anIntArray333[3] = this.anInt2983;
			Static167.anIntArray333[1] = this.anInt2986;
			Static167.anIntArray333[0] = this.anInt2987;
			Static167.anIntArray333[4] = this.anInt2984;
			@Pc(28) Interface1 local28 = this.aClass82_Sub2_21.anInterface1_4;
			Static167.anIntArray333[5] = this.anInt2988;
			Static167.anIntArray333[2] = this.anInt2985;
			@Pc(40) boolean local40 = false;
			@Pc(42) int local42 = 0;
			@Pc(44) int local44;
			for (local44 = 0; local44 < 6; local44++) {
				if (!local28.method2846(Static167.anIntArray333[local44])) {
					return null;
				}
				@Pc(63) Class182 local63 = local28.method2849(Static167.anIntArray333[local44]);
				@Pc(70) int local70 = local63.aBoolean361 ? 64 : 128;
				if (local42 < local70) {
					local42 = local70;
				}
				if (local63.aByte53 > 0) {
					local40 = true;
				}
			}
			for (local44 = 0; local44 < 6; local44++) {
				Static167.anIntArrayArray14[local44] = local28.method2850(false, local42, 1.0F, Static167.anIntArray333[local44], local42);
			}
			this.aClass7_Sub4_2 = new Class7_Sub4(this.aClass82_Sub2_21, 6407, local42, local40, Static167.anIntArrayArray14);
		}
		return this.aClass7_Sub4_2;
	}
}
