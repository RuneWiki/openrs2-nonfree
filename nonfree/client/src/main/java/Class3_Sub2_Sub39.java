import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wf")
public final class Class3_Sub2_Sub39 extends Class3_Sub2 {

	@OriginalMember(owner = "client!wf", name = "M", descriptor = "I")
	private int anInt6067;

	@OriginalMember(owner = "client!wf", name = "Q", descriptor = "I")
	private int anInt6071;

	@OriginalMember(owner = "client!wf", name = "R", descriptor = "I")
	private int anInt6072;

	@OriginalMember(owner = "client!wf", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub39() {
		this(0);
	}

	@OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(I)V")
	private Class3_Sub2_Sub39(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method4971(arg0);
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IZLclient!ug;)V")
	@Override
	public void method4958(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub26 arg1) {
		if (arg0 == 0) {
			this.method4971(arg1.method3899());
		}
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method4955(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = this.aClass150_41.method3994(arg0);
		if (this.aClass150_41.aBoolean319) {
			@Pc(20) int[] local20 = local11[0];
			@Pc(24) int[] local24 = local11[1];
			@Pc(28) int[] local28 = local11[2];
			for (@Pc(30) int local30 = 0; local30 < Static22.anInt421; local30++) {
				local20[local30] = this.anInt6072;
				local24[local30] = this.anInt6067;
				local28[local30] = this.anInt6071;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!wf", name = "d", descriptor = "(II)V")
	private void method4971(@OriginalArg(0) int arg0) {
		this.anInt6067 = arg0 >> 4 & 0xFF0;
		this.anInt6072 = arg0 >> 12 & 0xFF0;
		this.anInt6071 = (arg0 & 0xFF) << 4;
	}
}
