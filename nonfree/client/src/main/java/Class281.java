import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rda")
public final class Class281 {

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "I")
	public int anInt7875;

	@OriginalMember(owner = "client!rda", name = "d", descriptor = "I")
	public int anInt7878;

	@OriginalMember(owner = "client!rda", name = "j", descriptor = "I")
	public int anInt7883;

	@OriginalMember(owner = "client!rda", name = "f", descriptor = "I")
	public int anInt7880 = 128;

	@OriginalMember(owner = "client!rda", name = "k", descriptor = "I")
	public int anInt7884 = 128;

	@OriginalMember(owner = "client!rda", name = "e", descriptor = "I")
	public int anInt7879;

	@OriginalMember(owner = "client!rda", name = "<init>", descriptor = "(I)V")
	public Class281(@OriginalArg(0) int arg0) {
		this.anInt7879 = arg0;
	}

	@OriginalMember(owner = "client!rda", name = "<init>", descriptor = "(IIIIII)V")
	private Class281(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt7884 = arg1;
		this.anInt7883 = arg5;
		this.anInt7880 = arg2;
		this.anInt7878 = arg3;
		this.anInt7879 = arg0;
		this.anInt7875 = arg4;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(I)Lclient!rda;")
	public Class281 method6469() {
		return new Class281(this.anInt7879, this.anInt7884, this.anInt7880, this.anInt7878, this.anInt7875, this.anInt7883);
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(BLclient!rda;)V")
	public void method6471(@OriginalArg(1) Class281 arg0) {
		this.anInt7880 = arg0.anInt7880;
		this.anInt7883 = arg0.anInt7883;
		this.anInt7875 = arg0.anInt7875;
		this.anInt7879 = arg0.anInt7879;
		this.anInt7884 = arg0.anInt7884;
		this.anInt7878 = arg0.anInt7878;
	}
}
