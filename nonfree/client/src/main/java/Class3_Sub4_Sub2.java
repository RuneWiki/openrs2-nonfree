import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public final class Class3_Sub4_Sub2 extends Class3_Sub4 implements Interface2 {

	@OriginalMember(owner = "client!gg", name = "T", descriptor = "Lclient!tn;")
	public Class3_Sub4 aClass3_Sub4_1;

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(IIIIIIIIIILclient!tn;)V")
	public Class3_Sub4_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class3_Sub4 arg10) {
		super(arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, false, Static136.method2010(arg1, arg0));
		this.aClass3_Sub4_1 = arg10;
	}

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5277() {
		return false;
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)V")
	@Override
	public void method5297() {
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)I")
	@Override
	public int method5296() {
		return 0;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)I")
	@Override
	public int method5292() {
		return 0;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IBILclient!za;)Z")
	@Override
	public boolean method5282(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class163 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lclient!lb;IZIBILclient!za;)V")
	@Override
	public void method5281(@OriginalArg(0) Class3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class163 arg5) {
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(Lclient!za;I)V")
	@Override
	public void method5294(@OriginalArg(0) Class163 arg0) {
	}

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "(B)I")
	@Override
	public int method5298() {
		return 0;
	}

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "(Lclient!za;I)V")
	@Override
	public void method5285(@OriginalArg(0) Class163 arg0) {
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILclient!za;B)Lclient!e;")
	@Override
	public Class59 method5291(@OriginalArg(0) int arg0, @OriginalArg(1) Class163 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!gg", name = "e", descriptor = "(I)V")
	@Override
	public void method5284() {
	}

	@OriginalMember(owner = "client!gg", name = "f", descriptor = "(I)I")
	@Override
	public int method5286() {
		return 0;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(BLclient!za;)Lclient!ql;")
	@Override
	public Class21_Sub6 method5280(@OriginalArg(1) Class163 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lclient!za;I)V")
	@Override
	public void method5293(@OriginalArg(0) Class163 arg0) {
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5295() {
		return false;
	}
}
