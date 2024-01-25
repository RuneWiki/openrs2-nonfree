import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public final class Class33_Sub1 extends Class33 implements Interface1 {

	@OriginalMember(owner = "client!bn", name = "e", descriptor = "I")
	private int anInt995;

	@OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(Lclient!ad;ILclient!jaclib/memory/Buffer;)V")
	public Class33_Sub1(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2) {
		super(arg0, arg2);
		this.anInt995 = arg1;
	}

	@OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(Lclient!ad;I[BI)V")
	public Class33_Sub1(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt995 = arg1;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(I[BIB)V")
	@Override
	public void method7113(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method4106(arg1, arg0);
		this.anInt995 = arg2;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(I)I")
	@Override
	public int method7111() {
		return 0;
	}

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "(I)I")
	@Override
	public int method7114() {
		return this.anInt995;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(B)J")
	@Override
	public long method7112() {
		return super.aBuffer3.getAddress();
	}
}
