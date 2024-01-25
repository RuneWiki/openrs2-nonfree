import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public final class Class1_Sub2_Sub1 extends Class1_Sub2 implements Interface2 {

	@OriginalMember(owner = "client!ar", name = "C", descriptor = "Lclient!ip;")
	public Class1_Sub2 aClass1_Sub2_1;

	@OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(IIIIILclient!ip;)V")
	public Class1_Sub2_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class1_Sub2 arg5) {
		super(arg2, arg3, arg4, 0, 0, 0, Static265.method4084(arg1, arg0));
		this.aClass1_Sub2_1 = arg5;
	}

	@OriginalMember(owner = "client!ar", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method5655() {
		return false;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(Lclient!vc;B)V")
	@Override
	public void method5648(@OriginalArg(0) Class63 arg0) {
	}

	@OriginalMember(owner = "client!ar", name = "e", descriptor = "(I)I")
	@Override
	public int method5442() {
		return 0;
	}

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "(ZLclient!vc;)V")
	@Override
	public void method5644(@OriginalArg(1) Class63 arg0) {
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(ZLclient!vc;)V")
	@Override
	public void method5649(@OriginalArg(1) Class63 arg0) {
	}

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "(B)I")
	@Override
	public int method5654() {
		return 0;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(ILclient!vc;II)Z")
	@Override
	public boolean method5642(@OriginalArg(1) Class63 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(B)I")
	@Override
	public int method5650() {
		return 0;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(BILclient!vc;)Lclient!n;")
	@Override
	public Class66 method5652(@OriginalArg(1) int arg0, @OriginalArg(2) Class63 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "(I)V")
	@Override
	public void method5653() {
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(Lclient!vc;I)Lclient!ep;")
	@Override
	public Class10_Sub3 method5640(@OriginalArg(0) Class63 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(I)I")
	@Override
	public int method5651() {
		return 0;
	}
}
