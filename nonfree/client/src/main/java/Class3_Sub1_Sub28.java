import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oaa")
public final class Class3_Sub1_Sub28 extends Class3_Sub1 {

	@OriginalMember(owner = "client!oaa", name = "J", descriptor = "I")
	private int anInt6443;

	@OriginalMember(owner = "client!oaa", name = "L", descriptor = "[I")
	private int[] anIntArray554;

	@OriginalMember(owner = "client!oaa", name = "Q", descriptor = "I")
	private int anInt6447;

	@OriginalMember(owner = "client!oaa", name = "M", descriptor = "I")
	private int anInt6444 = -1;

	@OriginalMember(owner = "client!oaa", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub28() {
		super(0, false);
	}

	@OriginalMember(owner = "client!oaa", name = "e", descriptor = "(I)I")
	@Override
	public int method7785() {
		return this.anInt6444;
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method7781(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass226_41.method5724(arg0);
		if (super.aClass226_41.aBoolean434) {
			@Pc(31) int local31 = this.anInt6447 * (Static397.anInt7340 == this.anInt6443 ? arg0 : arg0 * this.anInt6443 / Static397.anInt7340);
			@Pc(35) int[] local35 = local11[0];
			@Pc(39) int[] local39 = local11[1];
			@Pc(43) int[] local43 = local11[2];
			@Pc(53) int local53;
			@Pc(62) int local62;
			if (Static307.anInt4846 == this.anInt6447) {
				for (local53 = 0; local53 < Static307.anInt4846; local53++) {
					local62 = this.anIntArray554[local31++];
					local43[local53] = (local62 & 0xFF) << 4;
					local39[local53] = local62 >> 4 & 0xFF0;
					local35[local53] = local62 >> 12 & 0xFF0;
				}
			} else {
				for (local53 = 0; local53 < Static307.anInt4846; local53++) {
					local62 = local53 * this.anInt6447 / Static307.anInt4846;
					@Pc(69) int local69 = this.anIntArray554[local31 + local62];
					local43[local53] = (local69 & 0xFF) << 4;
					local39[local53] = local69 >> 4 & 0xFF0;
					local35[local53] = local69 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IILclient!rt;)V")
	@Override
	public void method7783(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub27 arg1) {
		if (arg0 == 0) {
			this.anInt6444 = arg1.method7591();
		}
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(III)V")
	@Override
	public void method7790(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		super.method7790(arg0, arg1);
		if (this.anInt6444 >= 0 && Static180.anInterface4_8 != null) {
			@Pc(34) int local34 = Static180.anInterface4_8.method6712(this.anInt6444).aBoolean466 ? 64 : 128;
			this.anIntArray554 = Static180.anInterface4_8.method6711(local34, 1.0F, this.anInt6444, local34, false);
			this.anInt6447 = local34;
			this.anInt6443 = local34;
		}
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(I)V")
	@Override
	public void method7780() {
		super.method7780();
		this.anIntArray554 = null;
	}
}
