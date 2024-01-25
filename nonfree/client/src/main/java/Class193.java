import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lfa")
public final class Class193 {

	@OriginalMember(owner = "client!lfa", name = "e", descriptor = "Lclient!jr;")
	private final Class169 aClass169_36 = new Class169(64);

	@OriginalMember(owner = "client!lfa", name = "i", descriptor = "Lclient!jr;")
	private final Class169 aClass169_37 = new Class169(100);

	@OriginalMember(owner = "client!lfa", name = "f", descriptor = "Lclient!in;")
	private final Class157 aClass157_160;

	@OriginalMember(owner = "client!lfa", name = "<init>", descriptor = "(Lclient!sj;ILclient!in;Lclient!in;Lclient!in;)V")
	public Class193(@OriginalArg(0) Class316 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class157 arg2, @OriginalArg(3) Class157 arg3, @OriginalArg(4) Class157 arg4) {
		this.aClass157_160 = arg2;
		if (this.aClass157_160 != null) {
			@Pc(26) int local26 = this.aClass157_160.method4568() - 1;
			this.aClass157_160.method4561(local26);
		}
		Static527.method9030(arg3, arg4);
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(B)V")
	public void method5572() {
		@Pc(2) Class169 local2 = this.aClass169_36;
		synchronized (this.aClass169_36) {
			this.aClass169_36.method5009();
		}
		local2 = this.aClass169_37;
		synchronized (this.aClass169_37) {
			this.aClass169_37.method5009();
		}
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(II)Lclient!hg;")
	public Class130 method5573(@OriginalArg(0) int arg0) {
		@Pc(6) Class169 local6 = this.aClass169_36;
		@Pc(18) Class130 local18;
		synchronized (this.aClass169_36) {
			local18 = (Class130) this.aClass169_36.method5002((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(37) Class157 local37 = this.aClass157_160;
		@Pc(52) byte[] local52;
		synchronized (this.aClass157_160) {
			local52 = this.aClass157_160.method4564(Static205.method4073(arg0), Static255.method4696(arg0));
		}
		local18 = new Class130();
		local18.anInt4713 = arg0;
		local18.aClass193_2 = this;
		if (local52 != null) {
			local18.method4097(new Class2_Sub11(local52));
		}
		local18.method4100();
		@Pc(83) Class169 local83 = this.aClass169_36;
		synchronized (this.aClass169_36) {
			this.aClass169_36.method5001(local18, (long) arg0);
			return local18;
		}
	}

	@OriginalMember(owner = "client!lfa", name = "b", descriptor = "(II)V")
	public void method5574() {
		@Pc(6) Class169 local6 = this.aClass169_36;
		synchronized (this.aClass169_36) {
			this.aClass169_36.method4997(5);
		}
		local6 = this.aClass169_37;
		synchronized (this.aClass169_37) {
			this.aClass169_37.method4997(5);
		}
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(I)V")
	public void method5576() {
		@Pc(2) Class169 local2 = this.aClass169_36;
		synchronized (this.aClass169_36) {
			this.aClass169_36.method5006();
		}
		local2 = this.aClass169_37;
		synchronized (this.aClass169_37) {
			this.aClass169_37.method5006();
		}
	}

	@OriginalMember(owner = "client!lfa", name = "c", descriptor = "(II)Lclient!gw;")
	public Class2_Sub6_Sub9 method5577(@OriginalArg(0) int arg0) {
		@Pc(6) Class169 local6 = this.aClass169_37;
		synchronized (this.aClass169_37) {
			@Pc(22) Class2_Sub6_Sub9 local22 = (Class2_Sub6_Sub9) this.aClass169_37.method5002((long) arg0);
			if (local22 == null) {
				local22 = new Class2_Sub6_Sub9(arg0);
				this.aClass169_37.method5001(local22, (long) arg0);
			}
			return local22.method3988() ? local22 : null;
		}
	}
}
