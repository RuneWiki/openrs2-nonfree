import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pca")
public class Class14_Sub7_Sub29 extends Class14_Sub7 {

	@OriginalMember(owner = "client!pca", name = "P", descriptor = "I")
	protected int anInt8514;

	@OriginalMember(owner = "client!pca", name = "K", descriptor = "I")
	protected int anInt8517;

	@OriginalMember(owner = "client!pca", name = "O", descriptor = "[I")
	protected int[] anIntArray436;

	@OriginalMember(owner = "client!pca", name = "S", descriptor = "I")
	private int anInt8520 = -1;

	@OriginalMember(owner = "client!pca", name = "<init>", descriptor = "()V")
	public Class14_Sub7_Sub29() {
		super(0, false);
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(ILclient!jc;I)V")
	@Override
	public final void method9391(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub21 arg1) {
		if (arg0 == 0) {
			this.anInt8520 = arg1.method7717(-1978450544);
		}
	}

	@OriginalMember(owner = "client!pca", name = "f", descriptor = "(I)V")
	@Override
	public final void method9380() {
		super.method9380();
		this.anIntArray436 = null;
	}

	@OriginalMember(owner = "client!pca", name = "b", descriptor = "(B)Z")
	protected final boolean method7427() {
		if (this.anIntArray436 != null) {
			return true;
		} else if (this.anInt8520 >= 0) {
			@Pc(36) Class266 local36 = Static28.anInt6210 >= 0 ? Static697.method6466(Static653.aClass310_131, Static28.anInt6210, this.anInt8520) : Static697.method6461(Static653.aClass310_131, this.anInt8520);
			local36.method6467();
			this.anIntArray436 = local36.method6465();
			this.anInt8514 = local36.anInt7303;
			this.anInt8517 = local36.anInt7305;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method9388(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass340_41.method8152(arg0);
		if (super.aClass340_41.aBoolean655 && this.method7427()) {
			@Pc(34) int[] local34 = local11[0];
			@Pc(38) int[] local38 = local11[1];
			@Pc(42) int[] local42 = local11[2];
			@Pc(59) int local59 = this.anInt8514 * (this.anInt8517 == Static497.anInt8633 ? arg0 : arg0 * this.anInt8517 / Static497.anInt8633);
			@Pc(69) int local69;
			@Pc(77) int local77;
			if (Static613.anInt10114 == this.anInt8514) {
				for (local69 = 0; local69 < Static613.anInt10114; local69++) {
					local77 = this.anIntArray436[local59++];
					local42[local69] = (local77 & 0xFF) << 4;
					local38[local69] = local77 >> 4 & 0xFF0;
					local34[local69] = local77 >> 12 & 0xFF0;
				}
			} else {
				for (local69 = 0; local69 < Static613.anInt10114; local69++) {
					local77 = local69 * this.anInt8514 / Static613.anInt10114;
					@Pc(131) int local131 = this.anIntArray436[local77 + local59];
					local42[local69] = (local131 & 0xFF) << 4;
					local38[local69] = local131 >> 4 & 0xFF0;
					local34[local69] = local131 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(B)I")
	@Override
	public final int method9381() {
		return this.anInt8520;
	}
}
