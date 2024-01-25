import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lj")
public final class Class3_Sub1_Sub23 extends Class3_Sub1 {

	@OriginalMember(owner = "client!lj", name = "F", descriptor = "I")
	private int anInt5688;

	@OriginalMember(owner = "client!lj", name = "I", descriptor = "I")
	private int anInt5690;

	@OriginalMember(owner = "client!lj", name = "P", descriptor = "I")
	private int anInt5696;

	@OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(I)V")
	private Class3_Sub1_Sub23(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method4785(arg0);
	}

	@OriginalMember(owner = "client!lj", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub23() {
		this(0);
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IILclient!rt;)V")
	@Override
	public void method7783(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub27 arg1) {
		if (arg0 == 0) {
			this.method4785(arg1.method7551());
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(II)V")
	private void method4785(@OriginalArg(1) int arg0) {
		this.anInt5696 = arg0 >> 4 & 0xFF0;
		this.anInt5688 = arg0 >> 12 & 0xFF0;
		this.anInt5690 = (arg0 & 0xFF) << 4;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method7781(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass226_41.method5724(arg0);
		if (super.aClass226_41.aBoolean434) {
			@Pc(27) int[] local27 = local19[0];
			@Pc(31) int[] local31 = local19[1];
			@Pc(35) int[] local35 = local19[2];
			for (@Pc(37) int local37 = 0; local37 < Static307.anInt4846; local37++) {
				local27[local37] = this.anInt5688;
				local31[local37] = this.anInt5696;
				local35[local37] = this.anInt5690;
			}
		}
		return local19;
	}
}
