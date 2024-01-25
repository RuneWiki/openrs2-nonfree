import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public final class Class25_Sub4_Sub3 extends Class25_Sub4 implements Interface8 {

	@OriginalMember(owner = "client!rc", name = "M", descriptor = "Lclient!uj;")
	public Class25_Sub4 aClass25_Sub4_3;

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(IIIIILclient!uj;)V")
	public Class25_Sub4_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class25_Sub4 arg5) {
		super(arg2, arg3, arg4, Static438.method3772(arg1, arg0));
		this.aClass25_Sub4_3 = arg5;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V")
	@Override
	public void method4616() {
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIZILclient!ot;Lclient!za;)V")
	@Override
	public void method4609(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class25 arg4, @OriginalArg(6) Class34 arg5) {
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILclient!za;)V")
	@Override
	public void method4621(@OriginalArg(1) Class34 arg0) {
	}

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "(B)V")
	@Override
	public void method4607() {
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)I")
	@Override
	public int method4620() {
		return 0;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILclient!za;BI)Z")
	@Override
	public boolean method4601(@OriginalArg(0) int arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(BLclient!za;)V")
	@Override
	public void method4622(@OriginalArg(1) Class34 arg0) {
	}

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "(I)I")
	@Override
	public int method4623() {
		return 0;
	}

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "(BLclient!za;)V")
	@Override
	public void method4606(@OriginalArg(1) Class34 arg0) {
	}

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method4602() {
		return false;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IBLclient!za;)Lclient!e;")
	@Override
	public Class57 method4618(@OriginalArg(0) int arg0, @OriginalArg(2) Class34 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(BLclient!za;)Lclient!uc;")
	@Override
	public Class4_Sub7 method4600(@OriginalArg(1) Class34 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method4619() {
		return false;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)I")
	@Override
	public int method4617() {
		return 0;
	}
}
