import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public final class Class24_Sub1_Sub2 extends Class24_Sub1 implements Interface10 {

	@OriginalMember(owner = "client!bt", name = "D", descriptor = "Lclient!ne;")
	public Class24_Sub1 aClass24_Sub1_3;

	@OriginalMember(owner = "client!bt", name = "<init>", descriptor = "(IIIIILclient!ne;)V")
	public Class24_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class24_Sub1 arg5) {
		super(arg2, arg3, arg4, 0, 0, 0, Static277.method3884(arg1, arg0));
		this.aClass24_Sub1_3 = arg5;
	}

	@OriginalMember(owner = "client!bt", name = "d", descriptor = "(I)I")
	@Override
	public int method5706() {
		return 0;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Z)I")
	@Override
	public int method5702() {
		return 0;
	}

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "(B)I")
	@Override
	public int method3930() {
		return 0;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(ZLclient!za;II)Z")
	@Override
	public boolean method5691(@OriginalArg(1) Class50 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5701() {
		return false;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(I)V")
	@Override
	public void method5700() {
	}

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "(I)I")
	@Override
	public int method5705() {
		return 0;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lclient!za;Z)V")
	@Override
	public void method5699(@OriginalArg(0) Class50 arg0) {
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(Lclient!za;I)Lclient!nd;")
	@Override
	public Class40_Sub5 method5686(@OriginalArg(0) Class50 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lclient!za;I)V")
	@Override
	public void method5704(@OriginalArg(0) Class50 arg0) {
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(ILclient!za;I)Lclient!e;")
	@Override
	public Class63 method5703(@OriginalArg(1) Class50 arg0, @OriginalArg(2) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(BLclient!za;)V")
	@Override
	public void method5685(@OriginalArg(1) Class50 arg0) {
	}
}
