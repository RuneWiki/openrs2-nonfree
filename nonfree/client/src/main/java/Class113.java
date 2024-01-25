import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ge")
public final class Class113 {

	@OriginalMember(owner = "client!ge", name = "i", descriptor = "I")
	public int anInt3295;

	@OriginalMember(owner = "client!ge", name = "j", descriptor = "Lclient!ve;")
	public Class348 aClass348_1;

	@OriginalMember(owner = "client!ge", name = "l", descriptor = "I")
	public int anInt3297;

	@OriginalMember(owner = "client!ge", name = "e", descriptor = "Z")
	public boolean aBoolean269 = false;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!r;IZI)Lclient!f;")
	public Class46 method2914(@OriginalArg(0) Class43 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(24) long local24 = (long) (this.anInt3295 | arg2 << 16 | (arg1 ? 262144 : 0) | arg0.anInt8539 << 19);
		@Pc(32) Class46 local32 = (Class46) this.aClass348_1.aClass10_64.method250(local24);
		if (local32 != null) {
			return local32;
		} else if (this.aClass348_1.aClass246_255.method5667(this.anInt3295)) {
			@Pc(59) Class355 local59 = Static606.method7590(this.aClass348_1.aClass246_255, this.anInt3295, 0);
			if (local59 != null) {
				local59.anInt9166 = local59.anInt9161 = local59.anInt9164 = local59.anInt9163 = 0;
				if (arg1) {
					local59.method7602();
				}
				for (@Pc(79) int local79 = 0; local79 < arg2; local79++) {
					local59.method7600();
				}
			}
			local32 = arg0.method7205(local59, true);
			if (local32 != null) {
				this.aClass348_1.aClass10_64.method254(local32, local24);
			}
			return local32;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IILclient!qh;)V")
	private void method2919(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub11 arg1) {
		if (arg0 == 1) {
			this.anInt3295 = arg1.method3109();
		} else if (arg0 == 2) {
			this.anInt3297 = arg1.method3126();
		} else if (arg0 == 3) {
			this.aBoolean269 = true;
		} else if (arg0 == 4) {
			this.anInt3295 = -1;
		}
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(B)Z")
	public boolean method2920() {
		return this.aClass348_1.aClass246_255.method5667(this.anInt3295);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!qh;I)V")
	public void method2921(@OriginalArg(0) Class3_Sub11 arg0) {
		while (true) {
			@Pc(8) int local8 = arg0.method3118();
			if (local8 == 0) {
				return;
			}
			this.method2919(local8, arg0);
		}
	}
}
