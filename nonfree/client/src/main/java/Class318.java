import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!su")
public final class Class318 {

	@OriginalMember(owner = "client!su", name = "m", descriptor = "I")
	private volatile int anInt7917;

	@OriginalMember(owner = "client!su", name = "n", descriptor = "Lclient!gq;")
	private Class128 aClass128_1;

	@OriginalMember(owner = "client!su", name = "h", descriptor = "Lclient!mb;")
	private final Class220 aClass220_11 = new Class220();

	@OriginalMember(owner = "client!su", name = "k", descriptor = "Ljava/lang/String;")
	public final String aString122;

	@OriginalMember(owner = "client!su", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class318(@OriginalArg(0) String arg0) {
		this.aString122 = arg0;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(Lclient!caa;I)V")
	public void method6437(@OriginalArg(0) Class12_Sub2 arg0) {
		arg0.aBoolean781 = true;
		@Pc(9) Class220 local9 = this.aClass220_11;
		synchronized (this.aClass220_11) {
			this.aClass220_11.method4659(arg0);
			this.anInt7917++;
		}
		if (this.aClass128_1 != null) {
			@Pc(42) Class128 local42 = this.aClass128_1;
			synchronized (this.aClass128_1) {
				this.aClass128_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(Lclient!gq;I)V")
	public void method6438(@OriginalArg(0) Class128 arg0) {
		this.aClass128_1 = arg0;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(Lclient!rh;B)V")
	public void method6439(@OriginalArg(0) Class12_Sub8 arg0) {
		@Pc(2) Class220 local2 = this.aClass220_11;
		synchronized (this.aClass220_11) {
			this.aClass220_11.method4659(arg0);
			this.anInt7917++;
		}
		if (this.aClass128_1 != null) {
			@Pc(37) Class128 local37 = this.aClass128_1;
			synchronized (this.aClass128_1) {
				this.aClass128_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(Z)Z")
	public boolean method6442() {
		return this.anInt7917 == 0;
	}

	@OriginalMember(owner = "client!su", name = "b", descriptor = "(I)Lclient!mm;")
	public Class12 method6443() {
		@Pc(8) Class220 local8 = this.aClass220_11;
		synchronized (this.aClass220_11) {
			@Pc(15) Class12 local15 = this.aClass220_11.method4661();
			local15.method7630();
			this.anInt7917--;
			return local15;
		}
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(Lclient!caa;Z)V")
	public void method6445(@OriginalArg(0) Class12_Sub2 arg0) {
		arg0.aBoolean781 = false;
		@Pc(14) Class220 local14 = this.aClass220_11;
		synchronized (this.aClass220_11) {
			this.aClass220_11.method4659(arg0);
			this.anInt7917++;
		}
		if (this.aClass128_1 != null) {
			@Pc(39) Class128 local39 = this.aClass128_1;
			synchronized (this.aClass128_1) {
				this.aClass128_1.notify();
			}
		}
	}
}
