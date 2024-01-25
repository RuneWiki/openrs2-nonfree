import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public final class Class318 {

	@OriginalMember(owner = "client!rm", name = "l", descriptor = "I")
	public int anInt9147;

	@OriginalMember(owner = "client!rm", name = "h", descriptor = "Lclient!rh;")
	public Class14_Sub2_Sub15 aClass14_Sub2_Sub15_1;

	@OriginalMember(owner = "client!rm", name = "b", descriptor = "I")
	public int anInt9150;

	@OriginalMember(owner = "client!rm", name = "j", descriptor = "I")
	public int anInt9151;

	@OriginalMember(owner = "client!rm", name = "c", descriptor = "Lclient!rh;")
	public Class14_Sub2_Sub15 aClass14_Sub2_Sub15_2;

	@OriginalMember(owner = "client!rm", name = "g", descriptor = "Z")
	public boolean aBoolean632 = false;

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(II[IILclient!kja;Lclient!nw;)Z")
	public boolean method7885(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) Class204 arg3, @OriginalArg(5) Class259 arg4) {
		if (this.aBoolean632) {
			return true;
		} else if (arg2.length <= arg0) {
			return false;
		} else {
			this.anInt9151 = arg2[arg0];
			this.aClass14_Sub2_Sub15_1 = arg3.method5043(this.anInt9151 >> 16);
			this.anInt9151 &= 0xFFFF;
			if (this.aClass14_Sub2_Sub15_1 == null) {
				return false;
			}
			if (arg4.aBoolean503 && arg1 != -1 && arg1 < arg2.length) {
				this.anInt9150 = arg2[arg1];
				this.aClass14_Sub2_Sub15_2 = arg3.method5043(this.anInt9150 >> 16);
				this.anInt9150 &= 0xFFFF;
			}
			if (arg4.aBoolean504) {
				this.anInt9147 |= 0x200;
			}
			if (this.aClass14_Sub2_Sub15_1.method7830(this.anInt9151)) {
				this.anInt9147 |= 0x80;
			}
			if (this.aClass14_Sub2_Sub15_1.method7829(this.anInt9151)) {
				this.anInt9147 |= 0x100;
			}
			if (this.aClass14_Sub2_Sub15_1.method7833(this.anInt9151)) {
				this.anInt9147 |= 0x400;
			}
			if (this.aClass14_Sub2_Sub15_2 != null) {
				if (this.aClass14_Sub2_Sub15_2.method7830(this.anInt9150)) {
					this.anInt9147 |= 0x80;
				}
				if (this.aClass14_Sub2_Sub15_2.method7829(this.anInt9150)) {
					this.anInt9147 |= 0x100;
				}
				if (this.aClass14_Sub2_Sub15_2.method7833(this.anInt9150)) {
					this.anInt9147 |= 0x400;
				}
			}
			this.anInt9147 |= 0x20;
			this.aBoolean632 = true;
			return true;
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(B)V")
	public void method7886() {
		this.aClass14_Sub2_Sub15_1 = this.aClass14_Sub2_Sub15_2 = null;
		this.anInt9147 = 0;
		this.aBoolean632 = false;
	}
}
