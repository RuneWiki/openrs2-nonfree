import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public final class Class3_Sub2_Sub1 extends Class3_Sub2 implements Interface2 {

	@OriginalMember(owner = "client!ba", name = "B", descriptor = "Lclient!oa;")
	public Class3_Sub2 aClass3_Sub2_1;

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(IIIIILclient!oa;)V")
	public Class3_Sub2_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class3_Sub2 arg5) {
		super(arg2, arg3, arg4, Static148.method2150(arg0, arg1));
		this.aClass3_Sub2_1 = arg5;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)I")
	@Override
	public int method5292() {
		return 0;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(BLclient!za;)Lclient!ql;")
	@Override
	public Class21_Sub6 method5280(@OriginalArg(1) Class163 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILclient!za;B)Lclient!e;")
	@Override
	public Class59 method5291(@OriginalArg(0) int arg0, @OriginalArg(1) Class163 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)V")
	@Override
	public void method5297() {
	}

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5277() {
		return false;
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5295() {
		return false;
	}

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "(Lclient!za;I)V")
	@Override
	public void method5285(@OriginalArg(0) Class163 arg0) {
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!lb;IZIBILclient!za;)V")
	@Override
	public void method5281(@OriginalArg(0) Class3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class163 arg5) {
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)I")
	@Override
	public int method5296() {
		return 0;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!za;I)V")
	@Override
	public void method5293(@OriginalArg(0) Class163 arg0) {
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(Lclient!za;I)V")
	@Override
	public void method5294(@OriginalArg(0) Class163 arg0) {
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IBILclient!za;)Z")
	@Override
	public boolean method5282(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class163 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "(B)I")
	@Override
	public int method5298() {
		return 0;
	}

	@OriginalMember(owner = "client!ba", name = "e", descriptor = "(I)V")
	@Override
	public void method5284() {
	}
}
