import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uo")
public final class Class5_Sub1_Sub20 extends Class5_Sub1 {

	@OriginalMember(owner = "client!uo", name = "x", descriptor = "I")
	public int anInt9857;

	@OriginalMember(owner = "client!uo", name = "v", descriptor = "Ljava/lang/String;")
	public final String aString114;

	@OriginalMember(owner = "client!uo", name = "w", descriptor = "Lclient!wca;")
	public Class388 aClass388_14;

	@OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class5_Sub1_Sub20(@OriginalArg(0) String arg0) {
		this.aString114 = arg0;
		this.aClass388_14 = new Class388();
	}

	@OriginalMember(owner = "client!uo", name = "c", descriptor = "(I)I")
	public int method8387() {
		return this.aClass388_14.aClass5_Sub1_66 == this.aClass388_14.aClass5_Sub1_66.aClass5_Sub1_65 ? -1 : ((Class5_Sub1_Sub13) this.aClass388_14.aClass5_Sub1_66.aClass5_Sub1_65).anInt6068;
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(ILclient!mk;)Z")
	public boolean method8388(@OriginalArg(1) Class5_Sub1_Sub13 arg0) {
		@Pc(7) int local7 = this.method8387();
		arg0.method8955();
		this.anInt9857--;
		if (this.anInt9857 != 0) {
			return this.method8387() != local7;
		}
		this.method9222();
		this.method8955();
		Static530.anInt8424--;
		Static529.aClass168_75.method3853(arg0.aLong177, this);
		return false;
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(ZLclient!mk;)Z")
	public boolean method8389(@OriginalArg(1) Class5_Sub1_Sub13 arg0) {
		@Pc(7) boolean local7 = true;
		arg0.method8955();
		@Pc(16) Class5_Sub1_Sub13 local16 = (Class5_Sub1_Sub13) this.aClass388_14.method9027();
		while (local16 != null) {
			if (Static652.method8996(arg0.anInt6068, local16.anInt6068)) {
				Static260.method4247(arg0, local16);
				this.anInt9857++;
				if (local7) {
					return false;
				}
				return true;
			}
			local16 = (Class5_Sub1_Sub13) this.aClass388_14.method9024();
			local7 = false;
		}
		this.aClass388_14.method9022(arg0);
		if (false) {
			this.aClass388_14 = null;
		}
		this.anInt9857++;
		return local7;
	}
}
