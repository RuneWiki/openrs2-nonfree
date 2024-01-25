import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public final class Class12_Sub10 extends Class12 {

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(ILclient!sf;)V")
	public Class12_Sub10(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub50 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Lclient!sf;)V")
	public Class12_Sub10(@OriginalArg(0) Class5_Sub50 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)V")
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

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(II)I")
	@Override
	public int method8473(@OriginalArg(0) int arg0) {
		if (super.aClass5_Sub50_31.method7526()) {
			return 3;
		} else if (super.aClass5_Sub50_31.method7532() == Static599.aClass98_6) {
			return 1;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)I")
	@Override
	protected int method8468() {
		return 1;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Z)I")
	public int method2365() {
		return super.anInt10229;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IZ)V")
	@Override
	protected void method8470(@OriginalArg(0) int arg0) {
		super.anInt10229 = arg0;
	}

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "(I)Z")
	public boolean method2366() {
		if (super.aClass5_Sub50_31.method7526()) {
			return false;
		} else {
			return super.aClass5_Sub50_31.method7532() == Static599.aClass98_6;
		}
	}
}
