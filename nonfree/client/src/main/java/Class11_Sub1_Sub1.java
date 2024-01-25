import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public final class Class11_Sub1_Sub1 extends Class11_Sub1 implements Interface4 {

	@OriginalMember(owner = "client!as", name = "I", descriptor = "Lclient!cl;")
	public final Class11_Sub1 aClass11_Sub1_1;

	@OriginalMember(owner = "client!as", name = "<init>", descriptor = "(IIILclient!cl;)V")
	public Class11_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class11_Sub1 arg3) {
		super(arg0, arg1, arg2, false, false);
		this.aClass11_Sub1_1 = arg3;
	}

	@OriginalMember(owner = "client!as", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method5913() {
		return false;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(Lclient!fp;Z)V")
	@Override
	public void method5920(@OriginalArg(0) Class63 arg0) {
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(Lclient!fp;Lclient!je;ZIIII)V")
	@Override
	public void method5915(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
	}

	@OriginalMember(owner = "client!as", name = "b", descriptor = "(I)V")
	@Override
	public void method5923() {
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5924() {
		return false;
	}

	@OriginalMember(owner = "client!as", name = "c", descriptor = "(I)I")
	@Override
	public int method5925() {
		return 0;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(B)I")
	@Override
	public int method5927() {
		return 0;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(I)I")
	@Override
	public int method5922() {
		return 0;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(ILclient!fp;)Lclient!uq;")
	@Override
	public Class32_Sub7 method5909(@OriginalArg(1) Class63 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!as", name = "b", descriptor = "(ILclient!fp;)V")
	@Override
	public void method5912(@OriginalArg(1) Class63 arg0) {
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(Lclient!fp;II)Lclient!bi;")
	@Override
	public Class3 method5921(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!as", name = "d", descriptor = "(I)V")
	@Override
	public void method5911() {
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(Lclient!fp;III)Z")
	@Override
	public boolean method5914(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(Lclient!fp;I)V")
	@Override
	public void method5926(@OriginalArg(0) Class63 arg0) {
	}
}
