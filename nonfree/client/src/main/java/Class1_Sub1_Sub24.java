import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nf")
public final class Class1_Sub1_Sub24 extends Class1_Sub1 {

	@OriginalMember(owner = "client!nf", name = "H", descriptor = "I")
	private int anInt5814;

	@OriginalMember(owner = "client!nf", name = "I", descriptor = "I")
	private int anInt5815;

	@OriginalMember(owner = "client!nf", name = "K", descriptor = "I")
	private int anInt5817;

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(I)V")
	private Class1_Sub1_Sub24(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method4760(arg0);
	}

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub24() {
		this(0);
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(ILclient!mo;I)V")
	@Override
	public void method7708(@OriginalArg(1) Class1_Sub35 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.method4760(arg0.method5797());
		}
	}

	@OriginalMember(owner = "client!nf", name = "c", descriptor = "(II)V")
	private void method4760(@OriginalArg(1) int arg0) {
		this.anInt5817 = arg0 >> 12 & 0xFF0;
		this.anInt5814 = (arg0 & 0xFF) << 4;
		this.anInt5815 = arg0 >> 4 & 0xFF0;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method7705(@OriginalArg(1) int arg0) {
		@Pc(20) int[][] local20 = super.aClass46_41.method856(arg0);
		if (super.aClass46_41.aBoolean76) {
			@Pc(28) int[] local28 = local20[0];
			@Pc(32) int[] local32 = local20[1];
			@Pc(36) int[] local36 = local20[2];
			for (@Pc(38) int local38 = 0; local38 < Static279.anInt4906; local38++) {
				local28[local38] = this.anInt5817;
				local32[local38] = this.anInt5815;
				local36[local38] = this.anInt5814;
			}
		}
		return local20;
	}
}
