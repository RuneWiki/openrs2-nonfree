import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class1_Sub3_Sub13 extends Class1_Sub3 {

	@OriginalMember(owner = "client!gb", name = "O", descriptor = "I")
	private int anInt2075;

	@OriginalMember(owner = "client!gb", name = "U", descriptor = "I")
	private int anInt2080;

	@OriginalMember(owner = "client!gb", name = "V", descriptor = "I")
	private int anInt2081;

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(I)V")
	private Class1_Sub3_Sub13(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method1504(arg0);
	}

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub13() {
		this(0);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method4120(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = super.aClass21_41.method589(arg0);
		if (super.aClass21_41.aBoolean48) {
			@Pc(27) int[] local27 = local7[0];
			@Pc(31) int[] local31 = local7[1];
			@Pc(35) int[] local35 = local7[2];
			for (@Pc(37) int local37 = 0; local37 < Static110.anInt2934; local37++) {
				local27[local37] = this.anInt2081;
				local31[local37] = this.anInt2075;
				local35[local37] = this.anInt2080;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!ql;IZ)V")
	@Override
	public void method4121(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.method1504(arg0.method1773());
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(BI)V")
	private void method1504(@OriginalArg(1) int arg0) {
		this.anInt2080 = (arg0 & 0xFF) << 4;
		this.anInt2075 = arg0 >> 4 & 0xFF0;
		this.anInt2081 = arg0 >> 12 & 0xFF0;
	}
}
