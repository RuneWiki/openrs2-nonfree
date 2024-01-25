import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public final class Class31_Sub2 extends Class31 {

	@OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(Lclient!lea;)V")
	public Class31_Sub2(@OriginalArg(0) Class101_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(ZB)V")
	@Override
	public void method9602(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(ILclient!fga;I)V")
	@Override
	public void method9598(@OriginalArg(1) Class50 arg0, @OriginalArg(2) int arg1) {
		super.aClass101_Sub2_43.method5690(arg0);
		super.aClass101_Sub2_43.method5681(arg1);
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(ZI)V")
	@Override
	public void method9600(@OriginalArg(0) boolean arg0) {
		super.aClass101_Sub2_43.method5619(true);
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IZI)V")
	@Override
	public void method9603(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method9604() {
		return true;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(B)V")
	@Override
	public void method9597() {
		super.aClass101_Sub2_43.method5619(false);
	}
}
