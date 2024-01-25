import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mfa")
public final class Class3_Sub5_Sub13 extends Class3_Sub5 {

	@OriginalMember(owner = "client!mfa", name = "v", descriptor = "I")
	public int anInt6245;

	@OriginalMember(owner = "client!mfa", name = "r", descriptor = "Ljava/lang/String;")
	public final String aString79;

	@OriginalMember(owner = "client!mfa", name = "s", descriptor = "Lclient!nc;")
	public final Class243 aClass243_10;

	@OriginalMember(owner = "client!mfa", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class3_Sub5_Sub13(@OriginalArg(0) String arg0) {
		this.aString79 = arg0;
		this.aClass243_10 = new Class243();
	}

	@OriginalMember(owner = "client!mfa", name = "d", descriptor = "(B)I")
	public int method5264() {
		return this.aClass243_10.aClass3_Sub5_44 == this.aClass243_10.aClass3_Sub5_44.aClass3_Sub5_66 ? -1 : ((Class3_Sub5_Sub18) this.aClass243_10.aClass3_Sub5_44.aClass3_Sub5_66).anInt9217;
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(BLclient!td;)Z")
	public boolean method5265(@OriginalArg(1) Class3_Sub5_Sub18 arg0) {
		@Pc(12) int local12 = this.method5264();
		arg0.method9014();
		this.anInt6245--;
		if (this.anInt6245 != 0) {
			return this.method5264() != local12;
		}
		this.method9034();
		this.method9014();
		Static610.anInt10153--;
		Static294.aClass295_71.method6469(arg0.aLong258, this);
		return false;
	}

	@OriginalMember(owner = "client!mfa", name = "b", descriptor = "(BLclient!td;)Z")
	public boolean method5267(@OriginalArg(1) Class3_Sub5_Sub18 arg0) {
		@Pc(7) boolean local7 = true;
		arg0.method9014();
		@Pc(24) Class3_Sub5_Sub18 local24 = (Class3_Sub5_Sub18) this.aClass243_10.method5459();
		while (local24 != null) {
			if (Static388.method5440(arg0.anInt9217, local24.anInt9217)) {
				Static424.method5839(arg0, local24);
				this.anInt6245++;
				if (local7) {
					return false;
				}
				return true;
			}
			local24 = (Class3_Sub5_Sub18) this.aClass243_10.method5453();
			local7 = false;
		}
		this.aClass243_10.method5457(arg0);
		this.anInt6245++;
		return local7;
	}
}
