import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public final class Class14_Sub2 extends Class14 {

	@OriginalMember(owner = "client!av", name = "<init>", descriptor = "(Lclient!dh;)V")
	public Class14_Sub2(@OriginalArg(0) Class2_Sub13 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!av", name = "<init>", descriptor = "(ILclient!dh;)V")
	public Class14_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub13 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!av", name = "b", descriptor = "(II)I")
	@Override
	public int method9033(@OriginalArg(1) int arg0) {
		return Static124.method9252(super.aClass2_Sub13_31.aClass14_Sub5_2.method2945()) ? 1 : 3;
	}

	@OriginalMember(owner = "client!av", name = "d", descriptor = "(I)I")
	public int method655() {
		return super.anInt10835;
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(II)V")
	@Override
	protected void method9031(@OriginalArg(1) int arg0) {
		super.anInt10835 = arg0;
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(Z)V")
	@Override
	public void method9035() {
		if (super.aClass2_Sub13_31.aClass14_Sub5_2.method2946() && !Static124.method9252(super.aClass2_Sub13_31.aClass14_Sub5_2.method2945())) {
			super.anInt10835 = 0;
		}
		if (super.anInt10835 < 0 || super.anInt10835 > 1) {
			super.anInt10835 = this.method9029();
		}
	}

	@OriginalMember(owner = "client!av", name = "f", descriptor = "(I)Z")
	public boolean method658() {
		return Static124.method9252(super.aClass2_Sub13_31.aClass14_Sub5_2.method2945());
	}

	@OriginalMember(owner = "client!av", name = "b", descriptor = "(I)I")
	@Override
	protected int method9029() {
		return 0;
	}
}
