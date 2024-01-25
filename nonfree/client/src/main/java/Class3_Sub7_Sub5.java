import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dga")
public final class Class3_Sub7_Sub5 extends Class3_Sub7 {

	@OriginalMember(owner = "client!dga", name = "B", descriptor = "I")
	public int anInt2315;

	@OriginalMember(owner = "client!dga", name = "w", descriptor = "Ljava/lang/String;")
	public final String aString40;

	@OriginalMember(owner = "client!dga", name = "q", descriptor = "Lclient!gw;")
	public final Class147 aClass147_1;

	@OriginalMember(owner = "client!dga", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class3_Sub7_Sub5(@OriginalArg(0) String arg0) {
		this.aString40 = arg0;
		this.aClass147_1 = new Class147();
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(BLclient!hla;)Z")
	public boolean method2137(@OriginalArg(1) Class3_Sub7_Sub10 arg0) {
		@Pc(16) int local16 = this.method2138();
		arg0.method9251();
		this.anInt2315--;
		if (this.anInt2315 != 0) {
			return local16 != this.method2138();
		}
		this.method9596();
		this.method9251();
		Static239.anInt3802--;
		Static365.aClass307_60.method7000(this, arg0.aLong144);
		return false;
	}

	@OriginalMember(owner = "client!dga", name = "c", descriptor = "(B)I")
	public int method2138() {
		return this.aClass147_1.aClass3_Sub7_28 == this.aClass147_1.aClass3_Sub7_28.aClass3_Sub7_67 ? -1 : ((Class3_Sub7_Sub10) this.aClass147_1.aClass3_Sub7_28.aClass3_Sub7_67).anInt3913;
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(Lclient!hla;I)Z")
	public boolean method2142(@OriginalArg(0) Class3_Sub7_Sub10 arg0) {
		arg0.method9251();
		@Pc(18) boolean local18 = true;
		for (@Pc(24) Class3_Sub7_Sub10 local24 = (Class3_Sub7_Sub10) this.aClass147_1.method3334(); local24 != null; local24 = (Class3_Sub7_Sub10) this.aClass147_1.method3332()) {
			if (Static380.method5127(local24.anInt3913, arg0.anInt3913)) {
				Static712.method2314(local24, arg0);
				this.anInt2315++;
				if (local18) {
					return false;
				}
				return true;
			}
			local18 = false;
		}
		this.aClass147_1.method3335(arg0);
		this.anInt2315++;
		return local18;
	}
}
