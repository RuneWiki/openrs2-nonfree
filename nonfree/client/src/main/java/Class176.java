import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!js")
public final class Class176 {

	@OriginalMember(owner = "client!js", name = "j", descriptor = "Lclient!dha;")
	private final Class74 aClass74_6 = new Class74();

	@OriginalMember(owner = "client!js", name = "e", descriptor = "I")
	private int anInt4917;

	@OriginalMember(owner = "client!js", name = "m", descriptor = "I")
	private final int anInt4923;

	@OriginalMember(owner = "client!js", name = "a", descriptor = "Lclient!ee;")
	private final Class83 aClass83_13;

	@OriginalMember(owner = "client!js", name = "<init>", descriptor = "(I)V")
	public Class176(@OriginalArg(0) int arg0) {
		this.anInt4917 = arg0;
		this.anInt4923 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; arg0 > local16 + local16; local16 += local16) {
		}
		this.aClass83_13 = new Class83(local16);
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(ILclient!it;)V")
	private void method4538(@OriginalArg(1) Class3_Sub11_Sub9 arg0) {
		if (arg0 != null) {
			arg0.method9380();
			arg0.method9345();
			this.anInt4917 += arg0.anInt4399;
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(II)V")
	public void method4539() {
		if (Static155.aClass129_1 == null) {
			return;
		}
		for (@Pc(13) Class3_Sub11_Sub9 local13 = (Class3_Sub11_Sub9) this.aClass74_6.method1842(); local13 != null; local13 = (Class3_Sub11_Sub9) this.aClass74_6.method1844()) {
			if (local13.method4007()) {
				if (local13.method4006() == null) {
					local13.method9380();
					local13.method9345();
					this.anInt4917 += local13.anInt4399;
				}
			} else if (++local13.aLong310 > (long) 5) {
				@Pc(58) Class3_Sub11_Sub9 local58 = Static155.aClass129_1.method3750(local13);
				this.aClass83_13.method2377(local13.aLong311, local58);
				Static384.method5495(local13, local58);
				local13.method9380();
				local13.method9345();
			}
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(B)V")
	public void method4540() {
		this.aClass74_6.method1845();
		this.aClass83_13.method2374();
		this.anInt4917 = this.anInt4923;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(IILclient!pj;Ljava/lang/Object;)V")
	private void method4541(@OriginalArg(2) Interface23 arg0, @OriginalArg(3) Object arg1) {
		if (this.anInt4923 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method4546(arg0);
		this.anInt4917--;
		while (this.anInt4917 < 0) {
			@Pc(40) Class3_Sub11_Sub9 local40 = (Class3_Sub11_Sub9) this.aClass74_6.method1843();
			this.method4538(local40);
		}
		@Pc(57) Class3_Sub11_Sub9_Sub1 local57 = new Class3_Sub11_Sub9_Sub1(arg0, arg1, 1);
		this.aClass83_13.method2377(arg0.method9179(), local57);
		this.aClass74_6.method1840(local57);
		local57.aLong310 = 0L;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(ILclient!pj;)Ljava/lang/Object;")
	public Object method4542(@OriginalArg(1) Interface23 arg0) {
		@Pc(9) long local9 = arg0.method9179();
		for (@Pc(16) Class3_Sub11_Sub9 local16 = (Class3_Sub11_Sub9) this.aClass83_13.method2368(local9); local16 != null; local16 = (Class3_Sub11_Sub9) this.aClass83_13.method2373()) {
			if (local16.anInterface23_3.method9180(arg0)) {
				@Pc(36) Object local36 = local16.method4006();
				if (local36 != null) {
					if (local16.method4007()) {
						@Pc(77) Class3_Sub11_Sub9_Sub1 local77 = new Class3_Sub11_Sub9_Sub1(arg0, local36, local16.anInt4399);
						this.aClass83_13.method2377(local16.aLong311, local77);
						this.aClass74_6.method1840(local77);
						local77.aLong310 = 0L;
						local16.method9380();
						local16.method9345();
					} else {
						this.aClass74_6.method1840(local16);
						local16.aLong310 = 0L;
					}
					return local36;
				}
				local16.method9380();
				local16.method9345();
				this.anInt4917 += local16.anInt4399;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(I)I")
	public int method4543() {
		return this.anInt4917;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(Ljava/lang/Object;Lclient!pj;B)V")
	public void method4544(@OriginalArg(0) Object arg0, @OriginalArg(1) Interface23 arg1) {
		this.method4541(arg1, arg0);
	}

	@OriginalMember(owner = "client!js", name = "b", descriptor = "(ILclient!pj;)V")
	private void method4546(@OriginalArg(1) Interface23 arg0) {
		@Pc(9) long local9 = arg0.method9179();
		for (@Pc(18) Class3_Sub11_Sub9 local18 = (Class3_Sub11_Sub9) this.aClass83_13.method2368(local9); local18 != null; local18 = (Class3_Sub11_Sub9) this.aClass83_13.method2373()) {
			if (local18.anInterface23_3.method9180(arg0)) {
				this.method4538(local18);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(Z)V")
	public void method4547() {
		for (@Pc(7) Class3_Sub11_Sub9 local7 = (Class3_Sub11_Sub9) this.aClass74_6.method1842(); local7 != null; local7 = (Class3_Sub11_Sub9) this.aClass74_6.method1844()) {
			if (local7.method4007()) {
				local7.method9380();
				local7.method9345();
				this.anInt4917 += local7.anInt4399;
			}
		}
	}

	@OriginalMember(owner = "client!js", name = "b", descriptor = "(Z)I")
	public int method4548() {
		return this.anInt4923;
	}
}
