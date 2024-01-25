import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public final class Class7_Sub4_Sub3 extends Class7_Sub4 implements Interface8 {

	@OriginalMember(owner = "client!se", name = "F", descriptor = "Lclient!eh;")
	public Class7_Sub4 aClass7_Sub4_3;

	@OriginalMember(owner = "client!se", name = "<init>", descriptor = "(IIIIILclient!eh;)V")
	public Class7_Sub4_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class7_Sub4 arg5) {
		super(arg2, arg3, arg4, Static154.method2484(arg1, arg0));
		this.aClass7_Sub4_3 = arg5;
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(B)I")
	@Override
	public int method4808() {
		return 0;
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method5276() {
		return false;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(ILclient!qa;ZLclient!to;III)V")
	@Override
	public void method5273(@OriginalArg(0) int arg0, @OriginalArg(1) Class172 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class7 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method4804(@OriginalArg(0) Class172 arg0) {
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(BLclient!qa;)V")
	@Override
	public void method5267(@OriginalArg(1) Class172 arg0) {
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!qa;II)Lclient!c;")
	@Override
	public Class9 method4805(@OriginalArg(0) Class172 arg0, @OriginalArg(2) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!se", name = "c", descriptor = "(B)V")
	@Override
	public void method5268() {
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(I)I")
	@Override
	public int method4810() {
		return 0;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method4809() {
		return false;
	}

	@OriginalMember(owner = "client!se", name = "c", descriptor = "(I)V")
	@Override
	public void method4811() {
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(B)I")
	@Override
	public int method4807() {
		return 0;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method4806(@OriginalArg(1) Class172 arg0) {
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(ZLclient!qa;)Lclient!ae;")
	@Override
	public Class6_Sub1 method5274(@OriginalArg(1) Class172 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(ILclient!qa;II)Z")
	@Override
	public boolean method5270(@OriginalArg(1) Class172 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return false;
	}
}
