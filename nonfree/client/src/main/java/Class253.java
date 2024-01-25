import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nia")
public final class Class253 {

	@OriginalMember(owner = "client!nia", name = "i", descriptor = "[S")
	private short[] aShortArray61;

	@OriginalMember(owner = "client!nia", name = "o", descriptor = "Lclient!rl;")
	public Class319 aClass319_1;

	@OriginalMember(owner = "client!nia", name = "l", descriptor = "[S")
	private short[] aShortArray62;

	@OriginalMember(owner = "client!nia", name = "m", descriptor = "[I")
	private int[] anIntArray427;

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "[S")
	private short[] aShortArray63;

	@OriginalMember(owner = "client!nia", name = "e", descriptor = "[S")
	private short[] aShortArray64;

	@OriginalMember(owner = "client!nia", name = "n", descriptor = "[I")
	private final int[] anIntArray426 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "(I)Lclient!rha;")
	public Class316 method6109() {
		if (this.anIntArray427 == null) {
			return null;
		}
		@Pc(16) Class316[] local16 = new Class316[this.anIntArray427.length];
		@Pc(20) Class223 local20 = this.aClass319_1.aClass223_104;
		@Pc(24) int local24;
		synchronized (this.aClass319_1.aClass223_104) {
			local24 = 0;
			while (true) {
				if (local24 >= this.anIntArray427.length) {
					break;
				}
				local16[local24] = Static347.method5332(this.anIntArray427[local24], this.aClass319_1.aClass223_104);
				local24++;
			}
		}
		for (@Pc(57) int local57 = 0; local57 < this.anIntArray427.length; local57++) {
			if (local16[local57].anInt8613 < 13) {
				local16[local57].method7538();
			}
		}
		@Pc(96) Class316 local96;
		if (local16.length == 1) {
			local96 = local16[0];
		} else {
			local96 = new Class316(local16, local16.length);
		}
		if (local96 == null) {
			return null;
		}
		if (this.aShortArray62 != null) {
			for (local24 = 0; local24 < this.aShortArray62.length; local24++) {
				local96.method7542(this.aShortArray63[local24], this.aShortArray62[local24]);
			}
		}
		if (this.aShortArray61 != null) {
			for (local24 = 0; local24 < this.aShortArray61.length; local24++) {
				local96.method7539(this.aShortArray61[local24], this.aShortArray64[local24]);
			}
		}
		return local96;
	}

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "(Lclient!jc;I)V")
	public void method6110(@OriginalArg(0) Class6_Sub15 arg0) {
		while (true) {
			@Pc(19) int local19 = arg0.method3030();
			if (local19 == 0) {
				return;
			}
			this.method6111(arg0, local19);
		}
	}

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "(Lclient!jc;II)V")
	private void method6111(@OriginalArg(0) Class6_Sub15 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			arg0.method3030();
			return;
		}
		@Pc(28) int local28;
		@Pc(34) int local34;
		if (arg1 == 2) {
			local28 = arg0.method3030();
			this.anIntArray427 = new int[local28];
			for (local34 = 0; local34 < local28; local34++) {
				this.anIntArray427[local34] = arg0.method3018();
			}
		} else if (arg1 != 3) {
			if (arg1 == 40) {
				local28 = arg0.method3030();
				this.aShortArray62 = new short[local28];
				this.aShortArray63 = new short[local28];
				for (local34 = 0; local34 < local28; local34++) {
					this.aShortArray62[local34] = (short) arg0.method3018();
					this.aShortArray63[local34] = (short) arg0.method3018();
				}
			} else if (arg1 == 41) {
				local28 = arg0.method3030();
				this.aShortArray64 = new short[local28];
				this.aShortArray61 = new short[local28];
				for (local34 = 0; local34 < local28; local34++) {
					this.aShortArray61[local34] = (short) arg0.method3018();
					this.aShortArray64[local34] = (short) arg0.method3018();
				}
			} else if (arg1 >= 60 && arg1 < 70) {
				this.anIntArray426[arg1 - 60] = arg0.method3018();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!nia", name = "c", descriptor = "(I)Z")
	public boolean method6112() {
		if (this.anIntArray427 == null) {
			return true;
		}
		@Pc(13) boolean local13 = true;
		@Pc(17) Class223 local17 = this.aClass319_1.aClass223_104;
		synchronized (this.aClass319_1.aClass223_104) {
			for (@Pc(21) int local21 = 0; local21 < this.anIntArray427.length; local21++) {
				if (!this.aClass319_1.aClass223_104.method5261(this.anIntArray427[local21], 0)) {
					local13 = false;
				}
			}
			if (11519 != 11519) {
				this.aClass319_1 = null;
			}
			return local13;
		}
	}

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "(B)Lclient!rha;")
	public Class316 method6113() {
		@Pc(8) Class316[] local8 = new Class316[5];
		@Pc(10) int local10 = 0;
		@Pc(14) Class223 local14 = this.aClass319_1.aClass223_104;
		@Pc(18) int local18;
		synchronized (this.aClass319_1.aClass223_104) {
			local18 = 0;
			while (true) {
				if (local18 >= 5) {
					break;
				}
				if (this.anIntArray426[local18] != -1) {
					local8[local10++] = Static347.method5332(this.anIntArray426[local18], this.aClass319_1.aClass223_104);
				}
				local18++;
			}
		}
		for (@Pc(58) int local58 = 0; local58 < 5; local58++) {
			if (local8[local58] != null && local8[local58].anInt8613 < 13) {
				local8[local58].method7538();
			}
		}
		@Pc(92) Class316 local92 = new Class316(local8, local10);
		if (this.aShortArray62 != null) {
			for (local18 = 0; local18 < this.aShortArray62.length; local18++) {
				local92.method7542(this.aShortArray63[local18], this.aShortArray62[local18]);
			}
		}
		if (this.aShortArray61 != null) {
			for (local18 = 0; local18 < this.aShortArray61.length; local18++) {
				local92.method7539(this.aShortArray61[local18], this.aShortArray64[local18]);
			}
		}
		return local92;
	}

	@OriginalMember(owner = "client!nia", name = "b", descriptor = "(B)Z")
	public boolean method6114() {
		@Pc(13) boolean local13 = true;
		@Pc(17) Class223 local17 = this.aClass319_1.aClass223_104;
		synchronized (this.aClass319_1.aClass223_104) {
			for (@Pc(21) int local21 = 0; local21 < 5; local21++) {
				if (this.anIntArray426[local21] != -1 && !this.aClass319_1.aClass223_104.method5261(this.anIntArray426[local21], 0)) {
					local13 = false;
				}
			}
			return local13;
		}
	}
}
