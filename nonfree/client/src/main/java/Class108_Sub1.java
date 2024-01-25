import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kda")
public final class Class108_Sub1 extends Class108 implements Interface14 {

	@OriginalMember(owner = "client!kda", name = "w", descriptor = "I")
	private int anInt5166;

	@OriginalMember(owner = "client!kda", name = "<init>", descriptor = "(Lclient!gi;I[BIZ)V")
	public Class108_Sub1(@OriginalArg(0) Class42_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt5166 = arg1;
	}

	@OriginalMember(owner = "client!kda", name = "<init>", descriptor = "(Lclient!gi;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class108_Sub1(@OriginalArg(0) Class42_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt5166 = arg1;
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(I)I")
	@Override
	public int method6391() {
		return this.anInt5166;
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(Z)J")
	@Override
	public long method6392() {
		return 0L;
	}

	@OriginalMember(owner = "client!kda", name = "b", descriptor = "(I)I")
	@Override
	public int method6393() {
		return super.anInt6864;
	}

	@OriginalMember(owner = "client!kda", name = "d", descriptor = "(I)V")
	@Override
	protected void method5740() {
		super.aClass42_Sub3_27.method3267(this);
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(I[BII)V")
	@Override
	public void method6394(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method5743(arg1, arg0);
		this.anInt5166 = arg2;
	}
}
