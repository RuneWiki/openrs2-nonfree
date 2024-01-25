import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public final class Class297 {

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "I")
	public int anInt8859;

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "I")
	public int anInt8860;

	@OriginalMember(owner = "client!rd", name = "e", descriptor = "I")
	public int anInt8863;

	@OriginalMember(owner = "client!rd", name = "k", descriptor = "I")
	public int anInt8869;

	@OriginalMember(owner = "client!rd", name = "l", descriptor = "I")
	public int anInt8870;

	@OriginalMember(owner = "client!rd", name = "m", descriptor = "I")
	public int anInt8871;

	@OriginalMember(owner = "client!rd", name = "p", descriptor = "I")
	public int anInt8874;

	@OriginalMember(owner = "client!rd", name = "q", descriptor = "I")
	public int anInt8875;

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "I")
	public int anInt8862 = 128;

	@OriginalMember(owner = "client!rd", name = "h", descriptor = "I")
	public int anInt8866 = 128;

	@OriginalMember(owner = "client!rd", name = "n", descriptor = "I")
	public int anInt8872;

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(I)V")
	public Class297(@OriginalArg(0) int arg0) {
		this.anInt8872 = arg0;
	}

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(IIIIII)V")
	private Class297(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt8874 = arg3;
		this.anInt8862 = arg2;
		this.anInt8872 = arg0;
		this.anInt8875 = arg4;
		this.anInt8860 = arg5;
		this.anInt8866 = arg1;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)Lclient!rd;")
	public Class297 method7354() {
		return new Class297(this.anInt8872, this.anInt8866, this.anInt8862, this.anInt8874, this.anInt8875, this.anInt8860);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!rd;I)V")
	public void method7356(@OriginalArg(0) Class297 arg0) {
		this.anInt8862 = arg0.anInt8862;
		this.anInt8860 = arg0.anInt8860;
		this.anInt8875 = arg0.anInt8875;
		this.anInt8872 = arg0.anInt8872;
		this.anInt8874 = arg0.anInt8874;
		this.anInt8866 = arg0.anInt8866;
	}
}
