import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gt")
public final class Class5_Sub2_Sub13 extends Class5_Sub2 {

	@OriginalMember(owner = "client!gt", name = "G", descriptor = "I")
	private int anInt3960;

	@OriginalMember(owner = "client!gt", name = "K", descriptor = "I")
	private int anInt3963;

	@OriginalMember(owner = "client!gt", name = "N", descriptor = "I")
	private int anInt3964;

	@OriginalMember(owner = "client!gt", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub13() {
		this(0);
	}

	@OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(I)V")
	private Class5_Sub2_Sub13(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method3371(arg0);
	}

	@OriginalMember(owner = "client!gt", name = "b", descriptor = "(IB)V")
	private void method3371(@OriginalArg(0) int arg0) {
		this.anInt3963 = (arg0 & 0xFF) << 4;
		this.anInt3964 = arg0 >> 12 & 0xFF0;
		this.anInt3960 = arg0 >> 4 & 0xFF0;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lclient!mc;II)V")
	@Override
	public void method8944(@OriginalArg(0) Class5_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.method3371(arg0.method7807());
		}
	}

	@OriginalMember(owner = "client!gt", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8943(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass180_41.method4548(arg0);
		if (super.aClass180_41.aBoolean464) {
			@Pc(24) int[] local24 = local16[0];
			@Pc(28) int[] local28 = local16[1];
			@Pc(32) int[] local32 = local16[2];
			for (@Pc(34) int local34 = 0; local34 < Static195.anInt3759; local34++) {
				local24[local34] = this.anInt3964;
				local28[local34] = this.anInt3960;
				local32[local34] = this.anInt3963;
			}
		}
		return local16;
	}
}
