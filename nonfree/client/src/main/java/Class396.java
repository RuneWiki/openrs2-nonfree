import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wca")
public final class Class396 {

	@OriginalMember(owner = "client!wca", name = "b", descriptor = "I")
	public int anInt10992;

	@OriginalMember(owner = "client!wca", name = "h", descriptor = "I")
	public int anInt10993;

	@OriginalMember(owner = "client!wca", name = "i", descriptor = "Lclient!pha;")
	public Class3_Sub4_Sub15 aClass3_Sub4_Sub15_1;

	@OriginalMember(owner = "client!wca", name = "m", descriptor = "I")
	public int anInt10996;

	@OriginalMember(owner = "client!wca", name = "j", descriptor = "Lclient!pha;")
	public Class3_Sub4_Sub15 aClass3_Sub4_Sub15_2;

	@OriginalMember(owner = "client!wca", name = "k", descriptor = "Z")
	public boolean aBoolean792 = false;

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(B)V")
	public void method9178() {
		this.aBoolean792 = false;
		this.anInt10992 = 0;
		this.aClass3_Sub4_Sub15_1 = this.aClass3_Sub4_Sub15_2 = null;
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "([IZILclient!io;ILclient!bg;)Z")
	public boolean method9181(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class177 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class26 arg4) {
		if (this.aBoolean792) {
			return true;
		} else if (arg0.length <= arg3) {
			return false;
		} else {
			this.anInt10996 = arg0[arg3];
			this.aClass3_Sub4_Sub15_1 = arg2.method4265(this.anInt10996 >> 16);
			this.anInt10996 &= 0xFFFF;
			if (this.aClass3_Sub4_Sub15_1 == null) {
				return false;
			}
			if (arg4.aBoolean60 && arg1 != -1 && arg0.length > arg1) {
				this.anInt10993 = arg0[arg1];
				this.aClass3_Sub4_Sub15_2 = arg2.method4265(this.anInt10993 >> 16);
				this.anInt10993 &= 0xFFFF;
			}
			if (arg4.aBoolean61) {
				this.anInt10992 |= 0x200;
			}
			if (this.aClass3_Sub4_Sub15_1.method7088(this.anInt10996)) {
				this.anInt10992 |= 0x80;
			}
			if (this.aClass3_Sub4_Sub15_1.method7092(this.anInt10996)) {
				this.anInt10992 |= 0x100;
			}
			if (this.aClass3_Sub4_Sub15_1.method7094(this.anInt10996)) {
				this.anInt10992 |= 0x400;
			}
			if (this.aClass3_Sub4_Sub15_2 != null) {
				if (this.aClass3_Sub4_Sub15_2.method7088(this.anInt10993)) {
					this.anInt10992 |= 0x80;
				}
				if (this.aClass3_Sub4_Sub15_2.method7092(this.anInt10993)) {
					this.anInt10992 |= 0x100;
				}
				if (this.aClass3_Sub4_Sub15_2.method7094(this.anInt10993)) {
					this.anInt10992 |= 0x400;
				}
			}
			this.anInt10992 |= 0x20;
			this.aBoolean792 = true;
			return true;
		}
	}
}
