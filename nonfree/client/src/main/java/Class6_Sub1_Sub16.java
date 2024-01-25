import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hr")
public final class Class6_Sub1_Sub16 extends Class6_Sub1 {

	@OriginalMember(owner = "client!hr", name = "J", descriptor = "I")
	private int anInt3863 = 2048;

	@OriginalMember(owner = "client!hr", name = "D", descriptor = "I")
	private int anInt3858 = 3072;

	@OriginalMember(owner = "client!hr", name = "N", descriptor = "I")
	private int anInt3866 = 1024;

	@OriginalMember(owner = "client!hr", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub16() {
		super(1, false);
	}

	@OriginalMember(owner = "client!hr", name = "d", descriptor = "(B)V")
	@Override
	public void method8964() {
		this.anInt3863 = this.anInt3858 - this.anInt3866;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lclient!gga;IB)V")
	@Override
	public void method8962(@OriginalArg(0) Class6_Sub23 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3866 = arg0.method8363();
		} else if (arg1 == 1) {
			this.anInt3858 = arg0.method8363();
		} else if (arg1 == 2) {
			super.aBoolean736 = arg0.method8374() == 1;
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method8954(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass135_41.method3057(arg0);
		if (super.aClass135_41.aBoolean210) {
			@Pc(27) int[] local27 = this.method8963(0, arg0);
			for (@Pc(29) int local29 = 0; local29 < Static479.anInt8231; local29++) {
				local11[local29] = this.anInt3866 + (this.anInt3863 * local27[local29] >> 12);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8957(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass54_41.method1386(arg0);
		if (super.aClass54_41.aBoolean81) {
			@Pc(26) int[][] local26 = this.method8959(arg0, 0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static479.anInt8231; local52++) {
				local42[local52] = (this.anInt3863 * local30[local52] >> 12) + this.anInt3866;
				local46[local52] = this.anInt3866 + (local34[local52] * this.anInt3863 >> 12);
				local50[local52] = (local38[local52] * this.anInt3863 >> 12) + this.anInt3866;
			}
		}
		return local16;
	}
}
