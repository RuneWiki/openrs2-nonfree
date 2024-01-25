import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jg")
public final class Class171 {

	@OriginalMember(owner = "client!jg", name = "d", descriptor = "Lclient!mq;")
	private final Class223 aClass223_31 = new Class223(256);

	@OriginalMember(owner = "client!jg", name = "g", descriptor = "Lclient!jn;")
	private final Class176 aClass176_65;

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(Lclient!er;ILclient!jn;)V")
	public Class171(@OriginalArg(0) Class92 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class176 arg2) {
		this.aClass176_65 = arg2;
		this.aClass176_65.method3999(26);
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)V")
	public void method3847() {
		@Pc(6) Class223 local6 = this.aClass223_31;
		synchronized (this.aClass223_31) {
			this.aClass223_31.method5398();
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IZ)Lclient!ud;")
	public Class4_Sub5_Sub17 method3848(@OriginalArg(0) int arg0) {
		@Pc(6) Class223 local6 = this.aClass223_31;
		@Pc(16) Class4_Sub5_Sub17 local16;
		synchronized (this.aClass223_31) {
			local16 = (Class4_Sub5_Sub17) this.aClass223_31.method5388((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class176 local29 = this.aClass176_65;
		@Pc(38) byte[] local38;
		synchronized (this.aClass176_65) {
			local38 = this.aClass176_65.method3994(arg0, 26);
		}
		local16 = new Class4_Sub5_Sub17();
		if (local38 != null) {
			local16.method7657(new Class4_Sub11(local38));
		}
		@Pc(60) Class223 local60 = this.aClass223_31;
		synchronized (this.aClass223_31) {
			this.aClass223_31.method5394(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!jg", name = "c", descriptor = "(I)V")
	public void method3849() {
		@Pc(6) Class223 local6 = this.aClass223_31;
		synchronized (this.aClass223_31) {
			this.aClass223_31.method5400();
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(II)V")
	public void method3850() {
		@Pc(2) Class223 local2 = this.aClass223_31;
		synchronized (this.aClass223_31) {
			this.aClass223_31.method5399(5);
		}
	}
}
