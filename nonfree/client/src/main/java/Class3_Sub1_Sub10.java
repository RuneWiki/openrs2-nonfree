import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jo")
public final class Class3_Sub1_Sub10 extends Class3_Sub1 {

	@OriginalMember(owner = "client!jo", name = "z", descriptor = "I")
	public int anInt5812;

	@OriginalMember(owner = "client!jo", name = "x", descriptor = "Ljava/lang/String;")
	public final String aString59;

	@OriginalMember(owner = "client!jo", name = "v", descriptor = "Lclient!bj;")
	public final Class30 aClass30_7;

	@OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class3_Sub1_Sub10(@OriginalArg(0) String arg0) {
		this.aString59 = arg0;
		this.aClass30_7 = new Class30();
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(B)I")
	public int method4919() {
		return this.aClass30_7.aClass3_Sub1_7.aClass3_Sub1_66 == this.aClass30_7.aClass3_Sub1_7 ? -1 : ((Class3_Sub1_Sub4) this.aClass30_7.aClass3_Sub1_7.aClass3_Sub1_66).anInt3485;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(ILclient!et;)Z")
	public boolean method4920(@OriginalArg(1) Class3_Sub1_Sub4 arg0) {
		@Pc(12) boolean local12 = true;
		arg0.method8621();
		for (@Pc(21) Class3_Sub1_Sub4 local21 = (Class3_Sub1_Sub4) this.aClass30_7.method780(); local21 != null; local21 = (Class3_Sub1_Sub4) this.aClass30_7.method783()) {
			if (Static228.method4369(local21.anInt3485, arg0.anInt3485)) {
				Static615.method8368(arg0, local21);
				this.anInt5812++;
				if (local12) {
					return false;
				}
				return true;
			}
			local12 = false;
		}
		this.aClass30_7.method779(arg0);
		this.anInt5812++;
		return local12;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(Lclient!et;I)Z")
	public boolean method4923(@OriginalArg(0) Class3_Sub1_Sub4 arg0) {
		@Pc(7) int local7 = this.method4919();
		arg0.method8621();
		this.anInt5812--;
		if (this.anInt5812 != 0) {
			return this.method4919() != local7;
		}
		this.method8671();
		this.method8621();
		Static462.anInt8390--;
		Static54.aClass112_23.method3636(arg0.aLong73, this);
		return false;
	}
}
