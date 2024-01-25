import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!et")
public final class Class70 {

	@OriginalMember(owner = "client!et", name = "c", descriptor = "Lclient!rv;")
	public Class212 aClass212_2;

	@OriginalMember(owner = "client!et", name = "g", descriptor = "I")
	public int anInt2150;

	@OriginalMember(owner = "client!et", name = "j", descriptor = "I")
	public int anInt2152;

	@OriginalMember(owner = "client!et", name = "e", descriptor = "Z")
	public boolean aBoolean158 = false;

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(ILclient!qa;ZI)Lclient!f;")
	public Class3 method1611(@OriginalArg(1) Class30 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(24) long local24 = (long) (arg0.anInt5975 << 19 | arg2 << 16 | this.anInt2152 | (arg1 ? 262144 : 0));
		@Pc(32) Class3 local32 = (Class3) this.aClass212_2.aClass69_65.method1591(local24);
		if (local32 != null) {
			return local32;
		} else if (this.aClass212_2.aClass166_246.method3670(this.anInt2152)) {
			@Pc(54) Class205 local54 = Static464.method4782(this.aClass212_2.aClass166_246, this.anInt2152, 0);
			if (local54 != null) {
				local54.anInt6174 = local54.anInt6173 = local54.anInt6172 = local54.anInt6170 = 0;
				if (arg1) {
					local54.method4787();
				}
				for (@Pc(74) int local74 = 0; local74 < arg2; local74++) {
					local54.method4781();
				}
			}
			local32 = arg0.method4656(local54);
			if (local32 != null) {
				this.aClass212_2.aClass69_65.method1590(local24, local32);
			}
			return local32;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Lclient!tl;II)V")
	private void method1612(@OriginalArg(0) Class4_Sub30 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2152 = arg0.method4877();
		} else if (arg1 == 2) {
			this.anInt2150 = arg0.method4887();
		} else if (arg1 == 3) {
			this.aBoolean158 = true;
		} else if (arg1 == 4) {
			this.anInt2152 = -1;
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Lclient!tl;B)V")
	public void method1614(@OriginalArg(0) Class4_Sub30 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4864();
			if (local5 == 0) {
				return;
			}
			this.method1612(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Z)Z")
	public boolean method1615() {
		return this.aClass212_2.aClass166_246.method3670(this.anInt2152);
	}
}
