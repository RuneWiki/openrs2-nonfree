import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pha")
public final class Class287 {

	@OriginalMember(owner = "client!pha", name = "d", descriptor = "Lclient!pp;")
	private Class291 aClass291_1;

	@OriginalMember(owner = "client!pha", name = "o", descriptor = "I")
	private volatile int anInt7384;

	@OriginalMember(owner = "client!pha", name = "e", descriptor = "Lclient!wc;")
	private final Class387 aClass387_3 = new Class387();

	@OriginalMember(owner = "client!pha", name = "l", descriptor = "Ljava/lang/String;")
	public final String aString86;

	@OriginalMember(owner = "client!pha", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class287(@OriginalArg(0) String arg0) {
		this.aString86 = arg0;
	}

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "(ILclient!pp;)V")
	public void method6425(@OriginalArg(1) Class291 arg0) {
		this.aClass291_1 = arg0;
	}

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "(Lclient!rda;Z)V")
	public void method6427(@OriginalArg(0) Class4_Sub1 arg0) {
		arg0.aBoolean687 = false;
		@Pc(9) Class387 local9 = this.aClass387_3;
		synchronized (this.aClass387_3) {
			this.aClass387_3.method9017(arg0);
			this.anInt7384++;
		}
		if (this.aClass291_1 != null) {
			@Pc(34) Class291 local34 = this.aClass291_1;
			synchronized (this.aClass291_1) {
				this.aClass291_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "(Lclient!rda;B)V")
	public void method6429(@OriginalArg(0) Class4_Sub1 arg0) {
		arg0.aBoolean687 = true;
		@Pc(14) Class387 local14 = this.aClass387_3;
		synchronized (this.aClass387_3) {
			this.aClass387_3.method9017(arg0);
			this.anInt7384++;
		}
		if (this.aClass291_1 != null) {
			@Pc(39) Class291 local39 = this.aClass291_1;
			synchronized (this.aClass291_1) {
				this.aClass291_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!pha", name = "b", descriptor = "(I)Z")
	public boolean method6430() {
		return this.anInt7384 == 0;
	}

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "(ILclient!jw;)V")
	public void method6431(@OriginalArg(1) Class4_Sub5 arg0) {
		@Pc(2) Class387 local2 = this.aClass387_3;
		synchronized (this.aClass387_3) {
			this.aClass387_3.method9017(arg0);
			this.anInt7384++;
		}
		if (this.aClass291_1 != null) {
			@Pc(38) Class291 local38 = this.aClass291_1;
			synchronized (this.aClass291_1) {
				this.aClass291_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "(Z)Lclient!hga;")
	public Class4 method6432() {
		@Pc(8) Class387 local8 = this.aClass387_3;
		synchronized (this.aClass387_3) {
			@Pc(15) Class4 local15 = this.aClass387_3.method9018();
			local15.method8570();
			this.anInt7384--;
			return local15;
		}
	}
}
