import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gq")
public final class Class99 {

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "Lclient!sh;")
	public Class221 aClass221_1;

	@OriginalMember(owner = "client!gq", name = "c", descriptor = "I")
	public int anInt2694;

	@OriginalMember(owner = "client!gq", name = "i", descriptor = "I")
	public int anInt2699;

	@OriginalMember(owner = "client!gq", name = "g", descriptor = "Z")
	public boolean aBoolean239 = false;

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(I)Z")
	public boolean method2008() {
		return this.aClass221_1.aClass188_100.method4296(this.anInt2694);
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(ZILclient!qa;I)Lclient!f;")
	public Class76 method2011(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class26 arg1, @OriginalArg(3) int arg2) {
		@Pc(24) long local24 = (long) ((arg0 ? 262144 : 0) | arg2 << 16 | this.anInt2694 | arg1.anInt2873 << 19);
		@Pc(34) Class76 local34 = (Class76) this.aClass221_1.aClass129_57.method3023(local24);
		if (local34 != null) {
			return local34;
		} else if (this.aClass221_1.aClass188_100.method4296(this.anInt2694)) {
			@Pc(56) Class89 local56 = Static456.method1764(this.aClass221_1.aClass188_100, this.anInt2694, 0);
			if (local56 != null) {
				local56.anInt2408 = local56.anInt2409 = local56.anInt2411 = local56.anInt2410 = 0;
				if (arg0) {
					local56.method1776();
				}
				for (@Pc(76) int local76 = 0; local76 < arg2; local76++) {
					local56.method1769();
				}
			}
			local34 = arg1.method2230(local56);
			if (local34 != null) {
				this.aClass221_1.aClass129_57.method3029(local34, local24);
			}
			return local34;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(ILclient!md;)V")
	public void method2012(@OriginalArg(1) Class2_Sub20 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3737();
			if (local5 == 0) {
				return;
			}
			this.method2014(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(ILclient!md;I)V")
	private void method2014(@OriginalArg(1) Class2_Sub20 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2694 = arg0.method3711();
		} else if (arg1 == 2) {
			this.anInt2699 = arg0.method3748();
		} else if (arg1 == 3) {
			this.aBoolean239 = true;
		} else if (arg1 == 4) {
			this.anInt2694 = -1;
		}
	}
}
