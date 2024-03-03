import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public final class Class2_Sub3_Sub23 extends Class2_Sub3 {

	@OriginalMember(owner = "client!pb", name = "R", descriptor = "I")
	public static int anInt4824 = 503;

	@OriginalMember(owner = "client!pb", name = "Q", descriptor = "Z")
	public static boolean aBoolean329 = false;

	@OriginalMember(owner = "client!pb", name = "N", descriptor = "I")
	private int anInt4821;

	@OriginalMember(owner = "client!pb", name = "O", descriptor = "I")
	private int anInt4822;

	@OriginalMember(owner = "client!pb", name = "S", descriptor = "I")
	private int anInt4825;

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(I)V", line = 44)
	private Class2_Sub3_Sub23(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method4467(arg0);
	}

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "()V", line = 120)
	public Class2_Sub3_Sub23() {
		this(0);
	}

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "(IB)V", line = 11)
	private void method4467(@OriginalArg(0) int arg0) {
		this.anInt4825 = (arg0 & 0xFF) << 4;
		this.anInt4821 = arg0 >> 4 & 0xFF0;
		this.anInt4822 = arg0 >> 12 & 0xFF0;
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(IB)[[I", line = 53)
	@Override
	public int[][] method6480(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass243_41.method6278(arg0);
		if (super.aClass243_41.aBoolean478) {
			@Pc(27) int[] local27 = local11[0];
			@Pc(31) int[] local31 = local11[1];
			@Pc(35) int[] local35 = local11[2];
			for (@Pc(37) int local37 = 0; local37 < Static211.anInt4031; local37++) {
				local27[local37] = this.anInt4822;
				local31[local37] = this.anInt4821;
				local35[local37] = this.anInt4825;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILclient!bt;I)V", line = 93)
	@Override
	public void method6485(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub4 arg1) {
		if (arg0 == 0) {
			this.method4467(arg1.method4834());
		}
	}
}
