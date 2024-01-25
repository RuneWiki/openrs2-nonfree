import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!of")
public final class Class236 {

	@OriginalMember(owner = "client!of", name = "a", descriptor = "Lclient!pfa;")
	private final Class253 aClass253_27;

	@OriginalMember(owner = "client!of", name = "c", descriptor = "I")
	private final int anInt7560;

	@OriginalMember(owner = "client!of", name = "j", descriptor = "Lclient!sc;")
	private final Class302 aClass302_9;

	@OriginalMember(owner = "client!of", name = "q", descriptor = "I")
	private int anInt7572;

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "(I)V")
	public Class236(@OriginalArg(0) int arg0) {
		this(arg0, arg0);
	}

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "(II)V")
	public Class236(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass302_9 = new Class302();
		this.anInt7560 = arg0;
		this.anInt7572 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; local14 + local14 < arg0 && arg1 > local14; local14 += local14) {
		}
		this.aClass253_27 = new Class253(local14);
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IJLjava/lang/Object;)V")
	public void method6241(@OriginalArg(1) long arg0, @OriginalArg(2) Object arg1) {
		this.method6248(arg0, arg1, 1);
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(JI)Ljava/lang/Object;")
	public Object method6242(@OriginalArg(0) long arg0) {
		@Pc(14) Class8_Sub5_Sub1 local14 = (Class8_Sub5_Sub1) this.aClass253_27.method6594(arg0);
		if (local14 == null) {
			return null;
		}
		@Pc(22) Object local22 = local14.method7578();
		if (local22 == null) {
			local14.method8640();
			local14.method8381();
			this.anInt7572 += local14.anInt9287;
			return null;
		}
		if (local14.method7577()) {
			@Pc(62) Class8_Sub5_Sub1_Sub2 local62 = new Class8_Sub5_Sub1_Sub2(local22, local14.anInt9287);
			this.aClass253_27.method6591(local62, local14.aLong285);
			this.aClass302_9.method7328(local62);
			local62.aLong275 = 0L;
			local14.method8640();
			local14.method8381();
		} else {
			this.aClass302_9.method7328(local14);
			local14.aLong275 = 0L;
		}
		return local22;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(BI)V")
	public void method6243(@OriginalArg(1) int arg0) {
		if (Static77.aClass227_1 == null) {
			return;
		}
		for (@Pc(9) Class8_Sub5_Sub1 local9 = (Class8_Sub5_Sub1) this.aClass302_9.method7327(); local9 != null; local9 = (Class8_Sub5_Sub1) this.aClass302_9.method7326()) {
			if (local9.method7577()) {
				if (local9.method7578() == null) {
					local9.method8640();
					local9.method8381();
					this.anInt7572 += local9.anInt9287;
				}
			} else if ((long) arg0 < ++local9.aLong275) {
				@Pc(31) Class8_Sub5_Sub1 local31 = Static77.aClass227_1.method5825(local9);
				this.aClass253_27.method6591(local31, local9.aLong285);
				Static111.method2526(local31, local9);
				local9.method8640();
				local9.method8381();
			}
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(B)I")
	public int method6244() {
		return this.anInt7560;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V")
	public void method6245() {
		for (@Pc(15) Class8_Sub5_Sub1 local15 = (Class8_Sub5_Sub1) this.aClass302_9.method7327(); local15 != null; local15 = (Class8_Sub5_Sub1) this.aClass302_9.method7326()) {
			if (local15.method7577()) {
				local15.method8640();
				local15.method8381();
				this.anInt7572 += local15.anInt9287;
			}
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IJ)V")
	private void method6246(@OriginalArg(1) long arg0) {
		@Pc(10) Class8_Sub5_Sub1 local10 = (Class8_Sub5_Sub1) this.aClass253_27.method6594(arg0);
		this.method6252(local10);
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(I)I")
	public int method6247() {
		@Pc(7) int local7 = 0;
		for (@Pc(18) Class8_Sub5_Sub1 local18 = (Class8_Sub5_Sub1) this.aClass302_9.method7327(); local18 != null; local18 = (Class8_Sub5_Sub1) this.aClass302_9.method7326()) {
			if (!local18.method7577()) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IJLjava/lang/Object;I)V")
	public void method6248(@OriginalArg(1) long arg0, @OriginalArg(2) Object arg1, @OriginalArg(3) int arg2) {
		if (arg2 > this.anInt7560) {
			throw new IllegalStateException("s>cs");
		}
		this.method6246(arg0);
		this.anInt7572 -= arg2;
		while (this.anInt7572 < 0) {
			@Pc(34) Class8_Sub5_Sub1 local34 = (Class8_Sub5_Sub1) this.aClass302_9.method7330();
			this.method6252(local34);
		}
		@Pc(47) Class8_Sub5_Sub1_Sub2 local47 = new Class8_Sub5_Sub1_Sub2(arg1, arg2);
		this.aClass253_27.method6591(local47, arg0);
		this.aClass302_9.method7328(local47);
		local47.aLong275 = 0L;
	}

	@OriginalMember(owner = "client!of", name = "c", descriptor = "(I)I")
	public int method6249() {
		return this.anInt7572;
	}

	@OriginalMember(owner = "client!of", name = "e", descriptor = "(I)Ljava/lang/Object;")
	public Object method6251() {
		@Pc(17) Class8_Sub5_Sub1 local17 = (Class8_Sub5_Sub1) this.aClass253_27.method6593();
		while (local17 != null) {
			@Pc(23) Object local23 = local17.method7578();
			if (local23 != null) {
				return local23;
			}
			@Pc(27) Class8_Sub5_Sub1 local27 = local17;
			local17 = (Class8_Sub5_Sub1) this.aClass253_27.method6595();
			local27.method8640();
			local27.method8381();
			this.anInt7572 += local27.anInt9287;
		}
		return null;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(ILclient!lm;)V")
	private void method6252(@OriginalArg(1) Class8_Sub5_Sub1 arg0) {
		if (arg0 != null) {
			arg0.method8640();
			arg0.method8381();
			this.anInt7572 += arg0.anInt9287;
		}
	}

	@OriginalMember(owner = "client!of", name = "f", descriptor = "(I)V")
	public void method6253() {
		this.aClass302_9.method7322();
		this.aClass253_27.method6598();
		this.anInt7572 = this.anInt7560;
	}

	@OriginalMember(owner = "client!of", name = "g", descriptor = "(I)Ljava/lang/Object;")
	public Object method6254() {
		@Pc(11) Class8_Sub5_Sub1 local11 = (Class8_Sub5_Sub1) this.aClass253_27.method6595();
		while (local11 != null) {
			@Pc(17) Object local17 = local11.method7578();
			if (local17 != null) {
				return local17;
			}
			@Pc(21) Class8_Sub5_Sub1 local21 = local11;
			local11 = (Class8_Sub5_Sub1) this.aClass253_27.method6595();
			local21.method8640();
			local21.method8381();
			this.anInt7572 += local21.anInt9287;
		}
		return null;
	}
}
