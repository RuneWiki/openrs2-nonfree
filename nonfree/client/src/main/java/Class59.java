import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public final class Class59 {

	@OriginalMember(owner = "client!ee", name = "f", descriptor = "Lclient!fa;")
	private final Class68 aClass68_7 = new Class68(256);

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "Lclient!ga;")
	private final Interface7 anInterface7_4;

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "Lclient!fd;")
	private final Class19_Sub2 aClass19_Sub2_12;

	static {
		new Class83("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...");
	}

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Lclient!fd;Lclient!ga;)V")
	public Class59(@OriginalArg(0) Class19_Sub2 arg0, @OriginalArg(1) Interface7 arg1) {
		this.anInterface7_4 = arg1;
		this.aClass19_Sub2_12 = arg0;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)V")
	public void method1545() {
		this.aClass68_7.method1788(5);
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(II)Lclient!af;")
	public Class6_Sub1 method1549(@OriginalArg(0) int arg0) {
		@Pc(17) Object local17 = this.aClass68_7.method1787((long) arg0);
		if (local17 != null) {
			return (Class6_Sub1) local17;
		} else if (this.anInterface7_4.method2392(arg0)) {
			@Pc(36) Class251 local36 = this.anInterface7_4.method2396(arg0);
			@Pc(45) int local45 = local36.aBoolean637 ? 64 : this.aClass19_Sub2_12.anInt2269;
			@Pc(80) Class6_Sub1 local80;
			if (local36.aBoolean638 && this.aClass19_Sub2_12.method4301()) {
				@Pc(62) float[] local62 = this.anInterface7_4.method2394(0.7F, arg0, local45, local45);
				local80 = new Class6_Sub1(this.aClass19_Sub2_12, 3553, 34842, local45, local45, local36.aByte92 != 0, local62, 6408);
			} else {
				@Pc(102) short local102;
				@Pc(100) int[] local100;
				if (local36.aBoolean640 && Static222.method3349(local36.aByte89)) {
					local100 = this.anInterface7_4.method2393(false, arg0, 0.7F, local45, local45);
					local102 = 6407;
				} else {
					local100 = this.anInterface7_4.method2395(arg0, 0.7F, local45, local45);
					local102 = 6408;
				}
				local80 = new Class6_Sub1(this.aClass19_Sub2_12, 3553, local102, local45, local45, local36.aByte92 != 0, local100, false);
			}
			local80.method4196(local36.aBoolean643, local36.aBoolean644);
			this.aClass68_7.method1779((long) arg0, local80);
			return local80;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V")
	public void method1550() {
		this.aClass68_7.method1777();
	}
}
