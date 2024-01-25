import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mq")
public final class Class223 {

	@OriginalMember(owner = "client!mq", name = "e", descriptor = "I")
	private final int anInt6352;

	@OriginalMember(owner = "client!mq", name = "m", descriptor = "I")
	private int anInt6359;

	@OriginalMember(owner = "client!mq", name = "p", descriptor = "Lclient!an;")
	private final Class18 aClass18_2;

	@OriginalMember(owner = "client!mq", name = "s", descriptor = "Lclient!waa;")
	private final Class350 aClass350_25;

	@OriginalMember(owner = "client!mq", name = "<init>", descriptor = "(I)V")
	public Class223(@OriginalArg(0) int arg0) {
		this(arg0, arg0);
	}

	@OriginalMember(owner = "client!mq", name = "<init>", descriptor = "(II)V")
	public Class223(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass18_2 = new Class18();
		this.anInt6359 = arg0;
		this.anInt6352 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; local14 + local14 < arg0 && local14 < arg1; local14 += local14) {
		}
		this.aClass350_25 = new Class350(local14);
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(IJ)Ljava/lang/Object;")
	public Object method5388(@OriginalArg(1) long arg0) {
		@Pc(15) Class4_Sub5_Sub5 local15 = (Class4_Sub5_Sub5) this.aClass350_25.method8207(arg0);
		if (local15 == null) {
			return null;
		}
		@Pc(23) Object local23 = local15.method3029();
		if (local23 == null) {
			local15.method8379();
			local15.method8015();
			this.anInt6359 += local15.anInt3411;
			return null;
		}
		if (local15.method3027()) {
			@Pc(51) Class4_Sub5_Sub5_Sub1 local51 = new Class4_Sub5_Sub5_Sub1(local23, local15.anInt3411);
			this.aClass350_25.method8199(local15.aLong268, local51);
			this.aClass18_2.method219(local51);
			local51.aLong257 = 0L;
			local15.method8379();
			local15.method8015();
		} else {
			this.aClass18_2.method219(local15);
			local15.aLong257 = 0L;
		}
		return local23;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(Ljava/lang/Object;BIJ)V")
	public void method5389(@OriginalArg(0) Object arg0, @OriginalArg(2) int arg1, @OriginalArg(3) long arg2) {
		if (arg1 > this.anInt6352) {
			throw new IllegalStateException("s>cs");
		}
		this.method5397(arg2);
		this.anInt6359 -= arg1;
		while (this.anInt6359 < 0) {
			@Pc(33) Class4_Sub5_Sub5 local33 = (Class4_Sub5_Sub5) this.aClass18_2.method226();
			this.method5393(local33);
		}
		@Pc(54) Class4_Sub5_Sub5_Sub1 local54 = new Class4_Sub5_Sub5_Sub1(arg0, arg1);
		this.aClass350_25.method8199(arg2, local54);
		this.aClass18_2.method219(local54);
		local54.aLong257 = 0L;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(I)Ljava/lang/Object;")
	public Object method5390() {
		@Pc(11) Class4_Sub5_Sub5 local11 = (Class4_Sub5_Sub5) this.aClass350_25.method8198();
		while (local11 != null) {
			@Pc(17) Object local17 = local11.method3029();
			if (local17 != null) {
				return local17;
			}
			@Pc(23) Class4_Sub5_Sub5 local23 = local11;
			local11 = (Class4_Sub5_Sub5) this.aClass350_25.method8205();
			local23.method8379();
			local23.method8015();
			this.anInt6359 += local23.anInt3411;
		}
		return null;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(B)I")
	public int method5391() {
		return this.anInt6359;
	}

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "(I)I")
	public int method5392() {
		@Pc(7) int local7 = 0;
		for (@Pc(13) Class4_Sub5_Sub5 local13 = (Class4_Sub5_Sub5) this.aClass18_2.method221(); local13 != null; local13 = (Class4_Sub5_Sub5) this.aClass18_2.method218()) {
			if (!local13.method3027()) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(ILclient!tca;)V")
	private void method5393(@OriginalArg(1) Class4_Sub5_Sub5 arg0) {
		if (arg0 != null) {
			arg0.method8379();
			arg0.method8015();
			this.anInt6359 += arg0.anInt3411;
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(Ljava/lang/Object;ZJ)V")
	public void method5394(@OriginalArg(0) Object arg0, @OriginalArg(2) long arg1) {
		this.method5389(arg0, 1, arg1);
	}

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "(B)I")
	public int method5395() {
		return this.anInt6352;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(JZ)V")
	private void method5397(@OriginalArg(0) long arg0) {
		@Pc(14) Class4_Sub5_Sub5 local14 = (Class4_Sub5_Sub5) this.aClass350_25.method8207(arg0);
		this.method5393(local14);
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(Z)V")
	public void method5398() {
		this.aClass18_2.method227();
		this.aClass350_25.method8203();
		this.anInt6359 = this.anInt6352;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(II)V")
	public void method5399(@OriginalArg(0) int arg0) {
		if (Static572.aClass122_2 == null) {
			return;
		}
		for (@Pc(7) Class4_Sub5_Sub5 local7 = (Class4_Sub5_Sub5) this.aClass18_2.method221(); local7 != null; local7 = (Class4_Sub5_Sub5) this.aClass18_2.method218()) {
			if (local7.method3027()) {
				if (local7.method3029() == null) {
					local7.method8379();
					local7.method8015();
					this.anInt6359++;
				}
			} else if ((long) arg0 < ++local7.aLong257) {
				@Pc(45) Class4_Sub5_Sub5 local45 = Static572.aClass122_2.method3102(local7);
				this.aClass350_25.method8199(local7.aLong268, local45);
				Static199.method3403(local45, local7);
				local7.method8379();
				local7.method8015();
			}
		}
	}

	@OriginalMember(owner = "client!mq", name = "c", descriptor = "(B)V")
	public void method5400() {
		for (@Pc(11) Class4_Sub5_Sub5 local11 = (Class4_Sub5_Sub5) this.aClass18_2.method221(); local11 != null; local11 = (Class4_Sub5_Sub5) this.aClass18_2.method218()) {
			if (local11.method3027()) {
				local11.method8379();
				local11.method8015();
				this.anInt6359 += local11.anInt3411;
			}
		}
	}

	@OriginalMember(owner = "client!mq", name = "d", descriptor = "(I)Ljava/lang/Object;")
	public Object method5401() {
		@Pc(11) Class4_Sub5_Sub5 local11 = (Class4_Sub5_Sub5) this.aClass350_25.method8205();
		while (local11 != null) {
			@Pc(24) Object local24 = local11.method3029();
			if (local24 != null) {
				return local24;
			}
			@Pc(28) Class4_Sub5_Sub5 local28 = local11;
			local11 = (Class4_Sub5_Sub5) this.aClass350_25.method8205();
			local28.method8379();
			local28.method8015();
			this.anInt6359 += local28.anInt3411;
		}
		return null;
	}
}
