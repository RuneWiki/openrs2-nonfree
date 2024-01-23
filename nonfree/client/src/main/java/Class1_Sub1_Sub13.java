import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public final class Class1_Sub1_Sub13 extends Class1_Sub1 {

	@OriginalMember(owner = "client!he", name = "L", descriptor = "I")
	private int anInt2241;

	@OriginalMember(owner = "client!he", name = "M", descriptor = "I")
	private int anInt2242;

	@OriginalMember(owner = "client!he", name = "S", descriptor = "I")
	private int anInt2246;

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "(I)V")
	private Class1_Sub1_Sub13(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method1659(arg0);
	}

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub13() {
		this(0);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method4714(@OriginalArg(0) int arg0) {
		@Pc(14) int[][] local14 = this.aClass45_41.method1139(arg0);
		if (this.aClass45_41.aBoolean95) {
			@Pc(27) int[] local27 = local14[0];
			@Pc(31) int[] local31 = local14[1];
			@Pc(35) int[] local35 = local14[2];
			for (@Pc(37) int local37 = 0; local37 < Static62.anInt1350; local37++) {
				local27[local37] = this.anInt2246;
				local31[local37] = this.anInt2241;
				local35[local37] = this.anInt2242;
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!he", name = "e", descriptor = "(II)V")
	private void method1659(@OriginalArg(0) int arg0) {
		this.anInt2246 = arg0 >> 12 & 0xFF0;
		this.anInt2241 = arg0 >> 4 & 0xFF0;
		this.anInt2242 = (arg0 & 0xFF) << 4;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!qm;II)V")
	@Override
	public void method4712(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.method1659(arg0.method2215());
		}
	}
}
