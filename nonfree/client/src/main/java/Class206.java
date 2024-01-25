import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!na")
public final class Class206 {

	@OriginalMember(owner = "client!na", name = "a", descriptor = "Lclient!wl;")
	public Class344 aClass344_2;

	@OriginalMember(owner = "client!na", name = "c", descriptor = "[S")
	private short[] aShortArray92;

	@OriginalMember(owner = "client!na", name = "e", descriptor = "[S")
	private short[] aShortArray93;

	@OriginalMember(owner = "client!na", name = "f", descriptor = "[S")
	private short[] aShortArray94;

	@OriginalMember(owner = "client!na", name = "k", descriptor = "[S")
	private short[] aShortArray95;

	@OriginalMember(owner = "client!na", name = "o", descriptor = "[I")
	private int[] anIntArray519;

	@OriginalMember(owner = "client!na", name = "p", descriptor = "[I")
	private final int[] anIntArray520 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(I)Lclient!rf;")
	public Class274 method4986() {
		@Pc(8) Class274[] local8 = new Class274[5];
		@Pc(10) int local10 = 0;
		@Pc(14) Class251 local14 = this.aClass344_2.aClass251_156;
		@Pc(18) int local18;
		synchronized (this.aClass344_2.aClass251_156) {
			local18 = 0;
			while (true) {
				if (local18 >= 5) {
					break;
				}
				if (this.anIntArray520[local18] != -1) {
					local8[local10++] = Static250.method3550(this.aClass344_2.aClass251_156, this.anIntArray520[local18]);
				}
				local18++;
			}
		}
		for (@Pc(61) int local61 = 0; local61 < 5; local61++) {
			if (local8[local61] != null && local8[local61].anInt7670 < 13) {
				local8[local61].method6335();
			}
		}
		@Pc(91) Class274 local91 = new Class274(local8, local10);
		if (this.aShortArray93 != null) {
			for (local18 = 0; local18 < this.aShortArray93.length; local18++) {
				local91.method6332(this.aShortArray95[local18], this.aShortArray93[local18]);
			}
		}
		if (this.aShortArray92 != null) {
			for (local18 = 0; local18 < this.aShortArray92.length; local18++) {
				local91.method6333(this.aShortArray94[local18], this.aShortArray92[local18]);
			}
		}
		return local91;
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(I)Z")
	public boolean method4987() {
		if (this.anIntArray519 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		@Pc(16) Class251 local16 = this.aClass344_2.aClass251_156;
		synchronized (this.aClass344_2.aClass251_156) {
			for (@Pc(20) int local20 = 0; local20 < this.anIntArray519.length; local20++) {
				if (!this.aClass344_2.aClass251_156.method5854(this.anIntArray519[local20], 0)) {
					local12 = false;
				}
			}
			return local12;
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(ZLclient!dga;)V")
	public void method4988(@OriginalArg(1) Class6_Sub14 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method6041();
			if (local9 == 0) {
				return;
			}
			this.method4991(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Z)Lclient!rf;")
	public Class274 method4989() {
		if (this.anIntArray519 == null) {
			return null;
		}
		@Pc(15) Class274[] local15 = new Class274[this.anIntArray519.length];
		@Pc(19) Class251 local19 = this.aClass344_2.aClass251_156;
		@Pc(23) int local23;
		synchronized (this.aClass344_2.aClass251_156) {
			local23 = 0;
			while (true) {
				if (local23 >= this.anIntArray519.length) {
					break;
				}
				local15[local23] = Static250.method3550(this.aClass344_2.aClass251_156, this.anIntArray519[local23]);
				local23++;
			}
		}
		for (@Pc(56) int local56 = 0; local56 < this.anIntArray519.length; local56++) {
			if (local15[local56].anInt7670 < 13) {
				local15[local56].method6335();
			}
		}
		@Pc(94) Class274 local94;
		if (local15.length == 1) {
			local94 = local15[0];
		} else {
			local94 = new Class274(local15, local15.length);
		}
		if (local94 == null) {
			return null;
		}
		if (this.aShortArray93 != null) {
			for (local23 = 0; local23 < this.aShortArray93.length; local23++) {
				local94.method6332(this.aShortArray95[local23], this.aShortArray93[local23]);
			}
		}
		if (this.aShortArray92 != null) {
			for (local23 = 0; local23 < this.aShortArray92.length; local23++) {
				local94.method6333(this.aShortArray94[local23], this.aShortArray92[local23]);
			}
		}
		return local94;
	}

	@OriginalMember(owner = "client!na", name = "c", descriptor = "(I)Z")
	public boolean method4990() {
		@Pc(12) boolean local12 = true;
		@Pc(16) Class251 local16 = this.aClass344_2.aClass251_156;
		synchronized (this.aClass344_2.aClass251_156) {
			for (@Pc(20) int local20 = 0; local20 < 5; local20++) {
				if (this.anIntArray520[local20] != -1 && !this.aClass344_2.aClass251_156.method5854(this.anIntArray520[local20], 0)) {
					local12 = false;
				}
			}
			return local12;
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!dga;II)V")
	private void method4991(@OriginalArg(0) Class6_Sub14 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			arg0.method6041();
			return;
		}
		@Pc(23) int local23;
		@Pc(33) int local33;
		if (arg1 == 2) {
			local23 = arg0.method6041();
			this.anIntArray519 = new int[local23];
			for (local33 = 0; local33 < local23; local33++) {
				this.anIntArray519[local33] = arg0.method6006();
			}
		} else if (arg1 != 3) {
			if (arg1 == 40) {
				local23 = arg0.method6041();
				this.aShortArray95 = new short[local23];
				this.aShortArray93 = new short[local23];
				for (local33 = 0; local33 < local23; local33++) {
					this.aShortArray93[local33] = (short) arg0.method6006();
					this.aShortArray95[local33] = (short) arg0.method6006();
				}
			} else if (arg1 == 41) {
				local23 = arg0.method6041();
				this.aShortArray94 = new short[local23];
				this.aShortArray92 = new short[local23];
				for (local33 = 0; local33 < local23; local33++) {
					this.aShortArray92[local33] = (short) arg0.method6006();
					this.aShortArray94[local33] = (short) arg0.method6006();
				}
			} else if (arg1 >= 60 && arg1 < 70) {
				this.anIntArray520[arg1 - 60] = arg0.method6006();
			}
		}
	}
}
