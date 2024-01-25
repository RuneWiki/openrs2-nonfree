import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wk")
public final class Class313 {

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "Lclient!hd;")
	public Class112 aClass112_3;

	@OriginalMember(owner = "client!wk", name = "h", descriptor = "I")
	public int anInt9320;

	@OriginalMember(owner = "client!wk", name = "m", descriptor = "I")
	public int anInt9323;

	@OriginalMember(owner = "client!wk", name = "g", descriptor = "Z")
	public boolean aBoolean674 = false;

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(ILclient!ps;I)V")
	private void method7742(@OriginalArg(1) Class2_Sub29 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt9320 = arg0.method5229();
		} else if (arg1 == 2) {
			this.anInt9323 = arg0.method5210();
		} else if (arg1 == 3) {
			this.aBoolean674 = true;
			return;
		} else if (arg1 == 4) {
			this.anInt9320 = -1;
			return;
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(ILclient!ps;)V")
	public void method7743(@OriginalArg(1) Class2_Sub29 arg0) {
		while (true) {
			@Pc(8) int local8 = arg0.method5170();
			if (local8 == 0) {
				return;
			}
			this.method7742(arg0, local8);
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)Z")
	public boolean method7746() {
		return this.aClass112_3.aClass53_58.method1621(this.anInt9320);
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(ZLclient!qa;BI)Lclient!ha;")
	public Class35 method7747(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class39 arg1, @OriginalArg(3) int arg2) {
		@Pc(29) long local29 = (long) ((arg0 ? 262144 : 0) | this.anInt9320 | arg2 << 16 | arg1.anInt7092 << 19);
		@Pc(37) Class35 local37 = (Class35) this.aClass112_3.aClass231_33.method6228(local29);
		if (local37 != null) {
			return local37;
		} else if (this.aClass112_3.aClass53_58.method1621(this.anInt9320)) {
			@Pc(59) Class241 local59 = Static558.method6373(this.aClass112_3.aClass53_58, this.anInt9320, 0);
			if (local59 != null) {
				local59.anInt7602 = local59.anInt7603 = local59.anInt7601 = local59.anInt7605 = 0;
				if (arg0) {
					local59.method6363();
				}
				for (@Pc(79) int local79 = 0; local79 < arg2; local79++) {
					local59.method6374();
				}
			}
			local37 = arg1.method6018(local59);
			if (local37 != null) {
				this.aClass112_3.aClass231_33.method6232(local37, local29);
			}
			return local37;
		} else {
			return null;
		}
	}
}
