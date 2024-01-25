import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dq")
public final class Class66 {

	@OriginalMember(owner = "client!dq", name = "k", descriptor = "I")
	private volatile int anInt2402;

	@OriginalMember(owner = "client!dq", name = "m", descriptor = "Lclient!st;")
	private Class313 aClass313_1;

	@OriginalMember(owner = "client!dq", name = "d", descriptor = "Lclient!sk;")
	private final Class309 aClass309_4 = new Class309();

	@OriginalMember(owner = "client!dq", name = "c", descriptor = "Ljava/lang/String;")
	public final String aString33;

	@OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class66(@OriginalArg(0) String arg0) {
		this.aString33 = arg0;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(BLclient!gfa;)V")
	public void method2152(@OriginalArg(1) Class9_Sub1 arg0) {
		arg0.aBoolean702 = true;
		@Pc(9) Class309 local9 = this.aClass309_4;
		synchronized (this.aClass309_4) {
			this.aClass309_4.method6595(arg0);
			this.anInt2402++;
		}
		if (this.aClass313_1 != null) {
			@Pc(41) Class313 local41 = this.aClass313_1;
			synchronized (this.aClass313_1) {
				this.aClass313_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(Lclient!st;I)V")
	public void method2153(@OriginalArg(0) Class313 arg0) {
		this.aClass313_1 = arg0;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(Lclient!gi;Z)V")
	public void method2154(@OriginalArg(0) Class9_Sub5 arg0) {
		@Pc(9) Class309 local9 = this.aClass309_4;
		synchronized (this.aClass309_4) {
			this.aClass309_4.method6595(arg0);
			this.anInt2402++;
		}
		if (this.aClass313_1 != null) {
			@Pc(38) Class313 local38 = this.aClass313_1;
			synchronized (this.aClass313_1) {
				this.aClass313_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(I)Z")
	public boolean method2156() {
		return this.anInt2402 == 0;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(Lclient!gfa;I)V")
	public void method2158(@OriginalArg(0) Class9_Sub1 arg0) {
		arg0.aBoolean702 = false;
		@Pc(9) Class309 local9 = this.aClass309_4;
		synchronized (this.aClass309_4) {
			this.aClass309_4.method6595(arg0);
			this.anInt2402++;
		}
		if (this.aClass313_1 != null) {
			@Pc(40) Class313 local40 = this.aClass313_1;
			synchronized (this.aClass313_1) {
				this.aClass313_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!dq", name = "c", descriptor = "(I)Lclient!ru;")
	public Class9 method2159() {
		@Pc(15) Class309 local15 = this.aClass309_4;
		synchronized (this.aClass309_4) {
			@Pc(22) Class9 local22 = this.aClass309_4.method6590();
			local22.method7465();
			this.anInt2402--;
			return local22;
		}
	}
}
