import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public final class Class44_Sub2 extends Class44 implements Interface27 {

	@OriginalMember(owner = "client!kc", name = "r", descriptor = "I")
	private int anInt5460;

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(Lclient!wh;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class44_Sub2(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt5460 = arg1;
	}

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(Lclient!wh;I[BIZ)V")
	public Class44_Sub2(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt5460 = arg1;
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)J")
	@Override
	public long method4869() {
		return 0L;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)I")
	@Override
	public int method4868() {
		return this.anInt5460;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(II[BI)V")
	@Override
	public void method4867(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		this.method4865(arg1, arg2);
		this.anInt5460 = arg0;
	}

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "(I)V")
	@Override
	protected void method4862() {
		super.aClass100_Sub3_30.method8913(this);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)I")
	@Override
	public int method4866() {
		return super.anInt5455;
	}
}
