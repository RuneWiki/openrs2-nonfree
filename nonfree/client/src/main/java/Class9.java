import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!GJKLDIZT")
public final class Class9 {

	@OriginalMember(owner = "client!GJKLDIZT", name = "c", descriptor = "I")
	private int anInt191;

	@OriginalMember(owner = "client!GJKLDIZT", name = "d", descriptor = "[I")
	private int[] anIntArray39;

	@OriginalMember(owner = "client!GJKLDIZT", name = "e", descriptor = "[I")
	private int[] anIntArray40;

	@OriginalMember(owner = "client!GJKLDIZT", name = "f", descriptor = "I")
	public int anInt192;

	@OriginalMember(owner = "client!GJKLDIZT", name = "g", descriptor = "I")
	public int anInt193;

	@OriginalMember(owner = "client!GJKLDIZT", name = "h", descriptor = "I")
	public int anInt194;

	@OriginalMember(owner = "client!GJKLDIZT", name = "i", descriptor = "I")
	private int anInt195;

	@OriginalMember(owner = "client!GJKLDIZT", name = "j", descriptor = "I")
	private int anInt196;

	@OriginalMember(owner = "client!GJKLDIZT", name = "k", descriptor = "I")
	private int anInt197;

	@OriginalMember(owner = "client!GJKLDIZT", name = "l", descriptor = "I")
	private int anInt198;

	@OriginalMember(owner = "client!GJKLDIZT", name = "m", descriptor = "I")
	private int anInt199;

	@OriginalMember(owner = "client!GJKLDIZT", name = "a", descriptor = "Z")
	private boolean aBoolean50 = true;

	@OriginalMember(owner = "client!GJKLDIZT", name = "b", descriptor = "Z")
	private boolean aBoolean51 = false;

	@OriginalMember(owner = "client!GJKLDIZT", name = "a", descriptor = "(Lclient!DNRIFKTO;I)V")
	public void method166(@OriginalArg(0) Class2_Sub1_Sub4 arg0) {
		try {
			this.anInt194 = arg0.method94();
			this.anInt192 = arg0.method99();
			this.anInt193 = arg0.method99();
			this.method167(arg0);
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("47254, " + arg0 + ", " + -25 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GJKLDIZT", name = "a", descriptor = "(BLclient!DNRIFKTO;)V")
	public void method167(@OriginalArg(1) Class2_Sub1_Sub4 arg0) {
		try {
			this.anInt191 = arg0.method94();
			this.anIntArray39 = new int[this.anInt191];
			this.anIntArray40 = new int[this.anInt191];
			for (@Pc(26) int local26 = 0; local26 < this.anInt191; local26++) {
				this.anIntArray39[local26] = arg0.method96();
				this.anIntArray40[local26] = arg0.method96();
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("79173, " + -76 + ", " + arg0 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GJKLDIZT", name = "a", descriptor = "(B)V")
	public void method168(@OriginalArg(0) byte arg0) {
		try {
			@Pc(4) boolean local4 = false;
			this.anInt195 = 0;
			this.anInt196 = 0;
			this.anInt197 = 0;
			this.anInt198 = 0;
			this.anInt199 = 0;
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("23788, " + arg0 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GJKLDIZT", name = "a", descriptor = "(IB)I")
	public int method169(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt199 >= this.anInt195) {
				this.anInt198 = this.anIntArray40[this.anInt196++] << 15;
				if (this.anInt196 >= this.anInt191) {
					this.anInt196 = this.anInt191 - 1;
				}
				this.anInt195 = (int) ((double) this.anIntArray39[this.anInt196] / 65536.0D * (double) arg0);
				if (this.anInt195 > this.anInt199) {
					this.anInt197 = ((this.anIntArray40[this.anInt196] << 15) - this.anInt198) / (this.anInt195 - this.anInt199);
				}
			}
			this.anInt198 += this.anInt197;
			this.anInt199++;
			return this.anInt198 - this.anInt197 >> 15;
		} catch (@Pc(99) RuntimeException local99) {
			signlink.reporterror("65321, " + arg0 + ", " + 8 + ", " + local99.toString());
			throw new RuntimeException();
		}
	}
}
