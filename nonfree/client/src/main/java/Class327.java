import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class327 {

	@OriginalMember(owner = "client!uc", name = "h", descriptor = "Lclient!mga;")
	private final Class223 aClass223_59 = new Class223(64);

	@OriginalMember(owner = "client!uc", name = "k", descriptor = "Lclient!mga;")
	private final Class223 aClass223_60 = new Class223(100);

	@OriginalMember(owner = "client!uc", name = "f", descriptor = "Lclient!bi;")
	private final Class31 aClass31_111;

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Lclient!pca;ILclient!bi;Lclient!bi;Lclient!bi;)V")
	public Class327(@OriginalArg(0) Class263 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class31 arg2, @OriginalArg(3) Class31 arg3, @OriginalArg(4) Class31 arg4) {
		this.aClass31_111 = arg2;
		if (this.aClass31_111 != null) {
			@Pc(26) int local26 = this.aClass31_111.method675() - 1;
			this.aClass31_111.method657(local26);
		}
		Static84.method1579(arg4, arg3);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)Lclient!wo;")
	public Class4_Sub7_Sub19 method7324(@OriginalArg(1) int arg0) {
		@Pc(6) Class223 local6 = this.aClass223_60;
		@Pc(16) Class4_Sub7_Sub19 local16;
		synchronized (this.aClass223_60) {
			local16 = (Class4_Sub7_Sub19) this.aClass223_60.method4943((long) arg0);
			if (local16 == null) {
				local16 = new Class4_Sub7_Sub19(arg0);
				this.aClass223_60.method4938((long) arg0, local16);
			}
		}
		synchronized (local16) {
			return local16.method7965() ? local16 : null;
		}
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(II)Lclient!dv;")
	public Class77 method7326(@OriginalArg(0) int arg0) {
		@Pc(6) Class223 local6 = this.aClass223_59;
		@Pc(16) Class77 local16;
		synchronized (this.aClass223_59) {
			local16 = (Class77) this.aClass223_59.method4943((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(35) Class31 local35 = this.aClass31_111;
		@Pc(50) byte[] local50;
		synchronized (this.aClass31_111) {
			local50 = this.aClass31_111.method667(Static522.method7308(arg0), Static444.method6280(arg0));
		}
		local16 = new Class77();
		local16.anInt2574 = arg0;
		local16.aClass327_1 = this;
		if (local50 != null) {
			local16.method2293(new Class4_Sub9(local50));
		}
		local16.method2296();
		@Pc(81) Class223 local81 = this.aClass223_59;
		synchronized (this.aClass223_59) {
			this.aClass223_59.method4938((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(B)V")
	public void method7328() {
		@Pc(2) Class223 local2 = this.aClass223_59;
		synchronized (this.aClass223_59) {
			this.aClass223_59.method4932();
		}
		local2 = this.aClass223_60;
		synchronized (this.aClass223_60) {
			this.aClass223_60.method4932();
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IB)V")
	public void method7329() {
		@Pc(6) Class223 local6 = this.aClass223_59;
		synchronized (this.aClass223_59) {
			this.aClass223_59.method4933(5);
		}
		local6 = this.aClass223_60;
		synchronized (this.aClass223_60) {
			this.aClass223_60.method4933(5);
		}
	}

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "(B)V")
	public void method7332() {
		@Pc(13) Class223 local13 = this.aClass223_59;
		synchronized (this.aClass223_59) {
			this.aClass223_59.method4941();
		}
		local13 = this.aClass223_60;
		synchronized (this.aClass223_60) {
			this.aClass223_60.method4941();
		}
	}
}
