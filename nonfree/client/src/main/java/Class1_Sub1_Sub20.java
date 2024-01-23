import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mg")
public final class Class1_Sub1_Sub20 extends Class1_Sub1 {

	@OriginalMember(owner = "client!mg", name = "U", descriptor = "I")
	private int anInt3036;

	@OriginalMember(owner = "client!mg", name = "W", descriptor = "I")
	private int anInt3038;

	@OriginalMember(owner = "client!mg", name = "X", descriptor = "I")
	private int anInt3039;

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(I)V")
	private Class1_Sub1_Sub20(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method2525(arg0);
	}

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub20() {
		this(0);
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(ZLclient!jj;I)V")
	@Override
	public void method4446(@OriginalArg(1) Class1_Sub18 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.method2525(arg0.method3109());
		}
	}

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "(II)V")
	private void method2525(@OriginalArg(1) int arg0) {
		this.anInt3036 = (arg0 & 0xFF) << 4;
		this.anInt3038 = arg0 >> 4 & 0xFF0;
		this.anInt3039 = arg0 >> 12 & 0xFF0;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method4444(@OriginalArg(1) int arg0) {
		@Pc(18) int[][] local18 = this.aClass153_41.method3955(arg0);
		if (this.aClass153_41.aBoolean396) {
			@Pc(27) int[] local27 = local18[0];
			@Pc(31) int[] local31 = local18[1];
			@Pc(35) int[] local35 = local18[2];
			for (@Pc(37) int local37 = 0; local37 < Static131.anInt2513; local37++) {
				local27[local37] = this.anInt3039;
				local31[local37] = this.anInt3038;
				local35[local37] = this.anInt3036;
			}
		}
		return local18;
	}
}
