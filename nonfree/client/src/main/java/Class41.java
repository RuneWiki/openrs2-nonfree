import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!co")
public final class Class41 {

	@OriginalMember(owner = "client!co", name = "b", descriptor = "I")
	public int anInt1024;

	@OriginalMember(owner = "client!co", name = "e", descriptor = "I")
	public int anInt1027;

	@OriginalMember(owner = "client!co", name = "k", descriptor = "Lclient!wi;")
	public Class265 aClass265_1;

	@OriginalMember(owner = "client!co", name = "h", descriptor = "Z")
	public boolean aBoolean96 = false;

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(ZLclient!ya;II)Lclient!l;")
	public Class57 method937(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class19 arg1, @OriginalArg(2) int arg2) {
		@Pc(24) long local24 = (long) (arg1.anInt5532 << 19 | (arg0 ? 262144 : 0) | this.anInt1024 | arg2 << 16);
		@Pc(32) Class57 local32 = (Class57) this.aClass265_1.aClass68_60.method1787(local24);
		if (local32 != null) {
			return local32;
		} else if (this.aClass265_1.aClass76_103.method2125(this.anInt1024)) {
			@Pc(61) Class18 local61 = Static456.method318(this.aClass265_1.aClass76_103, this.anInt1024, 0);
			if (local61 != null) {
				local61.anInt371 = local61.anInt368 = local61.anInt369 = local61.anInt370 = 0;
				if (arg0) {
					local61.method321();
				}
				for (@Pc(81) int local81 = 0; local81 < arg2; local81++) {
					local61.method320();
				}
			}
			local32 = arg1.method4308(local61);
			if (local32 != null) {
				this.aClass265_1.aClass68_60.method1779(local24, local32);
			}
			return local32;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Lclient!iv;I)V")
	public void method938(@OriginalArg(0) Class4_Sub12 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method2490();
			if (local17 == 0) {
				return;
			}
			this.method939(local17, arg0);
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(ILclient!iv;I)V")
	private void method939(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub12 arg1) {
		if (arg0 == 1) {
			this.anInt1024 = arg1.method2536();
		} else if (arg0 == 2) {
			this.anInt1027 = arg1.method2493();
			return;
		} else if (arg0 == 3) {
			this.aBoolean96 = true;
			return;
		} else if (arg0 == 4) {
			this.anInt1024 = -1;
			return;
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(B)Z")
	public boolean method941() {
		return this.aClass265_1.aClass76_103.method2125(this.anInt1024);
	}
}
