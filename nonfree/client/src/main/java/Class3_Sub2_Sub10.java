import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hj")
public final class Class3_Sub2_Sub10 extends Class3_Sub2 {

	@OriginalMember(owner = "client!hj", name = "I", descriptor = "I")
	private int anInt3044;

	@OriginalMember(owner = "client!hj", name = "L", descriptor = "I")
	private int anInt3047;

	@OriginalMember(owner = "client!hj", name = "O", descriptor = "[I")
	private int[] anIntArray194;

	@OriginalMember(owner = "client!hj", name = "H", descriptor = "I")
	private int anInt3043 = -1;

	@OriginalMember(owner = "client!hj", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub10() {
		super(0, false);
	}

	@OriginalMember(owner = "client!hj", name = "c", descriptor = "(I)V")
	@Override
	public void method5893() {
		super.method5893();
		this.anIntArray194 = null;
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5901(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass249_41.method5303(arg0);
		if (super.aClass249_41.aBoolean583) {
			@Pc(31) int local31 = (this.anInt3047 == Static286.anInt1445 ? arg0 : arg0 * this.anInt3047 / Static286.anInt1445) * this.anInt3044;
			@Pc(35) int[] local35 = local11[0];
			@Pc(39) int[] local39 = local11[1];
			@Pc(43) int[] local43 = local11[2];
			@Pc(53) int local53;
			@Pc(61) int local61;
			if (Static406.anInt6694 == this.anInt3044) {
				for (local53 = 0; local53 < Static406.anInt6694; local53++) {
					local61 = this.anIntArray194[local31++];
					local43[local53] = (local61 & 0xFF) << 4;
					local39[local53] = local61 >> 4 & 0xFF0;
					local35[local53] = local61 >> 12 & 0xFF0;
				}
			} else {
				for (local53 = 0; local53 < Static406.anInt6694; local53++) {
					local61 = this.anInt3044 * local53 / Static406.anInt6694;
					@Pc(114) int local114 = this.anIntArray194[local31 + local61];
					local43[local53] = (local114 & 0xFF) << 4;
					local39[local53] = local114 >> 4 & 0xFF0;
					local35[local53] = local114 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(BII)V")
	@Override
	public void method5896(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		super.method5896(arg0, arg1);
		if (this.anInt3043 >= 0 && Static32.anInterface5_1 != null) {
			@Pc(30) int local30 = Static32.anInterface5_1.method3918(this.anInt3043).aBoolean208 ? 64 : 128;
			this.anIntArray194 = Static32.anInterface5_1.method3920(this.anInt3043, local30, local30, false, 1.0F);
			this.anInt3047 = local30;
			this.anInt3044 = local30;
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(B)I")
	@Override
	public int method5897() {
		return this.anInt3043;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!cu;II)V")
	@Override
	public void method5892(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3043 = arg0.method2588();
		}
	}
}
