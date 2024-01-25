import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ao")
public final class Class14 {

	@OriginalMember(owner = "client!ao", name = "q", descriptor = "I")
	public int anInt465;

	@OriginalMember(owner = "client!ao", name = "g", descriptor = "Lclient!qc;")
	private final Class231 aClass231_3 = new Class231(64);

	@OriginalMember(owner = "client!ao", name = "p", descriptor = "Lclient!qc;")
	public final Class231 aClass231_5 = new Class231(30);

	@OriginalMember(owner = "client!ao", name = "l", descriptor = "Lclient!dda;")
	private final Class53 aClass53_5;

	@OriginalMember(owner = "client!ao", name = "o", descriptor = "Lclient!dda;")
	public final Class53 aClass53_6;

	static {
		new Class202("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes dans aucun canal à l'heure actuelle.", "No momento você não está em um canal.");
	}

	@OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(Lclient!oda;ILclient!dda;Lclient!dda;)V")
	public Class14(@OriginalArg(0) Class212 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class53 arg2, @OriginalArg(3) Class53 arg3) {
		this.aClass53_5 = arg2;
		this.aClass53_6 = arg3;
		@Pc(26) int local26 = this.aClass53_5.method1607() - 1;
		this.aClass53_5.method1592(local26);
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(BI)V")
	public void method554(@OriginalArg(1) int arg0) {
		this.anInt465 = arg0;
		@Pc(9) Class231 local9 = this.aClass231_5;
		synchronized (this.aClass231_5) {
			this.aClass231_5.method6240();
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IZ)Lclient!pp;")
	public Class226 method555(@OriginalArg(0) int arg0) {
		@Pc(6) Class231 local6 = this.aClass231_3;
		@Pc(16) Class226 local16;
		synchronized (this.aClass231_3) {
			local16 = (Class226) this.aClass231_3.method6228((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class53 local29 = this.aClass53_5;
		@Pc(42) byte[] local42;
		synchronized (this.aClass53_5) {
			local42 = this.aClass53_5.method1616(Static479.method7148(arg0), Static319.method5095(arg0));
		}
		local16 = new Class226();
		local16.aClass14_2 = this;
		local16.anInt6965 = arg0;
		if (local42 != null) {
			local16.method5919(new Class2_Sub29(local42));
		}
		@Pc(77) Class231 local77 = this.aClass231_3;
		synchronized (this.aClass231_3) {
			this.aClass231_3.method6232(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(II)V")
	public void method556() {
		@Pc(2) Class231 local2 = this.aClass231_3;
		synchronized (this.aClass231_3) {
			this.aClass231_3.method6231(5);
		}
		local2 = this.aClass231_5;
		synchronized (this.aClass231_5) {
			this.aClass231_5.method6231(5);
		}
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(I)V")
	public void method558() {
		@Pc(10) Class231 local10 = this.aClass231_3;
		synchronized (this.aClass231_3) {
			this.aClass231_3.method6227();
		}
		local10 = this.aClass231_5;
		synchronized (this.aClass231_5) {
			this.aClass231_5.method6227();
		}
	}

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "(I)V")
	public void method559() {
		@Pc(8) Class231 local8 = this.aClass231_3;
		synchronized (this.aClass231_3) {
			this.aClass231_3.method6240();
		}
		local8 = this.aClass231_5;
		synchronized (this.aClass231_5) {
			this.aClass231_5.method6240();
		}
	}
}
