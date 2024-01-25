import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public final class Class1_Sub2_Sub3 extends Class1_Sub2 implements Interface12 {

	@OriginalMember(owner = "client!wc", name = "H", descriptor = "Lclient!mu;")
	public Class1_Sub2 aClass1_Sub2_2;

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(IIILclient!mu;)V")
	public Class1_Sub2_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class1_Sub2 arg3) {
		super(arg0, arg1, arg2, false, false);
		this.aClass1_Sub2_2 = arg3;
	}

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "(I)V")
	@Override
	public void method5849() {
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method5854(@OriginalArg(0) Class75 arg0) {
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method5853(@OriginalArg(0) Class75 arg0) {
	}

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "(I)I")
	@Override
	public int method5851() {
		return 0;
	}

	@OriginalMember(owner = "client!wc", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5839() {
		return false;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(BLclient!rn;ZIILclient!qa;I)V")
	@Override
	public void method5836(@OriginalArg(1) Class1 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class75 arg4, @OriginalArg(6) int arg5) {
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IZILclient!qa;)Z")
	@Override
	public boolean method5835(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class75 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(Lclient!qa;B)Lclient!vs;")
	@Override
	public Class13_Sub7 method5837(@OriginalArg(0) Class75 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)I")
	@Override
	public int method5847() {
		return 0;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5852() {
		return false;
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)I")
	@Override
	public int method5848() {
		return 0;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)V")
	@Override
	public void method5838() {
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IILclient!qa;)Lclient!c;")
	@Override
	public Class31 method5850(@OriginalArg(0) int arg0, @OriginalArg(2) Class75 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(BLclient!qa;)V")
	@Override
	public void method5840(@OriginalArg(1) Class75 arg0) {
	}
}
