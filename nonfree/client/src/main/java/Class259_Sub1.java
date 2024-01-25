import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oia")
public final class Class259_Sub1 extends Class259 implements Interface2 {

	@OriginalMember(owner = "client!oia", name = "u", descriptor = "I")
	private int anInt7006;

	@OriginalMember(owner = "client!oia", name = "<init>", descriptor = "(Lclient!rda;I[BIZ)V")
	public Class259_Sub1(@OriginalArg(0) Class126_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt7006 = arg1;
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(III[B)V")
	@Override
	public void method8502(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		this.method6375(arg0, arg1);
		this.anInt7006 = 5123;
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(I)J")
	@Override
	public long method8501() {
		return 0L;
	}

	@OriginalMember(owner = "client!oia", name = "b", descriptor = "(B)V")
	@Override
	protected void method6373() {
		super.aClass126_Sub3_28.method7128(this);
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(B)I")
	@Override
	public int method8503() {
		return this.anInt7006;
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(Z)I")
	@Override
	public int method8504() {
		return super.anInt7178;
	}
}
