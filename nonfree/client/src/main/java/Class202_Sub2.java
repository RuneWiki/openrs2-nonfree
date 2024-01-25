import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public final class Class202_Sub2 extends Class202 implements Interface8 {

	@OriginalMember(owner = "client!ld", name = "o", descriptor = "I")
	private int anInt6163;

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lclient!qfa;I[BIZ)V")
	public Class202_Sub2(@OriginalArg(0) Class137_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt6163 = arg1;
	}

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lclient!qfa;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class202_Sub2(@OriginalArg(0) Class137_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt6163 = arg1;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)I")
	@Override
	public int method5114() {
		return this.anInt6163;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Z)I")
	@Override
	public int method5113() {
		return super.anInt6160;
	}

	@OriginalMember(owner = "client!ld", name = "d", descriptor = "(I)V")
	@Override
	protected void method5110() {
		super.aClass137_Sub3_20.method7089(this);
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)J")
	@Override
	public long method5115() {
		return 0L;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(III[B)V")
	@Override
	public void method5116(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		this.method5112(arg0, arg2);
		this.anInt6163 = arg1;
	}
}
