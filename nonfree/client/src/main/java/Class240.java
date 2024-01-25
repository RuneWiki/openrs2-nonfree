import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qba")
public final class Class240 {

	@OriginalMember(owner = "client!qba", name = "k", descriptor = "Lclient!pp;")
	public Class233 aClass233_6;

	@OriginalMember(owner = "client!qba", name = "r", descriptor = "I")
	public int anInt7143;

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "Z")
	public boolean aBoolean472 = false;

	@OriginalMember(owner = "client!qba", name = "b", descriptor = "I")
	public int anInt7131 = 1190717;

	@OriginalMember(owner = "client!qba", name = "d", descriptor = "Z")
	public boolean aBoolean474 = true;

	@OriginalMember(owner = "client!qba", name = "i", descriptor = "I")
	public int anInt7135 = 127;

	@OriginalMember(owner = "client!qba", name = "g", descriptor = "I")
	public int anInt7134 = 64;

	@OriginalMember(owner = "client!qba", name = "c", descriptor = "Z")
	public boolean aBoolean473 = true;

	@OriginalMember(owner = "client!qba", name = "p", descriptor = "I")
	public int anInt7141 = 0;

	@OriginalMember(owner = "client!qba", name = "l", descriptor = "I")
	public int anInt7137 = -1;

	@OriginalMember(owner = "client!qba", name = "j", descriptor = "I")
	public int anInt7136 = -1;

	@OriginalMember(owner = "client!qba", name = "q", descriptor = "I")
	public int anInt7142 = -1;

	@OriginalMember(owner = "client!qba", name = "m", descriptor = "I")
	public int anInt7138 = 8;

	@OriginalMember(owner = "client!qba", name = "t", descriptor = "I")
	public int anInt7145 = 512;

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(B)V")
	public void method5962() {
		this.anInt7138 = this.anInt7138 << 8 | this.anInt7143;
		if (this.anInt7136 == -1) {
			this.anInt7136 = this.anInt7137;
		}
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(ILclient!rt;)V")
	public void method5963(@OriginalArg(1) Class3_Sub27 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method7548();
			if (local15 == 0) {
				return;
			}
			this.method5964(local15, arg0);
		}
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(BILclient!rt;)V")
	private void method5964(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub27 arg1) {
		if (arg0 == 1) {
			this.anInt7141 = Static422.method7128(arg1.method7551());
		} else if (arg0 == 2) {
			this.anInt7137 = arg1.method7548();
		} else if (arg0 == 3) {
			this.anInt7137 = arg1.method7591();
			if (this.anInt7137 == 65535) {
				this.anInt7137 = -1;
			}
		} else if (arg0 == 5) {
			this.aBoolean473 = false;
		} else if (arg0 == 7) {
			this.anInt7142 = Static422.method7128(arg1.method7551());
		} else if (arg0 == 8) {
			this.aClass233_6.anInt7080 = this.anInt7143;
		} else if (arg0 == 9) {
			this.anInt7145 = arg1.method7591() << 2;
		} else if (arg0 == 10) {
			this.aBoolean474 = false;
		} else if (arg0 == 11) {
			this.anInt7138 = arg1.method7548();
		} else if (arg0 == 12) {
			this.aBoolean472 = true;
		} else if (arg0 == 13) {
			this.anInt7131 = arg1.method7551();
		} else if (arg0 == 14) {
			this.anInt7134 = arg1.method7548() << 2;
		} else if (arg0 == 15) {
			this.anInt7136 = arg1.method7591();
			if (this.anInt7136 == 65535) {
				this.anInt7136 = -1;
			}
		} else if (arg0 == 16) {
			this.anInt7135 = arg1.method7548();
		}
	}
}
