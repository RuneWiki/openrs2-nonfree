import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public final class Class33_Sub6 extends Class33 {

	@OriginalMember(owner = "client!el", name = "<init>", descriptor = "(Lclient!wo;)V")
	public Class33_Sub6(@OriginalArg(0) Class2_Sub49 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!el", name = "<init>", descriptor = "(ILclient!wo;)V")
	public Class33_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub49 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(B)I")
	@Override
	protected int method8709() {
		return 1;
	}

	@OriginalMember(owner = "client!el", name = "c", descriptor = "(II)V")
	@Override
	protected void method8711(@OriginalArg(1) int arg0) {
		super.anInt10227 = arg0;
	}

	@OriginalMember(owner = "client!el", name = "b", descriptor = "(II)I")
	@Override
	public int method8708(@OriginalArg(1) int arg0) {
		if (super.aClass2_Sub49_31.method8847()) {
			return 3;
		} else if (super.aClass2_Sub49_31.method8851() == Static579.aClass17_5) {
			if (arg0 == 0) {
				if (super.aClass2_Sub49_31.aClass33_Sub23_1.method7242() == 1) {
					return 2;
				}
				if (super.aClass2_Sub49_31.aClass33_Sub2_1.method1432() == 1) {
					return 2;
				}
				if (super.aClass2_Sub49_31.aClass33_Sub17_1.method5248() > 0) {
					return 2;
				}
			}
			return 1;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!el", name = "c", descriptor = "(I)Z")
	public boolean method2478() {
		if (super.aClass2_Sub49_31.method8847()) {
			return false;
		} else {
			return super.aClass2_Sub49_31.method8851() == Static579.aClass17_5;
		}
	}

	@OriginalMember(owner = "client!el", name = "c", descriptor = "(B)I")
	public int method2479() {
		return super.anInt10227;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(I)V")
	@Override
	public void method8710() {
		if (super.aClass2_Sub49_31.method8851() != Static579.aClass17_5) {
			super.anInt10227 = 1;
		} else if (super.aClass2_Sub49_31.method8847()) {
			super.anInt10227 = 0;
		}
		if (super.anInt10227 != 0 && super.anInt10227 != 1) {
			super.anInt10227 = this.method8709();
		}
	}
}
