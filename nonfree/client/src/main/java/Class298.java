import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ss")
public final class Class298 {

	@OriginalMember(owner = "client!ss", name = "i", descriptor = "Lclient!vb;")
	public Class327 aClass327_6;

	@OriginalMember(owner = "client!ss", name = "o", descriptor = "I")
	public int anInt8018;

	@OriginalMember(owner = "client!ss", name = "d", descriptor = "I")
	public int anInt8012 = -1;

	@OriginalMember(owner = "client!ss", name = "c", descriptor = "I")
	public int anInt8011 = 8;

	@OriginalMember(owner = "client!ss", name = "f", descriptor = "Z")
	public boolean aBoolean546 = true;

	@OriginalMember(owner = "client!ss", name = "e", descriptor = "I")
	public int anInt8013 = 64;

	@OriginalMember(owner = "client!ss", name = "h", descriptor = "I")
	public int anInt8014 = 0;

	@OriginalMember(owner = "client!ss", name = "m", descriptor = "I")
	public int anInt8017 = -1;

	@OriginalMember(owner = "client!ss", name = "b", descriptor = "I")
	public int anInt8010 = 127;

	@OriginalMember(owner = "client!ss", name = "g", descriptor = "Z")
	public boolean aBoolean547 = true;

	@OriginalMember(owner = "client!ss", name = "l", descriptor = "I")
	public int anInt8016 = -1;

	@OriginalMember(owner = "client!ss", name = "s", descriptor = "I")
	public int anInt8021 = 512;

	@OriginalMember(owner = "client!ss", name = "u", descriptor = "Z")
	public boolean aBoolean549 = false;

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "I")
	public int anInt8009 = 1190717;

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lclient!dga;BI)V")
	private void method6614(@OriginalArg(0) Class6_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt8014 = Static368.method5422(arg0.method5988());
		} else if (arg1 == 2) {
			this.anInt8016 = arg0.method6041();
		} else if (arg1 == 3) {
			this.anInt8016 = arg0.method6006();
			if (this.anInt8016 == 65535) {
				this.anInt8016 = -1;
			}
		} else if (arg1 == 5) {
			this.aBoolean546 = false;
		} else if (arg1 == 7) {
			this.anInt8012 = Static368.method5422(arg0.method5988());
		} else if (arg1 == 8) {
			this.aClass327_6.anInt9056 = this.anInt8018;
		} else if (arg1 == 9) {
			this.anInt8021 = arg0.method6006() << 2;
		} else if (arg1 == 10) {
			this.aBoolean547 = false;
		} else if (arg1 == 11) {
			this.anInt8011 = arg0.method6041();
		} else if (arg1 == 12) {
			this.aBoolean549 = true;
		} else if (arg1 == 13) {
			this.anInt8009 = arg0.method5988();
		} else if (arg1 == 14) {
			this.anInt8013 = arg0.method6041() << 2;
		} else if (arg1 == 15) {
			this.anInt8017 = arg0.method6006();
			if (this.anInt8017 == 65535) {
				this.anInt8017 = -1;
			}
		} else if (arg1 == 16) {
			this.anInt8010 = arg0.method6041();
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(BLclient!dga;)V")
	public void method6615(@OriginalArg(1) Class6_Sub14 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method6041();
			if (local5 == 0) {
				return;
			}
			this.method6614(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!ss", name = "b", descriptor = "(I)V")
	public void method6617() {
		this.anInt8011 = this.anInt8018 | this.anInt8011 << 8;
		if (this.anInt8017 == -1) {
			this.anInt8017 = this.anInt8016;
		}
	}
}
