import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class Class2_Sub1_Sub19 extends Class2_Sub1 {

	@OriginalMember(owner = "client!td", name = "A", descriptor = "I")
	public int anInt9806;

	@OriginalMember(owner = "client!td", name = "J", descriptor = "Ljava/lang/String;")
	public final String aString113;

	@OriginalMember(owner = "client!td", name = "C", descriptor = "Lclient!pf;")
	public final Class279 aClass279_13;

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class2_Sub1_Sub19(@OriginalArg(0) String arg0) {
		this.aString113 = arg0;
		this.aClass279_13 = new Class279();
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ZLclient!m;)Z")
	public boolean method8590(@OriginalArg(1) Class2_Sub1_Sub13 arg0) {
		@Pc(12) int local12 = this.method8591();
		arg0.method9377();
		this.anInt9806--;
		if (this.anInt9806 != 0) {
			return this.method8591() != local12;
		}
		this.method9825();
		this.method9377();
		Static488.anInt8750--;
		Static130.aClass22_11.method470(arg0.aLong180, this);
		return false;
	}

	@OriginalMember(owner = "client!td", name = "i", descriptor = "(I)I")
	public int method8591() {
		return this.aClass279_13.aClass2_Sub1_54 == this.aClass279_13.aClass2_Sub1_54.aClass2_Sub1_67 ? -1 : ((Class2_Sub1_Sub13) this.aClass279_13.aClass2_Sub1_54.aClass2_Sub1_67).anInt6866;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!m;I)Z")
	public boolean method8592(@OriginalArg(0) Class2_Sub1_Sub13 arg0) {
		@Pc(15) boolean local15 = true;
		arg0.method9377();
		for (@Pc(24) Class2_Sub1_Sub13 local24 = (Class2_Sub1_Sub13) this.aClass279_13.method7293(); local24 != null; local24 = (Class2_Sub1_Sub13) this.aClass279_13.method7298()) {
			if (Static307.method5031(local24.anInt6866, arg0.anInt6866)) {
				Static653.method9593(local24, arg0);
				this.anInt9806++;
				if (local15) {
					return false;
				}
				return true;
			}
			local15 = false;
		}
		this.aClass279_13.method7292(arg0);
		this.anInt9806++;
		return local15;
	}
}
