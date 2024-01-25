import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cba")
public abstract class Class39 implements Interface4 {

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "Lclient!da;")
	private Class25 aClass25_13;

	@OriginalMember(owner = "client!cba", name = "h", descriptor = "J")
	private long aLong268;

	@OriginalMember(owner = "client!cba", name = "l", descriptor = "I")
	private int anInt10168;

	@OriginalMember(owner = "client!cba", name = "i", descriptor = "Lclient!kha;")
	protected final Class181 aClass181_130;

	@OriginalMember(owner = "client!cba", name = "f", descriptor = "Lclient!kha;")
	private final Class181 aClass181_129;

	@OriginalMember(owner = "client!cba", name = "e", descriptor = "Lclient!pd;")
	protected final Class41 aClass41_5;

	@OriginalMember(owner = "client!cba", name = "<init>", descriptor = "(Lclient!kha;Lclient!kha;Lclient!pd;)V")
	protected Class39(@OriginalArg(0) Class181 arg0, @OriginalArg(1) Class181 arg1, @OriginalArg(2) Class41 arg2) {
		this.aClass181_130 = arg0;
		this.aClass181_129 = arg1;
		this.aClass41_5 = arg2;
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8344() {
		@Pc(11) boolean local11 = true;
		if (!this.aClass181_130.method5040(this.aClass41_5.anInt9771)) {
			local11 = false;
		}
		if (!this.aClass181_129.method5040(this.aClass41_5.anInt9771)) {
			local11 = false;
		}
		return local11;
	}

	@OriginalMember(owner = "client!cba", name = "b", descriptor = "(I)I")
	protected final int method8348() {
		@Pc(9) int local9 = Static99.aClass348_1.method8104();
		@Pc(19) int local19 = local9 * 100;
		if (local9 == this.anInt10168 && local9 != 0) {
			@Pc(41) int local41 = Static99.aClass348_1.method8100();
			if (local9 < local41) {
				@Pc(51) long local51 = this.aLong268 - Static99.aClass348_1.method8110();
				if (local51 > 0L) {
					@Pc(69) long local69 = local51 * 10000L / (long) local9 * (long) (local41 - local9);
					@Pc(78) long local78 = (Static444.method6719() - this.aLong268) * 10000L;
					if (local69 > local78) {
						local19 = (int) ((long) (local41 - local9) * local78 * 100L / local69 + (long) (local9 * 100));
					} else {
						local19 = local41 * 100;
					}
				}
			}
		} else {
			this.anInt10168 = local9;
			this.aLong268 = Static444.method6719();
		}
		return local19;
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(IIIZ)V")
	protected abstract void method8349(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(ZI)V")
	@Override
	public final void method8345() {
		@Pc(18) int local18 = this.aClass41_5.aClass117_13.method3782(Static199.anInt4634, this.aClass41_5.anInt9779) + this.aClass41_5.anInt9780;
		@Pc(32) int local32 = this.aClass41_5.aClass178_12.method5000(this.aClass41_5.anInt9773, Static523.anInt9075) + this.aClass41_5.anInt9781;
		this.method8350(local32, local18);
		this.method8349(local18, local32);
		@Pc(48) String local48 = Static99.aClass348_1.method8111();
		if (Static444.method6719() - this.aLong268 > 10000L) {
			local48 = local48 + " (" + Static99.aClass348_1.method8099().method6446() + ")";
		}
		this.aClass25_13.method5843(this.aClass41_5.anInt9773 / 2 + local32 + this.aClass41_5.anInt9775 + 4, -1, this.aClass41_5.anInt9777, local48, local18 + this.aClass41_5.anInt9779 / 2);
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(I)V")
	@Override
	public void method8346() {
		@Pc(11) Class315 local11 = Static494.method7247(this.aClass181_129, this.aClass41_5.anInt9771);
		this.aClass25_13 = Static47.aClass33_3.method6202(local11, Static649.method617(this.aClass181_130, this.aClass41_5.anInt9771));
	}

	@OriginalMember(owner = "client!cba", name = "b", descriptor = "(IIIZ)V")
	protected abstract void method8350(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
