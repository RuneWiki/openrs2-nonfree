import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public final class Class303 {

	@OriginalMember(owner = "client!qn", name = "d", descriptor = "I")
	public int anInt8814;

	@OriginalMember(owner = "client!qn", name = "h", descriptor = "I")
	public int anInt8817;

	@OriginalMember(owner = "client!qn", name = "j", descriptor = "I")
	public int anInt8819;

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "I")
	public int anInt8812 = 128;

	@OriginalMember(owner = "client!qn", name = "l", descriptor = "I")
	public int anInt8821 = 128;

	@OriginalMember(owner = "client!qn", name = "f", descriptor = "I")
	public int anInt8816;

	@OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(I)V")
	public Class303(@OriginalArg(0) int arg0) {
		this.anInt8816 = arg0;
	}

	@OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(IIIIII)V")
	private Class303(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt8812 = arg2;
		this.anInt8817 = arg5;
		this.anInt8819 = arg4;
		this.anInt8814 = arg3;
		this.anInt8821 = arg1;
		this.anInt8816 = arg0;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(B)Lclient!qn;")
	public Class303 method7793() {
		return new Class303(this.anInt8816, this.anInt8821, this.anInt8812, this.anInt8814, this.anInt8819, this.anInt8817);
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(BLclient!qn;)V")
	public void method7794(@OriginalArg(1) Class303 arg0) {
		this.anInt8812 = arg0.anInt8812;
		this.anInt8821 = arg0.anInt8821;
		this.anInt8817 = arg0.anInt8817;
		this.anInt8814 = arg0.anInt8814;
		this.anInt8816 = arg0.anInt8816;
		this.anInt8819 = arg0.anInt8819;
	}
}
