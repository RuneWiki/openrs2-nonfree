import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public final class Class25_Sub5_Sub6 extends Class25_Sub5 implements Interface8 {

	@OriginalMember(owner = "client!qd", name = "bb", descriptor = "Lclient!ns;")
	public Class25_Sub5 aClass25_Sub5_2;

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(IIIIIIIIIILclient!ns;)V")
	public Class25_Sub5_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class25_Sub5 arg10) {
		super(arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, false, Static78.method2856(arg1, arg0));
		this.aClass25_Sub5_2 = arg10;
	}

	@OriginalMember(owner = "client!qd", name = "e", descriptor = "(I)I")
	@Override
	public int method4341() {
		return 0;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIZILclient!ot;Lclient!za;)V")
	@Override
	public void method4609(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class25 arg4, @OriginalArg(6) Class34 arg5) {
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IBLclient!za;)Lclient!e;")
	@Override
	public Class57 method4618(@OriginalArg(0) int arg0, @OriginalArg(2) Class34 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V")
	@Override
	public void method4616() {
	}

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "(BLclient!za;)V")
	@Override
	public void method4606(@OriginalArg(1) Class34 arg0) {
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(BLclient!za;)Lclient!uc;")
	@Override
	public Class4_Sub7 method4600(@OriginalArg(1) Class34 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "(I)I")
	@Override
	public int method4623() {
		return 0;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILclient!za;BI)Z")
	@Override
	public boolean method4601(@OriginalArg(0) int arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(BLclient!za;)V")
	@Override
	public void method4622(@OriginalArg(1) Class34 arg0) {
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)I")
	@Override
	public int method4620() {
		return 0;
	}

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method4602() {
		return false;
	}

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "(B)V")
	@Override
	public void method4607() {
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(B)I")
	@Override
	public int method4617() {
		return 0;
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method4619() {
		return false;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILclient!za;)V")
	@Override
	public void method4621(@OriginalArg(1) Class34 arg0) {
	}
}
