import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public final class Class131 {

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "I")
	public int anInt4035;

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "I")
	public int anInt4037;

	@OriginalMember(owner = "client!kk", name = "d", descriptor = "I")
	public int anInt4038;

	@OriginalMember(owner = "client!kk", name = "e", descriptor = "I")
	public int anInt4039;

	@OriginalMember(owner = "client!kk", name = "f", descriptor = "I")
	public int anInt4040;

	@OriginalMember(owner = "client!kk", name = "j", descriptor = "I")
	public int anInt4044;

	@OriginalMember(owner = "client!kk", name = "k", descriptor = "I")
	public int anInt4045;

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "I")
	public int anInt4036 = 128;

	@OriginalMember(owner = "client!kk", name = "m", descriptor = "I")
	public int anInt4046 = 128;

	@OriginalMember(owner = "client!kk", name = "g", descriptor = "I")
	public int anInt4041;

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(I)V")
	public Class131(@OriginalArg(0) int arg0) {
		this.anInt4041 = arg0;
	}

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(IIIIII)V")
	private Class131(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt4040 = arg3;
		this.anInt4041 = arg0;
		this.anInt4036 = arg1;
		this.anInt4035 = arg5;
		this.anInt4046 = arg2;
		this.anInt4039 = arg4;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lclient!kk;B)V")
	public void method3227(@OriginalArg(0) Class131 arg0) {
		this.anInt4035 = arg0.anInt4035;
		this.anInt4040 = arg0.anInt4040;
		this.anInt4039 = arg0.anInt4039;
		this.anInt4041 = arg0.anInt4041;
		this.anInt4036 = arg0.anInt4036;
		this.anInt4046 = arg0.anInt4046;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(B)Lclient!kk;")
	public Class131 method3230() {
		return new Class131(this.anInt4041, this.anInt4036, this.anInt4046, this.anInt4040, this.anInt4039, this.anInt4035);
	}
}
