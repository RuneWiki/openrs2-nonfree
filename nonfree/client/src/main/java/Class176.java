import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jn")
public final class Class176 {

	@OriginalMember(owner = "client!jn", name = "d", descriptor = "[S")
	private short[] aShortArray75;

	@OriginalMember(owner = "client!jn", name = "e", descriptor = "[I")
	private int[] anIntArray361;

	@OriginalMember(owner = "client!jn", name = "g", descriptor = "[S")
	private short[] aShortArray76;

	@OriginalMember(owner = "client!jn", name = "l", descriptor = "[S")
	private short[] aShortArray77;

	@OriginalMember(owner = "client!jn", name = "m", descriptor = "[S")
	private short[] aShortArray78;

	@OriginalMember(owner = "client!jn", name = "n", descriptor = "Lclient!dh;")
	public Class71 aClass71_2;

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "[I")
	private final int[] anIntArray360 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(B)Lclient!lm;")
	public Class210 method3691() {
		@Pc(8) Class210[] local8 = new Class210[5];
		@Pc(10) int local10 = 0;
		@Pc(14) Class270 local14 = this.aClass71_2.aClass270_17;
		@Pc(18) int local18;
		synchronized (this.aClass71_2.aClass270_17) {
			local18 = 0;
			while (true) {
				if (local18 >= 5) {
					break;
				}
				if (this.anIntArray360[local18] != -1) {
					local8[local10++] = Static127.method2013(this.anIntArray360[local18], this.aClass71_2.aClass270_17);
				}
				local18++;
			}
		}
		for (@Pc(60) int local60 = 0; local60 < 5; local60++) {
			if (local8[local60] != null && local8[local60].anInt5251 < 13) {
				local8[local60].method4260();
			}
		}
		@Pc(92) Class210 local92 = new Class210(local8, local10);
		if (this.aShortArray78 != null) {
			for (local18 = 0; local18 < this.aShortArray78.length; local18++) {
				local92.method4258(this.aShortArray78[local18], this.aShortArray75[local18]);
			}
		}
		if (this.aShortArray76 != null) {
			for (local18 = 0; local18 < this.aShortArray76.length; local18++) {
				local92.method4256(this.aShortArray76[local18], this.aShortArray77[local18]);
			}
		}
		return local92;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IILclient!mo;)V")
	private void method3692(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub35 arg1) {
		if (arg0 == 1) {
			arg1.method5750();
			return;
		}
		@Pc(19) int local19;
		@Pc(25) int local25;
		if (arg0 == 2) {
			local19 = arg1.method5750();
			this.anIntArray361 = new int[local19];
			for (local25 = 0; local25 < local19; local25++) {
				this.anIntArray361[local25] = arg1.method5771();
			}
		} else if (arg0 != 3) {
			if (arg0 == 40) {
				local19 = arg1.method5750();
				this.aShortArray78 = new short[local19];
				this.aShortArray75 = new short[local19];
				for (local25 = 0; local25 < local19; local25++) {
					this.aShortArray78[local25] = (short) arg1.method5771();
					this.aShortArray75[local25] = (short) arg1.method5771();
				}
			} else if (arg0 == 41) {
				local19 = arg1.method5750();
				this.aShortArray77 = new short[local19];
				this.aShortArray76 = new short[local19];
				for (local25 = 0; local25 < local19; local25++) {
					this.aShortArray76[local25] = (short) arg1.method5771();
					this.aShortArray77[local25] = (short) arg1.method5771();
				}
			} else if (arg0 >= 60 && arg0 < 70) {
				this.anIntArray360[arg0 - 60] = arg1.method5771();
			}
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(ILclient!mo;)V")
	public void method3693(@OriginalArg(1) Class1_Sub35 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5750();
			if (local5 == 0) {
				return;
			}
			this.method3692(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)Lclient!lm;")
	public Class210 method3694() {
		if (this.anIntArray361 == null) {
			return null;
		}
		@Pc(15) Class210[] local15 = new Class210[this.anIntArray361.length];
		@Pc(19) Class270 local19 = this.aClass71_2.aClass270_17;
		@Pc(23) int local23;
		synchronized (this.aClass71_2.aClass270_17) {
			local23 = 0;
			while (true) {
				if (this.anIntArray361.length <= local23) {
					break;
				}
				local15[local23] = Static127.method2013(this.anIntArray361[local23], this.aClass71_2.aClass270_17);
				local23++;
			}
		}
		for (@Pc(56) int local56 = 0; local56 < this.anIntArray361.length; local56++) {
			if (local15[local56].anInt5251 < 13) {
				local15[local56].method4260();
			}
		}
		@Pc(92) Class210 local92;
		if (local15.length == 1) {
			local92 = local15[0];
		} else {
			local92 = new Class210(local15, local15.length);
		}
		if (local92 == null) {
			return null;
		}
		if (this.aShortArray78 != null) {
			for (local23 = 0; local23 < this.aShortArray78.length; local23++) {
				local92.method4258(this.aShortArray78[local23], this.aShortArray75[local23]);
			}
		}
		if (this.aShortArray76 != null) {
			for (local23 = 0; local23 < this.aShortArray76.length; local23++) {
				local92.method4256(this.aShortArray76[local23], this.aShortArray77[local23]);
			}
		}
		return local92;
	}

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "(B)Z")
	public boolean method3695() {
		@Pc(15) boolean local15 = true;
		@Pc(19) Class270 local19 = this.aClass71_2.aClass270_17;
		synchronized (this.aClass71_2.aClass270_17) {
			for (@Pc(23) int local23 = 0; local23 < 5; local23++) {
				if (this.anIntArray360[local23] != -1 && !this.aClass71_2.aClass270_17.method5688(this.anIntArray360[local23], 0)) {
					local15 = false;
				}
			}
			return local15;
		}
	}

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "(I)Z")
	public boolean method3696() {
		if (this.anIntArray361 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		@Pc(16) Class270 local16 = this.aClass71_2.aClass270_17;
		synchronized (this.aClass71_2.aClass270_17) {
			for (@Pc(28) int local28 = 0; local28 < this.anIntArray361.length; local28++) {
				if (!this.aClass71_2.aClass270_17.method5688(this.anIntArray361[local28], 0)) {
					local12 = false;
				}
			}
			return local12;
		}
	}
}
