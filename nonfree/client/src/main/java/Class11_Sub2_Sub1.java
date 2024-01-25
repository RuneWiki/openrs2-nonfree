import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public final class Class11_Sub2_Sub1 extends Class11_Sub2 implements Interface4 {

	@OriginalMember(owner = "client!bj", name = "R", descriptor = "Lclient!bf;")
	public final Class11_Sub2 aClass11_Sub2_1;

	@OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(IIIIIIIIIILclient!bf;)V")
	public Class11_Sub2_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class11_Sub2 arg10) {
		super(arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, false, Static28.method694(arg0, arg1));
		this.aClass11_Sub2_1 = arg10;
	}

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "(ILclient!fp;)V")
	@Override
	public void method5912(@OriginalArg(1) Class63 arg0) {
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5924() {
		return false;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lclient!fp;Z)V")
	@Override
	public void method5920(@OriginalArg(0) Class63 arg0) {
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lclient!fp;I)V")
	@Override
	public void method5926(@OriginalArg(0) Class63 arg0) {
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lclient!fp;Lclient!je;ZIIII)V")
	@Override
	public void method5915(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
	}

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "(I)V")
	@Override
	public void method5923() {
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)I")
	@Override
	public int method5922() {
		return 0;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lclient!fp;III)Z")
	@Override
	public boolean method5914(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!bj", name = "d", descriptor = "(I)V")
	@Override
	public void method5911() {
	}

	@OriginalMember(owner = "client!bj", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method5913() {
		return false;
	}

	@OriginalMember(owner = "client!bj", name = "e", descriptor = "(B)I")
	@Override
	public int method5877() {
		return 0;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(ILclient!fp;)Lclient!uq;")
	@Override
	public Class32_Sub7 method5909(@OriginalArg(1) Class63 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lclient!fp;II)Lclient!bi;")
	@Override
	public Class3 method5921(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(B)I")
	@Override
	public int method5927() {
		return 0;
	}

	@OriginalMember(owner = "client!bj", name = "c", descriptor = "(I)I")
	@Override
	public int method5925() {
		return 0;
	}
}
