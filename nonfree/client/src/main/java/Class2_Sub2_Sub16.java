import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class2_Sub2_Sub16 extends Class2_Sub2 {

	@OriginalMember(owner = "client!jc", name = "W", descriptor = "I")
	private int anInt2505;

	@OriginalMember(owner = "client!jc", name = "X", descriptor = "I")
	private int anInt2506;

	@OriginalMember(owner = "client!jc", name = "ab", descriptor = "I")
	private int anInt2508;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(I)V")
	private Class2_Sub2_Sub16(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method1983(arg0);
	}

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub16() {
		this(0);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IILclient!og;)V")
	@Override
	public void method3565(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub3 arg1) {
		if (arg0 == 0) {
			this.method1983(arg1.method239());
		}
	}

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "(II)V")
	private void method1983(@OriginalArg(1) int arg0) {
		this.anInt2506 = (arg0 & 0xFF) << 4;
		this.anInt2508 = arg0 >> 4 & 0xFF0;
		this.anInt2505 = arg0 >> 12 & 0xFF0;
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method3568(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass90_41.method3443(arg0);
		if (super.aClass90_41.aBoolean177) {
			@Pc(27) int[] local27 = local19[1];
			@Pc(31) int[] local31 = local19[2];
			@Pc(35) int[] local35 = local19[0];
			for (@Pc(37) int local37 = 0; local37 < Static106.anInt3045; local37++) {
				local35[local37] = this.anInt2505;
				local27[local37] = this.anInt2508;
				local31[local37] = this.anInt2506;
			}
		}
		return local19;
	}
}
