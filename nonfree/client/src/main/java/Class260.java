import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rt")
public final class Class260 {

	@OriginalMember(owner = "client!rt", name = "f", descriptor = "Lclient!sr;")
	public Class274 aClass274_4;

	@OriginalMember(owner = "client!rt", name = "j", descriptor = "I")
	public int anInt7676;

	@OriginalMember(owner = "client!rt", name = "k", descriptor = "I")
	public int anInt7677;

	@OriginalMember(owner = "client!rt", name = "b", descriptor = "Z")
	public boolean aBoolean544 = false;

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(B)Z")
	public boolean method6212() {
		return this.aClass274_4.aClass117_192.method2973(this.anInt7677);
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(IZLclient!qa;I)Lclient!ha;")
	public Class25 method6213(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class62 arg1, @OriginalArg(3) int arg2) {
		@Pc(29) long local29 = (long) (this.anInt7677 | arg2 << 16 | (arg0 ? 262144 : 0) | arg1.anInt8664 << 19);
		@Pc(37) Class25 local37 = (Class25) this.aClass274_4.aClass288_59.method6745(local29);
		if (local37 != null) {
			return local37;
		} else if (this.aClass274_4.aClass117_192.method2973(this.anInt7677)) {
			@Pc(59) Class96 local59 = Static551.method2427(this.aClass274_4.aClass117_192, this.anInt7677, 0);
			if (local59 != null) {
				local59.anInt2721 = local59.anInt2719 = local59.anInt2723 = local59.anInt2720 = 0;
				if (arg0) {
					local59.method2423();
				}
				for (@Pc(79) int local79 = 0; local79 < arg2; local79++) {
					local59.method2433();
				}
			}
			local37 = arg1.method6998(local59);
			if (local37 != null) {
				this.aClass274_4.aClass288_59.method6746(local37, local29);
			}
			return local37;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(ILclient!co;)V")
	public void method6216(@OriginalArg(1) Class5_Sub3 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method4220();
			if (local14 == 0) {
				return;
			}
			this.method6217(arg0, local14);
		}
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(Lclient!co;ZI)V")
	private void method6217(@OriginalArg(0) Class5_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt7677 = arg0.method4227();
		} else if (arg1 == 2) {
			this.anInt7676 = arg0.method4182();
		} else if (arg1 == 3) {
			this.aBoolean544 = true;
		} else if (arg1 == 4) {
			this.anInt7677 = -1;
		}
	}
}
