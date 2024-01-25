import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class Class214 {

	@OriginalMember(owner = "client!tb", name = "k", descriptor = "I")
	public int anInt6103;

	@OriginalMember(owner = "client!tb", name = "o", descriptor = "Lclient!kh;")
	public Class126 aClass126_6;

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "I")
	public int anInt6098 = 16;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "I")
	public int anInt6096 = 8;

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "Z")
	public boolean aBoolean448 = true;

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "I")
	public int anInt6097 = 1190717;

	@OriginalMember(owner = "client!tb", name = "i", descriptor = "Z")
	public boolean aBoolean449 = true;

	@OriginalMember(owner = "client!tb", name = "l", descriptor = "I")
	public int anInt6104 = -1;

	@OriginalMember(owner = "client!tb", name = "g", descriptor = "I")
	public int anInt6101 = 128;

	@OriginalMember(owner = "client!tb", name = "q", descriptor = "I")
	public int anInt6108 = -1;

	@OriginalMember(owner = "client!tb", name = "n", descriptor = "I")
	public int anInt6106 = 0;

	@OriginalMember(owner = "client!tb", name = "u", descriptor = "I")
	public int anInt6111 = 127;

	@OriginalMember(owner = "client!tb", name = "e", descriptor = "I")
	public int anInt6099 = -1;

	@OriginalMember(owner = "client!tb", name = "t", descriptor = "Z")
	public boolean aBoolean450 = false;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!vt;II)V")
	private void method5340(@OriginalArg(0) Class2_Sub24 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt6106 = Static169.method5039(arg0.method5736());
		} else if (arg1 == 2) {
			this.anInt6099 = arg0.method5732();
		} else if (arg1 == 3) {
			this.anInt6099 = arg0.method5753();
			if (this.anInt6099 == 65535) {
				this.anInt6099 = -1;
			}
		} else if (arg1 == 5) {
			this.aBoolean449 = false;
		} else if (arg1 == 7) {
			this.anInt6104 = Static169.method5039(arg0.method5736());
		} else if (arg1 == 8) {
			this.aClass126_6.anInt3766 = this.anInt6103;
		} else if (arg1 == 9) {
			this.anInt6101 = arg0.method5753();
		} else if (arg1 == 10) {
			this.aBoolean448 = false;
		} else if (arg1 == 11) {
			this.anInt6096 = arg0.method5732();
		} else if (arg1 == 12) {
			this.aBoolean450 = true;
		} else if (arg1 == 13) {
			this.anInt6097 = arg0.method5736();
		} else if (arg1 == 14) {
			this.anInt6098 = arg0.method5732();
		} else if (arg1 == 15) {
			this.anInt6108 = arg0.method5753();
			if (this.anInt6108 == 65535) {
				this.anInt6108 = -1;
			}
		} else if (arg1 == 16) {
			this.anInt6111 = arg0.method5732();
		}
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)V")
	public void method5341() {
		if (this.anInt6108 == -1) {
			this.anInt6108 = this.anInt6099;
		}
		this.anInt6096 = this.anInt6103 | this.anInt6096 << 8;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZLclient!vt;)V")
	public void method5342(@OriginalArg(1) Class2_Sub24 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method5732();
			if (local13 == 0) {
				return;
			}
			this.method5340(arg0, local13);
		}
	}
}
