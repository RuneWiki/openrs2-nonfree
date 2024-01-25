import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public final class Class133_Sub1 extends Class133 implements Interface6 {

	@OriginalMember(owner = "client!gh", name = "K", descriptor = "B")
	private byte aByte63;

	@OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(Lclient!dga;Z)V")
	public Class133_Sub1(@OriginalArg(0) Class75_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		super(arg0, 34962, arg1);
	}

	@OriginalMember(owner = "client!gh", name = "g", descriptor = "(I)I")
	public int method3661() {
		return this.aByte63;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(BLclient!jaclib/memory/Source;II)Z")
	@Override
	public boolean method3660(@OriginalArg(1) Source arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.aByte63 = (byte) arg1;
		super.method3791(arg2, arg0);
		return true;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Z)V")
	@Override
	public void method8675() {
		super.method8675();
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(ZZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method3658() {
		return super.method3798(super.aClass75_Sub1_Sub1_8.aMapBuffer2);
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(III)Z")
	@Override
	public boolean method3659(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aByte63 = (byte) arg1;
		super.method8679(arg0);
		return true;
	}

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)I")
	@Override
	public int method8674() {
		return super.method8674();
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method3657() {
		return super.method3797(super.aClass75_Sub1_Sub1_8.aMapBuffer2);
	}
}
