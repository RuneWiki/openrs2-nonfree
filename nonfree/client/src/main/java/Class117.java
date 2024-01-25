import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gh")
public final class Class117 {

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "Lclient!lga;")
	private final Class207 aClass207_15 = new Class207(64);

	@OriginalMember(owner = "client!gh", name = "f", descriptor = "Lclient!sea;")
	private final Class308 aClass308_67;

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "I")
	public final int anInt3150;

	@OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(Lclient!ci;ILclient!sea;)V")
	public Class117(@OriginalArg(0) Class42 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class308 arg2) {
		this.aClass308_67 = arg2;
		if (this.aClass308_67 == null) {
			this.anInt3150 = 0;
		} else {
			this.anInt3150 = this.aClass308_67.method6568(16);
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)Lclient!ap;")
	public Class14 method2696(@OriginalArg(1) int arg0) {
		@Pc(6) Class207 local6 = this.aClass207_15;
		@Pc(16) Class14 local16;
		synchronized (this.aClass207_15) {
			local16 = (Class14) this.aClass207_15.method4390((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class308 local29 = this.aClass308_67;
		@Pc(43) byte[] local43;
		synchronized (this.aClass308_67) {
			local43 = this.aClass308_67.method6569(16, arg0);
		}
		local16 = new Class14();
		if (local43 != null) {
			local16.method470(new Class1_Sub3(local43));
		}
		@Pc(65) Class207 local65 = this.aClass207_15;
		synchronized (this.aClass207_15) {
			this.aClass207_15.method4391((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(B)V")
	public void method2697() {
		@Pc(2) Class207 local2 = this.aClass207_15;
		synchronized (this.aClass207_15) {
			this.aClass207_15.method4392();
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V")
	public void method2698() {
		@Pc(11) Class207 local11 = this.aClass207_15;
		synchronized (this.aClass207_15) {
			this.aClass207_15.method4398();
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IB)V")
	public void method2699() {
		@Pc(2) Class207 local2 = this.aClass207_15;
		synchronized (this.aClass207_15) {
			this.aClass207_15.method4397(5);
		}
	}
}
