import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dq")
public final class Class78_Sub1_Sub1 extends Class78_Sub1 {

	@OriginalMember(owner = "client!dq", name = "j", descriptor = "Lclient!q;")
	private Class85_Sub3 aClass85_Sub3_1;

	@OriginalMember(owner = "client!dq", name = "m", descriptor = "I")
	private final int anInt2993;

	@OriginalMember(owner = "client!dq", name = "l", descriptor = "I")
	private final int anInt2992;

	@OriginalMember(owner = "client!dq", name = "s", descriptor = "I")
	private final int anInt2996;

	@OriginalMember(owner = "client!dq", name = "k", descriptor = "I")
	private final int anInt2991;

	@OriginalMember(owner = "client!dq", name = "q", descriptor = "I")
	private final int anInt2995;

	@OriginalMember(owner = "client!dq", name = "h", descriptor = "I")
	private final int anInt2989;

	@OriginalMember(owner = "client!dq", name = "o", descriptor = "Lclient!qo;")
	private final Class20_Sub3 aClass20_Sub3_7;

	@OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(Lclient!qo;IIIIII)V")
	public Class78_Sub1_Sub1(@OriginalArg(0) Class20_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt2993 = arg3;
		this.anInt2992 = arg4;
		this.anInt2996 = arg6;
		this.anInt2991 = arg1;
		this.anInt2995 = arg2;
		this.anInt2989 = arg5;
		this.aClass20_Sub3_7 = arg0;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(B)Lclient!q;")
	@Override
	public Class85_Sub3 method7091() {
		if (this.aClass85_Sub3_1 == null) {
			@Pc(19) Interface4 local19 = this.aClass20_Sub3_7.anInterface4_12;
			Static642.anIntArray715[3] = this.anInt2992;
			Static642.anIntArray715[4] = this.anInt2989;
			Static642.anIntArray715[2] = this.anInt2993;
			Static642.anIntArray715[5] = this.anInt2996;
			Static642.anIntArray715[1] = this.anInt2995;
			Static642.anIntArray715[0] = this.anInt2991;
			@Pc(51) boolean local51 = false;
			@Pc(53) int local53 = 0;
			for (@Pc(55) int local55 = 0; local55 < 6; local55++) {
				if (!local19.method8049(Static642.anIntArray715[local55])) {
					return null;
				}
				@Pc(75) Class127 local75 = local19.method8048(Static642.anIntArray715[local55]);
				@Pc(82) int local82 = local75.aBoolean335 ? 64 : 128;
				if (local53 < local82) {
					local53 = local82;
				}
				if (local75.aByte76 > 0) {
					local51 = true;
				}
			}
			for (@Pc(101) int local101 = 0; local101 < 6; local101++) {
				Static117.anIntArrayArray12[local101] = local19.method8050(false, Static642.anIntArray715[local101], 1.0F, local53, local53);
			}
			this.aClass85_Sub3_1 = new Class85_Sub3(this.aClass20_Sub3_7, 6407, local53, local51, Static117.anIntArrayArray12);
		}
		return this.aClass85_Sub3_1;
	}
}
