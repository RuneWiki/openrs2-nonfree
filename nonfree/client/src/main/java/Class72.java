import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!er")
public final class Class72 implements Interface4 {

	@OriginalMember(owner = "client!er", name = "h", descriptor = "Lclient!fa;")
	private Class77 aClass77_11 = new Class77(128);

	@OriginalMember(owner = "client!er", name = "j", descriptor = "[I")
	private final int[] anIntArray212 = new int[Static158.aClass229_3.anInt5674];

	@OriginalMember(owner = "client!er", name = "k", descriptor = "[I")
	public final int[] anIntArray213 = new int[Static158.aClass229_3.anInt5674];

	static {
		new Class169("You cannot send a quick chat message to a player on this world at this time.", "Einem Spieler auf dieser Welt können derzeit keine Direktchat-Nachrichten", "Impossible d'envoyer un message rapide à un joueur de ce serveur à l'heure actuelle.", "Você não pode enviar uma mensagem de papo rápido para um jogador neste mundo neste momento.");
		new Class169(null, "der Spieler ist momentan nicht verfügbar.", null, null);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(ZI)I")
	public int method1334(@OriginalArg(0) boolean arg0) {
		@Pc(8) long local8 = Static378.method5293();
		for (@Pc(22) Class1_Sub34 local22 = arg0 ? (Class1_Sub34) this.aClass77_11.method1359() : (Class1_Sub34) this.aClass77_11.method1360(); local22 != null; local22 = (Class1_Sub34) this.aClass77_11.method1360()) {
			if (local8 > (local22.aLong142 & 0x3FFFFFFFFFFFFFFFL)) {
				if ((local22.aLong142 & 0x4000000000000000L) != 0L) {
					@Pc(54) int local54 = (int) local22.aLong207;
					this.anIntArray213[local54] = this.anIntArray212[local54];
					local22.method5577();
					return local54;
				}
				local22.method5577();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IBI)V")
	public void method1336(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray213[arg1] = arg0;
		@Pc(16) Class1_Sub34 local16 = (Class1_Sub34) this.aClass77_11.method1368((long) arg1);
		if (local16 == null) {
			local16 = new Class1_Sub34(Static378.method5293() + 500L);
			this.aClass77_11.method1370((long) arg1, local16);
		} else {
			local16.aLong142 = Static378.method5293() + 500L;
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(II)I")
	@Override
	public int method1332(@OriginalArg(1) int arg0) {
		return this.anIntArray213[arg0];
	}

	@OriginalMember(owner = "client!er", name = "b", descriptor = "(IBI)V")
	public void method1337(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class87 local8 = Static371.aClass147_5.method2957(arg1);
		@Pc(11) int local11 = local8.anInt1960;
		@Pc(14) int local14 = local8.anInt1964;
		@Pc(22) int local22 = local8.anInt1968;
		@Pc(29) int local29 = Class40_Sub3.anIntArray499[local22 - local14];
		if (arg0 < 0 || arg0 > local29) {
			arg0 = 0;
		}
		local29 <<= local14;
		this.method1339(this.anIntArray212[local11] & ~local29 | local29 & arg0 << local14, local11);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(BII)V")
	public void method1339(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray212[arg1] = arg0;
		@Pc(21) Class1_Sub34 local21 = (Class1_Sub34) this.aClass77_11.method1368((long) arg1);
		if (local21 == null) {
			local21 = new Class1_Sub34(4611686018427387905L);
			this.aClass77_11.method1370((long) arg1, local21);
		} else if (local21.aLong142 != 4611686018427387905L) {
			local21.aLong142 = Static378.method5293() + 500L | 0x4000000000000000L;
			return;
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Z)V")
	public void method1344() {
		for (@Pc(7) int local7 = 0; local7 < Static158.aClass229_3.anInt5674; local7++) {
			@Pc(14) Class210 local14 = Static158.aClass229_3.method4882(local7);
			if (local14 != null && local14.anInt5428 == 0) {
				this.anIntArray212[local7] = 0;
				this.anIntArray213[local7] = 0;
			}
		}
		this.aClass77_11 = new Class77(128);
	}

	@OriginalMember(owner = "client!er", name = "b", descriptor = "(II)I")
	@Override
	public int method1333(@OriginalArg(1) int arg0) {
		@Pc(8) Class87 local8 = Static371.aClass147_5.method2957(arg0);
		@Pc(16) int local16 = local8.anInt1960;
		@Pc(19) int local19 = local8.anInt1964;
		@Pc(22) int local22 = local8.anInt1968;
		@Pc(28) int local28 = Class40_Sub3.anIntArray499[local22 - local19];
		return local28 & this.anIntArray213[local16] >> local19;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(III)V")
	public void method1345(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class87 local14 = Static371.aClass147_5.method2957(arg1);
		@Pc(17) int local17 = local14.anInt1960;
		@Pc(20) int local20 = local14.anInt1964;
		@Pc(23) int local23 = local14.anInt1968;
		@Pc(30) int local30 = Class40_Sub3.anIntArray499[local23 - local20];
		if (arg0 < 0 || arg0 > local30) {
			arg0 = 0;
		}
		local30 <<= local20;
		this.method1336(this.anIntArray213[local17] & ~local30 | arg0 << local20 & local30, local17);
	}
}
