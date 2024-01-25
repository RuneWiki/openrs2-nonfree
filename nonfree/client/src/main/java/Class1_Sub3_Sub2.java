import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public final class Class1_Sub3_Sub2 extends Class1_Sub3 implements Interface5 {

	@OriginalMember(owner = "client!kt", name = "w", descriptor = "Lclient!kr;")
	public Class1_Sub3 aClass1_Sub3_1;

	@OriginalMember(owner = "client!kt", name = "<init>", descriptor = "(IIIIILclient!kr;)V")
	public Class1_Sub3_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class1_Sub3 arg5) {
		super(arg2, arg3, arg4, Static64.method1219(arg1, arg0));
		this.aClass1_Sub3_1 = arg5;
	}

	@OriginalMember(owner = "client!kt", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method6247() {
		return false;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(ILclient!qa;I)Lclient!ka;")
	@Override
	public Class108 method6258(@OriginalArg(0) int arg0, @OriginalArg(1) Class167 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!kt", name = "b", descriptor = "(I)I")
	@Override
	public int method6261() {
		return 0;
	}

	@OriginalMember(owner = "client!kt", name = "f", descriptor = "(I)V")
	@Override
	public void method6244() {
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(ILclient!a;IIILclient!qa;Z)V")
	@Override
	public void method6248(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class167 arg4, @OriginalArg(6) boolean arg5) {
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(ILclient!qa;)Lclient!ou;")
	@Override
	public Class23_Sub5 method6242(@OriginalArg(1) Class167 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method6265(@OriginalArg(0) Class167 arg0) {
	}

	@OriginalMember(owner = "client!kt", name = "d", descriptor = "(I)I")
	@Override
	public int method6263() {
		return 0;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method6260() {
		return false;
	}

	@OriginalMember(owner = "client!kt", name = "c", descriptor = "(I)I")
	@Override
	public int method6262() {
		return 0;
	}

	@OriginalMember(owner = "client!kt", name = "b", descriptor = "(ZLclient!qa;)V")
	@Override
	public void method6241(@OriginalArg(1) Class167 arg0) {
	}

	@OriginalMember(owner = "client!kt", name = "e", descriptor = "(I)V")
	@Override
	public void method6264() {
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(ZLclient!qa;)V")
	@Override
	public void method6259(@OriginalArg(1) Class167 arg0) {
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(BIILclient!qa;)Z")
	@Override
	public boolean method6245(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class167 arg2) {
		return false;
	}
}
