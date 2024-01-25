import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wf")
public final class Class316 {

	@OriginalMember(owner = "client!wf", name = "j", descriptor = "Lclient!vm;")
	private final Class307 aClass307_10 = new Class307();

	@OriginalMember(owner = "client!wf", name = "q", descriptor = "I")
	private final int anInt9251;

	@OriginalMember(owner = "client!wf", name = "n", descriptor = "I")
	private int anInt9248;

	@OriginalMember(owner = "client!wf", name = "v", descriptor = "Lclient!lb;")
	private final Class174 aClass174_41;

	@OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(I)V")
	public Class316(@OriginalArg(0) int arg0) {
		this.anInt9251 = arg0;
		this.anInt9248 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; local14 + local14 < arg0; local14 += local14) {
		}
		this.aClass174_41 = new Class174(local14);
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)V")
	public void method7791(@OriginalArg(0) int arg0) {
		if (Static122.aClass93_1 == null) {
			return;
		}
		for (@Pc(12) Class1_Sub1_Sub3 local12 = (Class1_Sub1_Sub3) this.aClass307_10.method7359(); local12 != null; local12 = (Class1_Sub1_Sub3) this.aClass307_10.method7355()) {
			if (local12.method7497()) {
				if (local12.method7496() == null) {
					local12.method7983();
					local12.method7493();
					this.anInt9248++;
				}
			} else if ((long) arg0 < ++local12.aLong234) {
				@Pc(33) Class1_Sub1_Sub3 local33 = Static122.aClass93_1.method6142(local12);
				this.aClass174_41.method4420(local33, local12.aLong244);
				Static13.method710(local33, local12);
				local12.method7983();
				local12.method7493();
			}
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(BJLjava/lang/Object;)V")
	public void method7792(@OriginalArg(1) long arg0, @OriginalArg(2) Object arg1) {
		this.method7793(arg0, arg1);
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIJLjava/lang/Object;)V")
	private void method7793(@OriginalArg(2) long arg0, @OriginalArg(3) Object arg1) {
		if (this.anInt9251 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method7805(arg0);
		this.anInt9248--;
		while (this.anInt9248 < 0) {
			@Pc(37) Class1_Sub1_Sub3 local37 = (Class1_Sub1_Sub3) this.aClass307_10.method7360();
			this.method7801(local37);
		}
		@Pc(53) Class1_Sub1_Sub3_Sub2 local53 = new Class1_Sub1_Sub3_Sub2(arg1, 1);
		this.aClass174_41.method4420(local53, arg0);
		this.aClass307_10.method7354(local53);
		local53.aLong234 = 0L;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V")
	public void method7794() {
		this.aClass307_10.method7358();
		this.aClass174_41.method4423();
		this.anInt9248 = this.anInt9251;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Z)I")
	public int method7795() {
		@Pc(5) int local5 = 0;
		for (@Pc(11) Class1_Sub1_Sub3 local11 = (Class1_Sub1_Sub3) this.aClass307_10.method7359(); local11 != null; local11 = (Class1_Sub1_Sub3) this.aClass307_10.method7355()) {
			if (!local11.method7497()) {
				local5++;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(I)I")
	public int method7797() {
		return this.anInt9251;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IJ)Ljava/lang/Object;")
	public Object method7799(@OriginalArg(1) long arg0) {
		@Pc(17) Class1_Sub1_Sub3 local17 = (Class1_Sub1_Sub3) this.aClass174_41.method4422(arg0);
		if (local17 == null) {
			return null;
		}
		@Pc(25) Object local25 = local17.method7496();
		if (local25 == null) {
			local17.method7983();
			local17.method7493();
			this.anInt9248 += local17.anInt8919;
			return null;
		}
		if (local17.method7497()) {
			@Pc(64) Class1_Sub1_Sub3_Sub2 local64 = new Class1_Sub1_Sub3_Sub2(local25, local17.anInt8919);
			this.aClass174_41.method4420(local64, local17.aLong244);
			this.aClass307_10.method7354(local64);
			local64.aLong234 = 0L;
			local17.method7983();
			local17.method7493();
		} else {
			this.aClass307_10.method7354(local17);
			local17.aLong234 = 0L;
		}
		return local25;
	}

	@OriginalMember(owner = "client!wf", name = "c", descriptor = "(I)Ljava/lang/Object;")
	public Object method7800() {
		@Pc(15) Class1_Sub1_Sub3 local15 = (Class1_Sub1_Sub3) this.aClass174_41.method4421();
		while (local15 != null) {
			@Pc(23) Object local23 = local15.method7496();
			if (local23 != null) {
				return local23;
			}
			@Pc(27) Class1_Sub1_Sub3 local27 = local15;
			local15 = (Class1_Sub1_Sub3) this.aClass174_41.method4429();
			local27.method7983();
			local27.method7493();
			this.anInt9248 += local15.anInt8919;
		}
		return null;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILclient!pd;)V")
	private void method7801(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		if (arg0 != null) {
			arg0.method7983();
			arg0.method7493();
			this.anInt9248 += arg0.anInt8919;
		}
	}

	@OriginalMember(owner = "client!wf", name = "d", descriptor = "(I)Ljava/lang/Object;")
	public Object method7802() {
		@Pc(17) Class1_Sub1_Sub3 local17 = (Class1_Sub1_Sub3) this.aClass174_41.method4429();
		while (local17 != null) {
			@Pc(23) Object local23 = local17.method7496();
			if (local23 != null) {
				return local23;
			}
			@Pc(27) Class1_Sub1_Sub3 local27 = local17;
			local17 = (Class1_Sub1_Sub3) this.aClass174_41.method4429();
			local27.method7983();
			local27.method7493();
			this.anInt9248 += local17.anInt8919;
		}
		return null;
	}

	@OriginalMember(owner = "client!wf", name = "e", descriptor = "(I)V")
	public void method7803() {
		for (@Pc(14) Class1_Sub1_Sub3 local14 = (Class1_Sub1_Sub3) this.aClass307_10.method7359(); local14 != null; local14 = (Class1_Sub1_Sub3) this.aClass307_10.method7355()) {
			if (local14.method7497()) {
				local14.method7983();
				local14.method7493();
				this.anInt9248 += local14.anInt8919;
			}
		}
	}

	@OriginalMember(owner = "client!wf", name = "f", descriptor = "(I)I")
	public int method7804() {
		return this.anInt9248;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(JI)V")
	private void method7805(@OriginalArg(0) long arg0) {
		@Pc(17) Class1_Sub1_Sub3 local17 = (Class1_Sub1_Sub3) this.aClass174_41.method4422(arg0);
		this.method7801(local17);
	}
}
