import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public final class Class4_Sub5_Sub2 extends Class4_Sub5 implements Interface18 {

	@OriginalMember(owner = "client!qo", name = "i", descriptor = "Lclient!ou;")
	public Class4_Sub5 aClass4_Sub5_1;

	@OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(IIIIILclient!ou;)V")
	public Class4_Sub5_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class4_Sub5 arg5) {
		super(arg2, arg3, arg4, Static587.method7797(arg1, arg0));
		this.aClass4_Sub5_1 = arg5;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lclient!oa;B)V")
	@Override
	public void method6270(@OriginalArg(0) Class14 arg0) {
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(B)I")
	@Override
	public int method6265() {
		return 0;
	}

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "(Lclient!oa;B)V")
	@Override
	public void method7786(@OriginalArg(0) Class14 arg0) {
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(I)V")
	@Override
	public void method6266() {
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6271() {
		return false;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(BILclient!oa;I)Z")
	@Override
	public boolean method7784(@OriginalArg(1) int arg0, @OriginalArg(2) Class14 arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lclient!oa;BI)Lclient!ba;")
	@Override
	public Class20 method6269(@OriginalArg(0) Class14 arg0, @OriginalArg(2) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(ZLclient!oa;Lclient!nt;IIII)V")
	@Override
	public void method7787(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class14 arg1, @OriginalArg(2) Class4 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method6267(@OriginalArg(0) Class14 arg0) {
	}

	@OriginalMember(owner = "client!qo", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7785() {
		return false;
	}

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "(I)I")
	@Override
	public int method6268() {
		return 0;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(ILclient!oa;)Lclient!ww;")
	@Override
	public Class98_Sub8 method7788(@OriginalArg(1) Class14 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "(Lclient!oa;I)Lclient!qt;")
	@Override
	public Class277 method7781(@OriginalArg(0) Class14 arg0) {
		return this.aClass4_Sub5_1.method7781(arg0);
	}

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "(B)I")
	@Override
	public int method6272() {
		return 0;
	}

	@OriginalMember(owner = "client!qo", name = "c", descriptor = "(B)V")
	@Override
	public void method7782() {
	}
}
