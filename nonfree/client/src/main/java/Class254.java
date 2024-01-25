import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oq")
public final class Class254 {

	@OriginalMember(owner = "client!oq", name = "j", descriptor = "Lclient!jn;")
	private final Class167 aClass167_39 = new Class167(64);

	@OriginalMember(owner = "client!oq", name = "l", descriptor = "Lclient!jn;")
	private final Class167 aClass167_40 = new Class167(100);

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "Lclient!vo;")
	private final Class348 aClass348_90;

	@OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(Lclient!gn;ILclient!vo;Lclient!vo;Lclient!vo;)V")
	public Class254(@OriginalArg(0) Class128 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class348 arg2, @OriginalArg(3) Class348 arg3, @OriginalArg(4) Class348 arg4) {
		this.aClass348_90 = arg2;
		if (this.aClass348_90 != null) {
			@Pc(26) int local26 = this.aClass348_90.method7985() - 1;
			this.aClass348_90.method7981(local26);
		}
		Static371.method5563(arg3, arg4);
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(B)V")
	public void method5934() {
		@Pc(2) Class167 local2 = this.aClass167_39;
		synchronized (this.aClass167_39) {
			this.aClass167_39.method3975();
		}
		local2 = this.aClass167_40;
		synchronized (this.aClass167_40) {
			this.aClass167_40.method3975();
		}
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(II)Lclient!fo;")
	public Class111 method5936(@OriginalArg(1) int arg0) {
		@Pc(6) Class167 local6 = this.aClass167_39;
		@Pc(18) Class111 local18;
		synchronized (this.aClass167_39) {
			local18 = (Class111) this.aClass167_39.method3966((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class348 local31 = this.aClass348_90;
		@Pc(46) byte[] local46;
		synchronized (this.aClass348_90) {
			local46 = this.aClass348_90.method7964(Static558.method7915(arg0), Static230.method3747(arg0));
		}
		local18 = new Class111();
		local18.anInt3157 = arg0;
		local18.aClass254_2 = this;
		if (local46 != null) {
			local18.method2549(new Class4_Sub13(local46));
		}
		local18.method2547();
		@Pc(77) Class167 local77 = this.aClass167_39;
		synchronized (this.aClass167_39) {
			this.aClass167_39.method3974((long) arg0, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(I)V")
	public void method5937() {
		@Pc(6) Class167 local6 = this.aClass167_39;
		synchronized (this.aClass167_39) {
			this.aClass167_39.method3961();
		}
		local6 = this.aClass167_40;
		synchronized (this.aClass167_40) {
			this.aClass167_40.method3961();
		}
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(IB)V")
	public void method5939() {
		@Pc(2) Class167 local2 = this.aClass167_39;
		synchronized (this.aClass167_39) {
			this.aClass167_39.method3964(5);
		}
		local2 = this.aClass167_40;
		synchronized (this.aClass167_40) {
			this.aClass167_40.method3964(5);
		}
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(BI)Lclient!hea;")
	public Class4_Sub6_Sub8 method5940(@OriginalArg(1) int arg0) {
		@Pc(6) Class167 local6 = this.aClass167_40;
		synchronized (this.aClass167_40) {
			@Pc(16) Class4_Sub6_Sub8 local16 = (Class4_Sub6_Sub8) this.aClass167_40.method3966((long) arg0);
			if (local16 == null) {
				local16 = new Class4_Sub6_Sub8(arg0);
				this.aClass167_40.method3974((long) arg0, local16);
			}
			return local16.method3081() ? local16 : null;
		}
	}
}
