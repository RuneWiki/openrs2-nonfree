import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ow")
public final class Class4_Sub2_Sub3 extends Class4_Sub2 implements Interface18 {

	@OriginalMember(owner = "client!ow", name = "J", descriptor = "[I")
	public static final int[] anIntArray497 = new int[32];

	@OriginalMember(owner = "client!ow", name = "C", descriptor = "Lclient!uo;")
	public Class4_Sub2 aClass4_Sub2_1;

	static {
		@Pc(4) int local4 = 2;
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			anIntArray497[local6] = local4 - 1;
			local4 += local4;
		}
	}

	@OriginalMember(owner = "client!ow", name = "<init>", descriptor = "(IIIIILclient!uo;)V")
	public Class4_Sub2_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class4_Sub2 arg5) {
		super(arg2, arg3, arg4, 0, 0, 0, Static396.method7544(arg1, arg0));
		this.aClass4_Sub2_1 = arg5;
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(I)V")
	@Override
	public void method6266() {
	}

	@OriginalMember(owner = "client!ow", name = "d", descriptor = "(B)I")
	@Override
	public int method5640() {
		return 0;
	}

	@OriginalMember(owner = "client!ow", name = "b", descriptor = "(I)I")
	@Override
	public int method6268() {
		return 0;
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(Lclient!oa;B)V")
	@Override
	public void method6270(@OriginalArg(0) Class14 arg0) {
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(BILclient!oa;I)Z")
	@Override
	public boolean method7784(@OriginalArg(1) int arg0, @OriginalArg(2) Class14 arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(ILclient!oa;)Lclient!ww;")
	@Override
	public Class98_Sub8 method7788(@OriginalArg(1) Class14 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ow", name = "b", descriptor = "(Lclient!oa;B)V")
	@Override
	public void method7786(@OriginalArg(0) Class14 arg0) {
	}

	@OriginalMember(owner = "client!ow", name = "b", descriptor = "(Lclient!oa;I)Lclient!qt;")
	@Override
	public Class277 method7781(@OriginalArg(0) Class14 arg0) {
		return this.aClass4_Sub2_1.method7781(arg0);
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method6267(@OriginalArg(0) Class14 arg0) {
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(B)I")
	@Override
	public int method6265() {
		return 0;
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(Lclient!oa;BI)Lclient!ba;")
	@Override
	public Class20 method6269(@OriginalArg(0) Class14 arg0, @OriginalArg(2) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6271() {
		return false;
	}

	@OriginalMember(owner = "client!ow", name = "b", descriptor = "(B)I")
	@Override
	public int method6272() {
		return 0;
	}
}
