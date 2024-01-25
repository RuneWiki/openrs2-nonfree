import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!om")
public final class Class6_Sub1_Sub25 extends Class6_Sub1 {

	@OriginalMember(owner = "client!om", name = "M", descriptor = "I")
	private int anInt7597;

	@OriginalMember(owner = "client!om", name = "N", descriptor = "I")
	private int anInt7598;

	@OriginalMember(owner = "client!om", name = "P", descriptor = "[I")
	private int[] anIntArray375;

	@OriginalMember(owner = "client!om", name = "I", descriptor = "I")
	private int anInt7594 = -1;

	@OriginalMember(owner = "client!om", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub25() {
		super(0, false);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(I)I")
	@Override
	public int method8723() {
		return this.anInt7594;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ILclient!ji;B)V")
	@Override
	public void method8722(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt7594 = arg1.method8220();
		}
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(I)V")
	@Override
	public void method8724() {
		super.method8724();
		this.anIntArray375 = null;
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(III)V")
	@Override
	public void method8729(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.method8729(arg0, arg1);
		if (this.anInt7594 >= 0 && Static76.anInterface7_5 != null) {
			@Pc(27) int local27 = Static76.anInterface7_5.method6931(this.anInt7594).aBoolean616 ? 64 : 128;
			this.anIntArray375 = Static76.anInterface7_5.method6929(this.anInt7594, local27, 1.0F, false, local27);
			this.anInt7598 = local27;
			this.anInt7597 = local27;
		}
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8728(@OriginalArg(1) int arg0) {
		@Pc(17) int[][] local17 = super.aClass239_41.method6263(arg0);
		if (super.aClass239_41.aBoolean585) {
			@Pc(41) int local41 = (Static123.anInt3099 == this.anInt7597 ? arg0 : this.anInt7597 * arg0 / Static123.anInt3099) * this.anInt7598;
			@Pc(45) int[] local45 = local17[0];
			@Pc(49) int[] local49 = local17[1];
			@Pc(53) int[] local53 = local17[2];
			@Pc(59) int local59;
			@Pc(68) int local68;
			if (Static53.anInt1787 == this.anInt7598) {
				for (local59 = 0; local59 < Static53.anInt1787; local59++) {
					local68 = this.anIntArray375[local41++];
					local53[local59] = (local68 & 0xFF) << 4;
					local49[local59] = local68 >> 4 & 0xFF0;
					local45[local59] = local68 >> 12 & 0xFF0;
				}
			} else {
				for (local59 = 0; local59 < Static53.anInt1787; local59++) {
					local68 = local59 * this.anInt7598 / Static53.anInt1787;
					@Pc(75) int local75 = this.anIntArray375[local68 + local41];
					local53[local59] = (local75 & 0xFF) << 4;
					local49[local59] = local75 >> 4 & 0xFF0;
					local45[local59] = local75 >> 12 & 0xFF0;
				}
			}
		}
		return local17;
	}
}
