import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public final class Class92_Sub1 extends Class92 implements Interface16 {

	@OriginalMember(owner = "client!ob", name = "f", descriptor = "I")
	private int anInt6300;

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Lclient!te;ILclient!jaclib/memory/Buffer;)V")
	public Class92_Sub1(@OriginalArg(0) Class9_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2) {
		super(arg0, arg2);
		this.anInt6300 = arg1;
	}

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Lclient!te;I[BI)V")
	public Class92_Sub1(@OriginalArg(0) Class9_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt6300 = arg1;
	}

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "(B)I")
	@Override
	public int method6008() {
		return this.anInt6300;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)I")
	@Override
	public int method6006() {
		return 0;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "([BBII)V")
	@Override
	public void method6005(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method5531(arg0, arg2);
		this.anInt6300 = arg1;
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(B)J")
	@Override
	public long method6007() {
		return super.aBuffer3.getAddress();
	}
}
