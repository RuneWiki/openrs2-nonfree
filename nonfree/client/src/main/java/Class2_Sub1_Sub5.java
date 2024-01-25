import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public final class Class2_Sub1_Sub5 extends Class2_Sub1 implements Interface2 {

	@OriginalMember(owner = "client!sa", name = "D", descriptor = "Lclient!aa;")
	public Class2_Sub1 aClass2_Sub1_2;

	static {
		new Class198("This mute will remain for a further ", "Diese Stummschaltung gilt für weitere ", "Votre accès restera bloqué encore ", "Este veto permanecerá por mais ");
	}

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(IIIIIIIIIILclient!aa;)V")
	public Class2_Sub1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class2_Sub1 arg10) {
		super(arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, false, Static47.method777(arg1, arg0));
		this.aClass2_Sub1_2 = arg10;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Z)I")
	@Override
	public int method6031() {
		return 0;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(ILclient!za;)V")
	@Override
	public void method6021(@OriginalArg(1) Class200 arg0) {
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(I)I")
	@Override
	public int method6035() {
		return 0;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!za;IIILclient!ps;IZ)V")
	@Override
	public void method6023(@OriginalArg(0) Class200 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class2 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(BLclient!za;)V")
	@Override
	public void method6036(@OriginalArg(1) Class200 arg0) {
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method6039() {
		return false;
	}

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "(I)V")
	@Override
	public void method6041() {
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!za;B)V")
	@Override
	public void method6040(@OriginalArg(0) Class200 arg0) {
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!za;III)Z")
	@Override
	public boolean method6019(@OriginalArg(0) Class200 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "(I)V")
	@Override
	public void method6022() {
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)I")
	@Override
	public int method6034() {
		return 0;
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(ILclient!za;)Lclient!hp;")
	@Override
	public Class88_Sub2 method6025(@OriginalArg(1) Class200 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method6024() {
		return false;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!za;IZ)Lclient!e;")
	@Override
	public Class57 method6038(@OriginalArg(0) Class200 arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)I")
	@Override
	public int method6037() {
		return 0;
	}
}
