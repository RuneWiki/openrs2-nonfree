import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public final class Class33_Sub25 extends Class33 {

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "(ILclient!wo;)V")
	public Class33_Sub25(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub49 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Lclient!wo;)V")
	public Class33_Sub25(@OriginalArg(0) Class2_Sub49 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(B)I")
	public int method7520() {
		return super.anInt10227;
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(II)I")
	@Override
	public int method8708(@OriginalArg(1) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V")
	@Override
	public void method8710() {
		if (super.anInt10227 < 1 || super.anInt10227 > 3) {
			super.anInt10227 = this.method8709();
		}
	}

	@OriginalMember(owner = "client!te", name = "c", descriptor = "(II)V")
	@Override
	protected void method8711(@OriginalArg(1) int arg0) {
		super.anInt10227 = arg0;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(B)I")
	@Override
	protected int method8709() {
		return super.aClass2_Sub49_31.method8846().method2969() ? 3 : 2;
	}
}
