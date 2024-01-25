import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pea")
public final class Class278 {

	@OriginalMember(owner = "client!pea", name = "f", descriptor = "Lclient!qj;")
	private final Class295 aClass295_48 = new Class295(256);

	@OriginalMember(owner = "client!pea", name = "c", descriptor = "Lclient!ee;")
	private final Class95_Sub1 aClass95_Sub1_18;

	@OriginalMember(owner = "client!pea", name = "d", descriptor = "Lclient!d;")
	private final Interface2 anInterface2_8;

	@OriginalMember(owner = "client!pea", name = "<init>", descriptor = "(Lclient!ee;Lclient!d;)V")
	public Class278(@OriginalArg(0) Class95_Sub1 arg0, @OriginalArg(1) Interface2 arg1) {
		this.aClass95_Sub1_18 = arg0;
		this.anInterface2_8 = arg1;
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(B)V")
	public void method6135() {
		this.aClass295_48.method6464();
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(IB)Lclient!fk;")
	public Interface8 method6136(@OriginalArg(0) int arg0) {
		@Pc(12) Object local12 = this.aClass295_48.method6470((long) arg0);
		if (local12 != null) {
			return (Interface8) local12;
		} else if (this.anInterface2_8.method8328(arg0)) {
			@Pc(37) Class250 local37 = this.anInterface2_8.method8330(arg0);
			@Pc(46) int local46 = local37.aBoolean462 ? 64 : this.aClass95_Sub1_18.anInt10042;
			@Pc(82) Interface8 local82;
			if (local37.aBoolean468 && this.aClass95_Sub1_18.method8011()) {
				@Pc(65) float[] local65 = this.anInterface2_8.method8326(0.7F, local46, arg0, local46);
				local82 = this.aClass95_Sub1_18.method8205(local46, local37.aByte98 != 0, Static21.aClass122_14, local46, local65);
			} else {
				@Pc(103) int[] local103;
				if (local37.anInt6666 != 2 && Static267.method3942(local37.aByte93)) {
					local103 = this.anInterface2_8.method8329(local46, local46, true, arg0, 0.7F);
				} else {
					local103 = this.anInterface2_8.method8327(0.7F, local46, arg0, local46);
				}
				local82 = this.aClass95_Sub1_18.method8103(local46, local46, local103, local37.aByte98 != 0);
			}
			local82.method7068(local37.aBoolean469, local37.aBoolean463);
			this.aClass295_48.method6469((long) arg0, local82);
			return local82;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!pea", name = "b", descriptor = "(I)V")
	public void method6138() {
		this.aClass295_48.method6462(5);
	}
}
