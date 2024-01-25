import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public final class Class8_Sub5_Sub1 extends Class8_Sub5 implements Interface4 {

	@OriginalMember(owner = "client!hh", name = "A", descriptor = "Lclient!e;")
	public Class8_Sub5 aClass8_Sub5_3;

	static {
		new Class15("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n'êtes pas autorisé à expulser cet utilisateur.", "Você não tem permissão para expulsar este usuário.");
	}

	@OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(IIIIILclient!e;)V")
	public Class8_Sub5_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class8_Sub5 arg5) {
		super(arg2, arg3, arg4, 0, 0, 0, Static277.method3668(arg0, arg1));
		this.aClass8_Sub5_3 = arg5;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5602() {
		return false;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILclient!ya;)V")
	@Override
	public void method5601(@OriginalArg(1) Class135 arg0) {
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Z)I")
	@Override
	public int method5600() {
		return 0;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZLclient!ya;)Lclient!lo;")
	@Override
	public Class20_Sub5 method5880(@OriginalArg(1) Class135 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)I")
	@Override
	public int method5603() {
		return 0;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IILclient!ya;)Lclient!t;")
	@Override
	public Class116 method5604(@OriginalArg(0) int arg0, @OriginalArg(2) Class135 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "(I)I")
	@Override
	public int method5606() {
		return 0;
	}

	@OriginalMember(owner = "client!hh", name = "d", descriptor = "(I)V")
	@Override
	public void method5607() {
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILclient!ya;II)Z")
	@Override
	public boolean method5878(@OriginalArg(1) Class135 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "(Z)I")
	@Override
	public int method4114() {
		return 0;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lclient!ya;I)V")
	@Override
	public void method5877(@OriginalArg(0) Class135 arg0) {
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(ILclient!ya;)V")
	@Override
	public void method5605(@OriginalArg(1) Class135 arg0) {
	}
}
