import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public final class Class64_Sub1 extends Class64 implements Interface9 {

	@OriginalMember(owner = "client!dc", name = "B", descriptor = "I")
	private int anInt2530;

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(Lclient!nv;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class64_Sub1(@OriginalArg(0) Class16_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt2530 = arg1;
	}

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(Lclient!nv;I[BIZ)V")
	public Class64_Sub1(@OriginalArg(0) Class16_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt2530 = arg1;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(I[BII)V")
	@Override
	public void method6286(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		this.method5435(arg1, arg2);
		this.anInt2530 = arg0;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)I")
	@Override
	public int method6287() {
		return super.anInt6632;
	}

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "(I)V")
	@Override
	protected void method5433() {
		super.aClass16_Sub3_27.method5943(this);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)J")
	@Override
	public long method6288() {
		return 0L;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Z)I")
	@Override
	public int method6289() {
		return this.anInt2530;
	}
}
