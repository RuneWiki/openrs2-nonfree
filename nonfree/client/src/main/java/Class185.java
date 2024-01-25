import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kca")
public final class Class185 {

	@OriginalMember(owner = "client!kca", name = "q", descriptor = "Lclient!dm;")
	private final Class75 aClass75_8 = new Class75();

	@OriginalMember(owner = "client!kca", name = "m", descriptor = "I")
	private int anInt4690;

	@OriginalMember(owner = "client!kca", name = "l", descriptor = "I")
	private final int anInt4689;

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "Lclient!gca;")
	private final Class118 aClass118_27;

	@OriginalMember(owner = "client!kca", name = "<init>", descriptor = "(I)V")
	public Class185(@OriginalArg(0) int arg0) {
		this.anInt4690 = arg0;
		this.anInt4689 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; local16 + local16 < arg0; local16 += local16) {
		}
		this.aClass118_27 = new Class118(local16);
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(I)I")
	public int method3979() {
		return this.anInt4690;
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(Lclient!wf;Ljava/lang/Object;II)V")
	private void method3980(@OriginalArg(0) Interface27 arg0, @OriginalArg(1) Object arg1) {
		if (this.anInt4689 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method3990(arg0);
		this.anInt4690--;
		while (this.anInt4690 < 0) {
			@Pc(32) Class2_Sub2_Sub6 local32 = (Class2_Sub2_Sub6) this.aClass75_8.method1571();
			this.method3987(local32);
		}
		@Pc(48) Class2_Sub2_Sub6_Sub1 local48 = new Class2_Sub2_Sub6_Sub1(arg0, arg1, 1);
		this.aClass118_27.method2601(local48, arg0.method8035());
		this.aClass75_8.method1572(local48);
		local48.aLong269 = 0;
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(B)V")
	public void method3983() {
		this.aClass75_8.method1567();
		this.aClass118_27.method2599();
		this.anInt4690 = this.anInt4689;
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(Lclient!wf;Z)Ljava/lang/Object;")
	public Object method3984(@OriginalArg(0) Interface27 arg0) {
		@Pc(9) long local9 = arg0.method8035();
		for (@Pc(25) Class2_Sub2_Sub6 local25 = (Class2_Sub2_Sub6) this.aClass118_27.method2595(local9); local25 != null; local25 = (Class2_Sub2_Sub6) this.aClass118_27.method2605()) {
			if (local25.anInterface27_3.method8036(arg0)) {
				@Pc(37) Object local37 = local25.method6488();
				if (local37 != null) {
					if (local25.method6485()) {
						@Pc(76) Class2_Sub2_Sub6_Sub1 local76 = new Class2_Sub2_Sub6_Sub1(arg0, local37, local25.anInt7674);
						this.aClass118_27.method2601(local76, local25.aLong280);
						this.aClass75_8.method1572(local76);
						local76.aLong269 = 0L;
						local25.method8653();
						local25.method8271();
					} else {
						this.aClass75_8.method1572(local25);
						local25.aLong269 = 0L;
					}
					return local37;
				}
				local25.method8653();
				local25.method8271();
				this.anInt4690 += local25.anInt7674;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!kca", name = "b", descriptor = "(B)I")
	public int method3985() {
		return this.anInt4689;
	}

	@OriginalMember(owner = "client!kca", name = "c", descriptor = "(I)V")
	public void method3986() {
		for (@Pc(11) Class2_Sub2_Sub6 local11 = (Class2_Sub2_Sub6) this.aClass75_8.method1573(); local11 != null; local11 = (Class2_Sub2_Sub6) this.aClass75_8.method1568()) {
			if (local11.method6485()) {
				local11.method8653();
				local11.method8271();
				this.anInt4690 += local11.anInt7674;
			}
		}
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(Lclient!dc;I)V")
	private void method3987(@OriginalArg(0) Class2_Sub2_Sub6 arg0) {
		if (arg0 != null) {
			arg0.method8653();
			arg0.method8271();
			this.anInt4690 += arg0.anInt7674;
		}
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(Lclient!wf;ILjava/lang/Object;)V")
	public void method3988(@OriginalArg(0) Interface27 arg0, @OriginalArg(2) Object arg1) {
		this.method3980(arg0, arg1);
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(ZI)V")
	public void method3989() {
		if (Static173.aClass183_2 == null) {
			return;
		}
		for (@Pc(20) Class2_Sub2_Sub6 local20 = (Class2_Sub2_Sub6) this.aClass75_8.method1573(); local20 != null; local20 = (Class2_Sub2_Sub6) this.aClass75_8.method1568()) {
			if (local20.method6485()) {
				if (local20.method6488() == null) {
					local20.method8653();
					local20.method8271();
					this.anInt4690 += local20.anInt7674;
				}
			} else if ((long) 5 < ++local20.aLong269) {
				@Pc(46) Class2_Sub2_Sub6 local46 = Static173.aClass183_2.method3903(local20);
				this.aClass118_27.method2601(local46, local20.aLong280);
				Static631.method8042(local20, local46);
				local20.method8653();
				local20.method8271();
			}
		}
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(Lclient!wf;I)V")
	private void method3990(@OriginalArg(0) Interface27 arg0) {
		@Pc(14) long local14 = arg0.method8035();
		for (@Pc(21) Class2_Sub2_Sub6 local21 = (Class2_Sub2_Sub6) this.aClass118_27.method2595(local14); local21 != null; local21 = (Class2_Sub2_Sub6) this.aClass118_27.method2605()) {
			if (local21.anInterface27_3.method8036(arg0)) {
				this.method3987(local21);
				return;
			}
		}
	}
}
