import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rca")
public final class Class2_Sub15_Sub27 extends Class2_Sub15 {

	@OriginalMember(owner = "client!rca", name = "E", descriptor = "I")
	private int anInt9022;

	@OriginalMember(owner = "client!rca", name = "F", descriptor = "I")
	private int anInt9023;

	@OriginalMember(owner = "client!rca", name = "K", descriptor = "I")
	private int anInt9026;

	@OriginalMember(owner = "client!rca", name = "<init>", descriptor = "(I)V")
	private Class2_Sub15_Sub27(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method7924(arg0);
	}

	@OriginalMember(owner = "client!rca", name = "<init>", descriptor = "()V")
	public Class2_Sub15_Sub27() {
		this(0);
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method9723(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass38_41.method1080(arg0);
		if (super.aClass38_41.aBoolean64) {
			@Pc(27) int[] local27 = local19[0];
			@Pc(31) int[] local31 = local19[1];
			@Pc(35) int[] local35 = local19[2];
			for (@Pc(37) int local37 = 0; local37 < Static329.anInt6017; local37++) {
				local27[local37] = this.anInt9026;
				local31[local37] = this.anInt9023;
				local35[local37] = this.anInt9022;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(IZLclient!ol;)V")
	@Override
	public void method9718(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub8 arg1) {
		if (arg0 == 0) {
			this.method7924(arg1.method5161());
		}
	}

	@OriginalMember(owner = "client!rca", name = "b", descriptor = "(II)V")
	private void method7924(@OriginalArg(1) int arg0) {
		this.anInt9022 = (arg0 & 0xFF) << 4;
		this.anInt9026 = arg0 >> 12 & 0xFF0;
		this.anInt9023 = arg0 >> 4 & 0xFF0;
	}
}
