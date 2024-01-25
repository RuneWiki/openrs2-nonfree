import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fh")
public final class Class98 {

	@OriginalMember(owner = "client!fh", name = "g", descriptor = "Lclient!ad;")
	private final Class6 aClass6_15 = new Class6(64);

	@OriginalMember(owner = "client!fh", name = "k", descriptor = "I")
	public int anInt3130 = 0;

	@OriginalMember(owner = "client!fh", name = "i", descriptor = "Lclient!tf;")
	private final Class322 aClass322_57;

	@OriginalMember(owner = "client!fh", name = "j", descriptor = "I")
	public final int anInt3129;

	@OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(Lclient!qh;ILclient!tf;)V")
	public Class98(@OriginalArg(0) Class274 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class322 arg2) {
		this.aClass322_57 = arg2;
		this.anInt3129 = this.aClass322_57.method6831(4);
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)V")
	public void method2822() {
		@Pc(2) Class6 local2 = this.aClass6_15;
		synchronized (this.aClass6_15) {
			this.aClass6_15.method97(5);
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)V")
	public void method2823() {
		@Pc(6) Class6 local6 = this.aClass6_15;
		synchronized (this.aClass6_15) {
			this.aClass6_15.method94();
		}
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(II)Lclient!ot;")
	public Class246 method2824(@OriginalArg(0) int arg0) {
		@Pc(11) Class6 local11 = this.aClass6_15;
		@Pc(21) Class246 local21;
		synchronized (this.aClass6_15) {
			local21 = (Class246) this.aClass6_15.method92((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class322 local34 = this.aClass322_57;
		@Pc(43) byte[] local43;
		synchronized (this.aClass322_57) {
			local43 = this.aClass322_57.method6802(4, arg0);
		}
		local21 = new Class246();
		local21.anInt6860 = arg0;
		local21.aClass98_4 = this;
		if (local43 != null) {
			local21.method5753(new Class3_Sub11(local43));
		}
		local21.method5750();
		@Pc(74) Class6 local74 = this.aClass6_15;
		synchronized (this.aClass6_15) {
			this.aClass6_15.method106((long) arg0, local21);
			return local21;
		}
	}

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "(I)V")
	public void method2827() {
		@Pc(6) Class6 local6 = this.aClass6_15;
		synchronized (this.aClass6_15) {
			this.aClass6_15.method102();
		}
	}
}
