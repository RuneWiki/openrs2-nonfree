import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public final class Class13_Sub1_Sub2 extends Class13_Sub1 {

	@OriginalMember(owner = "client!te", name = "h", descriptor = "Lclient!ea;")
	private Class19_Sub2 aClass19_Sub2_2;

	@OriginalMember(owner = "client!te", name = "l", descriptor = "I")
	private final int anInt5855;

	@OriginalMember(owner = "client!te", name = "j", descriptor = "I")
	private final int anInt5853;

	@OriginalMember(owner = "client!te", name = "i", descriptor = "Lclient!ks;")
	private final Class63_Sub1 aClass63_Sub1_37;

	@OriginalMember(owner = "client!te", name = "k", descriptor = "I")
	private final int anInt5854;

	@OriginalMember(owner = "client!te", name = "p", descriptor = "I")
	private final int anInt5858;

	@OriginalMember(owner = "client!te", name = "n", descriptor = "I")
	private final int anInt5857;

	@OriginalMember(owner = "client!te", name = "m", descriptor = "I")
	private final int anInt5856;

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Lclient!ks;IIIIII)V")
	public Class13_Sub1_Sub2(@OriginalArg(0) Class63_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt5855 = arg1;
		this.anInt5853 = arg3;
		this.aClass63_Sub1_37 = arg0;
		this.anInt5854 = arg6;
		this.anInt5858 = arg5;
		this.anInt5857 = arg4;
		this.anInt5856 = arg2;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(I)Lclient!ea;")
	@Override
	public Class19_Sub2 method5276() {
		if (this.aClass19_Sub2_2 == null) {
			Static305.anIntArray453[0] = this.anInt5855;
			@Pc(18) Interface3 local18 = this.aClass63_Sub1_37.anInterface3_5;
			Static305.anIntArray453[3] = this.anInt5857;
			Static305.anIntArray453[4] = this.anInt5858;
			Static305.anIntArray453[5] = this.anInt5854;
			Static305.anIntArray453[2] = this.anInt5853;
			Static305.anIntArray453[1] = this.anInt5856;
			@Pc(45) boolean local45 = false;
			@Pc(47) int local47 = 0;
			@Pc(49) int local49;
			for (local49 = 0; local49 < 6; local49++) {
				if (!local18.method5485(Static305.anIntArray453[local49])) {
					return null;
				}
				@Pc(69) Class178 local69 = local18.method5486(Static305.anIntArray453[local49]);
				@Pc(76) int local76 = local69.aBoolean395 ? 64 : 128;
				if (local69.aByte53 > 0) {
					local45 = true;
				}
				if (local76 > local47) {
					local47 = local76;
				}
			}
			for (local49 = 0; local49 < 6; local49++) {
				Static305.anIntArrayArray65[local49] = local18.method5487(local47, false, local47, Static305.anIntArray453[local49], 1.0F);
			}
			this.aClass19_Sub2_2 = new Class19_Sub2(this.aClass63_Sub1_37, 6407, local47, local45, Static305.anIntArrayArray65);
		}
		return this.aClass19_Sub2_2;
	}
}
