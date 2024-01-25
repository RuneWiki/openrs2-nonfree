import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lr")
public final class Class221 {

	@OriginalMember(owner = "client!lr", name = "g", descriptor = "I")
	public int anInt6394;

	@OriginalMember(owner = "client!lr", name = "h", descriptor = "I")
	public int anInt6395;

	@OriginalMember(owner = "client!lr", name = "m", descriptor = "Lclient!eca;")
	public Class83 aClass83_3;

	@OriginalMember(owner = "client!lr", name = "j", descriptor = "Z")
	public boolean aBoolean437 = false;

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(ILclient!so;)V")
	public void method5290(@OriginalArg(1) Class14_Sub29 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5866();
			if (local5 == 0) {
				return;
			}
			this.method5291(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(BILclient!so;)V")
	private void method5291(@OriginalArg(1) int arg0, @OriginalArg(2) Class14_Sub29 arg1) {
		if (arg0 == 1) {
			this.anInt6395 = arg1.method5900();
		} else if (arg0 == 2) {
			this.anInt6394 = arg1.method5862();
		} else if (arg0 == 3) {
			this.aBoolean437 = true;
		} else if (arg0 == 4) {
			this.anInt6395 = -1;
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(BZILclient!ha;)Lclient!jd;")
	public Class20 method5293(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class137 arg2) {
		@Pc(24) long local24 = (long) (arg2.anInt9522 << 19 | (arg0 ? 262144 : 0) | this.anInt6395 | arg1 << 16);
		@Pc(32) Class20 local32 = (Class20) this.aClass83_3.aClass264_17.method6367(local24);
		if (local32 != null) {
			return local32;
		} else if (this.aClass83_3.aClass386_29.method9206(this.anInt6395)) {
			@Pc(54) Class356 local54 = Static688.method8619(this.aClass83_3.aClass386_29, this.anInt6395, 0);
			if (local54 != null) {
				local54.anInt10345 = local54.anInt10340 = local54.anInt10344 = local54.anInt10342 = 0;
				if (arg0) {
					local54.method8629();
				}
				for (@Pc(74) int local74 = 0; local74 < arg1; local74++) {
					local54.method8625();
				}
			}
			local32 = arg2.method7951(local54, true);
			if (local32 != null) {
				this.aClass83_3.aClass264_17.method6364(local24, local32);
			}
			return local32;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(B)Z")
	public boolean method5296() {
		return this.aClass83_3.aClass386_29.method9206(this.anInt6395);
	}
}
