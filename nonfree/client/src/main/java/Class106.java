import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ffa")
public final class Class106 {

	@OriginalMember(owner = "client!ffa", name = "c", descriptor = "I")
	public int anInt3036;

	@OriginalMember(owner = "client!ffa", name = "d", descriptor = "I")
	public int anInt3037;

	@OriginalMember(owner = "client!ffa", name = "g", descriptor = "I")
	public int anInt3040;

	@OriginalMember(owner = "client!ffa", name = "e", descriptor = "I")
	public int anInt3038 = 128;

	@OriginalMember(owner = "client!ffa", name = "h", descriptor = "I")
	public int anInt3041 = 128;

	@OriginalMember(owner = "client!ffa", name = "i", descriptor = "I")
	public int anInt3042;

	@OriginalMember(owner = "client!ffa", name = "<init>", descriptor = "(I)V")
	public Class106(@OriginalArg(0) int arg0) {
		this.anInt3042 = arg0;
	}

	@OriginalMember(owner = "client!ffa", name = "<init>", descriptor = "(IIIIII)V")
	private Class106(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt3038 = arg1;
		this.anInt3042 = arg0;
		this.anInt3036 = arg3;
		this.anInt3040 = arg5;
		this.anInt3041 = arg2;
		this.anInt3037 = arg4;
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(ILclient!ffa;)V")
	public void method2581(@OriginalArg(1) Class106 arg0) {
		this.anInt3036 = arg0.anInt3036;
		this.anInt3037 = arg0.anInt3037;
		this.anInt3041 = arg0.anInt3041;
		this.anInt3042 = arg0.anInt3042;
		this.anInt3038 = arg0.anInt3038;
		this.anInt3040 = arg0.anInt3040;
	}

	@OriginalMember(owner = "client!ffa", name = "b", descriptor = "(B)Lclient!ffa;")
	public Class106 method2582() {
		return new Class106(this.anInt3042, this.anInt3038, this.anInt3041, this.anInt3036, this.anInt3037, this.anInt3040);
	}
}
