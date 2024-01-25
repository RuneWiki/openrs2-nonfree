import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public final class Class93 {

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "I")
	public int anInt2213;

	@OriginalMember(owner = "client!ft", name = "c", descriptor = "I")
	public int anInt2215;

	@OriginalMember(owner = "client!ft", name = "e", descriptor = "I")
	public int anInt2217;

	@OriginalMember(owner = "client!ft", name = "g", descriptor = "I")
	public int anInt2218;

	@OriginalMember(owner = "client!ft", name = "j", descriptor = "I")
	public int anInt2221;

	@OriginalMember(owner = "client!ft", name = "n", descriptor = "I")
	public int anInt2225;

	@OriginalMember(owner = "client!ft", name = "o", descriptor = "I")
	public int anInt2226;

	@OriginalMember(owner = "client!ft", name = "b", descriptor = "I")
	public int anInt2214 = 128;

	@OriginalMember(owner = "client!ft", name = "m", descriptor = "I")
	public int anInt2224 = 128;

	@OriginalMember(owner = "client!ft", name = "d", descriptor = "I")
	public int anInt2216;

	@OriginalMember(owner = "client!ft", name = "<init>", descriptor = "(I)V")
	public Class93(@OriginalArg(0) int arg0) {
		this.anInt2216 = arg0;
	}

	@OriginalMember(owner = "client!ft", name = "<init>", descriptor = "(IIIIII)V")
	private Class93(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt2226 = arg5;
		this.anInt2215 = arg4;
		this.anInt2214 = arg1;
		this.anInt2224 = arg2;
		this.anInt2217 = arg3;
		this.anInt2216 = arg0;
	}

	@OriginalMember(owner = "client!ft", name = "b", descriptor = "(I)Lclient!ft;")
	public Class93 method1812() {
		return new Class93(this.anInt2216, this.anInt2214, this.anInt2224, this.anInt2217, this.anInt2215, this.anInt2226);
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(Lclient!ft;I)V")
	public void method1813(@OriginalArg(0) Class93 arg0) {
		this.anInt2226 = arg0.anInt2226;
		this.anInt2224 = arg0.anInt2224;
		this.anInt2216 = arg0.anInt2216;
		this.anInt2215 = arg0.anInt2215;
		this.anInt2214 = arg0.anInt2214;
		this.anInt2217 = arg0.anInt2217;
	}
}
