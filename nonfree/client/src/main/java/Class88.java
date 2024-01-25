import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lda")
public abstract class Class88 implements Interface11 {

	@OriginalMember(owner = "client!lda", name = "d", descriptor = "J")
	private long aLong257;

	@OriginalMember(owner = "client!lda", name = "e", descriptor = "Lclient!ta;")
	private Class111 aClass111_13;

	@OriginalMember(owner = "client!lda", name = "k", descriptor = "I")
	private int anInt10220;

	@OriginalMember(owner = "client!lda", name = "h", descriptor = "Lclient!pe;")
	protected final Class254 aClass254_138;

	@OriginalMember(owner = "client!lda", name = "l", descriptor = "Lclient!pe;")
	private final Class254 aClass254_139;

	@OriginalMember(owner = "client!lda", name = "b", descriptor = "Lclient!qga;")
	protected final Class260 aClass260_5;

	@OriginalMember(owner = "client!lda", name = "<init>", descriptor = "(Lclient!pe;Lclient!pe;Lclient!qga;)V")
	protected Class88(@OriginalArg(0) Class254 arg0, @OriginalArg(1) Class254 arg1, @OriginalArg(2) Class260 arg2) {
		this.aClass254_138 = arg0;
		this.aClass254_139 = arg1;
		this.aClass260_5 = arg2;
	}

	@OriginalMember(owner = "client!lda", name = "b", descriptor = "(B)I")
	protected final int method8279() {
		@Pc(9) int local9 = Static313.aClass163_1.method3926();
		@Pc(13) int local13 = local9 * 100;
		if (this.anInt10220 == local9 && local9 != 0) {
			@Pc(27) int local27 = Static313.aClass163_1.method3924();
			if (local27 > local9) {
				@Pc(42) long local42 = this.aLong257 - Static313.aClass163_1.method3935();
				if (local42 > 0L) {
					@Pc(60) long local60 = local42 * 10000L / (long) local9 * (long) (local27 - local9);
					@Pc(69) long local69 = (Static376.method6088() - this.aLong257) * 10000L;
					if (local69 < local60) {
						local13 = (int) ((long) (local9 * 100) + (long) (local27 - local9) * local69 * 100L / local60);
					} else {
						local13 = local27 * 100;
					}
				}
			}
		} else {
			this.anInt10220 = local9;
			this.aLong257 = Static376.method6088();
		}
		return local13;
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(I)V")
	@Override
	public void method8277() {
		@Pc(19) Class297 local19 = Static356.method5901(this.aClass254_139, this.aClass260_5.anInt9478);
		this.aClass111_13 = Static546.aClass15_16.method5346(local19, Static599.method819(this.aClass254_138, this.aClass260_5.anInt9478));
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(ZIII)V")
	protected abstract void method8280(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1);

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(IZ)V")
	@Override
	public final void method8276() {
		@Pc(17) int local17 = this.aClass260_5.aClass100_11.method2801(Static507.anInt9382, this.aClass260_5.anInt9475) + this.aClass260_5.anInt9472;
		@Pc(31) int local31 = this.aClass260_5.aClass237_11.method6027(this.aClass260_5.anInt9476, Static227.anInt4616) + this.aClass260_5.anInt9473;
		this.method8282(local31, local17);
		this.method8280(local31, local17);
		@Pc(55) String local55 = Static313.aClass163_1.method3923();
		if (Static376.method6088() - this.aLong257 > 10000L) {
			local55 = local55 + " (" + Static313.aClass163_1.method3934().method7780() + ")";
		}
		this.aClass111_13.method6681(this.aClass260_5.anInt9477, local31 + this.aClass260_5.anInt9476 / 2 + this.aClass260_5.anInt9468 + 4, local55, local17 + this.aClass260_5.anInt9475 / 2, -1);
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(IZIB)V")
	protected abstract void method8282(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8278() {
		@Pc(10) boolean local10 = true;
		if (!this.aClass254_138.method6417(this.aClass260_5.anInt9478)) {
			local10 = false;
		}
		if (!this.aClass254_139.method6417(this.aClass260_5.anInt9478)) {
			local10 = false;
		}
		return local10;
	}
}
