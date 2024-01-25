import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public final class Class54_Sub2 extends Class54 implements Interface27 {

	@OriginalMember(owner = "client!ct", name = "e", descriptor = "I")
	private int anInt1741;

	@OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(Lclient!wh;ILclient!jaclib/memory/Buffer;)V")
	public Class54_Sub2(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2) {
		super(arg0, arg2);
		this.anInt1741 = arg1;
	}

	@OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(Lclient!wh;I[BI)V")
	public Class54_Sub2(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt1741 = arg1;
	}

	@OriginalMember(owner = "client!ct", name = "b", descriptor = "(I)J")
	@Override
	public long method4869() {
		return super.aBuffer3.getAddress();
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(B)I")
	@Override
	public int method4868() {
		return this.anInt1741;
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(I)I")
	@Override
	public int method4866() {
		return 0;
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(II[BI)V")
	@Override
	public void method4867(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		this.method1448(arg2, arg1);
		this.anInt1741 = arg0;
	}
}
