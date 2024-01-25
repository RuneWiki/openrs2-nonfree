import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gea")
public final class Class117 {

	@OriginalMember(owner = "client!gea", name = "h", descriptor = "Lclient!ca;")
	private final Class39 aClass39_1 = new Class39();

	@OriginalMember(owner = "client!gea", name = "c", descriptor = "I")
	private final int anInt3412;

	@OriginalMember(owner = "client!gea", name = "i", descriptor = "I")
	private int anInt3417;

	@OriginalMember(owner = "client!gea", name = "l", descriptor = "Lclient!bc;")
	private final Class25 aClass25_14;

	@OriginalMember(owner = "client!gea", name = "<init>", descriptor = "(I)V")
	public Class117(@OriginalArg(0) int arg0) {
		this.anInt3412 = arg0;
		this.anInt3417 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; arg0 > local16 + local16; local16 += local16) {
		}
		this.aClass25_14 = new Class25(local16);
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(IB)V")
	public void method3011() {
		if (Static102.aClass47_1 == null) {
			return;
		}
		for (@Pc(12) Class3_Sub4_Sub9 local12 = (Class3_Sub4_Sub9) this.aClass39_1.method1270(); local12 != null; local12 = (Class3_Sub4_Sub9) this.aClass39_1.method1275()) {
			if (local12.method3821()) {
				if (local12.method3818() == null) {
					local12.method8412();
					local12.method8309();
					this.anInt3417 += local12.anInt4516;
				}
			} else if ((long) 5 < ++local12.aLong259) {
				@Pc(51) Class3_Sub4_Sub9 local51 = Static102.aClass47_1.method1648(local12);
				this.aClass25_14.method945(local51, local12.aLong262);
				Static300.method6049(local51, local12);
				local12.method8412();
				local12.method8309();
			}
		}
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(ILclient!gj;)V")
	private void method3012(@OriginalArg(1) Interface7 arg0) {
		@Pc(7) long local7 = arg0.method2317();
		for (@Pc(14) Class3_Sub4_Sub9 local14 = (Class3_Sub4_Sub9) this.aClass25_14.method946(local7); local14 != null; local14 = (Class3_Sub4_Sub9) this.aClass25_14.method953()) {
			if (local14.anInterface7_3.method2318(arg0)) {
				this.method3015(local14);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(Lclient!gj;ZLjava/lang/Object;)V")
	public void method3014(@OriginalArg(0) Interface7 arg0, @OriginalArg(2) Object arg1) {
		this.method3016(arg0, arg1);
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(Lclient!ka;I)V")
	private void method3015(@OriginalArg(0) Class3_Sub4_Sub9 arg0) {
		if (arg0 != null) {
			arg0.method8412();
			arg0.method8309();
			this.anInt3417 += arg0.anInt4516;
		}
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(BLclient!gj;ILjava/lang/Object;)V")
	private void method3016(@OriginalArg(1) Interface7 arg0, @OriginalArg(3) Object arg1) {
		if (this.anInt3412 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method3012(arg0);
		this.anInt3417--;
		while (this.anInt3417 < 0) {
			@Pc(36) Class3_Sub4_Sub9 local36 = (Class3_Sub4_Sub9) this.aClass39_1.method1276();
			this.method3015(local36);
		}
		@Pc(53) Class3_Sub4_Sub9_Sub2 local53 = new Class3_Sub4_Sub9_Sub2(arg0, arg1, 1);
		this.aClass25_14.method945(local53, arg0.method2317());
		this.aClass39_1.method1273(local53);
		local53.aLong259 = 0L;
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(Z)V")
	public void method3017() {
		this.aClass39_1.method1279();
		this.aClass25_14.method948();
		this.anInt3417 = this.anInt3412;
	}

	@OriginalMember(owner = "client!gea", name = "b", descriptor = "(B)I")
	public int method3018() {
		return this.anInt3417;
	}

	@OriginalMember(owner = "client!gea", name = "b", descriptor = "(ILclient!gj;)Ljava/lang/Object;")
	public Object method3020(@OriginalArg(1) Interface7 arg0) {
		@Pc(7) long local7 = arg0.method2317();
		for (@Pc(14) Class3_Sub4_Sub9 local14 = (Class3_Sub4_Sub9) this.aClass25_14.method946(local7); local14 != null; local14 = (Class3_Sub4_Sub9) this.aClass25_14.method953()) {
			if (local14.anInterface7_3.method2318(arg0)) {
				@Pc(34) Object local34 = local14.method3818();
				if (local34 != null) {
					if (local14.method3821()) {
						@Pc(62) Class3_Sub4_Sub9_Sub2 local62 = new Class3_Sub4_Sub9_Sub2(arg0, local34, local14.anInt4516);
						this.aClass25_14.method945(local62, local14.aLong262);
						this.aClass39_1.method1273(local62);
						local62.aLong259 = 0L;
						local14.method8412();
						local14.method8309();
					} else {
						this.aClass39_1.method1273(local14);
						local14.aLong259 = 0L;
					}
					return local34;
				}
				local14.method8412();
				local14.method8309();
				this.anInt3417 += local14.anInt4516;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!gea", name = "c", descriptor = "(B)V")
	public void method3021() {
		for (@Pc(5) Class3_Sub4_Sub9 local5 = (Class3_Sub4_Sub9) this.aClass39_1.method1270(); local5 != null; local5 = (Class3_Sub4_Sub9) this.aClass39_1.method1275()) {
			if (local5.method3821()) {
				local5.method8412();
				local5.method8309();
				this.anInt3417 += local5.anInt4516;
			}
		}
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(I)I")
	public int method3022() {
		return this.anInt3412;
	}
}
