import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dr")
public final class Class1_Sub2_Sub10 extends Class1_Sub2 {

	@OriginalMember(owner = "client!dr", name = "G", descriptor = "[I")
	private int[] anIntArray166;

	@OriginalMember(owner = "client!dr", name = "H", descriptor = "I")
	private int anInt1445;

	@OriginalMember(owner = "client!dr", name = "J", descriptor = "I")
	private int anInt1446;

	@OriginalMember(owner = "client!dr", name = "T", descriptor = "I")
	private int anInt1453 = -1;

	@OriginalMember(owner = "client!dr", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub10() {
		super(0, false);
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IILclient!eb;)V")
	@Override
	public void method5660(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt1453 = arg1.method3115();
		}
	}

	@OriginalMember(owner = "client!dr", name = "c", descriptor = "(B)I")
	@Override
	public int method5657() {
		return this.anInt1453;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IBI)V")
	@Override
	public void method5656(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		super.method5656(arg0, arg1);
		if (this.anInt1453 >= 0 && Static81.anInterface7_2 != null) {
			@Pc(28) int local28 = Static81.anInterface7_2.method2788(this.anInt1453).aBoolean566 ? 64 : 128;
			this.anIntArray166 = Static81.anInterface7_2.method2786(1.0F, this.anInt1453, local28, false, local28);
			this.anInt1446 = local28;
			this.anInt1445 = local28;
		}
	}

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5664(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass129_41.method3671(arg0);
		if (super.aClass129_41.aBoolean338) {
			@Pc(38) int local38 = (this.anInt1445 == Static81.anInt1606 ? arg0 : arg0 * this.anInt1445 / Static81.anInt1606) * this.anInt1446;
			@Pc(42) int[] local42 = local11[0];
			@Pc(46) int[] local46 = local11[1];
			@Pc(50) int[] local50 = local11[2];
			@Pc(60) int local60;
			@Pc(69) int local69;
			if (this.anInt1446 == Static251.anInt6509) {
				for (local60 = 0; local60 < Static251.anInt6509; local60++) {
					local69 = this.anIntArray166[local38++];
					local50[local60] = (local69 & 0xFF) << 4;
					local46[local60] = local69 >> 4 & 0xFF0;
					local42[local60] = local69 >> 12 & 0xFF0;
				}
			} else {
				for (local60 = 0; local60 < Static251.anInt6509; local60++) {
					local69 = this.anInt1446 * local60 / Static251.anInt6509;
					@Pc(77) int local77 = this.anIntArray166[local38 + local69];
					local50[local60] = (local77 & 0xFF) << 4;
					local46[local60] = local77 >> 4 & 0xFF0;
					local42[local60] = local77 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!dr", name = "c", descriptor = "(I)V")
	@Override
	public void method5655() {
		super.method5655();
		this.anIntArray166 = null;
	}
}
