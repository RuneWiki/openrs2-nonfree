import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vu")
public final class Class310 {

	@OriginalMember(owner = "client!vu", name = "c", descriptor = "Lclient!ua;")
	public Class292 aClass292_4;

	@OriginalMember(owner = "client!vu", name = "d", descriptor = "I")
	public int anInt9355;

	@OriginalMember(owner = "client!vu", name = "g", descriptor = "I")
	public int anInt9357;

	@OriginalMember(owner = "client!vu", name = "b", descriptor = "Z")
	public boolean aBoolean661 = false;

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(Lclient!daa;B)V")
	public void method7752(@OriginalArg(0) Class12_Sub8 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5216();
			if (local5 == 0) {
				return;
			}
			this.method7753(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(ZILclient!daa;)V")
	private void method7753(@OriginalArg(1) int arg0, @OriginalArg(2) Class12_Sub8 arg1) {
		if (arg0 == 1) {
			this.anInt9357 = arg1.method5199();
		} else if (arg0 == 2) {
			this.anInt9355 = arg1.method5195();
		} else if (arg0 == 3) {
			this.aBoolean661 = true;
		} else if (arg0 == 4) {
			this.anInt9357 = -1;
		}
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(IIZLclient!qa;)Lclient!ha;")
	public Class84 method7754(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class42 arg2) {
		@Pc(24) long local24 = (long) (arg2.anInt6927 << 19 | (arg1 ? 262144 : 0) | this.anInt9357 | arg0 << 16);
		@Pc(32) Class84 local32 = (Class84) this.aClass292_4.aClass125_61.method3446(local24);
		if (local32 != null) {
			return local32;
		} else if (this.aClass292_4.aClass16_111.method389(this.anInt9357)) {
			@Pc(54) Class40 local54 = Static550.method897(this.aClass292_4.aClass16_111, this.anInt9357, 0);
			if (local54 != null) {
				local54.anInt898 = local54.anInt897 = local54.anInt899 = local54.anInt896 = 0;
				if (arg1) {
					local54.method904();
				}
				for (@Pc(74) int local74 = 0; local74 < arg0; local74++) {
					local54.method899();
				}
			}
			local32 = arg2.method5839(local54);
			if (local32 != null) {
				this.aClass292_4.aClass125_61.method3437(local32, local24);
			}
			return local32;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(Z)Z")
	public boolean method7756() {
		return this.aClass292_4.aClass16_111.method389(this.anInt9357);
	}
}
