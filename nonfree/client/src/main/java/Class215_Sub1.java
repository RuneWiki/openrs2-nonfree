import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public final class Class215_Sub1 extends Class215 implements Interface7 {

	@OriginalMember(owner = "client!lq", name = "d", descriptor = "I")
	private int anInt5782;

	@OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(Lclient!rda;I[BI)V")
	public Class215_Sub1(@OriginalArg(0) Class126_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt5782 = arg1;
	}

	@OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(Lclient!rda;ILclient!jaclib/memory/Buffer;)V")
	public Class215_Sub1(@OriginalArg(0) Class126_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2) {
		super(arg0, arg2);
		this.anInt5782 = arg1;
	}

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "(I)J")
	@Override
	public long method6381() {
		return super.aBuffer3.getAddress();
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(BII[B)V")
	@Override
	public void method6378(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		this.method8500(arg2, arg0);
		this.anInt5782 = arg1;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(B)I")
	@Override
	public int method6379() {
		return 0;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)I")
	@Override
	public int method6380() {
		return this.anInt5782;
	}
}
