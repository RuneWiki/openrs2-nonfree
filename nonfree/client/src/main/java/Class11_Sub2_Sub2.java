import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public final class Class11_Sub2_Sub2 extends Class11_Sub2 implements Interface6 {

	@OriginalMember(owner = "client!ca", name = "D", descriptor = "I")
	public static int anInt948 = 1;

	@OriginalMember(owner = "client!ca", name = "y", descriptor = "Lclient!gd;")
	public static final Class79 aClass79_24 = new Class79("glow1:", "leuchten1:", "brillant1:", "brilho1:");

	@OriginalMember(owner = "client!ca", name = "H", descriptor = "Lclient!el;")
	public Class11_Sub2 aClass11_Sub2_1;

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(IIILclient!el;)V", line = 14)
	public Class11_Sub2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class11_Sub2 arg3) {
		super(arg0, arg1, arg2, false, false);
		this.aClass11_Sub2_1 = arg3;
	}

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "(I)I", line = 3)
	@Override
	public int method6085() {
		return 0;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lclient!wm;I)V", line = 22)
	@Override
	public void method6084(@OriginalArg(0) Class19 arg0) {
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lclient!wm;B)V", line = 32)
	@Override
	public void method6071(@OriginalArg(0) Class19 arg0) {
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)V", line = 42)
	@Override
	public void method6083() {
	}

	@OriginalMember(owner = "client!ca", name = "e", descriptor = "(I)V", line = 64)
	@Override
	public void method6070() {
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(Lclient!wm;B)Lclient!nf;", line = 89)
	@Override
	public Class12_Sub4 method6074(@OriginalArg(0) Class19 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Z)Z", line = 100)
	@Override
	public boolean method6087() {
		return false;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)I", line = 112)
	@Override
	public int method6082() {
		return 0;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIILclient!wm;ZLclient!hp;Z)V", line = 123)
	@Override
	public void method6076(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class19 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class11 arg5) {
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(BLclient!wm;)V", line = 140)
	@Override
	public void method6088(@OriginalArg(1) Class19 arg0) {
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIBLclient!wm;)Z", line = 171)
	@Override
	public boolean method6069(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class19 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!ca", name = "g", descriptor = "(I)Z", line = 182)
	@Override
	public boolean method6077() {
		return false;
	}

	@OriginalMember(owner = "client!ca", name = "d", descriptor = "(I)I", line = 194)
	@Override
	public int method6086() {
		return 0;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILclient!wm;I)Lclient!gn;", line = 205)
	@Override
	public Class31 method6089(@OriginalArg(0) int arg0, @OriginalArg(1) Class19 arg1) {
		return null;
	}
}
