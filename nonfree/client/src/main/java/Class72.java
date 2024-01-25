import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dda")
public final class Class72 {

	@OriginalMember(owner = "client!dda", name = "k", descriptor = "I")
	private volatile int anInt1836;

	@OriginalMember(owner = "client!dda", name = "l", descriptor = "Lclient!wda;")
	private Class356 aClass356_1;

	@OriginalMember(owner = "client!dda", name = "h", descriptor = "Lclient!fca;")
	private final Class109 aClass109_2 = new Class109();

	@OriginalMember(owner = "client!dda", name = "i", descriptor = "Ljava/lang/String;")
	public final String aString15;

	@OriginalMember(owner = "client!dda", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class72(@OriginalArg(0) String arg0) {
		this.aString15 = arg0;
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(Lclient!lo;B)V")
	public void method1350(@OriginalArg(0) Class6_Sub1 arg0) {
		arg0.aBoolean676 = true;
		@Pc(9) Class109 local9 = this.aClass109_2;
		synchronized (this.aClass109_2) {
			this.aClass109_2.method2313(arg0);
			this.anInt1836++;
		}
		if (this.aClass356_1 != null) {
			@Pc(40) Class356 local40 = this.aClass356_1;
			synchronized (this.aClass356_1) {
				this.aClass356_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(ZLclient!lo;)V")
	public void method1351(@OriginalArg(1) Class6_Sub1 arg0) {
		arg0.aBoolean676 = false;
		@Pc(9) Class109 local9 = this.aClass109_2;
		synchronized (this.aClass109_2) {
			this.aClass109_2.method2313(arg0);
			this.anInt1836++;
		}
		if (this.aClass356_1 != null) {
			@Pc(34) Class356 local34 = this.aClass356_1;
			synchronized (this.aClass356_1) {
				this.aClass356_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!dda", name = "b", descriptor = "(I)Lclient!fga;")
	public Class6 method1353() {
		@Pc(16) Class109 local16 = this.aClass109_2;
		synchronized (this.aClass109_2) {
			@Pc(23) Class6 local23 = this.aClass109_2.method2314();
			local23.method7989();
			this.anInt1836--;
			return local23;
		}
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(BLclient!wu;)V")
	public void method1354(@OriginalArg(1) Class6_Sub10 arg0) {
		@Pc(6) Class109 local6 = this.aClass109_2;
		synchronized (this.aClass109_2) {
			this.aClass109_2.method2313(arg0);
			this.anInt1836++;
		}
		if (this.aClass356_1 != null) {
			@Pc(38) Class356 local38 = this.aClass356_1;
			synchronized (this.aClass356_1) {
				this.aClass356_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(ILclient!wda;)V")
	public void method1355(@OriginalArg(1) Class356 arg0) {
		this.aClass356_1 = arg0;
	}

	@OriginalMember(owner = "client!dda", name = "c", descriptor = "(I)Z")
	public boolean method1356() {
		return this.anInt1836 == 0;
	}
}
