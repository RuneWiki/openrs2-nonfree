import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!at")
public final class Class12_Sub2 extends Class12 {

	@OriginalMember(owner = "client!at", name = "<init>", descriptor = "(Lclient!sf;)V")
	public Class12_Sub2(@OriginalArg(0) Class5_Sub50 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!at", name = "<init>", descriptor = "(ILclient!sf;)V")
	public Class12_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub50 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(IZ)V")
	@Override
	protected void method8470(@OriginalArg(0) int arg0) {
		super.anInt10229 = arg0;
	}

	@OriginalMember(owner = "client!at", name = "b", descriptor = "(II)I")
	@Override
	public int method8473(@OriginalArg(0) int arg0) {
		if (super.aClass5_Sub50_31.method7526()) {
			return 3;
		} else if (super.aClass5_Sub50_31.method7532() == Static599.aClass98_6) {
			if (arg0 == 0) {
				if (super.aClass5_Sub50_31.aClass12_Sub20_1.method5947() == 1) {
					return 2;
				}
				if (super.aClass5_Sub50_31.aClass12_Sub21_1.method6299() == 1) {
					return 2;
				}
				if (super.aClass5_Sub50_31.aClass12_Sub29_1.method8477() > 0) {
					return 2;
				}
			}
			return 1;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!at", name = "b", descriptor = "(I)I")
	@Override
	protected int method8468() {
		return 1;
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(B)V")
	@Override
	public void method8472() {
		if (super.aClass5_Sub50_31.method7532() != Static599.aClass98_6) {
			super.anInt10229 = 1;
		} else if (super.aClass5_Sub50_31.method7526()) {
			super.anInt10229 = 0;
		}
		if (super.anInt10229 != 0 && super.anInt10229 != 1) {
			super.anInt10229 = this.method8468();
		}
	}

	@OriginalMember(owner = "client!at", name = "d", descriptor = "(I)Z")
	public boolean method348() {
		if (super.aClass5_Sub50_31.method7526()) {
			return false;
		} else {
			return super.aClass5_Sub50_31.method7532() == Static599.aClass98_6;
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(Z)I")
	public int method349() {
		return super.anInt10229;
	}
}
