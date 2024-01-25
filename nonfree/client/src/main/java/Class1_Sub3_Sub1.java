import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public final class Class1_Sub3_Sub1 extends Class1_Sub3 implements Interface8 {

	@OriginalMember(owner = "client!ed", name = "G", descriptor = "Lclient!kp;")
	public final Class1_Sub3 aClass1_Sub3_3;

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(IIIIILclient!kp;)V")
	public Class1_Sub3_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class1_Sub3 arg5) {
		super(arg2, arg3, arg4, 0, 0, 0, Static351.method5658(arg0, arg1));
		this.aClass1_Sub3_3 = arg5;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!dr;IB)Lclient!wp;")
	@Override
	public Class49 method5499(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!ed", name = "d", descriptor = "(Lclient!dr;I)Lclient!kq;")
	@Override
	public Class57_Sub5 method5758(@OriginalArg(0) Class37 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "(B)I")
	@Override
	public int method4509() {
		return 0;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!dr;I)V")
	@Override
	public void method5500(@OriginalArg(0) Class37 arg0) {
	}

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "(Lclient!dr;I)V")
	@Override
	public void method5754(@OriginalArg(0) Class37 arg0) {
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)I")
	@Override
	public int method5501() {
		return 0;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(BLclient!dr;)V")
	@Override
	public void method5498(@OriginalArg(1) Class37 arg0) {
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Z)I")
	@Override
	public int method5502() {
		return 0;
	}

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "(I)V")
	@Override
	public void method5504() {
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5497() {
		return false;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IILclient!dr;I)Z")
	@Override
	public boolean method5757(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class37 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)I")
	@Override
	public int method5503() {
		return 0;
	}
}
