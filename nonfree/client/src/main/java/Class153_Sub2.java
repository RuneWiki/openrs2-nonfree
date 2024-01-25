import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mia")
public final class Class153_Sub2 extends Class153 implements Interface12 {

	@OriginalMember(owner = "client!mia", name = "c", descriptor = "I")
	private int anInt5489;

	@OriginalMember(owner = "client!mia", name = "<init>", descriptor = "(Lclient!ep;I[BI)V")
	public Class153_Sub2(@OriginalArg(0) Class95_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt5489 = arg1;
	}

	@OriginalMember(owner = "client!mia", name = "<init>", descriptor = "(Lclient!ep;ILclient!jaclib/memory/Buffer;)V")
	public Class153_Sub2(@OriginalArg(0) Class95_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2) {
		super(arg0, arg2);
		this.anInt5489 = arg1;
	}

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "(BII[B)V")
	@Override
	public void method7601(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		this.method4703(arg2, arg1);
		this.anInt5489 = arg0;
	}

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "(I)I")
	@Override
	public int method7600() {
		return 0;
	}

	@OriginalMember(owner = "client!mia", name = "b", descriptor = "(I)I")
	@Override
	public int method7603() {
		return this.anInt5489;
	}

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "(B)J")
	@Override
	public long method7602() {
		return super.aBuffer3.getAddress();
	}
}
