import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ew")
public final class Class76 {

	@OriginalMember(owner = "client!ew", name = "b", descriptor = "I")
	public int anInt1835;

	@OriginalMember(owner = "client!ew", name = "d", descriptor = "I")
	public int anInt1836;

	@OriginalMember(owner = "client!ew", name = "e", descriptor = "I")
	public int anInt1837;

	@OriginalMember(owner = "client!ew", name = "h", descriptor = "I")
	public int anInt1839;

	@OriginalMember(owner = "client!ew", name = "j", descriptor = "I")
	public int anInt1841;

	@OriginalMember(owner = "client!ew", name = "k", descriptor = "Lclient!ew;")
	public Class76 aClass76_1;

	@OriginalMember(owner = "client!ew", name = "m", descriptor = "I")
	public int anInt1843;

	@OriginalMember(owner = "client!ew", name = "r", descriptor = "I")
	public int anInt1847;

	@OriginalMember(owner = "client!ew", name = "s", descriptor = "I")
	public int anInt1848;

	@OriginalMember(owner = "client!ew", name = "u", descriptor = "I")
	public int anInt1850;

	@OriginalMember(owner = "client!ew", name = "f", descriptor = "B")
	public final byte aByte33;

	@OriginalMember(owner = "client!ew", name = "n", descriptor = "I")
	public final int anInt1844;

	@OriginalMember(owner = "client!ew", name = "l", descriptor = "I")
	private final int anInt1842;

	@OriginalMember(owner = "client!ew", name = "i", descriptor = "I")
	public final int anInt1840;

	@OriginalMember(owner = "client!ew", name = "o", descriptor = "I")
	public final int anInt1845;

	@OriginalMember(owner = "client!ew", name = "<init>", descriptor = "(IIIIB)V")
	public Class76(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.aByte33 = arg4;
		this.anInt1844 = arg1;
		this.anInt1842 = arg0;
		this.anInt1840 = arg3;
		this.anInt1845 = arg2;
	}

	@OriginalMember(owner = "client!ew", name = "<init>", descriptor = "(Lclient!ew;I)V")
	public Class76(@OriginalArg(0) Class76 arg0, @OriginalArg(1) int arg1) {
		this.aClass76_1 = arg0;
		this.aByte33 = this.aClass76_1.aByte33;
		this.anInt1842 = this.aClass76_1.anInt1842;
		this.anInt1840 = this.aClass76_1.anInt1840 + arg1;
		this.anInt1844 = arg1 + this.aClass76_1.anInt1844;
		this.anInt1845 = this.aClass76_1.anInt1845 + arg1;
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(I)Lclient!jb;")
	public Class132 method1515() {
		return Static126.method1762(this.anInt1842);
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(IIII)Lclient!ew;")
	public Class76 method1516(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return new Class76(this.anInt1842, arg1, arg2, arg0, this.aByte33);
	}
}
