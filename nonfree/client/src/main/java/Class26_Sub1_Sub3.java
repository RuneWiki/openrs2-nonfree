import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public final class Class26_Sub1_Sub3 extends Class26_Sub1 implements Interface6 {

	@OriginalMember(owner = "client!kt", name = "x", descriptor = "Lclient!fq;")
	public Class26_Sub1 aClass26_Sub1_1;

	@OriginalMember(owner = "client!kt", name = "<init>", descriptor = "(IIIIILclient!fq;)V")
	public Class26_Sub1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class26_Sub1 arg5) {
		super(arg2, arg3, arg4, Static52.method874(arg0, arg1));
		this.aClass26_Sub1_1 = arg5;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(I)I")
	@Override
	public int method4666() {
		return 0;
	}

	@OriginalMember(owner = "client!kt", name = "b", descriptor = "(ILclient!qa;)V")
	@Override
	public void method4668(@OriginalArg(1) Class109 arg0) {
	}

	@OriginalMember(owner = "client!kt", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method4671() {
		return false;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5512() {
		return false;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(Lclient!qa;I)Lclient!ip;")
	@Override
	public Class39_Sub4 method5520(@OriginalArg(0) Class109 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(IILclient!qa;)Lclient!c;")
	@Override
	public Class37 method4669(@OriginalArg(1) int arg0, @OriginalArg(2) Class109 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(Lclient!qa;III)Z")
	@Override
	public boolean method5517(@OriginalArg(0) Class109 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method4667(@OriginalArg(1) Class109 arg0) {
	}

	@OriginalMember(owner = "client!kt", name = "e", descriptor = "(I)V")
	@Override
	public void method5516() {
	}

	@OriginalMember(owner = "client!kt", name = "b", descriptor = "(B)I")
	@Override
	public int method4670() {
		return 0;
	}

	@OriginalMember(owner = "client!kt", name = "c", descriptor = "(ILclient!qa;)V")
	@Override
	public void method5519(@OriginalArg(1) Class109 arg0) {
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(B)I")
	@Override
	public int method4665() {
		return 0;
	}

	@OriginalMember(owner = "client!kt", name = "c", descriptor = "(I)V")
	@Override
	public void method4672() {
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(IILclient!co;ILclient!qa;ZZ)V")
	@Override
	public void method5514(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class26 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class109 arg4, @OriginalArg(5) boolean arg5) {
	}
}
