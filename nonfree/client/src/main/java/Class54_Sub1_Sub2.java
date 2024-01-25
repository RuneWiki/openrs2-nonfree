import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hq")
public final class Class54_Sub1_Sub2 extends Class54_Sub1 {

	@OriginalMember(owner = "client!hq", name = "f", descriptor = "Lclient!fq;")
	private Class60_Sub2 aClass60_Sub2_2;

	@OriginalMember(owner = "client!hq", name = "i", descriptor = "Lclient!mm;")
	private final Class55_Sub1 aClass55_Sub1_24;

	@OriginalMember(owner = "client!hq", name = "g", descriptor = "I")
	private final int anInt2412;

	@OriginalMember(owner = "client!hq", name = "n", descriptor = "I")
	private final int anInt2416;

	@OriginalMember(owner = "client!hq", name = "m", descriptor = "I")
	private final int anInt2415;

	@OriginalMember(owner = "client!hq", name = "k", descriptor = "I")
	private final int anInt2414;

	@OriginalMember(owner = "client!hq", name = "h", descriptor = "I")
	private final int anInt2413;

	@OriginalMember(owner = "client!hq", name = "o", descriptor = "I")
	private final int anInt2417;

	@OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Lclient!mm;IIIIII)V")
	public Class54_Sub1_Sub2(@OriginalArg(0) Class55_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass55_Sub1_24 = arg0;
		this.anInt2412 = arg5;
		this.anInt2416 = arg3;
		this.anInt2415 = arg1;
		this.anInt2414 = arg2;
		this.anInt2413 = arg4;
		this.anInt2417 = arg6;
	}

	@OriginalMember(owner = "client!hq", name = "b", descriptor = "(I)Lclient!fq;")
	@Override
	public Class60_Sub2 method2238() {
		if (this.aClass60_Sub2_2 == null) {
			Static126.anIntArray241[2] = this.anInt2416;
			@Pc(12) Interface3 local12 = this.aClass55_Sub1_24.anInterface3_4;
			Static126.anIntArray241[0] = this.anInt2415;
			Static126.anIntArray241[1] = this.anInt2414;
			Static126.anIntArray241[3] = this.anInt2413;
			Static126.anIntArray241[5] = this.anInt2417;
			Static126.anIntArray241[4] = this.anInt2412;
			@Pc(39) byte local39 = 0;
			@Pc(41) int local41 = 0;
			@Pc(43) int local43;
			for (local43 = 0; local43 < 6; local43++) {
				if (!local12.method1509(Static126.anIntArray241[local43])) {
					return null;
				}
				@Pc(63) Class200 local63 = local12.method1511(Static126.anIntArray241[local43]);
				@Pc(70) int local70 = local63.aBoolean539 ? 64 : 128;
				if (local63.aByte62 > 0) {
					local39 = 1;
				}
				if (local41 < local70) {
					local41 = local70;
				}
			}
			for (local43 = 0; local43 < 6; local43++) {
				Static126.anIntArrayArray43[local43] = local12.method1508(local41, local41, Static126.anIntArray241[local43], false, 1.0F);
			}
			this.aClass60_Sub2_2 = new Class60_Sub2(this.aClass55_Sub1_24, 6407, local41, local39 != 0, Static126.anIntArrayArray43);
		}
		return this.aClass60_Sub2_2;
	}
}
