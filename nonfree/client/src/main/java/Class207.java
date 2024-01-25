import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mj")
public final class Class207 {

	@OriginalMember(owner = "client!mj", name = "k", descriptor = "Lclient!ce;")
	private final Class49 aClass49_7 = new Class49();

	@OriginalMember(owner = "client!mj", name = "n", descriptor = "I")
	private int anInt6055;

	@OriginalMember(owner = "client!mj", name = "i", descriptor = "I")
	private final int anInt6051;

	@OriginalMember(owner = "client!mj", name = "g", descriptor = "Lclient!sba;")
	private final Class297 aClass297_26;

	@OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(I)V")
	public Class207(@OriginalArg(0) int arg0) {
		this.anInt6055 = arg0;
		this.anInt6051 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; arg0 > local16 + local16; local16 += local16) {
		}
		this.aClass297_26 = new Class297(local16);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Ljava/lang/Object;Lclient!kw;I)V")
	public void method4897(@OriginalArg(0) Object arg0, @OriginalArg(1) Interface10 arg1) {
		this.method4903(arg0, arg1);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!kw;B)Ljava/lang/Object;")
	public Object method4898(@OriginalArg(0) Interface10 arg0) {
		@Pc(9) long local9 = arg0.method5252();
		for (@Pc(21) Class3_Sub7_Sub4 local21 = (Class3_Sub7_Sub4) this.aClass297_26.method6531(local9); local21 != null; local21 = (Class3_Sub7_Sub4) this.aClass297_26.method6538()) {
			if (local21.anInterface10_3.method5251(arg0)) {
				@Pc(33) Object local33 = local21.method5377();
				if (local33 != null) {
					if (local21.method5376()) {
						@Pc(62) Class3_Sub7_Sub4_Sub1 local62 = new Class3_Sub7_Sub4_Sub1(arg0, local33, local21.anInt6674);
						this.aClass297_26.method6537(local21.aLong262, local62);
						this.aClass49_7.method1455(local62);
						local62.aLong263 = 0L;
						local21.method8128();
						local21.method8136();
					} else {
						this.aClass49_7.method1455(local21);
						local21.aLong263 = 0L;
					}
					return local33;
				}
				local21.method8128();
				local21.method8136();
				this.anInt6055 += local21.anInt6674;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)I")
	public int method4899() {
		return this.anInt6055;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(B)V")
	public void method4900() {
		for (@Pc(19) Class3_Sub7_Sub4 local19 = (Class3_Sub7_Sub4) this.aClass49_7.method1448(); local19 != null; local19 = (Class3_Sub7_Sub4) this.aClass49_7.method1451()) {
			if (local19.method5376()) {
				local19.method8128();
				local19.method8136();
				this.anInt6055 += local19.anInt6674;
			}
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!gd;I)V")
	private void method4902(@OriginalArg(0) Class3_Sub7_Sub4 arg0) {
		if (arg0 != null) {
			arg0.method8128();
			arg0.method8136();
			this.anInt6055 += arg0.anInt6674;
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Ljava/lang/Object;Lclient!kw;IB)V")
	private void method4903(@OriginalArg(0) Object arg0, @OriginalArg(1) Interface10 arg1) {
		if (this.anInt6051 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method4904(arg1);
		this.anInt6055--;
		while (this.anInt6055 < 0) {
			@Pc(36) Class3_Sub7_Sub4 local36 = (Class3_Sub7_Sub4) this.aClass49_7.method1452();
			this.method4902(local36);
		}
		@Pc(50) Class3_Sub7_Sub4_Sub1 local50 = new Class3_Sub7_Sub4_Sub1(arg1, arg0, 1);
		this.aClass297_26.method6537(arg1.method5252(), local50);
		this.aClass49_7.method1455(local50);
		local50.aLong263 = 0L;
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(Lclient!kw;B)V")
	private void method4904(@OriginalArg(0) Interface10 arg0) {
		@Pc(9) long local9 = arg0.method5252();
		for (@Pc(23) Class3_Sub7_Sub4 local23 = (Class3_Sub7_Sub4) this.aClass297_26.method6531(local9); local23 != null; local23 = (Class3_Sub7_Sub4) this.aClass297_26.method6538()) {
			if (local23.anInterface10_3.method5251(arg0)) {
				this.method4902(local23);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Z)I")
	public int method4905() {
		return this.anInt6051;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(II)V")
	public void method4906() {
		if (Static434.aClass35_1 == null) {
			return;
		}
		for (@Pc(15) Class3_Sub7_Sub4 local15 = (Class3_Sub7_Sub4) this.aClass49_7.method1448(); local15 != null; local15 = (Class3_Sub7_Sub4) this.aClass49_7.method1451()) {
			if (local15.method5376()) {
				if (local15.method5377() == null) {
					local15.method8128();
					local15.method8136();
					this.anInt6055 += local15.anInt6674;
				}
			} else if (++local15.aLong263 > (long) 5) {
				@Pc(39) Class3_Sub7_Sub4 local39 = Static434.aClass35_1.method1083(local15);
				this.aClass297_26.method6537(local15.aLong262, local39);
				Static578.method7856(local15, local39);
				local15.method8128();
				local15.method8136();
			}
		}
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(B)V")
	public void method4907() {
		this.aClass49_7.method1450();
		this.aClass297_26.method6535();
		this.anInt6055 = this.anInt6051;
	}
}
