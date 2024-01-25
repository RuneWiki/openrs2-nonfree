import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kga")
public final class Class192 {

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "I")
	public int anInt5167;

	@OriginalMember(owner = "client!kga", name = "d", descriptor = "I")
	public int anInt5169;

	@OriginalMember(owner = "client!kga", name = "e", descriptor = "I")
	public int anInt5170;

	@OriginalMember(owner = "client!kga", name = "f", descriptor = "I")
	public int anInt5171 = 128;

	@OriginalMember(owner = "client!kga", name = "j", descriptor = "I")
	public int anInt5174 = 128;

	@OriginalMember(owner = "client!kga", name = "c", descriptor = "I")
	public int anInt5168;

	@OriginalMember(owner = "client!kga", name = "<init>", descriptor = "(I)V")
	public Class192(@OriginalArg(0) int arg0) {
		this.anInt5168 = arg0;
	}

	@OriginalMember(owner = "client!kga", name = "<init>", descriptor = "(IIIIII)V")
	private Class192(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt5167 = arg4;
		this.anInt5171 = arg1;
		this.anInt5170 = arg3;
		this.anInt5169 = arg5;
		this.anInt5168 = arg0;
		this.anInt5174 = arg2;
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(ILclient!kga;)V")
	public void method4367(@OriginalArg(1) Class192 arg0) {
		this.anInt5169 = arg0.anInt5169;
		this.anInt5171 = arg0.anInt5171;
		this.anInt5168 = arg0.anInt5168;
		this.anInt5174 = arg0.anInt5174;
		this.anInt5170 = arg0.anInt5170;
		this.anInt5167 = arg0.anInt5167;
	}

	@OriginalMember(owner = "client!kga", name = "b", descriptor = "(I)Lclient!kga;")
	public Class192 method4369() {
		return new Class192(this.anInt5168, this.anInt5171, this.anInt5174, this.anInt5170, this.anInt5167, this.anInt5169);
	}
}
