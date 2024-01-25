import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fu")
public final class Class3_Sub2_Sub9 extends Class3_Sub2 {

	@OriginalMember(owner = "client!fu", name = "I", descriptor = "[I")
	private final int[] anIntArray148 = new int[3];

	@OriginalMember(owner = "client!fu", name = "M", descriptor = "I")
	private int anInt2611 = 4096;

	@OriginalMember(owner = "client!fu", name = "P", descriptor = "I")
	private int anInt2614 = 3216;

	@OriginalMember(owner = "client!fu", name = "Q", descriptor = "I")
	private int anInt2615 = 3216;

	@OriginalMember(owner = "client!fu", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub9() {
		super(1, true);
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5895(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass62_41.method1670(arg0);
		if (super.aClass62_41.aBoolean169) {
			@Pc(26) int local26 = this.anInt2611 * Static12.anInt373 >> 12;
			@Pc(36) int[] local36 = this.method5894(0, Static350.anInt3654 & arg0 - 1);
			@Pc(44) int[] local44 = this.method5894(0, arg0);
			@Pc(56) int[] local56 = this.method5894(0, arg0 + 1 & Static350.anInt3654);
			for (@Pc(58) int local58 = 0; local58 < Static406.anInt6694; local58++) {
				@Pc(73) int local73 = (local56[local58] - local36[local58]) * local26 >> 12;
				@Pc(94) int local94 = local26 * (local44[local58 - 1 & Static5.anInt72] - local44[Static5.anInt72 & local58 + 1]) >> 12;
				@Pc(98) int local98 = local94 >> 4;
				@Pc(102) int local102 = local73 >> 4;
				if (local98 < 0) {
					local98 = -local98;
				}
				if (local102 < 0) {
					local102 = -local102;
				}
				if (local98 > 255) {
					local98 = 255;
				}
				if (local102 > 255) {
					local102 = 255;
				}
				@Pc(141) int local141 = Class101.aByteArray42[(local102 * (local102 + 1) >> 1) + local98] & 0xFF;
				@Pc(147) int local147 = local141 * 4096 >> 8;
				@Pc(153) int local153 = local94 * local141 >> 8;
				@Pc(159) int local159 = local141 * local73 >> 8;
				@Pc(168) int local168 = local153 * this.anIntArray148[0] >> 12;
				@Pc(177) int local177 = this.anIntArray148[1] * local159 >> 12;
				@Pc(186) int local186 = this.anIntArray148[2] * local147 >> 12;
				local11[local58] = local186 + local177 + local168;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!fu", name = "d", descriptor = "(I)V")
	@Override
	public void method5898() {
		this.method1978();
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(Z)V")
	private void method1978() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt2615 / 4096.0F));
		this.anIntArray148[0] = (int) (Math.sin((double) ((float) this.anInt2614 / 4096.0F)) * local11 * 4096.0D);
		this.anIntArray148[1] = (int) (local11 * 4096.0D * Math.cos((double) ((float) this.anInt2614 / 4096.0F)));
		this.anIntArray148[2] = (int) (Math.sin((double) ((float) this.anInt2615 / 4096.0F)) * 4096.0D);
		@Pc(69) int local69 = this.anIntArray148[0] * this.anIntArray148[0] >> 12;
		@Pc(86) int local86 = this.anIntArray148[1] * this.anIntArray148[1] >> 12;
		@Pc(98) int local98 = this.anIntArray148[2] * this.anIntArray148[2] >> 12;
		@Pc(111) int local111 = (int) (Math.sqrt((double) (local98 + local69 + local86 >> 12)) * 4096.0D);
		if (local111 != 0) {
			this.anIntArray148[2] = (this.anIntArray148[2] << 12) / local111;
			this.anIntArray148[1] = (this.anIntArray148[1] << 12) / local111;
			this.anIntArray148[0] = (this.anIntArray148[0] << 12) / local111;
		}
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(Lclient!cu;II)V")
	@Override
	public void method5892(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2611 = arg0.method2588();
		} else if (arg1 == 1) {
			this.anInt2614 = arg0.method2588();
		} else if (arg1 == 2) {
			this.anInt2615 = arg0.method2588();
		}
	}
}
