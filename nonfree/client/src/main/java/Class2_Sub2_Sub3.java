import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nm")
public final class Class2_Sub2_Sub3 extends Class2_Sub2 implements Interface2 {

	@OriginalMember(owner = "client!nm", name = "R", descriptor = "[F")
	public static final float[] aFloatArray10 = new float[16384];

	@OriginalMember(owner = "client!nm", name = "S", descriptor = "[F")
	public static final float[] aFloatArray11 = new float[16384];

	@OriginalMember(owner = "client!nm", name = "L", descriptor = "Lclient!so;")
	public Class2_Sub2 aClass2_Sub2_1;

	static {
		@Pc(13) double local13 = 3.834951969714103E-4D;
		for (@Pc(15) int local15 = 0; local15 < 16384; local15++) {
			aFloatArray10[local15] = (float) Math.sin(local13 * (double) local15);
			aFloatArray11[local15] = (float) Math.cos((double) local15 * local13);
		}
	}

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(IIIIILclient!so;)V")
	public Class2_Sub2_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class2_Sub2 arg5) {
		super(arg2, arg3, arg4, 0, 0, 0, Static282.method3473(arg1, arg0));
		this.aClass2_Sub2_1 = arg5;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lclient!za;III)Z")
	@Override
	public boolean method6019(@OriginalArg(0) Class200 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "(I)I")
	@Override
	public int method6035() {
		return 0;
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method6039() {
		return false;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(I)I")
	@Override
	public int method6034() {
		return 0;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(ILclient!za;)V")
	@Override
	public void method6021(@OriginalArg(1) Class200 arg0) {
	}

	@OriginalMember(owner = "client!nm", name = "d", descriptor = "(B)I")
	@Override
	public int method3486() {
		return 0;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(B)I")
	@Override
	public int method6037() {
		return 0;
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "(ILclient!za;)Lclient!hp;")
	@Override
	public Class88_Sub2 method6025(@OriginalArg(1) Class200 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lclient!za;B)V")
	@Override
	public void method6040(@OriginalArg(0) Class200 arg0) {
	}

	@OriginalMember(owner = "client!nm", name = "c", descriptor = "(I)V")
	@Override
	public void method6041() {
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lclient!za;IZ)Lclient!e;")
	@Override
	public Class57 method6038(@OriginalArg(0) Class200 arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(BLclient!za;)V")
	@Override
	public void method6036(@OriginalArg(1) Class200 arg0) {
	}
}
