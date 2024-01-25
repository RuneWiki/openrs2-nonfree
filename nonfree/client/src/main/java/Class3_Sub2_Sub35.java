import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tr")
public final class Class3_Sub2_Sub35 extends Class3_Sub2 {

	@OriginalMember(owner = "client!tr", name = "O", descriptor = "I")
	private int anInt10150;

	@OriginalMember(owner = "client!tr", name = "N", descriptor = "I")
	private int anInt10151;

	@OriginalMember(owner = "client!tr", name = "J", descriptor = "[I")
	private int[] anIntArray580;

	@OriginalMember(owner = "client!tr", name = "D", descriptor = "I")
	private int anInt10154 = -1;

	@OriginalMember(owner = "client!tr", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub35() {
		super(0, false);
	}

	@OriginalMember(owner = "client!tr", name = "c", descriptor = "(III)V")
	@Override
	public void method9210(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		super.method9210(arg0, arg1);
		if (this.anInt10154 >= 0 && Static350.anInterface2_8 != null) {
			@Pc(37) int local37 = Static350.anInterface2_8.method1027(this.anInt10154).aBoolean71 ? 64 : 128;
			this.anIntArray580 = Static350.anInterface2_8.method1025(local37, local37, 1.0F, this.anInt10154, false);
			this.anInt10151 = local37;
			this.anInt10150 = local37;
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(Z)I")
	@Override
	public int method9207() {
		return this.anInt10154;
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(ILclient!rba;I)V")
	@Override
	public void method9214(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub28 arg1) {
		if (arg0 == 0) {
			this.anInt10154 = arg1.method5272();
		}
	}

	@OriginalMember(owner = "client!tr", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method9203(@OriginalArg(1) int arg0) {
		@Pc(18) int[][] local18 = super.aClass36_41.method731(arg0);
		if (super.aClass36_41.aBoolean75) {
			@Pc(41) int local41 = this.anInt10150 * (Static443.anInt7682 == this.anInt10151 ? arg0 : arg0 * this.anInt10151 / Static443.anInt7682);
			@Pc(45) int[] local45 = local18[0];
			@Pc(49) int[] local49 = local18[1];
			@Pc(53) int[] local53 = local18[2];
			@Pc(59) int local59;
			@Pc(68) int local68;
			if (this.anInt10150 == Static636.anInt10302) {
				for (local59 = 0; local59 < Static636.anInt10302; local59++) {
					local68 = this.anIntArray580[local41++];
					local53[local59] = (local68 & 0xFF) << 4;
					local49[local59] = local68 >> 4 & 0xFF0;
					local45[local59] = local68 >> 12 & 0xFF0;
				}
			} else {
				for (local59 = 0; local59 < Static636.anInt10302; local59++) {
					local68 = this.anInt10150 * local59 / Static636.anInt10302;
					@Pc(75) int local75 = this.anIntArray580[local41 + local68];
					local53[local59] = (local75 & 0xFF) << 4;
					local49[local59] = local75 >> 4 & 0xFF0;
					local45[local59] = local75 >> 12 & 0xFF0;
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(B)V")
	@Override
	public void method9206() {
		super.method9206();
		this.anIntArray580 = null;
	}
}
