import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hda")
public final class Class124 {

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "Lclient!ad;")
	private final Class6 aClass6_19 = new Class6(64);

	@OriginalMember(owner = "client!hda", name = "h", descriptor = "Lclient!tf;")
	private final Class322 aClass322_74;

	@OriginalMember(owner = "client!hda", name = "<init>", descriptor = "(Lclient!qh;ILclient!tf;)V")
	public Class124(@OriginalArg(0) Class274 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class322 arg2) {
		this.aClass322_74 = arg2;
		if (this.aClass322_74 != null) {
			this.aClass322_74.method6831(11);
		}
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(I)V")
	public void method3253() {
		@Pc(10) Class6 local10 = this.aClass6_19;
		synchronized (this.aClass6_19) {
			this.aClass6_19.method102();
		}
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(IB)V")
	public void method3254() {
		@Pc(6) Class6 local6 = this.aClass6_19;
		synchronized (this.aClass6_19) {
			this.aClass6_19.method97(5);
		}
	}

	@OriginalMember(owner = "client!hda", name = "b", descriptor = "(IB)Lclient!af;")
	public Class10 method3255(@OriginalArg(0) int arg0) {
		@Pc(6) Class6 local6 = this.aClass6_19;
		@Pc(16) Class10 local16;
		synchronized (this.aClass6_19) {
			local16 = (Class10) this.aClass6_19.method92((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class322 local29 = this.aClass322_74;
		@Pc(38) byte[] local38;
		synchronized (this.aClass322_74) {
			local38 = this.aClass322_74.method6802(11, arg0);
		}
		local16 = new Class10();
		if (local38 != null) {
			local16.method148(new Class3_Sub11(local38));
		}
		@Pc(68) Class6 local68 = this.aClass6_19;
		synchronized (this.aClass6_19) {
			this.aClass6_19.method106((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!hda", name = "b", descriptor = "(I)V")
	public void method3256() {
		@Pc(6) Class6 local6 = this.aClass6_19;
		synchronized (this.aClass6_19) {
			this.aClass6_19.method94();
		}
	}
}
