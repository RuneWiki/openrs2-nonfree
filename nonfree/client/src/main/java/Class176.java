import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kg")
public final class Class176 implements Interface16 {

	@OriginalMember(owner = "client!kg", name = "d", descriptor = "Lclient!da;")
	private Class27 aClass27_9;

	@OriginalMember(owner = "client!kg", name = "h", descriptor = "Lclient!k;")
	private final Class168 aClass168_1;

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "Lclient!oh;")
	private final Class237 aClass237_74;

	@OriginalMember(owner = "client!kg", name = "i", descriptor = "Lclient!oh;")
	private final Class237 aClass237_75;

	@OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(Lclient!oh;Lclient!oh;Lclient!k;)V")
	public Class176(@OriginalArg(0) Class237 arg0, @OriginalArg(1) Class237 arg1, @OriginalArg(2) Class168 arg2) {
		this.aClass168_1 = arg2;
		this.aClass237_74 = arg1;
		this.aClass237_75 = arg0;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8623() {
		@Pc(5) boolean local5 = true;
		if (!this.aClass237_75.method6296(this.aClass168_1.anInt5706)) {
			local5 = false;
		}
		if (!this.aClass237_74.method6296(this.aClass168_1.anInt5706)) {
			local5 = false;
		}
		return local5;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8622() {
		@Pc(15) int local15 = this.aClass168_1.aClass173_6.method4706(Static328.anInt9768, this.aClass168_1.anInt5708) + this.aClass168_1.anInt5701;
		@Pc(30) int local30 = this.aClass168_1.aClass60_7.method2078(Static594.anInt10159, this.aClass168_1.anInt5709) + this.aClass168_1.anInt5707;
		this.aClass27_9.method7011(this.aClass168_1.anInt5702, this.aClass168_1.anInt5699, null, null, this.aClass168_1.anInt5708, null, this.aClass168_1.anInt5710, 0, this.aClass168_1.anInt5704, local15, 0, this.aClass168_1.anInt5700, this.aClass168_1.aString67, this.aClass168_1.anInt5709, local30);
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)V")
	@Override
	public void method8624() {
		@Pc(15) Class345 local15 = Static549.method7716(this.aClass237_74, this.aClass168_1.anInt5706);
		this.aClass27_9 = Static171.aClass16_5.method6088(local15, Static647.method3298(this.aClass237_75, this.aClass168_1.anInt5706));
	}
}
