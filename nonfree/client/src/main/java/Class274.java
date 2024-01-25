import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qm")
public final class Class274 {

	@OriginalMember(owner = "client!qm", name = "f", descriptor = "Lclient!kg;")
	public Class189 aClass189_7;

	@OriginalMember(owner = "client!qm", name = "i", descriptor = "I")
	public int anInt8103;

	@OriginalMember(owner = "client!qm", name = "e", descriptor = "I")
	public int anInt8101 = 0;

	@OriginalMember(owner = "client!qm", name = "g", descriptor = "Z")
	public boolean aBoolean560 = true;

	@OriginalMember(owner = "client!qm", name = "h", descriptor = "I")
	public int anInt8102 = 1190717;

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "I")
	public int anInt8098 = 64;

	@OriginalMember(owner = "client!qm", name = "l", descriptor = "I")
	public int anInt8106 = -1;

	@OriginalMember(owner = "client!qm", name = "m", descriptor = "Z")
	public boolean aBoolean561 = false;

	@OriginalMember(owner = "client!qm", name = "p", descriptor = "I")
	public int anInt8108 = 8;

	@OriginalMember(owner = "client!qm", name = "n", descriptor = "Z")
	public boolean aBoolean562 = true;

	@OriginalMember(owner = "client!qm", name = "q", descriptor = "I")
	public int anInt8109 = -1;

	@OriginalMember(owner = "client!qm", name = "r", descriptor = "I")
	public int anInt8110 = 127;

	@OriginalMember(owner = "client!qm", name = "s", descriptor = "I")
	public int anInt8111 = 512;

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)V")
	public void method6744() {
		this.anInt8108 = this.anInt8108 << 8 | this.anInt8103;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lclient!un;I)V")
	public void method6746(@OriginalArg(0) Class4_Sub11 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method4905();
			if (local12 == 0) {
				return;
			}
			this.method6747(local12, arg0);
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IILclient!un;)V")
	private void method6747(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 1) {
			this.anInt8101 = Static394.method6252(arg1.method4934());
		} else if (arg0 == 2) {
			this.anInt8106 = arg1.method4905();
		} else if (arg0 == 3) {
			this.anInt8106 = arg1.method4936();
			if (this.anInt8106 == 65535) {
				this.anInt8106 = -1;
			}
		} else if (arg0 == 5) {
			this.aBoolean562 = false;
		} else if (arg0 == 7) {
			this.anInt8109 = Static394.method6252(arg1.method4934());
		} else if (arg0 == 8) {
			this.aClass189_7.anInt5265 = this.anInt8103;
		} else if (arg0 == 9) {
			this.anInt8111 = arg1.method4936() << 2;
		} else if (arg0 == 10) {
			this.aBoolean560 = false;
		} else if (arg0 == 11) {
			this.anInt8108 = arg1.method4905();
		} else if (arg0 == 12) {
			this.aBoolean561 = true;
		} else if (arg0 == 13) {
			this.anInt8102 = arg1.method4934();
		} else if (arg0 == 14) {
			this.anInt8098 = arg1.method4905() << 2;
		} else if (arg0 == 16) {
			this.anInt8110 = arg1.method4905();
		}
	}
}
