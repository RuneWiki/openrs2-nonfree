import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jj")
public final class Class1_Sub1_Sub18 extends Class1_Sub1 {

	@OriginalMember(owner = "client!jj", name = "J", descriptor = "I")
	private int anInt3066;

	@OriginalMember(owner = "client!jj", name = "K", descriptor = "[I")
	private int[] anIntArray167;

	@OriginalMember(owner = "client!jj", name = "M", descriptor = "I")
	private int anInt3068;

	@OriginalMember(owner = "client!jj", name = "O", descriptor = "I")
	private int anInt3070 = -1;

	static {
		new Class151("Error joining clan channel - please try again later!", "Fehler beim Betreten des Chatraums - bitte versuch es später erneut.", "Erreur lors de la connexion au canal de clan - veuillez réessayer ultérieurement.", "Erro ao entrar no canal do clã. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub18() {
		super(0, false);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILclient!dh;I)V")
	@Override
	public void method5619(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt3070 = arg1.method4485();
		}
	}

	@OriginalMember(owner = "client!jj", name = "c", descriptor = "(B)V")
	@Override
	public void method5630() {
		super.method5630();
		this.anIntArray167 = null;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5626(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass117_41.method2345(arg0);
		if (super.aClass117_41.aBoolean221) {
			@Pc(35) int local35 = this.anInt3066 * (this.anInt3068 == Static452.anInt7412 ? arg0 : this.anInt3068 * arg0 / Static452.anInt7412);
			@Pc(39) int[] local39 = local11[0];
			@Pc(43) int[] local43 = local11[1];
			@Pc(47) int[] local47 = local11[2];
			@Pc(57) int local57;
			@Pc(65) int local65;
			if (this.anInt3066 == Static434.anInt4326) {
				for (local57 = 0; local57 < Static434.anInt4326; local57++) {
					local65 = this.anIntArray167[local35++];
					local47[local57] = (local65 & 0xFF) << 4;
					local43[local57] = local65 >> 4 & 0xFF0;
					local39[local57] = local65 >> 12 & 0xFF0;
				}
			} else {
				for (local57 = 0; local57 < Static434.anInt4326; local57++) {
					local65 = this.anInt3066 * local57 / Static434.anInt4326;
					@Pc(113) int local113 = this.anIntArray167[local35 + local65];
					local47[local57] = (local113 & 0xFF) << 4;
					local43[local57] = local113 >> 4 & 0xFF0;
					local39[local57] = local113 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(B)I")
	@Override
	public int method5628() {
		return this.anInt3070;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IBI)V")
	@Override
	public void method5625(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		super.method5625(arg0, arg1);
		if (this.anInt3070 >= 0 && Static400.anInterface8_11 != null) {
			@Pc(32) int local32 = Static400.anInterface8_11.method1375(this.anInt3070).aBoolean431 ? 64 : 128;
			this.anIntArray167 = Static400.anInterface8_11.method1374(local32, false, local32, 1.0F, this.anInt3070);
			this.anInt3068 = local32;
			this.anInt3066 = local32;
		}
	}
}
