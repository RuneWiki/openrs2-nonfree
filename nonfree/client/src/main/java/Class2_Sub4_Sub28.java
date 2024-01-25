import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rb")
public final class Class2_Sub4_Sub28 extends Class2_Sub4 {

	@OriginalMember(owner = "client!rb", name = "C", descriptor = "I")
	private int anInt7253;

	@OriginalMember(owner = "client!rb", name = "H", descriptor = "I")
	private int anInt7255;

	@OriginalMember(owner = "client!rb", name = "K", descriptor = "I")
	private int anInt7258;

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub28() {
		this(0);
	}

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(I)V")
	private Class2_Sub4_Sub28(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method5904(arg0);
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(BI)V")
	private void method5904(@OriginalArg(1) int arg0) {
		this.anInt7258 = arg0 >> 4 & 0xFF0;
		this.anInt7255 = arg0 >> 12 & 0xFF0;
		this.anInt7253 = (arg0 & 0xFF) << 4;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method7561(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass143_41.method2531(arg0);
		if (super.aClass143_41.aBoolean214) {
			@Pc(26) int[] local26 = local11[0];
			@Pc(30) int[] local30 = local11[1];
			@Pc(34) int[] local34 = local11[2];
			for (@Pc(36) int local36 = 0; local36 < Static143.anInt7434; local36++) {
				local26[local36] = this.anInt7255;
				local30[local36] = this.anInt7258;
				local34[local36] = this.anInt7253;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILclient!gk;B)V")
	@Override
	public void method7566(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub7 arg1) {
		if (arg0 == 0) {
			this.method5904(arg1.method4503());
		}
	}
}
