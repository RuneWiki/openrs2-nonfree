import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public final class Class187 {

	@OriginalMember(owner = "client!kb", name = "j", descriptor = "I")
	public int anInt5086;

	@OriginalMember(owner = "client!kb", name = "r", descriptor = "Lclient!rg;")
	public Class291 aClass291_3;

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "I")
	public int anInt5080 = 512;

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "I")
	public int anInt5079 = -1;

	@OriginalMember(owner = "client!kb", name = "g", descriptor = "I")
	public int anInt5083 = 64;

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "I")
	public int anInt5081 = 127;

	@OriginalMember(owner = "client!kb", name = "i", descriptor = "I")
	public int anInt5085 = 1190717;

	@OriginalMember(owner = "client!kb", name = "k", descriptor = "I")
	public int anInt5087 = -1;

	@OriginalMember(owner = "client!kb", name = "l", descriptor = "Z")
	public boolean aBoolean381 = false;

	@OriginalMember(owner = "client!kb", name = "q", descriptor = "Z")
	public boolean aBoolean383 = true;

	@OriginalMember(owner = "client!kb", name = "n", descriptor = "I")
	public int anInt5089 = 8;

	@OriginalMember(owner = "client!kb", name = "p", descriptor = "Z")
	public boolean aBoolean382 = true;

	@OriginalMember(owner = "client!kb", name = "o", descriptor = "I")
	public int anInt5090 = -1;

	@OriginalMember(owner = "client!kb", name = "m", descriptor = "I")
	public int anInt5088 = 0;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!eh;I)V")
	public void method4304(@OriginalArg(0) Class4_Sub9 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method6015();
			if (local5 == 0) {
				return;
			}
			this.method4309(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)V")
	public void method4307() {
		this.anInt5089 = this.anInt5089 << 8 | this.anInt5086;
		if (this.anInt5087 == -1) {
			this.anInt5087 = this.anInt5090;
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!eh;II)V")
	private void method4309(@OriginalArg(0) Class4_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt5088 = Static12.method273(arg0.method6023());
		} else if (arg1 == 2) {
			this.anInt5090 = arg0.method6015();
		} else if (arg1 == 3) {
			this.anInt5090 = arg0.method5982();
			if (this.anInt5090 == 65535) {
				this.anInt5090 = -1;
				return;
			}
		} else if (arg1 == 5) {
			this.aBoolean383 = false;
		} else if (arg1 == 7) {
			this.anInt5079 = Static12.method273(arg0.method6023());
			return;
		} else if (arg1 == 8) {
			this.aClass291_3.anInt7780 = this.anInt5086;
			return;
		} else if (arg1 == 9) {
			this.anInt5080 = arg0.method5982() << 2;
			return;
		} else if (arg1 == 10) {
			this.aBoolean382 = false;
			return;
		} else if (arg1 == 11) {
			this.anInt5089 = arg0.method6015();
			return;
		} else if (arg1 == 12) {
			this.aBoolean381 = true;
			return;
		} else if (arg1 == 13) {
			this.anInt5085 = arg0.method6023();
			return;
		} else {
			if (arg1 == 14) {
				this.anInt5083 = arg0.method6015() << 2;
			} else if (arg1 == 15) {
				this.anInt5087 = arg0.method5982();
				if (this.anInt5087 == 65535) {
					this.anInt5087 = -1;
					return;
				}
				return;
			} else if (arg1 == 16) {
				this.anInt5081 = arg0.method6015();
				return;
			}
			return;
		}
	}
}
