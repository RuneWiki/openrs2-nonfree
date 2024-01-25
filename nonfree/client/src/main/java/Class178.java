import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kba")
public final class Class178 {

	@OriginalMember(owner = "client!kba", name = "f", descriptor = "I")
	public int anInt4996;

	@OriginalMember(owner = "client!kba", name = "j", descriptor = "I")
	public int anInt4999;

	@OriginalMember(owner = "client!kba", name = "k", descriptor = "I")
	public int anInt5000;

	@OriginalMember(owner = "client!kba", name = "d", descriptor = "I")
	public int anInt4994 = 128;

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "I")
	public int anInt4991 = 128;

	@OriginalMember(owner = "client!kba", name = "e", descriptor = "I")
	public int anInt4995;

	@OriginalMember(owner = "client!kba", name = "<init>", descriptor = "(I)V")
	public Class178(@OriginalArg(0) int arg0) {
		this.anInt4995 = arg0;
	}

	@OriginalMember(owner = "client!kba", name = "<init>", descriptor = "(IIIIII)V")
	private Class178(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt4994 = arg2;
		this.anInt4999 = arg5;
		this.anInt5000 = arg3;
		this.anInt4995 = arg0;
		this.anInt4996 = arg4;
		this.anInt4991 = arg1;
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(B)Lclient!kba;")
	public Class178 method4354() {
		return new Class178(this.anInt4995, this.anInt4991, this.anInt4994, this.anInt5000, this.anInt4996, this.anInt4999);
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(ILclient!kba;)V")
	public void method4357(@OriginalArg(1) Class178 arg0) {
		this.anInt4991 = arg0.anInt4991;
		this.anInt4995 = arg0.anInt4995;
		this.anInt4999 = arg0.anInt4999;
		this.anInt5000 = arg0.anInt5000;
		this.anInt4996 = arg0.anInt4996;
		this.anInt4994 = arg0.anInt4994;
	}
}
