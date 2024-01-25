import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pl")
public final class Class290 {

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "Lclient!pda;")
	private final Class283 aClass283_9 = new Class283();

	@OriginalMember(owner = "client!pl", name = "f", descriptor = "I")
	private final int anInt8490;

	@OriginalMember(owner = "client!pl", name = "m", descriptor = "I")
	private int anInt8489;

	@OriginalMember(owner = "client!pl", name = "d", descriptor = "Lclient!gn;")
	private final Class136 aClass136_38;

	@OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(I)V")
	public Class290(@OriginalArg(0) int arg0) {
		this.anInt8490 = arg0;
		this.anInt8489 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; arg0 > local16 + local16; local16 += local16) {
		}
		this.aClass136_38 = new Class136(local16);
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Ljava/lang/Object;ILclient!jh;)V")
	public void method7128(@OriginalArg(0) Object arg0, @OriginalArg(2) Interface13 arg1) {
		this.method7134(arg0, arg1);
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Z)I")
	public int method7129(@OriginalArg(0) boolean arg0) {
		return arg0 ? this.anInt8489 : 45;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lclient!fha;B)V")
	private void method7130(@OriginalArg(0) Class3_Sub4_Sub7 arg0) {
		if (arg0 != null) {
			arg0.method9446();
			arg0.method8848();
			this.anInt8489 += arg0.anInt6457;
		}
	}

	@OriginalMember(owner = "client!pl", name = "c", descriptor = "(B)V")
	public void method7131() {
		this.aClass283_9.method7037();
		this.aClass136_38.method3505();
		this.anInt8489 = this.anInt8490;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(B)V")
	public void method7132() {
		for (@Pc(11) Class3_Sub4_Sub7 local11 = (Class3_Sub4_Sub7) this.aClass283_9.method7031(); local11 != null; local11 = (Class3_Sub4_Sub7) this.aClass283_9.method7035()) {
			if (local11.method5468()) {
				local11.method9446();
				local11.method8848();
				this.anInt8489 += local11.anInt6457;
			}
		}
		if (126 <= 108) {
			this.method7129(false);
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(ZLclient!jh;)V")
	private void method7133(@OriginalArg(1) Interface13 arg0) {
		@Pc(9) long local9 = arg0.method9027();
		for (@Pc(29) Class3_Sub4_Sub7 local29 = (Class3_Sub4_Sub7) this.aClass136_38.method3503(local9); local29 != null; local29 = (Class3_Sub4_Sub7) this.aClass136_38.method3510()) {
			if (local29.anInterface13_3.method9028(arg0)) {
				this.method7130(local29);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(BLjava/lang/Object;Lclient!jh;I)V")
	private void method7134(@OriginalArg(1) Object arg0, @OriginalArg(2) Interface13 arg1) {
		if (this.anInt8490 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method7133(arg1);
		this.anInt8489--;
		while (this.anInt8489 < 0) {
			@Pc(44) Class3_Sub4_Sub7 local44 = (Class3_Sub4_Sub7) this.aClass283_9.method7034();
			this.method7130(local44);
		}
		@Pc(61) Class3_Sub4_Sub7_Sub1 local61 = new Class3_Sub4_Sub7_Sub1(arg1, arg0, 1);
		this.aClass136_38.method3508(arg1.method9027(), local61);
		this.aClass283_9.method7036(local61);
		local61.aLong363 = 0L;
	}

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "(B)I")
	public int method7135() {
		return this.anInt8490;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lclient!jh;I)Ljava/lang/Object;")
	public Object method7136(@OriginalArg(0) Interface13 arg0) {
		@Pc(9) long local9 = arg0.method9027();
		for (@Pc(16) Class3_Sub4_Sub7 local16 = (Class3_Sub4_Sub7) this.aClass136_38.method3503(local9); local16 != null; local16 = (Class3_Sub4_Sub7) this.aClass136_38.method3510()) {
			if (local16.anInterface13_3.method9028(arg0)) {
				@Pc(37) Object local37 = local16.method5467();
				if (local37 != null) {
					if (local16.method5468()) {
						@Pc(82) Class3_Sub4_Sub7_Sub1 local82 = new Class3_Sub4_Sub7_Sub1(arg0, local37, local16.anInt6457);
						this.aClass136_38.method3508(local16.aLong382, local82);
						this.aClass283_9.method7036(local82);
						local82.aLong363 = 0L;
						local16.method9446();
						local16.method8848();
					} else {
						this.aClass283_9.method7036(local16);
						local16.aLong363 = 0L;
					}
					return local37;
				}
				local16.method9446();
				local16.method8848();
				this.anInt8489 += local16.anInt6457;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(II)V")
	public void method7137() {
		if (Static582.aClass143_6 == null) {
			return;
		}
		for (@Pc(13) Class3_Sub4_Sub7 local13 = (Class3_Sub4_Sub7) this.aClass283_9.method7031(); local13 != null; local13 = (Class3_Sub4_Sub7) this.aClass283_9.method7035()) {
			if (local13.method5468()) {
				if (local13.method5467() == null) {
					local13.method9446();
					local13.method8848();
					this.anInt8489 += local13.anInt6457;
				}
			} else if (++local13.aLong363 > (long) 5) {
				@Pc(43) Class3_Sub4_Sub7 local43 = Static582.aClass143_6.method3588(local13);
				this.aClass136_38.method3508(local13.aLong382, local43);
				Static511.method7264(local13, local43);
				local13.method9446();
				local13.method8848();
			}
		}
	}
}
