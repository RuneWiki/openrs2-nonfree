import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gw")
public final class Class132 {

	@OriginalMember(owner = "client!gw", name = "p", descriptor = "I")
	public int anInt3763;

	@OriginalMember(owner = "client!gw", name = "k", descriptor = "Lclient!jn;")
	private final Class167 aClass167_13 = new Class167(64);

	@OriginalMember(owner = "client!gw", name = "o", descriptor = "Lclient!jn;")
	public final Class167 aClass167_14 = new Class167(60);

	@OriginalMember(owner = "client!gw", name = "n", descriptor = "Lclient!vo;")
	public final Class348 aClass348_46;

	@OriginalMember(owner = "client!gw", name = "g", descriptor = "Lclient!vo;")
	private final Class348 aClass348_45;

	@OriginalMember(owner = "client!gw", name = "<init>", descriptor = "(Lclient!gn;ILclient!vo;Lclient!vo;)V")
	public Class132(@OriginalArg(0) Class128 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class348 arg2, @OriginalArg(3) Class348 arg3) {
		this.aClass348_46 = arg3;
		this.aClass348_45 = arg2;
		@Pc(26) int local26 = this.aClass348_45.method7985() - 1;
		this.aClass348_45.method7981(local26);
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(I)V")
	public void method2953() {
		@Pc(2) Class167 local2 = this.aClass167_13;
		synchronized (this.aClass167_13) {
			this.aClass167_13.method3975();
		}
		local2 = this.aClass167_14;
		synchronized (this.aClass167_14) {
			this.aClass167_14.method3975();
		}
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(BI)V")
	public void method2954() {
		@Pc(2) Class167 local2 = this.aClass167_13;
		synchronized (this.aClass167_13) {
			this.aClass167_13.method3964(5);
		}
		local2 = this.aClass167_14;
		synchronized (this.aClass167_14) {
			this.aClass167_14.method3964(5);
		}
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(II)V")
	public void method2955(@OriginalArg(0) int arg0) {
		this.anInt3763 = arg0;
		@Pc(13) Class167 local13 = this.aClass167_14;
		synchronized (this.aClass167_14) {
			this.aClass167_14.method3961();
		}
	}

	@OriginalMember(owner = "client!gw", name = "b", descriptor = "(II)Lclient!cba;")
	public Class49 method2958(@OriginalArg(1) int arg0) {
		@Pc(6) Class167 local6 = this.aClass167_13;
		@Pc(16) Class49 local16;
		synchronized (this.aClass167_13) {
			local16 = (Class49) this.aClass167_13.method3966((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class348 local29 = this.aClass348_45;
		@Pc(42) byte[] local42;
		synchronized (this.aClass348_45) {
			local42 = this.aClass348_45.method7964(Static12.method740(arg0), Static411.method6229(arg0));
		}
		local16 = new Class49();
		local16.aClass132_1 = this;
		local16.anInt1454 = arg0;
		if (local42 != null) {
			local16.method1281(new Class4_Sub13(local42));
		}
		@Pc(78) Class167 local78 = this.aClass167_13;
		synchronized (this.aClass167_13) {
			this.aClass167_13.method3974((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(B)V")
	public void method2959() {
		@Pc(6) Class167 local6 = this.aClass167_13;
		synchronized (this.aClass167_13) {
			this.aClass167_13.method3961();
		}
		local6 = this.aClass167_14;
		synchronized (this.aClass167_14) {
			this.aClass167_14.method3961();
		}
	}
}
