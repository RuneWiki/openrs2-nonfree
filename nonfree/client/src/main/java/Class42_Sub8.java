import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public final class Class42_Sub8 extends Class42 {

	@OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(Lclient!re;)V")
	public Class42_Sub8(@OriginalArg(0) Class122_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!rr", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method6433() {
		return false;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(BZ)V")
	@Override
	public void method6429(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "(I)V")
	@Override
	public void method6424() {
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(ZI)V")
	@Override
	public void method6432(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IZI)V")
	@Override
	public void method6431(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(ZILclient!sw;)V")
	@Override
	public void method6425(@OriginalArg(1) int arg0, @OriginalArg(2) Interface15 arg1) {
		super.aClass122_Sub2_16.method5651(arg1);
		super.aClass122_Sub2_16.method5561(arg0);
	}
}
