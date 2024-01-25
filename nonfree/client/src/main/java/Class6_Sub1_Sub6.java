import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dk")
public final class Class6_Sub1_Sub6 extends Class6_Sub1 {

	@OriginalMember(owner = "client!dk", name = "J", descriptor = "I")
	private int anInt2295;

	@OriginalMember(owner = "client!dk", name = "K", descriptor = "[I")
	private int[] anIntArray171;

	@OriginalMember(owner = "client!dk", name = "M", descriptor = "I")
	private int anInt2296;

	@OriginalMember(owner = "client!dk", name = "G", descriptor = "I")
	private int anInt2292 = -1;

	@OriginalMember(owner = "client!dk", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub6() {
		super(0, false);
	}

	@OriginalMember(owner = "client!dk", name = "d", descriptor = "(I)I")
	@Override
	public int method8169() {
		return this.anInt2292;
	}

	@OriginalMember(owner = "client!dk", name = "d", descriptor = "(III)V")
	@Override
	public void method8166(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		super.method8166(arg0, arg1);
		if (this.anInt2292 >= 0 && Static49.anInterface2_5 != null) {
			@Pc(30) int local30 = Static49.anInterface2_5.method3585(this.anInt2292).aBoolean661 ? 64 : 128;
			this.anIntArray171 = Static49.anInterface2_5.method3582(1.0F, false, local30, this.anInt2292, local30);
			this.anInt2295 = local30;
			this.anInt2296 = local30;
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(ILclient!iaa;Z)V")
	@Override
	public void method8167(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub26 arg1) {
		if (arg0 == 0) {
			this.anInt2292 = arg1.method4999();
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8158(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass184_41.method4578(arg0);
		if (super.aClass184_41.aBoolean402) {
			@Pc(40) int local40 = (this.anInt2295 == Static468.anInt8642 ? arg0 : this.anInt2295 * arg0 / Static468.anInt8642) * this.anInt2296;
			@Pc(44) int[] local44 = local16[0];
			@Pc(48) int[] local48 = local16[1];
			@Pc(52) int[] local52 = local16[2];
			@Pc(58) int local58;
			@Pc(67) int local67;
			if (Static289.anInt5549 == this.anInt2296) {
				for (local58 = 0; local58 < Static289.anInt5549; local58++) {
					local67 = this.anIntArray171[local40++];
					local52[local58] = (local67 & 0xFF) << 4;
					local48[local58] = local67 >> 4 & 0xFF0;
					local44[local58] = local67 >> 12 & 0xFF0;
				}
			} else {
				for (local58 = 0; local58 < Static289.anInt5549; local58++) {
					local67 = local58 * this.anInt2296 / Static289.anInt5549;
					@Pc(74) int local74 = this.anIntArray171[local67 + local40];
					local52[local58] = (local74 & 0xFF) << 4;
					local48[local58] = local74 >> 4 & 0xFF0;
					local44[local58] = local74 >> 12 & 0xFF0;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!dk", name = "c", descriptor = "(I)V")
	@Override
	public void method8168() {
		super.method8168();
		this.anIntArray171 = null;
	}
}
