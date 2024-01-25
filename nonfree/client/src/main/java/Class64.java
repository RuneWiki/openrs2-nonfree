import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rba")
public abstract class Class64 implements Interface2 {

	@OriginalMember(owner = "client!rba", name = "d", descriptor = "I")
	private int anInt8963;

	@OriginalMember(owner = "client!rba", name = "i", descriptor = "J")
	private long aLong299;

	@OriginalMember(owner = "client!rba", name = "h", descriptor = "Lclient!da;")
	private Class57 aClass57_11;

	@OriginalMember(owner = "client!rba", name = "c", descriptor = "Lclient!ik;")
	protected final Class182 aClass182_112;

	@OriginalMember(owner = "client!rba", name = "l", descriptor = "Lclient!la;")
	protected final Class104 aClass104_5;

	@OriginalMember(owner = "client!rba", name = "o", descriptor = "Lclient!ik;")
	private final Class182 aClass182_111;

	@OriginalMember(owner = "client!rba", name = "<init>", descriptor = "(Lclient!ik;Lclient!ik;Lclient!la;)V")
	protected Class64(@OriginalArg(0) Class182 arg0, @OriginalArg(1) Class182 arg1, @OriginalArg(2) Class104 arg2) {
		this.aClass182_112 = arg0;
		this.aClass104_5 = arg2;
		this.aClass182_111 = arg1;
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(ZZ)V")
	@Override
	public final void method9317() {
		@Pc(18) int local18 = this.aClass104_5.aClass223_11.method5074(this.aClass104_5.anInt8371, Static221.anInt3616) + this.aClass104_5.anInt8368;
		@Pc(33) int local33 = this.aClass104_5.aClass352_11.method7803(Static700.anInt10927, this.aClass104_5.anInt8367) + this.aClass104_5.anInt8366;
		this.method7603(local18, local33);
		this.method7607(local33, local18);
		@Pc(62) String local62 = Static397.aClass325_1.method7282();
		if (Static517.method6965() - this.aLong299 > 10000L) {
			local62 = local62 + " (" + Static397.aClass325_1.method7279().method7410() + ")";
		}
		this.aClass57_11.method9146(local18 + this.aClass104_5.anInt8371 / 2, this.aClass104_5.anInt8367 / 2 + 4 + local33 - -this.aClass104_5.anInt8375, this.aClass104_5.anInt8370, local62, -1);
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method9318() {
		@Pc(13) boolean local13 = true;
		if (!this.aClass182_112.method3964(this.aClass104_5.anInt8365)) {
			local13 = false;
		}
		if (!this.aClass182_111.method3964(this.aClass104_5.anInt8365)) {
			local13 = false;
		}
		return local13;
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(IZBI)V")
	protected abstract void method7603(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1);

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(I)V")
	@Override
	public void method9316() {
		@Pc(19) Class169 local19 = Static462.method6278(this.aClass104_5.anInt8365, this.aClass182_111);
		this.aClass57_11 = Static153.aClass22_4.method9353(local19, Static735.method8275(this.aClass182_112, this.aClass104_5.anInt8365), true);
	}

	@OriginalMember(owner = "client!rba", name = "b", descriptor = "(I)I")
	protected final int method7605() {
		@Pc(9) int local9 = Static397.aClass325_1.method7284();
		@Pc(18) int local18 = local9 * 100;
		if (local9 == this.anInt8963 && local9 != 0) {
			@Pc(37) int local37 = Static397.aClass325_1.method7280();
			if (local9 < local37) {
				@Pc(52) long local52 = this.aLong299 - Static397.aClass325_1.method7276();
				if (local52 > 0L) {
					@Pc(71) long local71 = local52 * 10000L / (long) local9 * (long) (local37 - local9);
					@Pc(80) long local80 = (Static517.method6965() - this.aLong299) * 10000L;
					if (local80 >= local71) {
						local18 = local37 * 100;
					} else {
						local18 = (int) (local80 * 100L * (long) (local37 - local9) / local71 + (long) (local9 * 100));
					}
				}
			}
		} else {
			this.anInt8963 = local9;
			this.aLong299 = Static517.method6965();
		}
		return local18;
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(IZII)V")
	protected abstract void method7607(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);
}
