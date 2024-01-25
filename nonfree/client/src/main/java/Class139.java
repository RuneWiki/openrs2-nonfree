import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public final class Class139 {

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "I")
	public int anInt4071;

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "I")
	public int anInt4074;

	@OriginalMember(owner = "client!kd", name = "h", descriptor = "I")
	public int anInt4077;

	@OriginalMember(owner = "client!kd", name = "g", descriptor = "I")
	public int anInt4076 = 128;

	@OriginalMember(owner = "client!kd", name = "i", descriptor = "I")
	public int anInt4078 = 128;

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "I")
	public int anInt4072;

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(I)V")
	public Class139(@OriginalArg(0) int arg0) {
		this.anInt4072 = arg0;
	}

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(IIIIII)V")
	private Class139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt4074 = arg4;
		this.anInt4077 = arg5;
		this.anInt4078 = arg2;
		this.anInt4071 = arg3;
		this.anInt4076 = arg1;
		this.anInt4072 = arg0;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Z)Lclient!kd;")
	public Class139 method3242() {
		return new Class139(this.anInt4072, this.anInt4076, this.anInt4078, this.anInt4071, this.anInt4074, this.anInt4077);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILclient!kd;)V")
	public void method3247(@OriginalArg(1) Class139 arg0) {
		this.anInt4072 = arg0.anInt4072;
		this.anInt4077 = arg0.anInt4077;
		this.anInt4078 = arg0.anInt4078;
		this.anInt4071 = arg0.anInt4071;
		this.anInt4076 = arg0.anInt4076;
		this.anInt4074 = arg0.anInt4074;
	}
}
