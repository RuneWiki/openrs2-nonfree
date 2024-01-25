import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uq")
public final class Class209 {

	@OriginalMember(owner = "client!uq", name = "e", descriptor = "[S")
	private short[] aShortArray106;

	@OriginalMember(owner = "client!uq", name = "f", descriptor = "[S")
	private short[] aShortArray107;

	@OriginalMember(owner = "client!uq", name = "j", descriptor = "[S")
	private short[] aShortArray108;

	@OriginalMember(owner = "client!uq", name = "n", descriptor = "[S")
	private short[] aShortArray109;

	@OriginalMember(owner = "client!uq", name = "p", descriptor = "[I")
	private int[] anIntArray770;

	@OriginalMember(owner = "client!uq", name = "g", descriptor = "[I")
	private final int[] anIntArray769 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!uq", name = "k", descriptor = "Z")
	public boolean aBoolean545 = false;

	@OriginalMember(owner = "client!uq", name = "q", descriptor = "I")
	public int anInt6153 = -1;

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(I)Lclient!ap;")
	public Class12 method5385() {
		@Pc(8) Class12[] local8 = new Class12[5];
		@Pc(15) int local15 = 0;
		@Pc(17) Class165 local17 = Static172.aClass165_90;
		synchronized (Static172.aClass165_90) {
			for (@Pc(21) int local21 = 0; local21 < 5; local21++) {
				if (this.anIntArray769[local21] != -1) {
					local8[local15++] = Static328.method5503(Static172.aClass165_90, this.anIntArray769[local21]);
				}
			}
		}
		@Pc(59) Class12 local59 = new Class12(local8, local15);
		@Pc(64) int local64;
		if (this.aShortArray108 != null) {
			for (local64 = 0; local64 < this.aShortArray108.length; local64++) {
				local59.method372(this.aShortArray108[local64], this.aShortArray106[local64]);
			}
		}
		if (this.aShortArray109 != null) {
			for (local64 = 0; local64 < this.aShortArray109.length; local64++) {
				local59.method374(this.aShortArray109[local64], this.aShortArray107[local64]);
			}
		}
		return local59;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lclient!eb;B)V")
	public void method5386(@OriginalArg(0) Class1_Sub7 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method3141();
			if (local15 == 0) {
				return;
			}
			this.method5387(local15, arg0);
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IILclient!eb;)V")
	private void method5387(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (arg0 == 1) {
			this.anInt6153 = arg1.method3141();
			return;
		}
		@Pc(25) int local25;
		@Pc(31) int local31;
		if (arg0 == 2) {
			local25 = arg1.method3141();
			this.anIntArray770 = new int[local25];
			for (local31 = 0; local31 < local25; local31++) {
				this.anIntArray770[local31] = arg1.method3115();
			}
		} else if (arg0 == 3) {
			this.aBoolean545 = true;
		} else if (arg0 == 40) {
			local25 = arg1.method3141();
			this.aShortArray108 = new short[local25];
			this.aShortArray106 = new short[local25];
			for (local31 = 0; local31 < local25; local31++) {
				this.aShortArray108[local31] = (short) arg1.method3115();
				this.aShortArray106[local31] = (short) arg1.method3115();
			}
		} else if (arg0 == 41) {
			local25 = arg1.method3141();
			this.aShortArray107 = new short[local25];
			this.aShortArray109 = new short[local25];
			for (local31 = 0; local31 < local25; local31++) {
				this.aShortArray109[local31] = (short) arg1.method3115();
				this.aShortArray107[local31] = (short) arg1.method3115();
			}
		} else if (arg0 >= 60 && arg0 < 70) {
			this.anIntArray769[arg0 - 60] = arg1.method3115();
		}
	}

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "(I)Z")
	public boolean method5388() {
		@Pc(7) boolean local7 = true;
		@Pc(9) Class165 local9 = Static172.aClass165_90;
		synchronized (Static172.aClass165_90) {
			for (@Pc(13) int local13 = 0; local13 < 5; local13++) {
				if (this.anIntArray769[local13] != -1 && !Static172.aClass165_90.method4485(this.anIntArray769[local13], 0)) {
					local7 = false;
				}
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!uq", name = "c", descriptor = "(I)Lclient!ap;")
	public Class12 method5392() {
		if (this.anIntArray770 == null) {
			return null;
		}
		@Pc(23) Class12[] local23 = new Class12[this.anIntArray770.length];
		@Pc(25) Class165 local25 = Static172.aClass165_90;
		synchronized (Static172.aClass165_90) {
			@Pc(29) int local29 = 0;
			while (true) {
				if (this.anIntArray770.length <= local29) {
					break;
				}
				local23[local29] = Static328.method5503(Static172.aClass165_90, this.anIntArray770[local29]);
				local29++;
			}
		}
		@Pc(71) Class12 local71;
		if (local23.length == 1) {
			local71 = local23[0];
		} else {
			local71 = new Class12(local23, local23.length);
		}
		if (local71 == null) {
			return null;
		}
		@Pc(85) int local85;
		if (this.aShortArray108 != null) {
			for (local85 = 0; local85 < this.aShortArray108.length; local85++) {
				local71.method372(this.aShortArray108[local85], this.aShortArray106[local85]);
			}
		}
		if (this.aShortArray109 != null) {
			for (local85 = 0; local85 < this.aShortArray109.length; local85++) {
				local71.method374(this.aShortArray109[local85], this.aShortArray107[local85]);
			}
		}
		return local71;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Z)Z")
	public boolean method5393() {
		if (this.anIntArray770 == null) {
			return true;
		}
		@Pc(17) boolean local17 = true;
		@Pc(19) Class165 local19 = Static172.aClass165_90;
		synchronized (Static172.aClass165_90) {
			for (@Pc(23) int local23 = 0; local23 < this.anIntArray770.length; local23++) {
				if (!Static172.aClass165_90.method4485(this.anIntArray770[local23], 0)) {
					local17 = false;
				}
			}
			return local17;
		}
	}
}
