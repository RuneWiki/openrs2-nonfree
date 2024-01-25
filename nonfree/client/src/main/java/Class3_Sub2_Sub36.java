import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vj")
public final class Class3_Sub2_Sub36 extends Class3_Sub2 {

	@OriginalMember(owner = "client!vj", name = "z", descriptor = "I")
	private int anInt9830;

	@OriginalMember(owner = "client!vj", name = "C", descriptor = "I")
	private int anInt9833;

	@OriginalMember(owner = "client!vj", name = "H", descriptor = "I")
	private int anInt9838;

	@OriginalMember(owner = "client!vj", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub36() {
		this(0);
	}

	@OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(I)V")
	private Class3_Sub2_Sub36(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method8431(arg0);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lclient!sl;IB)V")
	@Override
	public void method8600(@OriginalArg(0) Class3_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.method8431(arg0.method4204());
		}
	}

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8604(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass193_41.method4800(arg0);
		if (super.aClass193_41.aBoolean358) {
			@Pc(27) int[] local27 = local19[0];
			@Pc(31) int[] local31 = local19[1];
			@Pc(35) int[] local35 = local19[2];
			for (@Pc(37) int local37 = 0; local37 < Static491.anInt8519; local37++) {
				local27[local37] = this.anInt9838;
				local31[local37] = this.anInt9833;
				local35[local37] = this.anInt9830;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "(II)V")
	private void method8431(@OriginalArg(1) int arg0) {
		this.anInt9830 = (arg0 & 0xFF) << 4;
		this.anInt9838 = arg0 >> 12 & 0xFF0;
		this.anInt9833 = arg0 >> 4 & 0xFF0;
	}
}
