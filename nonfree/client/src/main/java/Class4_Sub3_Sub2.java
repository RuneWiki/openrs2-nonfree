import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public final class Class4_Sub3_Sub2 extends Class4_Sub3 implements Interface9 {

	@OriginalMember(owner = "client!hv", name = "D", descriptor = "Lclient!pe;")
	public Class4_Sub3 aClass4_Sub3_2;

	@OriginalMember(owner = "client!hv", name = "<init>", descriptor = "(IIILclient!pe;)V")
	public Class4_Sub3_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class4_Sub3 arg3) {
		super(arg0, arg1, arg2, false, false);
		this.aClass4_Sub3_2 = arg3;
	}

	@OriginalMember(owner = "client!hv", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5905() {
		return false;
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(I)V")
	@Override
	public void method5899() {
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method5903(@OriginalArg(1) Class26 arg0) {
	}

	@OriginalMember(owner = "client!hv", name = "b", descriptor = "(ILclient!qa;)Lclient!fm;")
	@Override
	public Class38_Sub3 method5896(@OriginalArg(1) Class26 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(Lclient!qa;Z)V")
	@Override
	public void method5893(@OriginalArg(0) Class26 arg0) {
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(B)I")
	@Override
	public int method5901() {
		return 0;
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(Z)V")
	@Override
	public void method5889() {
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method5900(@OriginalArg(0) Class26 arg0) {
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(IILclient!qa;Lclient!eq;IIZ)V")
	@Override
	public void method5892(@OriginalArg(1) int arg0, @OriginalArg(2) Class26 arg1, @OriginalArg(3) Class4 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(BLclient!qa;I)Lclient!c;")
	@Override
	public Class32 method5906(@OriginalArg(1) Class26 arg0, @OriginalArg(2) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!hv", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5891() {
		return false;
	}

	@OriginalMember(owner = "client!hv", name = "c", descriptor = "(I)I")
	@Override
	public int method5904() {
		return 0;
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(IILclient!qa;I)Z")
	@Override
	public boolean method5894(@OriginalArg(1) int arg0, @OriginalArg(2) Class26 arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!hv", name = "b", descriptor = "(I)I")
	@Override
	public int method5902() {
		return 0;
	}
}
