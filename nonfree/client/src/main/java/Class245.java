import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pca")
public final class Class245 {

	@OriginalMember(owner = "client!pca", name = "g", descriptor = "I")
	private int anInt7247;

	@OriginalMember(owner = "client!pca", name = "o", descriptor = "I")
	private final int anInt7252;

	@OriginalMember(owner = "client!pca", name = "q", descriptor = "Lclient!tq;")
	private final Class305 aClass305_31;

	@OriginalMember(owner = "client!pca", name = "w", descriptor = "Lclient!hv;")
	private final Class143 aClass143_9;

	@OriginalMember(owner = "client!pca", name = "<init>", descriptor = "(I)V")
	public Class245(@OriginalArg(0) int arg0) {
		this(arg0, arg0);
	}

	@OriginalMember(owner = "client!pca", name = "<init>", descriptor = "(II)V")
	private Class245(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass143_9 = new Class143();
		this.anInt7247 = arg0;
		this.anInt7252 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; arg0 > local14 + local14 && arg1 > local14; local14 += local14) {
		}
		this.aClass305_31 = new Class305(local14);
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(BLclient!fw;)V")
	private void method6074(@OriginalArg(1) Class6_Sub4_Sub5 arg0) {
		if (arg0 != null) {
			arg0.method8151();
			arg0.method8035();
			this.anInt7247 += arg0.anInt7586;
		}
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(Ljava/lang/Object;BJ)V")
	public void method6075(@OriginalArg(0) Object arg0, @OriginalArg(2) long arg1) {
		this.method6086(arg0, arg1);
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(I)V")
	public void method6076() {
		for (@Pc(16) Class6_Sub4_Sub5 local16 = (Class6_Sub4_Sub5) this.aClass143_9.method3839(); local16 != null; local16 = (Class6_Sub4_Sub5) this.aClass143_9.method3833()) {
			if (local16.method6328()) {
				local16.method8151();
				local16.method8035();
				this.anInt7247 += local16.anInt7586;
			}
		}
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(B)Ljava/lang/Object;")
	public Object method6077() {
		@Pc(16) Class6_Sub4_Sub5 local16 = (Class6_Sub4_Sub5) this.aClass305_31.method7445();
		while (local16 != null) {
			@Pc(22) Object local22 = local16.method6327();
			if (local22 != null) {
				return local22;
			}
			@Pc(26) Class6_Sub4_Sub5 local26 = local16;
			local16 = (Class6_Sub4_Sub5) this.aClass305_31.method7449();
			local26.method8151();
			local26.method8035();
			this.anInt7247 += local26.anInt7586;
		}
		return null;
	}

	@OriginalMember(owner = "client!pca", name = "b", descriptor = "(I)I")
	public int method6078() {
		return this.anInt7247;
	}

	@OriginalMember(owner = "client!pca", name = "b", descriptor = "(B)V")
	public void method6079() {
		this.aClass143_9.method3837();
		this.aClass305_31.method7440();
		this.anInt7247 = this.anInt7252;
	}

	@OriginalMember(owner = "client!pca", name = "c", descriptor = "(I)Ljava/lang/Object;")
	public Object method6080() {
		@Pc(18) Class6_Sub4_Sub5 local18 = (Class6_Sub4_Sub5) this.aClass305_31.method7449();
		while (local18 != null) {
			@Pc(24) Object local24 = local18.method6327();
			if (local24 != null) {
				return local24;
			}
			@Pc(28) Class6_Sub4_Sub5 local28 = local18;
			local18 = (Class6_Sub4_Sub5) this.aClass305_31.method7449();
			local28.method8151();
			local28.method8035();
			this.anInt7247 += local28.anInt7586;
		}
		return null;
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(JI)V")
	private void method6081(@OriginalArg(0) long arg0) {
		@Pc(15) Class6_Sub4_Sub5 local15 = (Class6_Sub4_Sub5) this.aClass305_31.method7447(arg0);
		this.method6074(local15);
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(BJ)Ljava/lang/Object;")
	public Object method6082(@OriginalArg(1) long arg0) {
		@Pc(18) Class6_Sub4_Sub5 local18 = (Class6_Sub4_Sub5) this.aClass305_31.method7447(arg0);
		if (local18 == null) {
			return null;
		}
		@Pc(26) Object local26 = local18.method6327();
		if (local26 == null) {
			local18.method8151();
			local18.method8035();
			this.anInt7247 += local18.anInt7586;
			return null;
		}
		if (local18.method6328()) {
			@Pc(54) Class6_Sub4_Sub5_Sub2 local54 = new Class6_Sub4_Sub5_Sub2(local26, local18.anInt7586);
			this.aClass305_31.method7448(local18.aLong252, local54);
			this.aClass143_9.method3835(local54);
			local54.aLong247 = 0L;
			local18.method8151();
			local18.method8035();
		} else {
			this.aClass143_9.method3835(local18);
			local18.aLong247 = 0L;
		}
		return local26;
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(ZI)V")
	public void method6083(@OriginalArg(1) int arg0) {
		if (Static443.aClass146_1 == null) {
			return;
		}
		for (@Pc(13) Class6_Sub4_Sub5 local13 = (Class6_Sub4_Sub5) this.aClass143_9.method3839(); local13 != null; local13 = (Class6_Sub4_Sub5) this.aClass143_9.method3833()) {
			if (local13.method6328()) {
				if (local13.method6327() == null) {
					local13.method8151();
					local13.method8035();
					this.anInt7247++;
				}
			} else if (++local13.aLong247 > (long) arg0) {
				@Pc(35) Class6_Sub4_Sub5 local35 = Static443.aClass146_1.method3944(local13);
				this.aClass305_31.method7448(local13.aLong252, local35);
				Static231.method4105(local35, local13);
				local13.method8151();
				local13.method8035();
			}
		}
	}

	@OriginalMember(owner = "client!pca", name = "d", descriptor = "(I)I")
	public int method6084() {
		return this.anInt7252;
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(Z)I")
	public int method6085() {
		@Pc(15) int local15 = 0;
		for (@Pc(21) Class6_Sub4_Sub5 local21 = (Class6_Sub4_Sub5) this.aClass143_9.method3839(); local21 != null; local21 = (Class6_Sub4_Sub5) this.aClass143_9.method3833()) {
			if (!local21.method6328()) {
				local15++;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(Ljava/lang/Object;JBI)V")
	public void method6086(@OriginalArg(0) Object arg0, @OriginalArg(1) long arg1) {
		if (this.anInt7252 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method6081(arg1);
		this.anInt7247--;
		while (this.anInt7247 < 0) {
			@Pc(32) Class6_Sub4_Sub5 local32 = (Class6_Sub4_Sub5) this.aClass143_9.method3836();
			this.method6074(local32);
		}
		@Pc(53) Class6_Sub4_Sub5_Sub2 local53 = new Class6_Sub4_Sub5_Sub2(arg0, 1);
		this.aClass305_31.method7448(arg1, local53);
		this.aClass143_9.method3835(local53);
		local53.aLong247 = 0L;
	}
}
