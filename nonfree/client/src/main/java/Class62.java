import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ef")
public final class Class62 {

	@OriginalMember(owner = "client!ef", name = "o", descriptor = "Lclient!bo;")
	private final Class30 aClass30_1 = new Class30();

	@OriginalMember(owner = "client!ef", name = "l", descriptor = "I")
	private int anInt1741;

	@OriginalMember(owner = "client!ef", name = "j", descriptor = "I")
	private final int anInt1739;

	@OriginalMember(owner = "client!ef", name = "m", descriptor = "Lclient!aj;")
	private final Class10 aClass10_16;

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(I)V")
	public Class62(@OriginalArg(0) int arg0) {
		this.anInt1741 = arg0;
		this.anInt1739 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; local14 + local14 < arg0; local14 += local14) {
		}
		this.aClass10_16 = new Class10(local14);
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(BLclient!pc;)V")
	private void method1384(@OriginalArg(1) Interface5 arg0) {
		@Pc(9) long local9 = arg0.method4494();
		for (@Pc(22) Class7_Sub1_Sub9 local22 = (Class7_Sub1_Sub9) this.aClass10_16.method163(local9); local22 != null; local22 = (Class7_Sub1_Sub9) this.aClass10_16.method154()) {
			if (local22.anInterface5_3.method4495(arg0)) {
				local22.method5648();
				local22.method5509();
				this.anInt1741++;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILclient!pc;)Ljava/lang/Object;")
	public Object method1385(@OriginalArg(1) Interface5 arg0) {
		@Pc(7) long local7 = arg0.method4494();
		for (@Pc(14) Class7_Sub1_Sub9 local14 = (Class7_Sub1_Sub9) this.aClass10_16.method163(local7); local14 != null; local14 = (Class7_Sub1_Sub9) this.aClass10_16.method154()) {
			if (local14.anInterface5_3.method4495(arg0)) {
				@Pc(31) Object local31 = local14.method4768();
				if (local31 != null) {
					if (local14.method4766()) {
						@Pc(65) Class7_Sub1_Sub9_Sub2 local65 = new Class7_Sub1_Sub9_Sub2(arg0, local31);
						this.aClass10_16.method161(local14.aLong232, local65);
						this.aClass30_1.method515(local65);
						local65.aLong222 = 0L;
						local14.method5648();
						local14.method5509();
					} else {
						this.aClass30_1.method515(local14);
						local14.aLong222 = 0L;
					}
					return local31;
				}
				local14.method5648();
				local14.method5509();
				this.anInt1741++;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V")
	public void method1386() {
		this.aClass30_1.method509();
		this.aClass10_16.method156();
		this.anInt1741 = this.anInt1739;
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)I")
	public int method1387() {
		return this.anInt1741;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IB)V")
	public void method1388() {
		if (Static141.aClass66_1 == null) {
			return;
		}
		for (@Pc(13) Class7_Sub1_Sub9 local13 = (Class7_Sub1_Sub9) this.aClass30_1.method505(); local13 != null; local13 = (Class7_Sub1_Sub9) this.aClass30_1.method508()) {
			if (local13.method4766()) {
				if (local13.method4768() == null) {
					local13.method5648();
					local13.method5509();
					this.anInt1741++;
				}
			} else if (++local13.aLong222 > (long) 5) {
				@Pc(39) Class7_Sub1_Sub9 local39 = Static141.aClass66_1.method1511(local13);
				this.aClass10_16.method161(local13.aLong232, local39);
				Static200.method3577(local39, local13);
				local13.method5648();
				local13.method5509();
			}
		}
	}

	@OriginalMember(owner = "client!ef", name = "d", descriptor = "(I)I")
	public int method1390() {
		return this.anInt1739;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)V")
	public void method1392() {
		for (@Pc(17) Class7_Sub1_Sub9 local17 = (Class7_Sub1_Sub9) this.aClass30_1.method505(); local17 != null; local17 = (Class7_Sub1_Sub9) this.aClass30_1.method508()) {
			if (local17.method4766()) {
				local17.method5648();
				local17.method5509();
				this.anInt1741++;
			}
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Ljava/lang/Object;ILclient!pc;)V")
	public void method1394(@OriginalArg(0) Object arg0, @OriginalArg(2) Interface5 arg1) {
		this.method1384(arg1);
		if (this.anInt1741 == 0) {
			@Pc(16) Class7_Sub1_Sub9 local16 = (Class7_Sub1_Sub9) this.aClass30_1.method514();
			local16.method5648();
			local16.method5509();
		} else {
			this.anInt1741--;
		}
		@Pc(43) Class7_Sub1_Sub9_Sub2 local43 = new Class7_Sub1_Sub9_Sub2(arg1, arg0);
		this.aClass10_16.method161(arg1.method4494(), local43);
		this.aClass30_1.method515(local43);
		local43.aLong222 = 0L;
	}
}
