import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kca")
public final class Class157 {

	@OriginalMember(owner = "client!kca", name = "d", descriptor = "Lclient!qc;")
	private final Class231 aClass231_41 = new Class231(64);

	@OriginalMember(owner = "client!kca", name = "j", descriptor = "Lclient!qc;")
	private final Class231 aClass231_42 = new Class231(100);

	@OriginalMember(owner = "client!kca", name = "f", descriptor = "Lclient!dda;")
	private final Class53 aClass53_75;

	@OriginalMember(owner = "client!kca", name = "<init>", descriptor = "(Lclient!oda;ILclient!dda;Lclient!dda;Lclient!dda;)V")
	public Class157(@OriginalArg(0) Class212 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class53 arg2, @OriginalArg(3) Class53 arg3, @OriginalArg(4) Class53 arg4) {
		this.aClass53_75 = arg2;
		if (this.aClass53_75 != null) {
			@Pc(26) int local26 = this.aClass53_75.method1607() - 1;
			this.aClass53_75.method1592(local26);
		}
		Static204.method3283(arg4, arg3);
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(ZI)Lclient!aba;")
	public Class4 method3745(@OriginalArg(1) int arg0) {
		@Pc(6) Class231 local6 = this.aClass231_41;
		@Pc(16) Class4 local16;
		synchronized (this.aClass231_41) {
			local16 = (Class4) this.aClass231_41.method6228((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class53 local29 = this.aClass53_75;
		@Pc(42) byte[] local42;
		synchronized (this.aClass53_75) {
			local42 = this.aClass53_75.method1616(Static288.method5994(arg0), Static381.method5977(arg0));
		}
		local16 = new Class4();
		local16.anInt130 = arg0;
		local16.aClass157_1 = this;
		if (local42 != null) {
			local16.method274(new Class2_Sub29(local42));
		}
		local16.method272();
		@Pc(73) Class231 local73 = this.aClass231_41;
		synchronized (this.aClass231_41) {
			this.aClass231_41.method6232(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(I)V")
	public void method3746() {
		@Pc(6) Class231 local6 = this.aClass231_41;
		synchronized (this.aClass231_41) {
			this.aClass231_41.method6240();
		}
		local6 = this.aClass231_42;
		synchronized (this.aClass231_42) {
			this.aClass231_42.method6240();
		}
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(II)Lclient!vq;")
	public Class2_Sub13_Sub18 method3747(@OriginalArg(0) int arg0) {
		@Pc(11) Class231 local11 = this.aClass231_42;
		@Pc(21) Class2_Sub13_Sub18 local21;
		synchronized (this.aClass231_42) {
			local21 = (Class2_Sub13_Sub18) this.aClass231_42.method6228((long) arg0);
			if (local21 == null) {
				local21 = new Class2_Sub13_Sub18(arg0);
				this.aClass231_42.method6232(local21, (long) arg0);
			}
		}
		synchronized (local21) {
			return local21.method7531() ? local21 : null;
		}
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(IZ)V")
	public void method3749() {
		@Pc(6) Class231 local6 = this.aClass231_41;
		synchronized (this.aClass231_41) {
			this.aClass231_41.method6231(5);
		}
		local6 = this.aClass231_42;
		synchronized (this.aClass231_42) {
			this.aClass231_42.method6231(5);
		}
	}

	@OriginalMember(owner = "client!kca", name = "c", descriptor = "(I)V")
	public void method3750() {
		@Pc(2) Class231 local2 = this.aClass231_41;
		synchronized (this.aClass231_41) {
			this.aClass231_41.method6227();
		}
		local2 = this.aClass231_42;
		synchronized (this.aClass231_42) {
			this.aClass231_42.method6227();
		}
	}
}
