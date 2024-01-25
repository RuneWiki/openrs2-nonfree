import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public final class Class6_Sub3_Sub3 extends Class6_Sub3 implements Interface11 {

	@OriginalMember(owner = "client!wb", name = "z", descriptor = "Lclient!jo;")
	public Class6_Sub3 aClass6_Sub3_3;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(IIIIILclient!jo;)V")
	public Class6_Sub3_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class6_Sub3 arg5) {
		super(arg2, arg3, arg4, 0, 0, 0, Static305.method4208(arg1, arg0));
		this.aClass6_Sub3_3 = arg5;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ILclient!qa;B)Lclient!c;")
	@Override
	public Class7 method5646(@OriginalArg(0) int arg0, @OriginalArg(1) Class30 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "(I)I")
	@Override
	public int method5641() {
		return 0;
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "(B)V")
	@Override
	public void method5647() {
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method5642(@OriginalArg(1) Class30 arg0) {
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)I")
	@Override
	public int method5649() {
		return 0;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIILclient!qa;)Z")
	@Override
	public boolean method5631(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class30 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5645() {
		return false;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)I")
	@Override
	public int method5648() {
		return 0;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!qa;I)Lclient!pj;")
	@Override
	public Class41_Sub6 method5630(@OriginalArg(0) Class30 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(BLclient!qa;)V")
	@Override
	public void method5637(@OriginalArg(1) Class30 arg0) {
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)I")
	@Override
	public int method5644() {
		return 0;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(BLclient!qa;)V")
	@Override
	public void method5643(@OriginalArg(1) Class30 arg0) {
	}
}
