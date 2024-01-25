import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hda")
public final class Class125_Sub1 extends Class125 implements Interface15 {

	@OriginalMember(owner = "client!hda", name = "p", descriptor = "I")
	private int anInt3468;

	@OriginalMember(owner = "client!hda", name = "<init>", descriptor = "(Lclient!mh;I[BIZ)V")
	public Class125_Sub1(@OriginalArg(0) Class4_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt3468 = arg1;
	}

	@OriginalMember(owner = "client!hda", name = "<init>", descriptor = "(Lclient!mh;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class125_Sub1(@OriginalArg(0) Class4_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt3468 = arg1;
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(I)I")
	@Override
	public int method3790() {
		return super.anInt7157;
	}

	@OriginalMember(owner = "client!hda", name = "b", descriptor = "(I)J")
	@Override
	public long method3791() {
		return 0L;
	}

	@OriginalMember(owner = "client!hda", name = "b", descriptor = "(B)V")
	@Override
	protected void method6444() {
		super.aClass4_Sub3_36.method5224(this);
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(B)I")
	@Override
	public int method3793() {
		return this.anInt3468;
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(I[BZI)V")
	@Override
	public void method3792(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		this.method6443(arg0, arg1);
		this.anInt3468 = arg2;
	}
}
