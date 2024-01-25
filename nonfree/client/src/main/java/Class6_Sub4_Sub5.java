import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!br")
public final class Class6_Sub4_Sub5 extends Class6_Sub4 {

	@OriginalMember(owner = "client!br", name = "B", descriptor = "I")
	private int anInt1053;

	@OriginalMember(owner = "client!br", name = "G", descriptor = "I")
	private int anInt1058;

	@OriginalMember(owner = "client!br", name = "H", descriptor = "I")
	private int anInt1059;

	@OriginalMember(owner = "client!br", name = "<init>", descriptor = "(I)V")
	private Class6_Sub4_Sub5(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method1074(arg0);
	}

	@OriginalMember(owner = "client!br", name = "<init>", descriptor = "()V")
	public Class6_Sub4_Sub5() {
		this(0);
	}

	@OriginalMember(owner = "client!br", name = "b", descriptor = "(II)V")
	private void method1074(@OriginalArg(1) int arg0) {
		this.anInt1053 = (arg0 & 0xFF) << 4;
		this.anInt1058 = arg0 >> 12 & 0xFF0;
		this.anInt1059 = arg0 >> 4 & 0xFF0;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7757(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass27_41.method911(arg0);
		if (super.aClass27_41.aBoolean54) {
			@Pc(27) int[] local27 = local19[0];
			@Pc(31) int[] local31 = local19[1];
			@Pc(35) int[] local35 = local19[2];
			for (@Pc(37) int local37 = 0; local37 < Static408.anInt7209; local37++) {
				local27[local37] = this.anInt1058;
				local31[local37] = this.anInt1059;
				local35[local37] = this.anInt1053;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IILclient!ji;)V")
	@Override
	public void method7750(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub21 arg1) {
		if (arg0 == 0) {
			this.method1074(arg1.method6031());
		}
	}
}
