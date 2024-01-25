import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public final class Class213_Sub1 extends Class213 implements Interface15 {

	@OriginalMember(owner = "client!kl", name = "u", descriptor = "Lclient!hk;")
	private final Class158 aClass158_15;

	@OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(Lclient!mba;Lclient!hk;Z)V")
	public Class213_Sub1(@OriginalArg(0) Class145_Sub1_Sub1 arg0, @OriginalArg(1) Class158 arg1, @OriginalArg(2) boolean arg2) {
		super(arg0, 34963, arg2);
		this.aClass158_15 = arg1;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method4689() {
		return super.method9225(super.aClass145_Sub1_Sub1_12.aMapBuffer1);
	}

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "(I)Lclient!hk;")
	@Override
	public Class158 method4690() {
		return this.aClass158_15;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(II)V")
	@Override
	public void method9224(@OriginalArg(0) int arg0) {
		super.method9224(this.aClass158_15.anInt3816 * arg0);
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(B)V")
	@Override
	public void method9218() {
		super.method9218();
	}

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method4691() {
		return super.method9223(super.aClass145_Sub1_Sub1_12.aMapBuffer1);
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)I")
	@Override
	public int method9217() {
		return super.method9217();
	}
}
