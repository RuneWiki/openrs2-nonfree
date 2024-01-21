import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class5_Sub2_Sub15 extends Class5_Sub2 {

	@OriginalMember(owner = "client!ua", name = "W", descriptor = "I")
	private int anInt2861;

	@OriginalMember(owner = "client!ua", name = "eb", descriptor = "I")
	public int anInt2867;

	@OriginalMember(owner = "client!ua", name = "Y", descriptor = "[S")
	private final short[] aShortArray11 = new short[6];

	@OriginalMember(owner = "client!ua", name = "T", descriptor = "I")
	private int anInt2859 = 0;

	@OriginalMember(owner = "client!ua", name = "fb", descriptor = "I")
	private int anInt2868 = 128;

	@OriginalMember(owner = "client!ua", name = "gb", descriptor = "I")
	public int anInt2869 = -1;

	@OriginalMember(owner = "client!ua", name = "cb", descriptor = "[S")
	private final short[] aShortArray12 = new short[6];

	@OriginalMember(owner = "client!ua", name = "nb", descriptor = "I")
	private int anInt2872 = 128;

	@OriginalMember(owner = "client!ua", name = "Z", descriptor = "I")
	private int anInt2863 = 0;

	@OriginalMember(owner = "client!ua", name = "db", descriptor = "I")
	private int anInt2866 = 0;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!hb;B)V")
	public void method1964(@OriginalArg(0) Class5_Sub9 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method1408();
			if (local17 == 0) {
				return;
			}
			this.method1966(local17, arg0);
		}
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(II)Lclient!dd;")
	public Class5_Sub2_Sub4_Sub2 method1965(@OriginalArg(1) int arg0) {
		@Pc(13) Class5_Sub2_Sub4_Sub2 local13 = (Class5_Sub2_Sub4_Sub2) Static17.aClass67_5.method1823((long) this.anInt2867);
		if (local13 == null) {
			@Pc(21) Class5_Sub2_Sub4_Sub7 local21 = Static83.method1570(Static105.aClass29_66, this.anInt2861);
			if (local21 == null) {
				return null;
			}
			for (@Pc(27) int local27 = 0; local27 < 6; local27++) {
				if (this.aShortArray11[0] != 0) {
					local21.method1575(this.aShortArray11[local27], this.aShortArray12[local27]);
				}
			}
			local13 = local21.method1579(this.anInt2859 + 64, 850 - -this.anInt2866, -30, -50, -30);
			Static17.aClass67_5.method1818(local13, (long) this.anInt2867);
		}
		@Pc(89) Class5_Sub2_Sub4_Sub2 local89;
		if (this.anInt2869 == -1 || arg0 == -1) {
			local89 = local13.method434(true);
		} else {
			local89 = Static63.method1252(this.anInt2869).method1158(local13, arg0);
		}
		if (this.anInt2872 != 128 || this.anInt2868 != 128) {
			local89.method435(this.anInt2872, this.anInt2868, this.anInt2872);
		}
		if (this.anInt2863 != 0) {
			if (this.anInt2863 == 90) {
				local89.method428();
			}
			if (this.anInt2863 == 180) {
				local89.method428();
				local89.method428();
			}
			if (this.anInt2863 == 270) {
				local89.method428();
				local89.method428();
				local89.method428();
			}
		}
		return local89;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILclient!hb;I)V")
	private void method1966(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub9 arg1) {
		if (arg0 == 1) {
			this.anInt2861 = arg1.method1418();
		} else if (arg0 == 2) {
			this.anInt2869 = arg1.method1418();
		} else if (arg0 == 4) {
			this.anInt2872 = arg1.method1418();
		} else if (arg0 == 5) {
			this.anInt2868 = arg1.method1418();
		} else if (arg0 == 6) {
			this.anInt2863 = arg1.method1418();
		} else if (arg0 == 7) {
			this.anInt2859 = arg1.method1408();
		} else if (arg0 == 8) {
			this.anInt2866 = arg1.method1408();
		} else if (arg0 >= 40 && arg0 < 50) {
			this.aShortArray11[arg0 - 40] = (short) arg1.method1418();
		} else if (arg0 >= 50 && arg0 < 60) {
			this.aShortArray12[arg0 - 50] = (short) arg1.method1418();
		}
	}
}
