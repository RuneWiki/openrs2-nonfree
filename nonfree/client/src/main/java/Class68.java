import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ed")
public final class Class68 {

	@OriginalMember(owner = "client!ed", name = "e", descriptor = "I")
	private int anInt1996;

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "I")
	private int anInt1994;

	@OriginalMember(owner = "client!ed", name = "l", descriptor = "I")
	private int anInt2003;

	@OriginalMember(owner = "client!ed", name = "o", descriptor = "I")
	private int anInt2006;

	@OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
	private int anInt1997;

	@OriginalMember(owner = "client!ed", name = "h", descriptor = "I")
	private int anInt1999;

	@OriginalMember(owner = "client!ed", name = "n", descriptor = "I")
	private int anInt2005;

	@OriginalMember(owner = "client!ed", name = "m", descriptor = "I")
	private int anInt2004;

	@OriginalMember(owner = "client!ed", name = "i", descriptor = "I")
	private int anInt2000;

	@OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
	private int anInt1998;

	static {
		new Class202("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs chargée", "Dados da lista de mundos carregados");
	}

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class68(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.anInt1996 = arg2;
		this.anInt1994 = arg0;
		this.anInt2003 = arg1;
		this.anInt2006 = arg3 * arg3;
		this.anInt1997 = this.anInt1996 + arg8;
		this.anInt1999 = arg4 + this.anInt1994;
		this.anInt2005 = arg7 + this.anInt2003;
		this.anInt2004 = arg6 + this.anInt2003;
		this.anInt2000 = this.anInt1994 + arg5;
		this.anInt1998 = arg9 + this.anInt1996;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIIZIIIII)V")
	public void method1935(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		this.anInt1994 = arg5;
		this.anInt2006 = arg6 * arg6;
		this.anInt2003 = arg8;
		this.anInt1996 = arg1;
		this.anInt1999 = arg2 + this.anInt1994;
		this.anInt2005 = this.anInt2003 + arg0;
		this.anInt2004 = arg3 + this.anInt2003;
		this.anInt1997 = this.anInt1996 + arg7;
		this.anInt2000 = arg9 + this.anInt1994;
		this.anInt1998 = this.anInt1996 + arg4;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIII)Z")
	public boolean method1936(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (this.anInt1999 > arg2 || arg2 > this.anInt2000) {
			return false;
		} else if (this.anInt2004 > arg0 || arg0 > this.anInt2005) {
			return false;
		} else if (arg1 >= this.anInt1997 && arg1 <= this.anInt1998) {
			@Pc(51) int local51 = arg2 - this.anInt1994;
			@Pc(61) int local61 = arg1 - this.anInt1996;
			return local51 * local51 + local61 * local61 < this.anInt2006;
		} else {
			return false;
		}
	}
}
