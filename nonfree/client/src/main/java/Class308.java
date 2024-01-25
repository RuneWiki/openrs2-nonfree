import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ru")
public final class Class308 {

	@OriginalMember(owner = "client!ru", name = "c", descriptor = "Lclient!de;")
	private final Class69 aClass69_53 = new Class69(64);

	@OriginalMember(owner = "client!ru", name = "m", descriptor = "Lclient!de;")
	private final Class69 aClass69_54 = new Class69(100);

	@OriginalMember(owner = "client!ru", name = "f", descriptor = "Lclient!nd;")
	private final Class238 aClass238_230;

	@OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(Lclient!al;ILclient!nd;Lclient!nd;Lclient!nd;)V")
	public Class308(@OriginalArg(0) Class17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class238 arg2, @OriginalArg(3) Class238 arg3, @OriginalArg(4) Class238 arg4) {
		this.aClass238_230 = arg2;
		if (this.aClass238_230 != null) {
			@Pc(26) int local26 = this.aClass238_230.method5569() - 1;
			this.aClass238_230.method5592(local26);
		}
		Static154.method2689(arg3, arg4);
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(B)V")
	public void method7071() {
		@Pc(14) Class69 local14 = this.aClass69_53;
		synchronized (this.aClass69_53) {
			this.aClass69_53.method1905();
		}
		local14 = this.aClass69_54;
		synchronized (this.aClass69_54) {
			this.aClass69_54.method1905();
		}
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(IB)V")
	public void method7072() {
		@Pc(2) Class69 local2 = this.aClass69_53;
		synchronized (this.aClass69_53) {
			this.aClass69_53.method1910(5);
		}
		local2 = this.aClass69_54;
		synchronized (this.aClass69_54) {
			this.aClass69_54.method1910(5);
		}
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(II)Lclient!ic;")
	public Class2_Sub7_Sub6 method7074(@OriginalArg(0) int arg0) {
		@Pc(6) Class69 local6 = this.aClass69_54;
		synchronized (this.aClass69_54) {
			@Pc(24) Class2_Sub7_Sub6 local24 = (Class2_Sub7_Sub6) this.aClass69_54.method1919((long) arg0);
			if (local24 == null) {
				local24 = new Class2_Sub7_Sub6(arg0);
				this.aClass69_54.method1917((long) arg0, local24);
			}
			return local24.method3714() ? local24 : null;
		}
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(BI)Lclient!mk;")
	public Class228 method7075(@OriginalArg(1) int arg0) {
		@Pc(6) Class69 local6 = this.aClass69_53;
		@Pc(16) Class228 local16;
		synchronized (this.aClass69_53) {
			local16 = (Class228) this.aClass69_53.method1919((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class238 local29 = this.aClass238_230;
		@Pc(42) byte[] local42;
		synchronized (this.aClass238_230) {
			local42 = this.aClass238_230.method5567(Static300.method4739(arg0), Static429.method8915(arg0));
		}
		local16 = new Class228();
		local16.aClass308_1 = this;
		local16.anInt6230 = arg0;
		if (local42 != null) {
			local16.method5359(new Class2_Sub17(local42));
		}
		local16.method5352();
		@Pc(78) Class69 local78 = this.aClass69_53;
		synchronized (this.aClass69_53) {
			this.aClass69_53.method1917((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(I)V")
	public void method7076() {
		@Pc(6) Class69 local6 = this.aClass69_53;
		synchronized (this.aClass69_53) {
			this.aClass69_53.method1904();
		}
		local6 = this.aClass69_54;
		synchronized (this.aClass69_54) {
			this.aClass69_54.method1904();
		}
	}
}
