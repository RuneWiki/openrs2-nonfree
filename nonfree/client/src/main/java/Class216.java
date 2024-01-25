import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mfa")
public final class Class216 {

	@OriginalMember(owner = "client!mfa", name = "b", descriptor = "I")
	public int anInt5944;

	@OriginalMember(owner = "client!mfa", name = "c", descriptor = "I")
	public int anInt5945;

	@OriginalMember(owner = "client!mfa", name = "d", descriptor = "I")
	public int anInt5946;

	@OriginalMember(owner = "client!mfa", name = "g", descriptor = "I")
	public int anInt5949;

	@OriginalMember(owner = "client!mfa", name = "j", descriptor = "I")
	public int anInt5952;

	@OriginalMember(owner = "client!mfa", name = "l", descriptor = "I")
	public int anInt5953;

	@OriginalMember(owner = "client!mfa", name = "m", descriptor = "I")
	public int anInt5954;

	@OriginalMember(owner = "client!mfa", name = "t", descriptor = "I")
	public int anInt5958;

	@OriginalMember(owner = "client!mfa", name = "i", descriptor = "I")
	public int anInt5951 = 128;

	@OriginalMember(owner = "client!mfa", name = "f", descriptor = "I")
	public int anInt5948 = 128;

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "I")
	public int anInt5943;

	@OriginalMember(owner = "client!mfa", name = "<init>", descriptor = "(I)V")
	public Class216(@OriginalArg(0) int arg0) {
		this.anInt5943 = arg0;
	}

	@OriginalMember(owner = "client!mfa", name = "<init>", descriptor = "(IIIIII)V")
	private Class216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt5945 = arg4;
		this.anInt5951 = arg1;
		this.anInt5954 = arg5;
		this.anInt5943 = arg0;
		this.anInt5946 = arg3;
		this.anInt5948 = arg2;
	}

	@OriginalMember(owner = "client!mfa", name = "b", descriptor = "(I)Lclient!mfa;")
	public Class216 method5385() {
		return new Class216(this.anInt5943, this.anInt5951, this.anInt5948, this.anInt5946, this.anInt5945, this.anInt5954);
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(ILclient!mfa;)V")
	public void method5387(@OriginalArg(1) Class216 arg0) {
		this.anInt5946 = arg0.anInt5946;
		this.anInt5948 = arg0.anInt5948;
		this.anInt5954 = arg0.anInt5954;
		this.anInt5943 = arg0.anInt5943;
		this.anInt5951 = arg0.anInt5951;
		this.anInt5945 = arg0.anInt5945;
	}
}
