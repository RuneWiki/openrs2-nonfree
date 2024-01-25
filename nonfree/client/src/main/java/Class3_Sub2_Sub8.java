import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fea")
public final class Class3_Sub2_Sub8 extends Class3_Sub2 {

	@OriginalMember(owner = "client!fea", name = "A", descriptor = "I")
	private int anInt2995;

	@OriginalMember(owner = "client!fea", name = "C", descriptor = "I")
	private int anInt2997;

	@OriginalMember(owner = "client!fea", name = "H", descriptor = "[I")
	private int[] anIntArray142;

	@OriginalMember(owner = "client!fea", name = "B", descriptor = "I")
	private int anInt2996 = -1;

	@OriginalMember(owner = "client!fea", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub8() {
		super(0, false);
	}

	@OriginalMember(owner = "client!fea", name = "b", descriptor = "(Z)V")
	@Override
	public void method8605() {
		super.method8605();
		this.anIntArray142 = null;
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(I)I")
	@Override
	public int method8597() {
		return this.anInt2996;
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(IIB)V")
	@Override
	public void method8596(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.method8596(arg0, arg1);
		if (this.anInt2996 >= 0 && Static628.anInterface7_9 != null) {
			@Pc(33) int local33 = Static628.anInterface7_9.method8118(this.anInt2996).aBoolean364 ? 64 : 128;
			this.anIntArray142 = Static628.anInterface7_9.method8116(false, local33, this.anInt2996, local33, 1.0F);
			this.anInt2997 = local33;
			this.anInt2995 = local33;
		}
	}

	@OriginalMember(owner = "client!fea", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8604(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass193_41.method4800(arg0);
		if (super.aClass193_41.aBoolean358) {
			@Pc(36) int local36 = this.anInt2995 * (this.anInt2997 == Static336.anInt6310 ? arg0 : this.anInt2997 * arg0 / Static336.anInt6310);
			@Pc(40) int[] local40 = local16[0];
			@Pc(44) int[] local44 = local16[1];
			@Pc(48) int[] local48 = local16[2];
			@Pc(58) int local58;
			@Pc(67) int local67;
			if (this.anInt2995 == Static491.anInt8519) {
				for (local58 = 0; local58 < Static491.anInt8519; local58++) {
					local67 = this.anIntArray142[local36++];
					local48[local58] = (local67 & 0xFF) << 4;
					local44[local58] = local67 >> 4 & 0xFF0;
					local40[local58] = local67 >> 12 & 0xFF0;
				}
			} else {
				for (local58 = 0; local58 < Static491.anInt8519; local58++) {
					local67 = this.anInt2995 * local58 / Static491.anInt8519;
					@Pc(74) int local74 = this.anIntArray142[local67 + local36];
					local48[local58] = (local74 & 0xFF) << 4;
					local44[local58] = local74 >> 4 & 0xFF0;
					local40[local58] = local74 >> 12 & 0xFF0;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(Lclient!sl;IB)V")
	@Override
	public void method8600(@OriginalArg(0) Class3_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt2996 = arg0.method4221();
		}
	}
}
