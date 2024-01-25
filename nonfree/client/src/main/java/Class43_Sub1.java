import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public final class Class43_Sub1 extends Class43 implements Interface18 {

	@OriginalMember(owner = "client!bu", name = "n", descriptor = "I")
	private int anInt1152;

	@OriginalMember(owner = "client!bu", name = "<init>", descriptor = "(Lclient!qj;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class43_Sub1(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt1152 = arg1;
	}

	@OriginalMember(owner = "client!bu", name = "<init>", descriptor = "(Lclient!qj;I[BIZ)V")
	public Class43_Sub1(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt1152 = arg1;
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(I)I")
	@Override
	public int method3531() {
		return this.anInt1152;
	}

	@OriginalMember(owner = "client!bu", name = "b", descriptor = "(B)V")
	@Override
	protected void method5469() {
		super.aClass100_Sub3_32.method6317(this);
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(B)J")
	@Override
	public long method3530() {
		return 0L;
	}

	@OriginalMember(owner = "client!bu", name = "b", descriptor = "(I)I")
	@Override
	public int method3533() {
		return super.anInt6522;
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "([BIIB)V")
	@Override
	public void method3532(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method5468(arg0, arg1);
		this.anInt1152 = arg2;
	}
}
