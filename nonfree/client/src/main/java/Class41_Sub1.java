import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public final class Class41_Sub1 extends Class41 implements Interface16 {

	@OriginalMember(owner = "client!qt", name = "q", descriptor = "I")
	private int anInt6975;

	@OriginalMember(owner = "client!qt", name = "<init>", descriptor = "(Lclient!te;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class41_Sub1(@OriginalArg(0) Class9_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt6975 = arg1;
	}

	@OriginalMember(owner = "client!qt", name = "<init>", descriptor = "(Lclient!te;I[BIZ)V")
	public Class41_Sub1(@OriginalArg(0) Class9_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt6975 = arg1;
	}

	@OriginalMember(owner = "client!qt", name = "b", descriptor = "(B)J")
	@Override
	public long method6007() {
		return 0L;
	}

	@OriginalMember(owner = "client!qt", name = "c", descriptor = "(B)I")
	@Override
	public int method6008() {
		return this.anInt6975;
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(B)I")
	@Override
	public int method6006() {
		return super.anInt7923;
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "([BBII)V")
	@Override
	public void method6005(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method6736(arg0, arg2);
		this.anInt6975 = arg1;
	}

	@OriginalMember(owner = "client!qt", name = "b", descriptor = "(I)V")
	@Override
	protected void method6735() {
		super.aClass9_Sub3_39.method6730(this);
	}
}
