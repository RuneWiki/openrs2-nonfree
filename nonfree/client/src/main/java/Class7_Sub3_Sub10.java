import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eo")
public final class Class7_Sub3_Sub10 extends Class7_Sub3 {

	@OriginalMember(owner = "client!eo", name = "G", descriptor = "I")
	private int anInt1956;

	@OriginalMember(owner = "client!eo", name = "H", descriptor = "I")
	private int anInt1957;

	@OriginalMember(owner = "client!eo", name = "N", descriptor = "I")
	private int anInt1963;

	@OriginalMember(owner = "client!eo", name = "<init>", descriptor = "()V")
	public Class7_Sub3_Sub10() {
		this(0);
	}

	@OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(I)V")
	private Class7_Sub3_Sub10(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method1686(arg0);
	}

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "(II)V")
	private void method1686(@OriginalArg(1) int arg0) {
		this.anInt1963 = arg0 >> 4 & 0xFF0;
		this.anInt1957 = arg0 >> 12 & 0xFF0;
		this.anInt1956 = (arg0 & 0xFF) << 4;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IZLclient!gk;)V")
	@Override
	public void method5599(@OriginalArg(0) int arg0, @OriginalArg(2) Class7_Sub14 arg1) {
		if (arg0 == 0) {
			this.method1686(arg1.method3975());
		}
	}

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method5596(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass235_41.method4862(arg0);
		if (super.aClass235_41.aBoolean402) {
			@Pc(24) int[] local24 = local11[0];
			@Pc(28) int[] local28 = local11[1];
			@Pc(32) int[] local32 = local11[2];
			for (@Pc(34) int local34 = 0; local34 < Static58.anInt1052; local34++) {
				local24[local34] = this.anInt1957;
				local28[local34] = this.anInt1963;
				local32[local34] = this.anInt1956;
			}
		}
		return local11;
	}
}
