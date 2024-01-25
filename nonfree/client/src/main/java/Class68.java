import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public final class Class68 {

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "I")
	public int anInt1934;

	@OriginalMember(owner = "client!dl", name = "c", descriptor = "I")
	public int anInt1935;

	@OriginalMember(owner = "client!dl", name = "e", descriptor = "I")
	public int anInt1936;

	@OriginalMember(owner = "client!dl", name = "g", descriptor = "Lclient!dl;")
	public Class68 aClass68_1;

	@OriginalMember(owner = "client!dl", name = "i", descriptor = "I")
	public int anInt1939;

	@OriginalMember(owner = "client!dl", name = "j", descriptor = "I")
	public int anInt1940;

	@OriginalMember(owner = "client!dl", name = "k", descriptor = "I")
	public int anInt1941;

	@OriginalMember(owner = "client!dl", name = "n", descriptor = "I")
	public int anInt1943;

	@OriginalMember(owner = "client!dl", name = "q", descriptor = "I")
	public int anInt1946;

	@OriginalMember(owner = "client!dl", name = "s", descriptor = "I")
	public int anInt1947;

	@OriginalMember(owner = "client!dl", name = "l", descriptor = "I")
	private final int anInt1942;

	@OriginalMember(owner = "client!dl", name = "h", descriptor = "I")
	public final int anInt1938;

	@OriginalMember(owner = "client!dl", name = "m", descriptor = "B")
	public final byte aByte34;

	@OriginalMember(owner = "client!dl", name = "o", descriptor = "I")
	public final int anInt1944;

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "I")
	public final int anInt1933;

	static {
		new Class45("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs chargée", "Dados da lista de mundos carregados");
	}

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(IIIIB)V")
	public Class68(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.anInt1942 = arg0;
		this.anInt1938 = arg3;
		this.aByte34 = arg4;
		this.anInt1944 = arg2;
		this.anInt1933 = arg1;
	}

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(Lclient!dl;I)V")
	public Class68(@OriginalArg(0) Class68 arg0, @OriginalArg(1) int arg1) {
		this.aClass68_1 = arg0;
		this.anInt1944 = arg1 + this.aClass68_1.anInt1944;
		this.anInt1933 = arg1 + this.aClass68_1.anInt1933;
		this.aByte34 = this.aClass68_1.aByte34;
		this.anInt1942 = this.aClass68_1.anInt1942;
		this.anInt1938 = arg1 + this.aClass68_1.anInt1938;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIII)Lclient!dl;")
	public Class68 method1840(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return new Class68(this.anInt1942, arg0, arg2, arg1, this.aByte34);
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(B)Lclient!ol;")
	public Class216 method1842() {
		return Static88.method1877(this.anInt1942);
	}
}
