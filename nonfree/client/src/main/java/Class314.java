import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public final class Class314 {

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "Lclient!vm;")
	private final Class307 aClass307_9 = new Class307();

	@OriginalMember(owner = "client!wb", name = "l", descriptor = "I")
	private int anInt8936;

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "I")
	private final int anInt8930;

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "Lclient!lb;")
	private final Class174 aClass174_38;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(I)V")
	public Class314(@OriginalArg(0) int arg0) {
		this.anInt8936 = arg0;
		this.anInt8930 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; local14 + local14 < arg0; local14 += local14) {
		}
		this.aClass174_38 = new Class174(local14);
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!nba;B)Ljava/lang/Object;")
	public Object method7504(@OriginalArg(0) Interface9 arg0) {
		@Pc(13) long local13 = arg0.method6048();
		for (@Pc(20) Class1_Sub1_Sub1 local20 = (Class1_Sub1_Sub1) this.aClass174_38.method4422(local13); local20 != null; local20 = (Class1_Sub1_Sub1) this.aClass174_38.method4424()) {
			if (local20.anInterface9_3.method6049(arg0)) {
				@Pc(31) Object local31 = local20.method4832();
				if (local31 != null) {
					if (local20.method4833()) {
						@Pc(70) Class1_Sub1_Sub1_Sub2 local70 = new Class1_Sub1_Sub1_Sub2(arg0, local31, local20.anInt5589);
						this.aClass174_38.method4420(local70, local20.aLong244);
						this.aClass307_9.method7354(local70);
						local70.aLong234 = 0L;
						local20.method7983();
						local20.method7493();
					} else {
						this.aClass307_9.method7354(local20);
						local20.aLong234 = 0L;
					}
					return local31;
				}
				local20.method7983();
				local20.method7493();
				this.anInt8936 += local20.anInt5589;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!aa;B)V")
	private void method7505(@OriginalArg(0) Class1_Sub1_Sub1 arg0) {
		if (arg0 != null) {
			arg0.method7983();
			arg0.method7493();
			this.anInt8936 += arg0.anInt5589;
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)I")
	public int method7506() {
		return this.anInt8930;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)I")
	public int method7507() {
		return this.anInt8936;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!nba;ZLjava/lang/Object;)V")
	public void method7508(@OriginalArg(0) Interface9 arg0, @OriginalArg(2) Object arg1) {
		this.method7509(arg1, arg0);
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(BLjava/lang/Object;Lclient!nba;I)V")
	private void method7509(@OriginalArg(1) Object arg0, @OriginalArg(2) Interface9 arg1) {
		if (this.anInt8930 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method7512(arg1);
		this.anInt8936--;
		while (this.anInt8936 < 0) {
			@Pc(38) Class1_Sub1_Sub1 local38 = (Class1_Sub1_Sub1) this.aClass307_9.method7360();
			this.method7505(local38);
		}
		@Pc(55) Class1_Sub1_Sub1_Sub2 local55 = new Class1_Sub1_Sub1_Sub2(arg1, arg0, 1);
		this.aClass174_38.method4420(local55, arg1.method6048());
		this.aClass307_9.method7354(local55);
		local55.aLong234 = 0L;
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)V")
	public void method7510() {
		for (@Pc(5) Class1_Sub1_Sub1 local5 = (Class1_Sub1_Sub1) this.aClass307_9.method7359(); local5 != null; local5 = (Class1_Sub1_Sub1) this.aClass307_9.method7355()) {
			if (local5.method4833()) {
				local5.method7983();
				local5.method7493();
				this.anInt8936 += local5.anInt5589;
			}
		}
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(Lclient!nba;B)V")
	private void method7512(@OriginalArg(0) Interface9 arg0) {
		@Pc(11) long local11 = arg0.method6048();
		for (@Pc(18) Class1_Sub1_Sub1 local18 = (Class1_Sub1_Sub1) this.aClass174_38.method4422(local11); local18 != null; local18 = (Class1_Sub1_Sub1) this.aClass174_38.method4424()) {
			if (local18.anInterface9_3.method6049(arg0)) {
				this.method7505(local18);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Z)V")
	public void method7513() {
		this.aClass307_9.method7358();
		this.aClass174_38.method4423();
		this.anInt8936 = this.anInt8930;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)V")
	public void method7515() {
		if (Static242.aClass11_2 == null) {
			return;
		}
		for (@Pc(9) Class1_Sub1_Sub1 local9 = (Class1_Sub1_Sub1) this.aClass307_9.method7359(); local9 != null; local9 = (Class1_Sub1_Sub1) this.aClass307_9.method7355()) {
			if (local9.method4833()) {
				if (local9.method4832() == null) {
					local9.method7983();
					local9.method7493();
					this.anInt8936 += local9.anInt5589;
				}
			} else if ((long) 5 < ++local9.aLong234) {
				@Pc(37) Class1_Sub1_Sub1 local37 = Static242.aClass11_2.method724(local9);
				this.aClass174_38.method4420(local37, local9.aLong244);
				Static13.method710(local37, local9);
				local9.method7983();
				local9.method7493();
			}
		}
	}
}
