import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public final class Class1_Sub1_Sub7 extends Class1_Sub1 {

	@OriginalMember(owner = "client!de", name = "y", descriptor = "I")
	public int anInt1871;

	@OriginalMember(owner = "client!de", name = "z", descriptor = "I")
	public int anInt1872;

	@OriginalMember(owner = "client!de", name = "A", descriptor = "I")
	public int anInt1873;

	@OriginalMember(owner = "client!de", name = "C", descriptor = "I")
	public int anInt1875;

	@OriginalMember(owner = "client!de", name = "G", descriptor = "I")
	public int anInt1877;

	@OriginalMember(owner = "client!de", name = "E", descriptor = "Lclient!hv;")
	public final Class114 aClass114_1;

	@OriginalMember(owner = "client!de", name = "H", descriptor = "Lclient!np;")
	public final Class180 aClass180_1;

	static {
		new Class158("Attempting to join channel...", "Chatraum wird betreten...", "Tentative de connexion au canal...", "Tentando acessar canal...");
	}

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "(Lclient!hv;Lclient!cc;)V")
	public Class1_Sub1_Sub7(@OriginalArg(0) Class114 arg0, @OriginalArg(1) Class41_Sub1 arg1) {
		this.aClass114_1 = arg0;
		this.aClass180_1 = this.aClass114_1.method2700();
		this.method1365();
	}

	@OriginalMember(owner = "client!de", name = "d", descriptor = "(I)V")
	public void method1365() {
		this.anInt1871 = this.aClass114_1.anInt3461;
		this.anInt1877 = this.aClass114_1.anInt3459;
		this.anInt1875 = this.aClass114_1.anInt3457;
		if (this.aClass114_1.aClass40_2 != null) {
			this.aClass114_1.aClass40_2.K(this.aClass180_1.anInt5340, this.aClass180_1.anInt5345, this.aClass180_1.anInt5332, Static329.anIntArray570);
		}
		this.anInt1872 = Static329.anIntArray570[0];
		this.anInt1873 = Static329.anIntArray570[2];
	}
}
