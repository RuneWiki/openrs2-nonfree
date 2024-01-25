import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public final class Class141 {

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "I")
	public int anInt4238;

	@OriginalMember(owner = "client!nj", name = "d", descriptor = "I")
	public int anInt4241;

	@OriginalMember(owner = "client!nj", name = "g", descriptor = "I")
	public int anInt4243;

	@OriginalMember(owner = "client!nj", name = "l", descriptor = "I")
	public int anInt4246;

	@OriginalMember(owner = "client!nj", name = "m", descriptor = "B")
	private byte aByte27;

	@OriginalMember(owner = "client!nj", name = "o", descriptor = "I")
	public int anInt4248;

	@OriginalMember(owner = "client!nj", name = "<init>", descriptor = "()V")
	public Class141() {
	}

	@OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(Lclient!rg;)V")
	public Class141(@OriginalArg(0) Class5_Sub12 arg0) {
		this.aByte27 = arg0.method5098();
		this.anInt4246 = arg0.method5106();
		this.anInt4238 = arg0.method5067();
		this.anInt4241 = arg0.method5067();
		this.anInt4243 = arg0.method5067();
		this.anInt4248 = arg0.method5067();
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)I")
	public int method3929() {
		return this.aByte27 & 0x7;
	}

	@OriginalMember(owner = "client!nj", name = "d", descriptor = "(I)I")
	public int method3932() {
		return (this.aByte27 & 0x8) == 8 ? 1 : 0;
	}
}
