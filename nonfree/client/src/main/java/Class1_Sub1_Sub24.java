import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mf")
public final class Class1_Sub1_Sub24 extends Class1_Sub1 {

	@OriginalMember(owner = "client!mf", name = "gb", descriptor = "I")
	private int anInt2867;

	@OriginalMember(owner = "client!mf", name = "jb", descriptor = "I")
	private int anInt2869;

	@OriginalMember(owner = "client!mf", name = "tb", descriptor = "I")
	private int anInt2877;

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(I)V")
	private Class1_Sub1_Sub24(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method2160(arg0);
	}

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub24() {
		this(0);
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3313(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass39_41.method1383(arg0);
		if (super.aClass39_41.aBoolean82) {
			@Pc(24) int[] local24 = local16[0];
			@Pc(28) int[] local28 = local16[2];
			@Pc(32) int[] local32 = local16[1];
			for (@Pc(34) int local34 = 0; local34 < Static176.anInt3921; local34++) {
				local24[local34] = this.anInt2869;
				local32[local34] = this.anInt2867;
				local28[local34] = this.anInt2877;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!mf", name = "d", descriptor = "(II)V")
	private void method2160(@OriginalArg(0) int arg0) {
		this.anInt2867 = arg0 >> 4 & 0xFF0;
		this.anInt2877 = (arg0 & 0xFF) << 4;
		this.anInt2869 = arg0 >> 12 & 0xFF0;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IILclient!wa;)V")
	@Override
	public void method3312(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub14 arg1) {
		if (arg0 == 0) {
			this.method2160(arg1.method1713());
		}
	}
}
