import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jja")
public final class Class40_Sub1 extends Class40 implements Interface8 {

	@OriginalMember(owner = "client!jja", name = "e", descriptor = "I")
	private int anInt4845;

	@OriginalMember(owner = "client!jja", name = "<init>", descriptor = "(Lclient!qfa;I[BI)V")
	public Class40_Sub1(@OriginalArg(0) Class137_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt4845 = arg1;
	}

	@OriginalMember(owner = "client!jja", name = "<init>", descriptor = "(Lclient!qfa;ILclient!jaclib/memory/Buffer;)V")
	public Class40_Sub1(@OriginalArg(0) Class137_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2) {
		super(arg0, arg2);
		this.anInt4845 = arg1;
	}

	@OriginalMember(owner = "client!jja", name = "a", descriptor = "(Z)I")
	@Override
	public int method5113() {
		return 0;
	}

	@OriginalMember(owner = "client!jja", name = "a", descriptor = "(I)I")
	@Override
	public int method5114() {
		return this.anInt4845;
	}

	@OriginalMember(owner = "client!jja", name = "a", descriptor = "(III[B)V")
	@Override
	public void method5116(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		this.method5492(arg2, arg0);
		this.anInt4845 = arg1;
	}

	@OriginalMember(owner = "client!jja", name = "a", descriptor = "(B)J")
	@Override
	public long method5115() {
		return super.aBuffer3.getAddress();
	}
}
