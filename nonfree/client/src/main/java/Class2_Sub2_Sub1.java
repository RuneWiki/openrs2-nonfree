import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ab")
public final class Class2_Sub2_Sub1 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ab", name = "O", descriptor = "[I")
	private int[] anIntArray10;

	@OriginalMember(owner = "client!ab", name = "P", descriptor = "I")
	private int anInt71;

	@OriginalMember(owner = "client!ab", name = "V", descriptor = "I")
	private int anInt77;

	@OriginalMember(owner = "client!ab", name = "Q", descriptor = "I")
	private int anInt72 = -1;

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub1() {
		super(0, false);
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5836(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass175_41.method4051(arg0);
		if (super.aClass175_41.aBoolean375) {
			@Pc(39) int local39 = (this.anInt71 == Static51.anInt1129 ? arg0 : this.anInt71 * arg0 / Static51.anInt1129) * this.anInt77;
			@Pc(43) int[] local43 = local11[0];
			@Pc(47) int[] local47 = local11[1];
			@Pc(51) int[] local51 = local11[2];
			@Pc(61) int local61;
			@Pc(70) int local70;
			if (this.anInt77 == Static429.anInt6518) {
				for (local61 = 0; local61 < Static429.anInt6518; local61++) {
					local70 = this.anIntArray10[local39++];
					local51[local61] = (local70 & 0xFF) << 4;
					local47[local61] = local70 >> 4 & 0xFF0;
					local43[local61] = local70 >> 12 & 0xFF0;
				}
			} else {
				for (local61 = 0; local61 < Static429.anInt6518; local61++) {
					local70 = local61 * this.anInt77 / Static429.anInt6518;
					@Pc(78) int local78 = this.anIntArray10[local39 + local70];
					local51[local61] = (local78 & 0xFF) << 4;
					local47[local61] = local78 >> 4 & 0xFF0;
					local43[local61] = local78 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "(I)I")
	@Override
	public int method5841() {
		return this.anInt72;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lclient!si;II)V")
	@Override
	public void method5838(@OriginalArg(0) Class2_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt72 = arg0.method5500();
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V")
	@Override
	public void method5842() {
		super.method5842();
		this.anIntArray10 = null;
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(III)V")
	@Override
	public void method5847(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		super.method5847(arg0, arg1);
		if (this.anInt72 >= 0 && Static236.anInterface4_4 != null) {
			@Pc(24) int local24 = Static236.anInterface4_4.method3794(this.anInt72).aBoolean286 ? 64 : 128;
			this.anIntArray10 = Static236.anInterface4_4.method3790(local24, this.anInt72, 1.0F, false, local24);
			this.anInt71 = local24;
			this.anInt77 = local24;
		}
	}
}
