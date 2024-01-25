import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mea")
public final class Class33_Sub17 extends Class33 {

	@OriginalMember(owner = "client!mea", name = "<init>", descriptor = "(Lclient!wo;)V")
	public Class33_Sub17(@OriginalArg(0) Class2_Sub49 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!mea", name = "<init>", descriptor = "(ILclient!wo;)V")
	public Class33_Sub17(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub49 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(I)V")
	@Override
	public void method8710() {
		if (super.aClass2_Sub49_31.method8847()) {
			super.anInt10227 = 0;
		}
		if (super.anInt10227 < 0 && super.anInt10227 > 2) {
			super.anInt10227 = this.method8709();
		}
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(B)I")
	@Override
	protected int method8709() {
		return 1;
	}

	@OriginalMember(owner = "client!mea", name = "b", descriptor = "(II)I")
	@Override
	public int method8708(@OriginalArg(1) int arg0) {
		if (super.aClass2_Sub49_31.method8847()) {
			return 3;
		} else if (arg0 == 0 || super.aClass2_Sub49_31.aClass33_Sub6_1.method2479() == 1) {
			return 1;
		} else {
			return 2;
		}
	}

	@OriginalMember(owner = "client!mea", name = "b", descriptor = "(B)I")
	public int method5248() {
		return super.anInt10227;
	}

	@OriginalMember(owner = "client!mea", name = "c", descriptor = "(I)Z")
	public boolean method5249() {
		return !super.aClass2_Sub49_31.method8847();
	}

	@OriginalMember(owner = "client!mea", name = "c", descriptor = "(II)V")
	@Override
	protected void method8711(@OriginalArg(1) int arg0) {
		super.anInt10227 = arg0;
	}
}
