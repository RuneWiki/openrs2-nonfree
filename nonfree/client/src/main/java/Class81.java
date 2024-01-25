import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!us")
public abstract class Class81 implements Interface14 {

	@OriginalMember(owner = "client!us", name = "a", descriptor = "J")
	private long aLong340;

	@OriginalMember(owner = "client!us", name = "m", descriptor = "Lclient!da;")
	private Class44 aClass44_46;

	@OriginalMember(owner = "client!us", name = "i", descriptor = "I")
	private int anInt9824;

	@OriginalMember(owner = "client!us", name = "l", descriptor = "Lclient!lb;")
	private final Class221 aClass221_149;

	@OriginalMember(owner = "client!us", name = "b", descriptor = "Lclient!lb;")
	protected final Class221 aClass221_148;

	@OriginalMember(owner = "client!us", name = "f", descriptor = "Lclient!va;")
	protected final Class21 aClass21_5;

	@OriginalMember(owner = "client!us", name = "<init>", descriptor = "(Lclient!lb;Lclient!lb;Lclient!va;)V")
	protected Class81(@OriginalArg(0) Class221 arg0, @OriginalArg(1) Class221 arg1, @OriginalArg(2) Class21 arg2) {
		this.aClass221_149 = arg1;
		this.aClass221_148 = arg0;
		this.aClass21_5 = arg2;
	}

	@OriginalMember(owner = "client!us", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8744() {
		@Pc(5) boolean local5 = true;
		if (!this.aClass221_148.method5068(this.aClass21_5.anInt3463)) {
			local5 = false;
		}
		if (!this.aClass221_149.method5068(this.aClass21_5.anInt3463)) {
			local5 = false;
		}
		return local5;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IIIZ)V")
	protected abstract void method8295(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!us", name = "b", descriptor = "(Z)I")
	protected final int method8296() {
		@Pc(9) int local9 = Static720.aClass264_1.method6406();
		@Pc(13) int local13 = local9 * 100;
		if (local9 == this.anInt9824 && local9 != 0) {
			@Pc(40) int local40 = Static720.aClass264_1.method6412();
			if (local40 > local9) {
				@Pc(50) long local50 = this.aLong340 - Static720.aClass264_1.method6404();
				if (local50 > 0L) {
					@Pc(67) long local67 = (long) (local40 - local9) * (local50 * 10000L / (long) local9);
					@Pc(76) long local76 = (Static626.method8479() - this.aLong340) * 10000L;
					if (local76 < local67) {
						local13 = (int) ((long) (local9 * 100) + (long) (local40 - local9) * local76 * 100L / local67);
					} else {
						local13 = local40 * 100;
					}
				}
			}
		} else {
			this.anInt9824 = local9;
			this.aLong340 = Static626.method8479();
		}
		return local13;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(I)V")
	@Override
	public void method8745() {
		@Pc(11) Class330 local11 = Static101.method1316(this.aClass21_5.anInt3463, this.aClass221_149);
		this.aClass44_46 = Static488.aClass67_12.method7641(local11, Static728.method4755(this.aClass221_148, this.aClass21_5.anInt3463), true);
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IZZI)V")
	protected abstract void method8297(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1);

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(ZB)V")
	@Override
	public final void method8743() {
		@Pc(17) int local17 = this.aClass21_5.aClass304_9.method7463(this.aClass21_5.anInt3462, Static347.anInt2639) + this.aClass21_5.anInt3469;
		@Pc(31) int local31 = this.aClass21_5.aClass216_9.method5030(Static426.anInt7511, this.aClass21_5.anInt3460) + this.aClass21_5.anInt3465;
		this.method8297(local31, local17);
		this.method8295(local17, local31);
		@Pc(47) String local47 = Static720.aClass264_1.method6407();
		if (Static626.method8479() - this.aLong340 > 10000L) {
			local47 = local47 + " (" + Static720.aClass264_1.method6402().method8153() + ")";
		}
		this.aClass44_46.method8119(local47, -9902, this.aClass21_5.anInt3466, this.aClass21_5.anInt3462 / 2 + local17, -1, local31 + (this.aClass21_5.anInt3460 / 2 - (-4 - this.aClass21_5.anInt3467)));
	}
}
