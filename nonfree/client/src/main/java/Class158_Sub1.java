import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public final class Class158_Sub1 extends Class158 implements Interface11 {

	@OriginalMember(owner = "client!je", name = "p", descriptor = "I")
	private int anInt4349;

	static {
		new Class40("You are temporarily banned from this clan channel.", "Du wurdest temporär aus diesem Chatraum verbannt.", "Vous êtes temporairement exclu de ce canal de clan.", "Você está temporariamente vetado de entrar nesse canal de clã.");
	}

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Lclient!jj;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class158_Sub1(@OriginalArg(0) Class62_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt4349 = arg1;
	}

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Lclient!jj;I[BIZ)V")
	public Class158_Sub1(@OriginalArg(0) Class62_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt4349 = arg1;
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(I)I")
	@Override
	public int method5916() {
		return super.anInt5955;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(I)J")
	@Override
	public long method5915() {
		return 0L;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(I[BBI)V")
	@Override
	public void method5918(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		this.method4960(arg1, arg2);
		this.anInt4349 = arg0;
	}

	@OriginalMember(owner = "client!je", name = "d", descriptor = "(I)V")
	@Override
	protected void method4962() {
		super.aClass62_Sub3_20.method3936(this);
	}

	@OriginalMember(owner = "client!je", name = "c", descriptor = "(I)I")
	@Override
	public int method5917() {
		return this.anInt4349;
	}
}
