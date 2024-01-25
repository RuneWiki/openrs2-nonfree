import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public final class Class9 {

	@OriginalMember(owner = "client!ag", name = "e", descriptor = "I")
	public int anInt225;

	@OriginalMember(owner = "client!ag", name = "g", descriptor = "I")
	public int anInt230;

	@OriginalMember(owner = "client!ag", name = "h", descriptor = "I")
	public int anInt231;

	@OriginalMember(owner = "client!ag", name = "n", descriptor = "I")
	public int anInt232;

	@OriginalMember(owner = "client!ag", name = "k", descriptor = "I")
	public int anInt234;

	@OriginalMember(owner = "client!ag", name = "q", descriptor = "I")
	public int anInt236;

	@OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
	public int anInt237;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "I")
	public int anInt238;

	@OriginalMember(owner = "client!ag", name = "l", descriptor = "I")
	public int anInt226 = 128;

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "I")
	public int anInt235 = 128;

	@OriginalMember(owner = "client!ag", name = "m", descriptor = "I")
	public int anInt228;

	@OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(I)V")
	public Class9(@OriginalArg(0) int arg0) {
		this.anInt228 = arg0;
	}

	@OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(IIIIII)V")
	private Class9(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt228 = arg0;
		this.anInt235 = arg2;
		this.anInt234 = arg4;
		this.anInt226 = arg1;
		this.anInt230 = arg5;
		this.anInt225 = arg3;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILclient!ag;)V")
	public void method240(@OriginalArg(1) Class9 arg0) {
		this.anInt228 = arg0.anInt228;
		this.anInt226 = arg0.anInt226;
		this.anInt235 = arg0.anInt235;
		this.anInt234 = arg0.anInt234;
		this.anInt225 = arg0.anInt225;
		this.anInt230 = arg0.anInt230;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)Lclient!ag;")
	public Class9 method241() {
		return new Class9(this.anInt228, this.anInt226, this.anInt235, this.anInt225, this.anInt234, this.anInt230);
	}
}
