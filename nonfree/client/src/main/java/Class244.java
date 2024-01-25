import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uj")
public final class Class244 {

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "Lclient!jp;")
	private final Class129 aClass129_68 = new Class129(256);

	@OriginalMember(owner = "client!uj", name = "j", descriptor = "Lclient!m;")
	private final Interface8 anInterface8_8;

	@OriginalMember(owner = "client!uj", name = "f", descriptor = "Lclient!bo;")
	private final Class26_Sub1 aClass26_Sub1_36;

	@OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(Lclient!bo;Lclient!m;)V")
	public Class244(@OriginalArg(0) Class26_Sub1 arg0, @OriginalArg(1) Interface8 arg1) {
		this.anInterface8_8 = arg1;
		this.aClass26_Sub1_36 = arg0;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)V")
	public void method5492() {
		this.aClass129_68.method3028(5);
	}

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "(IB)Lclient!wr;")
	public Class65_Sub3 method5493(@OriginalArg(0) int arg0) {
		@Pc(12) Object local12 = this.aClass129_68.method3023((long) arg0);
		if (local12 != null) {
			return (Class65_Sub3) local12;
		} else if (this.anInterface8_8.method3835(arg0)) {
			@Pc(33) Class178 local33 = this.anInterface8_8.method3836(arg0);
			@Pc(42) int local42 = local33.aBoolean432 ? 64 : this.aClass26_Sub1_36.anInt920;
			@Pc(86) Class65_Sub3 local86;
			if (local33.aBoolean433 && this.aClass26_Sub1_36.method2267()) {
				@Pc(65) float[] local65 = this.anInterface8_8.method3833(local42, local42, 0.7F, arg0);
				local86 = new Class65_Sub3(this.aClass26_Sub1_36, 3553, 34842, local42, local42, local33.aByte58 != 0, local65, 6408);
			} else {
				@Pc(98) short local98;
				@Pc(108) int[] local108;
				if (local33.aBoolean435 && Static294.method3370(local33.aByte59)) {
					local98 = 6407;
					local108 = this.anInterface8_8.method3832(0.7F, arg0, false, local42, local42);
				} else {
					local98 = 6408;
					local108 = this.anInterface8_8.method3834(0.7F, local42, local42, arg0);
				}
				local86 = new Class65_Sub3(this.aClass26_Sub1_36, 3553, local98, local42, local42, local33.aByte58 != 0, local108, false);
			}
			local86.method1962(local33.aBoolean437, local33.aBoolean434);
			this.aClass129_68.method3029(local86, (long) arg0);
			return local86;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "(I)V")
	public void method5494() {
		this.aClass129_68.method3025();
	}
}
