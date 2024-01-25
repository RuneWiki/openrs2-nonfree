import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public final class Class33_Sub10 extends Class33 {

	@OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(ILclient!wo;)V")
	public Class33_Sub10(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub49 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(Lclient!wo;)V")
	public Class33_Sub10(@OriginalArg(0) Class2_Sub49 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!hn", name = "c", descriptor = "(I)Z")
	public boolean method3563() {
		return !super.aClass2_Sub49_31.method8847();
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)V")
	@Override
	public void method8710() {
		if (super.aClass2_Sub49_31.method8847()) {
			super.anInt10227 = 2;
		}
		if (super.anInt10227 < 0 || super.anInt10227 > 2) {
			super.anInt10227 = this.method8709();
		}
	}

	@OriginalMember(owner = "client!hn", name = "c", descriptor = "(II)V")
	@Override
	protected void method8711(@OriginalArg(1) int arg0) {
		super.anInt10227 = arg0;
	}

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "(B)I")
	public int method3565() {
		return super.anInt10227;
	}

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "(II)I")
	@Override
	public int method8708(@OriginalArg(1) int arg0) {
		return super.aClass2_Sub49_31.method8847() ? 3 : 1;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(B)I")
	@Override
	protected int method8709() {
		if (super.aClass2_Sub49_31.method8847()) {
			return 2;
		} else if (super.aClass2_Sub49_31.aClass33_Sub28_1.method8685() && Static529.method7328(super.aClass2_Sub49_31.aClass33_Sub28_1.method8687())) {
			return 1;
		} else {
			return 0;
		}
	}
}
