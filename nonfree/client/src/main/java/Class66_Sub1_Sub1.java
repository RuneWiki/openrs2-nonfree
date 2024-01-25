import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mba")
public final class Class66_Sub1_Sub1 extends Class66_Sub1 {

	@OriginalMember(owner = "client!mba", name = "i", descriptor = "Lclient!vda;")
	private Class11_Sub4 aClass11_Sub4_1;

	@OriginalMember(owner = "client!mba", name = "p", descriptor = "I")
	private final int anInt5901;

	@OriginalMember(owner = "client!mba", name = "k", descriptor = "I")
	private final int anInt5897;

	@OriginalMember(owner = "client!mba", name = "q", descriptor = "I")
	private final int anInt5902;

	@OriginalMember(owner = "client!mba", name = "r", descriptor = "I")
	private final int anInt5903;

	@OriginalMember(owner = "client!mba", name = "n", descriptor = "I")
	private final int anInt5899;

	@OriginalMember(owner = "client!mba", name = "l", descriptor = "I")
	private final int anInt5898;

	@OriginalMember(owner = "client!mba", name = "m", descriptor = "Lclient!ad;")
	private final Class5_Sub1 aClass5_Sub1_22;

	@OriginalMember(owner = "client!mba", name = "<init>", descriptor = "(Lclient!ad;IIIIII)V")
	public Class66_Sub1_Sub1(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt5901 = arg6;
		this.anInt5897 = arg5;
		this.anInt5902 = arg4;
		this.anInt5903 = arg3;
		this.anInt5899 = arg1;
		this.anInt5898 = arg2;
		this.aClass5_Sub1_22 = arg0;
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(Z)Lclient!vda;")
	@Override
	public Class11_Sub4 method4936() {
		if (this.aClass11_Sub4_1 == null) {
			Static485.anIntArray740[1] = this.anInt5898;
			@Pc(24) Interface4 local24 = this.aClass5_Sub1_22.anInterface4_14;
			Static485.anIntArray740[2] = this.anInt5903;
			Static485.anIntArray740[0] = this.anInt5899;
			Static485.anIntArray740[4] = this.anInt5897;
			Static485.anIntArray740[3] = this.anInt5902;
			Static485.anIntArray740[5] = this.anInt5901;
			@Pc(51) byte local51 = 0;
			@Pc(53) int local53 = 0;
			for (@Pc(55) int local55 = 0; local55 < 6; local55++) {
				if (!local24.method6708(Static485.anIntArray740[local55])) {
					return null;
				}
				@Pc(73) Class238 local73 = local24.method6712(Static485.anIntArray740[local55]);
				@Pc(80) int local80 = local73.aBoolean466 ? 64 : 128;
				if (local80 > local53) {
					local53 = local80;
				}
				if (local73.aByte72 > 0) {
					local51 = 1;
				}
			}
			for (@Pc(99) int local99 = 0; local99 < 6; local99++) {
				Static545.anIntArrayArray90[local99] = local24.method6711(local53, 1.0F, Static485.anIntArray740[local99], local53, false);
			}
			this.aClass11_Sub4_1 = new Class11_Sub4(this.aClass5_Sub1_22, 6407, local53, local51 != 0, Static545.anIntArrayArray90);
		}
		return this.aClass11_Sub4_1;
	}
}
