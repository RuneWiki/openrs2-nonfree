import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public final class Class126 implements Interface4 {

	@OriginalMember(owner = "client!je", name = "h", descriptor = "Lclient!ke;")
	private Class137 aClass137_19 = new Class137(128);

	@OriginalMember(owner = "client!je", name = "j", descriptor = "[I")
	public final int[] anIntArray291 = new int[Static91.aClass43_1.anInt1049];

	@OriginalMember(owner = "client!je", name = "g", descriptor = "[I")
	private final int[] anIntArray290 = new int[Static91.aClass43_1.anInt1049];

	static {
		new Class231("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d'envoyer un message - joueur indisponible.", "Não foi possível enviar a mensagem. O jogador não está disponível.");
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(III)V")
	public void method2804(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray290[arg1] = arg0;
		@Pc(24) Class6_Sub38 local24 = (Class6_Sub38) this.aClass137_19.method3175((long) arg1);
		if (local24 == null) {
			local24 = new Class6_Sub38(4611686018427387905L);
			this.aClass137_19.method3179((long) arg1, local24);
		} else if (local24.aLong194 != 4611686018427387905L) {
			local24.aLong194 = Static154.method2527() + 500L | 0x4000000000000000L;
			return;
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IZI)V")
	public void method2805(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray291[arg1] = arg0;
		@Pc(21) Class6_Sub38 local21 = (Class6_Sub38) this.aClass137_19.method3175((long) arg1);
		if (local21 == null) {
			local21 = new Class6_Sub38(Static154.method2527() + 500L);
			this.aClass137_19.method3179((long) arg1, local21);
		} else {
			local21.aLong194 = Static154.method2527() + 500L;
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(II)I")
	@Override
	public int method2802(@OriginalArg(1) int arg0) {
		@Pc(8) Class134 local8 = Static427.aClass58_1.method1465(arg0);
		@Pc(19) int local19 = local8.anInt3427;
		@Pc(22) int local22 = local8.anInt3425;
		@Pc(25) int local25 = local8.anInt3423;
		@Pc(32) int local32 = Class149.anIntArray323[local25 - local22];
		return local32 & this.anIntArray291[local19] >> local22;
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(III)V")
	public void method2806(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class134 local8 = Static427.aClass58_1.method1465(arg0);
		@Pc(11) int local11 = local8.anInt3427;
		@Pc(14) int local14 = local8.anInt3425;
		@Pc(22) int local22 = local8.anInt3423;
		@Pc(28) int local28 = Class149.anIntArray323[local22 - local14];
		if (arg1 < 0 || local28 < arg1) {
			arg1 = 0;
		}
		local28 <<= local14;
		this.method2805(local28 & arg1 << local14 | this.anIntArray291[local11] & ~local28, local11);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ZB)I")
	public int method2808(@OriginalArg(0) boolean arg0) {
		@Pc(8) long local8 = Static154.method2527();
		for (@Pc(28) Class6_Sub38 local28 = arg0 ? (Class6_Sub38) this.aClass137_19.method3181() : (Class6_Sub38) this.aClass137_19.method3182(); local28 != null; local28 = (Class6_Sub38) this.aClass137_19.method3182()) {
			if ((local28.aLong194 & 0x3FFFFFFFFFFFFFFFL) < local8) {
				if ((local28.aLong194 & 0x4000000000000000L) != 0L) {
					@Pc(57) int local57 = (int) local28.aLong217;
					this.anIntArray291[local57] = this.anIntArray290[local57];
					local28.method5977();
					return local57;
				}
				local28.method5977();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(BI)I")
	@Override
	public int method2803(@OriginalArg(1) int arg0) {
		return this.anIntArray291[arg0];
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(BII)V")
	public void method2810(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class134 local8 = Static427.aClass58_1.method1465(arg0);
		@Pc(11) int local11 = local8.anInt3427;
		@Pc(14) int local14 = local8.anInt3425;
		@Pc(21) int local21 = local8.anInt3423;
		@Pc(27) int local27 = Class149.anIntArray323[local21 - local14];
		if (arg1 < 0 || arg1 > local27) {
			arg1 = 0;
		}
		local27 <<= local14;
		this.method2804(this.anIntArray290[local11] & ~local27 | local27 & arg1 << local14, local11);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V")
	public void method2811() {
		for (@Pc(13) int local13 = 0; local13 < Static91.aClass43_1.anInt1049; local13++) {
			@Pc(20) Class163 local20 = Static91.aClass43_1.method973(local13);
			if (local20 != null && local20.anInt4095 == 0) {
				this.anIntArray290[local13] = 0;
				this.anIntArray291[local13] = 0;
			}
		}
		this.aClass137_19 = new Class137(128);
	}
}
