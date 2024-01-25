import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lea")
public final class Class3_Sub9_Sub24 extends Class3_Sub9 {

	@OriginalMember(owner = "client!lea", name = "D", descriptor = "I")
	private int anInt5534 = 4096;

	@OriginalMember(owner = "client!lea", name = "G", descriptor = "I")
	private int anInt5537 = 0;

	@OriginalMember(owner = "client!lea", name = "<init>", descriptor = "()V")
	public Class3_Sub9_Sub24() {
		super(1, true);
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lclient!jp;IB)V")
	@Override
	public void method9166(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt5537 = arg0.method8593();
		} else if (arg1 == 1) {
			this.anInt5534 = arg0.method8593();
		}
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method9165(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass113_41.method3239(arg0);
		if (super.aClass113_41.aBoolean275) {
			@Pc(26) int[] local26 = this.method9162(arg0, 0);
			for (@Pc(28) int local28 = 0; local28 < Static62.anInt1251; local28++) {
				@Pc(34) int local34 = local26[local28];
				local16[local28] = this.anInt5537 <= local34 && local34 <= this.anInt5534 ? 4096 : 0;
			}
		}
		return local16;
	}
}
