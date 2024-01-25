import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lr")
public final class Class203 {

	@OriginalMember(owner = "client!lr", name = "n", descriptor = "I")
	private volatile int anInt6115;

	@OriginalMember(owner = "client!lr", name = "o", descriptor = "Lclient!km;")
	private Class180 aClass180_1;

	@OriginalMember(owner = "client!lr", name = "j", descriptor = "Lclient!iv;")
	private final Class158 aClass158_12 = new Class158();

	@OriginalMember(owner = "client!lr", name = "m", descriptor = "Ljava/lang/String;")
	public final String aString122;

	@OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class203(@OriginalArg(0) String arg0) {
		this.aString122 = arg0;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(I)Lclient!fh;")
	public Class21 method4817() {
		@Pc(8) Class158 local8 = this.aClass158_12;
		synchronized (this.aClass158_12) {
			@Pc(23) Class21 local23 = this.aClass158_12.method3726();
			local23.method8246();
			this.anInt6115--;
			return local23;
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lclient!km;Z)V")
	public void method4818(@OriginalArg(0) Class180 arg0) {
		this.aClass180_1 = arg0;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lclient!vj;I)V")
	public void method4822(@OriginalArg(0) Class21_Sub1 arg0) {
		arg0.aBoolean714 = false;
		@Pc(9) Class158 local9 = this.aClass158_12;
		synchronized (this.aClass158_12) {
			this.aClass158_12.method3720(arg0);
			this.anInt6115++;
		}
		if (this.aClass180_1 != null) {
			@Pc(34) Class180 local34 = this.aClass180_1;
			synchronized (this.aClass180_1) {
				this.aClass180_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(B)Z")
	public boolean method4823() {
		return this.anInt6115 == 0;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(ILclient!vj;)V")
	public void method4824(@OriginalArg(1) Class21_Sub1 arg0) {
		arg0.aBoolean714 = true;
		@Pc(9) Class158 local9 = this.aClass158_12;
		synchronized (this.aClass158_12) {
			this.aClass158_12.method3720(arg0);
			this.anInt6115++;
		}
		if (this.aClass180_1 != null) {
			@Pc(40) Class180 local40 = this.aClass180_1;
			synchronized (this.aClass180_1) {
				this.aClass180_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lclient!dda;Z)V")
	public void method4826(@OriginalArg(0) Class21_Sub2 arg0) {
		@Pc(13) Class158 local13 = this.aClass158_12;
		synchronized (this.aClass158_12) {
			this.aClass158_12.method3720(arg0);
			this.anInt6115++;
		}
		if (this.aClass180_1 != null) {
			@Pc(38) Class180 local38 = this.aClass180_1;
			synchronized (this.aClass180_1) {
				this.aClass180_1.notify();
			}
		}
	}
}
