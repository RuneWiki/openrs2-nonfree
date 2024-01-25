import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dm")
public final class Class5_Sub2_Sub8 extends Class5_Sub2 {

	@OriginalMember(owner = "client!dm", name = "F", descriptor = "I")
	private int anInt1634;

	@OriginalMember(owner = "client!dm", name = "H", descriptor = "I")
	private int anInt1636;

	@OriginalMember(owner = "client!dm", name = "L", descriptor = "I")
	private int anInt1640;

	@OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(I)V")
	private Class5_Sub2_Sub8(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method1524(arg0);
	}

	@OriginalMember(owner = "client!dm", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub8() {
		this(0);
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lclient!ee;BI)V")
	@Override
	public void method8825(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.method1524(arg0.method8657());
		}
	}

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "(IZ)[[I")
	@Override
	public int[][] method8827(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass370_41.method8551(arg0);
		if (super.aClass370_41.aBoolean819) {
			@Pc(25) int[] local25 = local11[0];
			@Pc(29) int[] local29 = local11[1];
			@Pc(33) int[] local33 = local11[2];
			for (@Pc(35) int local35 = 0; local35 < Static314.anInt6320; local35++) {
				local25[local35] = this.anInt1634;
				local29[local35] = this.anInt1636;
				local33[local35] = this.anInt1640;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(II)V")
	private void method1524(@OriginalArg(1) int arg0) {
		this.anInt1640 = (arg0 & 0xFF) << 4;
		this.anInt1634 = arg0 >> 12 & 0xFF0;
		this.anInt1636 = arg0 >> 4 & 0xFF0;
	}
}
