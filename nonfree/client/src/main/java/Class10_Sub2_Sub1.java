import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public final class Class10_Sub2_Sub1 extends Class10_Sub2 implements Interface17 {

	@OriginalMember(owner = "client!cq", name = "C", descriptor = "Lclient!dk;")
	public Class10_Sub2 aClass10_Sub2_1;

	@OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(IIIIILclient!dk;)V")
	public Class10_Sub2_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class10_Sub2 arg5) {
		super(arg2, arg3, arg4, Static348.method5170(arg1, arg0));
		this.aClass10_Sub2_1 = arg5;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7730() {
		return false;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(ILclient!oa;ILclient!ni;ZZI)V")
	@Override
	public void method7732(@OriginalArg(0) int arg0, @OriginalArg(1) Class66 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class10 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5) {
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(BILclient!oa;I)Z")
	@Override
	public boolean method7728(@OriginalArg(1) int arg0, @OriginalArg(2) Class66 arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(BLclient!oa;)Lclient!pe;")
	@Override
	public Class26_Sub6 method7727(@OriginalArg(1) Class66 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(Lclient!oa;BI)Lclient!ba;")
	@Override
	public Class9 method7740(@OriginalArg(0) Class66 arg0, @OriginalArg(2) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(Z)V")
	@Override
	public void method7741() {
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method7746(@OriginalArg(0) Class66 arg0) {
	}

	@OriginalMember(owner = "client!cq", name = "b", descriptor = "(B)I")
	@Override
	public int method7742() {
		return 0;
	}

	@OriginalMember(owner = "client!cq", name = "c", descriptor = "(Z)I")
	@Override
	public int method7744() {
		return 0;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(Lclient!oa;Z)V")
	@Override
	public void method7729(@OriginalArg(0) Class66 arg0) {
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7739() {
		return false;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(Lclient!oa;B)V")
	@Override
	public void method7745(@OriginalArg(0) Class66 arg0) {
	}

	@OriginalMember(owner = "client!cq", name = "b", descriptor = "(Z)I")
	@Override
	public int method7743() {
		return 0;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(ILclient!oa;)Lclient!dd;")
	@Override
	public Class68 method7731(@OriginalArg(1) Class66 arg0) {
		return this.aClass10_Sub2_1.method7731(arg0);
	}

	@OriginalMember(owner = "client!cq", name = "c", descriptor = "(B)V")
	@Override
	public void method7733() {
	}
}
