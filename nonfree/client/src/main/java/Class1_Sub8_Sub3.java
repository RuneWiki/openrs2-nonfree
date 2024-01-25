import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cp")
public final class Class1_Sub8_Sub3 extends Class1_Sub8 {

	@OriginalMember(owner = "client!cp", name = "J", descriptor = "I")
	private int anInt1585;

	@OriginalMember(owner = "client!cp", name = "L", descriptor = "I")
	private int anInt1586;

	@OriginalMember(owner = "client!cp", name = "O", descriptor = "I")
	private int anInt1589;

	@OriginalMember(owner = "client!cp", name = "<init>", descriptor = "(I)V")
	private Class1_Sub8_Sub3(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method1108(arg0);
	}

	@OriginalMember(owner = "client!cp", name = "<init>", descriptor = "()V")
	public Class1_Sub8_Sub3() {
		this(0);
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(ZILclient!ia;)V")
	@Override
	public void method6038(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 == 0) {
			this.method1108(arg1.method1226());
		}
	}

	@OriginalMember(owner = "client!cp", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method6030(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass130_41.method3108(arg0);
		if (super.aClass130_41.aBoolean246) {
			@Pc(27) int[] local27 = local11[0];
			@Pc(31) int[] local31 = local11[1];
			@Pc(35) int[] local35 = local11[2];
			for (@Pc(37) int local37 = 0; local37 < Static18.anInt439; local37++) {
				local27[local37] = this.anInt1585;
				local31[local37] = this.anInt1586;
				local35[local37] = this.anInt1589;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!cp", name = "c", descriptor = "(II)V")
	private void method1108(@OriginalArg(1) int arg0) {
		this.anInt1589 = (arg0 & 0xFF) << 4;
		this.anInt1585 = arg0 >> 12 & 0xFF0;
		this.anInt1586 = arg0 >> 4 & 0xFF0;
	}
}
