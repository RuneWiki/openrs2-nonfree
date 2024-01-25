import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bn")
public final class Class34 {

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "I")
	public int anInt836;

	@OriginalMember(owner = "client!bn", name = "e", descriptor = "I")
	public int anInt839;

	@OriginalMember(owner = "client!bn", name = "k", descriptor = "Lclient!kd;")
	public Class190 aClass190_1;

	@OriginalMember(owner = "client!bn", name = "l", descriptor = "Z")
	public boolean aBoolean71 = false;

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lclient!eh;I)V")
	public void method728(@OriginalArg(0) Class4_Sub9 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method6015();
			if (local13 == 0) {
				return;
			}
			this.method729(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lclient!eh;II)V")
	private void method729(@OriginalArg(0) Class4_Sub9 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt836 = arg0.method5982();
		} else if (arg1 == 2) {
			this.anInt839 = arg0.method6023();
		} else if (arg1 == 3) {
			this.aBoolean71 = true;
		} else if (arg1 == 4) {
			this.anInt836 = -1;
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IBZLclient!oa;)Lclient!xa;")
	public Class13 method730(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class66 arg2) {
		@Pc(24) long local24 = (long) ((arg1 ? 262144 : 0) | this.anInt836 | arg0 << 16 | arg2.anInt8223 << 19);
		@Pc(32) Class13 local32 = (Class13) this.aClass190_1.aClass223_39.method4943(local24);
		if (local32 != null) {
			return local32;
		} else if (this.aClass190_1.aClass31_57.method679(this.anInt836)) {
			@Pc(60) Class268 local60 = Static607.method5872(this.aClass190_1.aClass31_57, this.anInt836, 0);
			if (local60 != null) {
				local60.anInt7061 = local60.anInt7057 = local60.anInt7056 = local60.anInt7059 = 0;
				if (arg1) {
					local60.method5880();
				}
				for (@Pc(80) int local80 = 0; local80 < arg0; local80++) {
					local60.method5876();
				}
			}
			local32 = arg2.method6799(local60, true);
			if (local32 != null) {
				this.aClass190_1.aClass223_39.method4938(local24, local32);
			}
			return local32;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "(I)Z")
	public boolean method731() {
		return this.aClass190_1.aClass31_57.method679(this.anInt836);
	}
}
