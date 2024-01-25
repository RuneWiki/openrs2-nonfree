import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!au")
public final class Class21 {

	@OriginalMember(owner = "client!au", name = "a", descriptor = "I")
	private int anInt389;

	@OriginalMember(owner = "client!au", name = "n", descriptor = "Lclient!efa;")
	private final Class90 aClass90_1;

	@OriginalMember(owner = "client!au", name = "q", descriptor = "Lclient!oga;")
	private final Class253 aClass253_2;

	@OriginalMember(owner = "client!au", name = "r", descriptor = "I")
	private final int anInt404;

	@OriginalMember(owner = "client!au", name = "<init>", descriptor = "(I)V")
	public Class21(@OriginalArg(0) int arg0) {
		this(arg0, arg0);
	}

	@OriginalMember(owner = "client!au", name = "<init>", descriptor = "(II)V")
	public Class21(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass253_2 = new Class253();
		this.anInt404 = arg0;
		this.anInt389 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; local14 + local14 < arg0 && arg1 > local14; local14 += local14) {
		}
		this.aClass90_1 = new Class90(local14);
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(I)V")
	public void method313() {
		this.aClass253_2.method5320();
		this.aClass90_1.method1678();
		this.anInt389 = this.anInt404;
	}

	@OriginalMember(owner = "client!au", name = "b", descriptor = "(I)V")
	public void method314() {
		for (@Pc(13) Class2_Sub2_Sub6 local13 = (Class2_Sub2_Sub6) this.aClass253_2.method5321(); local13 != null; local13 = (Class2_Sub2_Sub6) this.aClass253_2.method5323()) {
			if (local13.method5445()) {
				local13.method7657();
				local13.method7659();
				this.anInt389 += local13.anInt6538;
			}
		}
	}

	@OriginalMember(owner = "client!au", name = "c", descriptor = "(I)I")
	public int method315() {
		@Pc(7) int local7 = 0;
		for (@Pc(13) Class2_Sub2_Sub6 local13 = (Class2_Sub2_Sub6) this.aClass253_2.method5321(); local13 != null; local13 = (Class2_Sub2_Sub6) this.aClass253_2.method5323()) {
			if (!local13.method5445()) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!au", name = "d", descriptor = "(I)Ljava/lang/Object;")
	public Object method316() {
		@Pc(16) Class2_Sub2_Sub6 local16 = (Class2_Sub2_Sub6) this.aClass90_1.method1680();
		while (local16 != null) {
			@Pc(24) Object local24 = local16.method5442();
			if (local24 != null) {
				return local24;
			}
			@Pc(30) Class2_Sub2_Sub6 local30 = local16;
			local16 = (Class2_Sub2_Sub6) this.aClass90_1.method1680();
			local30.method7657();
			local30.method7659();
			this.anInt389 += local30.anInt6538;
		}
		return null;
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(Ljava/lang/Object;BJ)V")
	public void method317(@OriginalArg(0) Object arg0, @OriginalArg(2) long arg1) {
		this.method320(arg0, arg1, 1);
	}

	@OriginalMember(owner = "client!au", name = "e", descriptor = "(I)I")
	public int method318() {
		return this.anInt389;
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(IJ)V")
	private void method319(@OriginalArg(1) long arg0) {
		@Pc(18) Class2_Sub2_Sub6 local18 = (Class2_Sub2_Sub6) this.aClass90_1.method1685(arg0);
		this.method327(local18);
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(Ljava/lang/Object;JII)V")
	public void method320(@OriginalArg(0) Object arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		if (this.anInt404 < arg2) {
			throw new IllegalStateException("s>cs");
		}
		this.method319(arg1);
		this.anInt389 -= arg2;
		while (this.anInt389 < 0) {
			@Pc(36) Class2_Sub2_Sub6 local36 = (Class2_Sub2_Sub6) this.aClass253_2.method5327();
			this.method327(local36);
		}
		@Pc(52) Class2_Sub2_Sub6_Sub1 local52 = new Class2_Sub2_Sub6_Sub1(arg0, arg2);
		this.aClass90_1.method1684(local52, arg1);
		this.aClass253_2.method5329(local52);
		local52.aLong269 = 0L;
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(B)I")
	public int method322() {
		return this.anInt404;
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(II)V")
	public void method323(@OriginalArg(0) int arg0) {
		if (Static498.aClass6_1 == null) {
			return;
		}
		for (@Pc(16) Class2_Sub2_Sub6 local16 = (Class2_Sub2_Sub6) this.aClass253_2.method5321(); local16 != null; local16 = (Class2_Sub2_Sub6) this.aClass253_2.method5323()) {
			if (local16.method5445()) {
				if (local16.method5442() == null) {
					local16.method7657();
					local16.method7659();
					this.anInt389++;
				}
			} else if (++local16.aLong269 > (long) arg0) {
				@Pc(64) Class2_Sub2_Sub6 local64 = Static498.aClass6_1.method127(local16);
				this.aClass90_1.method1684(local64, local16.aLong268);
				Static321.method4669(local64, local16);
				local16.method7657();
				local16.method7659();
			}
		}
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(JI)Ljava/lang/Object;")
	public Object method324(@OriginalArg(0) long arg0) {
		@Pc(10) Class2_Sub2_Sub6 local10 = (Class2_Sub2_Sub6) this.aClass90_1.method1685(arg0);
		if (local10 == null) {
			return null;
		}
		@Pc(18) Object local18 = local10.method5442();
		if (local18 == null) {
			local10.method7657();
			local10.method7659();
			this.anInt389 += local10.anInt6538;
			return null;
		}
		if (local10.method5445()) {
			@Pc(56) Class2_Sub2_Sub6_Sub1 local56 = new Class2_Sub2_Sub6_Sub1(local18, local10.anInt6538);
			this.aClass90_1.method1684(local56, local10.aLong268);
			this.aClass253_2.method5329(local56);
			local56.aLong269 = 0L;
			local10.method7657();
			local10.method7659();
		} else {
			this.aClass253_2.method5329(local10);
			local10.aLong269 = 0L;
		}
		return local18;
	}

	@OriginalMember(owner = "client!au", name = "b", descriptor = "(B)Ljava/lang/Object;")
	public Object method325() {
		@Pc(19) Class2_Sub2_Sub6 local19 = (Class2_Sub2_Sub6) this.aClass90_1.method1676();
		while (local19 != null) {
			@Pc(25) Object local25 = local19.method5442();
			if (local25 != null) {
				return local25;
			}
			@Pc(29) Class2_Sub2_Sub6 local29 = local19;
			local19 = (Class2_Sub2_Sub6) this.aClass90_1.method1680();
			local29.method7657();
			local29.method7659();
			this.anInt389 += local29.anInt6538;
		}
		return null;
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(BLclient!gaa;)V")
	private void method327(@OriginalArg(1) Class2_Sub2_Sub6 arg0) {
		if (arg0 != null) {
			arg0.method7657();
			arg0.method7659();
			this.anInt389 += arg0.anInt6538;
		}
	}
}
