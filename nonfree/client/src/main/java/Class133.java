import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ki")
public final class Class133 {

	@OriginalMember(owner = "client!ki", name = "d", descriptor = "Lclient!rq;")
	public Class215 aClass215_1;

	@OriginalMember(owner = "client!ki", name = "g", descriptor = "[S")
	private short[] aShortArray57;

	@OriginalMember(owner = "client!ki", name = "h", descriptor = "[I")
	private int[] anIntArray227;

	@OriginalMember(owner = "client!ki", name = "k", descriptor = "[S")
	private short[] aShortArray58;

	@OriginalMember(owner = "client!ki", name = "m", descriptor = "[S")
	private short[] aShortArray59;

	@OriginalMember(owner = "client!ki", name = "o", descriptor = "[S")
	private short[] aShortArray60;

	@OriginalMember(owner = "client!ki", name = "n", descriptor = "[I")
	private final int[] anIntArray228 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)Z")
	public boolean method3088() {
		if (this.anIntArray227 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		@Pc(16) Class82 local16 = this.aClass215_1.aClass82_82;
		synchronized (this.aClass215_1.aClass82_82) {
			for (@Pc(20) int local20 = 0; local20 < this.anIntArray227.length; local20++) {
				if (!this.aClass215_1.aClass82_82.method1829(this.anIntArray227[local20], 0)) {
					local12 = false;
				}
			}
			return local12;
		}
	}

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "(I)Lclient!pq;")
	public Class193 method3089() {
		@Pc(8) Class193[] local8 = new Class193[5];
		@Pc(10) int local10 = 0;
		@Pc(14) Class82 local14 = this.aClass215_1.aClass82_82;
		@Pc(18) int local18;
		synchronized (this.aClass215_1.aClass82_82) {
			local18 = 0;
			while (true) {
				if (local18 >= 5) {
					break;
				}
				if (this.anIntArray228[local18] != -1) {
					local8[local10++] = Static149.method2219(this.anIntArray228[local18], this.aClass215_1.aClass82_82);
				}
				local18++;
			}
		}
		for (@Pc(52) int local52 = 0; local52 < 5; local52++) {
			if (local8[local52] != null && local8[local52].anInt5431 < 13) {
				local8[local52].method4254();
			}
		}
		@Pc(93) Class193 local93 = new Class193(local8, local10);
		if (this.aShortArray59 != null) {
			for (local18 = 0; local18 < this.aShortArray59.length; local18++) {
				local93.method4266(this.aShortArray58[local18], this.aShortArray59[local18]);
			}
		}
		if (this.aShortArray60 != null) {
			for (local18 = 0; local18 < this.aShortArray60.length; local18++) {
				local93.method4256(this.aShortArray57[local18], this.aShortArray60[local18]);
			}
		}
		return local93;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Z)Z")
	public boolean method3091() {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class82 local11 = this.aClass215_1.aClass82_82;
		synchronized (this.aClass215_1.aClass82_82) {
			for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
				if (this.anIntArray228[local15] != -1 && !this.aClass215_1.aClass82_82.method1829(this.anIntArray228[local15], 0)) {
					local7 = false;
				}
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILclient!ug;I)V")
	private void method3096(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub28 arg1) {
		if (arg0 == 1) {
			arg1.method5337();
			return;
		}
		@Pc(19) int local19;
		@Pc(29) int local29;
		if (arg0 == 2) {
			local19 = arg1.method5337();
			this.anIntArray227 = new int[local19];
			for (local29 = 0; local29 < local19; local29++) {
				this.anIntArray227[local29] = arg1.method5335();
			}
		} else if (arg0 != 3) {
			if (arg0 == 40) {
				local19 = arg1.method5337();
				this.aShortArray59 = new short[local19];
				this.aShortArray58 = new short[local19];
				for (local29 = 0; local29 < local19; local29++) {
					this.aShortArray59[local29] = (short) arg1.method5335();
					this.aShortArray58[local29] = (short) arg1.method5335();
				}
			} else if (arg0 == 41) {
				local19 = arg1.method5337();
				this.aShortArray57 = new short[local19];
				this.aShortArray60 = new short[local19];
				for (local29 = 0; local29 < local19; local29++) {
					this.aShortArray60[local29] = (short) arg1.method5335();
					this.aShortArray57[local29] = (short) arg1.method5335();
				}
			} else if (arg0 >= 60 && arg0 < 70) {
				this.anIntArray228[arg0 - 60] = arg1.method5335();
			}
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lclient!ug;I)V")
	public void method3097(@OriginalArg(0) Class1_Sub28 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5337();
			if (local5 == 0) {
				return;
			}
			this.method3096(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!ki", name = "d", descriptor = "(I)Lclient!pq;")
	public Class193 method3098() {
		if (this.anIntArray227 == null) {
			return null;
		}
		@Pc(15) Class193[] local15 = new Class193[this.anIntArray227.length];
		@Pc(19) Class82 local19 = this.aClass215_1.aClass82_82;
		@Pc(23) int local23;
		synchronized (this.aClass215_1.aClass82_82) {
			local23 = 0;
			while (true) {
				if (local23 >= this.anIntArray227.length) {
					break;
				}
				local15[local23] = Static149.method2219(this.anIntArray227[local23], this.aClass215_1.aClass82_82);
				local23++;
			}
		}
		for (@Pc(56) int local56 = 0; local56 < this.anIntArray227.length; local56++) {
			if (local15[local56].anInt5431 < 13) {
				local15[local56].method4254();
			}
		}
		@Pc(88) Class193 local88;
		if (local15.length == 1) {
			local88 = local15[0];
		} else {
			local88 = new Class193(local15, local15.length);
		}
		if (local88 == null) {
			return null;
		}
		if (this.aShortArray59 != null) {
			for (local23 = 0; local23 < this.aShortArray59.length; local23++) {
				local88.method4266(this.aShortArray58[local23], this.aShortArray59[local23]);
			}
		}
		if (this.aShortArray60 != null) {
			for (local23 = 0; local23 < this.aShortArray60.length; local23++) {
				local88.method4256(this.aShortArray57[local23], this.aShortArray60[local23]);
			}
		}
		return local88;
	}
}
