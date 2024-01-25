import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!an")
public final class Class11 implements Interface8 {

	@OriginalMember(owner = "client!an", name = "s", descriptor = "Lclient!jr;")
	private Class127 aClass127_2 = new Class127(128);

	@OriginalMember(owner = "client!an", name = "g", descriptor = "[I")
	public final int[] anIntArray37 = new int[Static260.aClass169_4.anInt5044];

	@OriginalMember(owner = "client!an", name = "j", descriptor = "[I")
	private final int[] anIntArray38 = new int[Static260.aClass169_4.anInt5044];

	static {
		new Class175("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option können nur Spieler gemeldet werden,", "Cette règle n'est invocable que pour les discussions ou échanges récents.", "Para essa regra, você só pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
	}

	@OriginalMember(owner = "client!an", name = "b", descriptor = "(IB)I")
	@Override
	public int method456(@OriginalArg(0) int arg0) {
		return this.anIntArray37[arg0];
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(I)V")
	public void method459() {
		for (@Pc(1) int local1 = 0; local1 < Static260.aClass169_4.anInt5044; local1++) {
			@Pc(13) Class194 local13 = Static260.aClass169_4.method4058(local1);
			if (local13 != null && local13.anInt6013 == 0) {
				this.anIntArray38[local1] = 0;
				this.anIntArray37[local1] = 0;
			}
		}
		this.aClass127_2 = new Class127(128);
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(III)V")
	public void method460(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class187 local8 = Static35.aClass227_2.method5299(arg1);
		@Pc(11) int local11 = local8.anInt5692;
		@Pc(14) int local14 = local8.anInt5690;
		@Pc(17) int local17 = local8.anInt5695;
		@Pc(24) int local24 = Class3_Sub15.anIntArray173[local17 - local14];
		if (arg0 < 0 || arg0 > local24) {
			arg0 = 0;
		}
		local24 <<= local14;
		this.method469(arg0 << local14 & local24 | this.anIntArray38[local11] & ~local24, local11);
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IB)I")
	@Override
	public int method455(@OriginalArg(0) int arg0) {
		@Pc(8) Class187 local8 = Static35.aClass227_2.method5299(arg0);
		@Pc(11) int local11 = local8.anInt5692;
		@Pc(14) int local14 = local8.anInt5690;
		@Pc(22) int local22 = local8.anInt5695;
		@Pc(29) int local29 = Class3_Sub15.anIntArray173[local22 - local14];
		return this.anIntArray37[local11] >> local14 & local29;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IZI)V")
	public void method464(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray37[arg1] = arg0;
		@Pc(22) Class3_Sub21 local22 = (Class3_Sub21) this.aClass127_2.method3246((long) arg1);
		if (local22 == null) {
			local22 = new Class3_Sub21(Static150.method2672() + 500L);
			this.aClass127_2.method3257((long) arg1, local22);
		} else {
			local22.aLong96 = Static150.method2672() + 500L;
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IIB)V")
	public void method465(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class187 local12 = Static35.aClass227_2.method5299(arg0);
		@Pc(15) int local15 = local12.anInt5692;
		@Pc(18) int local18 = local12.anInt5690;
		@Pc(21) int local21 = local12.anInt5695;
		@Pc(28) int local28 = Class3_Sub15.anIntArray173[local21 - local18];
		if (arg1 < 0 || local28 < arg1) {
			arg1 = 0;
		}
		local28 <<= local18;
		this.method464(~local28 & this.anIntArray37[local15] | local28 & arg1 << local18, local15);
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(ZB)I")
	public int method466(@OriginalArg(0) boolean arg0) {
		@Pc(6) long local6 = Static150.method2672();
		for (@Pc(28) Class3_Sub21 local28 = arg0 ? (Class3_Sub21) this.aClass127_2.method3248() : (Class3_Sub21) this.aClass127_2.method3252(); local28 != null; local28 = (Class3_Sub21) this.aClass127_2.method3252()) {
			if ((local28.aLong96 & 0x3FFFFFFFFFFFFFFFL) < local6) {
				if ((local28.aLong96 & 0x4000000000000000L) != 0L) {
					@Pc(47) int local47 = (int) local28.aLong227;
					this.anIntArray37[local47] = this.anIntArray38[local47];
					local28.method5987();
					return local47;
				}
				local28.method5987();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IBI)V")
	public void method469(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray38[arg1] = arg0;
		@Pc(23) Class3_Sub21 local23 = (Class3_Sub21) this.aClass127_2.method3246((long) arg1);
		if (local23 == null) {
			local23 = new Class3_Sub21(4611686018427387905L);
			this.aClass127_2.method3257((long) arg1, local23);
		} else if (local23.aLong96 != 4611686018427387905L) {
			local23.aLong96 = Static150.method2672() + 500L | 0x4000000000000000L;
		}
	}
}
