import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oea")
public final class Class246 {

	@OriginalMember(owner = "client!oea", name = "e", descriptor = "Lclient!mf;")
	private final Class222 aClass222_38 = new Class222(64);

	@OriginalMember(owner = "client!oea", name = "n", descriptor = "Lclient!pu;")
	private final Class270 aClass270_73;

	@OriginalMember(owner = "client!oea", name = "l", descriptor = "I")
	public final int anInt6278;

	@OriginalMember(owner = "client!oea", name = "<init>", descriptor = "(Lclient!kr;ILclient!pu;)V")
	public Class246(@OriginalArg(0) Class195 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class270 arg2) {
		this.aClass270_73 = arg2;
		if (this.aClass270_73 == null) {
			this.anInt6278 = 0;
		} else {
			this.anInt6278 = this.aClass270_73.method5685(16);
		}
	}

	@OriginalMember(owner = "client!oea", name = "b", descriptor = "(II)Lclient!ww;")
	public Class367 method5040(@OriginalArg(1) int arg0) {
		@Pc(6) Class222 local6 = this.aClass222_38;
		@Pc(16) Class367 local16;
		synchronized (this.aClass222_38) {
			local16 = (Class367) this.aClass222_38.method4430((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class270 local29 = this.aClass270_73;
		@Pc(38) byte[] local38;
		synchronized (this.aClass270_73) {
			local38 = this.aClass270_73.method5704(16, arg0);
		}
		local16 = new Class367();
		if (local38 != null) {
			local16.method7876(new Class1_Sub35(local38));
		}
		@Pc(60) Class222 local60 = this.aClass222_38;
		synchronized (this.aClass222_38) {
			this.aClass222_38.method4434(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(I)V")
	public void method5043() {
		@Pc(11) Class222 local11 = this.aClass222_38;
		synchronized (this.aClass222_38) {
			this.aClass222_38.method4428();
		}
	}

	@OriginalMember(owner = "client!oea", name = "b", descriptor = "(I)V")
	public void method5044() {
		@Pc(6) Class222 local6 = this.aClass222_38;
		synchronized (this.aClass222_38) {
			this.aClass222_38.method4422();
		}
	}

	@OriginalMember(owner = "client!oea", name = "c", descriptor = "(II)V")
	public void method5045() {
		@Pc(11) Class222 local11 = this.aClass222_38;
		synchronized (this.aClass222_38) {
			this.aClass222_38.method4433(5);
		}
	}
}
