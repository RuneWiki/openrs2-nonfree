import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hha")
public final class Class3_Sub2 extends Class3 implements Interface23 {

	@OriginalMember(owner = "client!hha", name = "v", descriptor = "I")
	private int anInt4392;

	@OriginalMember(owner = "client!hha", name = "<init>", descriptor = "(Lclient!oea;I[BIZ)V")
	public Class3_Sub2(@OriginalArg(0) Class87_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt4392 = arg1;
	}

	@OriginalMember(owner = "client!hha", name = "<init>", descriptor = "(Lclient!oea;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class3_Sub2(@OriginalArg(0) Class87_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt4392 = arg1;
	}

	@OriginalMember(owner = "client!hha", name = "b", descriptor = "(B)J")
	@Override
	public long method5653() {
		return 0L;
	}

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(Z)I")
	@Override
	public int method5654() {
		return this.anInt4392;
	}

	@OriginalMember(owner = "client!hha", name = "d", descriptor = "(B)V")
	@Override
	protected void method3633() {
		super.aClass87_Sub2_10.method6145(this);
	}

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(B)I")
	@Override
	public int method5651() {
		return super.anInt4376;
	}

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(IIB[B)V")
	@Override
	public void method5652(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		this.method3634(arg2, arg1);
		this.anInt4392 = arg0;
	}
}
