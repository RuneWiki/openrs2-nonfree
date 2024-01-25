import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qd")
public final class Class265 {

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "[S")
	private short[] aShortArray118;

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "[S")
	private short[] aShortArray119;

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "[S")
	private short[] aShortArray120;

	@OriginalMember(owner = "client!qd", name = "k", descriptor = "[I")
	private int[] anIntArray502;

	@OriginalMember(owner = "client!qd", name = "m", descriptor = "[S")
	private short[] aShortArray121;

	@OriginalMember(owner = "client!qd", name = "s", descriptor = "Lclient!af;")
	public Class6 aClass6_2;

	@OriginalMember(owner = "client!qd", name = "l", descriptor = "[I")
	private final int[] anIntArray503 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(B)Lclient!fca;")
	public Class96 method6751() {
		if (this.anIntArray502 == null) {
			return null;
		}
		@Pc(13) Class96[] local13 = new Class96[this.anIntArray502.length];
		@Pc(17) Class254 local17 = this.aClass6_2.aClass254_2;
		synchronized (this.aClass6_2.aClass254_2) {
			@Pc(30) int local30 = 0;
			while (true) {
				if (this.anIntArray502.length <= local30) {
					break;
				}
				local13[local30] = Static374.method6085(this.anIntArray502[local30], this.aClass6_2.aClass254_2);
				local30++;
			}
		}
		for (@Pc(62) int local62 = 0; local62 < this.anIntArray502.length; local62++) {
			if (local13[local62].anInt3175 < 13) {
				local13[local62].method2775();
			}
		}
		@Pc(98) Class96 local98;
		if (local13.length == 1) {
			local98 = local13[0];
		} else {
			local98 = new Class96(local13, local13.length);
		}
		if (local98 == null) {
			return null;
		}
		@Pc(112) int local112;
		if (this.aShortArray119 != null) {
			for (local112 = 0; local112 < this.aShortArray119.length; local112++) {
				local98.method2782(this.aShortArray119[local112], this.aShortArray118[local112]);
			}
		}
		if (this.aShortArray121 != null) {
			for (local112 = 0; local112 < this.aShortArray121.length; local112++) {
				local98.method2789(this.aShortArray120[local112], this.aShortArray121[local112]);
			}
		}
		return local98;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Z)Z")
	public boolean method6752() {
		if (this.anIntArray502 == null) {
			return true;
		}
		@Pc(16) boolean local16 = true;
		@Pc(20) Class254 local20 = this.aClass6_2.aClass254_2;
		synchronized (this.aClass6_2.aClass254_2) {
			for (@Pc(24) int local24 = 0; local24 < this.anIntArray502.length; local24++) {
				if (!this.aClass6_2.aClass254_2.method6398(this.anIntArray502[local24], 0)) {
					local16 = false;
				}
			}
			return local16;
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)Z")
	public boolean method6754() {
		@Pc(11) boolean local11 = true;
		@Pc(15) Class254 local15 = this.aClass6_2.aClass254_2;
		synchronized (this.aClass6_2.aClass254_2) {
			for (@Pc(19) int local19 = 0; local19 < 5; local19++) {
				if (this.anIntArray503[local19] != -1 && !this.aClass6_2.aClass254_2.method6398(this.anIntArray503[local19], 0)) {
					local11 = false;
				}
			}
			return local11;
		}
	}

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "(I)Lclient!fca;")
	public Class96 method6756() {
		@Pc(13) Class96[] local13 = new Class96[5];
		@Pc(15) int local15 = 0;
		@Pc(19) Class254 local19 = this.aClass6_2.aClass254_2;
		@Pc(23) int local23;
		synchronized (this.aClass6_2.aClass254_2) {
			local23 = 0;
			while (true) {
				if (local23 >= 5) {
					break;
				}
				if (this.anIntArray503[local23] != -1) {
					local13[local15++] = Static374.method6085(this.anIntArray503[local23], this.aClass6_2.aClass254_2);
				}
				local23++;
			}
		}
		for (@Pc(59) int local59 = 0; local59 < 5; local59++) {
			if (local13[local59] != null && local13[local59].anInt3175 < 13) {
				local13[local59].method2775();
			}
		}
		@Pc(88) Class96 local88 = new Class96(local13, local15);
		if (this.aShortArray119 != null) {
			for (local23 = 0; local23 < this.aShortArray119.length; local23++) {
				local88.method2782(this.aShortArray119[local23], this.aShortArray118[local23]);
			}
		}
		if (this.aShortArray121 != null) {
			for (local23 = 0; local23 < this.aShortArray121.length; local23++) {
				local88.method2789(this.aShortArray120[local23], this.aShortArray121[local23]);
			}
		}
		return local88;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lclient!fd;B)V")
	public void method6757(@OriginalArg(0) Class3_Sub7 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method6538();
			if (local7 == 0) {
				return;
			}
			this.method6760(arg0, local7);
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lclient!fd;II)V")
	private void method6760(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			arg0.method6538();
			return;
		}
		@Pc(30) int local30;
		@Pc(40) int local40;
		if (arg1 == 2) {
			local30 = arg0.method6538();
			this.anIntArray502 = new int[local30];
			for (local40 = 0; local40 < local30; local40++) {
				this.anIntArray502[local40] = arg0.method6535();
			}
		} else if (arg1 != 3) {
			if (arg1 == 40) {
				local30 = arg0.method6538();
				this.aShortArray118 = new short[local30];
				this.aShortArray119 = new short[local30];
				for (local40 = 0; local40 < local30; local40++) {
					this.aShortArray119[local40] = (short) arg0.method6535();
					this.aShortArray118[local40] = (short) arg0.method6535();
				}
				return;
			}
			if (arg1 == 41) {
				local30 = arg0.method6538();
				this.aShortArray121 = new short[local30];
				this.aShortArray120 = new short[local30];
				for (local40 = 0; local40 < local30; local40++) {
					this.aShortArray121[local40] = (short) arg0.method6535();
					this.aShortArray120[local40] = (short) arg0.method6535();
				}
			} else if (arg1 >= 60 && arg1 < 70) {
				this.anIntArray503[arg1 - 60] = arg0.method6535();
				return;
			}
			return;
		}
	}
}
