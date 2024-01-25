import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tq")
public final class Class26_Sub2_Sub1 extends Class26_Sub2 {

	@OriginalMember(owner = "client!tq", name = "C", descriptor = "Lclient!qca;")
	private Interface19 anInterface19_1;

	@OriginalMember(owner = "client!tq", name = "o", descriptor = "Lclient!kea;")
	private final Class14_Sub2 aClass14_Sub2_15;

	@OriginalMember(owner = "client!tq", name = "v", descriptor = "I")
	private final int anInt8708;

	@OriginalMember(owner = "client!tq", name = "A", descriptor = "I")
	private final int anInt8712;

	@OriginalMember(owner = "client!tq", name = "y", descriptor = "I")
	private final int anInt8711;

	@OriginalMember(owner = "client!tq", name = "s", descriptor = "I")
	private final int anInt8705;

	@OriginalMember(owner = "client!tq", name = "w", descriptor = "I")
	private final int anInt8709;

	@OriginalMember(owner = "client!tq", name = "u", descriptor = "I")
	private final int anInt8707;

	@OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(Lclient!kea;IIIIII)V")
	public Class26_Sub2_Sub1(@OriginalArg(0) Class14_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass14_Sub2_15 = arg0;
		this.anInt8708 = arg5;
		this.anInt8712 = arg1;
		this.anInt8711 = arg3;
		this.anInt8705 = arg2;
		this.anInt8709 = arg6;
		this.anInt8707 = arg4;
	}

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "(I)Lclient!qca;")
	@Override
	public Interface19 method7126() {
		if (this.anInterface19_1 == null) {
			@Pc(18) Interface4 local18 = this.aClass14_Sub2_15.anInterface4_15;
			Static240.anIntArray365[5] = this.anInt8709;
			Static240.anIntArray365[3] = this.anInt8707;
			Static240.anIntArray365[0] = this.anInt8712;
			Static240.anIntArray365[1] = this.anInt8705;
			Static240.anIntArray365[2] = this.anInt8711;
			Static240.anIntArray365[4] = this.anInt8708;
			@Pc(50) boolean local50 = false;
			@Pc(52) int local52 = 0;
			for (@Pc(54) int local54 = 0; local54 < 6; local54++) {
				if (!local18.method4233(Static240.anIntArray365[local54])) {
					return null;
				}
				@Pc(72) Class313 local72 = local18.method4234(Static240.anIntArray365[local54]);
				@Pc(79) int local79 = local72.aBoolean595 ? 64 : 128;
				if (local52 < local79) {
					local52 = local79;
				}
				if (local72.aByte103 > 0) {
					local50 = true;
				}
			}
			for (@Pc(98) int local98 = 0; local98 < 6; local98++) {
				Static255.anIntArrayArray41[local98] = local18.method4230(1.0F, Static240.anIntArray365[local98], local52, false, local52);
			}
			this.anInterface19_1 = this.aClass14_Sub2_15.method6932(local52, Static255.anIntArrayArray41, local50);
		}
		return this.anInterface19_1;
	}
}
