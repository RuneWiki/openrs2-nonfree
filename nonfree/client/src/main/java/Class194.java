import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ko")
public final class Class194 {

	@OriginalMember(owner = "client!ko", name = "c", descriptor = "I")
	public int anInt5324;

	@OriginalMember(owner = "client!ko", name = "d", descriptor = "I")
	public int anInt5325;

	@OriginalMember(owner = "client!ko", name = "g", descriptor = "Lclient!wba;")
	public Class377 aClass377_2;

	@OriginalMember(owner = "client!ko", name = "i", descriptor = "Z")
	public boolean aBoolean389 = false;

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIZLclient!ha;)Lclient!vr;")
	public Class33 method4870(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class13 arg2) {
		@Pc(29) long local29 = (long) (arg2.anInt9671 << 19 | this.anInt5324 | arg0 << 16 | (arg1 ? 262144 : 0));
		@Pc(37) Class33 local37 = (Class33) this.aClass377_2.aClass165_80.method4389(local29);
		if (local37 != null) {
			return local37;
		} else if (this.aClass377_2.aClass15_162.method526(this.anInt5324)) {
			@Pc(59) Class97 local59 = Static682.method2754(this.aClass377_2.aClass15_162, this.anInt5324, 0);
			if (local59 != null) {
				local59.anInt2965 = local59.anInt2964 = local59.anInt2961 = local59.anInt2962 = 0;
				if (arg1) {
					local59.method2753();
				}
				for (@Pc(79) int local79 = 0; local79 < arg0; local79++) {
					local59.method2752();
				}
			}
			local37 = arg2.method8465(local59, true);
			if (local37 != null) {
				this.aClass377_2.aClass165_80.method4392(local37, local29);
			}
			return local37;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(I)Z")
	public boolean method4871() {
		return this.aClass377_2.aClass15_162.method526(this.anInt5324);
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(ILclient!jp;I)V")
	private void method4872(@OriginalArg(1) Class3_Sub25 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt5324 = arg0.method8593();
		} else if (arg1 == 2) {
			this.anInt5325 = arg0.method8607();
		} else if (arg1 == 3) {
			this.aBoolean389 = true;
		} else if (arg1 == 4) {
			this.anInt5324 = -1;
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(BLclient!jp;)V")
	public void method4874(@OriginalArg(1) Class3_Sub25 arg0) {
		while (true) {
			@Pc(18) int local18 = arg0.method8632();
			if (local18 == 0) {
				return;
			}
			this.method4872(arg0, local18);
		}
	}
}
