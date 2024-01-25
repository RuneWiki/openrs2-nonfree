import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cl")
public final class Class2_Sub2_Sub7 extends Class2_Sub2 {

	@OriginalMember(owner = "client!cl", name = "S", descriptor = "I")
	private int anInt859;

	@OriginalMember(owner = "client!cl", name = "U", descriptor = "I")
	private int anInt861;

	@OriginalMember(owner = "client!cl", name = "W", descriptor = "I")
	private int anInt863;

	@OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(I)V")
	private Class2_Sub2_Sub7(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method993(arg0);
	}

	@OriginalMember(owner = "client!cl", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub7() {
		this(0);
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILclient!dg;I)V")
	@Override
	public void method5882(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub10 arg1) {
		if (arg0 == 0) {
			this.method993(arg1.method4463());
		}
	}

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5884(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass88_41.method2632(arg0);
		if (super.aClass88_41.aBoolean238) {
			@Pc(27) int[] local27 = local11[0];
			@Pc(31) int[] local31 = local11[1];
			@Pc(35) int[] local35 = local11[2];
			for (@Pc(37) int local37 = 0; local37 < Static339.anInt6735; local37++) {
				local27[local37] = this.anInt863;
				local31[local37] = this.anInt861;
				local35[local37] = this.anInt859;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!cl", name = "c", descriptor = "(IB)V")
	private void method993(@OriginalArg(0) int arg0) {
		this.anInt859 = (arg0 & 0xFF) << 4;
		this.anInt863 = arg0 >> 12 & 0xFF0;
		this.anInt861 = arg0 >> 4 & 0xFF0;
	}
}
