import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public abstract class Class102 implements Interface9 {

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "Lclient!la;")
	private Class45 aClass45_12;

	@OriginalMember(owner = "client!ic", name = "e", descriptor = "I")
	private int anInt10442;

	@OriginalMember(owner = "client!ic", name = "k", descriptor = "J")
	private long aLong292;

	@OriginalMember(owner = "client!ic", name = "p", descriptor = "Lclient!em;")
	protected final Class50 aClass50_5;

	@OriginalMember(owner = "client!ic", name = "f", descriptor = "Lclient!vo;")
	private final Class348 aClass348_133;

	@OriginalMember(owner = "client!ic", name = "m", descriptor = "Lclient!vo;")
	protected final Class348 aClass348_134;

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(Lclient!vo;Lclient!vo;Lclient!em;)V")
	protected Class102(@OriginalArg(0) Class348 arg0, @OriginalArg(1) Class348 arg1, @OriginalArg(2) Class50 arg2) {
		this.aClass50_5 = arg2;
		this.aClass348_133 = arg1;
		this.aClass348_134 = arg0;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIZ)V")
	protected abstract void method8153(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V")
	@Override
	public void method8148() {
		@Pc(15) Class198 local15 = Static165.method2735(this.aClass348_133, this.aClass50_5.anInt7632);
		this.aClass45_12 = Static39.aClass7_2.method7837(local15, Static598.method2450(this.aClass348_134, this.aClass50_5.anInt7632));
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZZ)V")
	@Override
	public final void method8147() {
		@Pc(27) int local27 = this.aClass50_5.aClass347_11.method7949(Static370.anInt7124, this.aClass50_5.anInt7637) + this.aClass50_5.anInt7638;
		@Pc(42) int local42 = this.aClass50_5.aClass214_11.method5005(Static324.anInt6378, this.aClass50_5.anInt7630) + this.aClass50_5.anInt7633;
		this.method8154(local42, local27);
		this.method8153(local27, local42);
		@Pc(58) String local58 = Static521.aClass258_1.method5978();
		if (Static112.method2047() - this.aLong292 > 10000L) {
			local58 = local58 + " (" + Static521.aClass258_1.method5977().method2182() + ")";
		}
		this.aClass45_12.method4849(this.aClass50_5.anInt7635, local27 + this.aClass50_5.anInt7637 / 2, this.aClass50_5.anInt7630 / 2 + 4 + local42 + this.aClass50_5.anInt7631, -1, local58);
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIZI)V")
	protected abstract void method8154(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1);

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(B)I")
	protected final int method8156() {
		@Pc(9) int local9 = Static521.aClass258_1.method5983();
		@Pc(13) int local13 = local9 * 100;
		if (local9 == this.anInt10442 && local9 != 0) {
			@Pc(35) int local35 = Static521.aClass258_1.method5981();
			if (local35 > local9) {
				@Pc(45) long local45 = this.aLong292 - Static521.aClass258_1.method5979();
				if (local45 > 0L) {
					@Pc(63) long local63 = (long) (local35 - local9) * (local45 * 10000L / (long) local9);
					@Pc(72) long local72 = (Static112.method2047() - this.aLong292) * 10000L;
					if (local72 >= local63) {
						local13 = local35 * 100;
					} else {
						local13 = (int) ((long) (local9 * 100) + local72 * 100L * (long) (local35 - local9) / local63);
					}
				}
			}
		} else {
			this.anInt10442 = local9;
			this.aLong292 = Static112.method2047();
		}
		return local13;
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8149() {
		@Pc(5) boolean local5 = true;
		if (!this.aClass348_134.method7960(this.aClass50_5.anInt7632)) {
			local5 = false;
		}
		if (!this.aClass348_133.method7960(this.aClass50_5.anInt7632)) {
			local5 = false;
		}
		return local5;
	}
}
