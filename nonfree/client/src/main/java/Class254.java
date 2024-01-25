import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vp")
public final class Class254 {

	@OriginalMember(owner = "client!vp", name = "b", descriptor = "I")
	public int anInt7606;

	@OriginalMember(owner = "client!vp", name = "h", descriptor = "Lclient!vo;")
	public Class253 aClass253_6;

	@OriginalMember(owner = "client!vp", name = "e", descriptor = "I")
	public int anInt7609 = 127;

	@OriginalMember(owner = "client!vp", name = "g", descriptor = "I")
	public int anInt7611 = -1;

	@OriginalMember(owner = "client!vp", name = "m", descriptor = "Z")
	public boolean aBoolean478 = true;

	@OriginalMember(owner = "client!vp", name = "n", descriptor = "I")
	public int anInt7615 = 8;

	@OriginalMember(owner = "client!vp", name = "o", descriptor = "Z")
	public boolean aBoolean479 = false;

	@OriginalMember(owner = "client!vp", name = "j", descriptor = "I")
	public int anInt7613 = 128;

	@OriginalMember(owner = "client!vp", name = "q", descriptor = "I")
	public int anInt7617 = 1190717;

	@OriginalMember(owner = "client!vp", name = "l", descriptor = "I")
	public int anInt7614 = 16;

	@OriginalMember(owner = "client!vp", name = "t", descriptor = "I")
	public int anInt7619 = -1;

	@OriginalMember(owner = "client!vp", name = "c", descriptor = "I")
	public int anInt7607 = 0;

	@OriginalMember(owner = "client!vp", name = "v", descriptor = "I")
	public int anInt7620 = -1;

	@OriginalMember(owner = "client!vp", name = "u", descriptor = "Z")
	public boolean aBoolean480 = true;

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(ILclient!ae;I)V")
	private void method6234(@OriginalArg(1) Class6_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt7607 = Static17.method490(arg0.method6435());
		} else if (arg1 == 2) {
			this.anInt7611 = arg0.method6433();
		} else if (arg1 == 3) {
			this.anInt7611 = arg0.method6485();
			if (this.anInt7611 == 65535) {
				this.anInt7611 = -1;
			}
		} else if (arg1 == 5) {
			this.aBoolean480 = false;
		} else if (arg1 == 7) {
			this.anInt7619 = Static17.method490(arg0.method6435());
		} else if (arg1 == 8) {
			this.aClass253_6.anInt7604 = this.anInt7606;
		} else if (arg1 == 9) {
			this.anInt7613 = arg0.method6485() << 0;
		} else if (arg1 == 10) {
			this.aBoolean478 = false;
		} else if (arg1 == 11) {
			this.anInt7615 = arg0.method6433();
		} else if (arg1 == 12) {
			this.aBoolean479 = true;
		} else if (arg1 == 13) {
			this.anInt7617 = arg0.method6435();
		} else if (arg1 == 14) {
			this.anInt7614 = arg0.method6433();
		} else if (arg1 == 15) {
			this.anInt7620 = arg0.method6485();
			if (this.anInt7620 == 65535) {
				this.anInt7620 = -1;
			}
		} else if (arg1 == 16) {
			this.anInt7609 = arg0.method6433();
		}
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(ILclient!ae;)V")
	public void method6237(@OriginalArg(1) Class6_Sub1 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method6433();
			if (local5 == 0) {
				return;
			}
			this.method6234(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!vp", name = "b", descriptor = "(I)V")
	public void method6238() {
		if (this.anInt7620 == -1) {
			this.anInt7620 = this.anInt7611;
		}
		this.anInt7615 = this.anInt7615 << 8 | this.anInt7606;
	}
}
