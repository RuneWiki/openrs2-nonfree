import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public final class Class302 {

	@OriginalMember(owner = "client!ve", name = "i", descriptor = "I")
	public int anInt8904;

	@OriginalMember(owner = "client!ve", name = "k", descriptor = "I")
	public int anInt8906;

	@OriginalMember(owner = "client!ve", name = "l", descriptor = "I")
	public int anInt8907;

	@OriginalMember(owner = "client!ve", name = "g", descriptor = "I")
	public int anInt8902 = 128;

	@OriginalMember(owner = "client!ve", name = "e", descriptor = "I")
	public int anInt8900 = 128;

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
	public int anInt8898;

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(I)V")
	public Class302(@OriginalArg(0) int arg0) {
		this.anInt8898 = arg0;
	}

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(IIIIII)V")
	private Class302(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt8902 = arg2;
		this.anInt8904 = arg5;
		this.anInt8900 = arg1;
		this.anInt8906 = arg3;
		this.anInt8907 = arg4;
		this.anInt8898 = arg0;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!ve;B)V")
	public void method7750(@OriginalArg(0) Class302 arg0) {
		this.anInt8907 = arg0.anInt8907;
		this.anInt8904 = arg0.anInt8904;
		this.anInt8900 = arg0.anInt8900;
		this.anInt8902 = arg0.anInt8902;
		this.anInt8898 = arg0.anInt8898;
		this.anInt8906 = arg0.anInt8906;
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)Lclient!ve;")
	public Class302 method7753() {
		return new Class302(this.anInt8898, this.anInt8900, this.anInt8902, this.anInt8906, this.anInt8907, this.anInt8904);
	}
}
