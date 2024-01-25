import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nj")
public final class Class8_Sub2_Sub26 extends Class8_Sub2 {

	@OriginalMember(owner = "client!nj", name = "G", descriptor = "I")
	private int anInt7010;

	@OriginalMember(owner = "client!nj", name = "I", descriptor = "[I")
	private int[] anIntArray392;

	@OriginalMember(owner = "client!nj", name = "K", descriptor = "I")
	private int anInt7013;

	@OriginalMember(owner = "client!nj", name = "R", descriptor = "I")
	private int anInt7020 = -1;

	@OriginalMember(owner = "client!nj", name = "<init>", descriptor = "()V")
	public Class8_Sub2_Sub26() {
		super(0, false);
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method8500(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass269_41.method6817(arg0);
		if (super.aClass269_41.aBoolean591) {
			@Pc(43) int local43 = this.anInt7010 * (this.anInt7013 == Static159.anInt8698 ? arg0 : arg0 * this.anInt7013 / Static159.anInt8698);
			@Pc(47) int[] local47 = local11[0];
			@Pc(51) int[] local51 = local11[1];
			@Pc(55) int[] local55 = local11[2];
			@Pc(65) int local65;
			@Pc(73) int local73;
			if (Static538.anInt9297 == this.anInt7010) {
				for (local65 = 0; local65 < Static538.anInt9297; local65++) {
					local73 = this.anIntArray392[local43++];
					local55[local65] = (local73 & 0xFF) << 4;
					local51[local65] = local73 >> 4 & 0xFF0;
					local47[local65] = local73 >> 12 & 0xFF0;
				}
			} else {
				for (local65 = 0; local65 < Static538.anInt9297; local65++) {
					local73 = this.anInt7010 * local65 / Static538.anInt9297;
					@Pc(125) int local125 = this.anIntArray392[local73 + local43];
					local55[local65] = (local125 & 0xFF) << 4;
					local51[local65] = local125 >> 4 & 0xFF0;
					local47[local65] = local125 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(B)V")
	@Override
	public void method8506() {
		super.method8506();
		this.anIntArray392 = null;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)I")
	@Override
	public int method8503() {
		return this.anInt7020;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(ILclient!ig;Z)V")
	@Override
	public void method8501(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt7020 = arg1.method8578();
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIB)V")
	@Override
	public void method8509(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.method8509(arg0, arg1);
		if (this.anInt7020 >= 0 && Static596.anInterface2_13 != null) {
			@Pc(28) int local28 = Static596.anInterface2_13.method4027(this.anInt7020).aBoolean476 ? 64 : 128;
			this.anIntArray392 = Static596.anInterface2_13.method4026(false, local28, this.anInt7020, 1.0F, local28);
			this.anInt7010 = local28;
			this.anInt7013 = local28;
		}
	}
}
