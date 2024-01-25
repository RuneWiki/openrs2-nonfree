import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bo")
public final class Class6_Sub2_Sub2 extends Class6_Sub2 {

	@OriginalMember(owner = "client!bo", name = "E", descriptor = "[C")
	public static final char[] aCharArray3 = new char[64];

	@OriginalMember(owner = "client!bo", name = "v", descriptor = "I")
	public int anInt618;

	@OriginalMember(owner = "client!bo", name = "u", descriptor = "Ljava/lang/String;")
	public final String aString10;

	@OriginalMember(owner = "client!bo", name = "D", descriptor = "Lclient!dp;")
	public final Class82 aClass82_1;

	static {
		for (@Pc(55) int local55 = 0; local55 < 26; local55++) {
			aCharArray3[local55] = (char) (local55 + 65);
		}
		for (@Pc(71) int local71 = 26; local71 < 52; local71++) {
			aCharArray3[local71] = (char) (local71 + 97 - 26);
		}
		for (@Pc(89) int local89 = 52; local89 < 62; local89++) {
			aCharArray3[local89] = (char) (local89 + 48 - 52);
		}
		aCharArray3[62] = '*';
		aCharArray3[63] = '-';
	}

	@OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class6_Sub2_Sub2(@OriginalArg(0) String arg0) {
		this.aString10 = arg0;
		this.aClass82_1 = new Class82();
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(BLclient!jka;)Z")
	public boolean method612(@OriginalArg(1) Class6_Sub2_Sub11 arg0) {
		@Pc(7) boolean local7 = true;
		arg0.method8464();
		for (@Pc(16) Class6_Sub2_Sub11 local16 = (Class6_Sub2_Sub11) this.aClass82_1.method2071(); local16 != null; local16 = (Class6_Sub2_Sub11) this.aClass82_1.method2078()) {
			if (Static506.method7372(arg0.anInt5173, local16.anInt5173)) {
				Static590.method8205(arg0, local16);
				this.anInt618++;
				if (local7) {
					return false;
				}
				return true;
			}
			local7 = false;
		}
		if (52 != 52) {
			Static51.anInt617 = 17;
		}
		this.aClass82_1.method2076(arg0);
		this.anInt618++;
		return local7;
	}

	@OriginalMember(owner = "client!bo", name = "g", descriptor = "(I)I")
	public int method613() {
		return this.aClass82_1.aClass6_Sub2_17.aClass6_Sub2_65 == this.aClass82_1.aClass6_Sub2_17 ? -1 : ((Class6_Sub2_Sub11) this.aClass82_1.aClass6_Sub2_17.aClass6_Sub2_65).anInt5173;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(ILclient!jka;)Z")
	public boolean method615(@OriginalArg(1) Class6_Sub2_Sub11 arg0) {
		@Pc(7) int local7 = this.method613();
		arg0.method8464();
		this.anInt618--;
		if (this.anInt618 != 0) {
			return this.method613() != local7;
		}
		this.method9051();
		this.method8464();
		Static574.anInt9192--;
		Static519.aClass359_58.method8515(arg0.aLong170, this);
		return false;
	}
}
