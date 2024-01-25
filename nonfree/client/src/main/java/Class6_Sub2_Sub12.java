import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!k")
public final class Class6_Sub2_Sub12 extends Class6_Sub2 {

	@OriginalMember(owner = "client!k", name = "C", descriptor = "I")
	public int anInt5417;

	@OriginalMember(owner = "client!k", name = "E", descriptor = "Ljava/lang/String;")
	public final String aString58;

	@OriginalMember(owner = "client!k", name = "F", descriptor = "Lclient!re;")
	public final Class286 aClass286_6;

	@OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class6_Sub2_Sub12(@OriginalArg(0) String arg0) {
		this.aString58 = arg0;
		this.aClass286_6 = new Class286();
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Lclient!cs;I)Z")
	public boolean method4846(@OriginalArg(0) Class6_Sub2_Sub4 arg0) {
		arg0.method8754();
		@Pc(15) boolean local15 = true;
		@Pc(21) Class6_Sub2_Sub4 local21 = (Class6_Sub2_Sub4) this.aClass286_6.method7242();
		while (local21 != null) {
			if (Static144.method2331(arg0.anInt1738, local21.anInt1738)) {
				Static380.method1535(local21, arg0);
				this.anInt5417++;
				if (local15) {
					return false;
				}
				return true;
			}
			local21 = (Class6_Sub2_Sub4) this.aClass286_6.method7241();
			local15 = false;
		}
		this.aClass286_6.method7239(arg0);
		this.anInt5417++;
		return local15;
	}

	@OriginalMember(owner = "client!k", name = "b", descriptor = "(B)I")
	public int method4847() {
		return this.aClass286_6.aClass6_Sub2_56.aClass6_Sub2_66 == this.aClass286_6.aClass6_Sub2_56 ? -1 : ((Class6_Sub2_Sub4) this.aClass286_6.aClass6_Sub2_56.aClass6_Sub2_66).anInt1738;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(ILclient!cs;)Z")
	public boolean method4849(@OriginalArg(1) Class6_Sub2_Sub4 arg0) {
		@Pc(12) int local12 = this.method4847();
		arg0.method8754();
		this.anInt5417--;
		if (this.anInt5417 != 0) {
			return local12 != this.method4847();
		}
		this.method9043();
		this.method8754();
		Static608.anInt10066--;
		Static69.aClass166_7.method4803(this, arg0.aLong41);
		return false;
	}
}
