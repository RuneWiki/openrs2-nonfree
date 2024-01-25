import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mv")
public final class Class165 {

	@OriginalMember(owner = "client!mv", name = "f", descriptor = "Lclient!hb;")
	public Class97 aClass97_4;

	@OriginalMember(owner = "client!mv", name = "j", descriptor = "I")
	public int anInt4273;

	@OriginalMember(owner = "client!mv", name = "p", descriptor = "I")
	public int anInt4279;

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "Z")
	public boolean aBoolean305 = false;

	@OriginalMember(owner = "client!mv", name = "b", descriptor = "(I)Z")
	public boolean method3502() {
		return this.aClass97_4.aClass54_45.method1131(this.anInt4279);
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(IILclient!sv;)V")
	private void method3503(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub13 arg1) {
		if (arg0 == 1) {
			this.anInt4279 = arg1.method3555();
		} else if (arg0 == 2) {
			this.anInt4273 = arg1.method3563();
		} else if (arg0 == 3) {
			this.aBoolean305 = true;
			return;
		} else if (arg0 == 4) {
			this.anInt4279 = -1;
			return;
		}
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(IZBLclient!za;)Lclient!o;")
	public Class13 method3504(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class163 arg2) {
		@Pc(24) long local24 = (long) (arg2.anInt7061 << 19 | arg0 << 16 | this.anInt4279 | (arg1 ? 262144 : 0));
		@Pc(37) Class13 local37 = (Class13) this.aClass97_4.aClass132_17.method2701(local24);
		if (local37 != null) {
			return local37;
		} else if (this.aClass97_4.aClass54_45.method1131(this.anInt4279)) {
			@Pc(59) Class17 local59 = Static461.method262(this.aClass97_4.aClass54_45, this.anInt4279, 0);
			if (local59 != null) {
				local59.anInt346 = local59.anInt341 = local59.anInt343 = local59.anInt344 = 0;
				if (arg1) {
					local59.method254();
				}
				for (@Pc(79) int local79 = 0; local79 < arg0; local79++) {
					local59.method251();
				}
			}
			local37 = arg2.method5549(local59);
			if (local37 != null) {
				this.aClass97_4.aClass132_17.method2711(local37, local24);
			}
			return local37;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(Lclient!sv;B)V")
	public void method3505(@OriginalArg(0) Class2_Sub13 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method3580();
			if (local14 == 0) {
				return;
			}
			this.method3503(local14, arg0);
		}
	}
}
