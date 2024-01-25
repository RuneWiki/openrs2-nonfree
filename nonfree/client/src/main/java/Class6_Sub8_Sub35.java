import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uf")
public final class Class6_Sub8_Sub35 extends Class6_Sub8 {

	@OriginalMember(owner = "client!uf", name = "D", descriptor = "I")
	private int anInt9683;

	@OriginalMember(owner = "client!uf", name = "C", descriptor = "I")
	private int anInt9686;

	@OriginalMember(owner = "client!uf", name = "G", descriptor = "[I")
	private int[] anIntArray634;

	@OriginalMember(owner = "client!uf", name = "B", descriptor = "I")
	private int anInt9690 = -1;

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "()V")
	public Class6_Sub8_Sub35() {
		super(0, false);
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8934(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass140_41.method3749(arg0);
		if (super.aClass140_41.aBoolean331) {
			@Pc(43) int local43 = this.anInt9686 * (Static226.anInt4404 == this.anInt9683 ? arg0 : arg0 * this.anInt9683 / Static226.anInt4404);
			@Pc(47) int[] local47 = local11[0];
			@Pc(51) int[] local51 = local11[1];
			@Pc(55) int[] local55 = local11[2];
			@Pc(65) int local65;
			@Pc(73) int local73;
			if (this.anInt9686 == Static83.anInt1268) {
				for (local65 = 0; local65 < Static83.anInt1268; local65++) {
					local73 = this.anIntArray634[local43++];
					local55[local65] = (local73 & 0xFF) << 4;
					local51[local65] = local73 >> 4 & 0xFF0;
					local47[local65] = local73 >> 12 & 0xFF0;
				}
			} else {
				for (local65 = 0; local65 < Static83.anInt1268; local65++) {
					local73 = local65 * this.anInt9686 / Static83.anInt1268;
					@Pc(127) int local127 = this.anIntArray634[local73 + local43];
					local55[local65] = (local127 & 0xFF) << 4;
					local51[local65] = local127 >> 4 & 0xFF0;
					local47[local65] = local127 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILclient!jc;I)V")
	@Override
	public void method8929(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub15 arg1) {
		if (arg0 == 0) {
			this.anInt9690 = arg1.method3018();
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)I")
	@Override
	public int method8932() {
		return this.anInt9690;
	}

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "(I)V")
	@Override
	public void method8937() {
		super.method8937();
		this.anIntArray634 = null;
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(III)V")
	@Override
	public void method8931(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.method8931(arg0, arg1);
		if (this.anInt9690 >= 0 && Static624.anInterface11_12 != null) {
			@Pc(32) int local32 = Static624.anInterface11_12.method6027(this.anInt9690).aBoolean630 ? 64 : 128;
			this.anIntArray634 = Static624.anInterface11_12.method6031(1.0F, local32, local32, this.anInt9690, false);
			this.anInt9683 = local32;
			this.anInt9686 = local32;
		}
	}
}
