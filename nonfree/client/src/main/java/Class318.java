import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wn")
public final class Class318 {

	@OriginalMember(owner = "client!wn", name = "i", descriptor = "I")
	public int anInt9444;

	@OriginalMember(owner = "client!wn", name = "j", descriptor = "I")
	public int anInt9445;

	@OriginalMember(owner = "client!wn", name = "o", descriptor = "Lclient!kb;")
	public Class160 aClass160_4;

	@OriginalMember(owner = "client!wn", name = "f", descriptor = "Z")
	public boolean aBoolean704 = false;

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(ZLclient!os;)V")
	public void method8136(@OriginalArg(1) Class1_Sub17 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method4487();
			if (local17 == 0) {
				return;
			}
			this.method8141(arg0, local17);
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IZLclient!qa;I)Lclient!ha;")
	public Class104 method8138(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class4 arg1, @OriginalArg(3) int arg2) {
		@Pc(24) long local24 = (long) (arg1.anInt8106 << 19 | (arg0 ? 262144 : 0) | arg2 << 16 | this.anInt9444);
		@Pc(32) Class104 local32 = (Class104) this.aClass160_4.aClass277_37.method7014(local24);
		if (local32 != null) {
			return local32;
		} else if (this.aClass160_4.aClass69_48.method1896(this.anInt9444)) {
			@Pc(54) Class70 local54 = Static547.method1922(this.aClass160_4.aClass69_48, this.anInt9444, 0);
			if (local54 != null) {
				local54.anInt2014 = local54.anInt2011 = local54.anInt2015 = local54.anInt2010 = 0;
				if (arg0) {
					local54.method1916();
				}
				for (@Pc(74) int local74 = 0; local74 < arg2; local74++) {
					local54.method1920();
				}
			}
			local32 = arg1.method7149(local54);
			if (local32 != null) {
				this.aClass160_4.aClass277_37.method7016(local32, local24);
			}
			return local32;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "(I)Z")
	public boolean method8140() {
		return this.aClass160_4.aClass69_48.method1896(this.anInt9444);
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(Lclient!os;IZ)V")
	private void method8141(@OriginalArg(0) Class1_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt9444 = arg0.method4494();
		} else if (arg1 == 2) {
			this.anInt9445 = arg0.method4486();
		} else if (arg1 == 3) {
			this.aBoolean704 = true;
		} else if (arg1 == 4) {
			this.anInt9444 = -1;
		}
	}
}
