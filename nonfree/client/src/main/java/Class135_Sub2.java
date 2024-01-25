import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public final class Class135_Sub2 extends Class135 implements Interface14 {

	@OriginalMember(owner = "client!ic", name = "i", descriptor = "I")
	private int anInt4039;

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(Lclient!en;I[BI)V")
	public Class135_Sub2(@OriginalArg(0) Class90_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt4039 = arg1;
	}

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(Lclient!en;ILclient!jaclib/memory/Buffer;)V")
	public Class135_Sub2(@OriginalArg(0) Class90_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2) {
		super(arg0, arg2);
		this.anInt4039 = arg1;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)I")
	@Override
	public int method7308() {
		return this.anInt4039;
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(B)I")
	@Override
	public int method7309() {
		return 0;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(II[BI)V")
	@Override
	public void method7306(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		this.method3463(arg1, arg2);
		this.anInt4039 = arg0;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Z)J")
	@Override
	public long method7307() {
		return super.aBuffer3.getAddress();
	}
}
