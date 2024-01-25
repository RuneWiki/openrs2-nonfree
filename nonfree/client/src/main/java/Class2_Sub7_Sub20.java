import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vda")
public final class Class2_Sub7_Sub20 extends Class2_Sub7 {

	@OriginalMember(owner = "client!vda", name = "w", descriptor = "I")
	public int anInt9985;

	@OriginalMember(owner = "client!vda", name = "t", descriptor = "Ljava/lang/String;")
	public final String aString106;

	@OriginalMember(owner = "client!vda", name = "x", descriptor = "Lclient!qk;")
	public final Class290 aClass290_13;

	@OriginalMember(owner = "client!vda", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class2_Sub7_Sub20(@OriginalArg(0) String arg0) {
		this.aString106 = arg0;
		this.aClass290_13 = new Class290();
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(Lclient!vea;I)Z")
	public boolean method8483(@OriginalArg(0) Class2_Sub7_Sub21 arg0) {
		@Pc(11) boolean local11 = true;
		arg0.method8504();
		@Pc(20) Class2_Sub7_Sub21 local20 = (Class2_Sub7_Sub21) this.aClass290_13.method6680();
		while (local20 != null) {
			if (Static573.method7953(local20.anInt10014, arg0.anInt10014)) {
				Static205.method5786(arg0, local20);
				this.anInt9985++;
				if (local11) {
					return false;
				}
				return true;
			}
			local20 = (Class2_Sub7_Sub21) this.aClass290_13.method6673();
			local11 = false;
		}
		this.aClass290_13.method6678(arg0);
		this.anInt9985++;
		return local11;
	}

	@OriginalMember(owner = "client!vda", name = "b", descriptor = "(Lclient!vea;I)Z")
	public boolean method8484(@OriginalArg(0) Class2_Sub7_Sub21 arg0) {
		@Pc(7) int local7 = this.method8486();
		arg0.method8504();
		this.anInt9985--;
		if (this.anInt9985 != 0) {
			return this.method8486() != local7;
		}
		this.method8920();
		this.method8504();
		Static471.anInt7593--;
		Static585.aClass69_64.method1917(arg0.aLong261, this);
		return false;
	}

	@OriginalMember(owner = "client!vda", name = "b", descriptor = "(B)I")
	public int method8486() {
		return this.aClass290_13.aClass2_Sub7_48.aClass2_Sub7_66 == this.aClass290_13.aClass2_Sub7_48 ? -1 : ((Class2_Sub7_Sub21) this.aClass290_13.aClass2_Sub7_48.aClass2_Sub7_66).anInt10014;
	}
}
