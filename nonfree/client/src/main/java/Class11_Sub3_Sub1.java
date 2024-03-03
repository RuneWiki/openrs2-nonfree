import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public final class Class11_Sub3_Sub1 extends Class11_Sub3 implements Interface6 {

	@OriginalMember(owner = "client!eq", name = "t", descriptor = "Z")
	public static boolean aBoolean133 = false;

	@OriginalMember(owner = "client!eq", name = "u", descriptor = "Lclient!h;")
	public static final Class89 aClass89_72 = new Class89(37, -2);

	@OriginalMember(owner = "client!eq", name = "D", descriptor = "[I")
	public static int[] anIntArray122 = new int[2];

	@OriginalMember(owner = "client!eq", name = "G", descriptor = "I")
	public static int anInt1868 = 0;

	@OriginalMember(owner = "client!eq", name = "C", descriptor = "Lclient!cj;")
	public Class11_Sub3 aClass11_Sub3_1;

	@OriginalMember(owner = "client!eq", name = "<init>", descriptor = "(IIIIILclient!cj;)V", line = 19)
	public Class11_Sub3_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class11_Sub3 arg5) {
		super(arg2, arg3, arg4, 0, 0, 0, Static54.method1634(arg1, arg0));
		this.aClass11_Sub3_1 = arg5;
	}

	@OriginalMember(owner = "client!eq", name = "h", descriptor = "(I)I", line = 8)
	@Override
	public int method5749() {
		return 0;
	}

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "(Lclient!wm;B)Lclient!nf;", line = 27)
	@Override
	public Class12_Sub4 method6074(@OriginalArg(0) Class19 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lclient!wm;I)V", line = 38)
	@Override
	public void method6084(@OriginalArg(0) Class19 arg0) {
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Z)Z", line = 52)
	@Override
	public boolean method6087() {
		return false;
	}

	@OriginalMember(owner = "client!eq", name = "c", descriptor = "(I)I", line = 64)
	@Override
	public int method6085() {
		return 0;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(ILclient!wm;I)Lclient!gn;", line = 76)
	@Override
	public Class31 method6089(@OriginalArg(0) int arg0, @OriginalArg(1) Class19 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "(I)V", line = 89)
	@Override
	public void method6083() {
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lclient!wm;B)V", line = 99)
	@Override
	public void method6071(@OriginalArg(0) Class19 arg0) {
	}

	@OriginalMember(owner = "client!eq", name = "d", descriptor = "(I)I", line = 116)
	@Override
	public int method6086() {
		return 0;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(I)I", line = 128)
	@Override
	public int method6082() {
		return 0;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIBLclient!wm;)Z", line = 140)
	@Override
	public boolean method6069(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class19 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(BLclient!wm;)V", line = 151)
	@Override
	public void method6088(@OriginalArg(1) Class19 arg0) {
	}
}
