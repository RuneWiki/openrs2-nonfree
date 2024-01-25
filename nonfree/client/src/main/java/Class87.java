import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!go")
public final class Class87 {

	@OriginalMember(owner = "client!go", name = "l", descriptor = "[I")
	public static final int[] anIntArray463 = new int[256];

	@OriginalMember(owner = "client!go", name = "h", descriptor = "Lclient!kj;")
	private Class2_Sub10 aClass2_Sub10_24;

	@OriginalMember(owner = "client!go", name = "g", descriptor = "Lclient!kj;")
	private final Class2_Sub10 aClass2_Sub10_23 = new Class2_Sub10();

	static {
		for (@Pc(14) int local14 = 0; local14 < 256; local14++) {
			@Pc(17) int local17 = local14;
			for (@Pc(19) int local19 = 0; local19 < 8; local19++) {
				if ((local17 & 0x1) == 1) {
					local17 = local17 >>> 1 ^ 0xEDB88320;
				} else {
					local17 >>>= 0x1;
				}
			}
			anIntArray463[local14] = local17;
		}
		new Class32("To interact with this please login to a members' server.", "Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.", "Veuillez vous connecter à un serveur d'abonnés pour cette interaction.", "Para interagir, acesse um servidor para membros.");
	}

	@OriginalMember(owner = "client!go", name = "<init>", descriptor = "()V")
	public Class87() {
		this.aClass2_Sub10_23.aClass2_Sub10_53 = this.aClass2_Sub10_23;
		this.aClass2_Sub10_23.aClass2_Sub10_54 = this.aClass2_Sub10_23;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(Z)Lclient!kj;")
	public Class2_Sub10 method2352() {
		@Pc(11) Class2_Sub10 local11 = this.aClass2_Sub10_24;
		if (this.aClass2_Sub10_23 == local11) {
			this.aClass2_Sub10_24 = null;
			return null;
		} else {
			this.aClass2_Sub10_24 = local11.aClass2_Sub10_53;
			return local11;
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(I)Lclient!kj;")
	public Class2_Sub10 method2353() {
		@Pc(11) Class2_Sub10 local11 = this.aClass2_Sub10_23.aClass2_Sub10_53;
		if (local11 == this.aClass2_Sub10_23) {
			this.aClass2_Sub10_24 = null;
			return null;
		} else {
			this.aClass2_Sub10_24 = local11.aClass2_Sub10_53;
			return local11;
		}
	}

	@OriginalMember(owner = "client!go", name = "b", descriptor = "(I)I")
	public int method2356() {
		@Pc(5) int local5 = 0;
		for (@Pc(9) Class2_Sub10 local9 = this.aClass2_Sub10_23.aClass2_Sub10_53; local9 != this.aClass2_Sub10_23; local9 = local9.aClass2_Sub10_53) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!go", name = "c", descriptor = "(I)V")
	public void method2358() {
		while (true) {
			@Pc(13) Class2_Sub10 local13 = this.aClass2_Sub10_23.aClass2_Sub10_53;
			if (local13 == this.aClass2_Sub10_23) {
				this.aClass2_Sub10_24 = null;
				return;
			}
			local13.method5572();
		}
	}

	@OriginalMember(owner = "client!go", name = "b", descriptor = "(B)Lclient!kj;")
	public Class2_Sub10 method2359() {
		@Pc(14) Class2_Sub10 local14 = this.aClass2_Sub10_23.aClass2_Sub10_53;
		if (this.aClass2_Sub10_23 == local14) {
			return null;
		} else {
			local14.method5572();
			return local14;
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(BLclient!kj;)V")
	public void method2360(@OriginalArg(1) Class2_Sub10 arg0) {
		if (arg0.aClass2_Sub10_54 != null) {
			arg0.method5572();
		}
		arg0.aClass2_Sub10_54 = this.aClass2_Sub10_23.aClass2_Sub10_54;
		arg0.aClass2_Sub10_53 = this.aClass2_Sub10_23;
		arg0.aClass2_Sub10_54.aClass2_Sub10_53 = arg0;
		arg0.aClass2_Sub10_53.aClass2_Sub10_54 = arg0;
	}
}
