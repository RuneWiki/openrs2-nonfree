import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pda")
public final class Class5_Sub5_Sub18 extends Class5_Sub5 {

	@OriginalMember(owner = "client!pda", name = "E", descriptor = "I")
	public int anInt7610;

	@OriginalMember(owner = "client!pda", name = "s", descriptor = "Ljava/lang/String;")
	public final String aString102;

	@OriginalMember(owner = "client!pda", name = "C", descriptor = "Lclient!gq;")
	public final Class149 aClass149_8;

	@OriginalMember(owner = "client!pda", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class5_Sub5_Sub18(@OriginalArg(0) String arg0) {
		this.aString102 = arg0;
		this.aClass149_8 = new Class149();
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(Lclient!sg;I)Z")
	public boolean method6562(@OriginalArg(0) Class5_Sub5_Sub19 arg0) {
		@Pc(7) int local7 = this.method6564();
		arg0.method9186();
		this.anInt7610--;
		if (this.anInt7610 != 0) {
			return this.method6564() != local7;
		}
		this.method9327(1);
		this.method9186();
		Static220.anInt3580--;
		Static488.aClass391_46.method9273(arg0.aLong268, this, 1);
		return false;
	}

	@OriginalMember(owner = "client!pda", name = "c", descriptor = "(I)I")
	public int method6564() {
		return this.aClass149_8.aClass5_Sub5_24 == this.aClass149_8.aClass5_Sub5_24.aClass5_Sub5_66 ? -1 : ((Class5_Sub5_Sub19) this.aClass149_8.aClass5_Sub5_24.aClass5_Sub5_66).anInt9210;
	}

	@OriginalMember(owner = "client!pda", name = "b", descriptor = "(Lclient!sg;I)Z")
	public boolean method6567(@OriginalArg(0) Class5_Sub5_Sub19 arg0) {
		@Pc(7) boolean local7 = true;
		arg0.method9186();
		for (@Pc(16) Class5_Sub5_Sub19 local16 = (Class5_Sub5_Sub19) this.aClass149_8.method2890(); local16 != null; local16 = (Class5_Sub5_Sub19) this.aClass149_8.method2894()) {
			if (Static650.method2003(arg0.anInt9210, local16.anInt9210)) {
				Static22.method320(local16, arg0);
				this.anInt7610++;
				if (local7) {
					return false;
				}
				return true;
			}
			local7 = false;
		}
		this.aClass149_8.method2889(arg0);
		this.anInt7610++;
		return 122 == 122 ? local7 : false;
	}
}
