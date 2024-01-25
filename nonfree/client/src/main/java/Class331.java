import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public final class Class331 {

	@OriginalMember(owner = "client!ru", name = "j", descriptor = "I")
	public int anInt8889;

	@OriginalMember(owner = "client!ru", name = "e", descriptor = "Lclient!pb;")
	public Class2_Sub6_Sub14 aClass2_Sub6_Sub14_1;

	@OriginalMember(owner = "client!ru", name = "p", descriptor = "I")
	public int anInt8891;

	@OriginalMember(owner = "client!ru", name = "c", descriptor = "Lclient!pb;")
	public Class2_Sub6_Sub14 aClass2_Sub6_Sub14_2;

	@OriginalMember(owner = "client!ru", name = "k", descriptor = "I")
	public int anInt8896;

	@OriginalMember(owner = "client!ru", name = "g", descriptor = "Z")
	public boolean aBoolean756 = false;

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(ILclient!oha;II[ILclient!qea;)Z")
	public boolean method7858(@OriginalArg(1) Class274 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) Class307 arg4) {
		if (this.aBoolean756) {
			return true;
		} else if (arg3.length <= arg1) {
			return false;
		} else {
			this.anInt8889 = arg3[arg1];
			this.aClass2_Sub6_Sub14_1 = arg0.method6623(this.anInt8889 >> 16);
			this.anInt8889 &= 0xFFFF;
			if (this.aClass2_Sub6_Sub14_1 == null) {
				return false;
			}
			if (arg4.aBoolean701 && arg2 != -1 && arg3.length > arg2) {
				this.anInt8896 = arg3[arg2];
				this.aClass2_Sub6_Sub14_2 = arg0.method6623(this.anInt8896 >> 16);
				this.anInt8896 &= 0xFFFF;
			}
			if (arg4.aBoolean700) {
				this.anInt8891 |= 0x200;
			}
			if (this.aClass2_Sub6_Sub14_1.method6821(this.anInt8889)) {
				this.anInt8891 |= 0x80;
			}
			if (this.aClass2_Sub6_Sub14_1.method6816(this.anInt8889)) {
				this.anInt8891 |= 0x100;
			}
			if (this.aClass2_Sub6_Sub14_1.method6815(this.anInt8889)) {
				this.anInt8891 |= 0x400;
			}
			if (this.aClass2_Sub6_Sub14_2 != null) {
				if (this.aClass2_Sub6_Sub14_2.method6821(this.anInt8896)) {
					this.anInt8891 |= 0x80;
				}
				if (this.aClass2_Sub6_Sub14_2.method6816(this.anInt8896)) {
					this.anInt8891 |= 0x100;
				}
				if (this.aClass2_Sub6_Sub14_2.method6815(this.anInt8896)) {
					this.anInt8891 |= 0x400;
				}
			}
			this.aBoolean756 = true;
			this.anInt8891 |= 0x20;
			return true;
		}
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(B)V")
	public void method7861() {
		this.anInt8891 = 0;
		this.aClass2_Sub6_Sub14_1 = this.aClass2_Sub6_Sub14_2 = null;
		this.aBoolean756 = false;
	}
}
