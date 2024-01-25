import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hh")
public final class Class130 {

	@OriginalMember(owner = "client!hh", name = "h", descriptor = "Lclient!ad;")
	private final Class6 aClass6_20 = new Class6(64);

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "Lclient!tf;")
	private final Class322 aClass322_76;

	@OriginalMember(owner = "client!hh", name = "e", descriptor = "I")
	public final int anInt3710;

	@OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(Lclient!qh;ILclient!tf;)V")
	public Class130(@OriginalArg(0) Class274 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class322 arg2) {
		this.aClass322_76 = arg2;
		if (this.aClass322_76 == null) {
			this.anInt3710 = 0;
		} else {
			this.anInt3710 = this.aClass322_76.method6831(16);
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V")
	public void method3315() {
		@Pc(2) Class6 local2 = this.aClass6_20;
		synchronized (this.aClass6_20) {
			this.aClass6_20.method94();
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IB)Lclient!pca;")
	public Class251 method3316(@OriginalArg(0) int arg0) {
		@Pc(6) Class6 local6 = this.aClass6_20;
		@Pc(16) Class251 local16;
		synchronized (this.aClass6_20) {
			local16 = (Class251) this.aClass6_20.method92((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class322 local29 = this.aClass322_76;
		@Pc(38) byte[] local38;
		synchronized (this.aClass322_76) {
			local38 = this.aClass322_76.method6802(16, arg0);
		}
		local16 = new Class251();
		if (local38 != null) {
			local16.method5818(new Class3_Sub11(local38));
		}
		@Pc(60) Class6 local60 = this.aClass6_20;
		synchronized (this.aClass6_20) {
			this.aClass6_20.method106((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(IB)V")
	public void method3317() {
		@Pc(16) Class6 local16 = this.aClass6_20;
		synchronized (this.aClass6_20) {
			this.aClass6_20.method97(5);
		}
	}

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "(I)V")
	public void method3320() {
		@Pc(6) Class6 local6 = this.aClass6_20;
		synchronized (this.aClass6_20) {
			this.aClass6_20.method102();
		}
	}
}
