import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public final class Class54_Sub1 extends Class54 implements Interface10 {

	@OriginalMember(owner = "client!ck", name = "i", descriptor = "I")
	private int anInt1546;

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Lclient!wh;I[BI)V")
	public Class54_Sub1(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt1546 = arg1;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(I[BII)V")
	@Override
	public void method1317(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.method1448(arg1, arg0);
		this.anInt1546 = 5123;
	}

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "(I)J")
	@Override
	public long method1318() {
		return super.aBuffer3.getAddress();
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)I")
	@Override
	public int method1316() {
		return 0;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Z)I")
	@Override
	public int method1315() {
		return this.anInt1546;
	}
}
