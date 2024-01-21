import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!u")
public final class Class2_Sub2_Sub17 extends Class2_Sub2 {

	@OriginalMember(owner = "client!u", name = "T", descriptor = "[I")
	private int[] anIntArray567;

	@OriginalMember(owner = "client!u", name = "X", descriptor = "[S")
	private short[] aShortArray120;

	@OriginalMember(owner = "client!u", name = "Y", descriptor = "[S")
	private short[] aShortArray121;

	@OriginalMember(owner = "client!u", name = "ab", descriptor = "[S")
	private short[] aShortArray122;

	@OriginalMember(owner = "client!u", name = "db", descriptor = "[S")
	private short[] aShortArray123;

	@OriginalMember(owner = "client!u", name = "cb", descriptor = "[I")
	private final int[] anIntArray568 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!u", name = "R", descriptor = "I")
	public int anInt3908 = -1;

	@OriginalMember(owner = "client!u", name = "nb", descriptor = "Z")
	public boolean aBoolean161 = false;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IILclient!oa;)V")
	private void method2687(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub18 arg1) {
		if (arg0 == 1) {
			this.anInt3908 = arg1.method2387();
			return;
		}
		@Pc(27) int local27;
		@Pc(37) int local37;
		if (arg0 == 2) {
			local27 = arg1.method2387();
			this.anIntArray567 = new int[local27];
			for (local37 = 0; local37 < local27; local37++) {
				this.anIntArray567[local37] = arg1.method2353();
			}
		} else if (arg0 == 3) {
			this.aBoolean161 = true;
		} else if (arg0 == 40) {
			local27 = arg1.method2387();
			this.aShortArray122 = new short[local27];
			this.aShortArray120 = new short[local27];
			for (local37 = 0; local37 < local27; local37++) {
				this.aShortArray120[local37] = (short) arg1.method2353();
				this.aShortArray122[local37] = (short) arg1.method2353();
			}
		} else if (arg0 == 41) {
			local27 = arg1.method2387();
			this.aShortArray121 = new short[local27];
			this.aShortArray123 = new short[local27];
			for (local37 = 0; local37 < local27; local37++) {
				this.aShortArray123[local37] = (short) arg1.method2353();
				this.aShortArray121[local37] = (short) arg1.method2353();
			}
		} else if (arg0 >= 60 && arg0 < 70) {
			this.anIntArray568[arg0 - 60] = arg1.method2353();
		}
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(B)Z")
	public boolean method2688() {
		@Pc(7) boolean local7 = true;
		for (@Pc(14) int local14 = 0; local14 < 5; local14++) {
			if (this.anIntArray568[local14] != -1 && !Static76.aClass43_19.method2220(0, this.anIntArray568[local14])) {
				local7 = false;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!u", name = "c", descriptor = "(B)Lclient!fe;")
	public Class2_Sub2_Sub1_Sub3 method2690() {
		@Pc(8) Class2_Sub2_Sub1_Sub3[] local8 = new Class2_Sub2_Sub1_Sub3[5];
		@Pc(10) int local10 = 0;
		for (@Pc(18) int local18 = 0; local18 < 5; local18++) {
			if (this.anIntArray568[local18] != -1) {
				local8[local10++] = Static47.method877(Static76.aClass43_19, this.anIntArray568[local18]);
			}
		}
		@Pc(47) Class2_Sub2_Sub1_Sub3 local47 = new Class2_Sub2_Sub1_Sub3(local8, local10);
		@Pc(52) int local52;
		if (this.aShortArray120 != null) {
			for (local52 = 0; local52 < this.aShortArray120.length; local52++) {
				local47.method864(this.aShortArray120[local52], this.aShortArray122[local52]);
			}
		}
		if (this.aShortArray123 != null) {
			for (local52 = 0; local52 < this.aShortArray123.length; local52++) {
				local47.method880(this.aShortArray123[local52], this.aShortArray121[local52]);
			}
		}
		return local47;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!oa;I)V")
	public void method2691(@OriginalArg(0) Class2_Sub18 arg0) {
		while (true) {
			@Pc(8) int local8 = arg0.method2387();
			if (local8 == 0) {
				return;
			}
			this.method2687(local8, arg0);
		}
	}

	@OriginalMember(owner = "client!u", name = "f", descriptor = "(I)Z")
	public boolean method2693() {
		if (this.anIntArray567 == null) {
			return true;
		}
		@Pc(10) boolean local10 = true;
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray567.length; local17++) {
			if (!Static76.aClass43_19.method2220(0, this.anIntArray567[local17])) {
				local10 = false;
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!u", name = "e", descriptor = "(B)Lclient!fe;")
	public Class2_Sub2_Sub1_Sub3 method2694() {
		if (this.anIntArray567 == null) {
			return null;
		}
		@Pc(13) Class2_Sub2_Sub1_Sub3[] local13 = new Class2_Sub2_Sub1_Sub3[this.anIntArray567.length];
		for (@Pc(15) int local15 = 0; local15 < this.anIntArray567.length; local15++) {
			local13[local15] = Static47.method877(Static76.aClass43_19, this.anIntArray567[local15]);
		}
		@Pc(43) Class2_Sub2_Sub1_Sub3 local43;
		if (local13.length == 1) {
			local43 = local13[0];
		} else {
			local43 = new Class2_Sub2_Sub1_Sub3(local13, local13.length);
		}
		@Pc(53) int local53;
		if (this.aShortArray120 != null) {
			for (local53 = 0; local53 < this.aShortArray120.length; local53++) {
				local43.method864(this.aShortArray120[local53], this.aShortArray122[local53]);
			}
		}
		if (this.aShortArray123 != null) {
			for (local53 = 0; local53 < this.aShortArray123.length; local53++) {
				local43.method880(this.aShortArray123[local53], this.aShortArray121[local53]);
			}
		}
		return local43;
	}
}
