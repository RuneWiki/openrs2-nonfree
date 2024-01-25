import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tg")
public final class Class349 {

	@OriginalMember(owner = "client!tg", name = "p", descriptor = "I")
	public int anInt8898;

	@OriginalMember(owner = "client!tg", name = "m", descriptor = "Lclient!tja;")
	private final Class352 aClass352_62 = new Class352(64);

	@OriginalMember(owner = "client!tg", name = "o", descriptor = "Lclient!tja;")
	public final Class352 aClass352_63 = new Class352(60);

	@OriginalMember(owner = "client!tg", name = "n", descriptor = "Lclient!bt;")
	private final Class34 aClass34_114;

	@OriginalMember(owner = "client!tg", name = "c", descriptor = "Lclient!bt;")
	public final Class34 aClass34_113;

	@OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(Lclient!mja;ILclient!bt;Lclient!bt;)V")
	public Class349(@OriginalArg(0) Class234 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class34 arg2, @OriginalArg(3) Class34 arg3) {
		this.aClass34_114 = arg2;
		this.aClass34_113 = arg3;
		@Pc(26) int local26 = this.aClass34_114.method1247() - 1;
		this.aClass34_114.method1233(local26);
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(II)Lclient!sb;")
	public Class323 method7597(@OriginalArg(1) int arg0) {
		@Pc(6) Class352 local6 = this.aClass352_62;
		@Pc(29) Class323 local29;
		synchronized (this.aClass352_62) {
			local29 = (Class323) this.aClass352_62.method7653((long) arg0);
		}
		if (local29 != null) {
			return local29;
		}
		@Pc(42) Class34 local42 = this.aClass34_114;
		@Pc(55) byte[] local55;
		synchronized (this.aClass34_114) {
			local55 = this.aClass34_114.method1239(Static252.method3670(arg0), Static224.method3271(arg0));
		}
		local29 = new Class323();
		local29.anInt8311 = arg0;
		local29.aClass349_2 = this;
		if (local55 != null) {
			local29.method7203(new Class4_Sub11(local55));
		}
		@Pc(83) Class352 local83 = this.aClass352_62;
		synchronized (this.aClass352_62) {
			this.aClass352_62.method7655((long) arg0, local29);
			return local29;
		}
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(II)V")
	public void method7600() {
		@Pc(6) Class352 local6 = this.aClass352_62;
		synchronized (this.aClass352_62) {
			this.aClass352_62.method7663(5);
		}
		local6 = this.aClass352_63;
		synchronized (this.aClass352_63) {
			this.aClass352_63.method7663(5);
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Z)V")
	public void method7601() {
		@Pc(2) Class352 local2 = this.aClass352_62;
		synchronized (this.aClass352_62) {
			this.aClass352_62.method7656();
		}
		local2 = this.aClass352_63;
		synchronized (this.aClass352_63) {
			this.aClass352_63.method7656();
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IB)V")
	public void method7602(@OriginalArg(0) int arg0) {
		this.anInt8898 = arg0;
		@Pc(9) Class352 local9 = this.aClass352_63;
		synchronized (this.aClass352_63) {
			this.aClass352_63.method7659();
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V")
	public void method7603() {
		@Pc(2) Class352 local2 = this.aClass352_62;
		synchronized (this.aClass352_62) {
			this.aClass352_62.method7659();
		}
		local2 = this.aClass352_63;
		synchronized (this.aClass352_63) {
			this.aClass352_63.method7659();
		}
	}
}
