import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public final class Class79 {

	@OriginalMember(owner = "client!dn", name = "e", descriptor = "I")
	public int anInt2464;

	@OriginalMember(owner = "client!dn", name = "l", descriptor = "I")
	public int anInt2465;

	@OriginalMember(owner = "client!dn", name = "c", descriptor = "Lclient!dp;")
	public Class3_Sub7_Sub6 aClass3_Sub7_Sub6_1;

	@OriginalMember(owner = "client!dn", name = "k", descriptor = "I")
	public int anInt2469;

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "Lclient!dp;")
	public Class3_Sub7_Sub6 aClass3_Sub7_Sub6_2;

	@OriginalMember(owner = "client!dn", name = "f", descriptor = "Z")
	public boolean aBoolean162 = false;

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "(I)V")
	public void method2257() {
		this.anInt2464 = 0;
		this.aClass3_Sub7_Sub6_1 = this.aClass3_Sub7_Sub6_2 = null;
		this.aBoolean162 = false;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lclient!hba;[ILclient!hf;IBI)Z")
	public boolean method2260(@OriginalArg(0) Class149 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class155 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (this.aBoolean162) {
			return true;
		} else if (arg3 >= arg1.length) {
			return false;
		} else {
			this.anInt2465 = arg1[arg3];
			this.aClass3_Sub7_Sub6_1 = arg2.method3429(this.anInt2465 >> 16);
			this.anInt2465 &= 0xFFFF;
			if (this.aClass3_Sub7_Sub6_1 == null) {
				return false;
			}
			if (arg0.aBoolean232 && arg4 != -1 && arg4 < arg1.length) {
				this.anInt2469 = arg1[arg4];
				this.aClass3_Sub7_Sub6_2 = arg2.method3429(this.anInt2469 >> 16);
				this.anInt2469 &= 0xFFFF;
			}
			if (arg0.aBoolean230) {
				this.anInt2464 |= 0x200;
			}
			if (this.aClass3_Sub7_Sub6_1.method2275(this.anInt2465)) {
				this.anInt2464 |= 0x80;
			}
			if (this.aClass3_Sub7_Sub6_1.method2271(this.anInt2465)) {
				this.anInt2464 |= 0x100;
			}
			if (this.aClass3_Sub7_Sub6_1.method2272(this.anInt2465)) {
				this.anInt2464 |= 0x400;
			}
			if (this.aClass3_Sub7_Sub6_2 != null) {
				if (this.aClass3_Sub7_Sub6_2.method2275(this.anInt2469)) {
					this.anInt2464 |= 0x80;
				}
				if (this.aClass3_Sub7_Sub6_2.method2271(this.anInt2469)) {
					this.anInt2464 |= 0x100;
				}
				if (this.aClass3_Sub7_Sub6_2.method2272(this.anInt2469)) {
					this.anInt2464 |= 0x400;
				}
			}
			this.anInt2464 |= 0x20;
			this.aBoolean162 = true;
			return true;
		}
	}
}
