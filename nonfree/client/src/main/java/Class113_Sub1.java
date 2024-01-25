import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public final class Class113_Sub1 extends Class113 implements Interface11 {

	@OriginalMember(owner = "client!qq", name = "d", descriptor = "I")
	private int anInt7274;

	@OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(Lclient!jj;I[BI)V")
	public Class113_Sub1(@OriginalArg(0) Class62_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt7274 = arg1;
	}

	@OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(Lclient!jj;ILclient!jaclib/memory/Buffer;)V")
	public Class113_Sub1(@OriginalArg(0) Class62_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2) {
		super(arg0, arg2);
		this.anInt7274 = arg1;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(I[BBI)V")
	@Override
	public void method5918(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		this.method6016(arg1, arg2);
		this.anInt7274 = arg0;
	}

	@OriginalMember(owner = "client!qq", name = "c", descriptor = "(I)I")
	@Override
	public int method5917() {
		return this.anInt7274;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(I)J")
	@Override
	public long method5915() {
		return super.aBuffer3.getAddress();
	}

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "(I)I")
	@Override
	public int method5916() {
		return 0;
	}
}
