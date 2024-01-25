import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public final class Class240 {

	@OriginalMember(owner = "client!oi", name = "c", descriptor = "I")
	public int anInt6677;

	@OriginalMember(owner = "client!oi", name = "d", descriptor = "I")
	public int anInt6678;

	@OriginalMember(owner = "client!oi", name = "e", descriptor = "I")
	public int anInt6679;

	@OriginalMember(owner = "client!oi", name = "f", descriptor = "I")
	public int anInt6680;

	@OriginalMember(owner = "client!oi", name = "g", descriptor = "I")
	public int anInt6681;

	@OriginalMember(owner = "client!oi", name = "k", descriptor = "I")
	public int anInt6684;

	@OriginalMember(owner = "client!oi", name = "l", descriptor = "I")
	public int anInt6685;

	@OriginalMember(owner = "client!oi", name = "o", descriptor = "I")
	public int anInt6688;

	@OriginalMember(owner = "client!oi", name = "h", descriptor = "I")
	public int anInt6682 = 128;

	@OriginalMember(owner = "client!oi", name = "n", descriptor = "I")
	public int anInt6687 = 128;

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "I")
	public int anInt6676;

	@OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(I)V")
	public Class240(@OriginalArg(0) int arg0) {
		this.anInt6676 = arg0;
	}

	@OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(IIIIII)V")
	private Class240(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt6676 = arg0;
		this.anInt6682 = arg2;
		this.anInt6688 = arg5;
		this.anInt6687 = arg1;
		this.anInt6679 = arg3;
		this.anInt6677 = arg4;
	}

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "(I)Lclient!oi;")
	public Class240 method5379() {
		return new Class240(this.anInt6676, this.anInt6687, this.anInt6682, this.anInt6679, this.anInt6677, this.anInt6688);
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lclient!oi;I)V")
	public void method5381(@OriginalArg(0) Class240 arg0) {
		this.anInt6676 = arg0.anInt6676;
		this.anInt6688 = arg0.anInt6688;
		this.anInt6682 = arg0.anInt6682;
		this.anInt6677 = arg0.anInt6677;
		this.anInt6679 = arg0.anInt6679;
		this.anInt6687 = arg0.anInt6687;
	}
}
