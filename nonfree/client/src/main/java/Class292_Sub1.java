import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vv")
public final class Class292_Sub1 extends Class292 implements Interface15 {

	@OriginalMember(owner = "client!vv", name = "l", descriptor = "I")
	private int anInt10182;

	@OriginalMember(owner = "client!vv", name = "<init>", descriptor = "(Lclient!kv;I[BI)V")
	public Class292_Sub1(@OriginalArg(0) Class143_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt10182 = arg1;
	}

	@OriginalMember(owner = "client!vv", name = "b", descriptor = "(I)J")
	@Override
	public long method8494() {
		return super.aBuffer3.getAddress();
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(BII[B)V")
	@Override
	public void method8493(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) {
		this.method8684(arg1, arg0);
		this.anInt10182 = 5123;
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(I)I")
	@Override
	public int method8491() {
		return 0;
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(Z)I")
	@Override
	public int method8492() {
		return this.anInt10182;
	}
}
