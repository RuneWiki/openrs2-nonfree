import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nf")
public final class Class92_Sub1_Sub1 extends Class92_Sub1 {

	@OriginalMember(owner = "client!nf", name = "v", descriptor = "Lclient!oj;")
	private Class4_Sub4 aClass4_Sub4_1;

	@OriginalMember(owner = "client!nf", name = "r", descriptor = "I")
	private final int anInt6274;

	@OriginalMember(owner = "client!nf", name = "l", descriptor = "I")
	private final int anInt6269;

	@OriginalMember(owner = "client!nf", name = "k", descriptor = "I")
	private final int anInt6268;

	@OriginalMember(owner = "client!nf", name = "m", descriptor = "I")
	private final int anInt6270;

	@OriginalMember(owner = "client!nf", name = "p", descriptor = "I")
	private final int anInt6272;

	@OriginalMember(owner = "client!nf", name = "q", descriptor = "I")
	private final int anInt6273;

	@OriginalMember(owner = "client!nf", name = "n", descriptor = "Lclient!jj;")
	private final Class62_Sub3 aClass62_Sub3_24;

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(Lclient!jj;IIIIII)V")
	public Class92_Sub1_Sub1(@OriginalArg(0) Class62_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt6274 = arg6;
		this.anInt6269 = arg2;
		this.anInt6268 = arg4;
		this.anInt6270 = arg1;
		this.anInt6272 = arg3;
		this.anInt6273 = arg5;
		this.aClass62_Sub3_24 = arg0;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Z)Lclient!oj;")
	@Override
	public Class4_Sub4 method6804() {
		if (this.aClass4_Sub4_1 == null) {
			@Pc(12) Interface8 local12 = this.aClass62_Sub3_24.anInterface8_145;
			Static125.anIntArray225[1] = this.anInt6269;
			Static125.anIntArray225[2] = this.anInt6272;
			Static125.anIntArray225[4] = this.anInt6273;
			Static125.anIntArray225[0] = this.anInt6270;
			Static125.anIntArray225[3] = this.anInt6268;
			Static125.anIntArray225[5] = this.anInt6274;
			@Pc(44) boolean local44 = false;
			@Pc(46) int local46 = 0;
			for (@Pc(48) int local48 = 0; local48 < 6; local48++) {
				if (!local12.method7236(Static125.anIntArray225[local48])) {
					return null;
				}
				@Pc(66) Class271 local66 = local12.method7237(Static125.anIntArray225[local48]);
				@Pc(73) int local73 = local66.aBoolean558 ? 64 : 128;
				if (local46 < local73) {
					local46 = local73;
				}
				if (local66.aByte77 > 0) {
					local44 = true;
				}
			}
			for (@Pc(96) int local96 = 0; local96 < 6; local96++) {
				Static290.anIntArrayArray41[local96] = local12.method7234(local46, local46, false, Static125.anIntArray225[local96], 1.0F);
			}
			this.aClass4_Sub4_1 = new Class4_Sub4(this.aClass62_Sub3_24, 6407, local46, local44, Static290.anIntArrayArray41);
		}
		return this.aClass4_Sub4_1;
	}
}
