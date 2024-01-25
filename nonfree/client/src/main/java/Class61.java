import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public final class Class61 {

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "Lclient!eh;")
	public Class61 aClass61_1;

	@OriginalMember(owner = "client!eh", name = "e", descriptor = "I")
	public int anInt1975;

	@OriginalMember(owner = "client!eh", name = "f", descriptor = "I")
	public int anInt1976;

	@OriginalMember(owner = "client!eh", name = "g", descriptor = "I")
	public int anInt1977;

	@OriginalMember(owner = "client!eh", name = "h", descriptor = "I")
	public int anInt1978;

	@OriginalMember(owner = "client!eh", name = "k", descriptor = "I")
	public int anInt1980;

	@OriginalMember(owner = "client!eh", name = "l", descriptor = "I")
	public int anInt1981;

	@OriginalMember(owner = "client!eh", name = "m", descriptor = "I")
	public int anInt1982;

	@OriginalMember(owner = "client!eh", name = "o", descriptor = "I")
	public int anInt1984;

	@OriginalMember(owner = "client!eh", name = "v", descriptor = "I")
	public int anInt1989;

	@OriginalMember(owner = "client!eh", name = "n", descriptor = "I")
	public final int anInt1983;

	@OriginalMember(owner = "client!eh", name = "j", descriptor = "B")
	public final byte aByte12;

	@OriginalMember(owner = "client!eh", name = "i", descriptor = "I")
	private final int anInt1979;

	@OriginalMember(owner = "client!eh", name = "p", descriptor = "I")
	public final int anInt1985;

	@OriginalMember(owner = "client!eh", name = "r", descriptor = "I")
	public final int anInt1987;

	@OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(IIIIB)V")
	public Class61(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.anInt1983 = arg3;
		this.aByte12 = arg4;
		this.anInt1979 = arg0;
		this.anInt1985 = arg2;
		this.anInt1987 = arg1;
	}

	@OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(Lclient!eh;I)V")
	public Class61(@OriginalArg(0) Class61 arg0, @OriginalArg(1) int arg1) {
		this.aClass61_1 = arg0;
		this.anInt1979 = this.aClass61_1.anInt1979;
		this.anInt1983 = this.aClass61_1.anInt1983 + arg1;
		this.anInt1985 = this.aClass61_1.anInt1985 + arg1;
		this.aByte12 = this.aClass61_1.aByte12;
		this.anInt1987 = this.aClass61_1.anInt1987 + arg1;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Z)Lclient!ob;")
	public Class179 method1769() {
		return Static236.method3984(this.anInt1979);
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIII)Lclient!eh;")
	public Class61 method1770(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return new Class61(this.anInt1979, arg0, arg1, arg2, this.aByte12);
	}
}
