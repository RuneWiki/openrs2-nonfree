import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oaa")
public final class Class141_Sub2_Sub1 extends Class141_Sub2 {

	@OriginalMember(owner = "client!oaa", name = "z", descriptor = "Lclient!ifa;")
	private Class94_Sub4 aClass94_Sub4_1;

	@OriginalMember(owner = "client!oaa", name = "y", descriptor = "I")
	private final int anInt7047;

	@OriginalMember(owner = "client!oaa", name = "t", descriptor = "I")
	private final int anInt7043;

	@OriginalMember(owner = "client!oaa", name = "r", descriptor = "I")
	private final int anInt7041;

	@OriginalMember(owner = "client!oaa", name = "x", descriptor = "I")
	private final int anInt7046;

	@OriginalMember(owner = "client!oaa", name = "v", descriptor = "I")
	private final int anInt7044;

	@OriginalMember(owner = "client!oaa", name = "p", descriptor = "Lclient!dw;")
	private final Class82_Sub1 aClass82_Sub1_32;

	@OriginalMember(owner = "client!oaa", name = "A", descriptor = "I")
	private final int anInt7048;

	@OriginalMember(owner = "client!oaa", name = "<init>", descriptor = "(Lclient!dw;IIIIII)V")
	public Class141_Sub2_Sub1(@OriginalArg(0) Class82_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt7047 = arg1;
		this.anInt7043 = arg2;
		this.anInt7041 = arg6;
		this.anInt7046 = arg4;
		this.anInt7044 = arg5;
		this.aClass82_Sub1_32 = arg0;
		this.anInt7048 = arg3;
	}

	@OriginalMember(owner = "client!oaa", name = "b", descriptor = "(I)Lclient!ifa;")
	@Override
	public Class94_Sub4 method6654() {
		if (this.aClass94_Sub4_1 == null) {
			Static105.anIntArray136[4] = this.anInt7044;
			Static105.anIntArray136[1] = this.anInt7043;
			Static105.anIntArray136[2] = this.anInt7048;
			@Pc(32) Interface5 local32 = this.aClass82_Sub1_32.anInterface5_9;
			Static105.anIntArray136[5] = this.anInt7041;
			Static105.anIntArray136[3] = this.anInt7046;
			Static105.anIntArray136[0] = this.anInt7047;
			@Pc(49) boolean local49 = false;
			@Pc(51) int local51 = 0;
			for (@Pc(53) int local53 = 0; local53 < 6; local53++) {
				if (!local32.method4130(Static105.anIntArray136[local53])) {
					return null;
				}
				@Pc(71) Class355 local71 = local32.method4129(Static105.anIntArray136[local53]);
				@Pc(78) int local78 = local71.aBoolean741 ? 64 : 128;
				if (local71.aByte123 > 0) {
					local49 = true;
				}
				if (local51 < local78) {
					local51 = local78;
				}
			}
			for (@Pc(98) int local98 = 0; local98 < 6; local98++) {
				Static625.anIntArrayArray59[local98] = local32.method4127(Static105.anIntArray136[local98], 1.0F, local51, local51, false);
			}
			this.aClass94_Sub4_1 = new Class94_Sub4(this.aClass82_Sub1_32, 6407, local51, local49, Static625.anIntArrayArray59);
		}
		return this.aClass94_Sub4_1;
	}
}
