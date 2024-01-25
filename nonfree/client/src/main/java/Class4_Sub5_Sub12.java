import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jw")
public final class Class4_Sub5_Sub12 extends Class4_Sub5 {

	@OriginalMember(owner = "client!jw", name = "K", descriptor = "I")
	public int anInt4687;

	@OriginalMember(owner = "client!jw", name = "E", descriptor = "Ljava/lang/String;")
	public final String aString45;

	@OriginalMember(owner = "client!jw", name = "H", descriptor = "Lclient!ut;")
	public final Class367 aClass367_5;

	@OriginalMember(owner = "client!jw", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class4_Sub5_Sub12(@OriginalArg(0) String arg0) {
		this.aString45 = arg0;
		this.aClass367_5 = new Class367();
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(ILclient!qh;)Z")
	public boolean method4192(@OriginalArg(1) Class4_Sub5_Sub17 arg0) {
		@Pc(15) int local15 = this.method4194();
		arg0.method8990();
		this.anInt4687--;
		if (this.anInt4687 != 0) {
			return local15 != this.method4194();
		}
		this.method9000();
		this.method8990();
		Static579.anInt8938--;
		Static487.aClass352_11.method7655(arg0.aLong225, this);
		return false;
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(I)I")
	public int method4194() {
		return this.aClass367_5.aClass4_Sub5_58 == this.aClass367_5.aClass4_Sub5_58.aClass4_Sub5_67 ? -1 : ((Class4_Sub5_Sub17) this.aClass367_5.aClass4_Sub5_58.aClass4_Sub5_67).anInt7673;
	}

	@OriginalMember(owner = "client!jw", name = "b", descriptor = "(ILclient!qh;)Z")
	public boolean method4195(@OriginalArg(1) Class4_Sub5_Sub17 arg0) {
		arg0.method8990();
		@Pc(12) boolean local12 = true;
		for (@Pc(18) Class4_Sub5_Sub17 local18 = (Class4_Sub5_Sub17) this.aClass367_5.method8308(); local18 != null; local18 = (Class4_Sub5_Sub17) this.aClass367_5.method8309()) {
			if (Static416.method5244(arg0.anInt7673, local18.anInt7673)) {
				Static663.method8789(local18, arg0);
				this.anInt4687++;
				if (local12) {
					return false;
				}
				return true;
			}
			local12 = false;
		}
		this.aClass367_5.method8310(arg0);
		this.anInt4687++;
		return local12;
	}
}
