import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public final class Class129 {

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "I")
	public int anInt3258;

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "Lclient!dc;")
	public Class52 aClass52_2;

	@OriginalMember(owner = "client!kb", name = "h", descriptor = "I")
	private int anInt3261;

	@OriginalMember(owner = "client!kb", name = "i", descriptor = "I")
	public int anInt3262;

	static {
		new Class169("Attempting to join channel...", "Chatraum wird betreten...", "Tentative de connexion au canal...", "Tentando acessar canal...");
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!re;B)V")
	public void method2660(@OriginalArg(0) Class1_Sub33 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method5174();
			if (local13 == 0) {
				return;
			}
			this.method2663(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)Lclient!ff;")
	public synchronized Class80 method2661() {
		@Pc(13) Class80 local13 = (Class80) this.aClass52_2.aClass227_8.method4863((long) this.anInt3261);
		if (local13 != null) {
			return local13;
		}
		local13 = Static397.method1423(this.aClass52_2.aClass230_20, this.anInt3261, 0);
		if (local13 != null) {
			this.aClass52_2.aClass227_8.method4865(local13, (long) this.anInt3261);
		}
		return local13;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZILclient!re;)V")
	private void method2663(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub33 arg1) {
		if (arg0 == 1) {
			this.anInt3261 = arg1.method5177();
		} else if (arg0 == 2) {
			this.anInt3258 = arg1.method5174();
			this.anInt3262 = arg1.method5174();
			return;
		}
	}
}
