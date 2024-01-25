import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public final class Class54 {

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "I")
	public int anInt1805;

	@OriginalMember(owner = "client!cn", name = "e", descriptor = "I")
	public int anInt1809;

	@OriginalMember(owner = "client!cn", name = "f", descriptor = "I")
	public int anInt1810;

	@OriginalMember(owner = "client!cn", name = "i", descriptor = "I")
	public int anInt1813 = 128;

	@OriginalMember(owner = "client!cn", name = "k", descriptor = "I")
	public int anInt1815 = 128;

	@OriginalMember(owner = "client!cn", name = "g", descriptor = "I")
	public int anInt1811;

	@OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(I)V")
	public Class54(@OriginalArg(0) int arg0) {
		this.anInt1811 = arg0;
	}

	@OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(IIIIII)V")
	private Class54(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt1809 = arg5;
		this.anInt1815 = arg2;
		this.anInt1805 = arg4;
		this.anInt1813 = arg1;
		this.anInt1810 = arg3;
		this.anInt1811 = arg0;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(Lclient!cn;B)V")
	public void method1594(@OriginalArg(0) Class54 arg0) {
		this.anInt1811 = arg0.anInt1811;
		this.anInt1805 = arg0.anInt1805;
		this.anInt1809 = arg0.anInt1809;
		this.anInt1810 = arg0.anInt1810;
		this.anInt1813 = arg0.anInt1813;
		this.anInt1815 = arg0.anInt1815;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(B)Lclient!cn;")
	public Class54 method1595() {
		return new Class54(this.anInt1811, this.anInt1813, this.anInt1815, this.anInt1810, this.anInt1805, this.anInt1809);
	}
}
