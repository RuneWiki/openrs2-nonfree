import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public final class Class201_Sub1 extends Class201 implements Interface22 {

	@OriginalMember(owner = "client!nh", name = "n", descriptor = "I")
	private int anInt6730;

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Lclient!kga;I[BIZ)V")
	public Class201_Sub1(@OriginalArg(0) Class44_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt6730 = arg1;
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(B)I")
	@Override
	public int method7401() {
		return super.anInt7748;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Z)V")
	@Override
	protected void method6465() {
		super.aClass44_Sub3_32.method4643(this);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)I")
	@Override
	public int method7400() {
		return this.anInt6730;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)J")
	@Override
	public long method7398() {
		return 0L;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "([BIII)V")
	@Override
	public void method7399(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		this.method6460(arg0, arg1);
		this.anInt6730 = 5123;
	}
}
