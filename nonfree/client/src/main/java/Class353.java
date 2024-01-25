import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!us")
public final class Class353 {

	@OriginalMember(owner = "client!us", name = "r", descriptor = "Lclient!vu;")
	private final Class368 aClass368_12 = new Class368();

	@OriginalMember(owner = "client!us", name = "f", descriptor = "I")
	private final int anInt9748;

	@OriginalMember(owner = "client!us", name = "j", descriptor = "I")
	private int anInt9750;

	@OriginalMember(owner = "client!us", name = "o", descriptor = "Lclient!pl;")
	private final Class273 aClass273_44;

	@OriginalMember(owner = "client!us", name = "<init>", descriptor = "(I)V")
	public Class353(@OriginalArg(0) int arg0) {
		this.anInt9748 = arg0;
		this.anInt9750 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; arg0 > local16 + local16; local16 += local16) {
		}
		this.aClass273_44 = new Class273(local16);
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(B)V")
	public void method8373() {
		for (@Pc(7) Class5_Sub5_Sub3 local7 = (Class5_Sub5_Sub3) this.aClass368_12.method8702(); local7 != null; local7 = (Class5_Sub5_Sub3) this.aClass368_12.method8710()) {
			if (local7.method6061()) {
				local7.method9047();
				local7.method8952();
				this.anInt9750 += local7.anInt6780;
			}
		}
	}

	@OriginalMember(owner = "client!us", name = "b", descriptor = "(B)V")
	public void method8374() {
		this.aClass368_12.method8703();
		this.aClass273_44.method6586();
		this.anInt9750 = this.anInt9748;
	}

	@OriginalMember(owner = "client!us", name = "b", descriptor = "(I)I")
	public int method8378() {
		return this.anInt9750;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Lclient!eq;Z)Ljava/lang/Object;")
	public Object method8379(@OriginalArg(0) Interface5 arg0) {
		@Pc(9) long local9 = arg0.method1677();
		for (@Pc(16) Class5_Sub5_Sub3 local16 = (Class5_Sub5_Sub3) this.aClass273_44.method6581(local9); local16 != null; local16 = (Class5_Sub5_Sub3) this.aClass273_44.method6582()) {
			if (local16.anInterface5_3.method1678(arg0)) {
				@Pc(28) Object local28 = local16.method6059();
				if (local28 != null) {
					if (local16.method6061()) {
						@Pc(57) Class5_Sub5_Sub3_Sub2 local57 = new Class5_Sub5_Sub3_Sub2(arg0, local28, local16.anInt6780);
						this.aClass273_44.method6585(local16.aLong278, local57);
						this.aClass368_12.method8709(local57);
						local57.aLong274 = 0L;
						local16.method9047();
						local16.method8952();
					} else {
						this.aClass368_12.method8709(local16);
						local16.aLong274 = 0L;
					}
					return local28;
				}
				local16.method9047();
				local16.method8952();
				this.anInt9750 += local16.anInt6780;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Lclient!lia;I)V")
	private void method8380(@OriginalArg(0) Class5_Sub5_Sub3 arg0) {
		if (arg0 != null) {
			arg0.method9047();
			arg0.method8952();
			this.anInt9750 += arg0.anInt6780;
		}
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Lclient!eq;B)V")
	private void method8381(@OriginalArg(0) Interface5 arg0) {
		@Pc(9) long local9 = arg0.method1677();
		for (@Pc(21) Class5_Sub5_Sub3 local21 = (Class5_Sub5_Sub3) this.aClass273_44.method6581(local9); local21 != null; local21 = (Class5_Sub5_Sub3) this.aClass273_44.method6582()) {
			if (local21.anInterface5_3.method1678(arg0)) {
				this.method8380(local21);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(ILjava/lang/Object;ILclient!eq;)V")
	private void method8382(@OriginalArg(1) Object arg0, @OriginalArg(3) Interface5 arg1) {
		if (this.anInt9748 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method8381(arg1);
		this.anInt9750--;
		while (this.anInt9750 < 0) {
			@Pc(34) Class5_Sub5_Sub3 local34 = (Class5_Sub5_Sub3) this.aClass368_12.method8705();
			this.method8380(local34);
		}
		@Pc(48) Class5_Sub5_Sub3_Sub2 local48 = new Class5_Sub5_Sub3_Sub2(arg1, arg0, 1);
		this.aClass273_44.method6585(arg1.method1677(), local48);
		this.aClass368_12.method8709(local48);
		local48.aLong274 = 0L;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IZ)V")
	public void method8383() {
		if (Static606.aClass49_1 == null) {
			return;
		}
		for (@Pc(14) Class5_Sub5_Sub3 local14 = (Class5_Sub5_Sub3) this.aClass368_12.method8702(); local14 != null; local14 = (Class5_Sub5_Sub3) this.aClass368_12.method8710()) {
			if (local14.method6061()) {
				if (local14.method6059() == null) {
					local14.method9047();
					local14.method8952();
					this.anInt9750 += local14.anInt6780;
				}
			} else if (++local14.aLong274 > (long) 5) {
				@Pc(40) Class5_Sub5_Sub3 local40 = Static606.aClass49_1.method1053(local14);
				this.aClass273_44.method6585(local14.aLong278, local40);
				Static447.method6737(local40, local14);
				local14.method9047();
				local14.method8952();
			}
		}
	}

	@OriginalMember(owner = "client!us", name = "c", descriptor = "(I)I")
	public int method8384() {
		return this.anInt9748;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Lclient!eq;Ljava/lang/Object;I)V")
	public void method8385(@OriginalArg(0) Interface5 arg0, @OriginalArg(1) Object arg1) {
		this.method8382(arg1, arg0);
	}
}
