import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public final class Class141_Sub1 extends Class141 implements Interface1 {

	@OriginalMember(owner = "client!kn", name = "u", descriptor = "I")
	private int anInt3901;

	@OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(Lclient!ht;I[BIZ)V")
	public Class141_Sub1(@OriginalArg(0) Class109_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt3901 = arg1;
	}

	@OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(Lclient!ht;ILclient!jaggl/memory/NativeBuffer;IZ)V")
	public Class141_Sub1(@OriginalArg(0) Class109_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) NativeBuffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt3901 = arg1;
	}

	@OriginalMember(owner = "client!kn", name = "d", descriptor = "(I)V")
	@Override
	protected void method4267() {
		super.aClass109_Sub1_36.method2551(this);
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(B[BII)V")
	@Override
	public void method3256(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method4265(arg0, arg2);
		this.anInt3901 = arg1;
	}

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "(B)I")
	@Override
	public int method3254() {
		return this.anInt3901;
	}

	@OriginalMember(owner = "client!kn", name = "c", descriptor = "(B)I")
	@Override
	public int method3255() {
		return super.anInt5289;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(B)J")
	@Override
	public long method3253() {
		return 0L;
	}
}
