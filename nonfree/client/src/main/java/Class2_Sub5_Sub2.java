import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bj")
public final class Class2_Sub5_Sub2 extends Class2_Sub5 {

	@OriginalMember(owner = "client!bj", name = "y", descriptor = "I")
	public int anInt964;

	@OriginalMember(owner = "client!bj", name = "C", descriptor = "Ljava/lang/String;")
	public final String aString8;

	@OriginalMember(owner = "client!bj", name = "F", descriptor = "Lclient!jh;")
	public final Class175 aClass175_1;

	@OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class2_Sub5_Sub2(@OriginalArg(0) String arg0) {
		this.aString8 = arg0;
		this.aClass175_1 = new Class175();
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lclient!wc;B)Z")
	public boolean method857(@OriginalArg(0) Class2_Sub5_Sub20 arg0) {
		arg0.method8464();
		@Pc(10) boolean local10 = true;
		@Pc(23) Class2_Sub5_Sub20 local23 = (Class2_Sub5_Sub20) this.aClass175_1.method4280();
		while (local23 != null) {
			if (Static261.method4255(local23.anInt10077, arg0.anInt10077)) {
				Static587.method8112(arg0, local23);
				this.anInt964++;
				if (local10) {
					return false;
				}
				return true;
			}
			local23 = (Class2_Sub5_Sub20) this.aClass175_1.method4288();
			local10 = false;
		}
		this.aClass175_1.method4287(arg0);
		this.anInt964++;
		return local10;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(ILclient!wc;)Z")
	public boolean method859(@OriginalArg(1) Class2_Sub5_Sub20 arg0) {
		@Pc(12) int local12 = this.method861();
		arg0.method8464();
		this.anInt964--;
		if (this.anInt964 != 0) {
			return this.method861() != local12;
		}
		this.method8599();
		this.method8464();
		Static178.anInt3981--;
		Static465.aClass233_42.method5662(this, arg0.aLong277);
		return false;
	}

	@OriginalMember(owner = "client!bj", name = "h", descriptor = "(I)I")
	public int method861() {
		return this.aClass175_1.aClass2_Sub5_34.aClass2_Sub5_66 == this.aClass175_1.aClass2_Sub5_34 ? -1 : ((Class2_Sub5_Sub20) this.aClass175_1.aClass2_Sub5_34.aClass2_Sub5_66).anInt10077;
	}
}
