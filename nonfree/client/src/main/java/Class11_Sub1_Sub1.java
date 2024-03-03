import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public final class Class11_Sub1_Sub1 extends Class11_Sub1 implements Interface6 {

	@OriginalMember(owner = "client!ao", name = "D", descriptor = "[[I")
	public static final int[][] anIntArrayArray4 = new int[128][128];

	@OriginalMember(owner = "client!ao", name = "B", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_18 = new Class145(64, -1);

	@OriginalMember(owner = "client!ao", name = "v", descriptor = "Lclient!gq;")
	public Class11_Sub1 aClass11_Sub1_1;

	@OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(IIIIILclient!gq;)V", line = 133)
	public Class11_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class11_Sub1 arg5) {
		super(arg2, arg3, arg4, Static10.method238(arg1, arg0));
		this.aClass11_Sub1_1 = arg5;
	}

	@OriginalMember(owner = "client!ao", name = "g", descriptor = "(I)Z", line = 17)
	@Override
	public boolean method6077() {
		return false;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!wm;B)V", line = 28)
	@Override
	public void method6071(@OriginalArg(0) Class19 arg0) {
	}

	@OriginalMember(owner = "client!ao", name = "e", descriptor = "(I)V", line = 41)
	@Override
	public void method6070() {
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(ILclient!wm;I)Lclient!gn;", line = 51)
	@Override
	public Class31 method6089(@OriginalArg(0) int arg0, @OriginalArg(1) Class19 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(I)V", line = 67)
	@Override
	public void method6083() {
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIILclient!wm;ZLclient!hp;Z)V", line = 79)
	@Override
	public void method6076(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class19 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class11 arg5) {
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)I", line = 89)
	@Override
	public int method6082() {
		return 0;
	}

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "(I)I", line = 111)
	@Override
	public int method6085() {
		return 0;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIBLclient!wm;)Z", line = 122)
	@Override
	public boolean method6069(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class19 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(Lclient!wm;B)Lclient!nf;", line = 142)
	@Override
	public Class12_Sub4 method6074(@OriginalArg(0) Class19 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Z)Z", line = 153)
	@Override
	public boolean method6087() {
		return false;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(BLclient!wm;)V", line = 166)
	@Override
	public void method6088(@OriginalArg(1) Class19 arg0) {
	}

	@OriginalMember(owner = "client!ao", name = "d", descriptor = "(I)I", line = 176)
	@Override
	public int method6086() {
		return 0;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!wm;I)V", line = 205)
	@Override
	public void method6084(@OriginalArg(0) Class19 arg0) {
	}
}
