import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public final class Class11_Sub5_Sub6 extends Class11_Sub5 implements Interface6 {

	@OriginalMember(owner = "client!vf", name = "N", descriptor = "Z")
	public static boolean aBoolean464 = true;

	@OriginalMember(owner = "client!vf", name = "T", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_239;

	@OriginalMember(owner = "client!vf", name = "U", descriptor = "Lclient!ld;")
	public static final Class135 aClass135_39;

	@OriginalMember(owner = "client!vf", name = "W", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_240;

	@OriginalMember(owner = "client!vf", name = "S", descriptor = "Lclient!hb;")
	public Class11_Sub5 aClass11_Sub5_2;

	static {
		new Class79("Unable to delete friend - system busy.", "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.", "Impossible de supprimer un ami - système occupé.", "Não foi possível excluir o amigo. O sistema está ocupado.");
		aClass145_239 = new Class145(67, 4);
		aClass135_39 = new Class135();
		aClass145_240 = new Class145(37, 6);
	}

	@OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(IIIIIIIIIILclient!hb;)V", line = 161)
	public Class11_Sub5_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class11_Sub5 arg10) {
		super(arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, false, Static331.method5957(arg1, arg0));
		this.aClass11_Sub5_2 = arg10;
	}

	@OriginalMember(owner = "client!vf", name = "e", descriptor = "(I)V", line = 6)
	@Override
	public void method6070() {
	}

	@OriginalMember(owner = "client!vf", name = "d", descriptor = "(I)I", line = 16)
	@Override
	public int method6086() {
		return 0;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(BLclient!wm;)V", line = 27)
	@Override
	public void method6088(@OriginalArg(1) Class19 arg0) {
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Z)Z", line = 53)
	@Override
	public boolean method6087() {
		return false;
	}

	@OriginalMember(owner = "client!vf", name = "h", descriptor = "(I)I", line = 64)
	@Override
	public int method6081() {
		return 0;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(ILclient!wm;I)Lclient!gn;", line = 80)
	@Override
	public Class31 method6089(@OriginalArg(0) int arg0, @OriginalArg(1) Class19 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIILclient!wm;ZLclient!hp;Z)V", line = 127)
	@Override
	public void method6076(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class19 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class11 arg5) {
	}

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "(I)I", line = 137)
	@Override
	public int method6085() {
		return 0;
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(Lclient!wm;B)Lclient!nf;", line = 150)
	@Override
	public Class12_Sub4 method6074(@OriginalArg(0) Class19 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(I)V", line = 169)
	@Override
	public void method6083() {
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!wm;I)V", line = 186)
	@Override
	public void method6084(@OriginalArg(0) Class19 arg0) {
	}

	@OriginalMember(owner = "client!vf", name = "g", descriptor = "(I)Z", line = 196)
	@Override
	public boolean method6077() {
		return false;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!wm;B)V", line = 404)
	@Override
	public void method6071(@OriginalArg(0) Class19 arg0) {
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIBLclient!wm;)Z", line = 416)
	@Override
	public boolean method6069(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class19 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)I", line = 435)
	@Override
	public int method6082() {
		return 0;
	}
}
