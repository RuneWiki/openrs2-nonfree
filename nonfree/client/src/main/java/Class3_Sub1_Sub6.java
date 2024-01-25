import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dka")
public final class Class3_Sub1_Sub6 extends Class3_Sub1 {

	@OriginalMember(owner = "client!dka", name = "L", descriptor = "I")
	private int anInt2410;

	@OriginalMember(owner = "client!dka", name = "B", descriptor = "[I")
	private int[] anIntArray138;

	@OriginalMember(owner = "client!dka", name = "F", descriptor = "I")
	private int anInt2411;

	@OriginalMember(owner = "client!dka", name = "I", descriptor = "I")
	private int anInt2402 = -1;

	@OriginalMember(owner = "client!dka", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub6() {
		super(0, false);
	}

	@OriginalMember(owner = "client!dka", name = "a", descriptor = "(IILclient!ika;)V")
	@Override
	public void method9582(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt2402 = arg1.method2028(-14795);
		}
	}

	@OriginalMember(owner = "client!dka", name = "a", descriptor = "(III)V")
	@Override
	public void method9583(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		super.method9583(arg0, arg1);
		if (this.anInt2402 >= 0 && Static342.anInterface4_7 != null) {
			@Pc(32) int local32 = Static342.anInterface4_7.method5761(this.anInt2402).aBoolean762 ? 64 : 128;
			this.anIntArray138 = Static342.anInterface4_7.method5760(local32, local32, false, 1.0F, this.anInt2402);
			this.anInt2410 = local32;
			this.anInt2411 = local32;
		}
	}

	@OriginalMember(owner = "client!dka", name = "b", descriptor = "(I)V")
	@Override
	public void method9574() {
		super.method9574();
		this.anIntArray138 = null;
	}

	@OriginalMember(owner = "client!dka", name = "a", descriptor = "(Z)I")
	@Override
	public int method9575() {
		return this.anInt2402;
	}

	@OriginalMember(owner = "client!dka", name = "b", descriptor = "(BI)[[I")
	@Override
	public int[][] method9580(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass281_41.method6493(arg0);
		if (super.aClass281_41.aBoolean509) {
			@Pc(44) int local44 = this.anInt2410 * (Static24.anInt740 == this.anInt2411 ? arg0 : arg0 * this.anInt2411 / Static24.anInt740);
			@Pc(48) int[] local48 = local11[0];
			@Pc(52) int[] local52 = local11[1];
			@Pc(56) int[] local56 = local11[2];
			@Pc(62) int local62;
			@Pc(70) int local70;
			if (this.anInt2410 == Static379.anInt5859) {
				for (local62 = 0; local62 < Static379.anInt5859; local62++) {
					local70 = this.anIntArray138[local44++];
					local56[local62] = (local70 & 0xFF) << 4;
					local52[local62] = local70 >> 4 & 0xFF0;
					local48[local62] = local70 >> 12 & 0xFF0;
				}
			} else {
				for (local62 = 0; local62 < Static379.anInt5859; local62++) {
					local70 = local62 * this.anInt2410 / Static379.anInt5859;
					@Pc(124) int local124 = this.anIntArray138[local70 + local44];
					local56[local62] = (local124 & 0xFF) << 4;
					local52[local62] = local124 >> 4 & 0xFF0;
					local48[local62] = local124 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}
}
