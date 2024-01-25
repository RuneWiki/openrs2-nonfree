import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eo")
public final class Class1_Sub2_Sub11 extends Class1_Sub2 {

	@OriginalMember(owner = "client!eo", name = "J", descriptor = "I")
	private int anInt1632;

	@OriginalMember(owner = "client!eo", name = "O", descriptor = "I")
	private int anInt1637;

	@OriginalMember(owner = "client!eo", name = "Q", descriptor = "I")
	private int anInt1638;

	@OriginalMember(owner = "client!eo", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub11() {
		this(0);
	}

	@OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(I)V")
	private Class1_Sub2_Sub11(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method1592(arg0);
	}

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5664(@OriginalArg(1) int arg0) {
		@Pc(17) int[][] local17 = super.aClass129_41.method3671(arg0);
		if (super.aClass129_41.aBoolean338) {
			@Pc(25) int[] local25 = local17[0];
			@Pc(29) int[] local29 = local17[1];
			@Pc(33) int[] local33 = local17[2];
			for (@Pc(35) int local35 = 0; local35 < Static251.anInt6509; local35++) {
				local25[local35] = this.anInt1638;
				local29[local35] = this.anInt1637;
				local33[local35] = this.anInt1632;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IILclient!eb;)V")
	@Override
	public void method5660(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (arg0 == 0) {
			this.method1592(arg1.method3137());
		}
	}

	@OriginalMember(owner = "client!eo", name = "d", descriptor = "(II)V")
	private void method1592(@OriginalArg(1) int arg0) {
		this.anInt1637 = arg0 >> 4 & 0xFF0;
		this.anInt1638 = arg0 >> 12 & 0xFF0;
		this.anInt1632 = (arg0 & 0xFF) << 4;
	}
}
