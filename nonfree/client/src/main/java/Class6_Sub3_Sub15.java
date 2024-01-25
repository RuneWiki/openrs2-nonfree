import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ga")
public final class Class6_Sub3_Sub15 extends Class6_Sub3 {

	@OriginalMember(owner = "client!ga", name = "F", descriptor = "I")
	private int anInt2976;

	@OriginalMember(owner = "client!ga", name = "L", descriptor = "I")
	private int anInt2980;

	@OriginalMember(owner = "client!ga", name = "P", descriptor = "I")
	private int anInt2983;

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "()V")
	public Class6_Sub3_Sub15() {
		this(0);
	}

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(I)V")
	private Class6_Sub3_Sub15(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method2598(arg0);
	}

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method7959(@OriginalArg(1) int arg0) {
		@Pc(17) int[][] local17 = super.aClass263_41.method5967(arg0);
		if (super.aClass263_41.aBoolean505) {
			@Pc(25) int[] local25 = local17[0];
			@Pc(29) int[] local29 = local17[1];
			@Pc(33) int[] local33 = local17[2];
			for (@Pc(35) int local35 = 0; local35 < Static35.anInt670; local35++) {
				local25[local35] = this.anInt2980;
				local29[local35] = this.anInt2983;
				local33[local35] = this.anInt2976;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(ILclient!jr;B)V")
	@Override
	public void method7955(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub12 arg1) {
		if (arg0 == 0) {
			this.method2598(arg1.method6037());
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IB)V")
	private void method2598(@OriginalArg(0) int arg0) {
		this.anInt2983 = arg0 >> 4 & 0xFF0;
		this.anInt2980 = arg0 >> 12 & 0xFF0;
		this.anInt2976 = (arg0 & 0xFF) << 4;
	}
}
