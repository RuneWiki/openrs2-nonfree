import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public final class Class25_Sub1_Sub1 extends Class25_Sub1 implements Interface8 {

	@OriginalMember(owner = "client!bl", name = "U", descriptor = "Lclient!pj;")
	public Class25_Sub1 aClass25_Sub1_1;

	static {
		new Class119("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.");
	}

	@OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(IIIIILclient!pj;)V")
	public Class25_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class25_Sub1 arg5) {
		super(arg2, arg3, arg4, 0, 0, 0, Static129.method2034(arg0, arg1));
		this.aClass25_Sub1_1 = arg5;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(B)I")
	@Override
	public int method4617() {
		return 0;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IBLclient!za;)Lclient!e;")
	@Override
	public Class57 method4618(@OriginalArg(0) int arg0, @OriginalArg(2) Class34 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!bl", name = "c", descriptor = "(I)I")
	@Override
	public int method4623() {
		return 0;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(ILclient!za;)V")
	@Override
	public void method4621(@OriginalArg(1) Class34 arg0) {
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(BLclient!za;)V")
	@Override
	public void method4622(@OriginalArg(1) Class34 arg0) {
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(I)I")
	@Override
	public int method4620() {
		return 0;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)V")
	@Override
	public void method4616() {
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(ILclient!za;BI)Z")
	@Override
	public boolean method4601(@OriginalArg(0) int arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!bl", name = "f", descriptor = "(I)I")
	@Override
	public int method4207() {
		return 0;
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(BLclient!za;)Lclient!uc;")
	@Override
	public Class4_Sub7 method4600(@OriginalArg(1) Class34 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!bl", name = "c", descriptor = "(BLclient!za;)V")
	@Override
	public void method4606(@OriginalArg(1) Class34 arg0) {
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method4619() {
		return false;
	}
}
