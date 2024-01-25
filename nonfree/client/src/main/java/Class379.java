import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vo")
public final class Class379 {

	@OriginalMember(owner = "client!vo", name = "j", descriptor = "Lclient!pf;")
	private final Class279 aClass279_14 = new Class279();

	@OriginalMember(owner = "client!vo", name = "k", descriptor = "I")
	private final int anInt11102;

	@OriginalMember(owner = "client!vo", name = "n", descriptor = "I")
	private int anInt11103;

	@OriginalMember(owner = "client!vo", name = "l", descriptor = "Lclient!si;")
	private final Class335 aClass335_48;

	@OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(I)V")
	public Class379(@OriginalArg(0) int arg0) {
		this.anInt11102 = arg0;
		this.anInt11103 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; arg0 > local16 + local16; local16 += local16) {
		}
		this.aClass335_48 = new Class335(local16);
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(I)I")
	public int method9484() {
		return this.anInt11103;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(Lclient!qj;I)V")
	private void method9485(@OriginalArg(0) Interface14 arg0) {
		@Pc(13) long local13 = arg0.method4268();
		for (@Pc(20) Class2_Sub1_Sub3 local20 = (Class2_Sub1_Sub3) this.aClass335_48.method8357(local13); local20 != null; local20 = (Class2_Sub1_Sub3) this.aClass335_48.method8352()) {
			if (local20.anInterface14_3.method4267(arg0)) {
				this.method9489(local20);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(Lclient!qj;ILjava/lang/Object;I)V")
	private void method9486(@OriginalArg(0) Interface14 arg0, @OriginalArg(2) Object arg1) {
		if (this.anInt11102 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method9485(arg0);
		this.anInt11103--;
		while (this.anInt11103 < 0) {
			@Pc(32) Class2_Sub1_Sub3 local32 = (Class2_Sub1_Sub3) this.aClass279_14.method7291();
			this.method9489(local32);
		}
		@Pc(50) Class2_Sub1_Sub3_Sub1 local50 = new Class2_Sub1_Sub3_Sub1(arg0, arg1, 1);
		this.aClass335_48.method8356(local50, arg0.method4268());
		this.aClass279_14.method7292(local50);
		local50.aLong296 = 0L;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(Lclient!qj;B)Ljava/lang/Object;")
	public Object method9487(@OriginalArg(0) Interface14 arg0) {
		@Pc(13) long local13 = arg0.method4268();
		for (@Pc(20) Class2_Sub1_Sub3 local20 = (Class2_Sub1_Sub3) this.aClass335_48.method8357(local13); local20 != null; local20 = (Class2_Sub1_Sub3) this.aClass335_48.method8352()) {
			if (local20.anInterface14_3.method4267(arg0)) {
				@Pc(31) Object local31 = local20.method6236();
				if (local31 != null) {
					if (local20.method6239()) {
						@Pc(61) Class2_Sub1_Sub3_Sub1 local61 = new Class2_Sub1_Sub3_Sub1(arg0, local31, local20.anInt6961);
						this.aClass335_48.method8356(local61, local20.aLong313);
						this.aClass279_14.method7292(local61);
						local61.aLong296 = 0L;
						local20.method9825();
						local20.method9377();
					} else {
						this.aClass279_14.method7292(local20);
						local20.aLong296 = 0L;
					}
					return local31;
				}
				local20.method9825();
				local20.method9377();
				this.anInt11103 += local20.anInt6961;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!vo", name = "b", descriptor = "(I)V")
	public void method9488() {
		for (@Pc(5) Class2_Sub1_Sub3 local5 = (Class2_Sub1_Sub3) this.aClass279_14.method7293(); local5 != null; local5 = (Class2_Sub1_Sub3) this.aClass279_14.method7298()) {
			if (local5.method6239()) {
				local5.method9825();
				local5.method9377();
				this.anInt11103 += local5.anInt6961;
			}
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(ILclient!tk;)V")
	private void method9489(@OriginalArg(1) Class2_Sub1_Sub3 arg0) {
		if (arg0 != null) {
			arg0.method9825();
			arg0.method9377();
			this.anInt11103 += arg0.anInt6961;
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(B)V")
	public void method9491() {
		this.aClass279_14.method7297();
		this.aClass335_48.method8353();
		this.anInt11103 = this.anInt11102;
	}

	@OriginalMember(owner = "client!vo", name = "e", descriptor = "(I)I")
	public int method9494() {
		return this.anInt11102;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(II)V")
	public void method9495() {
		if (Static673.aClass143_3 == null) {
			return;
		}
		for (@Pc(19) Class2_Sub1_Sub3 local19 = (Class2_Sub1_Sub3) this.aClass279_14.method7293(); local19 != null; local19 = (Class2_Sub1_Sub3) this.aClass279_14.method7298()) {
			if (local19.method6239()) {
				if (local19.method6236() == null) {
					local19.method9825();
					local19.method9377();
					this.anInt11103 += local19.anInt6961;
				}
			} else if (++local19.aLong296 > (long) 5) {
				@Pc(41) Class2_Sub1_Sub3 local41 = Static673.aClass143_3.method4101(local19);
				this.aClass335_48.method8356(local41, local19.aLong313);
				Static343.method5735(local19, local41);
				local19.method9825();
				local19.method9377();
			}
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(ILjava/lang/Object;Lclient!qj;)V")
	public void method9496(@OriginalArg(1) Object arg0, @OriginalArg(2) Interface14 arg1) {
		this.method9486(arg1, arg0);
	}
}
