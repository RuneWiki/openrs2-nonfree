import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class Class103_Sub2_Sub2 extends Class103_Sub2 {

	@OriginalMember(owner = "client!le", name = "t", descriptor = "Lclient!kh;")
	private Class164_Sub1 aClass164_Sub1_2;

	@OriginalMember(owner = "client!le", name = "v", descriptor = "I")
	private final int anInt5214;

	@OriginalMember(owner = "client!le", name = "m", descriptor = "I")
	private final int anInt5207;

	@OriginalMember(owner = "client!le", name = "n", descriptor = "I")
	private final int anInt5208;

	@OriginalMember(owner = "client!le", name = "s", descriptor = "I")
	private final int anInt5212;

	@OriginalMember(owner = "client!le", name = "q", descriptor = "Lclient!mh;")
	private final Class4_Sub3 aClass4_Sub3_24;

	@OriginalMember(owner = "client!le", name = "x", descriptor = "I")
	private final int anInt5216;

	@OriginalMember(owner = "client!le", name = "r", descriptor = "I")
	private final int anInt5211;

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Lclient!mh;IIIIII)V")
	public Class103_Sub2_Sub2(@OriginalArg(0) Class4_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt5214 = arg4;
		this.anInt5207 = arg3;
		this.anInt5208 = arg1;
		this.anInt5212 = arg6;
		this.aClass4_Sub3_24 = arg0;
		this.anInt5216 = arg2;
		this.anInt5211 = arg5;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(B)Lclient!kh;")
	@Override
	public Class164_Sub1 method4825() {
		if (this.aClass164_Sub1_2 == null) {
			Static128.anIntArray429[0] = this.anInt5208;
			Static128.anIntArray429[5] = this.anInt5212;
			Static128.anIntArray429[4] = this.anInt5211;
			@Pc(33) Interface13 local33 = this.aClass4_Sub3_24.anInterface13_13;
			Static128.anIntArray429[3] = this.anInt5214;
			Static128.anIntArray429[2] = this.anInt5207;
			Static128.anIntArray429[1] = this.anInt5216;
			@Pc(50) boolean local50 = false;
			@Pc(52) int local52 = 0;
			for (@Pc(54) int local54 = 0; local54 < 6; local54++) {
				if (!local33.method5788(Static128.anIntArray429[local54])) {
					return null;
				}
				@Pc(72) Class296 local72 = local33.method5789(Static128.anIntArray429[local54]);
				@Pc(79) int local79 = local72.aBoolean638 ? 64 : 128;
				if (local72.aByte102 > 0) {
					local50 = true;
				}
				if (local52 < local79) {
					local52 = local79;
				}
			}
			for (@Pc(102) int local102 = 0; local102 < 6; local102++) {
				Static18.anIntArrayArray6[local102] = local33.method5790(local52, false, 1.0F, Static128.anIntArray429[local102], local52);
			}
			this.aClass164_Sub1_2 = new Class164_Sub1(this.aClass4_Sub3_24, 6407, local52, local50, Static18.anIntArrayArray6);
		}
		return this.aClass164_Sub1_2;
	}
}
