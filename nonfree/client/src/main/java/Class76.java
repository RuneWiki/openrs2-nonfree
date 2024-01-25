import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public final class Class76 {

	@OriginalMember(owner = "client!dh", name = "l", descriptor = "I")
	public int anInt2030;

	@OriginalMember(owner = "client!dh", name = "h", descriptor = "I")
	public int anInt2032;

	@OriginalMember(owner = "client!dh", name = "f", descriptor = "I")
	public int anInt2042;

	@OriginalMember(owner = "client!dh", name = "i", descriptor = "I")
	public int anInt2037 = 128;

	@OriginalMember(owner = "client!dh", name = "j", descriptor = "I")
	public int anInt2041 = 128;

	@OriginalMember(owner = "client!dh", name = "c", descriptor = "I")
	public int anInt2034;

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(I)V")
	public Class76(@OriginalArg(0) int arg0) {
		this.anInt2034 = arg0;
	}

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(IIIIII)V")
	private Class76(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt2032 = arg5;
		this.anInt2030 = arg3;
		this.anInt2037 = arg1;
		this.anInt2042 = arg4;
		this.anInt2034 = arg0;
		this.anInt2041 = arg2;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lclient!dh;B)V")
	public void method1966(@OriginalArg(0) Class76 arg0) {
		this.anInt2030 = arg0.anInt2030;
		this.anInt2034 = arg0.anInt2034;
		this.anInt2042 = arg0.anInt2042;
		this.anInt2032 = arg0.anInt2032;
		this.anInt2041 = arg0.anInt2041;
		this.anInt2037 = arg0.anInt2037;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)Lclient!dh;")
	public Class76 method1967() {
		return new Class76(this.anInt2034, this.anInt2037, this.anInt2041, this.anInt2030, this.anInt2042, this.anInt2032);
	}
}
