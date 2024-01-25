import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public final class Class11_Sub1_Sub2 extends Class11_Sub1 implements Interface12 {

	@OriginalMember(owner = "client!fi", name = "u", descriptor = "Lclient!ib;")
	public Class11_Sub1 aClass11_Sub1_1;

	static {
		new Class21("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n'êtes pas autorisé à expulser des utilisateurs de ce canal.", "Você não tem permissão para expulsar usuários neste canal.");
	}

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(IIILclient!ib;)V")
	public Class11_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class11_Sub1 arg3) {
		super(arg0, arg1, arg2, arg3.aShort107, false, false);
		this.aClass11_Sub1_1 = arg3;
	}

	@OriginalMember(owner = "client!fi", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method6301() {
		return false;
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(B)I")
	@Override
	public int method6320() {
		return 0;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(BLclient!qa;)V")
	@Override
	public void method6321(@OriginalArg(1) Class30 arg0) {
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method6314(@OriginalArg(0) Class30 arg0) {
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(B)I")
	@Override
	public int method6318() {
		return 0;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Z)V")
	@Override
	public void method6307() {
	}

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method6319() {
		return false;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIILclient!qa;)Z")
	@Override
	public boolean method6308(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class30 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILclient!qa;I)Lclient!ka;")
	@Override
	public Class57 method6315(@OriginalArg(1) Class30 arg0, @OriginalArg(2) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIILclient!qa;ZLclient!ee;Z)V")
	@Override
	public void method6306(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class30 arg3, @OriginalArg(5) Class11 arg4, @OriginalArg(6) boolean arg5) {
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)I")
	@Override
	public int method6316() {
		return 0;
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)V")
	@Override
	public void method6317() {
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method6303(@OriginalArg(0) Class30 arg0) {
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(Lclient!qa;B)Lclient!em;")
	@Override
	public Class64 method6305(@OriginalArg(0) Class30 arg0) {
		return this.aClass11_Sub1_1.method6305(arg0);
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILclient!qa;)Lclient!nj;")
	@Override
	public Class71_Sub3 method6304(@OriginalArg(1) Class30 arg0) {
		return null;
	}
}
