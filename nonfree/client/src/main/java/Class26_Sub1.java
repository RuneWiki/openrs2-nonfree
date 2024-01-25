import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public final class Class26_Sub1 extends Class26 implements Interface22 {

	@OriginalMember(owner = "client!cd", name = "o", descriptor = "I")
	private int anInt1548;

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Lclient!er;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class26_Sub1(@OriginalArg(0) Class31_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt1548 = arg1;
	}

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Lclient!er;I[BIZ)V")
	public Class26_Sub1(@OriginalArg(0) Class31_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt1548 = arg1;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(B[BII)V")
	@Override
	public void method4050(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method5865(arg0, arg2);
		this.anInt1548 = arg1;
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(B)V")
	@Override
	protected void method5866() {
		super.aClass31_Sub2_34.method2538(this);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Z)I")
	@Override
	public int method4047() {
		return this.anInt1548;
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(Z)J")
	@Override
	public long method4049() {
		return 0L;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)I")
	@Override
	public int method4048() {
		return super.anInt7513;
	}
}
