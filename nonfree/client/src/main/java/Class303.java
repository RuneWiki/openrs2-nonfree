import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qia")
public final class Class303 {

	@OriginalMember(owner = "client!qia", name = "g", descriptor = "I")
	public int anInt8868;

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "I")
	public int anInt8871;

	@OriginalMember(owner = "client!qia", name = "j", descriptor = "I")
	public int anInt8872;

	@OriginalMember(owner = "client!qia", name = "c", descriptor = "I")
	public int anInt8875 = 128;

	@OriginalMember(owner = "client!qia", name = "f", descriptor = "I")
	public int anInt8877 = 128;

	@OriginalMember(owner = "client!qia", name = "h", descriptor = "I")
	public int anInt8869;

	@OriginalMember(owner = "client!qia", name = "<init>", descriptor = "(I)V")
	public Class303(@OriginalArg(0) int arg0) {
		this.anInt8869 = arg0;
	}

	@OriginalMember(owner = "client!qia", name = "<init>", descriptor = "(IIIIII)V")
	private Class303(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt8877 = arg1;
		this.anInt8869 = arg0;
		this.anInt8868 = arg4;
		this.anInt8871 = arg3;
		this.anInt8875 = arg2;
		this.anInt8872 = arg5;
	}

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(I)Lclient!qia;")
	public Class303 method7427() {
		return new Class303(this.anInt8869, this.anInt8877, this.anInt8875, this.anInt8871, this.anInt8868, this.anInt8872);
	}

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(BLclient!qia;)V")
	public void method7428(@OriginalArg(1) Class303 arg0) {
		this.anInt8869 = arg0.anInt8869;
		this.anInt8872 = arg0.anInt8872;
		this.anInt8875 = arg0.anInt8875;
		this.anInt8877 = arg0.anInt8877;
		this.anInt8871 = arg0.anInt8871;
		this.anInt8868 = arg0.anInt8868;
	}
}
