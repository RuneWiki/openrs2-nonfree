import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public final class Class14_Sub1 extends Class14 implements Interface18 {

	@OriginalMember(owner = "client!ib", name = "f", descriptor = "I")
	private int anInt4558;

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Lclient!ap;I[BI)V")
	public Class14_Sub1(@OriginalArg(0) Class9_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt4558 = arg1;
	}

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Lclient!ap;ILclient!jaclib/memory/Buffer;)V")
	public Class14_Sub1(@OriginalArg(0) Class9_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2) {
		super(arg0, arg2);
		this.anInt4558 = arg1;
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)I")
	@Override
	public int method3936() {
		return this.anInt4558;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)I")
	@Override
	public int method3934() {
		return 0;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Z)J")
	@Override
	public long method3935() {
		return super.aBuffer3.getAddress();
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(BI[BI)V")
	@Override
	public void method3933(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		this.method7653(arg1, arg0);
		this.anInt4558 = arg2;
	}
}
