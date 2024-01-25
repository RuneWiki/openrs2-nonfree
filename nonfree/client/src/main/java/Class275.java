import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pw")
public final class Class275 {

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "I")
	public int anInt6904;

	@OriginalMember(owner = "client!pw", name = "b", descriptor = "I")
	public int anInt6905;

	@OriginalMember(owner = "client!pw", name = "d", descriptor = "I")
	public int anInt6907;

	@OriginalMember(owner = "client!pw", name = "f", descriptor = "I")
	public int anInt6909;

	@OriginalMember(owner = "client!pw", name = "i", descriptor = "I")
	public int anInt6912;

	@OriginalMember(owner = "client!pw", name = "k", descriptor = "I")
	public int anInt6914;

	@OriginalMember(owner = "client!pw", name = "m", descriptor = "I")
	public int anInt6916;

	@OriginalMember(owner = "client!pw", name = "o", descriptor = "I")
	public int anInt6918;

	@OriginalMember(owner = "client!pw", name = "g", descriptor = "I")
	public int anInt6910 = 128;

	@OriginalMember(owner = "client!pw", name = "j", descriptor = "I")
	public int anInt6913 = 128;

	@OriginalMember(owner = "client!pw", name = "l", descriptor = "I")
	public int anInt6915;

	@OriginalMember(owner = "client!pw", name = "<init>", descriptor = "(I)V")
	public Class275(@OriginalArg(0) int arg0) {
		this.anInt6915 = arg0;
	}

	@OriginalMember(owner = "client!pw", name = "<init>", descriptor = "(IIIIII)V")
	private Class275(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt6913 = arg2;
		this.anInt6910 = arg1;
		this.anInt6918 = arg5;
		this.anInt6915 = arg0;
		this.anInt6912 = arg3;
		this.anInt6907 = arg4;
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(B)Lclient!pw;")
	public Class275 method5662() {
		return new Class275(this.anInt6915, this.anInt6910, this.anInt6913, this.anInt6912, this.anInt6907, this.anInt6918);
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(BLclient!pw;)V")
	public void method5663(@OriginalArg(1) Class275 arg0) {
		this.anInt6918 = arg0.anInt6918;
		this.anInt6907 = arg0.anInt6907;
		this.anInt6910 = arg0.anInt6910;
		this.anInt6912 = arg0.anInt6912;
		this.anInt6915 = arg0.anInt6915;
		this.anInt6913 = arg0.anInt6913;
	}
}
