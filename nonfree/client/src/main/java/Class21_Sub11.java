import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gw")
public final class Class21_Sub11 extends Class21 {

	@OriginalMember(owner = "client!gw", name = "<init>", descriptor = "(ILclient!gn;)V")
	public Class21_Sub11(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub22 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!gw", name = "<init>", descriptor = "(Lclient!gn;)V")
	public Class21_Sub11(@OriginalArg(0) Class14_Sub22 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(I)V")
	@Override
	public void method9290() {
		if (super.anInt11183 < 0 || super.anInt11183 > 4) {
			super.anInt11183 = this.method9292();
		}
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(IB)V")
	@Override
	protected void method9291(@OriginalArg(0) int arg0) {
		super.anInt11183 = arg0;
	}

	@OriginalMember(owner = "client!gw", name = "b", descriptor = "(I)I")
	@Override
	protected int method9292() {
		return 0;
	}

	@OriginalMember(owner = "client!gw", name = "c", descriptor = "(II)I")
	@Override
	public int method9289(@OriginalArg(1) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!gw", name = "d", descriptor = "(I)I")
	public int method3087() {
		return super.anInt11183;
	}
}
