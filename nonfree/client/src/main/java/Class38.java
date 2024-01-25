import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bja")
public final class Class38 {

	@OriginalMember(owner = "client!bja", name = "g", descriptor = "I")
	public int anInt1018;

	@OriginalMember(owner = "client!bja", name = "q", descriptor = "Lclient!vk;")
	public Class375 aClass375_1;

	@OriginalMember(owner = "client!bja", name = "a", descriptor = "Z")
	public boolean aBoolean50 = true;

	@OriginalMember(owner = "client!bja", name = "c", descriptor = "I")
	public int anInt1014 = -1;

	@OriginalMember(owner = "client!bja", name = "j", descriptor = "I")
	public int anInt1021 = 0;

	@OriginalMember(owner = "client!bja", name = "l", descriptor = "Z")
	public boolean aBoolean52 = false;

	@OriginalMember(owner = "client!bja", name = "m", descriptor = "I")
	public int anInt1023 = -1;

	@OriginalMember(owner = "client!bja", name = "n", descriptor = "I")
	public int anInt1024 = 8;

	@OriginalMember(owner = "client!bja", name = "i", descriptor = "I")
	public int anInt1020 = 512;

	@OriginalMember(owner = "client!bja", name = "b", descriptor = "Z")
	public boolean aBoolean51 = true;

	@OriginalMember(owner = "client!bja", name = "k", descriptor = "I")
	public int anInt1022 = 1190717;

	@OriginalMember(owner = "client!bja", name = "o", descriptor = "I")
	public int anInt1025 = 127;

	@OriginalMember(owner = "client!bja", name = "r", descriptor = "I")
	public int anInt1027 = 64;

	@OriginalMember(owner = "client!bja", name = "a", descriptor = "(I)V")
	public void method960() {
		this.anInt1024 = this.anInt1018 | this.anInt1024 << 8;
	}

	@OriginalMember(owner = "client!bja", name = "a", descriptor = "(ZLclient!gga;)V")
	public void method961(@OriginalArg(1) Class6_Sub23 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method8374();
			if (local9 == 0) {
				return;
			}
			this.method962(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!bja", name = "a", descriptor = "(ILclient!gga;I)V")
	private void method962(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub23 arg1) {
		if (arg0 == 1) {
			this.anInt1021 = Static534.method7413(arg1.method8344());
		} else if (arg0 == 2) {
			this.anInt1014 = arg1.method8374();
		} else if (arg0 == 3) {
			this.anInt1014 = arg1.method8363();
			if (this.anInt1014 == 65535) {
				this.anInt1014 = -1;
			}
		} else if (arg0 == 5) {
			this.aBoolean50 = false;
		} else if (arg0 == 7) {
			this.anInt1023 = Static534.method7413(arg1.method8344());
		} else if (arg0 == 8) {
			this.aClass375_1.anInt10361 = this.anInt1018;
		} else if (arg0 == 9) {
			this.anInt1020 = arg1.method8363() << 2;
		} else if (arg0 == 10) {
			this.aBoolean51 = false;
		} else if (arg0 == 11) {
			this.anInt1024 = arg1.method8374();
		} else if (arg0 == 12) {
			this.aBoolean52 = true;
		} else if (arg0 == 13) {
			this.anInt1022 = arg1.method8344();
		} else if (arg0 == 14) {
			this.anInt1027 = arg1.method8374() << 2;
		} else if (arg0 == 16) {
			this.anInt1025 = arg1.method8374();
		}
	}
}
