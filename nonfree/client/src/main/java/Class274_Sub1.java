import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pga")
public final class Class274_Sub1 extends Class274 implements Interface17 {

	@OriginalMember(owner = "client!pga", name = "d", descriptor = "I")
	private int anInt7655;

	@OriginalMember(owner = "client!pga", name = "<init>", descriptor = "(Lclient!ck;ILclient!jaclib/memory/Buffer;)V")
	public Class274_Sub1(@OriginalArg(0) Class65_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2) {
		super(arg0, arg2);
		this.anInt7655 = arg1;
	}

	@OriginalMember(owner = "client!pga", name = "<init>", descriptor = "(Lclient!ck;I[BI)V")
	public Class274_Sub1(@OriginalArg(0) Class65_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt7655 = arg1;
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "([BIII)V")
	@Override
	public void method6469(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method9041(arg0, arg1);
		this.anInt7655 = arg2;
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(I)I")
	@Override
	public int method6470() {
		return this.anInt7655;
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(B)J")
	@Override
	public long method6467() {
		return super.aBuffer3.getAddress();
	}

	@OriginalMember(owner = "client!pga", name = "b", descriptor = "(B)I")
	@Override
	public int method6468() {
		return 0;
	}
}
