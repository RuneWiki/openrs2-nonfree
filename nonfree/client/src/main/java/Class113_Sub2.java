import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jea")
public final class Class113_Sub2 extends Class113 implements Interface2 {

	@OriginalMember(owner = "client!jea", name = "i", descriptor = "I")
	private int anInt3925;

	@OriginalMember(owner = "client!jea", name = "<init>", descriptor = "(Lclient!pea;ILclient!jaclib/memory/Buffer;)V")
	public Class113_Sub2(@OriginalArg(0) Class121_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2) {
		super(arg0, arg2);
		this.anInt3925 = arg1;
	}

	@OriginalMember(owner = "client!jea", name = "<init>", descriptor = "(Lclient!pea;I[BI)V")
	public Class113_Sub2(@OriginalArg(0) Class121_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt3925 = arg1;
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(I)I")
	@Override
	public int method6953() {
		return 0;
	}

	@OriginalMember(owner = "client!jea", name = "b", descriptor = "(I)I")
	@Override
	public int method6955() {
		return this.anInt3925;
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(B)J")
	@Override
	public long method6954() {
		return super.aBuffer3.getAddress();
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(I[BIB)V")
	@Override
	public void method6952(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method3376(arg1, arg0);
		this.anInt3925 = arg2;
	}
}
