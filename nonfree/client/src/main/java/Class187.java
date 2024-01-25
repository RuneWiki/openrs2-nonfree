import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kea")
public final class Class187 {

	@OriginalMember(owner = "client!kea", name = "n", descriptor = "Lclient!ei;")
	private Class80 aClass80_1;

	@OriginalMember(owner = "client!kea", name = "r", descriptor = "I")
	private volatile int anInt4888;

	@OriginalMember(owner = "client!kea", name = "j", descriptor = "Lclient!kr;")
	private final Class196 aClass196_3 = new Class196();

	@OriginalMember(owner = "client!kea", name = "c", descriptor = "Ljava/lang/String;")
	public final String aString54;

	@OriginalMember(owner = "client!kea", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class187(@OriginalArg(0) String arg0) {
		this.aString54 = arg0;
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(Lclient!kc;I)V")
	public void method3887(@OriginalArg(0) Class11_Sub7 arg0) {
		@Pc(6) Class196 local6 = this.aClass196_3;
		synchronized (this.aClass196_3) {
			this.aClass196_3.method4032(arg0);
			this.anInt4888++;
		}
		if (this.aClass80_1 != null) {
			@Pc(37) Class80 local37 = this.aClass80_1;
			synchronized (this.aClass80_1) {
				this.aClass80_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(I)Z")
	public boolean method3888() {
		return this.anInt4888 == 0;
	}

	@OriginalMember(owner = "client!kea", name = "b", descriptor = "(I)Lclient!ia;")
	public Class11 method3890() {
		@Pc(14) Class196 local14 = this.aClass196_3;
		synchronized (this.aClass196_3) {
			@Pc(21) Class11 local21 = this.aClass196_3.method4024();
			local21.method7200();
			this.anInt4888--;
			return local21;
		}
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(ILclient!ei;)V")
	public void method3891(@OriginalArg(1) Class80 arg0) {
		this.aClass80_1 = arg0;
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(Lclient!vv;I)V")
	public void method3893(@OriginalArg(0) Class11_Sub1 arg0) {
		arg0.aBoolean666 = false;
		@Pc(14) Class196 local14 = this.aClass196_3;
		synchronized (this.aClass196_3) {
			this.aClass196_3.method4032(arg0);
			this.anInt4888++;
		}
		if (this.aClass80_1 != null) {
			@Pc(39) Class80 local39 = this.aClass80_1;
			synchronized (this.aClass80_1) {
				this.aClass80_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(ILclient!vv;)V")
	public void method3897(@OriginalArg(1) Class11_Sub1 arg0) {
		arg0.aBoolean666 = true;
		@Pc(9) Class196 local9 = this.aClass196_3;
		synchronized (this.aClass196_3) {
			this.aClass196_3.method4032(arg0);
			this.anInt4888++;
		}
		if (this.aClass80_1 != null) {
			@Pc(34) Class80 local34 = this.aClass80_1;
			synchronized (this.aClass80_1) {
				this.aClass80_1.notify();
			}
		}
	}
}
