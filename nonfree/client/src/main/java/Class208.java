import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mh")
public final class Class208 {

	@OriginalMember(owner = "client!mh", name = "g", descriptor = "Lclient!ad;")
	private final Class6 aClass6_39 = new Class6(128);

	@OriginalMember(owner = "client!mh", name = "j", descriptor = "Lclient!tf;")
	private final Class322 aClass322_102;

	@OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(Lclient!qh;ILclient!tf;)V")
	public Class208(@OriginalArg(0) Class274 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class322 arg2) {
		this.aClass322_102 = arg2;
		this.aClass322_102.method6831(1);
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)Lclient!ov;")
	public Class247 method4725(@OriginalArg(1) int arg0) {
		@Pc(6) Class6 local6 = this.aClass6_39;
		@Pc(16) Class247 local16;
		synchronized (this.aClass6_39) {
			local16 = (Class247) this.aClass6_39.method92((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class322 local29 = this.aClass322_102;
		@Pc(38) byte[] local38;
		synchronized (this.aClass322_102) {
			local38 = this.aClass322_102.method6802(1, arg0);
		}
		local16 = new Class247();
		if (local38 != null) {
			local16.method5766(new Class3_Sub11(local38));
		}
		@Pc(62) Class6 local62 = this.aClass6_39;
		synchronized (this.aClass6_39) {
			this.aClass6_39.method106((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)V")
	public void method4726() {
		@Pc(11) Class6 local11 = this.aClass6_39;
		synchronized (this.aClass6_39) {
			this.aClass6_39.method102();
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(B)V")
	public void method4728() {
		@Pc(10) Class6 local10 = this.aClass6_39;
		synchronized (this.aClass6_39) {
			this.aClass6_39.method94();
		}
	}

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "(II)V")
	public void method4730() {
		@Pc(2) Class6 local2 = this.aClass6_39;
		synchronized (this.aClass6_39) {
			this.aClass6_39.method97(5);
		}
	}
}
