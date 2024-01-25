import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ria")
public final class Class59_Sub2 extends Class59 implements Interface2 {

	@OriginalMember(owner = "client!ria", name = "i", descriptor = "I")
	private int anInt8633;

	@OriginalMember(owner = "client!ria", name = "<init>", descriptor = "(Lclient!ml;I[BI)V")
	public Class59_Sub2(@OriginalArg(0) Class75_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt8633 = arg1;
	}

	@OriginalMember(owner = "client!ria", name = "<init>", descriptor = "(Lclient!ml;ILclient!jaclib/memory/Buffer;)V")
	public Class59_Sub2(@OriginalArg(0) Class75_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2) {
		super(arg0, arg2);
		this.anInt8633 = arg1;
	}

	@OriginalMember(owner = "client!ria", name = "b", descriptor = "(B)J")
	@Override
	public long method7557() {
		return super.aBuffer3.getAddress();
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(Z)I")
	@Override
	public int method7560() {
		return this.anInt8633;
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(II[BB)V")
	@Override
	public void method7558(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		this.method7556(arg2, arg0);
		this.anInt8633 = arg1;
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(B)I")
	@Override
	public int method7559() {
		return 0;
	}
}
