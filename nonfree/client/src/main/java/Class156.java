import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lt")
public final class Class156 {

	@OriginalMember(owner = "client!lt", name = "b", descriptor = "Lclient!lh;")
	private final Class151 aClass151_106 = new Class151(256);

	@OriginalMember(owner = "client!lt", name = "g", descriptor = "Lclient!qg;")
	private final Class121_Sub2 aClass121_Sub2_21;

	@OriginalMember(owner = "client!lt", name = "e", descriptor = "Lclient!m;")
	private final Interface5 anInterface5_12;

	static {
		new Class96("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n'êtes pas autorisé à expulser cet utilisateur.", "Você não tem permissão para expulsar este usuário.");
		new Class96("Thank-you, your abuse report has been received.", "Vielen Dank, deine Meldung ist bei uns eingegangen.", "Merci, nous avons bien reçu votre rapport d'abus.", "Obrigado. Sua denúncia de abuso foi recebida.");
	}

	@OriginalMember(owner = "client!lt", name = "<init>", descriptor = "(Lclient!qg;Lclient!m;)V")
	public Class156(@OriginalArg(0) Class121_Sub2 arg0, @OriginalArg(1) Interface5 arg1) {
		this.aClass121_Sub2_21 = arg0;
		this.anInterface5_12 = arg1;
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(I)V")
	public void method3494() {
		this.aClass151_106.method3297(5);
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(II)Lclient!jp;")
	public Class21_Sub2 method3495(@OriginalArg(0) int arg0) {
		@Pc(12) Object local12 = this.aClass151_106.method3288((long) arg0);
		if (local12 != null) {
			return (Class21_Sub2) local12;
		} else if (this.anInterface5_12.method3922(arg0)) {
			@Pc(36) Class132 local36 = this.anInterface5_12.method3920(arg0);
			@Pc(45) int local45 = local36.aBoolean282 ? 64 : this.aClass121_Sub2_21.anInt5933;
			@Pc(80) Class21_Sub2 local80;
			if (local36.aBoolean279 && this.aClass121_Sub2_21.method4613()) {
				@Pc(62) float[] local62 = this.anInterface5_12.method3919(0.7F, local45, local45, arg0);
				local80 = new Class21_Sub2(this.aClass121_Sub2_21, 3553, 34842, local45, local45, local36.aByte39 != 0, local62, 6408);
			} else {
				@Pc(94) short local94;
				@Pc(104) int[] local104;
				if (local36.aBoolean277 && Static447.method5963(local36.aByte40)) {
					local94 = 6407;
					local104 = this.anInterface5_12.method3923(arg0, false, 0.7F, local45, local45);
				} else {
					local94 = 6408;
					local104 = this.anInterface5_12.method3921(arg0, local45, local45, 0.7F);
				}
				local80 = new Class21_Sub2(this.aClass121_Sub2_21, 3553, local94, local45, local45, local36.aByte39 != 0, local104, false);
			}
			local80.method3487(local36.aBoolean286, local36.aBoolean281);
			this.aClass151_106.method3291((long) arg0, local80);
			return local80;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!lt", name = "b", descriptor = "(I)V")
	public void method3496() {
		this.aClass151_106.method3298();
	}
}
