import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!g")
public final class Class88 {

	@OriginalMember(owner = "client!g", name = "c", descriptor = "[S")
	private short[] aShortArray25;

	@OriginalMember(owner = "client!g", name = "h", descriptor = "[S")
	private short[] aShortArray26;

	@OriginalMember(owner = "client!g", name = "i", descriptor = "[S")
	private short[] aShortArray27;

	@OriginalMember(owner = "client!g", name = "n", descriptor = "[S")
	private short[] aShortArray28;

	@OriginalMember(owner = "client!g", name = "o", descriptor = "Lclient!wb;")
	public Class259 aClass259_1;

	@OriginalMember(owner = "client!g", name = "r", descriptor = "[I")
	private int[] anIntArray212;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "[I")
	private final int[] anIntArray211 = new int[] { -1, -1, -1, -1, -1 };

	static {
		new Class209("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para deixar o canal...");
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(I)Lclient!kq;")
	public Class146 method2097() {
		if (this.anIntArray212 == null) {
			return null;
		}
		@Pc(15) Class146[] local15 = new Class146[this.anIntArray212.length];
		@Pc(19) Class160 local19 = this.aClass259_1.aClass160_88;
		@Pc(23) int local23;
		synchronized (this.aClass259_1.aClass160_88) {
			local23 = 0;
			while (true) {
				if (local23 >= this.anIntArray212.length) {
					break;
				}
				local15[local23] = Static152.method2537(this.aClass259_1.aClass160_88, this.anIntArray212[local23]);
				local23++;
			}
		}
		for (@Pc(52) int local52 = 0; local52 < this.anIntArray212.length; local52++) {
			if (local15[local52].anInt4095 < 13) {
				local15[local52].method3325();
			}
		}
		@Pc(93) Class146 local93;
		if (local15.length == 1) {
			local93 = local15[0];
		} else {
			local93 = new Class146(local15, local15.length);
		}
		if (local93 == null) {
			return null;
		}
		if (this.aShortArray27 != null) {
			for (local23 = 0; local23 < this.aShortArray27.length; local23++) {
				local93.method3321(this.aShortArray26[local23], this.aShortArray27[local23]);
			}
		}
		if (this.aShortArray28 != null) {
			for (local23 = 0; local23 < this.aShortArray28.length; local23++) {
				local93.method3329(this.aShortArray25[local23], this.aShortArray28[local23]);
			}
		}
		return local93;
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(I)Z")
	public boolean method2098() {
		if (this.anIntArray212 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		@Pc(16) Class160 local16 = this.aClass259_1.aClass160_88;
		synchronized (this.aClass259_1.aClass160_88) {
			for (@Pc(20) int local20 = 0; local20 < this.anIntArray212.length; local20++) {
				if (!this.aClass259_1.aClass160_88.method3698(this.anIntArray212[local20], 0)) {
					local12 = false;
				}
			}
			return local12;
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Lclient!si;I)V")
	public void method2099(@OriginalArg(0) Class2_Sub23 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method5495();
			if (local9 == 0) {
				return;
			}
			this.method2103(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Z)Z")
	public boolean method2100() {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class160 local11 = this.aClass259_1.aClass160_88;
		synchronized (this.aClass259_1.aClass160_88) {
			for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
				if (this.anIntArray211[local15] != -1 && !this.aClass259_1.aClass160_88.method3698(this.anIntArray211[local15], 0)) {
					local7 = false;
				}
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(B)Lclient!kq;")
	public Class146 method2101() {
		@Pc(8) Class146[] local8 = new Class146[5];
		@Pc(10) int local10 = 0;
		@Pc(14) Class160 local14 = this.aClass259_1.aClass160_88;
		@Pc(18) int local18;
		synchronized (this.aClass259_1.aClass160_88) {
			local18 = 0;
			while (true) {
				if (local18 >= 5) {
					break;
				}
				if (this.anIntArray211[local18] != -1) {
					local8[local10++] = Static152.method2537(this.aClass259_1.aClass160_88, this.anIntArray211[local18]);
				}
				local18++;
			}
		}
		for (@Pc(53) int local53 = 0; local53 < 5; local53++) {
			if (local8[local53] != null && local8[local53].anInt4095 < 13) {
				local8[local53].method3325();
			}
		}
		@Pc(85) Class146 local85 = new Class146(local8, local10);
		if (this.aShortArray27 != null) {
			for (local18 = 0; local18 < this.aShortArray27.length; local18++) {
				local85.method3321(this.aShortArray26[local18], this.aShortArray27[local18]);
			}
		}
		if (this.aShortArray28 != null) {
			for (local18 = 0; local18 < this.aShortArray28.length; local18++) {
				local85.method3329(this.aShortArray25[local18], this.aShortArray28[local18]);
			}
		}
		return local85;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ILclient!si;I)V")
	private void method2103(@OriginalArg(1) Class2_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			arg0.method5495();
			return;
		}
		@Pc(30) int local30;
		@Pc(40) int local40;
		if (arg1 == 2) {
			local30 = arg0.method5495();
			this.anIntArray212 = new int[local30];
			for (local40 = 0; local40 < local30; local40++) {
				this.anIntArray212[local40] = arg0.method5500();
			}
		} else if (arg1 != 3) {
			if (arg1 == 40) {
				local30 = arg0.method5495();
				this.aShortArray26 = new short[local30];
				this.aShortArray27 = new short[local30];
				for (local40 = 0; local40 < local30; local40++) {
					this.aShortArray27[local40] = (short) arg0.method5500();
					this.aShortArray26[local40] = (short) arg0.method5500();
				}
				return;
			}
			if (arg1 == 41) {
				local30 = arg0.method5495();
				this.aShortArray28 = new short[local30];
				this.aShortArray25 = new short[local30];
				for (local40 = 0; local40 < local30; local40++) {
					this.aShortArray28[local40] = (short) arg0.method5500();
					this.aShortArray25[local40] = (short) arg0.method5500();
				}
			} else if (arg1 >= 60 && arg1 < 70) {
				this.anIntArray211[arg1 - 60] = arg0.method5500();
				return;
			}
			return;
		}
	}
}
