import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!od")
public final class Class181 {

	@OriginalMember(owner = "client!od", name = "k", descriptor = "Lclient!mq;")
	private final Class163 aClass163_6 = new Class163();

	@OriginalMember(owner = "client!od", name = "a", descriptor = "I")
	private int anInt4920;

	@OriginalMember(owner = "client!od", name = "l", descriptor = "I")
	private final int anInt4929;

	@OriginalMember(owner = "client!od", name = "o", descriptor = "Lclient!qi;")
	private final Class208 aClass208_31;

	static {
		new Class142("You can report that person under a different rule.", "Diese Person kann bezüglich einer anderen Regel gemeldet werden.", "Vous pouvez signaler cette personne pour une autre infraction aux règles.", "Você não pode denunciar essa pessoa de acordo com uma regra diferente.");
	}

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "(I)V")
	public Class181(@OriginalArg(0) int arg0) {
		this.anInt4920 = arg0;
		this.anInt4929 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; arg0 > local16 + local16; local16 += local16) {
		}
		this.aClass208_31 = new Class208(local16);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V")
	public void method3922() {
		this.aClass163_6.method3659();
		this.aClass208_31.method4408();
		this.anInt4920 = this.anInt4929;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(B)I")
	public int method3923() {
		return this.anInt4920;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ILclient!go;)V")
	private void method3924(@OriginalArg(1) Interface2 arg0) {
		@Pc(9) long local9 = arg0.method5235();
		for (@Pc(24) Class1_Sub3_Sub6 local24 = (Class1_Sub3_Sub6) this.aClass208_31.method4405(local9); local24 != null; local24 = (Class1_Sub3_Sub6) this.aClass208_31.method4415()) {
			if (local24.anInterface2_3.method5234(arg0)) {
				this.method3930(local24);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IB)V")
	public void method3926() {
		if (Static112.aClass171_1 == null) {
			return;
		}
		for (@Pc(17) Class1_Sub3_Sub6 local17 = (Class1_Sub3_Sub6) this.aClass163_6.method3658(); local17 != null; local17 = (Class1_Sub3_Sub6) this.aClass163_6.method3655()) {
			if (local17.method3327()) {
				if (local17.method3329() == null) {
					local17.method5953();
					local17.method5941();
					this.anInt4920 += local17.anInt4209;
				}
			} else if ((long) 5 < ++local17.aLong235) {
				@Pc(39) Class1_Sub3_Sub6 local39 = Static112.aClass171_1.method4437(local17);
				this.aClass208_31.method4413(local17.aLong236, local39);
				Static191.method2762(local39, local17);
				local17.method5953();
				local17.method5941();
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(I)V")
	public void method3927() {
		for (@Pc(7) Class1_Sub3_Sub6 local7 = (Class1_Sub3_Sub6) this.aClass163_6.method3658(); local7 != null; local7 = (Class1_Sub3_Sub6) this.aClass163_6.method3655()) {
			if (local7.method3327()) {
				local7.method5953();
				local7.method5941();
				this.anInt4920 += local7.anInt4209;
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Z)I")
	public int method3928() {
		return this.anInt4929;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ILclient!ef;)V")
	private void method3930(@OriginalArg(1) Class1_Sub3_Sub6 arg0) {
		if (arg0 != null) {
			arg0.method5953();
			arg0.method5941();
			this.anInt4920 += arg0.anInt4209;
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Ljava/lang/Object;Lclient!go;B)V")
	public void method3931(@OriginalArg(0) Object arg0, @OriginalArg(1) Interface2 arg1) {
		this.method3932(arg1, arg0);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!go;IBLjava/lang/Object;)V")
	private void method3932(@OriginalArg(0) Interface2 arg0, @OriginalArg(3) Object arg1) {
		if (this.anInt4929 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method3924(arg0);
		this.anInt4920--;
		while (this.anInt4920 < 0) {
			@Pc(40) Class1_Sub3_Sub6 local40 = (Class1_Sub3_Sub6) this.aClass163_6.method3654();
			this.method3930(local40);
		}
		@Pc(57) Class1_Sub3_Sub6_Sub2 local57 = new Class1_Sub3_Sub6_Sub2(arg0, arg1, 1);
		this.aClass208_31.method4413(arg0.method5235(), local57);
		this.aClass163_6.method3657(local57);
		local57.aLong235 = 0L;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ZLclient!go;)Ljava/lang/Object;")
	public Object method3933(@OriginalArg(1) Interface2 arg0) {
		@Pc(9) long local9 = arg0.method5235();
		for (@Pc(21) Class1_Sub3_Sub6 local21 = (Class1_Sub3_Sub6) this.aClass208_31.method4405(local9); local21 != null; local21 = (Class1_Sub3_Sub6) this.aClass208_31.method4415()) {
			if (local21.anInterface2_3.method5234(arg0)) {
				@Pc(33) Object local33 = local21.method3329();
				if (local33 != null) {
					if (local21.method3327()) {
						@Pc(62) Class1_Sub3_Sub6_Sub2 local62 = new Class1_Sub3_Sub6_Sub2(arg0, local33, local21.anInt4209);
						this.aClass208_31.method4413(local21.aLong236, local62);
						this.aClass163_6.method3657(local62);
						local62.aLong235 = 0L;
						local21.method5953();
						local21.method5941();
					} else {
						this.aClass163_6.method3657(local21);
						local21.aLong235 = 0L;
					}
					return local33;
				}
				local21.method5953();
				local21.method5941();
				this.anInt4920 += local21.anInt4209;
			}
		}
		return null;
	}
}
