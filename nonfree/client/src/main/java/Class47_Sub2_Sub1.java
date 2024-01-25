import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public final class Class47_Sub2_Sub1 extends Class47_Sub2 implements Interface17 {

	@OriginalMember(owner = "client!cq", name = "N", descriptor = "Lclient!pc;")
	public Class47_Sub2 aClass47_Sub2_1;

	@OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(IIIIIIIIIILclient!pc;)V")
	public Class47_Sub2_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class47_Sub2 arg10) {
		super(arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, false, Static107.method2297(arg0, arg1));
		this.aClass47_Sub2_1 = arg10;
	}

	@OriginalMember(owner = "client!cq", name = "b", descriptor = "(B)I")
	@Override
	public int method7176() {
		return 0;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(BLclient!qa;)V")
	@Override
	public void method7174(@OriginalArg(1) Class9 arg0) {
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(Lclient!qa;IZIILclient!co;I)V")
	@Override
	public void method7166(@OriginalArg(0) Class9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class47 arg5) {
	}

	@OriginalMember(owner = "client!cq", name = "c", descriptor = "(I)V")
	@Override
	public void method7179() {
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7175() {
		return false;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(BILclient!qa;)Lclient!r;")
	@Override
	public Class19 method7178(@OriginalArg(1) int arg0, @OriginalArg(2) Class9 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!cq", name = "b", descriptor = "(ILclient!qa;)Lclient!in;")
	@Override
	public Class2_Sub6 method7165(@OriginalArg(1) Class9 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(Lclient!qa;I)Lclient!pl;")
	@Override
	public Class231 method7163(@OriginalArg(0) Class9 arg0) {
		return this.aClass47_Sub2_1.method7163(arg0);
	}

	@OriginalMember(owner = "client!cq", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method7156() {
		return false;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(ILclient!qa;IB)Z")
	@Override
	public boolean method7157(@OriginalArg(0) int arg0, @OriginalArg(1) Class9 arg1, @OriginalArg(2) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!cq", name = "e", descriptor = "(B)I")
	@Override
	public int method6953() {
		return 0;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method7161(@OriginalArg(1) Class9 arg0) {
	}

	@OriginalMember(owner = "client!cq", name = "b", descriptor = "(BLclient!qa;)V")
	@Override
	public void method7177(@OriginalArg(1) Class9 arg0) {
	}

	@OriginalMember(owner = "client!cq", name = "b", descriptor = "(I)I")
	@Override
	public int method7173() {
		return 0;
	}

	@OriginalMember(owner = "client!cq", name = "e", descriptor = "(I)V")
	@Override
	public void method7162() {
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(I)I")
	@Override
	public int method7172() {
		return 0;
	}
}
