import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public final class Class1_Sub1_Sub3 extends Class1_Sub1 implements Interface2 {

	@OriginalMember(owner = "client!wp", name = "v", descriptor = "Lclient!a;")
	public Class1_Sub1 aClass1_Sub1_1;

	@OriginalMember(owner = "client!wp", name = "<init>", descriptor = "(IIIIILclient!a;)V")
	public Class1_Sub1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class1_Sub1 arg5) {
		super(arg2, arg3, arg4, Static55.method922(arg1, arg0));
		this.aClass1_Sub1_1 = arg5;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(ILclient!vc;II)Z")
	@Override
	public boolean method5642(@OriginalArg(1) Class63 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!wp", name = "d", descriptor = "(B)V")
	@Override
	public void method5643() {
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(ZLclient!vc;)V")
	@Override
	public void method5649(@OriginalArg(1) Class63 arg0) {
	}

	@OriginalMember(owner = "client!wp", name = "b", descriptor = "(I)V")
	@Override
	public void method5653() {
	}

	@OriginalMember(owner = "client!wp", name = "b", descriptor = "(ZLclient!vc;)V")
	@Override
	public void method5644(@OriginalArg(1) Class63 arg0) {
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(Lclient!vc;I)Lclient!ep;")
	@Override
	public Class10_Sub3 method5640(@OriginalArg(0) Class63 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(BILclient!vc;)Lclient!n;")
	@Override
	public Class66 method5652(@OriginalArg(1) int arg0, @OriginalArg(2) Class63 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(Lclient!vc;B)V")
	@Override
	public void method5648(@OriginalArg(0) Class63 arg0) {
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(I)I")
	@Override
	public int method5651() {
		return 0;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(ZILclient!vc;IILclient!uq;I)V")
	@Override
	public void method5637(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class63 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class1 arg4, @OriginalArg(6) int arg5) {
	}

	@OriginalMember(owner = "client!wp", name = "b", descriptor = "(B)I")
	@Override
	public int method5654() {
		return 0;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(B)I")
	@Override
	public int method5650() {
		return 0;
	}

	@OriginalMember(owner = "client!wp", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5641() {
		return false;
	}

	@OriginalMember(owner = "client!wp", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method5655() {
		return false;
	}
}
