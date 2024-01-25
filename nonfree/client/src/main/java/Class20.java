import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ba")
public final class Class20 {

	@OriginalMember(owner = "client!ba", name = "d", descriptor = "Lclient!uaa;")
	private final Class288 aClass288_1 = new Class288(256);

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "Lclient!n;")
	private final Interface8 anInterface8_18;

	@OriginalMember(owner = "client!ba", name = "i", descriptor = "Lclient!jj;")
	private final Class62_Sub3 aClass62_Sub3_2;

	static {
		new Class40("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs chargée", "Dados da lista de mundos carregados");
	}

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(Lclient!jj;Lclient!n;)V")
	public Class20(@OriginalArg(0) Class62_Sub3 arg0, @OriginalArg(1) Interface8 arg1) {
		this.anInterface8_18 = arg1;
		this.aClass62_Sub3_2 = arg0;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Z)V")
	public void method666() {
		this.aClass288_1.method6744();
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)V")
	public void method667() {
		this.aClass288_1.method6735(5);
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(II)Lclient!hp;")
	public Class4_Sub2 method668(@OriginalArg(1) int arg0) {
		@Pc(12) Object local12 = this.aClass288_1.method6745((long) arg0);
		if (local12 != null) {
			return (Class4_Sub2) local12;
		} else if (this.anInterface8_18.method7236(arg0)) {
			@Pc(39) Class271 local39 = this.anInterface8_18.method7237(arg0);
			@Pc(48) int local48 = local39.aBoolean558 ? 64 : this.aClass62_Sub3_2.anInt4619;
			@Pc(101) Class4_Sub2 local101;
			if (local39.aBoolean565 && this.aClass62_Sub3_2.method7031()) {
				@Pc(115) float[] local115 = this.anInterface8_18.method7233(0.7F, local48, arg0, local48);
				local101 = new Class4_Sub2(this.aClass62_Sub3_2, 3553, 34842, local48, local48, local39.aByte77 != 0, local115, 6408);
			} else {
				@Pc(68) int[] local68;
				if (local39.aBoolean562) {
					local68 = this.anInterface8_18.method7232(0.7F, local48, arg0, local48);
				} else {
					local68 = this.anInterface8_18.method7234(local48, local48, true, arg0, 0.7F);
				}
				local101 = new Class4_Sub2(this.aClass62_Sub3_2, 3553, 6408, local48, local48, local39.aByte77 != 0, local68, false);
			}
			local101.method5467(local39.aBoolean563, local39.aBoolean559);
			this.aClass288_1.method6746(local101, (long) arg0);
			return local101;
		} else {
			return null;
		}
	}
}
