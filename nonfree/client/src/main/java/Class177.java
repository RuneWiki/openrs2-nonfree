import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public final class Class177 {

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "Lclient!ad;")
	private final Class6 aClass6_30 = new Class6(64);

	@OriginalMember(owner = "client!ke", name = "g", descriptor = "Lclient!tf;")
	private final Class322 aClass322_93;

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(Lclient!qh;ILclient!tf;)V")
	public Class177(@OriginalArg(0) Class274 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class322 arg2) {
		this.aClass322_93 = arg2;
		this.aClass322_93.method6831(31);
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V")
	public void method4139() {
		@Pc(2) Class6 local2 = this.aClass6_30;
		synchronized (this.aClass6_30) {
			this.aClass6_30.method102();
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V")
	public void method4141() {
		@Pc(12) Class6 local12 = this.aClass6_30;
		synchronized (this.aClass6_30) {
			this.aClass6_30.method94();
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)V")
	public void method4144() {
		@Pc(6) Class6 local6 = this.aClass6_30;
		synchronized (this.aClass6_30) {
			this.aClass6_30.method97(5);
		}
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(II)Lclient!ri;")
	public Class291 method4145(@OriginalArg(1) int arg0) {
		@Pc(6) Class6 local6 = this.aClass6_30;
		@Pc(16) Class291 local16;
		synchronized (this.aClass6_30) {
			local16 = (Class291) this.aClass6_30.method92((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(35) Class322 local35 = this.aClass322_93;
		@Pc(44) byte[] local44;
		synchronized (this.aClass322_93) {
			local44 = this.aClass322_93.method6802(31, arg0);
		}
		local16 = new Class291();
		if (local44 != null) {
			local16.method6420(new Class3_Sub11(local44));
		}
		@Pc(66) Class6 local66 = this.aClass6_30;
		synchronized (this.aClass6_30) {
			this.aClass6_30.method106((long) arg0, local16);
			return local16;
		}
	}
}
