import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sh")
public final class Class1_Sub2_Sub31 extends Class1_Sub2 {

	@OriginalMember(owner = "client!sh", name = "N", descriptor = "I")
	private int anInt5004;

	@OriginalMember(owner = "client!sh", name = "Q", descriptor = "I")
	private int anInt5006;

	@OriginalMember(owner = "client!sh", name = "R", descriptor = "I")
	private int anInt5007;

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub31() {
		this(0);
	}

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(I)V")
	private Class1_Sub2_Sub31(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method3895(arg0);
	}

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(II)V")
	private void method3895(@OriginalArg(1) int arg0) {
		this.anInt5007 = arg0 >> 12 & 0xFF0;
		this.anInt5006 = (arg0 & 0xFF) << 4;
		this.anInt5004 = arg0 >> 4 & 0xFF0;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(ILclient!sb;I)V")
	@Override
	public void method4582(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.method3895(arg0.method2588());
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4572(@OriginalArg(1) int arg0) {
		@Pc(17) int[][] local17 = this.aClass151_41.method3758(arg0);
		if (this.aClass151_41.aBoolean344) {
			@Pc(26) int[] local26 = local17[1];
			@Pc(30) int[] local30 = local17[2];
			@Pc(34) int[] local34 = local17[0];
			for (@Pc(36) int local36 = 0; local36 < Static299.anInt5670; local36++) {
				local34[local36] = this.anInt5007;
				local26[local36] = this.anInt5004;
				local30[local36] = this.anInt5006;
			}
		}
		return local17;
	}
}
