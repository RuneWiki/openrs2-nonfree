import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public final class Class41_Sub2 extends Class41 implements Interface3 {

	@OriginalMember(owner = "client!lo", name = "q", descriptor = "I")
	private int anInt6258;

	@OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(Lclient!dw;ILclient!jaclib/memory/Buffer;)V")
	public Class41_Sub2(@OriginalArg(0) Class82_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2) {
		super(arg0, arg2);
		this.anInt6258 = arg1;
	}

	@OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(Lclient!dw;I[BI)V")
	public Class41_Sub2(@OriginalArg(0) Class82_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt6258 = arg1;
	}

	@OriginalMember(owner = "client!lo", name = "b", descriptor = "(B)J")
	@Override
	public long method8531() {
		return super.aBuffer3.getAddress();
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(I)I")
	@Override
	public int method8528() {
		return this.anInt6258;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(III[B)V")
	@Override
	public void method8530(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		this.method5395(arg2, arg0);
		this.anInt6258 = arg1;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(B)I")
	@Override
	public int method8529() {
		return 0;
	}
}
