import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public final class Class166_Sub1 extends Class166 implements Interface22 {

	@OriginalMember(owner = "client!ju", name = "f", descriptor = "I")
	private int anInt5064;

	@OriginalMember(owner = "client!ju", name = "<init>", descriptor = "(Lclient!er;I[BI)V")
	public Class166_Sub1(@OriginalArg(0) Class31_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt5064 = arg1;
	}

	@OriginalMember(owner = "client!ju", name = "<init>", descriptor = "(Lclient!er;ILclient!jaclib/memory/Buffer;)V")
	public Class166_Sub1(@OriginalArg(0) Class31_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2) {
		super(arg0, arg2);
		this.anInt5064 = arg1;
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(Z)I")
	@Override
	public int method4047() {
		return this.anInt5064;
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(B[BII)V")
	@Override
	public void method4050(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method4584(arg0, arg2);
		this.anInt5064 = arg1;
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(I)I")
	@Override
	public int method4048() {
		return 0;
	}

	@OriginalMember(owner = "client!ju", name = "b", descriptor = "(Z)J")
	@Override
	public long method4049() {
		return super.aBuffer3.getAddress();
	}
}
