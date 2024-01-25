import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!naa")
public final class Class214 {

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "I")
	public int anInt5982;

	@OriginalMember(owner = "client!naa", name = "f", descriptor = "I")
	public int anInt5985;

	@OriginalMember(owner = "client!naa", name = "n", descriptor = "I")
	public int anInt5993;

	@OriginalMember(owner = "client!naa", name = "i", descriptor = "I")
	public int anInt5988 = 128;

	@OriginalMember(owner = "client!naa", name = "o", descriptor = "I")
	public int anInt5994 = 128;

	@OriginalMember(owner = "client!naa", name = "k", descriptor = "I")
	public int anInt5990;

	@OriginalMember(owner = "client!naa", name = "<init>", descriptor = "(I)V")
	public Class214(@OriginalArg(0) int arg0) {
		this.anInt5990 = arg0;
	}

	@OriginalMember(owner = "client!naa", name = "<init>", descriptor = "(IIIIII)V")
	private Class214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt5988 = arg1;
		this.anInt5982 = arg3;
		this.anInt5990 = arg0;
		this.anInt5993 = arg4;
		this.anInt5985 = arg5;
		this.anInt5994 = arg2;
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(Lclient!naa;B)V")
	public void method5142(@OriginalArg(0) Class214 arg0) {
		this.anInt5982 = arg0.anInt5982;
		this.anInt5988 = arg0.anInt5988;
		this.anInt5985 = arg0.anInt5985;
		this.anInt5994 = arg0.anInt5994;
		this.anInt5990 = arg0.anInt5990;
		this.anInt5993 = arg0.anInt5993;
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(I)Lclient!naa;")
	public Class214 method5143() {
		return new Class214(this.anInt5990, this.anInt5988, this.anInt5994, this.anInt5982, this.anInt5993, this.anInt5985);
	}
}
