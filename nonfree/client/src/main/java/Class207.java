import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qk")
public final class Class207 implements Interface6 {

	@OriginalMember(owner = "client!qk", name = "f", descriptor = "Lclient!fe;")
	private Class74 aClass74_23 = new Class74(128);

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "[I")
	private final int[] anIntArray380 = new int[Static447.aClass257_10.anInt7692];

	@OriginalMember(owner = "client!qk", name = "e", descriptor = "[I")
	public final int[] anIntArray381 = new int[Static447.aClass257_10.anInt7692];

	static {
		new Class267("Your friendlist is full, max of 100 for free users, and 200 for members.", "Ihre Freunde-Liste ist voll!", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para usuários não pagantes, e 200 para membros.");
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IZ)I")
	public int method4636(@OriginalArg(1) boolean arg0) {
		@Pc(16) long local16 = Static449.method6552();
		for (@Pc(30) Class6_Sub3 local30 = arg0 ? (Class6_Sub3) this.aClass74_23.method1889() : (Class6_Sub3) this.aClass74_23.method1881(); local30 != null; local30 = (Class6_Sub3) this.aClass74_23.method1881()) {
			if (local16 > (local30.aLong21 & 0x3FFFFFFFFFFFFFFFL)) {
				if ((local30.aLong21 & 0x4000000000000000L) != 0L) {
					@Pc(59) int local59 = (int) local30.aLong229;
					this.anIntArray381[local59] = this.anIntArray380[local59];
					local30.method6525();
					return local59;
				}
				local30.method6525();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(BII)V")
	public void method4637(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray381[arg1] = arg0;
		@Pc(20) Class6_Sub3 local20 = (Class6_Sub3) this.aClass74_23.method1883((long) arg1);
		if (local20 == null) {
			local20 = new Class6_Sub3(Static449.method6552() + 500L);
			this.aClass74_23.method1890((long) arg1, local20);
		} else {
			local20.aLong21 = Static449.method6552() + 500L;
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(III)V")
	public void method4640(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class37 local8 = Static69.aClass103_1.method2608(arg0);
		@Pc(11) int local11 = local8.anInt1248;
		@Pc(18) int local18 = local8.anInt1245;
		@Pc(21) int local21 = local8.anInt1249;
		@Pc(27) int local27 = Class3_Sub2_Sub6.anIntArray496[local21 - local18];
		if (arg1 < 0 || arg1 > local27) {
			arg1 = 0;
		}
		local27 <<= local18;
		this.method4643(local11, local27 & arg1 << local18 | ~local27 & this.anIntArray380[local11]);
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V")
	public void method4641() {
		for (@Pc(3) int local3 = 0; local3 < Static447.aClass257_10.anInt7692; local3++) {
			@Pc(10) Class52 local10 = Static447.aClass257_10.method6296(local3);
			if (local10 != null && local10.anInt1882 == 0) {
				this.anIntArray380[local3] = 0;
				this.anIntArray381[local3] = 0;
			}
		}
		this.aClass74_23 = new Class74(128);
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(III)V")
	public void method4642(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class37 local8 = Static69.aClass103_1.method2608(arg0);
		@Pc(11) int local11 = local8.anInt1248;
		@Pc(14) int local14 = local8.anInt1245;
		@Pc(21) int local21 = local8.anInt1249;
		@Pc(28) int local28 = Class3_Sub2_Sub6.anIntArray496[local21 - local14];
		if (arg1 < 0 || arg1 > local28) {
			arg1 = 0;
		}
		local28 <<= local14;
		this.method4637(local28 & arg1 << local14 | ~local28 & this.anIntArray381[local11], local11);
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IB)I")
	@Override
	public int method4634(@OriginalArg(0) int arg0) {
		return this.anIntArray381[arg0];
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(II)I")
	@Override
	public int method4635(@OriginalArg(0) int arg0) {
		@Pc(8) Class37 local8 = Static69.aClass103_1.method2608(arg0);
		@Pc(11) int local11 = local8.anInt1248;
		@Pc(14) int local14 = local8.anInt1245;
		@Pc(17) int local17 = local8.anInt1249;
		@Pc(23) int local23 = Class3_Sub2_Sub6.anIntArray496[local17 - local14];
		return local23 & this.anIntArray381[local11] >> local14;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIZ)V")
	public void method4643(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray380[arg0] = arg1;
		@Pc(16) Class6_Sub3 local16 = (Class6_Sub3) this.aClass74_23.method1883((long) arg0);
		if (local16 == null) {
			local16 = new Class6_Sub3(4611686018427387905L);
			this.aClass74_23.method1890((long) arg0, local16);
		} else if (local16.aLong21 != 4611686018427387905L) {
			local16.aLong21 = Static449.method6552() + 500L | 0x4000000000000000L;
		}
	}
}
