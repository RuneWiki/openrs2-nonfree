import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bma")
public final class Class46 {

	@OriginalMember(owner = "client!bma", name = "e", descriptor = "I")
	public int anInt1008;

	@OriginalMember(owner = "client!bma", name = "g", descriptor = "I")
	public int anInt1011;

	@OriginalMember(owner = "client!bma", name = "h", descriptor = "Lclient!tea;")
	public Class351 aClass351_1;

	@OriginalMember(owner = "client!bma", name = "c", descriptor = "Z")
	public boolean aBoolean123 = false;

	@OriginalMember(owner = "client!bma", name = "a", descriptor = "(ILclient!et;)V")
	public void method906(@OriginalArg(1) Class2_Sub20 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method8581(-17416);
			if (local5 == 0) {
				return;
			}
			this.method907(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!bma", name = "a", descriptor = "(ILclient!et;I)V")
	private void method907(@OriginalArg(1) Class2_Sub20 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt1011 = arg0.method8575();
		} else if (arg1 == 2) {
			this.anInt1008 = arg0.method8583();
		} else if (arg1 == 3) {
			this.aBoolean123 = true;
		} else if (arg1 == 4) {
			this.anInt1011 = -1;
		}
	}

	@OriginalMember(owner = "client!bma", name = "b", descriptor = "(I)Z")
	public boolean method909() {
		return this.aClass351_1.aClass254_151.method6072(this.anInt1011);
	}

	@OriginalMember(owner = "client!bma", name = "a", descriptor = "(IIZLclient!ha;)Lclient!ug;")
	public Class43 method910(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class145 arg2) {
		@Pc(25) long local25 = (long) (arg2.anInt11056 << 19 | this.anInt1011 | arg0 << 16 | (arg1 ? 262144 : 0));
		@Pc(33) Class43 local33 = (Class43) this.aClass351_1.aClass85_63.method1737(local25);
		if (local33 != null) {
			return local33;
		} else if (this.aClass351_1.aClass254_151.method6072(this.anInt1011)) {
			@Pc(57) Class355 local57 = Static737.method8362(this.aClass351_1.aClass254_151, this.anInt1011, 0);
			if (local57 != null) {
				local57.anInt9473 = local57.anInt9468 = local57.anInt9471 = local57.anInt9472 = 0;
				if (arg1) {
					local57.method8357();
				}
				for (@Pc(81) int local81 = 0; local81 < arg0; local81++) {
					local57.method8354();
				}
			}
			local33 = arg2.method9683(local57, true);
			if (local33 != null) {
				this.aClass351_1.aClass85_63.method1745(local25, 16383, local33);
			}
			return local33;
		} else {
			return null;
		}
	}
}
