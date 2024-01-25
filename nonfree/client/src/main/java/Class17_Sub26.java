import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public final class Class17_Sub26 extends Class17 {

	@OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(ILclient!es;)V")
	public Class17_Sub26(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub19 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(Lclient!es;)V")
	public Class17_Sub26(@OriginalArg(0) Class5_Sub19 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(II)I")
	@Override
	public int method9169(@OriginalArg(1) int arg0) {
		return super.aClass5_Sub19_31.method2551() ? 3 : 1;
	}

	@OriginalMember(owner = "client!ut", name = "c", descriptor = "(I)Z")
	public boolean method8453() {
		return !super.aClass5_Sub19_31.method2551();
	}

	@OriginalMember(owner = "client!ut", name = "b", descriptor = "(I)V")
	@Override
	public void method9168() {
		if (super.aClass5_Sub19_31.method2551()) {
			super.anInt10866 = 2;
		}
		if (super.anInt10866 < 0 || super.anInt10866 > 2) {
			super.anInt10866 = this.method9173();
		}
	}

	@OriginalMember(owner = "client!ut", name = "b", descriptor = "(Z)I")
	public int method8454() {
		return super.anInt10866;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(IZ)V")
	@Override
	protected void method9172(@OriginalArg(0) int arg0) {
		super.anInt10866 = arg0;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(I)I")
	@Override
	protected int method9173() {
		if (super.aClass5_Sub19_31.method2551()) {
			return 2;
		} else if (super.aClass5_Sub19_31.aClass17_Sub24_2.method8103() && Static5.method9221(super.aClass5_Sub19_31.aClass17_Sub24_2.method8102())) {
			return 1;
		} else {
			return 0;
		}
	}
}
