import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public final class Class113_Sub2 extends Class113 implements Interface26 {

	@OriginalMember(owner = "client!lq", name = "r", descriptor = "I")
	private int anInt6279;

	@OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(Lclient!hk;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class113_Sub2(@OriginalArg(0) Class16_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt6279 = arg1;
	}

	@OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(Lclient!hk;I[BIZ)V")
	public Class113_Sub2(@OriginalArg(0) Class16_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt6279 = arg1;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "([BIII)V")
	@Override
	public void method5257(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method5253(arg2, arg0);
		this.anInt6279 = arg1;
	}

	@OriginalMember(owner = "client!lq", name = "c", descriptor = "(B)I")
	@Override
	public int method5258() {
		return super.anInt6272;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(B)I")
	@Override
	public int method5255() {
		return this.anInt6279;
	}

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "(B)J")
	@Override
	public long method5256() {
		return 0L;
	}

	@OriginalMember(owner = "client!lq", name = "d", descriptor = "(I)V")
	@Override
	protected void method5250() {
		super.aClass16_Sub2_32.method3622(this);
	}
}
