import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lu")
public final class Class41_Sub1_Sub2 extends Class41_Sub1 {

	@OriginalMember(owner = "client!lu", name = "t", descriptor = "Lclient!hp;")
	private Class62_Sub3 aClass62_Sub3_2;

	@OriginalMember(owner = "client!lu", name = "E", descriptor = "I")
	private final int anInt4635;

	@OriginalMember(owner = "client!lu", name = "v", descriptor = "I")
	private final int anInt4628;

	@OriginalMember(owner = "client!lu", name = "D", descriptor = "I")
	private final int anInt4634;

	@OriginalMember(owner = "client!lu", name = "u", descriptor = "Lclient!bt;")
	private final Class30_Sub1 aClass30_Sub1_29;

	@OriginalMember(owner = "client!lu", name = "w", descriptor = "I")
	private final int anInt4629;

	@OriginalMember(owner = "client!lu", name = "x", descriptor = "I")
	private final int anInt4630;

	@OriginalMember(owner = "client!lu", name = "s", descriptor = "I")
	private final int anInt4627;

	static {
		new Class21("Loaded additional fonts", "Zusatzschriftarten geladen", "Polices secondaires chargées", "Fontes principais carregadas");
	}

	@OriginalMember(owner = "client!lu", name = "<init>", descriptor = "(Lclient!bt;IIIIII)V")
	public Class41_Sub1_Sub2(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt4635 = arg4;
		this.anInt4628 = arg3;
		this.anInt4634 = arg1;
		this.aClass30_Sub1_29 = arg0;
		this.anInt4629 = arg6;
		this.anInt4630 = arg2;
		this.anInt4627 = arg5;
	}

	@OriginalMember(owner = "client!lu", name = "c", descriptor = "(I)Lclient!hp;")
	@Override
	public Class62_Sub3 method3949() {
		if (this.aClass62_Sub3_2 == null) {
			Static370.anIntArray518[2] = this.anInt4628;
			@Pc(22) Interface4 local22 = this.aClass30_Sub1_29.anInterface4_5;
			Static370.anIntArray518[3] = this.anInt4635;
			Static370.anIntArray518[5] = this.anInt4629;
			Static370.anIntArray518[4] = this.anInt4627;
			Static370.anIntArray518[1] = this.anInt4630;
			Static370.anIntArray518[0] = this.anInt4634;
			@Pc(49) boolean local49 = false;
			@Pc(51) int local51 = 0;
			for (@Pc(53) int local53 = 0; local53 < 6; local53++) {
				if (!local22.method5684(Static370.anIntArray518[local53])) {
					return null;
				}
				@Pc(71) Class160 local71 = local22.method5685(Static370.anIntArray518[local53]);
				@Pc(78) int local78 = local71.aBoolean322 ? 64 : 128;
				if (local51 < local78) {
					local51 = local78;
				}
				if (local71.aByte54 > 0) {
					local49 = true;
				}
			}
			for (@Pc(100) int local100 = 0; local100 < 6; local100++) {
				Static370.anIntArrayArray46[local100] = local22.method5686(1.0F, false, local51, local51, Static370.anIntArray518[local100]);
			}
			this.aClass62_Sub3_2 = new Class62_Sub3(this.aClass30_Sub1_29, 6407, local51, local49, Static370.anIntArrayArray46);
		}
		return this.aClass62_Sub3_2;
	}
}
