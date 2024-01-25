import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qf")
public final class Class289 {

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "I")
	public int anInt8034;

	@OriginalMember(owner = "client!qf", name = "k", descriptor = "I")
	public int anInt8036;

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "Lclient!nu;")
	public Class256 aClass256_1;

	@OriginalMember(owner = "client!qf", name = "l", descriptor = "Z")
	public boolean aBoolean604 = false;

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!ib;I)V")
	public void method6917(@OriginalArg(0) Class5_Sub23 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method8529();
			if (local5 == 0) {
				return;
			}
			this.method6919(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)Z")
	public boolean method6918() {
		return this.aClass256_1.aClass208_95.method4977(this.anInt8034);
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!ib;II)V")
	private void method6919(@OriginalArg(0) Class5_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt8034 = arg0.method8519();
		} else if (arg1 == 2) {
			this.anInt8036 = arg0.method8510();
		} else if (arg1 == 3) {
			this.aBoolean604 = true;
		} else if (arg1 == 4) {
			this.anInt8034 = -1;
			return;
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZIZLclient!ha;)Lclient!fs;")
	public Class134 method6920(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class57 arg2) {
		@Pc(25) long local25 = (long) (arg2.anInt8956 << 19 | this.anInt8034 | arg0 << 16 | (arg1 ? 262144 : 0));
		@Pc(33) Class134 local33 = (Class134) this.aClass256_1.aClass391_37.method9275(local25);
		if (local33 != null) {
			return local33;
		} else if (this.aClass256_1.aClass208_95.method4977(this.anInt8034)) {
			@Pc(57) Class173 local57 = Static684.method3655(this.aClass256_1.aClass208_95, this.anInt8034, 0);
			if (local57 != null) {
				local57.anInt4284 = local57.anInt4283 = local57.anInt4285 = local57.anInt4286 = 0;
				if (arg1) {
					local57.method3659();
				}
				for (@Pc(81) int local81 = 0; local81 < arg0; local81++) {
					local57.method3656();
				}
			}
			local33 = arg2.method7654(local57, true);
			if (local33 != null) {
				this.aClass256_1.aClass391_37.method9273(local25, local33, 1);
			}
			return local33;
		} else {
			return null;
		}
	}
}
