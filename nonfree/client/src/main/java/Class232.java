import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public final class Class232 {

	@OriginalMember(owner = "client!ub", name = "g", descriptor = "I")
	public int anInt6895;

	@OriginalMember(owner = "client!ub", name = "h", descriptor = "I")
	public int anInt6896;

	@OriginalMember(owner = "client!ub", name = "m", descriptor = "I")
	public int anInt6900;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
	public int anInt6890 = 128;

	@OriginalMember(owner = "client!ub", name = "r", descriptor = "I")
	public int anInt6904 = 128;

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
	public int anInt6891;

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(I)V")
	public Class232(@OriginalArg(0) int arg0) {
		this.anInt6891 = arg0;
	}

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(IIIIII)V")
	private Class232(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt6890 = arg1;
		this.anInt6900 = arg4;
		this.anInt6895 = arg3;
		this.anInt6896 = arg5;
		this.anInt6904 = arg2;
		this.anInt6891 = arg0;
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)Lclient!ub;")
	public Class232 method5367() {
		return new Class232(this.anInt6891, this.anInt6890, this.anInt6904, this.anInt6895, this.anInt6900, this.anInt6896);
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILclient!ub;)V")
	public void method5369(@OriginalArg(1) Class232 arg0) {
		this.anInt6896 = arg0.anInt6896;
		this.anInt6890 = arg0.anInt6890;
		this.anInt6891 = arg0.anInt6891;
		this.anInt6904 = arg0.anInt6904;
		this.anInt6900 = arg0.anInt6900;
		this.anInt6895 = arg0.anInt6895;
	}
}
