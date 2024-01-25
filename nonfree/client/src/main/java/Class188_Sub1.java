import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public final class Class188_Sub1 extends Class188 implements Interface13 {

	@OriginalMember(owner = "client!it", name = "d", descriptor = "I")
	private int anInt4451;

	@OriginalMember(owner = "client!it", name = "<init>", descriptor = "(Lclient!aq;ILclient!jaclib/memory/Buffer;)V")
	public Class188_Sub1(@OriginalArg(0) Class22_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2) {
		super(arg0, arg2);
		this.anInt4451 = arg1;
	}

	@OriginalMember(owner = "client!it", name = "<init>", descriptor = "(Lclient!aq;I[BI)V")
	public Class188_Sub1(@OriginalArg(0) Class22_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt4451 = arg1;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(I)I")
	@Override
	public int method4051() {
		return this.anInt4451;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "([BIIZ)V")
	@Override
	public void method4053(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method4874(arg0, arg2);
		this.anInt4451 = arg1;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(Z)I")
	@Override
	public int method4052() {
		return 0;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(B)J")
	@Override
	public long method4054() {
		return super.aBuffer3.getAddress();
	}
}
