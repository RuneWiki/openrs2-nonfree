import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mfa")
public final class Class219 {

	@OriginalMember(owner = "client!mfa", name = "e", descriptor = "I")
	public int anInt6101;

	@OriginalMember(owner = "client!mfa", name = "h", descriptor = "I")
	public int anInt6103;

	@OriginalMember(owner = "client!mfa", name = "m", descriptor = "I")
	public int anInt6106;

	@OriginalMember(owner = "client!mfa", name = "d", descriptor = "I")
	public int anInt6100 = 128;

	@OriginalMember(owner = "client!mfa", name = "n", descriptor = "I")
	public int anInt6107 = 128;

	@OriginalMember(owner = "client!mfa", name = "l", descriptor = "I")
	public int anInt6105;

	@OriginalMember(owner = "client!mfa", name = "<init>", descriptor = "(I)V")
	public Class219(@OriginalArg(0) int arg0) {
		this.anInt6105 = arg0;
	}

	@OriginalMember(owner = "client!mfa", name = "<init>", descriptor = "(IIIIII)V")
	private Class219(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt6101 = arg4;
		this.anInt6106 = arg5;
		this.anInt6105 = arg0;
		this.anInt6107 = arg1;
		this.anInt6100 = arg2;
		this.anInt6103 = arg3;
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(I)Lclient!mfa;")
	public Class219 method5068() {
		return new Class219(this.anInt6105, this.anInt6107, this.anInt6100, this.anInt6103, this.anInt6101, this.anInt6106);
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(Lclient!mfa;I)V")
	public void method5072(@OriginalArg(0) Class219 arg0) {
		this.anInt6105 = arg0.anInt6105;
		this.anInt6103 = arg0.anInt6103;
		this.anInt6107 = arg0.anInt6107;
		this.anInt6100 = arg0.anInt6100;
		this.anInt6101 = arg0.anInt6101;
		this.anInt6106 = arg0.anInt6106;
	}
}
