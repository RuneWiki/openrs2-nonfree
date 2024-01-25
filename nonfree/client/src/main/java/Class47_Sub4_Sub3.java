import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public final class Class47_Sub4_Sub3 extends Class47_Sub4 implements Interface17 {

	@OriginalMember(owner = "client!ts", name = "A", descriptor = "Lclient!hu;")
	public Class47_Sub4 aClass47_Sub4_3;

	@OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(IIIIILclient!hu;)V")
	public Class47_Sub4_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class47_Sub4 arg5) {
		super(arg2, arg3, arg4, Static430.method6345(arg1, arg0));
		this.aClass47_Sub4_3 = arg5;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(Lclient!qa;I)Lclient!pl;")
	@Override
	public Class231 method7163(@OriginalArg(0) Class9 arg0) {
		return this.aClass47_Sub4_3.method7163(arg0);
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method7161(@OriginalArg(1) Class9 arg0) {
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(BILclient!qa;)Lclient!r;")
	@Override
	public Class19 method7178(@OriginalArg(1) int arg0, @OriginalArg(2) Class9 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(ILclient!qa;IB)Z")
	@Override
	public boolean method7157(@OriginalArg(0) int arg0, @OriginalArg(1) Class9 arg1, @OriginalArg(2) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "(ILclient!qa;)Lclient!in;")
	@Override
	public Class2_Sub6 method7165(@OriginalArg(1) Class9 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ts", name = "c", descriptor = "(I)V")
	@Override
	public void method7179() {
	}

	@OriginalMember(owner = "client!ts", name = "e", descriptor = "(I)V")
	@Override
	public void method7162() {
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7175() {
		return false;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(I)I")
	@Override
	public int method7172() {
		return 0;
	}

	@OriginalMember(owner = "client!ts", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method7156() {
		return false;
	}

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "(B)I")
	@Override
	public int method7176() {
		return 0;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(Lclient!qa;IZIILclient!co;I)V")
	@Override
	public void method7166(@OriginalArg(0) Class9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class47 arg5) {
	}

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "(BLclient!qa;)V")
	@Override
	public void method7177(@OriginalArg(1) Class9 arg0) {
	}

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "(I)I")
	@Override
	public int method7173() {
		return 0;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(BLclient!qa;)V")
	@Override
	public void method7174(@OriginalArg(1) Class9 arg0) {
	}
}
