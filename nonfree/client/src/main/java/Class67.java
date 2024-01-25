import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public final class Class67 {

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "I")
	public int anInt2073;

	@OriginalMember(owner = "client!dk", name = "c", descriptor = "I")
	public int anInt2074;

	@OriginalMember(owner = "client!dk", name = "d", descriptor = "I")
	public int anInt2075;

	@OriginalMember(owner = "client!dk", name = "f", descriptor = "I")
	public int anInt2077;

	@OriginalMember(owner = "client!dk", name = "h", descriptor = "I")
	public int anInt2079;

	@OriginalMember(owner = "client!dk", name = "k", descriptor = "I")
	public int anInt2082;

	@OriginalMember(owner = "client!dk", name = "m", descriptor = "I")
	public int anInt2084;

	@OriginalMember(owner = "client!dk", name = "p", descriptor = "I")
	public int anInt2087;

	@OriginalMember(owner = "client!dk", name = "e", descriptor = "I")
	public int anInt2076 = 128;

	@OriginalMember(owner = "client!dk", name = "r", descriptor = "I")
	public int anInt2089 = 128;

	@OriginalMember(owner = "client!dk", name = "l", descriptor = "I")
	public int anInt2083;

	@OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(I)V")
	public Class67(@OriginalArg(0) int arg0) {
		this.anInt2083 = arg0;
	}

	@OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(IIIIII)V")
	private Class67(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt2076 = arg2;
		this.anInt2073 = arg3;
		this.anInt2077 = arg5;
		this.anInt2083 = arg0;
		this.anInt2089 = arg1;
		this.anInt2075 = arg4;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lclient!dk;B)V")
	public void method2029(@OriginalArg(0) Class67 arg0) {
		this.anInt2076 = arg0.anInt2076;
		this.anInt2083 = arg0.anInt2083;
		this.anInt2075 = arg0.anInt2075;
		this.anInt2073 = arg0.anInt2073;
		this.anInt2089 = arg0.anInt2089;
		this.anInt2077 = arg0.anInt2077;
	}

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "(I)Lclient!dk;")
	public Class67 method2030() {
		return new Class67(this.anInt2083, this.anInt2089, this.anInt2076, this.anInt2073, this.anInt2075, this.anInt2077);
	}
}
