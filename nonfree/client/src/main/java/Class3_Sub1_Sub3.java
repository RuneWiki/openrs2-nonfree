import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public final class Class3_Sub1_Sub3 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ce", name = "K", descriptor = "I")
	public int anInt360;

	@OriginalMember(owner = "client!ce", name = "Q", descriptor = "I")
	private int anInt363;

	@OriginalMember(owner = "client!ce", name = "J", descriptor = "I")
	public int anInt359 = -1;

	@OriginalMember(owner = "client!ce", name = "S", descriptor = "I")
	private int anInt365 = 0;

	@OriginalMember(owner = "client!ce", name = "V", descriptor = "I")
	private int anInt367 = 128;

	@OriginalMember(owner = "client!ce", name = "bb", descriptor = "[S")
	private final short[] aShortArray7 = new short[6];

	@OriginalMember(owner = "client!ce", name = "Z", descriptor = "[S")
	private final short[] aShortArray6 = new short[6];

	@OriginalMember(owner = "client!ce", name = "W", descriptor = "I")
	private int anInt368 = 0;

	@OriginalMember(owner = "client!ce", name = "eb", descriptor = "I")
	private int anInt372 = 0;

	@OriginalMember(owner = "client!ce", name = "jb", descriptor = "I")
	private int anInt375 = 128;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lclient!ob;I)V")
	public void method238(@OriginalArg(0) Class3_Sub7 arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.method647();
			if (local10 == 0) {
				return;
			}
			this.method241(arg0, local10);
		}
	}

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "(II)Lclient!ua;")
	public Class3_Sub1_Sub4_Sub7 method239(@OriginalArg(0) int arg0) {
		@Pc(13) Class3_Sub1_Sub4_Sub7 local13 = (Class3_Sub1_Sub4_Sub7) Static35.aClass75_31.method1728((long) this.anInt360);
		if (local13 == null) {
			@Pc(21) Class3_Sub1_Sub4_Sub5 local21 = Static67.method1155(Static77.aClass62_13, this.anInt363);
			if (local21 == null) {
				return null;
			}
			for (@Pc(27) int local27 = 0; local27 < 6; local27++) {
				if (this.aShortArray7[0] != 0) {
					local21.method1172(this.aShortArray7[local27], this.aShortArray6[local27]);
				}
			}
			local13 = local21.method1156(this.anInt368 + 64, this.anInt372 + 850, -30, -50, -30);
			Static35.aClass75_31.method1730(local13, (long) this.anInt360);
		}
		@Pc(92) Class3_Sub1_Sub4_Sub7 local92;
		if (this.anInt359 == -1 || arg0 == -1) {
			local92 = local13.method1776(true);
		} else {
			local92 = Static97.method1629(this.anInt359).method1554(arg0, local13);
		}
		if (this.anInt367 != 128 || this.anInt375 != 128) {
			local92.method1777(this.anInt367, this.anInt375, this.anInt367);
		}
		if (this.anInt365 != 0) {
			if (this.anInt365 == 90) {
				local92.method1769();
			}
			if (this.anInt365 == 180) {
				local92.method1769();
				local92.method1769();
			}
			if (this.anInt365 == 270) {
				local92.method1769();
				local92.method1769();
				local92.method1769();
			}
		}
		return local92;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILclient!ob;I)V")
	private void method241(@OriginalArg(1) Class3_Sub7 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt363 = arg0.method602();
		} else if (arg1 == 2) {
			this.anInt359 = arg0.method602();
		} else if (arg1 == 4) {
			this.anInt367 = arg0.method602();
		} else if (arg1 == 5) {
			this.anInt375 = arg0.method602();
		} else if (arg1 == 6) {
			this.anInt365 = arg0.method602();
		} else if (arg1 == 7) {
			this.anInt368 = arg0.method647();
		} else if (arg1 == 8) {
			this.anInt372 = arg0.method647();
		} else if (arg1 >= 40 && arg1 < 50) {
			this.aShortArray7[arg1 - 40] = (short) arg0.method602();
		} else if (arg1 >= 50 && arg1 < 60) {
			this.aShortArray6[arg1 - 50] = (short) arg0.method602();
		}
	}
}
