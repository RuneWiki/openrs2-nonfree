import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class1_Sub1_Sub26 extends Class1_Sub1 {

	@OriginalMember(owner = "client!pd", name = "Z", descriptor = "I")
	private int anInt3379;

	@OriginalMember(owner = "client!pd", name = "bb", descriptor = "I")
	private int anInt3380;

	@OriginalMember(owner = "client!pd", name = "fb", descriptor = "I")
	private int anInt3383;

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(I)V")
	private Class1_Sub1_Sub26(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method2645(arg0);
	}

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub26() {
		this(0);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lclient!k;BI)V")
	@Override
	public void method3738(@OriginalArg(0) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.method2645(arg0.method3806());
		}
	}

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "(II)V")
	private void method2645(@OriginalArg(0) int arg0) {
		this.anInt3383 = arg0 >> 4 & 0xFF0;
		this.anInt3380 = arg0 >> 12 & 0xFF0;
		this.anInt3379 = (arg0 & 0xFF) << 4;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method3735(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass75_41.method2410(arg0);
		if (super.aClass75_41.aBoolean134) {
			@Pc(28) int[] local28 = local11[0];
			@Pc(32) int[] local32 = local11[1];
			@Pc(36) int[] local36 = local11[2];
			for (@Pc(38) int local38 = 0; local38 < Static157.anInt3431; local38++) {
				local28[local38] = this.anInt3380;
				local32[local38] = this.anInt3383;
				local36[local38] = this.anInt3379;
			}
		}
		return local11;
	}
}
