import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hg")
public final class Class5_Sub2_Sub14 extends Class5_Sub2 {

	@OriginalMember(owner = "client!hg", name = "I", descriptor = "I")
	private int anInt4176;

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub14() {
		this(4096);
	}

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(I)V")
	public Class5_Sub2_Sub14(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt4176 = 4096;
		this.anInt4176 = arg0;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lclient!mc;II)V")
	@Override
	public void method8944(@OriginalArg(0) Class5_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt4176 = (arg0.method7816() << 12) / 255;
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8942(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass333_41.method7747(arg0);
		if (super.aClass333_41.aBoolean779) {
			Static686.method4970(local9, 0, Static195.anInt3759, this.anInt4176);
		}
		return local9;
	}
}
