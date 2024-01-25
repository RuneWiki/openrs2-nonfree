import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public final class Class279 {

	@OriginalMember(owner = "client!r", name = "g", descriptor = "[S")
	private short[] aShortArray117;

	@OriginalMember(owner = "client!r", name = "j", descriptor = "[S")
	private short[] aShortArray118;

	@OriginalMember(owner = "client!r", name = "l", descriptor = "[S")
	private short[] aShortArray119;

	@OriginalMember(owner = "client!r", name = "n", descriptor = "[S")
	private short[] aShortArray120;

	@OriginalMember(owner = "client!r", name = "p", descriptor = "[I")
	private int[] anIntArray548;

	@OriginalMember(owner = "client!r", name = "r", descriptor = "Lclient!ufa;")
	public Class333 aClass333_2;

	@OriginalMember(owner = "client!r", name = "f", descriptor = "[I")
	private final int[] anIntArray547 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ILclient!ji;Z)V")
	private void method6244(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub21 arg1) {
		if (arg0 == 1) {
			arg1.method6069();
			return;
		}
		@Pc(13) int local13;
		@Pc(19) int local19;
		if (arg0 == 2) {
			local13 = arg1.method6069();
			this.anIntArray548 = new int[local13];
			for (local19 = 0; local19 < local13; local19++) {
				this.anIntArray548[local19] = arg1.method6003();
			}
		} else if (arg0 != 3) {
			if (arg0 == 40) {
				local13 = arg1.method6069();
				this.aShortArray120 = new short[local13];
				this.aShortArray117 = new short[local13];
				for (local19 = 0; local19 < local13; local19++) {
					this.aShortArray120[local19] = (short) arg1.method6003();
					this.aShortArray117[local19] = (short) arg1.method6003();
				}
			} else if (arg0 == 41) {
				local13 = arg1.method6069();
				this.aShortArray119 = new short[local13];
				this.aShortArray118 = new short[local13];
				for (local19 = 0; local19 < local13; local19++) {
					this.aShortArray118[local19] = (short) arg1.method6003();
					this.aShortArray119[local19] = (short) arg1.method6003();
				}
			} else if (arg0 >= 60 && arg0 < 70) {
				this.anIntArray547[arg0 - 60] = arg1.method6003();
			}
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(B)Z")
	public boolean method6245() {
		if (this.anIntArray548 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		@Pc(16) Class251 local16 = this.aClass333_2.aClass251_122;
		synchronized (this.aClass333_2.aClass251_122) {
			for (@Pc(20) int local20 = 0; local20 < this.anIntArray548.length; local20++) {
				if (!this.aClass333_2.aClass251_122.method5780(0, this.anIntArray548[local20])) {
					local12 = false;
				}
			}
			return local12;
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(I)Lclient!nj;")
	public Class220 method6247() {
		if (this.anIntArray548 == null) {
			return null;
		}
		@Pc(15) Class220[] local15 = new Class220[this.anIntArray548.length];
		@Pc(19) Class251 local19 = this.aClass333_2.aClass251_122;
		@Pc(23) int local23;
		synchronized (this.aClass333_2.aClass251_122) {
			local23 = 0;
			while (true) {
				if (this.anIntArray548.length <= local23) {
					break;
				}
				local15[local23] = Static489.method6690(this.anIntArray548[local23], this.aClass333_2.aClass251_122);
				local23++;
			}
		}
		for (@Pc(52) int local52 = 0; local52 < this.anIntArray548.length; local52++) {
			if (local15[local52].anInt6196 < 13) {
				local15[local52].method5294();
			}
		}
		@Pc(99) Class220 local99;
		if (local15.length == 1) {
			local99 = local15[0];
		} else {
			local99 = new Class220(local15, local15.length);
		}
		if (local99 == null) {
			return null;
		}
		if (this.aShortArray120 != null) {
			for (local23 = 0; local23 < this.aShortArray120.length; local23++) {
				local99.method5295(this.aShortArray120[local23], this.aShortArray117[local23]);
			}
		}
		if (this.aShortArray118 != null) {
			for (local23 = 0; local23 < this.aShortArray118.length; local23++) {
				local99.method5305(this.aShortArray118[local23], this.aShortArray119[local23]);
			}
		}
		return local99;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!ji;I)V")
	public void method6250(@OriginalArg(0) Class6_Sub21 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method6069();
			if (local17 == 0) {
				return;
			}
			this.method6244(local17, arg0);
		}
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(B)Z")
	public boolean method6251() {
		@Pc(5) boolean local5 = true;
		@Pc(9) Class251 local9 = this.aClass333_2.aClass251_122;
		synchronized (this.aClass333_2.aClass251_122) {
			for (@Pc(13) int local13 = 0; local13 < 5; local13++) {
				if (this.anIntArray547[local13] != -1 && !this.aClass333_2.aClass251_122.method5780(0, this.anIntArray547[local13])) {
					local5 = false;
				}
			}
			return local5;
		}
	}

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(B)Lclient!nj;")
	public Class220 method6252() {
		@Pc(8) Class220[] local8 = new Class220[5];
		@Pc(10) int local10 = 0;
		@Pc(14) Class251 local14 = this.aClass333_2.aClass251_122;
		@Pc(18) int local18;
		synchronized (this.aClass333_2.aClass251_122) {
			local18 = 0;
			while (true) {
				if (local18 >= 5) {
					break;
				}
				if (this.anIntArray547[local18] != -1) {
					local8[local10++] = Static489.method6690(this.anIntArray547[local18], this.aClass333_2.aClass251_122);
				}
				local18++;
			}
		}
		for (@Pc(54) int local54 = 0; local54 < 5; local54++) {
			if (local8[local54] != null && local8[local54].anInt6196 < 13) {
				local8[local54].method5294();
			}
		}
		@Pc(88) Class220 local88 = new Class220(local8, local10);
		if (this.aShortArray120 != null) {
			for (local18 = 0; local18 < this.aShortArray120.length; local18++) {
				local88.method5295(this.aShortArray120[local18], this.aShortArray117[local18]);
			}
		}
		if (this.aShortArray118 != null) {
			for (local18 = 0; local18 < this.aShortArray118.length; local18++) {
				local88.method5305(this.aShortArray118[local18], this.aShortArray119[local18]);
			}
		}
		return local88;
	}
}
