import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public final class Class14_Sub1 extends Class14 implements Interface1 {

	@OriginalMember(owner = "client!ai", name = "f", descriptor = "I")
	private int anInt553;

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Lclient!ag;ILclient!jaclib/memory/Buffer;)V")
	public Class14_Sub1(@OriginalArg(0) Class12_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2) {
		super(arg0, arg2);
		this.anInt553 = arg1;
	}

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Lclient!ag;I[BI)V")
	public Class14_Sub1(@OriginalArg(0) Class12_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt553 = arg1;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(BI[BI)V")
	@Override
	public void method1699(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		this.method3244(arg1, arg0);
		this.anInt553 = arg2;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(B)I")
	@Override
	public int method1698() {
		return 0;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)I")
	@Override
	public int method1697() {
		return this.anInt553;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Z)J")
	@Override
	public long method1696() {
		return super.aBuffer3.getAddress();
	}
}
