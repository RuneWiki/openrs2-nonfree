import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vga")
public abstract class Class154 implements Interface27 {

	@OriginalMember(owner = "client!vga", name = "d", descriptor = "I")
	private int anInt9213;

	@OriginalMember(owner = "client!vga", name = "e", descriptor = "Lclient!da;")
	private Class67 aClass67_12;

	@OriginalMember(owner = "client!vga", name = "m", descriptor = "J")
	private long aLong293;

	@OriginalMember(owner = "client!vga", name = "c", descriptor = "Lclient!lga;")
	private final Class223 aClass223_110;

	@OriginalMember(owner = "client!vga", name = "l", descriptor = "Lclient!lga;")
	protected final Class223 aClass223_109;

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "Lclient!sq;")
	protected final Class58 aClass58_5;

	@OriginalMember(owner = "client!vga", name = "<init>", descriptor = "(Lclient!lga;Lclient!lga;Lclient!sq;)V")
	protected Class154(@OriginalArg(0) Class223 arg0, @OriginalArg(1) Class223 arg1, @OriginalArg(2) Class58 arg2) {
		this.aClass223_110 = arg1;
		this.aClass223_109 = arg0;
		this.aClass58_5 = arg2;
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8038() {
		@Pc(11) boolean local11 = true;
		if (!this.aClass223_109.method5285(this.aClass58_5.anInt10054)) {
			local11 = false;
		}
		if (!this.aClass223_110.method5285(this.aClass58_5.anInt10054)) {
			local11 = false;
		}
		return local11;
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(IIBZ)V")
	protected abstract void method8041(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(BIZI)V")
	protected abstract void method8042(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1);

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(IZ)V")
	@Override
	public final void method8039() {
		@Pc(25) int local25 = this.aClass58_5.aClass318_20.method7565(this.aClass58_5.anInt10052, Static339.anInt5789) + this.aClass58_5.anInt10051;
		@Pc(40) int local40 = this.aClass58_5.aClass238_13.method5892(this.aClass58_5.anInt10050, Static48.anInt6772) + this.aClass58_5.anInt10055;
		this.method8041(local25, local40);
		this.method8042(local40, local25);
		@Pc(56) String local56 = Static616.aClass339_1.method8110();
		if (Static549.method7758() - this.aLong293 > 10000L) {
			local56 = local56 + " (" + Static616.aClass339_1.method8118().method7957() + ")";
		}
		this.aClass67_12.method8291(this.aClass58_5.anInt10050 / 2 + local40 + this.aClass58_5.anInt10053 + 4, local25 + this.aClass58_5.anInt10052 / 2, this.aClass58_5.anInt10056, -1, local56);
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(Z)I")
	protected final int method8043() {
		@Pc(15) int local15 = Static616.aClass339_1.method8116();
		@Pc(19) int local19 = local15 * 100;
		if (this.anInt9213 == local15 && local15 != 0) {
			@Pc(34) int local34 = Static616.aClass339_1.method8107();
			if (local15 < local34) {
				@Pc(45) long local45 = this.aLong293 - Static616.aClass339_1.method8115();
				if (local45 > 0L) {
					@Pc(62) long local62 = local45 * 10000L / (long) local15 * (long) (local34 - local15);
					@Pc(71) long local71 = (Static549.method7758() - this.aLong293) * 10000L;
					if (local62 <= local71) {
						local19 = local34 * 100;
					} else {
						local19 = (int) ((long) (local15 * 100) + (long) (local34 - local15) * local71 * 100L / local62);
					}
				}
			}
		} else {
			this.anInt9213 = local15;
			this.aLong293 = Static549.method7758();
		}
		return local19;
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(I)V")
	@Override
	public void method8040() {
		@Pc(11) Class53 local11 = Static287.method4708(this.aClass58_5.anInt10054, this.aClass223_110);
		this.aClass67_12 = Static202.aClass75_5.method6649(local11, Static691.method1247(this.aClass223_109, this.aClass58_5.anInt10054));
	}
}
