import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public final class Class21_Sub1 extends Class21 implements Interface10 {

	@OriginalMember(owner = "client!mu", name = "k", descriptor = "I")
	private int anInt6448;

	@OriginalMember(owner = "client!mu", name = "<init>", descriptor = "(Lclient!kga;ILclient!jaclib/memory/Buffer;)V")
	public Class21_Sub1(@OriginalArg(0) Class44_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2) {
		super(arg0, arg2);
		this.anInt6448 = arg1;
	}

	@OriginalMember(owner = "client!mu", name = "<init>", descriptor = "(Lclient!kga;I[BI)V")
	public Class21_Sub1(@OriginalArg(0) Class44_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt6448 = arg1;
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(B)J")
	@Override
	public long method6467() {
		return super.aBuffer3.getAddress();
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(I)I")
	@Override
	public int method6466() {
		return this.anInt6448;
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(I[BII)V")
	@Override
	public void method6468(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method7397(arg0, arg1);
		this.anInt6448 = arg2;
	}

	@OriginalMember(owner = "client!mu", name = "b", descriptor = "(I)I")
	@Override
	public int method6469() {
		return 0;
	}
}
