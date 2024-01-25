import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public final class Class4_Sub3_Sub1 extends Class4_Sub3 implements Interface18 {

	@OriginalMember(owner = "client!ko", name = "x", descriptor = "Lclient!ap;")
	public Class4_Sub3 aClass4_Sub3_1;

	@OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(IIILclient!ap;)V")
	public Class4_Sub3_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class4_Sub3 arg3) {
		super(arg0, arg1, arg2, arg3.aShort76, false, false);
		this.aClass4_Sub3_1 = arg3;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(ILclient!oa;)Lclient!ww;")
	@Override
	public Class98_Sub8 method7788(@OriginalArg(1) Class14 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(ZLclient!oa;Lclient!nt;IIII)V")
	@Override
	public void method7787(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class14 arg1, @OriginalArg(2) Class4 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(B)I")
	@Override
	public int method6265() {
		return 0;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lclient!oa;B)V")
	@Override
	public void method6270(@OriginalArg(0) Class14 arg0) {
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(I)V")
	@Override
	public void method6266() {
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(I)I")
	@Override
	public int method6268() {
		return 0;
	}

	@OriginalMember(owner = "client!ko", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7785() {
		return false;
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(Lclient!oa;B)V")
	@Override
	public void method7786(@OriginalArg(0) Class14 arg0) {
	}

	@OriginalMember(owner = "client!ko", name = "c", descriptor = "(B)V")
	@Override
	public void method7782() {
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lclient!oa;BI)Lclient!ba;")
	@Override
	public Class20 method6269(@OriginalArg(0) Class14 arg0, @OriginalArg(2) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(B)I")
	@Override
	public int method6272() {
		return 0;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method6267(@OriginalArg(0) Class14 arg0) {
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6271() {
		return false;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(BILclient!oa;I)Z")
	@Override
	public boolean method7784(@OriginalArg(1) int arg0, @OriginalArg(2) Class14 arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(Lclient!oa;I)Lclient!qt;")
	@Override
	public Class277 method7781(@OriginalArg(0) Class14 arg0) {
		return this.aClass4_Sub3_1.method7781(arg0);
	}
}
