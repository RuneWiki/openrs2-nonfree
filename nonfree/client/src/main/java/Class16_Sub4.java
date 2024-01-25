import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public final class Class16_Sub4 extends Class16 {

	@OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(Lclient!tt;)V")
	public Class16_Sub4(@OriginalArg(0) Class200_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5154() {
		return true;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5149(@OriginalArg(0) boolean arg0) {
		super.aClass200_Sub2_36.method5301(true);
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(BILclient!in;)V")
	@Override
	public void method5150(@OriginalArg(1) int arg0, @OriginalArg(2) Class31 arg1) {
		super.aClass200_Sub2_36.method5312(arg1);
		super.aClass200_Sub2_36.method5297(arg0);
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(B)V")
	@Override
	public void method5148() {
		super.aClass200_Sub2_36.method5301(false);
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method5155(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(BZ)V")
	@Override
	public void method5157(@OriginalArg(1) boolean arg0) {
	}
}
