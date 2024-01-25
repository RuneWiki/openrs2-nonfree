import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public final class Class167_Sub2 extends Class167 implements Interface5 {

	@OriginalMember(owner = "client!ki", name = "j", descriptor = "I")
	private int anInt4779;

	@OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(Lclient!ok;ILclient!jaclib/memory/Buffer;)V")
	public Class167_Sub2(@OriginalArg(0) Class134_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2) {
		super(arg0, arg2);
		this.anInt4779 = arg1;
	}

	@OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(Lclient!ok;I[BI)V")
	public Class167_Sub2(@OriginalArg(0) Class134_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt4779 = arg1;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(BII[B)V")
	@Override
	public void method7484(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		this.method3855(arg2, arg0);
		this.anInt4779 = arg1;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)I")
	@Override
	public int method7485() {
		return 0;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)I")
	@Override
	public int method7486() {
		return this.anInt4779;
	}

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "(I)J")
	@Override
	public long method7487() {
		return super.aBuffer3.getAddress();
	}
}
