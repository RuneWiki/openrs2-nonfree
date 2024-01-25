import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public final class Class164_Sub1 extends Class164 implements Interface10 {

	@OriginalMember(owner = "client!kh", name = "e", descriptor = "I")
	private int anInt5024;

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Lclient!rs;ILclient!jaclib/memory/Buffer;)V")
	public Class164_Sub1(@OriginalArg(0) Class133_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2) {
		super(arg0, arg2);
		this.anInt5024 = arg1;
	}

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Lclient!rs;I[BI)V")
	public Class164_Sub1(@OriginalArg(0) Class133_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt5024 = arg1;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)I")
	@Override
	public int method8854() {
		return this.anInt5024;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)J")
	@Override
	public long method8857() {
		return super.aBuffer3.getAddress();
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Z)I")
	@Override
	public int method8856() {
		return 0;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "([BBII)V")
	@Override
	public void method8855(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method5215(arg0, arg2);
		this.anInt5024 = arg1;
	}
}
