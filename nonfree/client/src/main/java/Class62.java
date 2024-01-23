import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!go")
public final class Class62 {

	@OriginalMember(owner = "client!go", name = "e", descriptor = "I")
	public int anInt1871;

	@OriginalMember(owner = "client!go", name = "c", descriptor = "I")
	public int anInt1870;

	@OriginalMember(owner = "client!go", name = "g", descriptor = "I")
	public int anInt1872;

	@OriginalMember(owner = "client!go", name = "b", descriptor = "Lclient!ig;")
	public Class74 aClass74_1;

	@OriginalMember(owner = "client!go", name = "<init>", descriptor = "(IIII)V")
	public Class62(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) Class74 local5 = Static247.method3798(arg0);
		this.anInt1871 = arg2;
		this.anInt1870 = arg1;
		this.anInt1872 = arg3;
		if (Static251.aBoolean330 || local5.anInt2322 == -1) {
			this.aClass74_1 = local5;
		} else {
			this.aClass74_1 = Static247.method3798(local5.anInt2322);
		}
	}

	@OriginalMember(owner = "client!go", name = "<init>", descriptor = "(Lclient!ig;III)V")
	public Class62(@OriginalArg(0) Class74 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1871 = arg2;
		this.anInt1872 = arg3;
		this.aClass74_1 = arg0;
		this.anInt1870 = arg1;
	}
}
