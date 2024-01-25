import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public final class Class86_Sub2 extends Class86 implements Interface8 {

	@OriginalMember(owner = "client!vh", name = "e", descriptor = "I")
	private int anInt9232;

	@OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(Lclient!lj;ILclient!jaclib/memory/Buffer;)V")
	public Class86_Sub2(@OriginalArg(0) Class78_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2) {
		super(arg0, arg2);
		this.anInt9232 = arg1;
	}

	@OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(Lclient!lj;I[BI)V")
	public Class86_Sub2(@OriginalArg(0) Class78_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt9232 = arg1;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Z)I")
	@Override
	public int method7526() {
		return 0;
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(I)I")
	@Override
	public int method7525() {
		return this.anInt9232;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(I[BII)V")
	@Override
	public void method7523(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method7522(arg1, arg2);
		this.anInt9232 = arg0;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)J")
	@Override
	public long method7524() {
		return super.aBuffer3.getAddress();
	}
}
