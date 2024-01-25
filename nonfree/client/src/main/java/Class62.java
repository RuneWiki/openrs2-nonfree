import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public final class Class62 {

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "I")
	public int anInt2026;

	@OriginalMember(owner = "client!ds", name = "f", descriptor = "I")
	public int anInt2031;

	@OriginalMember(owner = "client!ds", name = "h", descriptor = "I")
	public int anInt2033;

	@OriginalMember(owner = "client!ds", name = "g", descriptor = "I")
	public int anInt2032 = 128;

	@OriginalMember(owner = "client!ds", name = "i", descriptor = "I")
	public int anInt2034 = 128;

	@OriginalMember(owner = "client!ds", name = "l", descriptor = "I")
	public int anInt2036;

	@OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(I)V")
	public Class62(@OriginalArg(0) int arg0) {
		this.anInt2036 = arg0;
	}

	@OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(IIIIII)V")
	private Class62(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt2032 = arg1;
		this.anInt2026 = arg3;
		this.anInt2036 = arg0;
		this.anInt2034 = arg2;
		this.anInt2031 = arg5;
		this.anInt2033 = arg4;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(Z)Lclient!ds;")
	public Class62 method1519() {
		return new Class62(this.anInt2036, this.anInt2032, this.anInt2034, this.anInt2026, this.anInt2033, this.anInt2031);
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(Lclient!ds;I)V")
	public void method1521(@OriginalArg(0) Class62 arg0) {
		this.anInt2036 = arg0.anInt2036;
		this.anInt2032 = arg0.anInt2032;
		this.anInt2034 = arg0.anInt2034;
		this.anInt2026 = arg0.anInt2026;
		this.anInt2033 = arg0.anInt2033;
		this.anInt2031 = arg0.anInt2031;
	}
}
