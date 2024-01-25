import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eaa")
public final class Class90 {

	@OriginalMember(owner = "client!eaa", name = "f", descriptor = "Lclient!wca;")
	private final Class388 aClass388_1 = new Class388();

	@OriginalMember(owner = "client!eaa", name = "l", descriptor = "I")
	private int anInt1804;

	@OriginalMember(owner = "client!eaa", name = "b", descriptor = "I")
	private int anInt1806;

	@OriginalMember(owner = "client!eaa", name = "e", descriptor = "Lclient!qr;")
	private final Class306 aClass306_10;

	@OriginalMember(owner = "client!eaa", name = "<init>", descriptor = "(I)V")
	public Class90(@OriginalArg(0) int arg0) {
		this.anInt1804 = arg0;
		this.anInt1806 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; arg0 > local16 + local16; local16 += local16) {
		}
		this.aClass306_10 = new Class306(local16);
	}

	@OriginalMember(owner = "client!eaa", name = "c", descriptor = "(I)I")
	public int method1659() {
		return this.anInt1804;
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(BILclient!nba;Ljava/lang/Object;)V")
	private void method1660(@OriginalArg(2) Interface21 arg0, @OriginalArg(3) Object arg1) {
		if (this.anInt1806 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method1668(arg0);
		this.anInt1804--;
		while (this.anInt1804 < 0) {
			@Pc(35) Class5_Sub1_Sub6 local35 = (Class5_Sub1_Sub6) this.aClass388_1.method9029();
			this.method1666(local35);
		}
		@Pc(59) Class5_Sub1_Sub6_Sub1 local59 = new Class5_Sub1_Sub6_Sub1(arg0, arg1, 1);
		this.aClass306_10.method6944(local59, arg0.method1340(), -12002);
		this.aClass388_1.method9022(local59);
		local59.aLong298 = 0L;
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(Lclient!nba;B)Ljava/lang/Object;")
	public Object method1661(@OriginalArg(0) Interface21 arg0) {
		@Pc(9) long local9 = arg0.method1340();
		for (@Pc(16) Class5_Sub1_Sub6 local16 = (Class5_Sub1_Sub6) this.aClass306_10.method6943(local9); local16 != null; local16 = (Class5_Sub1_Sub6) this.aClass306_10.method6945()) {
			if (local16.anInterface21_3.method1339(arg0)) {
				@Pc(32) Object local32 = local16.method7257();
				if (local32 != null) {
					if (local16.method7256()) {
						@Pc(77) Class5_Sub1_Sub6_Sub1 local77 = new Class5_Sub1_Sub6_Sub1(arg0, local32, local16.anInt8436);
						this.aClass306_10.method6944(local77, local16.aLong312, -12002);
						this.aClass388_1.method9022(local77);
						local77.aLong298 = 0L;
						local16.method9222();
						local16.method8955();
					} else {
						this.aClass388_1.method9022(local16);
						local16.aLong298 = 0L;
					}
					return local32;
				}
				local16.method9222();
				local16.method8955();
				this.anInt1804 += local16.anInt8436;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(B)V")
	public void method1662() {
		this.aClass388_1.method9021();
		this.aClass306_10.method6936();
		this.anInt1804 = this.anInt1806;
	}

	@OriginalMember(owner = "client!eaa", name = "b", descriptor = "(I)I")
	public int method1663() {
		return this.anInt1806;
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(I)V")
	public void method1664() {
		for (@Pc(11) Class5_Sub1_Sub6 local11 = (Class5_Sub1_Sub6) this.aClass388_1.method9027(); local11 != null; local11 = (Class5_Sub1_Sub6) this.aClass388_1.method9024()) {
			if (local11.method7256()) {
				local11.method9222();
				local11.method8955();
				this.anInt1804 += local11.anInt8436;
			}
		}
		if (13194 != 13194) {
			this.anInt1806 = 112;
		}
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(BI)V")
	public void method1665() {
		if (Static286.aClass74_5 == null) {
			return;
		}
		for (@Pc(9) Class5_Sub1_Sub6 local9 = (Class5_Sub1_Sub6) this.aClass388_1.method9027(); local9 != null; local9 = (Class5_Sub1_Sub6) this.aClass388_1.method9024()) {
			if (local9.method7256()) {
				if (local9.method7257() == null) {
					local9.method9222();
					local9.method8955();
					this.anInt1804 += local9.anInt8436;
				}
			} else if (++local9.aLong298 > (long) 5) {
				@Pc(35) Class5_Sub1_Sub6 local35 = Static286.aClass74_5.method1388(local9);
				this.aClass306_10.method6944(local35, local9.aLong312, -12002);
				Static183.method3162(local35, local9);
				local9.method9222();
				local9.method8955();
			}
		}
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(ZLclient!qia;)V")
	private void method1666(@OriginalArg(1) Class5_Sub1_Sub6 arg0) {
		if (arg0 != null) {
			arg0.method9222();
			arg0.method8955();
			this.anInt1804 += arg0.anInt8436;
		}
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(BLjava/lang/Object;Lclient!nba;)V")
	public void method1667(@OriginalArg(1) Object arg0, @OriginalArg(2) Interface21 arg1) {
		this.method1660(arg1, arg0);
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(ILclient!nba;)V")
	private void method1668(@OriginalArg(1) Interface21 arg0) {
		@Pc(9) long local9 = arg0.method1340();
		for (@Pc(16) Class5_Sub1_Sub6 local16 = (Class5_Sub1_Sub6) this.aClass306_10.method6943(local9); local16 != null; local16 = (Class5_Sub1_Sub6) this.aClass306_10.method6945()) {
			if (local16.anInterface21_3.method1339(arg0)) {
				this.method1666(local16);
				return;
			}
		}
	}
}
