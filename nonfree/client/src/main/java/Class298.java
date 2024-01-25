import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public final class Class298 {

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "Lclient!cw;")
	public Class68 aClass68_4;

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "I")
	public int anInt8121;

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "I")
	public int anInt8123;

	@OriginalMember(owner = "client!qa", name = "i", descriptor = "Z")
	public boolean aBoolean545 = false;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZLclient!ha;II)Lclient!kw;")
	public Class178 method6952(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class22 arg1, @OriginalArg(3) int arg2) {
		@Pc(25) long local25 = (long) (arg1.anInt11007 << 19 | (arg0 ? 262144 : 0) | arg2 << 16 | this.anInt8123);
		@Pc(33) Class178 local33 = (Class178) this.aClass68_4.aClass307_24.method7002(local25);
		if (local33 != null) {
			return local33;
		} else if (this.aClass68_4.aClass182_30.method3964(this.anInt8123)) {
			@Pc(65) Class361 local65 = Static735.method8269(this.aClass68_4.aClass182_30, this.anInt8123, 0);
			if (local65 != null) {
				local65.anInt9705 = local65.anInt9703 = local65.anInt9708 = local65.anInt9704 = 0;
				if (arg0) {
					local65.method8273();
				}
				for (@Pc(89) int local89 = 0; local89 < arg2; local89++) {
					local65.method8274();
				}
			}
			local33 = arg1.method9363(local65, true);
			if (local33 != null) {
				this.aClass68_4.aClass307_24.method7000(local33, local25);
			}
			return local33;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!ika;I)V")
	public void method6953(@OriginalArg(0) Class3_Sub2 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method2048(255);
			if (local13 == 0) {
				return;
			}
			this.method6954(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILclient!ika;I)V")
	private void method6954(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub2 arg1) {
		if (arg0 == 1) {
			this.anInt8123 = arg1.method2028(-14795);
		} else if (arg0 == 2) {
			this.anInt8121 = arg1.method2061();
		} else if (arg0 == 3) {
			this.aBoolean545 = true;
		} else if (arg0 == 4) {
			this.anInt8123 = -1;
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)Z")
	public boolean method6955() {
		return this.aClass68_4.aClass182_30.method3964(this.anInt8123);
	}
}
