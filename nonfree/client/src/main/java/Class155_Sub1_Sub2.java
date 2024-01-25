import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nm")
public final class Class155_Sub1_Sub2 extends Class155_Sub1 {

	@OriginalMember(owner = "client!nm", name = "k", descriptor = "Lclient!vg;")
	private Class55_Sub4 aClass55_Sub4_2;

	@OriginalMember(owner = "client!nm", name = "n", descriptor = "I")
	private final int anInt4906;

	@OriginalMember(owner = "client!nm", name = "v", descriptor = "I")
	private final int anInt4911;

	@OriginalMember(owner = "client!nm", name = "o", descriptor = "I")
	private final int anInt4907;

	@OriginalMember(owner = "client!nm", name = "s", descriptor = "Lclient!ef;")
	private final Class49_Sub2 aClass49_Sub2_29;

	@OriginalMember(owner = "client!nm", name = "q", descriptor = "I")
	private final int anInt4908;

	@OriginalMember(owner = "client!nm", name = "h", descriptor = "I")
	private final int anInt4901;

	@OriginalMember(owner = "client!nm", name = "m", descriptor = "I")
	private final int anInt4905;

	static {
		new Class209("Unable to delete friend - system busy.", "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.", "Impossible de supprimer un ami - système occupé.", "Não foi possível excluir o amigo. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(Lclient!ef;IIIIII)V")
	public Class155_Sub1_Sub2(@OriginalArg(0) Class49_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt4906 = arg4;
		this.anInt4911 = arg6;
		this.anInt4907 = arg5;
		this.aClass49_Sub2_29 = arg0;
		this.anInt4908 = arg2;
		this.anInt4901 = arg3;
		this.anInt4905 = arg1;
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "(I)Lclient!vg;")
	@Override
	public Class55_Sub4 method3951() {
		if (this.aClass55_Sub4_2 == null) {
			Static184.anIntArray316[0] = this.anInt4905;
			Static184.anIntArray316[5] = this.anInt4911;
			Static184.anIntArray316[4] = this.anInt4907;
			Static184.anIntArray316[2] = this.anInt4901;
			@Pc(37) Interface4 local37 = this.aClass49_Sub2_29.anInterface4_6;
			Static184.anIntArray316[3] = this.anInt4906;
			Static184.anIntArray316[1] = this.anInt4908;
			@Pc(49) boolean local49 = false;
			@Pc(51) int local51 = 0;
			for (@Pc(53) int local53 = 0; local53 < 6; local53++) {
				if (!local37.method3792(Static184.anIntArray316[local53])) {
					return null;
				}
				@Pc(71) Class140 local71 = local37.method3794(Static184.anIntArray316[local53]);
				@Pc(78) int local78 = local71.aBoolean286 ? 64 : 128;
				if (local51 < local78) {
					local51 = local78;
				}
				if (local71.aByte64 > 0) {
					local49 = true;
				}
			}
			for (@Pc(100) int local100 = 0; local100 < 6; local100++) {
				Static428.anIntArrayArray61[local100] = local37.method3790(local51, Static184.anIntArray316[local100], 1.0F, false, local51);
			}
			this.aClass55_Sub4_2 = new Class55_Sub4(this.aClass49_Sub2_29, 6407, local51, local49, Static428.anIntArrayArray61);
		}
		return this.aClass55_Sub4_2;
	}
}
