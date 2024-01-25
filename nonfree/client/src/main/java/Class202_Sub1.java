import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pba")
public final class Class202_Sub1 extends Class202 implements Interface7 {

	@OriginalMember(owner = "client!pba", name = "u", descriptor = "I")
	private int anInt6770;

	@OriginalMember(owner = "client!pba", name = "<init>", descriptor = "(Lclient!us;I[BIZ)V")
	public Class202_Sub1(@OriginalArg(0) Class43_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt6770 = arg1;
	}

	@OriginalMember(owner = "client!pba", name = "<init>", descriptor = "(Lclient!us;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class202_Sub1(@OriginalArg(0) Class43_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt6770 = arg1;
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(I)I")
	@Override
	public int method6583() {
		return this.anInt6770;
	}

	@OriginalMember(owner = "client!pba", name = "b", descriptor = "(I)V")
	@Override
	protected void method6868() {
		super.aClass43_Sub3_39.method7238(this);
	}

	@OriginalMember(owner = "client!pba", name = "b", descriptor = "(B)I")
	@Override
	public int method6581() {
		return super.anInt8161;
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "([BIIB)V")
	@Override
	public void method6582(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method6867(arg1, arg0);
		this.anInt6770 = arg2;
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(B)J")
	@Override
	public long method6580() {
		return 0L;
	}
}
