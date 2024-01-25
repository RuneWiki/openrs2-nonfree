import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jca")
public final class Class172_Sub1 extends Class172 implements Interface6 {

	@OriginalMember(owner = "client!jca", name = "E", descriptor = "B")
	private byte aByte70;

	@OriginalMember(owner = "client!jca", name = "<init>", descriptor = "(Lclient!om;Z)V")
	public Class172_Sub1(@OriginalArg(0) Class133_Sub1_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		super(arg0, 34962, arg1);
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(ZI)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method4126() {
		return super.method6761(super.aClass133_Sub1_Sub2_12.aMapBuffer2);
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(ZII)Z")
	@Override
	public boolean method4124(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aByte70 = (byte) arg1;
		super.method6764(arg0);
		return true;
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(B)I")
	@Override
	public int method6758() {
		return super.method6758();
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method4123() {
		return super.method6762(super.aClass133_Sub1_Sub2_12.aMapBuffer2);
	}

	@OriginalMember(owner = "client!jca", name = "b", descriptor = "(I)V")
	@Override
	public void method6765() {
		super.method6765();
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(ILclient!jaclib/memory/Source;II)Z")
	@Override
	public boolean method4125(@OriginalArg(1) Source arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.aByte70 = (byte) arg1;
		super.method6763(arg2, arg0);
		return true;
	}

	@OriginalMember(owner = "client!jca", name = "f", descriptor = "(I)I")
	public int method4131() {
		return this.aByte70;
	}
}
