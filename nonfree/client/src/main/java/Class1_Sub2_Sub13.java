import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!og")
public final class Class1_Sub2_Sub13 extends Class1_Sub2 {

	@OriginalMember(owner = "client!og", name = "I", descriptor = "[I")
	private int[] anIntArray322;

	@OriginalMember(owner = "client!og", name = "K", descriptor = "[S")
	private short[] aShortArray32;

	@OriginalMember(owner = "client!og", name = "O", descriptor = "[S")
	private short[] aShortArray33;

	@OriginalMember(owner = "client!og", name = "U", descriptor = "[S")
	private short[] aShortArray34;

	@OriginalMember(owner = "client!og", name = "ab", descriptor = "[S")
	private short[] aShortArray35;

	@OriginalMember(owner = "client!og", name = "H", descriptor = "Z")
	public boolean aBoolean244 = false;

	@OriginalMember(owner = "client!og", name = "Q", descriptor = "[I")
	private final int[] anIntArray323 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!og", name = "M", descriptor = "I")
	public int anInt3262 = -1;

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(BLclient!ce;I)V")
	private void method2327(@OriginalArg(1) Class1_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt3262 = arg0.method1607();
			return;
		}
		@Pc(52) int local52;
		@Pc(62) int local62;
		if (arg1 == 2) {
			local52 = arg0.method1607();
			this.anIntArray322 = new int[local52];
			for (local62 = 0; local62 < local52; local62++) {
				this.anIntArray322[local62] = arg0.method1642();
			}
		} else if (arg1 == 3) {
			this.aBoolean244 = true;
		} else if (arg1 == 40) {
			local52 = arg0.method1607();
			this.aShortArray32 = new short[local52];
			this.aShortArray33 = new short[local52];
			for (local62 = 0; local62 < local52; local62++) {
				this.aShortArray32[local62] = (short) arg0.method1642();
				this.aShortArray33[local62] = (short) arg0.method1642();
			}
		} else if (arg1 == 41) {
			local52 = arg0.method1607();
			this.aShortArray35 = new short[local52];
			this.aShortArray34 = new short[local52];
			for (local62 = 0; local62 < local52; local62++) {
				this.aShortArray35[local62] = (short) arg0.method1642();
				this.aShortArray34[local62] = (short) arg0.method1642();
			}
		} else if (arg1 >= 60 && arg1 < 70) {
			this.anIntArray323[arg1 - 60] = arg0.method1642();
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Z)Z")
	public boolean method2328() {
		if (this.anIntArray322 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < this.anIntArray322.length; local14++) {
			if (!Static181.aClass4_102.method2247(this.anIntArray322[local14], 0)) {
				local12 = false;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!og", name = "d", descriptor = "(B)Lclient!be;")
	public Class1_Sub2_Sub2_Sub1 method2329() {
		@Pc(4) Class1_Sub2_Sub2_Sub1[] local4 = new Class1_Sub2_Sub2_Sub1[5];
		@Pc(10) int local10 = 0;
		for (@Pc(19) int local19 = 0; local19 < 5; local19++) {
			if (this.anIntArray323[local19] != -1) {
				local4[local10++] = Static13.method505(Static181.aClass4_102, this.anIntArray323[local19]);
			}
		}
		@Pc(51) Class1_Sub2_Sub2_Sub1 local51 = new Class1_Sub2_Sub2_Sub1(local4, local10);
		@Pc(56) int local56;
		if (this.aShortArray32 != null) {
			for (local56 = 0; local56 < this.aShortArray32.length; local56++) {
				local51.method513(this.aShortArray32[local56], this.aShortArray33[local56]);
			}
		}
		if (this.aShortArray35 != null) {
			for (local56 = 0; local56 < this.aShortArray35.length; local56++) {
				local51.method503(this.aShortArray35[local56], this.aShortArray34[local56]);
			}
		}
		return local51;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(BLclient!ce;)V")
	public void method2330(@OriginalArg(1) Class1_Sub8 arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.method1607();
			if (local16 == 0) {
				return;
			}
			this.method2327(arg0, local16);
		}
	}

	@OriginalMember(owner = "client!og", name = "e", descriptor = "(B)Z")
	public boolean method2331() {
		@Pc(14) boolean local14 = true;
		for (@Pc(16) int local16 = 0; local16 < 5; local16++) {
			if (this.anIntArray323[local16] != -1 && !Static181.aClass4_102.method2247(this.anIntArray323[local16], 0)) {
				local14 = false;
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!og", name = "d", descriptor = "(I)Lclient!be;")
	public Class1_Sub2_Sub2_Sub1 method2333() {
		if (this.anIntArray322 == null) {
			return null;
		}
		@Pc(15) Class1_Sub2_Sub2_Sub1[] local15 = new Class1_Sub2_Sub2_Sub1[this.anIntArray322.length];
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray322.length; local17++) {
			local15[local17] = Static13.method505(Static181.aClass4_102, this.anIntArray322[local17]);
		}
		@Pc(50) Class1_Sub2_Sub2_Sub1 local50;
		if (local15.length == 1) {
			local50 = local15[0];
		} else {
			local50 = new Class1_Sub2_Sub2_Sub1(local15, local15.length);
		}
		@Pc(61) int local61;
		if (this.aShortArray32 != null) {
			for (local61 = 0; local61 < this.aShortArray32.length; local61++) {
				local50.method513(this.aShortArray32[local61], this.aShortArray33[local61]);
			}
		}
		if (this.aShortArray35 != null) {
			for (local61 = 0; local61 < this.aShortArray35.length; local61++) {
				local50.method503(this.aShortArray35[local61], this.aShortArray34[local61]);
			}
		}
		return local50;
	}
}
