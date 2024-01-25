import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cp")
public final class Class5_Sub3_Sub4 extends Class5_Sub3 {

	@OriginalMember(owner = "client!cp", name = "O", descriptor = "[I")
	private int[] anIntArray69;

	@OriginalMember(owner = "client!cp", name = "I", descriptor = "I")
	private int anInt1370;

	@OriginalMember(owner = "client!cp", name = "N", descriptor = "I")
	private int anInt1371;

	@OriginalMember(owner = "client!cp", name = "P", descriptor = "I")
	private int anInt1373 = -1;

	@OriginalMember(owner = "client!cp", name = "<init>", descriptor = "()V")
	public Class5_Sub3_Sub4() {
		super(0, false);
	}

	@OriginalMember(owner = "client!cp", name = "b", descriptor = "(I)I")
	@Override
	public int method9202() {
		return this.anInt1373;
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(ILclient!wq;I)V")
	@Override
	public void method9211(@OriginalArg(1) Class5_Sub36 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1373 = arg0.method7333();
		}
	}

	@OriginalMember(owner = "client!cp", name = "b", descriptor = "(III)V")
	@Override
	public void method9203(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		super.method9203(arg0, arg1);
		if (this.anInt1373 >= 0 && Static300.anInterface7_8 != null) {
			@Pc(37) int local37 = Static300.anInterface7_8.method7423(this.anInt1373).aBoolean62 ? 64 : 128;
			this.anIntArray69 = Static300.anInterface7_8.method7424(local37, false, local37, this.anInt1373, 1.0F);
			this.anInt1370 = local37;
			this.anInt1371 = local37;
		}
	}

	@OriginalMember(owner = "client!cp", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method9206(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass343_41.method7661(arg0);
		if (super.aClass343_41.aBoolean592) {
			@Pc(46) int local46 = (Static122.anInt2020 == this.anInt1371 ? arg0 : arg0 * this.anInt1371 / Static122.anInt2020) * this.anInt1370;
			@Pc(50) int[] local50 = local11[0];
			@Pc(54) int[] local54 = local11[1];
			@Pc(58) int[] local58 = local11[2];
			@Pc(68) int local68;
			@Pc(76) int local76;
			if (this.anInt1370 == Static7.anInt102) {
				for (local68 = 0; local68 < Static7.anInt102; local68++) {
					local76 = this.anIntArray69[local46++];
					local58[local68] = (local76 & 0xFF) << 4;
					local54[local68] = local76 >> 4 & 0xFF0;
					local50[local68] = local76 >> 12 & 0xFF0;
				}
			} else {
				for (local68 = 0; local68 < Static7.anInt102; local68++) {
					local76 = this.anInt1370 * local68 / Static7.anInt102;
					@Pc(130) int local130 = this.anIntArray69[local76 + local46];
					local58[local68] = (local130 & 0xFF) << 4;
					local54[local68] = local130 >> 4 & 0xFF0;
					local50[local68] = local130 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!cp", name = "c", descriptor = "(I)V")
	@Override
	public void method9209() {
		super.method9209();
		this.anIntArray69 = null;
	}
}
