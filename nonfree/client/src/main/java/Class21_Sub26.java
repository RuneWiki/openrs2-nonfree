import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tw")
public final class Class21_Sub26 extends Class21 {

	@OriginalMember(owner = "client!tw", name = "<init>", descriptor = "(ILclient!gn;)V")
	public Class21_Sub26(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub22 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!tw", name = "<init>", descriptor = "(Lclient!gn;)V")
	public Class21_Sub26(@OriginalArg(0) Class14_Sub22 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(I)V")
	@Override
	public void method9290() {
		if (super.anInt11183 != 1 && super.anInt11183 != 0) {
			super.anInt11183 = this.method9292();
		}
	}

	@OriginalMember(owner = "client!tw", name = "b", descriptor = "(I)I")
	@Override
	protected int method9292() {
		return 1;
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(IB)V")
	@Override
	protected void method9291(@OriginalArg(0) int arg0) {
		super.anInt11183 = arg0;
	}

	@OriginalMember(owner = "client!tw", name = "f", descriptor = "(I)I")
	public int method8389() {
		return super.anInt11183;
	}

	@OriginalMember(owner = "client!tw", name = "c", descriptor = "(II)I")
	@Override
	public int method9289(@OriginalArg(1) int arg0) {
		return 1;
	}
}
