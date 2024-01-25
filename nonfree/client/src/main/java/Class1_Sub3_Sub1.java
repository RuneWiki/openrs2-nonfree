import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public final class Class1_Sub3_Sub1 extends Class1_Sub3 implements Interface6 {

	@OriginalMember(owner = "client!ak", name = "z", descriptor = "Lclient!vf;")
	public Class1_Sub3 aClass1_Sub3_1;

	static {
		new Class202("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.");
	}

	@OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(IIIIILclient!vf;)V")
	public Class1_Sub3_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class1_Sub3 arg5) {
		super(arg2, arg3, arg4, 0, 0, 0, Static247.method3920(arg1, arg0));
		this.aClass1_Sub3_1 = arg5;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(BILclient!qa;)Lclient!r;")
	@Override
	public Class63 method7689(@OriginalArg(1) int arg0, @OriginalArg(2) Class39 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lclient!qa;Z)V")
	@Override
	public void method7677(@OriginalArg(0) Class39 arg0) {
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILclient!qa;IB)Z")
	@Override
	public boolean method7673(@OriginalArg(0) int arg0, @OriginalArg(1) Class39 arg1, @OriginalArg(2) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(I)I")
	@Override
	public int method7687() {
		return 0;
	}

	@OriginalMember(owner = "client!ak", name = "f", descriptor = "(I)I")
	@Override
	public int method2595() {
		return 0;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7684() {
		return false;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method7682(@OriginalArg(0) Class39 arg0) {
	}

	@OriginalMember(owner = "client!ak", name = "c", descriptor = "(I)I")
	@Override
	public int method7688() {
		return 0;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Z)I")
	@Override
	public int method7685() {
		return 0;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILclient!qa;)Lclient!lb;")
	@Override
	public Class6_Sub5 method7680(@OriginalArg(1) Class39 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)V")
	@Override
	public void method7683() {
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(BLclient!qa;)Lclient!ed;")
	@Override
	public Class68 method7676(@OriginalArg(1) Class39 arg0) {
		return this.aClass1_Sub3_1.method7676(arg0);
	}

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method7686(@OriginalArg(0) Class39 arg0) {
	}
}
