import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!go")
public final class Class81_Sub1_Sub1 extends Class81_Sub1 {

	@OriginalMember(owner = "client!go", name = "i", descriptor = "Lclient!wl;")
	private Class52_Sub4 aClass52_Sub4_1;

	@OriginalMember(owner = "client!go", name = "j", descriptor = "I")
	private final int anInt2669;

	@OriginalMember(owner = "client!go", name = "n", descriptor = "I")
	private final int anInt2672;

	@OriginalMember(owner = "client!go", name = "o", descriptor = "I")
	private final int anInt2673;

	@OriginalMember(owner = "client!go", name = "k", descriptor = "I")
	private final int anInt2670;

	@OriginalMember(owner = "client!go", name = "q", descriptor = "I")
	private final int anInt2674;

	@OriginalMember(owner = "client!go", name = "h", descriptor = "Lclient!ig;")
	private final Class47_Sub2 aClass47_Sub2_17;

	@OriginalMember(owner = "client!go", name = "l", descriptor = "I")
	private final int anInt2671;

	@OriginalMember(owner = "client!go", name = "<init>", descriptor = "(Lclient!ig;IIIIII)V")
	public Class81_Sub1_Sub1(@OriginalArg(0) Class47_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt2669 = arg3;
		this.anInt2672 = arg6;
		this.anInt2673 = arg1;
		this.anInt2670 = arg4;
		this.anInt2674 = arg2;
		this.aClass47_Sub2_17 = arg0;
		this.anInt2671 = arg5;
	}

	@OriginalMember(owner = "client!go", name = "b", descriptor = "(I)Lclient!wl;")
	@Override
	public Class52_Sub4 method5599() {
		if (this.aClass52_Sub4_1 == null) {
			Static109.anIntArray237[2] = this.anInt2669;
			Static109.anIntArray237[5] = this.anInt2672;
			Static109.anIntArray237[4] = this.anInt2671;
			Static109.anIntArray237[1] = this.anInt2674;
			Static109.anIntArray237[3] = this.anInt2670;
			Static109.anIntArray237[0] = this.anInt2673;
			@Pc(37) Interface3 local37 = this.aClass47_Sub2_17.anInterface3_5;
			@Pc(39) byte local39 = 0;
			@Pc(41) int local41 = 0;
			@Pc(43) int local43;
			for (local43 = 0; local43 < 6; local43++) {
				if (!local37.method5439(Static109.anIntArray237[local43])) {
					return null;
				}
				@Pc(63) Class102 local63 = local37.method5441(Static109.anIntArray237[local43]);
				@Pc(70) int local70 = local63.aBoolean256 ? 64 : 128;
				if (local41 < local70) {
					local41 = local70;
				}
				if (local63.aByte42 > 0) {
					local39 = 1;
				}
			}
			for (local43 = 0; local43 < 6; local43++) {
				Static109.anIntArrayArray72[local43] = local37.method5442(local41, false, 1.0F, local41, Static109.anIntArray237[local43]);
			}
			this.aClass52_Sub4_1 = new Class52_Sub4(this.aClass47_Sub2_17, 6407, local41, local39 != 0, Static109.anIntArrayArray72);
		}
		return this.aClass52_Sub4_1;
	}
}
