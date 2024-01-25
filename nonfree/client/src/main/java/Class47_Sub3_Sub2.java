import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public final class Class47_Sub3_Sub2 extends Class47_Sub3 implements Interface17 {

	@OriginalMember(owner = "client!tc", name = "t", descriptor = "Lclient!sm;")
	public Class47_Sub3 aClass47_Sub3_2;

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(IIILclient!sm;)V")
	public Class47_Sub3_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class47_Sub3 arg3) {
		super(arg0, arg1, arg2, arg3.aShort112, false, false);
		this.aClass47_Sub3_2 = arg3;
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(ILclient!qa;)Lclient!in;")
	@Override
	public Class2_Sub6 method7165(@OriginalArg(1) Class9 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)I")
	@Override
	public int method7173() {
		return 0;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(BILclient!qa;)Lclient!r;")
	@Override
	public Class19 method7178(@OriginalArg(1) int arg0, @OriginalArg(2) Class9 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(BLclient!qa;)V")
	@Override
	public void method7177(@OriginalArg(1) Class9 arg0) {
	}

	@OriginalMember(owner = "client!tc", name = "e", descriptor = "(I)V")
	@Override
	public void method7162() {
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!qa;IZIILclient!co;I)V")
	@Override
	public void method7166(@OriginalArg(0) Class9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class47 arg5) {
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method7161(@OriginalArg(1) Class9 arg0) {
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7175() {
		return false;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(BLclient!qa;)V")
	@Override
	public void method7174(@OriginalArg(1) Class9 arg0) {
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILclient!qa;IB)Z")
	@Override
	public boolean method7157(@OriginalArg(0) int arg0, @OriginalArg(1) Class9 arg1, @OriginalArg(2) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "(I)V")
	@Override
	public void method7179() {
	}

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method7156() {
		return false;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)I")
	@Override
	public int method7172() {
		return 0;
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(B)I")
	@Override
	public int method7176() {
		return 0;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!qa;I)Lclient!pl;")
	@Override
	public Class231 method7163(@OriginalArg(0) Class9 arg0) {
		return this.aClass47_Sub3_2.method7163(arg0);
	}
}
