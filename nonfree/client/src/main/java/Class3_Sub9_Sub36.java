import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vg")
public final class Class3_Sub9_Sub36 extends Class3_Sub9 {

	@OriginalMember(owner = "client!vg", name = "F", descriptor = "I")
	private int anInt10086;

	@OriginalMember(owner = "client!vg", name = "G", descriptor = "[I")
	private int[] anIntArray879;

	@OriginalMember(owner = "client!vg", name = "K", descriptor = "I")
	private int anInt10090;

	@OriginalMember(owner = "client!vg", name = "Q", descriptor = "I")
	private int anInt10094 = -1;

	@OriginalMember(owner = "client!vg", name = "<init>", descriptor = "()V")
	public Class3_Sub9_Sub36() {
		super(0, false);
	}

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "(III)V")
	@Override
	public void method9164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.method9164(arg0, arg1);
		if (this.anInt10094 >= 0 && Static529.anInterface4_13 != null) {
			@Pc(27) int local27 = Static529.anInterface4_13.method4673(this.anInt10094).aBoolean292 ? 64 : 128;
			this.anIntArray879 = Static529.anInterface4_13.method4676(local27, false, local27, 1.0F, this.anInt10094);
			this.anInt10086 = local27;
			this.anInt10090 = local27;
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lclient!jp;IB)V")
	@Override
	public void method9166(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt10094 = arg0.method8593();
		}
	}

	@OriginalMember(owner = "client!vg", name = "d", descriptor = "(B)I")
	@Override
	public int method9170() {
		return this.anInt10094;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method9168(@OriginalArg(0) int arg0) {
		@Pc(18) int[][] local18 = super.aClass348_41.method8552(arg0);
		if (super.aClass348_41.aBoolean748) {
			@Pc(38) int local38 = (Static452.anInt7497 == this.anInt10086 ? arg0 : this.anInt10086 * arg0 / Static452.anInt7497) * this.anInt10090;
			@Pc(42) int[] local42 = local18[0];
			@Pc(46) int[] local46 = local18[1];
			@Pc(50) int[] local50 = local18[2];
			@Pc(60) int local60;
			@Pc(68) int local68;
			if (Static62.anInt1251 == this.anInt10090) {
				for (local60 = 0; local60 < Static62.anInt1251; local60++) {
					local68 = this.anIntArray879[local38++];
					local50[local60] = (local68 & 0xFF) << 4;
					local46[local60] = local68 >> 4 & 0xFF0;
					local42[local60] = local68 >> 12 & 0xFF0;
				}
			} else {
				for (local60 = 0; local60 < Static62.anInt1251; local60++) {
					local68 = local60 * this.anInt10090 / Static62.anInt1251;
					@Pc(116) int local116 = this.anIntArray879[local68 + local38];
					local50[local60] = (local116 & 0xFF) << 4;
					local46[local60] = local116 >> 4 & 0xFF0;
					local42[local60] = local116 >> 12 & 0xFF0;
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)V")
	@Override
	public void method9171() {
		super.method9171();
		this.anIntArray879 = null;
	}
}
