import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public final class Class64_Sub1 extends Class64 implements Interface1 {

	@OriginalMember(owner = "client!eo", name = "c", descriptor = "I")
	private int anInt1890;

	@OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(Lclient!fd;I[BI)V")
	public Class64_Sub1(@OriginalArg(0) Class19_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt1890 = arg1;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(I)I")
	@Override
	public int method3656() {
		return 0;
	}

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "(B)I")
	@Override
	public int method3659() {
		return this.anInt1890;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "([BZII)V")
	@Override
	public void method3657(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		this.method3984(arg0, arg1);
		this.anInt1890 = 5123;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(B)J")
	@Override
	public long method3658() {
		return super.aNativeBuffer4.c();
	}
}
