import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public final class Class12_Sub18 extends Class12 {

	@OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(ILclient!sf;)V")
	public Class12_Sub18(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub50 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(Lclient!sf;)V")
	public Class12_Sub18(@OriginalArg(0) Class5_Sub50 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!kp", name = "c", descriptor = "(I)Z")
	public boolean method4999() {
		return !super.aClass5_Sub50_31.method7526();
	}

	@OriginalMember(owner = "client!kp", name = "b", descriptor = "(I)I")
	@Override
	protected int method8468() {
		return 1;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(IZ)V")
	@Override
	protected void method8470(@OriginalArg(0) int arg0) {
		super.anInt10229 = arg0;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(Z)I")
	public int method5001() {
		return super.anInt10229;
	}

	@OriginalMember(owner = "client!kp", name = "b", descriptor = "(II)I")
	@Override
	public int method8473(@OriginalArg(0) int arg0) {
		return super.aClass5_Sub50_31.method7526() ? 3 : 1;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(B)V")
	@Override
	public void method8472() {
		if (super.aClass5_Sub50_31.method7526()) {
			super.anInt10229 = 0;
		}
		if (super.anInt10229 != 1 && super.anInt10229 != 0) {
			super.anInt10229 = this.method8468();
		}
	}
}
