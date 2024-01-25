import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public final class Class46 {

	@OriginalMember(owner = "client!ce", name = "o", descriptor = "I")
	public int anInt1141;

	@OriginalMember(owner = "client!ce", name = "t", descriptor = "Lclient!gu;")
	public Class140 aClass140_1;

	@OriginalMember(owner = "client!ce", name = "h", descriptor = "I")
	public int anInt1143 = 64;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
	public int anInt1139 = 127;

	@OriginalMember(owner = "client!ce", name = "q", descriptor = "Z")
	public boolean aBoolean92 = true;

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
	public int anInt1144 = 8;

	@OriginalMember(owner = "client!ce", name = "l", descriptor = "Z")
	public boolean aBoolean93 = true;

	@OriginalMember(owner = "client!ce", name = "n", descriptor = "I")
	public int anInt1140 = 1190717;

	@OriginalMember(owner = "client!ce", name = "k", descriptor = "I")
	public int anInt1148 = -1;

	@OriginalMember(owner = "client!ce", name = "s", descriptor = "I")
	public int anInt1145 = 512;

	@OriginalMember(owner = "client!ce", name = "i", descriptor = "Z")
	public boolean aBoolean95 = false;

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
	public int anInt1150 = 0;

	@OriginalMember(owner = "client!ce", name = "f", descriptor = "I")
	public int anInt1147 = -1;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILclient!rba;I)V")
	private void method936(@OriginalArg(1) Class3_Sub28 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt1150 = Static277.method4235(arg0.method5307());
		} else if (arg1 == 2) {
			this.anInt1147 = arg0.method5322(-93);
		} else if (arg1 == 3) {
			this.anInt1147 = arg0.method5272();
			if (this.anInt1147 == 65535) {
				this.anInt1147 = -1;
			}
		} else if (arg1 == 5) {
			this.aBoolean92 = false;
		} else if (arg1 == 7) {
			this.anInt1148 = Static277.method4235(arg0.method5307());
		} else if (arg1 == 8) {
			this.aClass140_1.anInt4287 = this.anInt1141;
		} else if (arg1 == 9) {
			this.anInt1145 = arg0.method5272() << 2;
		} else if (arg1 == 10) {
			this.aBoolean93 = false;
		} else if (arg1 == 11) {
			this.anInt1144 = arg0.method5322(-95);
		} else if (arg1 == 12) {
			this.aBoolean95 = true;
		} else if (arg1 == 13) {
			this.anInt1140 = arg0.method5307();
		} else if (arg1 == 14) {
			this.anInt1143 = arg0.method5322(-86) << 2;
		} else if (arg1 == 16) {
			this.anInt1139 = arg0.method5322(-53);
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V")
	public void method937() {
		this.anInt1144 = this.anInt1144 << 8 | this.anInt1141;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(BLclient!rba;)V")
	public void method938(@OriginalArg(1) Class3_Sub28 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method5322(-94);
			if (local14 == 0) {
				return;
			}
			this.method936(arg0, local14);
		}
	}
}
