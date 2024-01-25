import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public final class Class173 {

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
	public int anInt4590;

	@OriginalMember(owner = "client!ie", name = "f", descriptor = "Lclient!fda;")
	public Class116 aClass116_1;

	@OriginalMember(owner = "client!ie", name = "h", descriptor = "I")
	public int anInt4593;

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "Z")
	public boolean aBoolean362 = false;

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)Z")
	public boolean method3928() {
		return this.aClass116_1.aClass143_38.method3130(this.anInt4590);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!ha;IZI)Lclient!nf;")
	public Class102 method3929(@OriginalArg(0) Class16 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(24) long local24 = (long) (arg0.anInt9594 << 19 | this.anInt4590 | arg2 << 16 | (arg1 ? 262144 : 0));
		@Pc(32) Class102 local32 = (Class102) this.aClass116_1.aClass279_16.method6631(local24);
		if (local32 != null) {
			return local32;
		} else if (this.aClass116_1.aClass143_38.method3130(this.anInt4590)) {
			@Pc(54) Class150 local54 = Static683.method3275(this.aClass116_1.aClass143_38, this.anInt4590, 0);
			if (local54 != null) {
				local54.anInt3829 = local54.anInt3830 = local54.anInt3827 = local54.anInt3826 = 0;
				if (arg1) {
					local54.method3274();
				}
				for (@Pc(74) int local74 = 0; local74 < arg2; local74++) {
					local54.method3283();
				}
			}
			local32 = arg0.method8132(local54, true);
			if (local32 != null) {
				this.aClass116_1.aClass279_16.method6635(local32, local24);
			}
			return local32;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!fca;B)V")
	public void method3930(@OriginalArg(0) Class3_Sub17 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4888();
			if (local5 == 0) {
				return;
			}
			this.method3933(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILclient!fca;I)V")
	private void method3933(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub17 arg1) {
		if (arg0 == 1) {
			this.anInt4590 = arg1.method4858();
		} else if (arg0 == 2) {
			this.anInt4593 = arg1.method4862();
			return;
		} else if (arg0 == 3) {
			this.aBoolean362 = true;
			return;
		} else if (arg0 == 4) {
			this.anInt4590 = -1;
			return;
		}
	}
}
