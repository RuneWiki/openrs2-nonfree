import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ri")
public final class Class317 {

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "I")
	public int anInt8623;

	@OriginalMember(owner = "client!ri", name = "g", descriptor = "Lclient!qt;")
	public Class306 aClass306_5;

	@OriginalMember(owner = "client!ri", name = "i", descriptor = "I")
	public int anInt8624;

	@OriginalMember(owner = "client!ri", name = "l", descriptor = "Z")
	public boolean aBoolean667 = false;

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)Z")
	public boolean method7551() {
		return this.aClass306_5.aClass223_98.method5285(this.anInt8623);
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(ILclient!jc;)V")
	public void method7552(@OriginalArg(1) Class6_Sub15 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method3030();
			if (local11 == 0) {
				return;
			}
			this.method7553(local11, arg0);
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IILclient!jc;)V")
	private void method7553(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub15 arg1) {
		if (arg0 == 1) {
			this.anInt8623 = arg1.method3018();
		} else if (arg0 == 2) {
			this.anInt8624 = arg1.method2987();
		} else if (arg0 == 3) {
			this.aBoolean667 = true;
		} else if (arg0 == 4) {
			this.anInt8623 = -1;
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IZLclient!ha;I)Lclient!tb;")
	public Class49 method7555(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class75 arg1, @OriginalArg(3) int arg2) {
		@Pc(25) long local25 = (long) (this.anInt8623 | arg2 << 16 | (arg0 ? 262144 : 0) | arg1.anInt7475 << 19);
		@Pc(33) Class49 local33 = (Class49) this.aClass306_5.aClass359_57.method8517(local25);
		if (local33 != null) {
			return local33;
		} else if (this.aClass306_5.aClass223_98.method5285(this.anInt8623)) {
			@Pc(57) Class64 local57 = Static691.method1249(this.aClass306_5.aClass223_98, this.anInt8623, 0);
			if (local57 != null) {
				local57.anInt1299 = local57.anInt1302 = local57.anInt1298 = local57.anInt1301 = 0;
				if (arg0) {
					local57.method1236();
				}
				for (@Pc(93) int local93 = 0; local93 < arg2; local93++) {
					local57.method1241();
				}
			}
			local33 = arg1.method6714(local57, true);
			if (local33 != null) {
				this.aClass306_5.aClass359_57.method8515(local25, local33);
			}
			return local33;
		} else {
			return null;
		}
	}
}
