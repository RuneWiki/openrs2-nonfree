import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gt")
public abstract class Class133 implements Interface9 {

	@OriginalMember(owner = "client!gt", name = "c", descriptor = "I")
	private int anInt8123;

	@OriginalMember(owner = "client!gt", name = "k", descriptor = "J")
	private long aLong225;

	@OriginalMember(owner = "client!gt", name = "o", descriptor = "Lclient!da;")
	private Class59 aClass59_12;

	@OriginalMember(owner = "client!gt", name = "g", descriptor = "Lclient!hda;")
	protected final Class139 aClass139_5;

	@OriginalMember(owner = "client!gt", name = "i", descriptor = "Lclient!gga;")
	protected final Class124 aClass124_98;

	@OriginalMember(owner = "client!gt", name = "d", descriptor = "Lclient!gga;")
	private final Class124 aClass124_97;

	@OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(Lclient!gga;Lclient!gga;Lclient!hda;)V")
	protected Class133(@OriginalArg(0) Class124 arg0, @OriginalArg(1) Class124 arg1, @OriginalArg(2) Class139 arg2) {
		this.aClass139_5 = arg2;
		this.aClass124_98 = arg0;
		this.aClass124_97 = arg1;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(ZIIB)V")
	protected abstract void method7269(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!gt", name = "b", descriptor = "(I)V")
	@Override
	public void method7670() {
		@Pc(22) Class324 local22 = Static386.method6506(this.aClass124_97, this.aClass139_5.anInt11175);
		this.aClass59_12 = Static607.aClass101_15.method8146(local22, Static676.method1699(this.aClass124_98, this.aClass139_5.anInt11175));
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Z)I")
	protected final int method7270() {
		@Pc(15) int local15 = Static396.aClass249_1.method6623();
		@Pc(19) int local19 = local15 * 100;
		if (this.anInt8123 == local15 && local15 != 0) {
			@Pc(41) int local41 = Static396.aClass249_1.method6622();
			if (local41 > local15) {
				@Pc(51) long local51 = this.aLong225 - Static396.aClass249_1.method6636();
				if (local51 > 0L) {
					@Pc(69) long local69 = (long) (local41 - local15) * (local51 * 10000L / (long) local15);
					@Pc(78) long local78 = (Static99.method1701() - this.aLong225) * 10000L;
					if (local69 > local78) {
						local19 = (int) ((long) (local15 * 100) + (long) (local41 - local15) * local78 * 100L / local69);
					} else {
						local19 = local41 * 100;
					}
				}
			}
		} else {
			this.anInt8123 = local15;
			this.aLong225 = Static99.method1701();
		}
		return local19;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(ZI)V")
	@Override
	public final void method7669() {
		@Pc(29) int local29 = this.aClass139_5.aClass236_12.method6431(this.aClass139_5.anInt11174, Static26.anInt458) + this.aClass139_5.anInt11172;
		@Pc(43) int local43 = this.aClass139_5.aClass103_12.method3186(Static340.anInt6390, this.aClass139_5.anInt11179) + this.aClass139_5.anInt11180;
		this.method7269(local43, local29);
		this.method7275(local43, local29);
		@Pc(59) String local59 = Static396.aClass249_1.method6635();
		if (Static99.method1701() - this.aLong225 > 10000L) {
			local59 = local59 + " (" + Static396.aClass249_1.method6637().method4023() + ")";
		}
		this.aClass59_12.method9585(local29 + this.aClass139_5.anInt11174 / 2, local59, this.aClass139_5.anInt11173, -1, this.aClass139_5.anInt11181 + local43 + this.aClass139_5.anInt11179 / 2 + 4);
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7668() {
		@Pc(5) boolean local5 = true;
		if (!this.aClass124_98.method3627(this.aClass139_5.anInt11175)) {
			local5 = false;
		}
		if (!this.aClass124_97.method3627(this.aClass139_5.anInt11175)) {
			local5 = false;
		}
		return local5;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(ZIII)V")
	protected abstract void method7275(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1);
}
