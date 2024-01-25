import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cca")
public final class Class7_Sub5 extends Class7 {

	@OriginalMember(owner = "client!cca", name = "<init>", descriptor = "(Lclient!pp;)V")
	public Class7_Sub5(@OriginalArg(0) Class6_Sub44 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!cca", name = "<init>", descriptor = "(ILclient!pp;)V")
	public Class7_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub44 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(I)I")
	@Override
	protected int method8782() {
		return 3;
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(BI)I")
	@Override
	public int method8786(@OriginalArg(1) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(II)V")
	@Override
	protected void method8783(@OriginalArg(1) int arg0) {
		super.anInt10186 = arg0;
	}

	@OriginalMember(owner = "client!cca", name = "c", descriptor = "(I)I")
	public int method808() {
		return super.anInt10186;
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(B)V")
	@Override
	public void method8785() {
		if (super.anInt10186 < 0 || super.anInt10186 > 4) {
			super.anInt10186 = this.method8782();
		}
	}
}
