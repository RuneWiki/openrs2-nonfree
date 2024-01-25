import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iha")
public final class Class168 {

	@OriginalMember(owner = "client!iha", name = "s", descriptor = "Lclient!wca;")
	private Class388 aClass388_4;

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "I")
	private final int anInt4201;

	@OriginalMember(owner = "client!iha", name = "c", descriptor = "I")
	private int anInt4212;

	@OriginalMember(owner = "client!iha", name = "i", descriptor = "Lclient!qr;")
	private final Class306 aClass306_17;

	@OriginalMember(owner = "client!iha", name = "<init>", descriptor = "(I)V")
	public Class168(@OriginalArg(0) int arg0) {
		this(arg0, arg0);
	}

	@OriginalMember(owner = "client!iha", name = "<init>", descriptor = "(II)V")
	public Class168(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass388_4 = new Class388();
		this.anInt4212 = arg0;
		this.anInt4201 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; arg0 > local14 + local14 && local14 < arg1; local14 += local14) {
		}
		this.aClass306_17 = new Class306(local14);
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(ZILjava/lang/Object;J)V")
	public void method3847(@OriginalArg(1) int arg0, @OriginalArg(2) Object arg1, @OriginalArg(3) long arg2) {
		if (this.anInt4201 < arg0) {
			throw new IllegalStateException("s>cs");
		}
		this.method3858(arg2);
		this.anInt4212 -= arg0;
		while (this.anInt4212 < 0) {
			@Pc(35) Class5_Sub1_Sub9 local35 = (Class5_Sub1_Sub9) this.aClass388_4.method9029();
			this.method3850(local35);
		}
		@Pc(51) Class5_Sub1_Sub9_Sub1 local51 = new Class5_Sub1_Sub9_Sub1(arg1, arg0);
		this.aClass306_17.method6944(local51, arg2, -12002);
		if (true) {
			this.aClass388_4.method9022(local51);
			local51.aLong298 = 0L;
		}
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(Z)I")
	public int method3848() {
		@Pc(7) int local7 = 0;
		for (@Pc(19) Class5_Sub1_Sub9 local19 = (Class5_Sub1_Sub9) this.aClass388_4.method9027(); local19 != null; local19 = (Class5_Sub1_Sub9) this.aClass388_4.method9024()) {
			if (!local19.method5528()) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(Lclient!wj;Z)V")
	private void method3850(@OriginalArg(0) Class5_Sub1_Sub9 arg0) {
		if (arg0 != null) {
			arg0.method9222();
			arg0.method8955();
			this.anInt4212 += arg0.anInt6251;
		}
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(II)V")
	public void method3852(@OriginalArg(0) int arg0) {
		if (Static559.aClass18_1 == null) {
			return;
		}
		for (@Pc(18) Class5_Sub1_Sub9 local18 = (Class5_Sub1_Sub9) this.aClass388_4.method9027(); local18 != null; local18 = (Class5_Sub1_Sub9) this.aClass388_4.method9024()) {
			if (local18.method5528()) {
				if (local18.method5526() == null) {
					local18.method9222();
					local18.method8955();
					this.anInt4212 += local18.anInt6251;
				}
			} else if ((long) arg0 < ++local18.aLong298) {
				@Pc(48) Class5_Sub1_Sub9 local48 = Static559.aClass18_1.method298(local18);
				this.aClass306_17.method6944(local48, local18.aLong312, -12002);
				Static183.method3162(local48, local18);
				local18.method9222();
				local18.method8955();
			}
		}
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(ZJLjava/lang/Object;)V")
	public void method3853(@OriginalArg(1) long arg0, @OriginalArg(2) Object arg1) {
		this.method3847(1, arg1, arg0);
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(I)I")
	public int method3854() {
		return this.anInt4201;
	}

	@OriginalMember(owner = "client!iha", name = "f", descriptor = "(I)I")
	public int method3855() {
		return this.anInt4212;
	}

	@OriginalMember(owner = "client!iha", name = "e", descriptor = "(I)V")
	public void method3856() {
		for (@Pc(11) Class5_Sub1_Sub9 local11 = (Class5_Sub1_Sub9) this.aClass388_4.method9027(); local11 != null; local11 = (Class5_Sub1_Sub9) this.aClass388_4.method9024()) {
			if (local11.method5528()) {
				local11.method9222();
				local11.method8955();
				this.anInt4212 += local11.anInt6251;
			}
		}
		if (5 != 5) {
			this.aClass388_4 = null;
		}
	}

	@OriginalMember(owner = "client!iha", name = "b", descriptor = "(IJ)V")
	private void method3858(@OriginalArg(1) long arg0) {
		@Pc(17) Class5_Sub1_Sub9 local17 = (Class5_Sub1_Sub9) this.aClass306_17.method6943(arg0);
		this.method3850(local17);
	}

	@OriginalMember(owner = "client!iha", name = "d", descriptor = "(I)Ljava/lang/Object;")
	public Object method3859() {
		@Pc(11) Class5_Sub1_Sub9 local11 = (Class5_Sub1_Sub9) this.aClass306_17.method6941();
		while (local11 != null) {
			@Pc(26) Object local26 = local11.method5526();
			if (local26 != null) {
				return local26;
			}
			@Pc(30) Class5_Sub1_Sub9 local30 = local11;
			local11 = (Class5_Sub1_Sub9) this.aClass306_17.method6940();
			local30.method9222();
			local30.method8955();
			this.anInt4212 += local30.anInt6251;
		}
		return null;
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(IJ)Ljava/lang/Object;")
	public Object method3860(@OriginalArg(1) long arg0) {
		@Pc(10) Class5_Sub1_Sub9 local10 = (Class5_Sub1_Sub9) this.aClass306_17.method6943(arg0);
		if (local10 == null) {
			return null;
		}
		@Pc(27) Object local27 = local10.method5526();
		if (local27 == null) {
			local10.method9222();
			local10.method8955();
			this.anInt4212 += local10.anInt6251;
			return null;
		}
		if (local10.method5528()) {
			@Pc(56) Class5_Sub1_Sub9_Sub1 local56 = new Class5_Sub1_Sub9_Sub1(local27, local10.anInt6251);
			this.aClass306_17.method6944(local56, local10.aLong312, -12002);
			this.aClass388_4.method9022(local56);
			local56.aLong298 = 0L;
			local10.method9222();
			local10.method8955();
		} else {
			this.aClass388_4.method9022(local10);
			local10.aLong298 = 0L;
		}
		return local27;
	}

	@OriginalMember(owner = "client!iha", name = "b", descriptor = "(I)Ljava/lang/Object;")
	public Object method3861() {
		@Pc(18) Class5_Sub1_Sub9 local18 = (Class5_Sub1_Sub9) this.aClass306_17.method6940();
		while (local18 != null) {
			@Pc(24) Object local24 = local18.method5526();
			if (local24 != null) {
				return local24;
			}
			@Pc(28) Class5_Sub1_Sub9 local28 = local18;
			local18 = (Class5_Sub1_Sub9) this.aClass306_17.method6940();
			local28.method9222();
			local28.method8955();
			this.anInt4212 += local28.anInt6251;
		}
		return null;
	}

	@OriginalMember(owner = "client!iha", name = "c", descriptor = "(I)V")
	public void method3862() {
		this.aClass388_4.method9021();
		this.aClass306_17.method6936();
		this.anInt4212 = this.anInt4201;
	}
}
