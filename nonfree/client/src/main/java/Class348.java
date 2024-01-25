import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ui")
public final class Class348 {

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "I")
	public int anInt9594;

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "I")
	public int anInt9595;

	@OriginalMember(owner = "client!ui", name = "k", descriptor = "Lclient!ti;")
	public Class333 aClass333_3;

	@OriginalMember(owner = "client!ui", name = "j", descriptor = "Z")
	public boolean aBoolean691 = false;

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)Z")
	public boolean method8240() {
		return this.aClass333_3.aClass207_112.method4678(this.anInt9594);
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZLclient!ofa;)V")
	public void method8241(@OriginalArg(1) Class5_Sub22 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method5966();
			if (local13 == 0) {
				return;
			}
			this.method8245(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IZBLclient!ha;)Lclient!it;")
	public Class28 method8242(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class133 arg2) {
		@Pc(24) long local24 = (long) (arg2.anInt8326 << 19 | (arg1 ? 262144 : 0) | this.anInt9594 | arg0 << 16);
		@Pc(32) Class28 local32 = (Class28) this.aClass333_3.aClass87_219.method1805(local24);
		if (local32 != null) {
			return local32;
		} else if (this.aClass333_3.aClass207_112.method4678(this.anInt9594)) {
			@Pc(54) Class131 local54 = Static649.method2888(this.aClass333_3.aClass207_112, this.anInt9594, 0);
			if (local54 != null) {
				local54.anInt3342 = local54.anInt3341 = local54.anInt3346 = local54.anInt3343 = 0;
				if (arg1) {
					local54.method2890();
				}
				for (@Pc(74) int local74 = 0; local74 < arg0; local74++) {
					local54.method2895();
				}
			}
			local32 = arg2.method7297(local54, true);
			if (local32 != null) {
				this.aClass333_3.aClass87_219.method1792(local24, local32);
			}
			return local32;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILclient!ofa;B)V")
	private void method8245(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub22 arg1) {
		if (arg0 == 1) {
			this.anInt9594 = arg1.method5968();
		} else if (arg0 == 2) {
			this.anInt9595 = arg1.method5931();
		} else if (arg0 == 3) {
			this.aBoolean691 = true;
		} else if (arg0 == 4) {
			this.anInt9594 = -1;
		}
	}
}
