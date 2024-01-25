import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hk")
public final class Class143 {

	@OriginalMember(owner = "client!hk", name = "c", descriptor = "Lclient!mga;")
	private final Class223 aClass223_32 = new Class223(256);

	@OriginalMember(owner = "client!hk", name = "d", descriptor = "Lclient!bi;")
	private final Class31 aClass31_42;

	@OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(Lclient!pca;ILclient!bi;)V")
	public Class143(@OriginalArg(0) Class263 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class31 arg2) {
		this.aClass31_42 = arg2;
		this.aClass31_42.method657(26);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(ZI)V")
	public void method3550() {
		@Pc(2) Class223 local2 = this.aClass223_32;
		synchronized (this.aClass223_32) {
			this.aClass223_32.method4933(5);
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(II)Lclient!wba;")
	public Class4_Sub7_Sub17 method3551(@OriginalArg(0) int arg0) {
		@Pc(6) Class223 local6 = this.aClass223_32;
		@Pc(16) Class4_Sub7_Sub17 local16;
		synchronized (this.aClass223_32) {
			local16 = (Class4_Sub7_Sub17) this.aClass223_32.method4943((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class31 local29 = this.aClass31_42;
		@Pc(38) byte[] local38;
		synchronized (this.aClass31_42) {
			local38 = this.aClass31_42.method667(26, arg0);
		}
		local16 = new Class4_Sub7_Sub17();
		if (local38 != null) {
			local16.method7853(new Class4_Sub9(local38));
		}
		@Pc(60) Class223 local60 = this.aClass223_32;
		synchronized (this.aClass223_32) {
			this.aClass223_32.method4938((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)V")
	public void method3552() {
		@Pc(2) Class223 local2 = this.aClass223_32;
		synchronized (this.aClass223_32) {
			this.aClass223_32.method4941();
		}
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(I)V")
	public void method3554() {
		@Pc(2) Class223 local2 = this.aClass223_32;
		synchronized (this.aClass223_32) {
			this.aClass223_32.method4932();
		}
	}
}
