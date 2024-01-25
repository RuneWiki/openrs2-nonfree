import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public final class Class170_Sub2 extends Class170 implements Interface19 {

	@OriginalMember(owner = "client!se", name = "e", descriptor = "I")
	private int anInt9022;

	@OriginalMember(owner = "client!se", name = "<init>", descriptor = "(Lclient!ac;I[BI)V")
	public Class170_Sub2(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt9022 = arg1;
	}

	@OriginalMember(owner = "client!se", name = "<init>", descriptor = "(Lclient!ac;ILclient!jaclib/memory/Buffer;)V")
	public Class170_Sub2(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2) {
		super(arg0, arg2);
		this.anInt9022 = arg1;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(II[BI)V")
	@Override
	public void method7395(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		this.method7392(arg1, arg0);
		this.anInt9022 = arg2;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(I)J")
	@Override
	public long method7393() {
		return super.aBuffer3.getAddress();
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(I)I")
	@Override
	public int method7394() {
		return 0;
	}

	@OriginalMember(owner = "client!se", name = "c", descriptor = "(I)I")
	@Override
	public int method7396() {
		return this.anInt9022;
	}
}
