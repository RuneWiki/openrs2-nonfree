import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public final class Class19_Sub1 extends Class19 implements Interface14 {

	@OriginalMember(owner = "client!ao", name = "f", descriptor = "I")
	private int anInt927;

	@OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(Lclient!kw;I[BI)V")
	public Class19_Sub1(@OriginalArg(0) Class5_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt927 = arg1;
	}

	@OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(Lclient!kw;ILclient!jaclib/memory/Buffer;)V")
	public Class19_Sub1(@OriginalArg(0) Class5_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2) {
		super(arg0, arg2);
		this.anInt927 = arg1;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)I")
	@Override
	public int method3806() {
		return this.anInt927;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(ZII[B)V")
	@Override
	public void method3805(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		this.method4498(arg2, arg1);
		this.anInt927 = arg0;
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(I)I")
	@Override
	public int method3807() {
		return 0;
	}

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "(I)J")
	@Override
	public long method3808() {
		return super.aBuffer3.getAddress();
	}
}
