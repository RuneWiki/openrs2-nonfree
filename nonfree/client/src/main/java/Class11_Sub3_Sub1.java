import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!de")
public final class Class11_Sub3_Sub1 extends Class11_Sub3 {

	@OriginalMember(owner = "client!de", name = "s", descriptor = "I")
	public int anInt1363;

	@OriginalMember(owner = "client!de", name = "v", descriptor = "I")
	public int anInt1366;

	@OriginalMember(owner = "client!de", name = "w", descriptor = "I")
	public int anInt1367;

	@OriginalMember(owner = "client!de", name = "B", descriptor = "I")
	public int anInt1372;

	@OriginalMember(owner = "client!de", name = "t", descriptor = "I")
	public int anInt1364 = -1;

	@OriginalMember(owner = "client!de", name = "C", descriptor = "I")
	public int anInt1373 = -1;

	static {
		new Class106("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...");
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!fp;III)Z")
	@Override
	public boolean method5914(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class129 local6 = arg0.method4634();
		local6.method5774(super.anInt1351, super.anInt1352, super.anInt1359);
		@Pc(39) Class3 local39 = Static243.aClass220_2.method5972(this.anInt1366).method897(-1, null, arg0, this.anInt1372, 0, 0, null, 65536);
		if (local39 != null && local39.method1283(arg2, arg1, local6, true)) {
			return true;
		}
		if (this.anInt1364 != -1) {
			local39 = Static243.aClass220_2.method5972(this.anInt1364).method897(-1, null, arg0, this.anInt1367, 0, 0, null, 65536);
			if (local39 != null && local39.method1283(arg2, arg1, local6, true)) {
				return true;
			}
		}
		if (this.anInt1373 != -1) {
			local39 = Static243.aClass220_2.method5972(this.anInt1373).method897(-1, null, arg0, this.anInt1363, 0, 0, null, 65536);
			if (local39 != null && local39.method1283(arg2, arg1, local6, true)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ILclient!fp;)Lclient!uq;")
	@Override
	public Class32_Sub7 method5909(@OriginalArg(1) Class63 arg0) {
		@Pc(11) Class129 local11 = arg0.method4634();
		local11.method5774(super.anInt1351, super.anInt1352, super.anInt1359);
		@Pc(23) Class32_Sub7 local23 = Static67.method1550(3);
		@Pc(45) Class3 local45;
		if (this.anInt1373 != -1) {
			local45 = Static243.aClass220_2.method5972(this.anInt1373).method897(-1, null, arg0, this.anInt1363, 0, 0, null, 1024);
			if (local45 != null) {
				local45.method1242(local11, local23.aClass32_Sub4Array1[2], 0);
			}
		}
		if (this.anInt1364 != -1) {
			local45 = Static243.aClass220_2.method5972(this.anInt1364).method897(-1, null, arg0, this.anInt1367, 0, 0, null, 1024);
			if (local45 != null) {
				local45.method1242(local11, local23.aClass32_Sub4Array1[1], 0);
			}
		}
		local45 = Static243.aClass220_2.method5972(this.anInt1366).method897(-1, null, arg0, this.anInt1372, 0, 0, null, 1024);
		if (local45 != null) {
			local45.method1242(local11, local23.aClass32_Sub4Array1[0], 0);
		}
		return local23;
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(ILclient!fp;)V")
	@Override
	public void method5912(@OriginalArg(1) Class63 arg0) {
	}
}
