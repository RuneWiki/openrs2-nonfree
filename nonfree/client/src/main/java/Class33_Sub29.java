import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public final class Class33_Sub29 extends Class33 {

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(Lclient!wo;)V")
	public Class33_Sub29(@OriginalArg(0) Class2_Sub49 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(ILclient!wo;)V")
	public Class33_Sub29(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub49 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "(II)V")
	@Override
	protected void method8711(@OriginalArg(1) int arg0) {
		super.anInt10227 = arg0;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)I")
	@Override
	protected int method8709() {
		return 2;
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(B)I")
	public int method8714() {
		return super.anInt10227;
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(II)I")
	@Override
	public int method8708(@OriginalArg(1) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V")
	@Override
	public void method8710() {
		if (super.aClass2_Sub49_31.aClass33_Sub14_1.method4884() && super.anInt10227 == 2) {
			super.anInt10227 = 1;
		}
		if (super.anInt10227 < 0 || super.anInt10227 > 2) {
			super.anInt10227 = this.method8709();
		}
	}
}
