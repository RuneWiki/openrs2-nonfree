import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ew")
public final class Class90 {

	@OriginalMember(owner = "client!ew", name = "n", descriptor = "Lclient!lga;")
	private final Class207 aClass207_9 = new Class207(64);

	@OriginalMember(owner = "client!ew", name = "o", descriptor = "I")
	public int anInt2574 = 0;

	@OriginalMember(owner = "client!ew", name = "c", descriptor = "Lclient!sea;")
	private final Class308 aClass308_50;

	@OriginalMember(owner = "client!ew", name = "h", descriptor = "I")
	public final int anInt2568;

	@OriginalMember(owner = "client!ew", name = "<init>", descriptor = "(Lclient!ci;ILclient!sea;)V")
	public Class90(@OriginalArg(0) Class42 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class308 arg2) {
		this.aClass308_50 = arg2;
		this.anInt2568 = this.aClass308_50.method6568(4);
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(II)V")
	public void method2259() {
		@Pc(2) Class207 local2 = this.aClass207_9;
		synchronized (this.aClass207_9) {
			this.aClass207_9.method4397(5);
		}
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(I)V")
	public void method2261() {
		@Pc(6) Class207 local6 = this.aClass207_9;
		synchronized (this.aClass207_9) {
			this.aClass207_9.method4398();
		}
	}

	@OriginalMember(owner = "client!ew", name = "b", descriptor = "(II)Lclient!ko;")
	public Class193 method2262(@OriginalArg(0) int arg0) {
		@Pc(6) Class207 local6 = this.aClass207_9;
		@Pc(16) Class193 local16;
		synchronized (this.aClass207_9) {
			local16 = (Class193) this.aClass207_9.method4390((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class308 local29 = this.aClass308_50;
		@Pc(38) byte[] local38;
		synchronized (this.aClass308_50) {
			local38 = this.aClass308_50.method6569(4, arg0);
		}
		local16 = new Class193();
		local16.anInt5026 = arg0;
		local16.aClass90_4 = this;
		if (local38 != null) {
			local16.method4014(new Class1_Sub3(local38));
		}
		local16.method4009();
		@Pc(69) Class207 local69 = this.aClass207_9;
		synchronized (this.aClass207_9) {
			this.aClass207_9.method4391((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ew", name = "c", descriptor = "(I)V")
	public void method2266() {
		@Pc(6) Class207 local6 = this.aClass207_9;
		synchronized (this.aClass207_9) {
			this.aClass207_9.method4392();
		}
	}
}
