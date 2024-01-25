import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public final class Class4_Sub1_Sub4 extends Class4_Sub1 implements Interface18 {

	@OriginalMember(owner = "client!fo", name = "B", descriptor = "Lclient!wda;")
	public Class4_Sub1 aClass4_Sub1_1;

	@OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(IIIIIIIIIILclient!wda;)V")
	public Class4_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class4_Sub1 arg10) {
		super(arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, false, Static24.method790(arg0, arg1));
		this.aClass4_Sub1_1 = arg10;
	}

	@OriginalMember(owner = "client!fo", name = "c", descriptor = "(B)V")
	@Override
	public void method7782() {
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6271() {
		return false;
	}

	@OriginalMember(owner = "client!fo", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7785() {
		return false;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lclient!oa;B)V")
	@Override
	public void method6270(@OriginalArg(0) Class14 arg0) {
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(I)V")
	@Override
	public void method6266() {
	}

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "(I)I")
	@Override
	public int method6268() {
		return 0;
	}

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "(Lclient!oa;B)V")
	@Override
	public void method7786(@OriginalArg(0) Class14 arg0) {
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method6267(@OriginalArg(0) Class14 arg0) {
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(ZLclient!oa;Lclient!nt;IIII)V")
	@Override
	public void method7787(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class14 arg1, @OriginalArg(2) Class4 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(BILclient!oa;I)Z")
	@Override
	public boolean method7784(@OriginalArg(1) int arg0, @OriginalArg(2) Class14 arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(ILclient!oa;)Lclient!ww;")
	@Override
	public Class98_Sub8 method7788(@OriginalArg(1) Class14 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "(Lclient!oa;I)Lclient!qt;")
	@Override
	public Class277 method7781(@OriginalArg(0) Class14 arg0) {
		return this.aClass4_Sub1_1.method7781(arg0);
	}

	@OriginalMember(owner = "client!fo", name = "e", descriptor = "(I)I")
	@Override
	public int method7790() {
		return 0;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lclient!oa;BI)Lclient!ba;")
	@Override
	public Class20 method6269(@OriginalArg(0) Class14 arg0, @OriginalArg(2) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "(B)I")
	@Override
	public int method6272() {
		return 0;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(B)I")
	@Override
	public int method6265() {
		return 0;
	}
}
