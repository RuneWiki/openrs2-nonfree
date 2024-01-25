import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cn")
public final class Class41 {

	@OriginalMember(owner = "client!cn", name = "p", descriptor = "I")
	public int anInt1483;

	@OriginalMember(owner = "client!cn", name = "c", descriptor = "Lclient!jv;")
	private final Class126 aClass126_11 = new Class126(64);

	@OriginalMember(owner = "client!cn", name = "n", descriptor = "Lclient!jv;")
	public final Class126 aClass126_12 = new Class126(30);

	@OriginalMember(owner = "client!cn", name = "i", descriptor = "Lclient!bu;")
	private final Class32 aClass32_25;

	@OriginalMember(owner = "client!cn", name = "d", descriptor = "Lclient!bu;")
	public final Class32 aClass32_24;

	@OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(Lclient!oq;ILclient!bu;Lclient!bu;)V")
	public Class41(@OriginalArg(0) Class183 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class32 arg2, @OriginalArg(3) Class32 arg3) {
		this.aClass32_25 = arg2;
		this.aClass32_24 = arg3;
		@Pc(26) int local26 = this.aClass32_25.method809() - 1;
		this.aClass32_25.method790(local26);
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(B)V")
	public void method1131() {
		@Pc(7) Class126 local7 = this.aClass126_11;
		synchronized (this.aClass126_11) {
			this.aClass126_11.method3131();
		}
		local7 = this.aClass126_12;
		synchronized (this.aClass126_12) {
			this.aClass126_12.method3131();
		}
	}

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "(B)V")
	public void method1132() {
		@Pc(14) Class126 local14 = this.aClass126_11;
		synchronized (this.aClass126_11) {
			this.aClass126_11.method3135();
		}
		local14 = this.aClass126_12;
		synchronized (this.aClass126_12) {
			this.aClass126_12.method3135();
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(II)Lclient!aq;")
	public Class13 method1134(@OriginalArg(0) int arg0) {
		@Pc(6) Class126 local6 = this.aClass126_11;
		@Pc(16) Class13 local16;
		synchronized (this.aClass126_11) {
			local16 = (Class13) this.aClass126_11.method3141((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) byte[] local37 = this.aClass32_25.method785(Static81.method2541(arg0), Static408.method5249(arg0));
		local16 = new Class13();
		local16.aClass41_1 = this;
		local16.anInt459 = arg0;
		if (local37 != null) {
			local16.method375(new Class3_Sub7(local37));
		}
		@Pc(64) Class126 local64 = this.aClass126_11;
		synchronized (this.aClass126_11) {
			this.aClass126_11.method3132((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(BI)V")
	public void method1135(@OriginalArg(1) int arg0) {
		this.anInt1483 = arg0;
		@Pc(15) Class126 local15 = this.aClass126_12;
		synchronized (this.aClass126_12) {
			this.aClass126_12.method3135();
		}
	}

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "(II)V")
	public void method1136() {
		@Pc(2) Class126 local2 = this.aClass126_11;
		synchronized (this.aClass126_11) {
			this.aClass126_11.method3140(5);
		}
		local2 = this.aClass126_12;
		synchronized (this.aClass126_12) {
			this.aClass126_12.method3140(5);
		}
	}
}
