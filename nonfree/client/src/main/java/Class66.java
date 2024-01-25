import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ct")
public final class Class66 implements Interface16 {

	@OriginalMember(owner = "client!ct", name = "e", descriptor = "Lclient!la;")
	private Class37 aClass37_4;

	@OriginalMember(owner = "client!ct", name = "b", descriptor = "Lclient!sm;")
	private final Class313 aClass313_1;

	@OriginalMember(owner = "client!ct", name = "j", descriptor = "Lclient!mv;")
	private final Class229 aClass229_22;

	@OriginalMember(owner = "client!ct", name = "c", descriptor = "Lclient!mv;")
	private final Class229 aClass229_21;

	@OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(Lclient!mv;Lclient!mv;Lclient!sm;)V")
	public Class66(@OriginalArg(0) Class229 arg0, @OriginalArg(1) Class229 arg1, @OriginalArg(2) Class313 arg2) {
		this.aClass313_1 = arg2;
		this.aClass229_22 = arg1;
		this.aClass229_21 = arg0;
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(I)V")
	@Override
	public void method7258() {
		@Pc(18) Class112 local18 = Static308.method4410(this.aClass229_22, this.aClass313_1.anInt7794);
		this.aClass37_4 = Static417.aClass162_17.method6864(local18, Static603.method7126(this.aClass229_21, this.aClass313_1.anInt7794));
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7257() {
		@Pc(5) boolean local5 = true;
		if (!this.aClass229_21.method4954(this.aClass313_1.anInt7794)) {
			local5 = false;
		}
		if (!this.aClass229_22.method4954(this.aClass313_1.anInt7794)) {
			local5 = false;
		}
		return local5;
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7259() {
		@Pc(27) int local27 = this.aClass313_1.aClass322_11.method6534(Static14.anInt330, this.aClass313_1.anInt7795) + this.aClass313_1.anInt7797;
		@Pc(42) int local42 = this.aClass313_1.aClass347_11.method7305(Static370.anInt6187, this.aClass313_1.anInt7801) + this.aClass313_1.anInt7798;
		this.aClass37_4.method7710(null, null, this.aClass313_1.aString121, this.aClass313_1.anInt7795, local27, this.aClass313_1.anInt7801, this.aClass313_1.anInt7796, local42, this.aClass313_1.anInt7802, 0, this.aClass313_1.anInt7800, this.aClass313_1.anInt7793, null, this.aClass313_1.anInt7804, 0);
	}
}
