import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public final class Class167_Sub1 extends Class167 implements Interface21 {

	@OriginalMember(owner = "client!iq", name = "d", descriptor = "I")
	private int anInt4594;

	@OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Lclient!lf;I[BI)V")
	public Class167_Sub1(@OriginalArg(0) Class95_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt4594 = arg1;
	}

	@OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Lclient!lf;ILclient!jaclib/memory/Buffer;)V")
	public Class167_Sub1(@OriginalArg(0) Class95_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2) {
		super(arg0, arg2);
		this.anInt4594 = arg1;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(I)I")
	@Override
	public int method8696() {
		return 0;
	}

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "(Z)J")
	@Override
	public long method8697() {
		return super.aBuffer3.getAddress();
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Z)I")
	@Override
	public int method8695() {
		return this.anInt4594;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "([BIZI)V")
	@Override
	public void method8698(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.method7792(arg0, arg2);
		this.anInt4594 = arg1;
	}
}
