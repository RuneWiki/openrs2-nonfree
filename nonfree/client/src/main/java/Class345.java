import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wm")
public final class Class345 {

	@OriginalMember(owner = "client!wm", name = "c", descriptor = "Lclient!vi;")
	private final Class332 aClass332_209 = new Class332(64);

	@OriginalMember(owner = "client!wm", name = "i", descriptor = "Lclient!vi;")
	private final Class332 aClass332_210 = new Class332(100);

	@OriginalMember(owner = "client!wm", name = "f", descriptor = "Lclient!pq;")
	private final Class251 aClass251_157;

	@OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(Lclient!uea;ILclient!pq;Lclient!pq;Lclient!pq;)V")
	public Class345(@OriginalArg(0) Class314 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class251 arg2, @OriginalArg(3) Class251 arg3, @OriginalArg(4) Class251 arg4) {
		this.aClass251_157 = arg2;
		if (this.aClass251_157 != null) {
			@Pc(26) int local26 = this.aClass251_157.method5847() - 1;
			this.aClass251_157.method5849(local26);
		}
		Static317.method4924(arg4, arg3);
	}

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "(I)V")
	public void method7795() {
		@Pc(2) Class332 local2 = this.aClass332_209;
		synchronized (this.aClass332_209) {
			this.aClass332_209.method7512();
		}
		local2 = this.aClass332_210;
		synchronized (this.aClass332_210) {
			this.aClass332_210.method7512();
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(II)Lclient!fv;")
	public Class6_Sub1_Sub7 method7796(@OriginalArg(0) int arg0) {
		@Pc(6) Class332 local6 = this.aClass332_210;
		@Pc(16) Class6_Sub1_Sub7 local16;
		synchronized (this.aClass332_210) {
			local16 = (Class6_Sub1_Sub7) this.aClass332_210.method7502((long) arg0);
			if (local16 == null) {
				local16 = new Class6_Sub1_Sub7(arg0);
				this.aClass332_210.method7498((long) arg0, local16);
			}
		}
		synchronized (local16) {
			return local16.method2240() ? local16 : null;
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IB)V")
	public void method7797() {
		@Pc(6) Class332 local6 = this.aClass332_209;
		synchronized (this.aClass332_209) {
			this.aClass332_209.method7497(5);
		}
		local6 = this.aClass332_210;
		synchronized (this.aClass332_210) {
			this.aClass332_210.method7497(5);
		}
	}

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "(IB)Lclient!fq;")
	public Class108 method7798(@OriginalArg(0) int arg0) {
		@Pc(14) Class332 local14 = this.aClass332_209;
		@Pc(24) Class108 local24;
		synchronized (this.aClass332_209) {
			local24 = (Class108) this.aClass332_209.method7502((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(37) Class251 local37 = this.aClass251_157;
		@Pc(50) byte[] local50;
		synchronized (this.aClass251_157) {
			local50 = this.aClass251_157.method5860(Static495.method6817(arg0), Static87.method1416(arg0));
		}
		local24 = new Class108();
		local24.anInt2600 = arg0;
		local24.aClass345_2 = this;
		if (local50 != null) {
			local24.method2190(new Class6_Sub14(local50));
		}
		local24.method2184();
		@Pc(81) Class332 local81 = this.aClass332_209;
		synchronized (this.aClass332_209) {
			this.aClass332_209.method7498((long) arg0, local24);
			return local24;
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Z)V")
	public void method7799() {
		@Pc(6) Class332 local6 = this.aClass332_209;
		synchronized (this.aClass332_209) {
			this.aClass332_209.method7510();
		}
		local6 = this.aClass332_210;
		synchronized (this.aClass332_210) {
			this.aClass332_210.method7510();
		}
	}
}
