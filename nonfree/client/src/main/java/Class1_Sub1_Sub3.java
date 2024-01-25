import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public final class Class1_Sub1_Sub3 extends Class1_Sub1 implements Interface5 {

	@OriginalMember(owner = "client!wr", name = "I", descriptor = "Lclient!bb;")
	public Class1_Sub1 aClass1_Sub1_3;

	@OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(IIIIILclient!bb;)V")
	public Class1_Sub1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class1_Sub1 arg5) {
		super(arg2, arg3, arg4, 0, 0, 0, Static341.method4765(arg0, arg1));
		this.aClass1_Sub1_3 = arg5;
	}

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "(I)I")
	@Override
	public int method6261() {
		return 0;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method6260() {
		return false;
	}

	@OriginalMember(owner = "client!wr", name = "g", descriptor = "(I)I")
	@Override
	public int method6252() {
		return 0;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method6265(@OriginalArg(0) Class167 arg0) {
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(ILclient!qa;)Lclient!ou;")
	@Override
	public Class23_Sub5 method6242(@OriginalArg(1) Class167 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(ZLclient!qa;)V")
	@Override
	public void method6259(@OriginalArg(1) Class167 arg0) {
	}

	@OriginalMember(owner = "client!wr", name = "e", descriptor = "(I)V")
	@Override
	public void method6264() {
	}

	@OriginalMember(owner = "client!wr", name = "c", descriptor = "(I)I")
	@Override
	public int method6262() {
		return 0;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(ILclient!qa;I)Lclient!ka;")
	@Override
	public Class108 method6258(@OriginalArg(0) int arg0, @OriginalArg(1) Class167 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(BIILclient!qa;)Z")
	@Override
	public boolean method6245(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class167 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!wr", name = "d", descriptor = "(I)I")
	@Override
	public int method6263() {
		return 0;
	}

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "(ZLclient!qa;)V")
	@Override
	public void method6241(@OriginalArg(1) Class167 arg0) {
	}
}
