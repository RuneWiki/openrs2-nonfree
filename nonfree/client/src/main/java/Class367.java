import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ur")
public final class Class367 {

	@OriginalMember(owner = "client!ur", name = "k", descriptor = "Lclient!ui;")
	private final Class359 aClass359_67 = new Class359(64);

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "Lclient!lga;")
	private final Class223 aClass223_116;

	@OriginalMember(owner = "client!ur", name = "h", descriptor = "I")
	public final int anInt9877;

	@OriginalMember(owner = "client!ur", name = "<init>", descriptor = "(Lclient!fs;ILclient!lga;)V")
	public Class367(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class223 arg2) {
		this.aClass223_116 = arg2;
		if (this.aClass223_116 == null) {
			this.anInt9877 = 0;
		} else {
			this.anInt9877 = this.aClass223_116.method5264(47);
		}
	}

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "(II)Lclient!ec;")
	public Class89 method8572(@OriginalArg(1) int arg0) {
		@Pc(6) Class359 local6 = this.aClass359_67;
		@Pc(18) Class89 local18;
		synchronized (this.aClass359_67) {
			local18 = (Class89) this.aClass359_67.method8517((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(32) Class223 local32 = this.aClass223_116;
		@Pc(41) byte[] local41;
		synchronized (this.aClass223_116) {
			local41 = this.aClass223_116.method5267(arg0, 47);
		}
		local18 = new Class89();
		if (local41 != null) {
			local18.method2198(new Class6_Sub15(local41));
		}
		@Pc(65) Class359 local65 = this.aClass359_67;
		synchronized (this.aClass359_67) {
			this.aClass359_67.method8515((long) arg0, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Z)V")
	public void method8574() {
		@Pc(2) Class359 local2 = this.aClass359_67;
		synchronized (this.aClass359_67) {
			this.aClass359_67.method8511();
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(II)V")
	public void method8577() {
		@Pc(2) Class359 local2 = this.aClass359_67;
		synchronized (this.aClass359_67) {
			this.aClass359_67.method8502(5);
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(I)V")
	public void method8580() {
		@Pc(6) Class359 local6 = this.aClass359_67;
		synchronized (this.aClass359_67) {
			this.aClass359_67.method8507();
		}
	}
}
