import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public final class Class2_Sub10_Sub7 extends Class2_Sub10 {

	@OriginalMember(owner = "client!ff", name = "E", descriptor = "I")
	public int anInt1725;

	@OriginalMember(owner = "client!ff", name = "G", descriptor = "I")
	public int anInt1726;

	@OriginalMember(owner = "client!ff", name = "K", descriptor = "I")
	public int anInt1729;

	@OriginalMember(owner = "client!ff", name = "M", descriptor = "I")
	public int anInt1730;

	@OriginalMember(owner = "client!ff", name = "O", descriptor = "I")
	public int anInt1731;

	@OriginalMember(owner = "client!ff", name = "D", descriptor = "Lclient!lh;")
	public final Class145 aClass145_1;

	@OriginalMember(owner = "client!ff", name = "F", descriptor = "Lclient!cu;")
	public final Class41 aClass41_1;

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(Lclient!lh;Lclient!an;)V")
	public Class2_Sub10_Sub7(@OriginalArg(0) Class145 arg0, @OriginalArg(1) Class10_Sub1 arg1) {
		this.aClass145_1 = arg0;
		this.aClass41_1 = Static141.method2668(arg0.anInt3634);
		this.method1685();
	}

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "(I)V")
	public void method1685() {
		this.anInt1730 = this.aClass145_1.anInt3633;
		this.anInt1731 = this.aClass145_1.anInt3636;
		this.anInt1725 = this.aClass145_1.anInt3631;
		if (this.aClass145_1.aClass44_3 != null) {
			this.aClass145_1.aClass44_3.method3535(this.aClass41_1.anInt1055, this.aClass41_1.anInt1048, this.aClass41_1.anInt1040, Static283.anIntArray962);
		}
		this.anInt1729 = Static283.anIntArray962[0];
		this.anInt1726 = Static283.anIntArray962[2];
	}
}
