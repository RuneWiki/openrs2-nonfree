import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public final class Class149_Sub1 extends Class149 implements Interface14 {

	@OriginalMember(owner = "client!ia", name = "t", descriptor = "I")
	private int anInt4317;

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Lclient!kw;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class149_Sub1(@OriginalArg(0) Class5_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt4317 = arg1;
	}

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Lclient!kw;I[BIZ)V")
	public Class149_Sub1(@OriginalArg(0) Class5_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt4317 = arg1;
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(I)I")
	@Override
	public int method3807() {
		return super.anInt10144;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)I")
	@Override
	public int method3806() {
		return this.anInt4317;
	}

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "(I)J")
	@Override
	public long method3808() {
		return 0L;
	}

	@OriginalMember(owner = "client!ia", name = "e", descriptor = "(I)V")
	@Override
	protected void method8700() {
		super.aClass5_Sub2_43.method5016(this);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZII[B)V")
	@Override
	public void method3805(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		this.method8703(arg2, arg1);
		this.anInt4317 = arg0;
	}
}
