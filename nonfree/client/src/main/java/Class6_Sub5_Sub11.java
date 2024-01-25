import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public final class Class6_Sub5_Sub11 extends Class6_Sub5 {

	@OriginalMember(owner = "client!f", name = "F", descriptor = "I")
	public int anInt3423;

	@OriginalMember(owner = "client!f", name = "z", descriptor = "Ljava/lang/String;")
	public final String aString28;

	@OriginalMember(owner = "client!f", name = "C", descriptor = "Lclient!ns;")
	public final Class231 aClass231_2;

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class6_Sub5_Sub11(@OriginalArg(0) String arg0) {
		this.aString28 = arg0;
		this.aClass231_2 = new Class231();
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ILclient!em;)Z")
	public boolean method2839(@OriginalArg(1) Class6_Sub5_Sub9 arg0) {
		@Pc(7) boolean local7 = true;
		arg0.method7748();
		@Pc(22) Class6_Sub5_Sub9 local22 = (Class6_Sub5_Sub9) this.aClass231_2.method6055();
		while (local22 != null) {
			if (Static644.method8779(arg0.anInt3240, local22.anInt3240)) {
				Static104.method2431(local22, arg0);
				this.anInt3423++;
				if (local7) {
					return false;
				}
				return true;
			}
			local22 = (Class6_Sub5_Sub9) this.aClass231_2.method6050();
			local7 = false;
		}
		this.aClass231_2.method6048(arg0);
		this.anInt3423++;
		return local7;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(BLclient!em;)Z")
	public boolean method2841(@OriginalArg(1) Class6_Sub5_Sub9 arg0) {
		@Pc(7) int local7 = this.method2843();
		arg0.method7748();
		this.anInt3423--;
		if (this.anInt3423 != 0) {
			return local7 != this.method2843();
		}
		this.method8792();
		this.method7748();
		Static223.anInt5025--;
		Static263.aClass94_24.method2963(arg0.aLong79, this);
		return false;
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(I)I")
	public int method2843() {
		return this.aClass231_2.aClass6_Sub5_60.aClass6_Sub5_66 == this.aClass231_2.aClass6_Sub5_60 ? -1 : ((Class6_Sub5_Sub9) this.aClass231_2.aClass6_Sub5_60.aClass6_Sub5_66).anInt3240;
	}
}
