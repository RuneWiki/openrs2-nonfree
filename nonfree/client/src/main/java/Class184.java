import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public final class Class184 {

	@OriginalMember(owner = "client!kq", name = "c", descriptor = "I")
	public int anInt4884;

	@OriginalMember(owner = "client!kq", name = "h", descriptor = "I")
	public int anInt4889;

	@OriginalMember(owner = "client!kq", name = "p", descriptor = "I")
	public int anInt4893;

	@OriginalMember(owner = "client!kq", name = "f", descriptor = "I")
	public int anInt4887 = 128;

	@OriginalMember(owner = "client!kq", name = "m", descriptor = "I")
	public int anInt4891 = 128;

	@OriginalMember(owner = "client!kq", name = "n", descriptor = "I")
	public int anInt4892;

	@OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(I)V")
	public Class184(@OriginalArg(0) int arg0) {
		this.anInt4892 = arg0;
	}

	@OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(IIIIII)V")
	private Class184(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt4887 = arg2;
		this.anInt4892 = arg0;
		this.anInt4889 = arg5;
		this.anInt4891 = arg1;
		this.anInt4884 = arg3;
		this.anInt4893 = arg4;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(I)Lclient!kq;")
	public Class184 method4234() {
		return new Class184(this.anInt4892, this.anInt4891, this.anInt4887, this.anInt4884, this.anInt4893, this.anInt4889);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(Lclient!kq;I)V")
	public void method4238(@OriginalArg(0) Class184 arg0) {
		this.anInt4889 = arg0.anInt4889;
		this.anInt4887 = arg0.anInt4887;
		this.anInt4893 = arg0.anInt4893;
		this.anInt4892 = arg0.anInt4892;
		this.anInt4884 = arg0.anInt4884;
		this.anInt4891 = arg0.anInt4891;
	}
}
