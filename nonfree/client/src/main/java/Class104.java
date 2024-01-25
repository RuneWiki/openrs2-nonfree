import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ff")
public final class Class104 {

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "I")
	public int anInt3416;

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "I")
	public int anInt3417;

	@OriginalMember(owner = "client!ff", name = "i", descriptor = "Lclient!u;")
	public Class353 aClass353_2;

	@OriginalMember(owner = "client!ff", name = "g", descriptor = "Z")
	public boolean aBoolean257 = false;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(BLclient!ol;)V")
	public void method3188(@OriginalArg(1) Class2_Sub8 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method5203();
			if (local13 == 0) {
				return;
			}
			this.method3193(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILclient!ha;ZI)Lclient!mq;")
	public Class71 method3189(@OriginalArg(0) int arg0, @OriginalArg(1) Class101 arg1, @OriginalArg(2) boolean arg2) {
		@Pc(31) long local31 = (long) (arg1.anInt9210 << 19 | this.anInt3416 | arg0 << 16 | (arg2 ? 262144 : 0));
		@Pc(39) Class71 local39 = (Class71) this.aClass353_2.aClass22_60.method462(local31);
		if (local39 != null) {
			return local39;
		} else if (this.aClass353_2.aClass124_121.method3627(this.anInt3416)) {
			@Pc(61) Class67 local61 = Static676.method1693(this.aClass353_2.aClass124_121, this.anInt3416, 0);
			if (local61 != null) {
				local61.anInt1764 = local61.anInt1760 = local61.anInt1762 = local61.anInt1763 = 0;
				if (arg2) {
					local61.method1695();
				}
				for (@Pc(81) int local81 = 0; local81 < arg0; local81++) {
					local61.method1696();
				}
			}
			local39 = arg1.method8063(local61, true);
			if (local39 != null) {
				this.aClass353_2.aClass22_60.method470(local31, local39);
			}
			return local39;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(I)Z")
	public boolean method3192() {
		return this.aClass353_2.aClass124_121.method3627(this.anInt3416);
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IILclient!ol;)V")
	private void method3193(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub8 arg1) {
		if (arg0 == 1) {
			this.anInt3416 = arg1.method5211();
		} else if (arg0 == 2) {
			this.anInt3417 = arg1.method5161();
			return;
		} else if (arg0 == 3) {
			this.aBoolean257 = true;
			return;
		} else if (arg0 == 4) {
			this.anInt3416 = -1;
			return;
		}
	}
}
