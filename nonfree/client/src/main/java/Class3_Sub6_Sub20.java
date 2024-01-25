import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public final class Class3_Sub6_Sub20 extends Class3_Sub6 {

	@OriginalMember(owner = "client!v", name = "x", descriptor = "I")
	public int anInt9677;

	@OriginalMember(owner = "client!v", name = "C", descriptor = "Ljava/lang/String;")
	public final String aString123;

	@OriginalMember(owner = "client!v", name = "A", descriptor = "Lclient!oaa;")
	public final Class258 aClass258_13;

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class3_Sub6_Sub20(@OriginalArg(0) String arg0) {
		this.aString123 = arg0;
		this.aClass258_13 = new Class258();
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!od;B)Z")
	public boolean method8242(@OriginalArg(0) Class3_Sub6_Sub16 arg0) {
		arg0.method8342();
		@Pc(10) boolean local10 = true;
		for (@Pc(21) Class3_Sub6_Sub16 local21 = (Class3_Sub6_Sub16) this.aClass258_13.method5934(); local21 != null; local21 = (Class3_Sub6_Sub16) this.aClass258_13.method5929()) {
			if (Static331.method8340(arg0.anInt7069, local21.anInt7069)) {
				Static550.method7561(arg0, local21);
				this.anInt9677++;
				if (local10) {
					return false;
				}
				return true;
			}
			local10 = false;
		}
		this.aClass258_13.method5936(arg0);
		this.anInt9677++;
		return local10;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ILclient!od;)Z")
	public boolean method8244(@OriginalArg(1) Class3_Sub6_Sub16 arg0) {
		@Pc(7) int local7 = this.method8245();
		arg0.method8342();
		this.anInt9677--;
		if (this.anInt9677 != 0) {
			return local7 != this.method8245();
		}
		this.method8770();
		this.method8342();
		Static661.anInt10221--;
		Static438.aClass279_42.method6635(this, arg0.aLong203);
		return false;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(B)I")
	public int method8245() {
		return this.aClass258_13.aClass3_Sub6_44.aClass3_Sub6_67 == this.aClass258_13.aClass3_Sub6_44 ? -1 : ((Class3_Sub6_Sub16) this.aClass258_13.aClass3_Sub6_44.aClass3_Sub6_67).anInt7069;
	}
}
