import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public final class Class51_Sub2 extends Class51 implements Interface1 {

	@OriginalMember(owner = "client!u", name = "u", descriptor = "I")
	private int anInt8651;

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Lclient!ad;I[BIZ)V")
	public Class51_Sub2(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt8651 = arg1;
	}

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Lclient!ad;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class51_Sub2(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt8651 = arg1;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(I[BIB)V")
	@Override
	public void method7113(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method7108(arg1, arg0);
		this.anInt8651 = arg2;
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(I)I")
	@Override
	public int method7114() {
		return this.anInt8651;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(B)J")
	@Override
	public long method7112() {
		return 0L;
	}

	@OriginalMember(owner = "client!u", name = "d", descriptor = "(I)V")
	@Override
	protected void method7110() {
		super.aClass5_Sub1_38.method407(this);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(I)I")
	@Override
	public int method7111() {
		return super.anInt8642;
	}
}
