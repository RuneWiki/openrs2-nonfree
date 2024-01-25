import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qia")
public final class Class291 {

	@OriginalMember(owner = "client!qia", name = "i", descriptor = "Lclient!eda;")
	private final Class87 aClass87_190 = new Class87(64);

	@OriginalMember(owner = "client!qia", name = "g", descriptor = "Lclient!la;")
	private final Class207 aClass207_95;

	@OriginalMember(owner = "client!qia", name = "<init>", descriptor = "(Lclient!cr;ILclient!la;)V")
	public Class291(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class207 arg2) {
		this.aClass207_95 = arg2;
		if (this.aClass207_95 != null) {
			this.aClass207_95.method4672(11);
		}
	}

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(II)V")
	public void method6829() {
		@Pc(2) Class87 local2 = this.aClass87_190;
		synchronized (this.aClass87_190) {
			this.aClass87_190.method1793(5);
		}
	}

	@OriginalMember(owner = "client!qia", name = "b", descriptor = "(I)V")
	public void method6831() {
		@Pc(6) Class87 local6 = this.aClass87_190;
		synchronized (this.aClass87_190) {
			this.aClass87_190.method1801();
		}
	}

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(Z)V")
	public void method6835() {
		@Pc(6) Class87 local6 = this.aClass87_190;
		synchronized (this.aClass87_190) {
			this.aClass87_190.method1796();
		}
	}

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(BI)Lclient!aj;")
	public Class16 method6836(@OriginalArg(1) int arg0) {
		@Pc(6) Class87 local6 = this.aClass87_190;
		@Pc(16) Class16 local16;
		synchronized (this.aClass87_190) {
			local16 = (Class16) this.aClass87_190.method1805((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(39) Class207 local39 = this.aClass207_95;
		@Pc(48) byte[] local48;
		synchronized (this.aClass207_95) {
			local48 = this.aClass207_95.method4681(11, arg0);
		}
		local16 = new Class16();
		if (local48 != null) {
			local16.method236(new Class5_Sub22(local48));
		}
		@Pc(70) Class87 local70 = this.aClass87_190;
		synchronized (this.aClass87_190) {
			this.aClass87_190.method1792((long) arg0, local16);
			return local16;
		}
	}
}
