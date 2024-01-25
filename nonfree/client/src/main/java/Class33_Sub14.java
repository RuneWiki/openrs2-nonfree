import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public final class Class33_Sub14 extends Class33 {

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lclient!wo;)V")
	public Class33_Sub14(@OriginalArg(0) Class2_Sub49 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(ILclient!wo;)V")
	public Class33_Sub14(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub49 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)I")
	@Override
	protected int method8709() {
		return 0;
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(B)Z")
	public boolean method4884() {
		return Static224.method3612(super.anInt10227);
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
	@Override
	public void method8710() {
		if (this.method4884()) {
			if (super.aClass2_Sub49_31.aClass33_Sub28_1.method8685() && !Static339.method5148(super.aClass2_Sub49_31.aClass33_Sub28_1.method8687())) {
				super.anInt10227 = 1;
			}
			if (super.aClass2_Sub49_31.aClass33_Sub25_1.method7520() == 1) {
				super.anInt10227 = 1;
			}
		}
		if (super.anInt10227 == 3) {
			super.anInt10227 = 2;
		}
		if (super.anInt10227 < 0 || super.anInt10227 > 3) {
			super.anInt10227 = this.method8709();
		}
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(II)I")
	@Override
	public int method8708(@OriginalArg(1) int arg0) {
		if (Static224.method3612(arg0)) {
			if (super.aClass2_Sub49_31.aClass33_Sub28_1.method8685() && !Static339.method5148(super.aClass2_Sub49_31.aClass33_Sub28_1.method8687())) {
				return 3;
			}
			if (super.aClass2_Sub49_31.aClass33_Sub25_1.method7520() == 1) {
				return 3;
			}
		}
		if (arg0 == 3) {
			return 3;
		} else if (Static224.method3612(arg0)) {
			return 2;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!ld", name = "d", descriptor = "(B)I")
	public int method4886() {
		return super.anInt10227;
	}

	@OriginalMember(owner = "client!ld", name = "d", descriptor = "(I)Z")
	public boolean method4888() {
		return true;
	}

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "(II)V")
	@Override
	protected void method8711(@OriginalArg(1) int arg0) {
		super.anInt10227 = arg0;
	}
}
