import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pia")
public final class Class273 {

	@OriginalMember(owner = "client!pia", name = "g", descriptor = "I")
	public int anInt7211;

	@OriginalMember(owner = "client!pia", name = "i", descriptor = "Lclient!ls;")
	public Class216 aClass216_3;

	@OriginalMember(owner = "client!pia", name = "c", descriptor = "Z")
	public boolean aBoolean521 = false;

	@OriginalMember(owner = "client!pia", name = "e", descriptor = "Z")
	public boolean aBoolean522 = true;

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "I")
	public int anInt7207 = 512;

	@OriginalMember(owner = "client!pia", name = "h", descriptor = "I")
	public int anInt7212 = -1;

	@OriginalMember(owner = "client!pia", name = "d", descriptor = "I")
	public int anInt7209 = 0;

	@OriginalMember(owner = "client!pia", name = "q", descriptor = "I")
	public int anInt7220 = 127;

	@OriginalMember(owner = "client!pia", name = "k", descriptor = "I")
	public int anInt7214 = 64;

	@OriginalMember(owner = "client!pia", name = "u", descriptor = "Z")
	public boolean aBoolean523 = true;

	@OriginalMember(owner = "client!pia", name = "n", descriptor = "I")
	public int anInt7217 = 1190717;

	@OriginalMember(owner = "client!pia", name = "v", descriptor = "I")
	public int anInt7223 = -1;

	@OriginalMember(owner = "client!pia", name = "w", descriptor = "I")
	public int anInt7224 = 8;

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(Lclient!sl;Z)V")
	public void method6311(@OriginalArg(0) Class2_Sub17 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method2859();
			if (local7 == 0) {
				return;
			}
			this.method6313(arg0, local7);
		}
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(I)V")
	public void method6312() {
		this.anInt7224 = this.anInt7211 | this.anInt7224 << 8;
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(Lclient!sl;II)V")
	private void method6313(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt7209 = Static243.method6204(arg0.method2835());
		} else if (arg1 == 2) {
			this.anInt7223 = arg0.method2859();
		} else if (arg1 == 3) {
			this.anInt7223 = arg0.method2825();
			if (this.anInt7223 == 65535) {
				this.anInt7223 = -1;
			}
		} else if (arg1 == 5) {
			this.aBoolean523 = false;
		} else if (arg1 == 7) {
			this.anInt7212 = Static243.method6204(arg0.method2835());
		} else if (arg1 == 8) {
			this.aClass216_3.anInt5873 = this.anInt7211;
		} else if (arg1 == 9) {
			this.anInt7207 = arg0.method2825() << 2;
		} else if (arg1 == 10) {
			this.aBoolean522 = false;
		} else if (arg1 == 11) {
			this.anInt7224 = arg0.method2859();
		} else if (arg1 == 12) {
			this.aBoolean521 = true;
		} else if (arg1 == 13) {
			this.anInt7217 = arg0.method2835();
		} else if (arg1 == 14) {
			this.anInt7214 = arg0.method2859() << 2;
		} else if (arg1 == 16) {
			this.anInt7220 = arg0.method2859();
		}
	}
}
