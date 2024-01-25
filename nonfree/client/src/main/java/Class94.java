import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ml")
public abstract class Class94 implements Interface1 {

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "I")
	private int anInt10477;

	@OriginalMember(owner = "client!ml", name = "f", descriptor = "Lclient!da;")
	private Class38 aClass38_12;

	@OriginalMember(owner = "client!ml", name = "k", descriptor = "J")
	private long aLong284;

	@OriginalMember(owner = "client!ml", name = "j", descriptor = "Lclient!wia;")
	protected final Class386 aClass386_130;

	@OriginalMember(owner = "client!ml", name = "l", descriptor = "Lclient!wia;")
	private final Class386 aClass386_131;

	@OriginalMember(owner = "client!ml", name = "i", descriptor = "Lclient!gi;")
	protected final Class92 aClass92_5;

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lclient!wia;Lclient!wia;Lclient!gi;)V")
	protected Class94(@OriginalArg(0) Class386 arg0, @OriginalArg(1) Class386 arg1, @OriginalArg(2) Class92 arg2) {
		this.aClass386_130 = arg0;
		this.aClass386_131 = arg1;
		this.aClass92_5 = arg2;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8740() {
		@Pc(5) boolean local5 = true;
		if (!this.aClass386_130.method9206(this.aClass92_5.anInt10910)) {
			local5 = false;
		}
		if (!this.aClass386_131.method9206(this.aClass92_5.anInt10910)) {
			local5 = false;
		}
		return local5;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IBIZ)V")
	protected abstract void method8743(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(I)I")
	protected final int method8744() {
		@Pc(17) int local17 = Static292.aClass360_1.method8674();
		@Pc(21) int local21 = local17 * 100;
		if (this.anInt10477 == local17 && local17 != 0) {
			@Pc(35) int local35 = Static292.aClass360_1.method8671();
			if (local35 > local17) {
				@Pc(45) long local45 = this.aLong284 - Static292.aClass360_1.method8676();
				if (local45 > 0L) {
					@Pc(62) long local62 = (long) (local35 - local17) * (local45 * 10000L / (long) local17);
					@Pc(70) long local70 = (Static521.method7499() - this.aLong284) * 10000L;
					if (local70 >= local62) {
						local21 = local35 * 100;
					} else {
						local21 = (int) ((long) (local35 - local17) * local70 * 100L / local62 + (long) (local17 * 100));
					}
				}
			}
		} else {
			this.anInt10477 = local17;
			this.aLong284 = Static521.method7499();
		}
		return local21;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIZ)V")
	protected abstract void method8745(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZZ)V")
	@Override
	public final void method8741() {
		@Pc(17) int local17 = this.aClass92_5.aClass168_13.method3716(this.aClass92_5.anInt10903, Static258.anInt4461) + this.aClass92_5.anInt10908;
		@Pc(31) int local31 = this.aClass92_5.aClass339_13.method8222(this.aClass92_5.anInt10907, Static297.anInt5240) + this.aClass92_5.anInt10902;
		this.method8745(local31, local17);
		this.method8743(local17, local31);
		@Pc(53) String local53 = Static292.aClass360_1.method8675();
		if (Static521.method7499() - this.aLong284 > 10000L) {
			local53 = local53 + " (" + Static292.aClass360_1.method8673().method3020() + ")";
		}
		this.aClass38_12.method8989(local53, this.aClass92_5.anInt10905, this.aClass92_5.anInt10907 / 2 + local31 + this.aClass92_5.anInt10904 + 4, -1, local17 - -(this.aClass92_5.anInt10903 / 2));
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V")
	@Override
	public void method8739() {
		@Pc(19) Class158 local19 = Static527.method7557(this.aClass386_131, this.aClass92_5.anInt10910);
		this.aClass38_12 = Static677.aClass137_47.method7870(local19, Static688.method8616(this.aClass386_130, this.aClass92_5.anInt10910));
	}
}
