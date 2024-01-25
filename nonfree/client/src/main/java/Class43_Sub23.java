import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pja")
public final class Class43_Sub23 extends Class43 {

	@OriginalMember(owner = "client!pja", name = "<init>", descriptor = "(Lclient!lha;)V")
	public Class43_Sub23(@OriginalArg(0) Class14_Sub26 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!pja", name = "<init>", descriptor = "(ILclient!lha;)V")
	public Class43_Sub23(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub26 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!pja", name = "a", descriptor = "(I)I")
	@Override
	protected int method8889() {
		return 0;
	}

	@OriginalMember(owner = "client!pja", name = "a", descriptor = "(Z)I")
	public int method7067() {
		return super.anInt10397;
	}

	@OriginalMember(owner = "client!pja", name = "b", descriptor = "(B)V")
	@Override
	public void method8892() {
		if (super.aClass14_Sub26_32.aClass43_Sub1_1.method797() && !Static461.method6793(super.aClass14_Sub26_32.aClass43_Sub1_1.method801())) {
			super.anInt10397 = 0;
		}
		if (super.anInt10397 < 0 || super.anInt10397 > 1) {
			super.anInt10397 = this.method8889();
		}
	}

	@OriginalMember(owner = "client!pja", name = "b", descriptor = "(I)Z")
	public boolean method7068() {
		return Static461.method6793(super.aClass14_Sub26_32.aClass43_Sub1_1.method801());
	}

	@OriginalMember(owner = "client!pja", name = "c", descriptor = "(II)I")
	@Override
	public int method8894(@OriginalArg(0) int arg0) {
		return Static461.method6793(super.aClass14_Sub26_32.aClass43_Sub1_1.method801()) ? 1 : 3;
	}

	@OriginalMember(owner = "client!pja", name = "a", descriptor = "(II)V")
	@Override
	protected void method8893(@OriginalArg(1) int arg0) {
		super.anInt10397 = arg0;
	}
}
