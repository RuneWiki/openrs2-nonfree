import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public final class Class56_Sub7 extends Class56 {

	@OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(Lclient!ht;)V")
	public Class56_Sub7(@OriginalArg(0) Class109_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IILclient!ao;)V")
	@Override
	public void method5086(@OriginalArg(1) int arg0, @OriginalArg(2) Class13 arg1) {
		super.aClass109_Sub1_41.method2578(arg1);
		super.aClass109_Sub1_41.method2531(arg0);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V")
	@Override
	public void method5084() {
		super.aClass109_Sub1_41.method2524(false);
	}

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "(III)V")
	@Override
	public void method5083(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method5087(@OriginalArg(1) boolean arg0) {
		super.aClass109_Sub1_41.method2524(true);
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5085() {
		return true;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5079(@OriginalArg(0) boolean arg0) {
	}
}
