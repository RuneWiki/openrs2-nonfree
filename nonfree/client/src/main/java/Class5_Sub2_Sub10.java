import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class Class5_Sub2_Sub10 extends Class5_Sub2 {

	@OriginalMember(owner = "client!md", name = "S", descriptor = "[I")
	private int[] anIntArray295;

	@OriginalMember(owner = "client!md", name = "Y", descriptor = "[S")
	private final short[] aShortArray7 = new short[6];

	@OriginalMember(owner = "client!md", name = "mb", descriptor = "I")
	public int anInt1997 = -1;

	@OriginalMember(owner = "client!md", name = "fb", descriptor = "[S")
	private final short[] aShortArray8 = new short[6];

	@OriginalMember(owner = "client!md", name = "jb", descriptor = "Z")
	public boolean aBoolean96 = false;

	@OriginalMember(owner = "client!md", name = "nb", descriptor = "[I")
	private final int[] anIntArray296 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!md", name = "e", descriptor = "(I)Z")
	public boolean method1344() {
		@Pc(5) boolean local5 = true;
		for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
			if (this.anIntArray296[local7] != -1 && !Static108.aClass29_70.method739(this.anIntArray296[local7], 0)) {
				local5 = false;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!md", name = "f", descriptor = "(I)Lclient!pa;")
	public Class5_Sub2_Sub4_Sub7 method1345() {
		if (this.anIntArray295 == null) {
			return null;
		}
		@Pc(15) Class5_Sub2_Sub4_Sub7[] local15 = new Class5_Sub2_Sub4_Sub7[this.anIntArray295.length];
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray295.length; local17++) {
			local15[local17] = Static83.method1570(Static108.aClass29_70, this.anIntArray295[local17]);
		}
		@Pc(49) Class5_Sub2_Sub4_Sub7 local49;
		if (local15.length == 1) {
			local49 = local15[0];
		} else {
			local49 = new Class5_Sub2_Sub4_Sub7(local15, local15.length);
		}
		for (@Pc(60) int local60 = 0; local60 < 6 && this.aShortArray8[local60] != 0; local60++) {
			local49.method1575(this.aShortArray8[local60], this.aShortArray7[local60]);
		}
		return local49;
	}

	@OriginalMember(owner = "client!md", name = "g", descriptor = "(I)Z")
	public boolean method1348() {
		if (this.anIntArray295 == null) {
			return true;
		}
		@Pc(17) boolean local17 = true;
		for (@Pc(19) int local19 = 0; local19 < this.anIntArray295.length; local19++) {
			if (!Static108.aClass29_70.method739(this.anIntArray295[local19], 0)) {
				local17 = false;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IBLclient!hb;)V")
	private void method1350(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub9 arg1) {
		if (arg0 == 1) {
			this.anInt1997 = arg1.method1408();
		} else if (arg0 == 2) {
			@Pc(26) int local26 = arg1.method1408();
			this.anIntArray295 = new int[local26];
			for (@Pc(32) int local32 = 0; local32 < local26; local32++) {
				this.anIntArray295[local32] = arg1.method1418();
			}
		} else if (arg0 == 3) {
			this.aBoolean96 = true;
		} else if (arg0 >= 40 && arg0 < 50) {
			this.aShortArray8[arg0 - 40] = (short) arg1.method1418();
		} else if (arg0 >= 50 && arg0 < 60) {
			this.aShortArray7[arg0 - 50] = (short) arg1.method1418();
		} else if (arg0 >= 60 && arg0 < 70) {
			this.anIntArray296[arg0 - 60] = arg1.method1418();
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(ILclient!hb;)V")
	public void method1353(@OriginalArg(1) Class5_Sub9 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method1408();
			if (local14 == 0) {
				return;
			}
			this.method1350(local14, arg0);
		}
	}

	@OriginalMember(owner = "client!md", name = "h", descriptor = "(I)Lclient!pa;")
	public Class5_Sub2_Sub4_Sub7 method1354() {
		@Pc(2) Class5_Sub2_Sub4_Sub7[] local2 = new Class5_Sub2_Sub4_Sub7[5];
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 5; local10++) {
			if (this.anIntArray296[local10] != -1) {
				local2[local8++] = Static83.method1570(Static108.aClass29_70, this.anIntArray296[local10]);
			}
		}
		@Pc(41) Class5_Sub2_Sub4_Sub7 local41 = new Class5_Sub2_Sub4_Sub7(local2, local8);
		for (@Pc(43) int local43 = 0; local43 < 6 && this.aShortArray8[local43] != 0; local43++) {
			local41.method1575(this.aShortArray8[local43], this.aShortArray7[local43]);
		}
		return local41;
	}
}
