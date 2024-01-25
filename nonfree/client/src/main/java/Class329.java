import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ufa")
public final class Class329 {

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "I")
	public int anInt8862;

	@OriginalMember(owner = "client!ufa", name = "g", descriptor = "I")
	public int anInt8867;

	@OriginalMember(owner = "client!ufa", name = "h", descriptor = "I")
	public int anInt8868;

	@OriginalMember(owner = "client!ufa", name = "i", descriptor = "I")
	public int anInt8869;

	@OriginalMember(owner = "client!ufa", name = "k", descriptor = "I")
	public int anInt8871;

	@OriginalMember(owner = "client!ufa", name = "l", descriptor = "I")
	public int anInt8872;

	@OriginalMember(owner = "client!ufa", name = "m", descriptor = "I")
	public int anInt8873;

	@OriginalMember(owner = "client!ufa", name = "n", descriptor = "I")
	public int anInt8874;

	@OriginalMember(owner = "client!ufa", name = "b", descriptor = "I")
	public int anInt8863 = 128;

	@OriginalMember(owner = "client!ufa", name = "q", descriptor = "I")
	public int anInt8877 = 128;

	@OriginalMember(owner = "client!ufa", name = "o", descriptor = "I")
	public int anInt8875;

	@OriginalMember(owner = "client!ufa", name = "<init>", descriptor = "(I)V")
	public Class329(@OriginalArg(0) int arg0) {
		this.anInt8875 = arg0;
	}

	@OriginalMember(owner = "client!ufa", name = "<init>", descriptor = "(IIIIII)V")
	private Class329(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt8863 = arg1;
		this.anInt8875 = arg0;
		this.anInt8872 = arg3;
		this.anInt8862 = arg4;
		this.anInt8877 = arg2;
		this.anInt8868 = arg5;
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(Lclient!ufa;I)V")
	public void method7253(@OriginalArg(0) Class329 arg0) {
		this.anInt8872 = arg0.anInt8872;
		this.anInt8863 = arg0.anInt8863;
		this.anInt8862 = arg0.anInt8862;
		this.anInt8877 = arg0.anInt8877;
		this.anInt8875 = arg0.anInt8875;
		this.anInt8868 = arg0.anInt8868;
	}

	@OriginalMember(owner = "client!ufa", name = "c", descriptor = "(I)Lclient!ufa;")
	public Class329 method7254() {
		return new Class329(this.anInt8875, this.anInt8863, this.anInt8877, this.anInt8872, this.anInt8862, this.anInt8868);
	}
}
