import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gr")
public final class Class96_Sub1_Sub1 extends Class96_Sub1 {

	@OriginalMember(owner = "client!gr", name = "F", descriptor = "Lclient!ui;")
	private Class59_Sub4 aClass59_Sub4_1;

	@OriginalMember(owner = "client!gr", name = "H", descriptor = "I")
	private final int anInt2737;

	@OriginalMember(owner = "client!gr", name = "y", descriptor = "I")
	private final int anInt2732;

	@OriginalMember(owner = "client!gr", name = "D", descriptor = "I")
	private final int anInt2735;

	@OriginalMember(owner = "client!gr", name = "z", descriptor = "I")
	private final int anInt2733;

	@OriginalMember(owner = "client!gr", name = "J", descriptor = "I")
	private final int anInt2738;

	@OriginalMember(owner = "client!gr", name = "G", descriptor = "I")
	private final int anInt2736;

	@OriginalMember(owner = "client!gr", name = "A", descriptor = "Lclient!vd;")
	private final Class51_Sub2 aClass51_Sub2_20;

	@OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(Lclient!vd;IIIIII)V")
	public Class96_Sub1_Sub1(@OriginalArg(0) Class51_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt2737 = arg2;
		this.anInt2732 = arg1;
		this.anInt2735 = arg5;
		this.anInt2733 = arg6;
		this.anInt2738 = arg4;
		this.anInt2736 = arg3;
		this.aClass51_Sub2_20 = arg0;
	}

	@OriginalMember(owner = "client!gr", name = "b", descriptor = "(I)Lclient!ui;")
	@Override
	public Class59_Sub4 method2755() {
		if (this.aClass59_Sub4_1 == null) {
			Static29.anIntArray45[3] = this.anInt2738;
			Static29.anIntArray45[1] = this.anInt2737;
			Static29.anIntArray45[5] = this.anInt2733;
			@Pc(32) Interface4 local32 = this.aClass51_Sub2_20.anInterface4_8;
			Static29.anIntArray45[0] = this.anInt2732;
			Static29.anIntArray45[2] = this.anInt2736;
			Static29.anIntArray45[4] = this.anInt2735;
			@Pc(49) boolean local49 = false;
			@Pc(51) int local51 = 0;
			for (@Pc(53) int local53 = 0; local53 < 6; local53++) {
				if (!local32.method3140(Static29.anIntArray45[local53])) {
					return null;
				}
				@Pc(71) Class203 local71 = local32.method3138(Static29.anIntArray45[local53]);
				@Pc(78) int local78 = local71.aBoolean365 ? 64 : 128;
				if (local71.aByte61 > 0) {
					local49 = true;
				}
				if (local51 < local78) {
					local51 = local78;
				}
			}
			for (@Pc(100) int local100 = 0; local100 < 6; local100++) {
				Static422.anIntArrayArray58[local100] = local32.method3142(false, local51, 1.0F, Static29.anIntArray45[local100], local51);
			}
			this.aClass59_Sub4_1 = new Class59_Sub4(this.aClass51_Sub2_20, 6407, local51, local49, Static422.anIntArrayArray58);
		}
		return this.aClass59_Sub4_1;
	}
}
