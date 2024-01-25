import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bg")
public final class Class33 {

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "Lclient!ad;")
	private final Class6 aClass6_4 = new Class6(64);

	@OriginalMember(owner = "client!bg", name = "h", descriptor = "Lclient!tf;")
	private final Class322 aClass322_16;

	@OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(Lclient!qh;ILclient!tf;)V")
	public Class33(@OriginalArg(0) Class274 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class322 arg2) {
		this.aClass322_16 = arg2;
		this.aClass322_16.method6831(32);
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(II)Lclient!wu;")
	public Class365 method659(@OriginalArg(0) int arg0) {
		@Pc(6) Class6 local6 = this.aClass6_4;
		@Pc(16) Class365 local16;
		synchronized (this.aClass6_4) {
			local16 = (Class365) this.aClass6_4.method92((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class322 local29 = this.aClass322_16;
		@Pc(38) byte[] local38;
		synchronized (this.aClass322_16) {
			local38 = this.aClass322_16.method6802(32, arg0);
		}
		local16 = new Class365();
		if (local38 != null) {
			local16.method7942(new Class3_Sub11(local38));
		}
		@Pc(68) Class6 local68 = this.aClass6_4;
		synchronized (this.aClass6_4) {
			this.aClass6_4.method106((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IZ)V")
	public void method660() {
		@Pc(2) Class6 local2 = this.aClass6_4;
		synchronized (this.aClass6_4) {
			this.aClass6_4.method97(5);
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V")
	public void method661() {
		@Pc(2) Class6 local2 = this.aClass6_4;
		synchronized (this.aClass6_4) {
			this.aClass6_4.method102();
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Z)V")
	public void method662() {
		@Pc(6) Class6 local6 = this.aClass6_4;
		synchronized (this.aClass6_4) {
			this.aClass6_4.method94();
		}
	}
}
