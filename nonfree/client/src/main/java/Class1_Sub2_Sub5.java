import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eo")
public final class Class1_Sub2_Sub5 extends Class1_Sub2 {

	@OriginalMember(owner = "client!eo", name = "K", descriptor = "I")
	private int anInt1796;

	@OriginalMember(owner = "client!eo", name = "N", descriptor = "I")
	private int anInt1798;

	@OriginalMember(owner = "client!eo", name = "Q", descriptor = "I")
	private int anInt1800;

	static {
		new Class179("", 73);
	}

	@OriginalMember(owner = "client!eo", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub5() {
		this(0);
	}

	@OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(I)V")
	private Class1_Sub2_Sub5(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method1454(arg0);
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(II)V")
	private void method1454(@OriginalArg(1) int arg0) {
		this.anInt1798 = (arg0 & 0xFF) << 4;
		this.anInt1796 = arg0 >> 4 & 0xFF0;
		this.anInt1800 = arg0 >> 12 & 0xFF0;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5865(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass190_41.method4096(arg0);
		if (super.aClass190_41.aBoolean401) {
			@Pc(24) int[] local24 = local11[0];
			@Pc(28) int[] local28 = local11[1];
			@Pc(32) int[] local32 = local11[2];
			for (@Pc(34) int local34 = 0; local34 < Static410.anInt7198; local34++) {
				local24[local34] = this.anInt1800;
				local28[local34] = this.anInt1796;
				local32[local34] = this.anInt1798;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(ILclient!ti;I)V")
	@Override
	public void method5863(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.method1454(arg0.method4496());
		}
	}
}
