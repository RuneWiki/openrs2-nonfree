import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public final class Class32 {

	@OriginalMember(owner = "client!cf", name = "f", descriptor = "I")
	public int anInt879;

	@OriginalMember(owner = "client!cf", name = "g", descriptor = "I")
	public int anInt880;

	@OriginalMember(owner = "client!cf", name = "n", descriptor = "I")
	public int anInt887;

	@OriginalMember(owner = "client!cf", name = "d", descriptor = "I")
	public int anInt878 = 128;

	@OriginalMember(owner = "client!cf", name = "m", descriptor = "I")
	public int anInt886 = 128;

	@OriginalMember(owner = "client!cf", name = "l", descriptor = "I")
	public int anInt885;

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(I)V")
	public Class32(@OriginalArg(0) int arg0) {
		this.anInt885 = arg0;
	}

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(IIIIII)V")
	private Class32(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt886 = arg2;
		this.anInt887 = arg3;
		this.anInt879 = arg4;
		this.anInt878 = arg1;
		this.anInt880 = arg5;
		this.anInt885 = arg0;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lclient!cf;B)V")
	public void method785(@OriginalArg(0) Class32 arg0) {
		this.anInt879 = arg0.anInt879;
		this.anInt880 = arg0.anInt880;
		this.anInt885 = arg0.anInt885;
		this.anInt886 = arg0.anInt886;
		this.anInt878 = arg0.anInt878;
		this.anInt887 = arg0.anInt887;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Z)Lclient!cf;")
	public Class32 method786() {
		return new Class32(this.anInt885, this.anInt878, this.anInt886, this.anInt887, this.anInt879, this.anInt880);
	}
}
