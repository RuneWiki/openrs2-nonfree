import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wu")
public final class Class394 {

	@OriginalMember(owner = "client!wu", name = "l", descriptor = "Lclient!afa;")
	private Class10 aClass10_1;

	@OriginalMember(owner = "client!wu", name = "n", descriptor = "I")
	private volatile int anInt10613;

	@OriginalMember(owner = "client!wu", name = "k", descriptor = "Lclient!ml;")
	private final Class236 aClass236_12 = new Class236();

	@OriginalMember(owner = "client!wu", name = "b", descriptor = "Ljava/lang/String;")
	public final String aString125;

	@OriginalMember(owner = "client!wu", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class394(@OriginalArg(0) String arg0) {
		this.aString125 = arg0;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Z)Z")
	public boolean method8973() {
		return this.anInt10613 == 0;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lclient!afa;Z)V")
	public void method8976(@OriginalArg(0) Class10 arg0) {
		this.aClass10_1 = arg0;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lclient!vja;I)V")
	public void method8977(@OriginalArg(0) Class3_Sub8 arg0) {
		@Pc(6) Class236 local6 = this.aClass236_12;
		synchronized (this.aClass236_12) {
			this.aClass236_12.method4955(arg0);
			this.anInt10613++;
		}
		if (this.aClass10_1 != null) {
			@Pc(39) Class10 local39 = this.aClass10_1;
			synchronized (this.aClass10_1) {
				this.aClass10_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lclient!gda;B)V")
	public void method8978(@OriginalArg(0) Class3_Sub1 arg0) {
		arg0.aBoolean770 = false;
		@Pc(17) Class236 local17 = this.aClass236_12;
		synchronized (this.aClass236_12) {
			this.aClass236_12.method4955(arg0);
			this.anInt10613++;
		}
		if (this.aClass10_1 != null) {
			@Pc(42) Class10 local42 = this.aClass10_1;
			synchronized (this.aClass10_1) {
				this.aClass10_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(B)Lclient!qha;")
	public Class3 method8979() {
		@Pc(8) Class236 local8 = this.aClass236_12;
		synchronized (this.aClass236_12) {
			@Pc(15) Class3 local15 = this.aClass236_12.method4958();
			local15.method8898();
			this.anInt10613--;
			return local15;
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lclient!gda;I)V")
	public void method8980(@OriginalArg(0) Class3_Sub1 arg0) {
		arg0.aBoolean770 = true;
		@Pc(9) Class236 local9 = this.aClass236_12;
		synchronized (this.aClass236_12) {
			this.aClass236_12.method4955(arg0);
			this.anInt10613++;
		}
		if (this.aClass10_1 != null) {
			@Pc(34) Class10 local34 = this.aClass10_1;
			synchronized (this.aClass10_1) {
				this.aClass10_1.notify();
			}
		}
	}
}
