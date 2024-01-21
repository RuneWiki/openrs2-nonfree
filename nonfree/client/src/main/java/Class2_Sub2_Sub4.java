import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cd")
public final class Class2_Sub2_Sub4 extends Class2_Sub2 {

	@OriginalMember(owner = "client!cd", name = "pb", descriptor = "I")
	private int anInt409;

	@OriginalMember(owner = "client!cd", name = "tb", descriptor = "I")
	public int anInt412;

	@OriginalMember(owner = "client!cd", name = "cb", descriptor = "[S")
	private final short[] aShortArray1 = new short[6];

	@OriginalMember(owner = "client!cd", name = "kb", descriptor = "I")
	private int anInt404 = 0;

	@OriginalMember(owner = "client!cd", name = "ib", descriptor = "I")
	private int anInt402 = 0;

	@OriginalMember(owner = "client!cd", name = "ob", descriptor = "I")
	private int anInt408 = 0;

	@OriginalMember(owner = "client!cd", name = "gb", descriptor = "[S")
	private final short[] aShortArray2 = new short[6];

	@OriginalMember(owner = "client!cd", name = "bb", descriptor = "I")
	private int anInt399 = 128;

	@OriginalMember(owner = "client!cd", name = "vb", descriptor = "I")
	private int anInt414 = 128;

	@OriginalMember(owner = "client!cd", name = "zb", descriptor = "I")
	public int anInt417 = -1;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILclient!ic;I)V")
	private void method335(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub10 arg1) {
		if (arg0 == 1) {
			this.anInt409 = arg1.method1517();
		} else if (arg0 == 2) {
			this.anInt417 = arg1.method1517();
		} else if (arg0 == 4) {
			this.anInt399 = arg1.method1517();
		} else if (arg0 == 5) {
			this.anInt414 = arg1.method1517();
		} else if (arg0 == 6) {
			this.anInt408 = arg1.method1517();
		} else if (arg0 == 7) {
			this.anInt402 = arg1.method1514();
		} else if (arg0 == 8) {
			this.anInt404 = arg1.method1514();
		} else if (arg0 >= 40 && arg0 < 50) {
			this.aShortArray2[arg0 - 40] = (short) arg1.method1517();
		} else if (arg0 >= 50 && arg0 < 60) {
			this.aShortArray1[arg0 - 50] = (short) arg1.method1517();
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILclient!ic;)V")
	public void method337(@OriginalArg(1) Class2_Sub10 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method1514();
			if (local7 == 0) {
				return;
			}
			this.method335(local7, arg0);
		}
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(II)Lclient!na;")
	public Class2_Sub2_Sub2_Sub5 method341(@OriginalArg(1) int arg0) {
		@Pc(18) Class2_Sub2_Sub2_Sub5 local18 = (Class2_Sub2_Sub2_Sub5) Static10.aClass16_16.method490((long) this.anInt412);
		if (local18 == null) {
			@Pc(26) Class2_Sub2_Sub2_Sub7 local26 = Static94.method1414(Static36.aClass26_6, this.anInt409);
			if (local26 == null) {
				return null;
			}
			for (@Pc(32) int local32 = 0; local32 < 6; local32++) {
				if (this.aShortArray2[0] != 0) {
					local26.method1415(this.aShortArray2[local32], this.aShortArray1[local32]);
				}
			}
			local18 = local26.method1412(this.anInt402 + 64, this.anInt404 + 850, -30, -50, -30);
			Static10.aClass16_16.method492(local18, (long) this.anInt412);
		}
		@Pc(86) Class2_Sub2_Sub2_Sub5 local86;
		if (this.anInt417 == -1 || arg0 == -1) {
			local86 = local18.method1136(true);
		} else {
			local86 = Static12.method270(this.anInt417).method1049(local18, arg0);
		}
		if (this.anInt399 != 128 || this.anInt414 != 128) {
			local86.method1129(this.anInt399, this.anInt414, this.anInt399);
		}
		if (this.anInt408 != 0) {
			if (this.anInt408 == 90) {
				local86.method1123();
			}
			if (this.anInt408 == 180) {
				local86.method1123();
				local86.method1123();
			}
			if (this.anInt408 == 270) {
				local86.method1123();
				local86.method1123();
				local86.method1123();
			}
		}
		return local86;
	}
}
