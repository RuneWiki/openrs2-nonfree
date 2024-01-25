import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public final class Class26_Sub3_Sub3 extends Class26_Sub3 implements Interface6 {

	@OriginalMember(owner = "client!qq", name = "B", descriptor = "Lclient!fk;")
	public Class26_Sub3 aClass26_Sub3_1;

	@OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(IIIIILclient!fk;)V")
	public Class26_Sub3_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class26_Sub3 arg5) {
		super(arg2, arg3, arg4, 0, 0, 0, Static174.method2719(arg1, arg0));
		this.aClass26_Sub3_1 = arg5;
	}

	@OriginalMember(owner = "client!qq", name = "g", descriptor = "(I)I")
	@Override
	public int method4627() {
		return 0;
	}

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "(ILclient!qa;)V")
	@Override
	public void method4668(@OriginalArg(1) Class109 arg0) {
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method4667(@OriginalArg(1) Class109 arg0) {
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IILclient!qa;)Lclient!c;")
	@Override
	public Class37 method4669(@OriginalArg(1) int arg0, @OriginalArg(2) Class109 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!qq", name = "c", descriptor = "(I)V")
	@Override
	public void method4672() {
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lclient!qa;III)Z")
	@Override
	public boolean method5517(@OriginalArg(0) Class109 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lclient!qa;I)Lclient!ip;")
	@Override
	public Class39_Sub4 method5520(@OriginalArg(0) Class109 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(B)I")
	@Override
	public int method4665() {
		return 0;
	}

	@OriginalMember(owner = "client!qq", name = "c", descriptor = "(ILclient!qa;)V")
	@Override
	public void method5519(@OriginalArg(1) Class109 arg0) {
	}

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "(B)I")
	@Override
	public int method4670() {
		return 0;
	}

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method4671() {
		return false;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(I)I")
	@Override
	public int method4666() {
		return 0;
	}
}
