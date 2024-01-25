import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!io")
public final class Class2_Sub2_Sub14 extends Class2_Sub2 {

	@OriginalMember(owner = "client!io", name = "H", descriptor = "[I")
	private int[] anIntArray270;

	@OriginalMember(owner = "client!io", name = "I", descriptor = "I")
	private int anInt4246;

	@OriginalMember(owner = "client!io", name = "Q", descriptor = "I")
	private int anInt4251;

	@OriginalMember(owner = "client!io", name = "U", descriptor = "I")
	private int anInt4254 = -1;

	@OriginalMember(owner = "client!io", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub14() {
		super(0, false);
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method7946(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass314_41.method7006(arg0);
		if (super.aClass314_41.aBoolean653) {
			@Pc(38) int local38 = this.anInt4246 * (this.anInt4251 == Static377.anInt6692 ? arg0 : this.anInt4251 * arg0 / Static377.anInt6692);
			@Pc(42) int[] local42 = local11[0];
			@Pc(46) int[] local46 = local11[1];
			@Pc(50) int[] local50 = local11[2];
			@Pc(60) int local60;
			@Pc(69) int local69;
			if (this.anInt4246 == Static153.anInt3070) {
				for (local60 = 0; local60 < Static153.anInt3070; local60++) {
					local69 = this.anIntArray270[local38++];
					local50[local60] = (local69 & 0xFF) << 4;
					local46[local60] = local69 >> 4 & 0xFF0;
					local42[local60] = local69 >> 12 & 0xFF0;
				}
			} else {
				for (local60 = 0; local60 < Static153.anInt3070; local60++) {
					local69 = local60 * this.anInt4246 / Static153.anInt3070;
					@Pc(76) int local76 = this.anIntArray270[local69 + local38];
					local50[local60] = (local76 & 0xFF) << 4;
					local46[local60] = local76 >> 4 & 0xFF0;
					local42[local60] = local76 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!io", name = "b", descriptor = "(B)I")
	@Override
	public int method7945() {
		return this.anInt4254;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IBI)V")
	@Override
	public void method7944(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		super.method7944(arg0, arg1);
		if (this.anInt4254 >= 0 && Static405.anInterface5_9 != null) {
			@Pc(24) int local24 = Static405.anInterface5_9.method917(this.anInt4254).aBoolean700 ? 64 : 128;
			this.anIntArray270 = Static405.anInterface5_9.method916(this.anInt4254, 1.0F, false, local24, local24);
			this.anInt4246 = local24;
			this.anInt4251 = local24;
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(I)V")
	@Override
	public void method7939() {
		super.method7939();
		this.anIntArray270 = null;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(ILclient!es;I)V")
	@Override
	public void method7949(@OriginalArg(1) Class2_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4254 = arg0.method4294();
		}
	}
}
