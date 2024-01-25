import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sfa")
public final class Class14_Sub2_Sub17 extends Class14_Sub2 {

	@OriginalMember(owner = "client!sfa", name = "w", descriptor = "I")
	public int anInt9298;

	@OriginalMember(owner = "client!sfa", name = "x", descriptor = "Ljava/lang/String;")
	public final String aString104;

	@OriginalMember(owner = "client!sfa", name = "B", descriptor = "Lclient!oga;")
	public final Class269 aClass269_142;

	@OriginalMember(owner = "client!sfa", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class14_Sub2_Sub17(@OriginalArg(0) String arg0) {
		this.aString104 = arg0;
		this.aClass269_142 = new Class269();
	}

	@OriginalMember(owner = "client!sfa", name = "h", descriptor = "(I)I")
	public int method8020() {
		return this.aClass269_142.aClass14_Sub2_42.aClass14_Sub2_67 == this.aClass269_142.aClass14_Sub2_42 ? -1 : ((Class14_Sub2_Sub20) this.aClass269_142.aClass14_Sub2_42.aClass14_Sub2_67).anInt10001;
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(Lclient!uda;I)Z")
	public boolean method8021(@OriginalArg(0) Class14_Sub2_Sub20 arg0) {
		arg0.method9093();
		@Pc(8) boolean local8 = true;
		@Pc(14) Class14_Sub2_Sub20 local14 = (Class14_Sub2_Sub20) this.aClass269_142.method6494();
		while (local14 != null) {
			if (Static673.method9326(arg0.anInt10001, local14.anInt10001)) {
				Static382.method5867(local14, arg0);
				this.anInt9298++;
				if (local8) {
					return false;
				}
				return true;
			}
			local14 = (Class14_Sub2_Sub20) this.aClass269_142.method6491();
			local8 = false;
		}
		this.aClass269_142.method6493(arg0);
		this.anInt9298++;
		return local8;
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(ILclient!uda;)Z")
	public boolean method8022(@OriginalArg(1) Class14_Sub2_Sub20 arg0) {
		@Pc(7) int local7 = this.method8020();
		arg0.method9093();
		this.anInt9298--;
		if (this.anInt9298 != 0) {
			return this.method8020() != local7;
		}
		this.method9513();
		this.method9093();
		Static164.anInt2537--;
		Static103.aClass317_9.method7875(arg0.aLong280, this);
		return false;
	}
}
