import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public final class Class2_Sub31 extends Class2 {

	@OriginalMember(owner = "client!qt", name = "E", descriptor = "Z")
	public static boolean aBoolean392 = false;

	@OriginalMember(owner = "client!qt", name = "u", descriptor = "Lclient!gd;")
	public static final Class79 aClass79_117 = new Class79("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos");

	@OriginalMember(owner = "client!qt", name = "K", descriptor = "I")
	public final int anInt5535;

	@OriginalMember(owner = "client!qt", name = "y", descriptor = "I")
	private final int anInt5524;

	@OriginalMember(owner = "client!qt", name = "F", descriptor = "I")
	public final int anInt5530;

	@OriginalMember(owner = "client!qt", name = "G", descriptor = "I")
	private final int anInt5531;

	@OriginalMember(owner = "client!qt", name = "s", descriptor = "I")
	private final int anInt5520;

	@OriginalMember(owner = "client!qt", name = "z", descriptor = "I")
	public final int anInt5525;

	@OriginalMember(owner = "client!qt", name = "t", descriptor = "I")
	private final int anInt5521;

	@OriginalMember(owner = "client!qt", name = "I", descriptor = "I")
	private final int anInt5533;

	@OriginalMember(owner = "client!qt", name = "w", descriptor = "I")
	public final int anInt5522;

	@OriginalMember(owner = "client!qt", name = "<init>", descriptor = "(IIIIIIIII)V", line = 144)
	public Class2_Sub31(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt5535 = arg6;
		this.anInt5524 = arg2;
		this.anInt5530 = arg7;
		this.anInt5531 = arg0;
		this.anInt5520 = arg1;
		this.anInt5525 = arg8;
		this.anInt5521 = arg3;
		this.anInt5533 = arg4;
		this.anInt5522 = arg5;
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(II[II)V", line = 4)
	public void method5060(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		arg1[2] = this.anInt5535 + arg0 - this.anInt5524;
		arg1[1] = arg2 + this.anInt5522 - this.anInt5520;
		arg1[0] = 0;
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(IIB)Z", line = 20)
	public boolean method5061(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 >= this.anInt5522 && arg1 <= this.anInt5530 && this.anInt5535 <= arg0 && arg0 <= this.anInt5525;
	}

	@OriginalMember(owner = "client!qt", name = "b", descriptor = "(II[II)V", line = 37)
	public void method5062(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		arg1[0] = this.anInt5531;
		arg1[2] = this.anInt5524 + arg2 - this.anInt5535;
		arg1[1] = this.anInt5520 + arg0 - this.anInt5522;
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(IIIB)Z", line = 77)
	public boolean method5064(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return arg0 == this.anInt5531 && arg2 >= this.anInt5520 && arg2 <= this.anInt5521 && arg1 >= this.anInt5524 && this.anInt5533 >= arg1;
	}

	@OriginalMember(owner = "client!qt", name = "b", descriptor = "(IZI)Z", line = 129)
	public boolean method5067(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.anInt5520 <= arg1 && arg1 <= this.anInt5521 && arg0 >= this.anInt5524 && this.anInt5533 >= arg0;
	}
}
