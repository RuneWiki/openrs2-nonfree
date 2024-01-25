import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public final class Class15_Sub2 extends Class15 implements Interface2 {

	@OriginalMember(owner = "client!uc", name = "o", descriptor = "I")
	private int anInt8433;

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Lclient!pea;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class15_Sub2(@OriginalArg(0) Class121_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt8433 = arg1;
	}

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Lclient!pea;I[BIZ)V")
	public Class15_Sub2(@OriginalArg(0) Class121_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt8433 = arg1;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Z)V")
	@Override
	protected void method6948() {
		super.aClass121_Sub3_39.method5653(this);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(I[BIB)V")
	@Override
	public void method6952(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method6949(arg0, arg1);
		this.anInt8433 = arg2;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)I")
	@Override
	public int method6953() {
		return super.anInt8425;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)J")
	@Override
	public long method6954() {
		return 0L;
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)I")
	@Override
	public int method6955() {
		return this.anInt8433;
	}
}
