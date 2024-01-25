import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nga")
public final class Class33_Sub21 extends Class33 {

	@OriginalMember(owner = "client!nga", name = "<init>", descriptor = "(ILclient!wo;)V")
	public Class33_Sub21(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub49 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!nga", name = "<init>", descriptor = "(Lclient!wo;)V")
	public Class33_Sub21(@OriginalArg(0) Class2_Sub49 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!nga", name = "b", descriptor = "(II)I")
	@Override
	public int method8708(@OriginalArg(1) int arg0) {
		if (super.aClass2_Sub49_31.method8847()) {
			return 3;
		} else if (super.aClass2_Sub49_31.method8851() == Static579.aClass17_5) {
			return 1;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!nga", name = "c", descriptor = "(I)Z")
	public boolean method5677() {
		if (super.aClass2_Sub49_31.method8847()) {
			return false;
		} else {
			return super.aClass2_Sub49_31.method8851() == Static579.aClass17_5;
		}
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(I)V")
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

	@OriginalMember(owner = "client!nga", name = "c", descriptor = "(II)V")
	@Override
	protected void method8711(@OriginalArg(1) int arg0) {
		super.anInt10227 = arg0;
	}

	@OriginalMember(owner = "client!nga", name = "b", descriptor = "(B)I")
	public int method5680() {
		return super.anInt10227;
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(B)I")
	@Override
	protected int method8709() {
		return 1;
	}
}
