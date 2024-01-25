import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public final class Class93_Sub2 extends Class93 implements Interface14 {

	@OriginalMember(owner = "client!ku", name = "v", descriptor = "I")
	private int anInt5500;

	@OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(Lclient!bi;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class93_Sub2(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt5500 = arg1;
	}

	@OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(Lclient!bi;I[BIZ)V")
	public Class93_Sub2(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt5500 = arg1;
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(II[BB)V")
	@Override
	public void method4793(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		this.method4790(arg2, arg1);
		this.anInt5500 = arg0;
	}

	@OriginalMember(owner = "client!ku", name = "c", descriptor = "(I)V")
	@Override
	protected void method4789() {
		super.aClass13_Sub2_25.method1098(this);
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(Z)J")
	@Override
	public long method4796() {
		return 0L;
	}

	@OriginalMember(owner = "client!ku", name = "b", descriptor = "(I)I")
	@Override
	public int method4795() {
		return super.anInt5487;
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(I)I")
	@Override
	public int method4794() {
		return this.anInt5500;
	}
}
