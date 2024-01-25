import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public final class Class93_Sub3 extends Class93 {

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Lclient!ej;)V")
	public Class93_Sub3(@OriginalArg(0) Class66_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IILclient!nq;)V")
	@Override
	public void method7995(@OriginalArg(0) int arg0, @OriginalArg(2) Interface15 arg1) {
		super.aClass66_Sub1_19.method6979(arg1);
		super.aClass66_Sub1_19.method6920(arg0);
	}

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "(I)V")
	@Override
	public void method8002() {
		super.aClass66_Sub1_19.method6914(false);
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7998() {
		return true;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BII)V")
	@Override
	public void method7996(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7997(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8000(@OriginalArg(0) boolean arg0) {
		super.aClass66_Sub1_19.method6914(true);
	}
}
