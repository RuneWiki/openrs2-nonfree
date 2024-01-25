import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public final class Class165_Sub1 extends Class165 implements Interface26 {

	@OriginalMember(owner = "client!ik", name = "f", descriptor = "I")
	private int anInt4329;

	@OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(Lclient!pq;ILclient!jaclib/memory/Buffer;)V")
	public Class165_Sub1(@OriginalArg(0) Class132_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2) {
		super(arg0, arg2);
		this.anInt4329 = arg1;
	}

	@OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(Lclient!pq;I[BI)V")
	public Class165_Sub1(@OriginalArg(0) Class132_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt4329 = arg1;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(II[BI)V")
	@Override
	public void method3632(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		this.method8573(arg2, arg0);
		this.anInt4329 = arg1;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)I")
	@Override
	public int method3631() {
		return 0;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(Z)I")
	@Override
	public int method3633() {
		return this.anInt4329;
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(Z)J")
	@Override
	public long method3634() {
		return super.aBuffer3.getAddress();
	}
}
