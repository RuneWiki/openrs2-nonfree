import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tt")
public final class Class345 {

	@OriginalMember(owner = "client!tt", name = "i", descriptor = "Lclient!un;")
	private Class360 aClass360_1;

	@OriginalMember(owner = "client!tt", name = "j", descriptor = "I")
	private volatile int anInt9570;

	@OriginalMember(owner = "client!tt", name = "e", descriptor = "Lclient!eo;")
	private final Class102 aClass102_9 = new Class102();

	@OriginalMember(owner = "client!tt", name = "c", descriptor = "Ljava/lang/String;")
	public final String aString102;

	@OriginalMember(owner = "client!tt", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class345(@OriginalArg(0) String arg0) {
		this.aString102 = arg0;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(I)Z")
	public boolean method7945() {
		return this.anInt9570 == 0;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(BLclient!sf;)V")
	public void method7946(@OriginalArg(1) Class41_Sub1 arg0) {
		arg0.aBoolean763 = true;
		@Pc(9) Class102 local9 = this.aClass102_9;
		synchronized (this.aClass102_9) {
			this.aClass102_9.method2055(arg0);
			this.anInt9570++;
		}
		if (this.aClass360_1 != null) {
			@Pc(34) Class360 local34 = this.aClass360_1;
			synchronized (this.aClass360_1) {
				this.aClass360_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!un;Z)V")
	public void method7947(@OriginalArg(0) Class360 arg0) {
		this.aClass360_1 = arg0;
	}

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "(BLclient!sf;)V")
	public void method7948(@OriginalArg(1) Class41_Sub1 arg0) {
		arg0.aBoolean763 = false;
		@Pc(13) Class102 local13 = this.aClass102_9;
		synchronized (this.aClass102_9) {
			this.aClass102_9.method2055(arg0);
			this.anInt9570++;
		}
		if (this.aClass360_1 != null) {
			@Pc(38) Class360 local38 = this.aClass360_1;
			synchronized (this.aClass360_1) {
				this.aClass360_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(BLclient!w;)V")
	public void method7949(@OriginalArg(1) Class41_Sub10 arg0) {
		@Pc(2) Class102 local2 = this.aClass102_9;
		synchronized (this.aClass102_9) {
			this.aClass102_9.method2055(arg0);
			this.anInt9570++;
		}
		if (this.aClass360_1 != null) {
			@Pc(39) Class360 local39 = this.aClass360_1;
			synchronized (this.aClass360_1) {
				this.aClass360_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(B)Lclient!sga;")
	public Class41 method7953() {
		@Pc(14) Class102 local14 = this.aClass102_9;
		synchronized (this.aClass102_9) {
			@Pc(21) Class41 local21 = this.aClass102_9.method2062();
			local21.method8644();
			this.anInt9570--;
			return local21;
		}
	}
}
