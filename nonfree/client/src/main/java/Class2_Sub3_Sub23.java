import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pba")
public final class Class2_Sub3_Sub23 extends Class2_Sub3 {

	@OriginalMember(owner = "client!pba", name = "M", descriptor = "I")
	private int anInt7906;

	@OriginalMember(owner = "client!pba", name = "<init>", descriptor = "(I)V")
	public Class2_Sub3_Sub23(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt7906 = 4096;
		this.anInt7906 = arg0;
	}

	@OriginalMember(owner = "client!pba", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub23() {
		this(4096);
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(Lclient!cea;II)V")
	@Override
	public void method9157(@OriginalArg(0) Class2_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt7906 = (arg0.method8383() << 12) / 255;
		}
	}

	@OriginalMember(owner = "client!pba", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method9150(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass281_41.method7189(arg0);
		if (super.aClass281_41.aBoolean607) {
			Static653.method7725(local9, 0, Static222.anInt4971, this.anInt7906);
		}
		return local9;
	}
}
