import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dm")
public final class Class3_Sub2_Sub1 extends Class3_Sub2 {

	@OriginalMember(owner = "client!dm", name = "t", descriptor = "Lclient!js;")
	private Interface10 anInterface10_1;

	@OriginalMember(owner = "client!dm", name = "n", descriptor = "I")
	private final int anInt1757;

	@OriginalMember(owner = "client!dm", name = "l", descriptor = "Lclient!gj;")
	private final Class90_Sub3 aClass90_Sub3_5;

	@OriginalMember(owner = "client!dm", name = "s", descriptor = "I")
	private final int anInt1762;

	@OriginalMember(owner = "client!dm", name = "o", descriptor = "I")
	private final int anInt1758;

	@OriginalMember(owner = "client!dm", name = "r", descriptor = "I")
	private final int anInt1761;

	@OriginalMember(owner = "client!dm", name = "u", descriptor = "I")
	private final int anInt1763;

	@OriginalMember(owner = "client!dm", name = "p", descriptor = "I")
	private final int anInt1759;

	@OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(Lclient!gj;IIIIII)V")
	public Class3_Sub2_Sub1(@OriginalArg(0) Class90_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt1757 = arg5;
		this.aClass90_Sub3_5 = arg0;
		this.anInt1762 = arg6;
		this.anInt1758 = arg4;
		this.anInt1761 = arg3;
		this.anInt1763 = arg1;
		this.anInt1759 = arg2;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)Lclient!js;")
	@Override
	public Interface10 method1617() {
		if (this.anInterface10_1 == null) {
			@Pc(18) Interface2 local18 = this.aClass90_Sub3_5.anInterface2_15;
			Static20.anIntArray16[4] = this.anInt1757;
			Static20.anIntArray16[5] = this.anInt1762;
			Static20.anIntArray16[2] = this.anInt1761;
			Static20.anIntArray16[1] = this.anInt1759;
			Static20.anIntArray16[0] = this.anInt1763;
			Static20.anIntArray16[3] = this.anInt1758;
			@Pc(50) boolean local50 = false;
			@Pc(52) int local52 = 0;
			for (@Pc(54) int local54 = 0; local54 < 6; local54++) {
				if (!local18.method3089(Static20.anIntArray16[local54])) {
					return null;
				}
				@Pc(72) Class115 local72 = local18.method3085(Static20.anIntArray16[local54]);
				@Pc(79) int local79 = local72.aBoolean233 ? 64 : 128;
				if (local79 > local52) {
					local52 = local79;
				}
				if (local72.aByte37 > 0) {
					local50 = true;
				}
			}
			for (@Pc(97) int local97 = 0; local97 < 6; local97++) {
				Static368.anIntArrayArray56[local97] = local18.method3088(Static20.anIntArray16[local97], local52, 1.0F, local52, false);
			}
			this.anInterface10_1 = this.aClass90_Sub3_5.method7657(Static368.anIntArrayArray56, local50, local52);
		}
		return this.anInterface10_1;
	}
}
