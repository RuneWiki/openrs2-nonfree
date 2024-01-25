import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fb")
public final class Class103 {

	@OriginalMember(owner = "client!fb", name = "m", descriptor = "I")
	private volatile int anInt3111;

	@OriginalMember(owner = "client!fb", name = "n", descriptor = "Lclient!no;")
	private Class235 aClass235_1;

	@OriginalMember(owner = "client!fb", name = "i", descriptor = "Lclient!hda;")
	private final Class143 aClass143_4 = new Class143();

	@OriginalMember(owner = "client!fb", name = "d", descriptor = "Ljava/lang/String;")
	public final String aString32;

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class103(@OriginalArg(0) String arg0) {
		this.aString32 = arg0;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)Lclient!kba;")
	public Class11 method2669() {
		@Pc(8) Class143 local8 = this.aClass143_4;
		synchronized (this.aClass143_4) {
			@Pc(22) Class11 local22 = this.aClass143_4.method3536();
			local22.method8372();
			this.anInt3111--;
			return local22;
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(BLclient!tia;)V")
	public void method2670(@OriginalArg(1) Class11_Sub9 arg0) {
		@Pc(6) Class143 local6 = this.aClass143_4;
		synchronized (this.aClass143_4) {
			this.aClass143_4.method3529(arg0);
			this.anInt3111++;
		}
		if (this.aClass235_1 != null) {
			@Pc(35) Class235 local35 = this.aClass235_1;
			synchronized (this.aClass235_1) {
				this.aClass235_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(BLclient!gs;)V")
	public void method2671(@OriginalArg(1) Class11_Sub1 arg0) {
		arg0.aBoolean732 = true;
		@Pc(9) Class143 local9 = this.aClass143_4;
		synchronized (this.aClass143_4) {
			this.aClass143_4.method3529(arg0);
			this.anInt3111++;
		}
		if (this.aClass235_1 != null) {
			@Pc(34) Class235 local34 = this.aClass235_1;
			synchronized (this.aClass235_1) {
				this.aClass235_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lclient!no;B)V")
	public void method2672(@OriginalArg(0) Class235 arg0) {
		this.aClass235_1 = arg0;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)Z")
	public boolean method2674() {
		return this.anInt3111 == 0;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZLclient!gs;)V")
	public void method2675(@OriginalArg(1) Class11_Sub1 arg0) {
		arg0.aBoolean732 = false;
		@Pc(16) Class143 local16 = this.aClass143_4;
		synchronized (this.aClass143_4) {
			this.aClass143_4.method3529(arg0);
			this.anInt3111++;
		}
		if (this.aClass235_1 != null) {
			@Pc(41) Class235 local41 = this.aClass235_1;
			synchronized (this.aClass235_1) {
				this.aClass235_1.notify();
			}
		}
	}
}
